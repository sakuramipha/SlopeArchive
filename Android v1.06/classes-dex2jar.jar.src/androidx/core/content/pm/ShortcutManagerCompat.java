package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ShortcutManagerCompat
{
  static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
  private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
  private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
  public static final String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
  public static final int FLAG_MATCH_CACHED = 8;
  public static final int FLAG_MATCH_DYNAMIC = 2;
  public static final int FLAG_MATCH_MANIFEST = 1;
  public static final int FLAG_MATCH_PINNED = 4;
  static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
  private static final String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
  private static final String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
  private static volatile List<ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
  private static volatile ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;
  
  public static boolean addDynamicShortcuts(Context paramContext, List<ShortcutInfoCompat> paramList)
  {
    if (Build.VERSION.SDK_INT <= 29) {
      convertUriIconsToBitmapIcons(paramContext, paramList);
    }
    if (Build.VERSION.SDK_INT >= 25)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((ShortcutInfoCompat)localIterator.next()).toShortcutInfo());
      }
      if (!((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).addDynamicShortcuts(localArrayList)) {
        return false;
      }
    }
    getShortcutInfoSaverInstance(paramContext).addShortcuts(paramList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutAdded(paramList);
    }
    return true;
  }
  
  static boolean convertUriIconToBitmapIcon(Context paramContext, ShortcutInfoCompat paramShortcutInfoCompat)
  {
    if (paramShortcutInfoCompat.mIcon == null) {
      return false;
    }
    int i = paramShortcutInfoCompat.mIcon.mType;
    if ((i != 6) && (i != 4)) {
      return true;
    }
    paramContext = paramShortcutInfoCompat.mIcon.getUriInputStream(paramContext);
    if (paramContext == null) {
      return false;
    }
    paramContext = BitmapFactory.decodeStream(paramContext);
    if (paramContext == null) {
      return false;
    }
    if (i == 6) {
      paramContext = IconCompat.createWithAdaptiveBitmap(paramContext);
    } else {
      paramContext = IconCompat.createWithBitmap(paramContext);
    }
    paramShortcutInfoCompat.mIcon = paramContext;
    return true;
  }
  
  static void convertUriIconsToBitmapIcons(Context paramContext, List<ShortcutInfoCompat> paramList)
  {
    Iterator localIterator = new ArrayList(paramList).iterator();
    while (localIterator.hasNext())
    {
      ShortcutInfoCompat localShortcutInfoCompat = (ShortcutInfoCompat)localIterator.next();
      if (!convertUriIconToBitmapIcon(paramContext, localShortcutInfoCompat)) {
        paramList.remove(localShortcutInfoCompat);
      }
    }
  }
  
  public static Intent createShortcutResultIntent(Context paramContext, ShortcutInfoCompat paramShortcutInfoCompat)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      paramContext = ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).createShortcutResultIntent(paramShortcutInfoCompat.toShortcutInfo());
    } else {
      paramContext = null;
    }
    Object localObject = paramContext;
    if (paramContext == null) {
      localObject = new Intent();
    }
    return paramShortcutInfoCompat.addToIntent((Intent)localObject);
  }
  
  public static void disableShortcuts(Context paramContext, List<String> paramList, CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 25) {
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).disableShortcuts(paramList, paramCharSequence);
    }
    getShortcutInfoSaverInstance(paramContext).removeShortcuts(paramList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutRemoved(paramList);
    }
  }
  
  public static void enableShortcuts(Context paramContext, List<ShortcutInfoCompat> paramList)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((ShortcutInfoCompat)localIterator.next()).mId);
      }
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).enableShortcuts(localArrayList);
    }
    getShortcutInfoSaverInstance(paramContext).addShortcuts(paramList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutAdded(paramList);
    }
  }
  
  public static List<ShortcutInfoCompat> getDynamicShortcuts(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      Object localObject = ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
      ArrayList localArrayList = new ArrayList(((List)localObject).size());
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        localArrayList.add(new ShortcutInfoCompat.Builder(paramContext, (ShortcutInfo)((Iterator)localObject).next()).build());
      }
      return localArrayList;
    }
    try
    {
      paramContext = getShortcutInfoSaverInstance(paramContext).getShortcuts();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return new ArrayList();
  }
  
  private static int getIconDimensionInternal(Context paramContext, boolean paramBoolean)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    if ((Build.VERSION.SDK_INT >= 19) && (localActivityManager != null) && (!localActivityManager.isLowRamDevice())) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0) {
      i = 48;
    } else {
      i = 96;
    }
    int i = Math.max(1, i);
    paramContext = paramContext.getResources().getDisplayMetrics();
    float f;
    if (paramBoolean) {
      f = paramContext.xdpi;
    } else {
      f = paramContext.ydpi;
    }
    f /= 160.0F;
    return (int)(i * f);
  }
  
  public static int getIconMaxHeight(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (Build.VERSION.SDK_INT >= 25) {
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }
    return getIconDimensionInternal(paramContext, false);
  }
  
  public static int getIconMaxWidth(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (Build.VERSION.SDK_INT >= 25) {
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }
    return getIconDimensionInternal(paramContext, true);
  }
  
  public static int getMaxShortcutCountPerActivity(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (Build.VERSION.SDK_INT >= 25) {
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }
    return 5;
  }
  
  static List<ShortcutInfoChangeListener> getShortcutInfoChangeListeners()
  {
    return sShortcutInfoChangeListeners;
  }
  
  private static String getShortcutInfoCompatWithLowestRank(List<ShortcutInfoCompat> paramList)
  {
    Iterator localIterator = paramList.iterator();
    int i = -1;
    paramList = null;
    while (localIterator.hasNext())
    {
      ShortcutInfoCompat localShortcutInfoCompat = (ShortcutInfoCompat)localIterator.next();
      if (localShortcutInfoCompat.getRank() > i)
      {
        paramList = localShortcutInfoCompat.getId();
        i = localShortcutInfoCompat.getRank();
      }
    }
    return paramList;
  }
  
  private static List<ShortcutInfoChangeListener> getShortcutInfoListeners(Context paramContext)
  {
    if (sShortcutInfoChangeListeners == null)
    {
      ArrayList localArrayList = new ArrayList();
      if (Build.VERSION.SDK_INT >= 21)
      {
        Object localObject2 = paramContext.getPackageManager();
        Object localObject1 = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
        ((Intent)localObject1).setPackage(paramContext.getPackageName());
        localObject1 = ((PackageManager)localObject2).queryIntentActivities((Intent)localObject1, 128).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = ((ResolveInfo)((Iterator)localObject1).next()).activityInfo;
          if (localObject2 != null)
          {
            localObject2 = ((ActivityInfo)localObject2).metaData;
            if (localObject2 != null)
            {
              localObject2 = ((Bundle)localObject2).getString("androidx.core.content.pm.shortcut_listener_impl");
              if (localObject2 != null) {
                try
                {
                  localArrayList.add((ShortcutInfoChangeListener)Class.forName((String)localObject2, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext }));
                }
                catch (Exception localException) {}
              }
            }
          }
        }
      }
      if (sShortcutInfoChangeListeners == null) {
        sShortcutInfoChangeListeners = localArrayList;
      }
    }
    return sShortcutInfoChangeListeners;
  }
  
  private static ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(Context paramContext)
  {
    if (sShortcutInfoCompatSaver == null)
    {
      if (Build.VERSION.SDK_INT >= 23) {
        try
        {
          sShortcutInfoCompatSaver = (ShortcutInfoCompatSaver)Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext });
        }
        catch (Exception paramContext) {}
      }
      if (sShortcutInfoCompatSaver == null) {
        sShortcutInfoCompatSaver = new ShortcutInfoCompatSaver.NoopImpl();
      }
    }
    return sShortcutInfoCompatSaver;
  }
  
  public static List<ShortcutInfoCompat> getShortcuts(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return ShortcutInfoCompat.fromShortcuts(paramContext, ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).getShortcuts(paramInt));
    }
    if (Build.VERSION.SDK_INT >= 25)
    {
      ShortcutManager localShortcutManager = (ShortcutManager)paramContext.getSystemService(ShortcutManager.class);
      ArrayList localArrayList = new ArrayList();
      if ((paramInt & 0x1) != 0) {
        localArrayList.addAll(localShortcutManager.getManifestShortcuts());
      }
      if ((paramInt & 0x2) != 0) {
        localArrayList.addAll(localShortcutManager.getDynamicShortcuts());
      }
      if ((paramInt & 0x4) != 0) {
        localArrayList.addAll(localShortcutManager.getPinnedShortcuts());
      }
      return ShortcutInfoCompat.fromShortcuts(paramContext, localArrayList);
    }
    if ((paramInt & 0x2) != 0) {}
    try
    {
      paramContext = getShortcutInfoSaverInstance(paramContext).getShortcuts();
      return paramContext;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return Collections.emptyList();
  }
  
  public static boolean isRateLimitingActive(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (Build.VERSION.SDK_INT >= 25) {
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }
    boolean bool;
    if (getShortcuts(paramContext, 3).size() == getMaxShortcutCountPerActivity(paramContext)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isRequestPinShortcutSupported(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }
    if (ContextCompat.checkSelfPermission(paramContext, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
      return false;
    }
    Iterator localIterator = paramContext.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
    while (localIterator.hasNext())
    {
      paramContext = ((ResolveInfo)localIterator.next()).activityInfo.permission;
      if ((TextUtils.isEmpty(paramContext)) || ("com.android.launcher.permission.INSTALL_SHORTCUT".equals(paramContext))) {
        return true;
      }
    }
    return false;
  }
  
  /* Error */
  public static boolean pushDynamicShortcut(Context paramContext, ShortcutInfoCompat paramShortcutInfoCompat)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 268	androidx/core/util/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_1
    //   6: invokestatic 268	androidx/core/util/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_0
    //   11: invokestatic 393	androidx/core/content/pm/ShortcutManagerCompat:getMaxShortcutCountPerActivity	(Landroid/content/Context;)I
    //   14: istore_2
    //   15: iload_2
    //   16: ifne +5 -> 21
    //   19: iconst_0
    //   20: ireturn
    //   21: getstatic 61	android/os/Build$VERSION:SDK_INT	I
    //   24: bipush 29
    //   26: if_icmpgt +9 -> 35
    //   29: aload_0
    //   30: aload_1
    //   31: invokestatic 160	androidx/core/content/pm/ShortcutManagerCompat:convertUriIconToBitmapIcon	(Landroid/content/Context;Landroidx/core/content/pm/ShortcutInfoCompat;)Z
    //   34: pop
    //   35: getstatic 61	android/os/Build$VERSION:SDK_INT	I
    //   38: bipush 30
    //   40: if_icmplt +22 -> 62
    //   43: aload_0
    //   44: ldc 96
    //   46: invokevirtual 102	android/content/Context:getSystemService	(Ljava/lang/Class;)Ljava/lang/Object;
    //   49: checkcast 96	android/content/pm/ShortcutManager
    //   52: aload_1
    //   53: invokevirtual 90	androidx/core/content/pm/ShortcutInfoCompat:toShortcutInfo	()Landroid/content/pm/ShortcutInfo;
    //   56: invokevirtual 423	android/content/pm/ShortcutManager:pushDynamicShortcut	(Landroid/content/pm/ShortcutInfo;)V
    //   59: goto +87 -> 146
    //   62: getstatic 61	android/os/Build$VERSION:SDK_INT	I
    //   65: bipush 25
    //   67: if_icmplt +79 -> 146
    //   70: aload_0
    //   71: ldc 96
    //   73: invokevirtual 102	android/content/Context:getSystemService	(Ljava/lang/Class;)Ljava/lang/Object;
    //   76: checkcast 96	android/content/pm/ShortcutManager
    //   79: astore 4
    //   81: aload 4
    //   83: invokevirtual 389	android/content/pm/ShortcutManager:isRateLimitingActive	()Z
    //   86: ifeq +5 -> 91
    //   89: iconst_0
    //   90: ireturn
    //   91: aload 4
    //   93: invokevirtual 207	android/content/pm/ShortcutManager:getDynamicShortcuts	()Ljava/util/List;
    //   96: astore_3
    //   97: aload_3
    //   98: invokeinterface 192 1 0
    //   103: iload_2
    //   104: if_icmplt +22 -> 126
    //   107: aload 4
    //   109: iconst_1
    //   110: anewarray 416	java/lang/String
    //   113: dup
    //   114: iconst_0
    //   115: aload_3
    //   116: invokestatic 426	androidx/core/content/pm/ShortcutManagerCompat$Api25Impl:getShortcutInfoWithLowestRank	(Ljava/util/List;)Ljava/lang/String;
    //   119: aastore
    //   120: invokestatic 432	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   123: invokevirtual 435	android/content/pm/ShortcutManager:removeDynamicShortcuts	(Ljava/util/List;)V
    //   126: aload 4
    //   128: iconst_1
    //   129: anewarray 211	android/content/pm/ShortcutInfo
    //   132: dup
    //   133: iconst_0
    //   134: aload_1
    //   135: invokevirtual 90	androidx/core/content/pm/ShortcutInfoCompat:toShortcutInfo	()Landroid/content/pm/ShortcutInfo;
    //   138: aastore
    //   139: invokestatic 432	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   142: invokevirtual 105	android/content/pm/ShortcutManager:addDynamicShortcuts	(Ljava/util/List;)Z
    //   145: pop
    //   146: aload_0
    //   147: invokestatic 109	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoSaverInstance	(Landroid/content/Context;)Landroidx/core/content/pm/ShortcutInfoCompatSaver;
    //   150: astore_3
    //   151: aload_3
    //   152: invokevirtual 222	androidx/core/content/pm/ShortcutInfoCompatSaver:getShortcuts	()Ljava/util/List;
    //   155: astore 4
    //   157: aload 4
    //   159: invokeinterface 192 1 0
    //   164: iload_2
    //   165: if_icmplt +23 -> 188
    //   168: aload_3
    //   169: iconst_1
    //   170: anewarray 416	java/lang/String
    //   173: dup
    //   174: iconst_0
    //   175: aload 4
    //   177: invokestatic 437	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoCompatWithLowestRank	(Ljava/util/List;)Ljava/lang/String;
    //   180: aastore
    //   181: invokestatic 432	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   184: invokevirtual 184	androidx/core/content/pm/ShortcutInfoCompatSaver:removeShortcuts	(Ljava/util/List;)Ljava/lang/Object;
    //   187: pop
    //   188: aload_3
    //   189: iconst_1
    //   190: anewarray 86	androidx/core/content/pm/ShortcutInfoCompat
    //   193: dup
    //   194: iconst_0
    //   195: aload_1
    //   196: aastore
    //   197: invokestatic 432	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   200: invokevirtual 115	androidx/core/content/pm/ShortcutInfoCompatSaver:addShortcuts	(Ljava/util/List;)Ljava/lang/Object;
    //   203: pop
    //   204: aload_0
    //   205: invokestatic 119	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoListeners	(Landroid/content/Context;)Ljava/util/List;
    //   208: invokeinterface 74 1 0
    //   213: astore_3
    //   214: aload_3
    //   215: invokeinterface 80 1 0
    //   220: ifeq +22 -> 242
    //   223: aload_3
    //   224: invokeinterface 84 1 0
    //   229: checkcast 121	androidx/core/content/pm/ShortcutInfoChangeListener
    //   232: aload_1
    //   233: invokestatic 441	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   236: invokevirtual 125	androidx/core/content/pm/ShortcutInfoChangeListener:onShortcutAdded	(Ljava/util/List;)V
    //   239: goto -25 -> 214
    //   242: aload_0
    //   243: aload_1
    //   244: invokevirtual 292	androidx/core/content/pm/ShortcutInfoCompat:getId	()Ljava/lang/String;
    //   247: invokestatic 445	androidx/core/content/pm/ShortcutManagerCompat:reportShortcutUsed	(Landroid/content/Context;Ljava/lang/String;)V
    //   250: iconst_1
    //   251: ireturn
    //   252: astore_3
    //   253: aload_0
    //   254: invokestatic 119	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoListeners	(Landroid/content/Context;)Ljava/util/List;
    //   257: invokeinterface 74 1 0
    //   262: astore 4
    //   264: aload 4
    //   266: invokeinterface 80 1 0
    //   271: ifeq +23 -> 294
    //   274: aload 4
    //   276: invokeinterface 84 1 0
    //   281: checkcast 121	androidx/core/content/pm/ShortcutInfoChangeListener
    //   284: aload_1
    //   285: invokestatic 441	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   288: invokevirtual 125	androidx/core/content/pm/ShortcutInfoChangeListener:onShortcutAdded	(Ljava/util/List;)V
    //   291: goto -27 -> 264
    //   294: aload_0
    //   295: aload_1
    //   296: invokevirtual 292	androidx/core/content/pm/ShortcutInfoCompat:getId	()Ljava/lang/String;
    //   299: invokestatic 445	androidx/core/content/pm/ShortcutManagerCompat:reportShortcutUsed	(Landroid/content/Context;Ljava/lang/String;)V
    //   302: aload_3
    //   303: athrow
    //   304: astore_3
    //   305: aload_0
    //   306: invokestatic 119	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoListeners	(Landroid/content/Context;)Ljava/util/List;
    //   309: invokeinterface 74 1 0
    //   314: astore_3
    //   315: aload_3
    //   316: invokeinterface 80 1 0
    //   321: ifeq +22 -> 343
    //   324: aload_3
    //   325: invokeinterface 84 1 0
    //   330: checkcast 121	androidx/core/content/pm/ShortcutInfoChangeListener
    //   333: aload_1
    //   334: invokestatic 441	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   337: invokevirtual 125	androidx/core/content/pm/ShortcutInfoChangeListener:onShortcutAdded	(Ljava/util/List;)V
    //   340: goto -25 -> 315
    //   343: aload_0
    //   344: aload_1
    //   345: invokevirtual 292	androidx/core/content/pm/ShortcutInfoCompat:getId	()Ljava/lang/String;
    //   348: invokestatic 445	androidx/core/content/pm/ShortcutManagerCompat:reportShortcutUsed	(Landroid/content/Context;Ljava/lang/String;)V
    //   351: iconst_0
    //   352: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	353	0	paramContext	Context
    //   0	353	1	paramShortcutInfoCompat	ShortcutInfoCompat
    //   14	152	2	i	int
    //   96	128	3	localObject1	Object
    //   252	51	3	localObject2	Object
    //   304	1	3	localException	Exception
    //   314	11	3	localIterator	Iterator
    //   79	196	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   151	188	252	finally
    //   188	204	252	finally
    //   151	188	304	java/lang/Exception
    //   188	204	304	java/lang/Exception
  }
  
  public static void removeAllDynamicShortcuts(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 25) {
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
    }
    getShortcutInfoSaverInstance(paramContext).removeAllShortcuts();
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onAllShortcutsRemoved();
    }
  }
  
  public static void removeDynamicShortcuts(Context paramContext, List<String> paramList)
  {
    if (Build.VERSION.SDK_INT >= 25) {
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(paramList);
    }
    getShortcutInfoSaverInstance(paramContext).removeShortcuts(paramList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutRemoved(paramList);
    }
  }
  
  public static void removeLongLivedShortcuts(Context paramContext, List<String> paramList)
  {
    if (Build.VERSION.SDK_INT < 30)
    {
      removeDynamicShortcuts(paramContext, paramList);
      return;
    }
    ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(paramList);
    getShortcutInfoSaverInstance(paramContext).removeShortcuts(paramList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutRemoved(paramList);
    }
  }
  
  public static void reportShortcutUsed(Context paramContext, String paramString)
  {
    Preconditions.checkNotNull(paramContext);
    Preconditions.checkNotNull(paramString);
    if (Build.VERSION.SDK_INT >= 25) {
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).reportShortcutUsed(paramString);
    }
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutUsageReported(Collections.singletonList(paramString));
    }
  }
  
  public static boolean requestPinShortcut(Context paramContext, ShortcutInfoCompat paramShortcutInfoCompat, IntentSender paramIntentSender)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).requestPinShortcut(paramShortcutInfoCompat.toShortcutInfo(), paramIntentSender);
    }
    if (!isRequestPinShortcutSupported(paramContext)) {
      return false;
    }
    paramShortcutInfoCompat = paramShortcutInfoCompat.addToIntent(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
    if (paramIntentSender == null)
    {
      paramContext.sendBroadcast(paramShortcutInfoCompat);
      return true;
    }
    paramContext.sendOrderedBroadcast(paramShortcutInfoCompat, null, new BroadcastReceiver()
    {
      public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        try
        {
          ShortcutManagerCompat.this.sendIntent(paramAnonymousContext, 0, null, null, null);
          return;
        }
        catch (IntentSender.SendIntentException paramAnonymousContext)
        {
          for (;;) {}
        }
      }
    }, null, -1, null, null);
    return true;
  }
  
  public static boolean setDynamicShortcuts(Context paramContext, List<ShortcutInfoCompat> paramList)
  {
    Preconditions.checkNotNull(paramContext);
    Preconditions.checkNotNull(paramList);
    Object localObject;
    if (Build.VERSION.SDK_INT >= 25)
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      localObject = paramList.iterator();
      while (((Iterator)localObject).hasNext()) {
        localArrayList.add(((ShortcutInfoCompat)((Iterator)localObject).next()).toShortcutInfo());
      }
      if (!((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).setDynamicShortcuts(localArrayList)) {
        return false;
      }
    }
    getShortcutInfoSaverInstance(paramContext).removeAllShortcuts();
    getShortcutInfoSaverInstance(paramContext).addShortcuts(paramList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext())
    {
      localObject = (ShortcutInfoChangeListener)paramContext.next();
      ((ShortcutInfoChangeListener)localObject).onAllShortcutsRemoved();
      ((ShortcutInfoChangeListener)localObject).onShortcutAdded(paramList);
    }
    return true;
  }
  
  static void setShortcutInfoChangeListeners(List<ShortcutInfoChangeListener> paramList)
  {
    sShortcutInfoChangeListeners = paramList;
  }
  
  static void setShortcutInfoCompatSaver(ShortcutInfoCompatSaver<Void> paramShortcutInfoCompatSaver)
  {
    sShortcutInfoCompatSaver = paramShortcutInfoCompatSaver;
  }
  
  public static boolean updateShortcuts(Context paramContext, List<ShortcutInfoCompat> paramList)
  {
    if (Build.VERSION.SDK_INT <= 29) {
      convertUriIconsToBitmapIcons(paramContext, paramList);
    }
    if (Build.VERSION.SDK_INT >= 25)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((ShortcutInfoCompat)localIterator.next()).toShortcutInfo());
      }
      if (!((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).updateShortcuts(localArrayList)) {
        return false;
      }
    }
    getShortcutInfoSaverInstance(paramContext).addShortcuts(paramList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutUpdated(paramList);
    }
    return true;
  }
  
  private static class Api25Impl
  {
    static String getShortcutInfoWithLowestRank(List<ShortcutInfo> paramList)
    {
      Iterator localIterator = paramList.iterator();
      int i = -1;
      paramList = null;
      while (localIterator.hasNext())
      {
        ShortcutInfo localShortcutInfo = (ShortcutInfo)localIterator.next();
        if (localShortcutInfo.getRank() > i)
        {
          paramList = localShortcutInfo.getId();
          i = localShortcutInfo.getRank();
        }
      }
      return paramList;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ShortcutMatchFlags {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\content\pm\ShortcutManagerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */