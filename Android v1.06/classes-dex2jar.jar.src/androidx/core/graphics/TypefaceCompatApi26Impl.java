package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class TypefaceCompatApi26Impl
  extends TypefaceCompatApi21Impl
{
  private static final String ABORT_CREATION_METHOD = "abortCreation";
  private static final String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
  private static final String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
  private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
  private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
  private static final String FREEZE_METHOD = "freeze";
  private static final int RESOLVE_BY_FONT_TABLE = -1;
  private static final String TAG = "TypefaceCompatApi26Impl";
  protected final Method mAbortCreation;
  protected final Method mAddFontFromAssetManager;
  protected final Method mAddFontFromBuffer;
  protected final Method mCreateFromFamiliesWithDefault;
  protected final Class<?> mFontFamily;
  protected final Constructor<?> mFontFamilyCtor;
  protected final Method mFreeze;
  
  public TypefaceCompatApi26Impl()
  {
    Object localObject6 = null;
    try
    {
      Class localClass = obtainFontFamily();
      localConstructor = obtainFontFamilyCtor(localClass);
      localObject4 = obtainAddFontFromAssetManagerMethod(localClass);
      localObject2 = obtainAddFontFromBufferMethod(localClass);
      localObject3 = obtainFreezeMethod(localClass);
      localObject5 = obtainAbortCreationMethod(localClass);
      localMethod = obtainCreateFromFamiliesWithDefaultMethod(localClass);
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Unable to collect necessary methods for class ");
    ((StringBuilder)localObject2).append(localClassNotFoundException.getClass().getName());
    Log.e("TypefaceCompatApi26Impl", ((StringBuilder)localObject2).toString(), localClassNotFoundException);
    Method localMethod = null;
    Constructor localConstructor = null;
    Object localObject1 = localConstructor;
    localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject5 = localObject3;
    Object localObject4 = localObject1;
    localObject1 = localObject6;
    this.mFontFamily = ((Class)localObject1);
    this.mFontFamilyCtor = localConstructor;
    this.mAddFontFromAssetManager = ((Method)localObject4);
    this.mAddFontFromBuffer = ((Method)localObject2);
    this.mFreeze = ((Method)localObject3);
    this.mAbortCreation = ((Method)localObject5);
    this.mCreateFromFamiliesWithDefault = localMethod;
  }
  
  private void abortCreation(Object paramObject)
  {
    try
    {
      this.mAbortCreation.invoke(paramObject, new Object[0]);
      return;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject)
    {
      for (;;) {}
    }
  }
  
  private boolean addFontFromAssetManager(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3, FontVariationAxis[] paramArrayOfFontVariationAxis)
  {
    try
    {
      boolean bool = ((Boolean)this.mAddFontFromAssetManager.invoke(paramObject, new Object[] { paramContext.getAssets(), paramString, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramArrayOfFontVariationAxis })).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramContext) {}
    return false;
  }
  
  private boolean addFontFromBuffer(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      boolean bool = ((Boolean)this.mAddFontFromBuffer.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) })).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return false;
  }
  
  private boolean freeze(Object paramObject)
  {
    try
    {
      boolean bool = ((Boolean)this.mFreeze.invoke(paramObject, new Object[0])).booleanValue();
      return bool;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return false;
  }
  
  private boolean isFontFamilyPrivateAPIAvailable()
  {
    if (this.mAddFontFromAssetManager == null) {
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    }
    boolean bool;
    if (this.mAddFontFromAssetManager != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private Object newFamily()
  {
    try
    {
      Object localObject = this.mFontFamilyCtor.newInstance(new Object[0]);
      return localObject;
    }
    catch (IllegalAccessException|InstantiationException|InvocationTargetException localIllegalAccessException) {}
    return null;
  }
  
  protected Typeface createFromFamiliesWithDefault(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(this.mFontFamily, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)this.mCreateFromFamiliesWithDefault.invoke(null, new Object[] { localObject, Integer.valueOf(-1), Integer.valueOf(-1) });
      return (Typeface)paramObject;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return null;
  }
  
  public Typeface createFromFontFamilyFilesResourceEntry(Context paramContext, FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry, Resources paramResources, int paramInt)
  {
    if (!isFontFamilyPrivateAPIAvailable()) {
      return super.createFromFontFamilyFilesResourceEntry(paramContext, paramFontFamilyFilesResourceEntry, paramResources, paramInt);
    }
    paramResources = newFamily();
    if (paramResources == null) {
      return null;
    }
    for (Object localObject : paramFontFamilyFilesResourceEntry.getEntries()) {
      if (!addFontFromAssetManager(paramContext, paramResources, ((FontResourcesParserCompat.FontFileResourceEntry)localObject).getFileName(), ((FontResourcesParserCompat.FontFileResourceEntry)localObject).getTtcIndex(), ((FontResourcesParserCompat.FontFileResourceEntry)localObject).getWeight(), ((FontResourcesParserCompat.FontFileResourceEntry)localObject).isItalic(), FontVariationAxis.fromFontVariationSettings(((FontResourcesParserCompat.FontFileResourceEntry)localObject).getVariationSettings())))
      {
        abortCreation(paramResources);
        return null;
      }
    }
    if (!freeze(paramResources)) {
      return null;
    }
    return createFromFamiliesWithDefault(paramResources);
  }
  
  /* Error */
  public Typeface createFromFontInfo(Context paramContext, android.os.CancellationSignal paramCancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: invokespecial 185	androidx/core/graphics/TypefaceCompatApi26Impl:isFontFamilyPrivateAPIAvailable	()Z
    //   12: ifne +106 -> 118
    //   15: aload_0
    //   16: aload_3
    //   17: iload 4
    //   19: invokevirtual 235	androidx/core/graphics/TypefaceCompatApi26Impl:findBestInfo	([Landroidx/core/provider/FontsContractCompat$FontInfo;I)Landroidx/core/provider/FontsContractCompat$FontInfo;
    //   22: astore_3
    //   23: aload_1
    //   24: invokevirtual 239	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   27: astore_1
    //   28: aload_1
    //   29: aload_3
    //   30: invokevirtual 245	androidx/core/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   33: ldc -9
    //   35: aload_2
    //   36: invokevirtual 253	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   39: astore_1
    //   40: aload_1
    //   41: ifnonnull +13 -> 54
    //   44: aload_1
    //   45: ifnull +7 -> 52
    //   48: aload_1
    //   49: invokevirtual 258	android/os/ParcelFileDescriptor:close	()V
    //   52: aconst_null
    //   53: areturn
    //   54: new 260	android/graphics/Typeface$Builder
    //   57: astore_2
    //   58: aload_2
    //   59: aload_1
    //   60: invokevirtual 264	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   63: invokespecial 267	android/graphics/Typeface$Builder:<init>	(Ljava/io/FileDescriptor;)V
    //   66: aload_2
    //   67: aload_3
    //   68: invokevirtual 268	androidx/core/provider/FontsContractCompat$FontInfo:getWeight	()I
    //   71: invokevirtual 272	android/graphics/Typeface$Builder:setWeight	(I)Landroid/graphics/Typeface$Builder;
    //   74: aload_3
    //   75: invokevirtual 273	androidx/core/provider/FontsContractCompat$FontInfo:isItalic	()Z
    //   78: invokevirtual 277	android/graphics/Typeface$Builder:setItalic	(Z)Landroid/graphics/Typeface$Builder;
    //   81: invokevirtual 281	android/graphics/Typeface$Builder:build	()Landroid/graphics/Typeface;
    //   84: astore_2
    //   85: aload_1
    //   86: ifnull +7 -> 93
    //   89: aload_1
    //   90: invokevirtual 258	android/os/ParcelFileDescriptor:close	()V
    //   93: aload_2
    //   94: areturn
    //   95: astore_2
    //   96: aload_1
    //   97: ifnull +16 -> 113
    //   100: aload_1
    //   101: invokevirtual 258	android/os/ParcelFileDescriptor:close	()V
    //   104: goto +9 -> 113
    //   107: astore_1
    //   108: aload_2
    //   109: aload_1
    //   110: invokevirtual 287	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   113: aload_2
    //   114: athrow
    //   115: astore_1
    //   116: aconst_null
    //   117: areturn
    //   118: aload_1
    //   119: aload_3
    //   120: aload_2
    //   121: invokestatic 293	androidx/core/graphics/TypefaceCompatUtil:readFontInfoIntoByteBuffer	(Landroid/content/Context;[Landroidx/core/provider/FontsContractCompat$FontInfo;Landroid/os/CancellationSignal;)Ljava/util/Map;
    //   124: astore 9
    //   126: aload_0
    //   127: invokespecial 189	androidx/core/graphics/TypefaceCompatApi26Impl:newFamily	()Ljava/lang/Object;
    //   130: astore_1
    //   131: aload_1
    //   132: ifnonnull +5 -> 137
    //   135: aconst_null
    //   136: areturn
    //   137: aload_3
    //   138: arraylength
    //   139: istore 7
    //   141: iconst_0
    //   142: istore 6
    //   144: iconst_0
    //   145: istore 5
    //   147: iload 5
    //   149: iload 7
    //   151: if_icmpge +70 -> 221
    //   154: aload_3
    //   155: iload 5
    //   157: aaload
    //   158: astore_2
    //   159: aload 9
    //   161: aload_2
    //   162: invokevirtual 245	androidx/core/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   165: invokeinterface 299 2 0
    //   170: checkcast 301	java/nio/ByteBuffer
    //   173: astore 8
    //   175: aload 8
    //   177: ifnonnull +6 -> 183
    //   180: goto +35 -> 215
    //   183: aload_0
    //   184: aload_1
    //   185: aload 8
    //   187: aload_2
    //   188: invokevirtual 302	androidx/core/provider/FontsContractCompat$FontInfo:getTtcIndex	()I
    //   191: aload_2
    //   192: invokevirtual 268	androidx/core/provider/FontsContractCompat$FontInfo:getWeight	()I
    //   195: aload_2
    //   196: invokevirtual 273	androidx/core/provider/FontsContractCompat$FontInfo:isItalic	()Z
    //   199: invokespecial 304	androidx/core/graphics/TypefaceCompatApi26Impl:addFontFromBuffer	(Ljava/lang/Object;Ljava/nio/ByteBuffer;III)Z
    //   202: ifne +10 -> 212
    //   205: aload_0
    //   206: aload_1
    //   207: invokespecial 223	androidx/core/graphics/TypefaceCompatApi26Impl:abortCreation	(Ljava/lang/Object;)V
    //   210: aconst_null
    //   211: areturn
    //   212: iconst_1
    //   213: istore 6
    //   215: iinc 5 1
    //   218: goto -71 -> 147
    //   221: iload 6
    //   223: ifne +10 -> 233
    //   226: aload_0
    //   227: aload_1
    //   228: invokespecial 223	androidx/core/graphics/TypefaceCompatApi26Impl:abortCreation	(Ljava/lang/Object;)V
    //   231: aconst_null
    //   232: areturn
    //   233: aload_0
    //   234: aload_1
    //   235: invokespecial 225	androidx/core/graphics/TypefaceCompatApi26Impl:freeze	(Ljava/lang/Object;)Z
    //   238: ifne +5 -> 243
    //   241: aconst_null
    //   242: areturn
    //   243: aload_0
    //   244: aload_1
    //   245: invokevirtual 227	androidx/core/graphics/TypefaceCompatApi26Impl:createFromFamiliesWithDefault	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   248: astore_1
    //   249: aload_1
    //   250: ifnonnull +5 -> 255
    //   253: aconst_null
    //   254: areturn
    //   255: aload_1
    //   256: iload 4
    //   258: invokestatic 308	android/graphics/Typeface:create	(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    //   261: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	this	TypefaceCompatApi26Impl
    //   0	262	1	paramContext	Context
    //   0	262	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	262	3	paramArrayOfFontInfo	androidx.core.provider.FontsContractCompat.FontInfo[]
    //   0	262	4	paramInt	int
    //   145	71	5	i	int
    //   142	80	6	j	int
    //   139	13	7	k	int
    //   173	13	8	localByteBuffer	ByteBuffer
    //   124	36	9	localMap	java.util.Map
    // Exception table:
    //   from	to	target	type
    //   54	85	95	finally
    //   100	104	107	finally
    //   28	40	115	java/io/IOException
    //   48	52	115	java/io/IOException
    //   89	93	115	java/io/IOException
    //   108	113	115	java/io/IOException
    //   113	115	115	java/io/IOException
  }
  
  public Typeface createFromResourcesFontFile(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    if (!isFontFamilyPrivateAPIAvailable()) {
      return super.createFromResourcesFontFile(paramContext, paramResources, paramInt1, paramString, paramInt2);
    }
    paramResources = newFamily();
    if (paramResources == null) {
      return null;
    }
    if (!addFontFromAssetManager(paramContext, paramResources, paramString, 0, -1, -1, null))
    {
      abortCreation(paramResources);
      return null;
    }
    if (!freeze(paramResources)) {
      return null;
    }
    return createFromFamiliesWithDefault(paramResources);
  }
  
  protected Method obtainAbortCreationMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getMethod("abortCreation", new Class[0]);
  }
  
  protected Method obtainAddFontFromAssetManagerMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getMethod("addFontFromAssetManager", new Class[] { AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class });
  }
  
  protected Method obtainAddFontFromBufferMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getMethod("addFontFromBuffer", new Class[] { ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE });
  }
  
  protected Method obtainCreateFromFamiliesWithDefaultMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    paramClass = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(paramClass, 1).getClass(), Integer.TYPE, Integer.TYPE });
    paramClass.setAccessible(true);
    return paramClass;
  }
  
  protected Class<?> obtainFontFamily()
    throws ClassNotFoundException
  {
    return Class.forName("android.graphics.FontFamily");
  }
  
  protected Constructor<?> obtainFontFamilyCtor(Class<?> paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getConstructor(new Class[0]);
  }
  
  protected Method obtainFreezeMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getMethod("freeze", new Class[0]);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\graphics\TypefaceCompatApi26Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */