package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.media.AudioAttributes.Builder;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import java.io.FileInputStream;
import java.io.IOException;

public class M
  extends FrameLayout
  implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl
{
  public static final int y = 0;
  private final Context a;
  private final SurfaceView b;
  private final SurfaceHolder c;
  private final String d;
  private final int e;
  private final int f;
  private final boolean g;
  private final long h;
  private final long i;
  private final FrameLayout j;
  private int k;
  private int l;
  private int m;
  private int n;
  private MediaPlayer o;
  private MediaController p;
  private boolean q = false;
  private boolean r = false;
  private int s = 0;
  private boolean t = false;
  private boolean u = false;
  private K v;
  private L w;
  private volatile int x = 0;
  
  protected M(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2, K paramK)
  {
    super(paramContext);
    this.v = paramK;
    this.a = paramContext;
    this.j = this;
    SurfaceView localSurfaceView = new SurfaceView(paramContext);
    this.b = localSurfaceView;
    paramK = localSurfaceView.getHolder();
    this.c = paramK;
    paramK.addCallback(this);
    setBackgroundColor(paramInt1);
    addView(localSurfaceView);
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    this.d = paramString;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramBoolean;
    this.h = paramLong1;
    this.i = paramLong2;
    setFocusable(true);
    setFocusableInTouchMode(true);
  }
  
  private void a(int paramInt)
  {
    this.x = paramInt;
    K localK = this.v;
    if (localK != null)
    {
      paramInt = this.x;
      ((O)localK).a(paramInt);
    }
  }
  
  boolean a()
  {
    return this.t;
  }
  
  public boolean canPause()
  {
    return true;
  }
  
  public boolean canSeekBackward()
  {
    return true;
  }
  
  public boolean canSeekForward()
  {
    return true;
  }
  
  public void cancelOnPrepare()
  {
    a(2);
  }
  
  protected void destroyPlayer()
  {
    if (!this.t) {
      pause();
    }
    doCleanUp();
  }
  
  protected void doCleanUp()
  {
    Object localObject = this.w;
    if (localObject != null)
    {
      L.-$$Nest$fputb((L)localObject, true);
      this.w = null;
    }
    localObject = this.o;
    if (localObject != null)
    {
      ((MediaPlayer)localObject).reset();
      this.o.release();
      this.o = null;
    }
    this.m = 0;
    this.n = 0;
    this.r = false;
    this.q = false;
  }
  
  public boolean exitOnKeypress(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt != 4) && ((this.e != 2) || (paramInt == 0) || (paramKeyEvent.isSystem()))) {
      return false;
    }
    destroyPlayer();
    a(3);
    return true;
  }
  
  public int getAudioSessionId()
  {
    MediaPlayer localMediaPlayer = this.o;
    int i1;
    if (localMediaPlayer == null) {
      i1 = 0;
    } else {
      i1 = localMediaPlayer.getAudioSessionId();
    }
    return i1;
  }
  
  public int getBufferPercentage()
  {
    int i1;
    if (this.g) {
      i1 = this.s;
    } else {
      i1 = 100;
    }
    return i1;
  }
  
  public int getCurrentPosition()
  {
    MediaPlayer localMediaPlayer = this.o;
    if (localMediaPlayer == null) {
      return 0;
    }
    return localMediaPlayer.getCurrentPosition();
  }
  
  public int getDuration()
  {
    MediaPlayer localMediaPlayer = this.o;
    if (localMediaPlayer == null) {
      return 0;
    }
    return localMediaPlayer.getDuration();
  }
  
  public boolean isPlaying()
  {
    boolean bool2 = this.r;
    boolean bool1 = false;
    int i1;
    if ((bool2) && (this.q)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    MediaPlayer localMediaPlayer = this.o;
    if (localMediaPlayer == null) {
      return i1 ^ 0x1;
    }
    if ((localMediaPlayer.isPlaying()) || (i1 == 0)) {
      bool1 = true;
    }
    return bool1;
  }
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    this.s = paramInt;
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    destroyPlayer();
    a(3);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (exitOnKeypress(paramInt, paramKeyEvent)) {
      return true;
    }
    MediaController localMediaController = this.p;
    boolean bool;
    if (localMediaController != null) {
      bool = localMediaController.onKeyDown(paramInt, paramKeyEvent);
    } else {
      bool = super.onKeyDown(paramInt, paramKeyEvent);
    }
    return bool;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (exitOnKeypress(paramInt, paramKeyEvent)) {
      return true;
    }
    MediaController localMediaController = this.p;
    boolean bool;
    if (localMediaController != null) {
      bool = localMediaController.onKeyUp(paramInt, paramKeyEvent);
    } else {
      bool = super.onKeyUp(paramInt, paramKeyEvent);
    }
    return bool;
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    paramMediaPlayer = this.w;
    if (paramMediaPlayer != null)
    {
      L.-$$Nest$fputb(paramMediaPlayer, true);
      this.w = null;
    }
    int i1 = this.e;
    if ((i1 == 0) || (i1 == 1))
    {
      paramMediaPlayer = new MediaController(this.a);
      this.p = paramMediaPlayer;
      paramMediaPlayer.setMediaPlayer(this);
      this.p.setAnchorView(this);
      this.p.setEnabled(true);
      paramMediaPlayer = this.a;
      if ((paramMediaPlayer instanceof Activity))
      {
        paramMediaPlayer = (Activity)paramMediaPlayer;
        this.p.setSystemUiVisibility(paramMediaPlayer.getWindow().getDecorView().getSystemUiVisibility());
      }
      this.p.show();
    }
    this.r = true;
    if ((this.q) && (!isPlaying()))
    {
      a(1);
      updateVideoLayout();
      if (!this.t) {
        start();
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    if ((this.e == 2) && ((i1 & 0xFF) == 0))
    {
      destroyPlayer();
      a(3);
      return true;
    }
    MediaController localMediaController = this.p;
    boolean bool;
    if (localMediaController != null) {
      bool = localMediaController.onTouchEvent(paramMotionEvent);
    } else {
      bool = super.onTouchEvent(paramMotionEvent);
    }
    return bool;
  }
  
  public void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      this.q = true;
      this.m = paramInt1;
      this.n = paramInt2;
      if ((this.r) && (!isPlaying()))
      {
        a(1);
        updateVideoLayout();
        if (!this.t) {
          start();
        }
      }
    }
  }
  
  public void pause()
  {
    MediaPlayer localMediaPlayer = this.o;
    if (localMediaPlayer == null) {
      return;
    }
    if (this.u) {
      localMediaPlayer.pause();
    }
    this.t = true;
  }
  
  public void seekTo(int paramInt)
  {
    MediaPlayer localMediaPlayer = this.o;
    if (localMediaPlayer == null) {
      return;
    }
    localMediaPlayer.seekTo(paramInt);
  }
  
  public void start()
  {
    MediaPlayer localMediaPlayer = this.o;
    if (localMediaPlayer == null) {
      return;
    }
    if (this.u) {
      localMediaPlayer.start();
    }
    this.t = false;
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.k != paramInt2) || (this.l != paramInt3))
    {
      this.k = paramInt2;
      this.l = paramInt3;
      if (this.u) {
        updateVideoLayout();
      }
    }
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.u = true;
    paramSurfaceHolder = this.o;
    if (paramSurfaceHolder != null)
    {
      paramSurfaceHolder.setDisplay(this.c);
      if (!this.t) {
        this.o.start();
      }
    }
    else
    {
      a(0);
      doCleanUp();
      try
      {
        paramSurfaceHolder = new android/media/MediaPlayer;
        paramSurfaceHolder.<init>();
        this.o = paramSurfaceHolder;
        if (this.g)
        {
          paramSurfaceHolder.setDataSource(this.a, Uri.parse(this.d));
        }
        else
        {
          if (this.i != 0L)
          {
            paramSurfaceHolder = new java/io/FileInputStream;
            paramSurfaceHolder.<init>(this.d);
            this.o.setDataSource(paramSurfaceHolder.getFD(), this.h, this.i);
          }
          else
          {
            paramSurfaceHolder = getResources().getAssets();
            try
            {
              paramSurfaceHolder = paramSurfaceHolder.openFd(this.d);
              this.o.setDataSource(paramSurfaceHolder.getFileDescriptor(), paramSurfaceHolder.getStartOffset(), paramSurfaceHolder.getLength());
              paramSurfaceHolder.close();
            }
            catch (IOException paramSurfaceHolder)
            {
              paramSurfaceHolder = new java/io/FileInputStream;
              paramSurfaceHolder.<init>(this.d);
              this.o.setDataSource(paramSurfaceHolder.getFD());
            }
          }
          paramSurfaceHolder.close();
        }
        this.o.setDisplay(this.c);
        this.o.setScreenOnWhilePlaying(true);
        this.o.setOnBufferingUpdateListener(this);
        this.o.setOnCompletionListener(this);
        this.o.setOnPreparedListener(this);
        this.o.setOnVideoSizeChangedListener(this);
        paramSurfaceHolder = this.o;
        AudioAttributes.Builder localBuilder = new android/media/AudioAttributes$Builder;
        localBuilder.<init>();
        paramSurfaceHolder.setAudioAttributes(localBuilder.setUsage(1).setContentType(3).build());
        this.o.prepareAsync();
        paramSurfaceHolder = new com/unity3d/player/L;
        paramSurfaceHolder.<init>(this, this);
        this.w = paramSurfaceHolder;
        paramSurfaceHolder = new java/lang/Thread;
        paramSurfaceHolder.<init>(this.w);
        paramSurfaceHolder.start();
      }
      catch (Exception paramSurfaceHolder)
      {
        a(2);
      }
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.u = false;
  }
  
  protected void updateVideoLayout()
  {
    if (this.o == null) {
      return;
    }
    Object localObject;
    if ((this.k == 0) || (this.l == 0))
    {
      localObject = (WindowManager)this.a.getSystemService("window");
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)localObject).getDefaultDisplay().getMetrics(localDisplayMetrics);
      this.k = localDisplayMetrics.widthPixels;
      this.l = localDisplayMetrics.heightPixels;
    }
    int i3 = this.k;
    int i4 = this.l;
    int i1;
    if (this.q)
    {
      i1 = this.m;
      float f1 = i1;
      i2 = this.n;
      float f3 = f1 / i2;
      float f2 = i3;
      float f4 = i4;
      f1 = f2 / f4;
      int i5 = this.f;
      if (i5 == 1)
      {
        if (f1 > f3) {
          break label176;
        }
      }
      else
      {
        if (i5 != 2) {
          break label186;
        }
        if (f1 < f3) {
          break label176;
        }
      }
      i2 = (int)(f2 / f3);
      i1 = i3;
      break label202;
      label176:
      i1 = (int)(f4 * f3);
      break label198;
      label186:
      if (i5 == 0) {
        break label202;
      }
    }
    else
    {
      i1 = i3;
    }
    label198:
    int i2 = i4;
    label202:
    if ((i3 != i1) || (i4 != i2))
    {
      localObject = new FrameLayout.LayoutParams(i1, i2, 17);
      this.j.updateViewLayout(this.b, (ViewGroup.LayoutParams)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\M.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */