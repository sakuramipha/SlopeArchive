package com.unity3d.player;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class UnityPlayer
  extends FrameLayout
  implements IUnityPlayerLifecycleEvents
{
  private static final int ANR_TIMEOUT_SECONDS = 4;
  private static final String ARCORE_ENABLE_METADATA_NAME = "unity.arcore-enable";
  private static final String AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME = "unity.auto-report-fully-drawn";
  private static final String LAUNCH_FULLSCREEN = "unity.launch-fullscreen";
  private static final int RUN_STATE_CHANGED_MSG_CODE = 2269;
  private static final String SPLASH_ENABLE_METADATA_NAME = "unity.splash-enable";
  private static final String SPLASH_MODE_METADATA_NAME = "unity.splash-mode";
  public static Activity currentActivity;
  private Activity mActivity;
  private Context mContext;
  private I mGlView;
  Handler mHandler = new Handler();
  private int mInitialScreenOrientation = -1;
  private boolean mIsFullscreen = true;
  private BroadcastReceiver mKillingIsMyBusiness = null;
  private boolean mMainDisplayOverride = false;
  private int mNaturalOrientation;
  private OrientationEventListener mOrientationListener = null;
  private boolean mProcessKillRequested = true;
  private boolean mQuitting;
  B mSoftInputDialog = null;
  private J mState = new J();
  private U mVideoPlayerProxy;
  private GoogleARCoreApi m_ARCoreApi = null;
  private boolean m_AddPhoneCallListener = false;
  private AudioVolumeHandler m_AudioVolumeHandler = null;
  private Camera2Wrapper m_Camera2Wrapper = null;
  private ClipboardManager m_ClipboardManager;
  private final ConcurrentLinkedQueue m_Events = new ConcurrentLinkedQueue();
  private y m_FakeListener = new y();
  private HFPStatus m_HFPStatus = null;
  private int m_IsNoWindowMode = -1;
  C m_MainThread = new C(null);
  private NetworkConnectivity m_NetworkConnectivity = null;
  private OrientationLockListener m_OrientationLockListener = null;
  private A m_PhoneCallListener = new A(null);
  private C m_SplashScreen;
  private TelephonyManager m_TelephonyManager;
  private IUnityPlayerLifecycleEvents m_UnityPlayerLifecycleEvents = null;
  private Uri m_launchUri = null;
  
  static
  {
    new G().a();
  }
  
  public UnityPlayer(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public UnityPlayer(Context paramContext, IUnityPlayerLifecycleEvents paramIUnityPlayerLifecycleEvents)
  {
    super(paramContext);
    if (paramIUnityPlayerLifecycleEvents == null) {
      paramIUnityPlayerLifecycleEvents = this;
    }
    this.m_UnityPlayerLifecycleEvents = paramIUnityPlayerLifecycleEvents;
    G.a(getUnityNativeLibraryPath(paramContext));
    if ((paramContext instanceof Activity))
    {
      paramIUnityPlayerLifecycleEvents = (Activity)paramContext;
      this.mActivity = paramIUnityPlayerLifecycleEvents;
      currentActivity = paramIUnityPlayerLifecycleEvents;
      this.mInitialScreenOrientation = paramIUnityPlayerLifecycleEvents.getRequestedOrientation();
      this.m_launchUri = this.mActivity.getIntent().getData();
    }
    this.mContext = paramContext;
    EarlyEnableFullScreenIfEnabled();
    this.mNaturalOrientation = getNaturalOrientation(getResources().getConfiguration().orientation);
    if ((this.mActivity != null) && (getSplashEnabled()))
    {
      paramIUnityPlayerLifecycleEvents = new C(this.mContext, C.a.a()[getSplashMode()]);
      this.m_SplashScreen = paramIUnityPlayerLifecycleEvents;
      addView(paramIUnityPlayerLifecycleEvents);
    }
    preloadJavaPlugins();
    paramIUnityPlayerLifecycleEvents = loadNative(getUnityNativeLibraryPath(this.mContext));
    if (!J.d())
    {
      u.Log(6, "Your hardware does not support this application.");
      paramContext = new AlertDialog.Builder(this.mContext).setTitle("Failure to initialize!").setPositiveButton("OK", new k());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Your hardware does not support this application.");
      localStringBuilder.append("\n\n");
      localStringBuilder.append(paramIUnityPlayerLifecycleEvents);
      localStringBuilder.append("\n\n Press OK to quit.");
      paramContext = paramContext.setMessage(localStringBuilder.toString()).create();
      paramContext.setCancelable(false);
      paramContext.show();
      return;
    }
    initJni(paramContext);
    this.mState.d(true);
    paramContext = new I(paramContext, this);
    this.mGlView = paramContext;
    addView(paramContext);
    bringChildToFront(this.m_SplashScreen);
    this.mQuitting = false;
    hideStatusBar();
    this.m_TelephonyManager = ((TelephonyManager)this.mContext.getSystemService("phone"));
    this.m_ClipboardManager = ((ClipboardManager)this.mContext.getSystemService("clipboard"));
    this.m_Camera2Wrapper = new Camera2Wrapper(this.mContext);
    this.m_HFPStatus = new HFPStatus(this.mContext);
    this.m_MainThread.start();
  }
  
  private void DisableStaticSplashScreen()
  {
    runOnUiThread(new r());
  }
  
  private void EarlyEnableFullScreenIfEnabled()
  {
    Object localObject = this.mActivity;
    if ((localObject != null) && (((Activity)localObject).getWindow() != null) && ((getLaunchFullscreen()) || (this.mActivity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false))))
    {
      localObject = this.mActivity.getWindow().getDecorView();
      if (localObject != null) {
        ((View)localObject).setSystemUiVisibility(7);
      }
    }
  }
  
  private String GetGlViewContentDescription(Context paramContext)
  {
    return paramContext.getResources().getString(paramContext.getResources().getIdentifier("game_view_content_description", "string", paramContext.getPackageName()));
  }
  
  private boolean IsWindowTranslucent()
  {
    Object localObject = this.mActivity;
    if (localObject == null) {
      return false;
    }
    localObject = ((Activity)localObject).getTheme().obtainStyledAttributes(new int[] { 16842840 });
    boolean bool = ((TypedArray)localObject).getBoolean(0, false);
    ((TypedArray)localObject).recycle();
    return bool;
  }
  
  public static void UnitySendMessage(String paramString1, String paramString2, String paramString3)
  {
    if (!J.d())
    {
      paramString3 = new StringBuilder();
      paramString3.append("Native libraries not loaded - dropping message for ");
      paramString3.append(paramString1);
      paramString3.append(".");
      paramString3.append(paramString2);
      u.Log(5, paramString3.toString());
      return;
    }
    try
    {
      nativeUnitySendMessage(paramString1, paramString2, paramString3.getBytes("UTF-8"));
      return;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      for (;;) {}
    }
  }
  
  private void checkResumePlayer()
  {
    Object localObject1 = this.mActivity;
    boolean bool;
    if (localObject1 != null) {
      bool = MultiWindowSupport.getAllowResizableWindow((Activity)localObject1);
    } else {
      bool = false;
    }
    if (!this.mState.a(bool)) {
      return;
    }
    this.mState.c(true);
    queueGLThreadEvent(new a());
    Object localObject2 = this.m_MainThread;
    localObject1 = B.b;
    localObject2 = ((C)localObject2).a;
    if (localObject2 != null) {
      Message.obtain((Handler)localObject2, 2269, localObject1).sendToTarget();
    }
  }
  
  private void finish()
  {
    Activity localActivity = this.mActivity;
    if ((localActivity != null) && (!localActivity.isFinishing())) {
      this.mActivity.finish();
    }
  }
  
  private boolean getARCoreEnabled()
  {
    try
    {
      boolean bool = getApplicationInfo().metaData.getBoolean("unity.arcore-enable");
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private ActivityInfo getActivityInfo()
  {
    return this.mActivity.getPackageManager().getActivityInfo(this.mActivity.getComponentName(), 128);
  }
  
  private ApplicationInfo getApplicationInfo()
  {
    return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128);
  }
  
  private boolean getAutoReportFullyDrawnEnabled()
  {
    try
    {
      boolean bool = getApplicationInfo().metaData.getBoolean("unity.auto-report-fully-drawn");
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private boolean getHaveAndroidWindowSupport()
  {
    if (this.m_IsNoWindowMode == -1) {
      this.m_IsNoWindowMode = nativeGetNoWindowMode();
    }
    int i = this.m_IsNoWindowMode;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  private boolean getLaunchFullscreen()
  {
    try
    {
      boolean bool = getApplicationInfo().metaData.getBoolean("unity.launch-fullscreen");
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private int getNaturalOrientation(int paramInt)
  {
    int i = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
    if (((i != 0) && (i != 2)) || ((paramInt != 2) && (((i != 1) && (i != 3)) || (paramInt != 1)))) {
      return 1;
    }
    return 0;
  }
  
  private String getProcessName()
  {
    int i = Process.myPid();
    Object localObject = ((ActivityManager)this.mContext.getSystemService("activity")).getRunningAppProcesses();
    if (localObject == null) {
      return null;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if (localRunningAppProcessInfo.pid == i) {
        return localRunningAppProcessInfo.processName;
      }
    }
    return null;
  }
  
  private boolean getSplashEnabled()
  {
    try
    {
      boolean bool = getApplicationInfo().metaData.getBoolean("unity.splash-enable");
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private static String getUnityNativeLibraryPath(Context paramContext)
  {
    return paramContext.getApplicationInfo().nativeLibraryDir;
  }
  
  private void hideStatusBar()
  {
    Activity localActivity = this.mActivity;
    if (localActivity != null) {
      localActivity.getWindow().setFlags(1024, 1024);
    }
  }
  
  private final native void initJni(Context paramContext);
  
  private static String loadNative(String paramString)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("/libmain.so");
    localObject = ((StringBuilder)localObject).toString();
    try
    {
      System.load((String)localObject);
    }
    catch (SecurityException paramString) {}catch (UnsatisfiedLinkError localUnsatisfiedLinkError) {}
    try
    {
      System.loadLibrary("main");
      if (NativeLoader.load(paramString))
      {
        J.e();
        return "";
      }
      u.Log(6, "NativeLoader.load failure, Unity libraries were not loaded.");
      return "NativeLoader.load failure, Unity libraries were not loaded.";
    }
    catch (UnsatisfiedLinkError paramString) {}
    return logLoadLibMainError((String)localObject, paramString.toString());
    return logLoadLibMainError((String)localObject, paramString.toString());
  }
  
  private static String logLoadLibMainError(String paramString1, String paramString2)
  {
    paramString1 = new StringBuilder();
    paramString1.append("Failed to load 'libmain.so'\n\n");
    paramString1.append(paramString2);
    paramString1 = paramString1.toString();
    u.Log(6, paramString1);
    return paramString1;
  }
  
  private final native void nativeApplicationUnload();
  
  private final native boolean nativeDone();
  
  private final native void nativeFocusChanged(boolean paramBoolean);
  
  private final native boolean nativeGetNoWindowMode();
  
  private final native boolean nativeInjectEvent(InputEvent paramInputEvent);
  
  private final native boolean nativeIsAutorotationOn();
  
  private final native void nativeLowMemory();
  
  private final native void nativeMuteMasterAudio(boolean paramBoolean);
  
  private final native void nativeOrientationChanged(int paramInt1, int paramInt2);
  
  private final native boolean nativePause();
  
  private final native void nativeRecreateGfxState(int paramInt, Surface paramSurface);
  
  private final native boolean nativeRender();
  
  private final native void nativeReportKeyboardConfigChanged();
  
  private final native void nativeRestartActivityIndicator();
  
  private final native void nativeResume();
  
  private final native void nativeSendSurfaceChangedEvent();
  
  private final native void nativeSetInputArea(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  private final native void nativeSetInputSelection(int paramInt1, int paramInt2);
  
  private final native void nativeSetInputString(String paramString);
  
  private final native void nativeSetKeyboardIsVisible(boolean paramBoolean);
  
  private final native void nativeSetLaunchURL(String paramString);
  
  private final native void nativeSoftInputCanceled();
  
  private final native void nativeSoftInputClosed();
  
  private final native void nativeSoftInputLostFocus();
  
  private static native void nativeUnitySendMessage(String paramString1, String paramString2, byte[] paramArrayOfByte);
  
  private void pauseUnity()
  {
    reportSoftInputStr(null, 1, true);
    if ((this.mState.c()) && (!this.mState.b()))
    {
      if (J.d())
      {
        final Semaphore localSemaphore = new Semaphore(0);
        Object localObject;
        if (isFinishing()) {
          localObject = new v(localSemaphore);
        } else {
          localObject = new w(localSemaphore);
        }
        C localC = this.m_MainThread;
        Handler localHandler = localC.a;
        if (localHandler != null)
        {
          Message.obtain(localHandler, 2269, B.a).sendToTarget();
          Message.obtain(localC.a, (Runnable)localObject).sendToTarget();
        }
        try
        {
          if (!localSemaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
            u.Log(5, "Timeout while trying to pause the Unity Engine.");
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          u.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
        }
        if (localSemaphore.drainPermits() > 0) {
          destroy();
        }
      }
      this.mState.c(false);
      this.mState.e(true);
      if (this.m_AddPhoneCallListener) {
        this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
      }
    }
  }
  
  private static void preloadJavaPlugins()
  {
    try
    {
      try
      {
        Class.forName("com.unity3d.JavaPluginPreloader");
      }
      catch (LinkageError localLinkageError)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Java class preloading failed: ");
        localStringBuilder.append(localLinkageError.getMessage());
        u.Log(6, localStringBuilder.toString());
      }
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
  }
  
  private void queueGLThreadEvent(D paramD)
  {
    if (isFinishing()) {
      return;
    }
    queueGLThreadEvent(paramD);
  }
  
  private void shutdown()
  {
    this.mProcessKillRequested = nativeDone();
    this.mState.d(false);
  }
  
  private void swapViews(View paramView1, View paramView2)
  {
    int i;
    if (!this.mState.b())
    {
      pause();
      i = 1;
    }
    else
    {
      i = 0;
    }
    if (paramView1 != null)
    {
      ViewParent localViewParent = paramView1.getParent();
      if ((!(localViewParent instanceof UnityPlayer)) || ((UnityPlayer)localViewParent != this))
      {
        if ((localViewParent instanceof ViewGroup)) {
          ((ViewGroup)localViewParent).removeView(paramView1);
        }
        addView(paramView1);
        bringChildToFront(paramView1);
        paramView1.setVisibility(0);
      }
    }
    if ((paramView2 != null) && (paramView2.getParent() == this))
    {
      paramView2.setVisibility(8);
      removeView(paramView2);
    }
    if (i != 0) {
      resume();
    }
  }
  
  private static void unloadNative()
  {
    if (!J.d()) {
      return;
    }
    if (NativeLoader.unload())
    {
      J.f();
      return;
    }
    throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
  }
  
  private boolean updateDisplayInternal(final int paramInt, final Surface paramSurface)
  {
    if ((J.d()) && (this.mState.a()))
    {
      final Semaphore localSemaphore = new Semaphore(0);
      Object localObject1 = new t(paramInt, paramSurface, localSemaphore);
      if (paramInt == 0)
      {
        Object localObject3;
        Object localObject2;
        if (paramSurface == null)
        {
          localObject3 = this.m_MainThread;
          localObject2 = ((C)localObject3).a;
          if (localObject2 != null)
          {
            Message.obtain((Handler)localObject2, 2269, B.d).sendToTarget();
            Message.obtain(((C)localObject3).a, (Runnable)localObject1).sendToTarget();
          }
        }
        else
        {
          localObject2 = this.m_MainThread;
          localObject3 = ((C)localObject2).a;
          if (localObject3 != null)
          {
            Message.obtain((Handler)localObject3, (Runnable)localObject1).sendToTarget();
            localObject1 = B.e;
            localObject2 = ((C)localObject2).a;
            if (localObject2 != null) {
              Message.obtain((Handler)localObject2, 2269, localObject1).sendToTarget();
            }
          }
        }
      }
      else
      {
        ((t)localObject1).run();
      }
      if ((paramSurface == null) && (paramInt == 0)) {
        try
        {
          if (!localSemaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
            u.Log(5, "Timeout while trying detaching primary window.");
          }
        }
        catch (InterruptedException paramSurface)
        {
          u.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
        }
      }
      return true;
    }
    return false;
  }
  
  protected void addPhoneCallListener()
  {
    this.m_AddPhoneCallListener = true;
    this.m_TelephonyManager.listen(this.m_PhoneCallListener, 32);
  }
  
  public boolean addViewToPlayer(View paramView, boolean paramBoolean)
  {
    I localI;
    if (paramBoolean) {
      localI = this.mGlView;
    } else {
      localI = null;
    }
    swapViews(paramView, localI);
    paramView = paramView.getParent();
    boolean bool = true;
    int i;
    if (paramView == this) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if ((paramBoolean) && (this.mGlView.getParent() == null)) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if (this.mGlView.getParent() == this) {
      k = 1;
    } else {
      k = 0;
    }
    if (i != 0)
    {
      paramBoolean = bool;
      if (j != 0) {
        break label111;
      }
      if (k != 0)
      {
        paramBoolean = bool;
        break label111;
      }
    }
    paramBoolean = false;
    label111:
    if (!paramBoolean)
    {
      if (i == 0) {
        u.Log(6, "addViewToPlayer: Failure adding view to hierarchy");
      }
      if ((j == 0) && (k == 0)) {
        u.Log(6, "addViewToPlayer: Failure removing old view from hierarchy");
      }
    }
    return paramBoolean;
  }
  
  public void configurationChanged(Configuration paramConfiguration)
  {
    paramConfiguration = this.mVideoPlayerProxy;
    if (paramConfiguration != null) {
      paramConfiguration.b();
    }
  }
  
  public void destroy()
  {
    Object localObject1 = this.m_Camera2Wrapper;
    if (localObject1 != null)
    {
      ((Camera2Wrapper)localObject1).a();
      this.m_Camera2Wrapper = null;
    }
    localObject1 = this.m_HFPStatus;
    if (localObject1 != null)
    {
      ((HFPStatus)localObject1).a();
      this.m_HFPStatus = null;
    }
    localObject1 = this.m_NetworkConnectivity;
    if (localObject1 != null)
    {
      ((NetworkConnectivity)localObject1).a();
      this.m_NetworkConnectivity = null;
    }
    this.mQuitting = true;
    if (!this.mState.b()) {
      pause();
    }
    Object localObject2 = this.m_MainThread;
    localObject1 = B.c;
    localObject2 = ((C)localObject2).a;
    if (localObject2 != null) {
      Message.obtain((Handler)localObject2, 2269, localObject1).sendToTarget();
    }
    try
    {
      this.m_MainThread.join(4000L);
    }
    catch (InterruptedException localInterruptedException)
    {
      this.m_MainThread.interrupt();
    }
    BroadcastReceiver localBroadcastReceiver = this.mKillingIsMyBusiness;
    if (localBroadcastReceiver != null) {
      this.mContext.unregisterReceiver(localBroadcastReceiver);
    }
    this.mKillingIsMyBusiness = null;
    if (J.d()) {
      removeAllViews();
    }
    if (this.mProcessKillRequested)
    {
      this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
      kill();
    }
    unloadNative();
  }
  
  protected void disableLogger()
  {
    u.a = true;
  }
  
  public boolean displayChanged(int paramInt, Surface paramSurface)
  {
    if (paramInt == 0)
    {
      boolean bool;
      if (paramSurface != null) {
        bool = true;
      } else {
        bool = false;
      }
      this.mMainDisplayOverride = bool;
      runOnUiThread(new u());
    }
    return updateDisplayInternal(paramInt, paramSurface);
  }
  
  protected void executeGLThreadJobs()
  {
    for (;;)
    {
      Runnable localRunnable = (Runnable)this.m_Events.poll();
      if (localRunnable == null) {
        break;
      }
      localRunnable.run();
    }
  }
  
  protected String getClipboardText()
  {
    Object localObject = this.m_ClipboardManager.getPrimaryClip();
    if (localObject != null) {
      localObject = ((ClipData)localObject).getItemAt(0).coerceToText(this.mContext).toString();
    } else {
      localObject = "";
    }
    return (String)localObject;
  }
  
  protected String getKeyboardLayout()
  {
    B localB = this.mSoftInputDialog;
    if (localB == null) {
      return null;
    }
    return localB.a();
  }
  
  protected String getLaunchURL()
  {
    Object localObject = this.m_launchUri;
    if (localObject != null) {
      localObject = ((Uri)localObject).toString();
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
  
  protected int getNetworkConnectivity()
  {
    Object localObject = this.m_NetworkConnectivity;
    if (localObject != null) {
      return ((NetworkConnectivity)localObject).b();
    }
    if (PlatformSupport.NOUGAT_SUPPORT) {
      localObject = new NetworkConnectivityNougat(this.mContext);
    } else {
      localObject = new NetworkConnectivity(this.mContext);
    }
    this.m_NetworkConnectivity = ((NetworkConnectivity)localObject);
    return this.m_NetworkConnectivity.b();
  }
  
  public String getNetworkProxySettings(String paramString)
  {
    if (paramString.startsWith("http:"))
    {
      localObject = "http.proxyHost";
      paramString = "http.proxyPort";
    }
    else
    {
      if (!paramString.startsWith("https:")) {
        break label151;
      }
      localObject = "https.proxyHost";
      paramString = "https.proxyPort";
    }
    Object localObject = System.getProperties().getProperty((String)localObject);
    if ((localObject != null) && (!"".equals(localObject)))
    {
      localObject = new StringBuilder((String)localObject);
      paramString = System.getProperties().getProperty(paramString);
      if ((paramString != null) && (!"".equals(paramString)))
      {
        ((StringBuilder)localObject).append(":");
        ((StringBuilder)localObject).append(paramString);
      }
      paramString = System.getProperties().getProperty("http.nonProxyHosts");
      if ((paramString != null) && (!"".equals(paramString)))
      {
        ((StringBuilder)localObject).append('\n');
        ((StringBuilder)localObject).append(paramString);
      }
      return ((StringBuilder)localObject).toString();
    }
    label151:
    return null;
  }
  
  public Bundle getSettings()
  {
    return Bundle.EMPTY;
  }
  
  protected int getSplashMode()
  {
    try
    {
      int i = getApplicationInfo().metaData.getInt("unity.splash-mode");
      return i;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  protected int getUaaLLaunchProcessType()
  {
    String str = getProcessName();
    int i;
    if ((str != null) && (!str.equals(this.mContext.getPackageName()))) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public View getView()
  {
    return this;
  }
  
  protected void hideSoftInput()
  {
    postOnUiThread(new c());
  }
  
  public void init(int paramInt, boolean paramBoolean) {}
  
  protected boolean initializeGoogleAr()
  {
    if ((this.m_ARCoreApi == null) && (this.mActivity != null) && (getARCoreEnabled()))
    {
      GoogleARCoreApi localGoogleARCoreApi = new GoogleARCoreApi();
      this.m_ARCoreApi = localGoogleARCoreApi;
      localGoogleARCoreApi.initializeARCore(this.mActivity);
      if (!this.mState.b()) {
        this.m_ARCoreApi.resumeARCore();
      }
    }
    return false;
  }
  
  public boolean injectEvent(InputEvent paramInputEvent)
  {
    if (!J.d()) {
      return false;
    }
    return nativeInjectEvent(paramInputEvent);
  }
  
  protected boolean isFinishing()
  {
    if (this.mQuitting) {
      return true;
    }
    Activity localActivity = this.mActivity;
    if (localActivity != null) {
      this.mQuitting = localActivity.isFinishing();
    }
    return this.mQuitting;
  }
  
  protected boolean isUaaLUseCase()
  {
    Object localObject = this.mActivity;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (localObject != null)
    {
      localObject = ((Activity)localObject).getCallingPackage();
      bool1 = bool2;
      if (localObject != null)
      {
        bool1 = bool2;
        if (((String)localObject).equals(this.mContext.getPackageName())) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  protected void kill()
  {
    Process.killProcess(Process.myPid());
  }
  
  protected boolean loadLibrary(String paramString)
  {
    try
    {
      System.loadLibrary(paramString);
      return true;
    }
    catch (UnsatisfiedLinkError|Exception paramString) {}
    return false;
  }
  
  public void lowMemory()
  {
    if (!J.d()) {
      return;
    }
    queueGLThreadEvent(new x());
  }
  
  public void newIntent(Intent paramIntent)
  {
    this.m_launchUri = paramIntent.getData();
    Object localObject = this.m_MainThread;
    paramIntent = B.i;
    localObject = ((C)localObject).a;
    if (localObject != null) {
      Message.obtain((Handler)localObject, 2269, paramIntent).sendToTarget();
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if (!this.mGlView.c()) {
      bool = injectEvent(paramMotionEvent);
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return injectEvent(paramKeyEvent);
  }
  
  public boolean onKeyLongPress(int paramInt, KeyEvent paramKeyEvent)
  {
    return injectEvent(paramKeyEvent);
  }
  
  public boolean onKeyMultiple(int paramInt1, int paramInt2, KeyEvent paramKeyEvent)
  {
    return injectEvent(paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    return injectEvent(paramKeyEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if (!this.mGlView.c()) {
      bool = injectEvent(paramMotionEvent);
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onUnityPlayerQuitted() {}
  
  public void onUnityPlayerUnloaded() {}
  
  public void pause()
  {
    Object localObject = this.m_ARCoreApi;
    if (localObject != null) {
      ((GoogleARCoreApi)localObject).pauseARCore();
    }
    localObject = this.mVideoPlayerProxy;
    if (localObject != null) {
      ((U)localObject).c();
    }
    localObject = this.m_AudioVolumeHandler;
    if (localObject != null)
    {
      ((AudioVolumeHandler)localObject).a();
      this.m_AudioVolumeHandler = null;
    }
    localObject = this.m_OrientationLockListener;
    if (localObject != null)
    {
      ((OrientationLockListener)localObject).a();
      this.m_OrientationLockListener = null;
    }
    pauseUnity();
  }
  
  protected void pauseJavaAndCallUnloadCallback()
  {
    runOnUiThread(new o());
  }
  
  void postOnUiThread(Runnable paramRunnable)
  {
    new Handler(Looper.getMainLooper()).post(paramRunnable);
  }
  
  void queueGLThreadEvent(Runnable paramRunnable)
  {
    if (!J.d()) {
      return;
    }
    if (Thread.currentThread() == this.m_MainThread) {
      paramRunnable.run();
    } else {
      this.m_Events.add(paramRunnable);
    }
  }
  
  public void quit()
  {
    destroy();
  }
  
  public void removeViewFromPlayer(View paramView)
  {
    swapViews(this.mGlView, paramView);
    paramView = paramView.getParent();
    int k = 1;
    int i;
    if (paramView == null) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (this.mGlView.getParent() == this) {
      j = 1;
    } else {
      j = 0;
    }
    if ((i == 0) || (j == 0)) {
      k = 0;
    }
    if (k == 0)
    {
      if (i == 0) {
        u.Log(6, "removeViewFromPlayer: Failure removing view from hierarchy");
      }
      if (j == 0) {
        u.Log(6, "removeVireFromPlayer: Failure agging old view to hierarchy");
      }
    }
  }
  
  public void reportError(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(": ");
    localStringBuilder.append(paramString2);
    u.Log(6, localStringBuilder.toString());
  }
  
  protected void reportSoftInputArea(final Rect paramRect)
  {
    queueGLThreadEvent(new j(paramRect));
  }
  
  protected void reportSoftInputIsVisible(final boolean paramBoolean)
  {
    queueGLThreadEvent(new l(paramBoolean));
  }
  
  protected void reportSoftInputSelection(final int paramInt1, final int paramInt2)
  {
    queueGLThreadEvent(new i(paramInt1, paramInt2));
  }
  
  protected void reportSoftInputStr(final String paramString, final int paramInt, final boolean paramBoolean)
  {
    if (paramInt == 1) {
      hideSoftInput();
    }
    queueGLThreadEvent(new h(paramBoolean, paramString, paramInt));
  }
  
  protected void requestUserAuthorization(String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty()) && (this.mActivity != null))
    {
      UnityPermissions.ModalWaitForPermissionResponse localModalWaitForPermissionResponse = new UnityPermissions.ModalWaitForPermissionResponse();
      UnityPermissions.requestUserPermissions(this.mActivity, new String[] { paramString }, localModalWaitForPermissionResponse);
      localModalWaitForPermissionResponse.waitForResponse();
    }
  }
  
  public void resume()
  {
    Object localObject = this.m_ARCoreApi;
    if (localObject != null) {
      ((GoogleARCoreApi)localObject).resumeARCore();
    }
    this.mState.e(false);
    localObject = this.mVideoPlayerProxy;
    if (localObject != null) {
      ((U)localObject).d();
    }
    checkResumePlayer();
    if (J.d()) {
      nativeRestartActivityIndicator();
    }
    if (this.m_AudioVolumeHandler == null) {
      this.m_AudioVolumeHandler = new AudioVolumeHandler(this.mContext);
    }
    if ((this.m_OrientationLockListener == null) && (J.d())) {
      this.m_OrientationLockListener = new OrientationLockListener(this.mActivity);
    }
  }
  
  void runOnAnonymousThread(Runnable paramRunnable)
  {
    new Thread(paramRunnable).start();
  }
  
  void runOnUiThread(Runnable paramRunnable)
  {
    Activity localActivity = this.mActivity;
    if (localActivity != null) {
      localActivity.runOnUiThread(paramRunnable);
    } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
      this.mHandler.post(paramRunnable);
    } else {
      paramRunnable.run();
    }
  }
  
  void sendSurfaceChangedEvent()
  {
    if ((J.d()) && (this.mState.a()))
    {
      s locals = new s();
      Handler localHandler = this.m_MainThread.a;
      if (localHandler != null) {
        Message.obtain(localHandler, locals).sendToTarget();
      }
    }
  }
  
  protected void setCharacterLimit(final int paramInt)
  {
    runOnUiThread(new e(paramInt));
  }
  
  protected void setClipboardText(String paramString)
  {
    paramString = ClipData.newPlainText("Text", paramString);
    this.m_ClipboardManager.setPrimaryClip(paramString);
  }
  
  protected void setHideInputField(final boolean paramBoolean)
  {
    runOnUiThread(new f(paramBoolean));
  }
  
  public void setMainSurfaceViewAspectRatio(final float paramFloat)
  {
    if (this.mGlView != null) {
      runOnUiThread(new q(paramFloat));
    }
  }
  
  protected void setSelection(final int paramInt1, final int paramInt2)
  {
    runOnUiThread(new g(paramInt1, paramInt2));
  }
  
  protected void setSoftInputStr(final String paramString)
  {
    runOnUiThread(new d(paramString));
  }
  
  protected void showSoftInput(final String paramString1, final int paramInt1, final boolean paramBoolean1, final boolean paramBoolean2, final boolean paramBoolean3, final boolean paramBoolean4, final String paramString2, final int paramInt2, final boolean paramBoolean5, final boolean paramBoolean6)
  {
    postOnUiThread(new b(this, paramString1, paramInt1, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramString2, paramInt2, paramBoolean5, paramBoolean6));
  }
  
  protected boolean showVideoPlayer(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
  {
    if (this.mVideoPlayerProxy == null) {
      this.mVideoPlayerProxy = new U(this);
    }
    paramBoolean = this.mVideoPlayerProxy.a(this.mContext, paramString, paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, paramInt5, new m());
    if (paramBoolean) {
      runOnUiThread(new n());
    }
    return paramBoolean;
  }
  
  protected boolean skipPermissionsDialog()
  {
    Activity localActivity = this.mActivity;
    if (localActivity != null) {
      return UnityPermissions.skipPermissionsDialog(localActivity);
    }
    return false;
  }
  
  public boolean startOrientationListener(int paramInt)
  {
    if (this.mOrientationListener != null) {}
    for (Object localObject = "Orientation Listener already started.";; localObject = "Orientation Listener cannot detect orientation.")
    {
      u.Log(5, (String)localObject);
      return false;
      localObject = new p(this.mContext, paramInt);
      this.mOrientationListener = ((OrientationEventListener)localObject);
      if (((OrientationEventListener)localObject).canDetectOrientation())
      {
        this.mOrientationListener.enable();
        return true;
      }
    }
  }
  
  public boolean stopOrientationListener()
  {
    OrientationEventListener localOrientationEventListener = this.mOrientationListener;
    if (localOrientationEventListener == null)
    {
      u.Log(5, "Orientation Listener was not started.");
      return false;
    }
    localOrientationEventListener.disable();
    this.mOrientationListener = null;
    return true;
  }
  
  protected void toggleGyroscopeSensor(boolean paramBoolean)
  {
    SensorManager localSensorManager = (SensorManager)this.mContext.getSystemService("sensor");
    Sensor localSensor = localSensorManager.getDefaultSensor(11);
    if (paramBoolean) {
      localSensorManager.registerListener(this.m_FakeListener, localSensor, 1);
    } else {
      localSensorManager.unregisterListener(this.m_FakeListener);
    }
  }
  
  public void unload()
  {
    nativeApplicationUnload();
  }
  
  void updateGLDisplay(int paramInt, Surface paramSurface)
  {
    if (this.mMainDisplayOverride) {
      return;
    }
    updateDisplayInternal(paramInt, paramSurface);
  }
  
  public void windowFocusChanged(boolean paramBoolean)
  {
    this.mState.b(paramBoolean);
    if (this.mState.a())
    {
      Object localObject1 = this.mSoftInputDialog;
      if ((localObject1 == null) || (((B)localObject1).d))
      {
        Object localObject2;
        if (paramBoolean)
        {
          localObject2 = this.m_MainThread;
          localObject1 = B.g;
          localObject2 = ((C)localObject2).a;
          if (localObject2 != null) {
            Message.obtain((Handler)localObject2, 2269, localObject1).sendToTarget();
          }
        }
        else
        {
          localObject2 = this.m_MainThread;
          localObject1 = B.f;
          localObject2 = ((C)localObject2).a;
          if (localObject2 != null) {
            Message.obtain((Handler)localObject2, 2269, localObject1).sendToTarget();
          }
        }
        checkResumePlayer();
      }
    }
  }
  
  private class A
    extends PhoneStateListener
  {
    private A() {}
    
    public void onCallStateChanged(int paramInt, String paramString)
    {
      paramString = UnityPlayer.this;
      boolean bool = true;
      if (paramInt != 1) {
        bool = false;
      }
      UnityPlayer.-$$Nest$mnativeMuteMasterAudio(paramString, bool);
    }
  }
  
  static enum B {}
  
  private class C
    extends Thread
  {
    Handler a;
    boolean b = false;
    boolean c = false;
    UnityPlayer.z d = UnityPlayer.z.b;
    int e = 0;
    int f;
    int g;
    int h = 5;
    
    private C() {}
    
    public void run()
    {
      setName("UnityMain");
      Looper.prepare();
      this.a = new Handler(Looper.myLooper(), new a());
      Looper.loop();
    }
    
    class a
      implements Handler.Callback
    {
      a() {}
      
      private void a()
      {
        UnityPlayer.C localC = UnityPlayer.C.this;
        if ((localC.d == UnityPlayer.z.c) && (localC.c))
        {
          UnityPlayer.-$$Nest$mnativeFocusChanged(localC.i, true);
          UnityPlayer.C.this.d = UnityPlayer.z.a;
        }
      }
      
      public boolean handleMessage(Message paramMessage)
      {
        if (paramMessage.what != 2269) {
          return false;
        }
        Object localObject = (UnityPlayer.B)paramMessage.obj;
        paramMessage = UnityPlayer.B.h;
        if (localObject == paramMessage)
        {
          localObject = UnityPlayer.C.this;
          ((UnityPlayer.C)localObject).e -= 1;
          ((UnityPlayer.C)localObject).i.executeGLThreadJobs();
          localObject = UnityPlayer.C.this;
          if (!((UnityPlayer.C)localObject).b) {
            return true;
          }
          if ((UnityPlayer.-$$Nest$mgetHaveAndroidWindowSupport(((UnityPlayer.C)localObject).i)) && (!UnityPlayer.C.this.c)) {
            return true;
          }
          localObject = UnityPlayer.C.this;
          int i = ((UnityPlayer.C)localObject).h;
          if (i >= 0)
          {
            if (i == 0)
            {
              if (UnityPlayer.-$$Nest$mgetSplashEnabled(((UnityPlayer.C)localObject).i)) {
                UnityPlayer.-$$Nest$mDisableStaticSplashScreen(UnityPlayer.this);
              }
              localObject = UnityPlayer.this;
              if ((UnityPlayer.-$$Nest$fgetmActivity((UnityPlayer)localObject) != null) && (UnityPlayer.-$$Nest$mgetAutoReportFullyDrawnEnabled((UnityPlayer)localObject))) {
                UnityPlayer.-$$Nest$fgetmActivity(UnityPlayer.this).reportFullyDrawn();
              }
            }
            localObject = UnityPlayer.C.this;
            ((UnityPlayer.C)localObject).h -= 1;
          }
          if ((!UnityPlayer.this.isFinishing()) && (!UnityPlayer.-$$Nest$mnativeRender(UnityPlayer.this))) {
            UnityPlayer.-$$Nest$mfinish(UnityPlayer.this);
          }
        }
        else if (localObject == UnityPlayer.B.c)
        {
          Looper.myLooper().quit();
        }
        else if (localObject == UnityPlayer.B.b)
        {
          UnityPlayer.C.this.b = true;
        }
        else if (localObject == UnityPlayer.B.a)
        {
          UnityPlayer.C.this.b = false;
        }
        else if (localObject == UnityPlayer.B.d)
        {
          UnityPlayer.C.this.c = false;
        }
        else
        {
          if (localObject == UnityPlayer.B.e) {
            UnityPlayer.C.this.c = true;
          }
          for (;;)
          {
            a();
            break label422;
            if (localObject == UnityPlayer.B.f)
            {
              localObject = UnityPlayer.C.this;
              if (((UnityPlayer.C)localObject).d == UnityPlayer.z.a) {
                UnityPlayer.-$$Nest$mnativeFocusChanged(((UnityPlayer.C)localObject).i, false);
              }
              UnityPlayer.C.this.d = UnityPlayer.z.b;
              break label422;
            }
            if (localObject != UnityPlayer.B.g) {
              break;
            }
            UnityPlayer.C.this.d = UnityPlayer.z.c;
          }
          if (localObject == UnityPlayer.B.i)
          {
            localObject = UnityPlayer.this;
            UnityPlayer.-$$Nest$mnativeSetLaunchURL((UnityPlayer)localObject, ((UnityPlayer)localObject).getLaunchURL());
          }
          else if (localObject == UnityPlayer.B.j)
          {
            localObject = UnityPlayer.C.this;
            UnityPlayer.-$$Nest$mnativeOrientationChanged(((UnityPlayer.C)localObject).i, ((UnityPlayer.C)localObject).f, ((UnityPlayer.C)localObject).g);
          }
        }
        label422:
        localObject = UnityPlayer.C.this;
        if ((((UnityPlayer.C)localObject).b) && (((UnityPlayer.C)localObject).e <= 0))
        {
          Message.obtain(((UnityPlayer.C)localObject).a, 2269, paramMessage).sendToTarget();
          paramMessage = UnityPlayer.C.this;
          paramMessage.e += 1;
        }
        return true;
      }
    }
  }
  
  private abstract class D
    implements Runnable
  {
    private D() {}
    
    public abstract void a();
    
    public final void run()
    {
      if (!UnityPlayer.this.isFinishing()) {
        a();
      }
    }
  }
  
  class a
    implements Runnable
  {
    a() {}
    
    public void run()
    {
      UnityPlayer.-$$Nest$mnativeResume(UnityPlayer.this);
      UnityPlayer.this.runOnUiThread(new a());
    }
    
    class a
      implements Runnable
    {
      a() {}
      
      public void run()
      {
        I localI = UnityPlayer.-$$Nest$fgetmGlView(UnityPlayer.this);
        if (localI != null) {
          localI.b();
        }
      }
    }
  }
  
  class b
    implements Runnable
  {
    b(UnityPlayer paramUnityPlayer, String paramString1, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, String paramString2, int paramInt2, boolean paramBoolean5, boolean paramBoolean6) {}
    
    public void run()
    {
      UnityPlayer.this.mSoftInputDialog = new B(UnityPlayer.-$$Nest$fgetmContext(UnityPlayer.this), jdField_this, paramString1, paramInt1, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramString2, paramInt2, paramBoolean5, paramBoolean6);
      UnityPlayer.this.mSoftInputDialog.setOnCancelListener(new a());
      UnityPlayer.this.mSoftInputDialog.show();
      UnityPlayer.-$$Nest$mnativeReportKeyboardConfigChanged(UnityPlayer.this);
    }
    
    class a
      implements DialogInterface.OnCancelListener
    {
      a() {}
      
      public void onCancel(DialogInterface paramDialogInterface)
      {
        UnityPlayer.-$$Nest$mnativeSoftInputLostFocus(UnityPlayer.this);
        UnityPlayer.this.reportSoftInputStr(null, 1, false);
      }
    }
  }
  
  class c
    implements Runnable
  {
    c() {}
    
    public void run()
    {
      UnityPlayer.this.reportSoftInputArea(new Rect());
      UnityPlayer.this.reportSoftInputIsVisible(false);
      Object localObject = UnityPlayer.this.mSoftInputDialog;
      if (localObject != null)
      {
        ((Dialog)localObject).dismiss();
        localObject = UnityPlayer.this;
        ((UnityPlayer)localObject).mSoftInputDialog = null;
        UnityPlayer.-$$Nest$mnativeReportKeyboardConfigChanged((UnityPlayer)localObject);
      }
    }
  }
  
  class d
    implements Runnable
  {
    d(String paramString) {}
    
    public void run()
    {
      B localB = UnityPlayer.this.mSoftInputDialog;
      if (localB != null)
      {
        String str = paramString;
        if (str != null) {
          localB.a(str);
        }
      }
    }
  }
  
  class e
    implements Runnable
  {
    e(int paramInt) {}
    
    public void run()
    {
      B localB = UnityPlayer.this.mSoftInputDialog;
      if (localB != null) {
        localB.a(paramInt);
      }
    }
  }
  
  class f
    implements Runnable
  {
    f(boolean paramBoolean) {}
    
    public void run()
    {
      B localB = UnityPlayer.this.mSoftInputDialog;
      if (localB != null) {
        localB.a(paramBoolean);
      }
    }
  }
  
  class g
    implements Runnable
  {
    g(int paramInt1, int paramInt2) {}
    
    public void run()
    {
      B localB = UnityPlayer.this.mSoftInputDialog;
      if (localB != null) {
        localB.a(paramInt1, paramInt2);
      }
    }
  }
  
  class h
    extends UnityPlayer.D
  {
    h(boolean paramBoolean, String paramString, int paramInt)
    {
      super(null);
    }
    
    public void a()
    {
      if (paramBoolean)
      {
        UnityPlayer.-$$Nest$mnativeSoftInputCanceled(UnityPlayer.this);
      }
      else
      {
        String str = paramString;
        if (str != null) {
          UnityPlayer.-$$Nest$mnativeSetInputString(UnityPlayer.this, str);
        }
      }
      if (paramInt == 1) {
        UnityPlayer.-$$Nest$mnativeSoftInputClosed(UnityPlayer.this);
      }
    }
  }
  
  class i
    extends UnityPlayer.D
  {
    i(int paramInt1, int paramInt2)
    {
      super(null);
    }
    
    public void a()
    {
      UnityPlayer.-$$Nest$mnativeSetInputSelection(UnityPlayer.this, paramInt1, paramInt2);
    }
  }
  
  class j
    extends UnityPlayer.D
  {
    j(Rect paramRect)
    {
      super(null);
    }
    
    public void a()
    {
      UnityPlayer localUnityPlayer = UnityPlayer.this;
      Rect localRect = paramRect;
      UnityPlayer.-$$Nest$mnativeSetInputArea(localUnityPlayer, localRect.left, localRect.top, localRect.right, localRect.bottom);
    }
  }
  
  class k
    implements DialogInterface.OnClickListener
  {
    k() {}
    
    public void onClick(DialogInterface paramDialogInterface, int paramInt)
    {
      UnityPlayer.-$$Nest$mfinish(UnityPlayer.this);
    }
  }
  
  class l
    extends UnityPlayer.D
  {
    l(boolean paramBoolean)
    {
      super(null);
    }
    
    public void a()
    {
      UnityPlayer.-$$Nest$mnativeSetKeyboardIsVisible(UnityPlayer.this, paramBoolean);
    }
  }
  
  class m
    implements U.a
  {
    m() {}
    
    public void a()
    {
      UnityPlayer.-$$Nest$fputmVideoPlayerProxy(UnityPlayer.this, null);
    }
  }
  
  class n
    implements Runnable
  {
    n() {}
    
    public void run()
    {
      if (UnityPlayer.-$$Nest$mnativeIsAutorotationOn(UnityPlayer.this))
      {
        UnityPlayer localUnityPlayer = UnityPlayer.this;
        Activity localActivity = UnityPlayer.-$$Nest$fgetmActivity(localUnityPlayer);
        if (localActivity != null) {
          localActivity.setRequestedOrientation(UnityPlayer.-$$Nest$fgetmInitialScreenOrientation(localUnityPlayer));
        }
      }
    }
  }
  
  class o
    implements Runnable
  {
    o() {}
    
    public void run()
    {
      UnityPlayer.this.pause();
      UnityPlayer.this.windowFocusChanged(false);
      UnityPlayer.-$$Nest$fgetm_UnityPlayerLifecycleEvents(UnityPlayer.this).onUnityPlayerUnloaded();
    }
  }
  
  class p
    extends OrientationEventListener
  {
    p(Context paramContext, int paramInt)
    {
      super(paramInt);
    }
    
    public void onOrientationChanged(int paramInt)
    {
      Object localObject1 = UnityPlayer.this;
      Object localObject2 = ((UnityPlayer)localObject1).m_MainThread;
      ((UnityPlayer.C)localObject2).f = UnityPlayer.-$$Nest$fgetmNaturalOrientation((UnityPlayer)localObject1);
      ((UnityPlayer.C)localObject2).g = paramInt;
      localObject1 = UnityPlayer.B.j;
      localObject2 = ((UnityPlayer.C)localObject2).a;
      if (localObject2 != null) {
        Message.obtain((Handler)localObject2, 2269, localObject1).sendToTarget();
      }
    }
  }
  
  class q
    implements Runnable
  {
    q(float paramFloat) {}
    
    public void run()
    {
      UnityPlayer.-$$Nest$fgetmGlView(UnityPlayer.this).a(paramFloat);
    }
  }
  
  class r
    implements Runnable
  {
    r() {}
    
    public void run()
    {
      UnityPlayer localUnityPlayer = UnityPlayer.this;
      localUnityPlayer.removeView(UnityPlayer.-$$Nest$fgetm_SplashScreen(localUnityPlayer));
      UnityPlayer.-$$Nest$fputm_SplashScreen(UnityPlayer.this, null);
    }
  }
  
  class s
    implements Runnable
  {
    s() {}
    
    public void run()
    {
      UnityPlayer.-$$Nest$mnativeSendSurfaceChangedEvent(UnityPlayer.this);
    }
  }
  
  class t
    implements Runnable
  {
    t(int paramInt, Surface paramSurface, Semaphore paramSemaphore) {}
    
    public void run()
    {
      UnityPlayer.-$$Nest$mnativeRecreateGfxState(UnityPlayer.this, paramInt, paramSurface);
      localSemaphore.release();
    }
  }
  
  class u
    implements Runnable
  {
    u() {}
    
    public void run()
    {
      UnityPlayer localUnityPlayer = UnityPlayer.this;
      if (UnityPlayer.-$$Nest$fgetmMainDisplayOverride(localUnityPlayer)) {
        localUnityPlayer.removeView(UnityPlayer.-$$Nest$fgetmGlView(localUnityPlayer));
      } else {
        localUnityPlayer.addView(UnityPlayer.-$$Nest$fgetmGlView(localUnityPlayer));
      }
    }
  }
  
  class v
    implements Runnable
  {
    v(Semaphore paramSemaphore) {}
    
    public void run()
    {
      UnityPlayer.-$$Nest$mshutdown(UnityPlayer.this);
      localSemaphore.release();
    }
  }
  
  class w
    implements Runnable
  {
    w(Semaphore paramSemaphore) {}
    
    public void run()
    {
      if (UnityPlayer.-$$Nest$mnativePause(UnityPlayer.this))
      {
        UnityPlayer localUnityPlayer = UnityPlayer.this;
        UnityPlayer.-$$Nest$fputmQuitting(localUnityPlayer, true);
        UnityPlayer.-$$Nest$mshutdown(localUnityPlayer);
        localSemaphore.release(2);
      }
      else
      {
        localSemaphore.release();
      }
    }
  }
  
  class x
    implements Runnable
  {
    x() {}
    
    public void run()
    {
      UnityPlayer.-$$Nest$mnativeLowMemory(UnityPlayer.this);
    }
  }
  
  class y
    implements SensorEventListener
  {
    y() {}
    
    public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
    
    public void onSensorChanged(SensorEvent paramSensorEvent) {}
  }
  
  static enum z {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\UnityPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */