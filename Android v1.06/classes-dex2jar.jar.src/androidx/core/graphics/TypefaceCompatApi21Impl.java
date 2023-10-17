package androidx.core.graphics;

import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TypefaceCompatApi21Impl
  extends TypefaceCompatBaseImpl
{
  private static final String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
  private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
  private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
  private static final String TAG = "TypefaceCompatApi21Impl";
  private static Method sAddFontWeightStyle;
  private static Method sCreateFromFamiliesWithDefault;
  private static Class<?> sFontFamily;
  private static Constructor<?> sFontFamilyCtor;
  private static boolean sHasInitBeenCalled = false;
  
  private static boolean addFontWeightStyle(Object paramObject, String paramString, int paramInt, boolean paramBoolean)
  {
    
    try
    {
      paramBoolean = ((Boolean)sAddFontWeightStyle.invoke(paramObject, new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).booleanValue();
      return paramBoolean;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  private static Typeface createFromFamiliesWithDefault(Object paramObject)
  {
    
    try
    {
      Object localObject = Array.newInstance(sFontFamily, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)sCreateFromFamiliesWithDefault.invoke(null, new Object[] { localObject });
      return (Typeface)paramObject;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  private File getFile(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("/proc/self/fd/");
      localStringBuilder.append(paramParcelFileDescriptor.getFd());
      paramParcelFileDescriptor = Os.readlink(localStringBuilder.toString());
      if (OsConstants.S_ISREG(Os.stat(paramParcelFileDescriptor).st_mode))
      {
        paramParcelFileDescriptor = new File(paramParcelFileDescriptor);
        return paramParcelFileDescriptor;
      }
    }
    catch (ErrnoException paramParcelFileDescriptor)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static void init()
  {
    if (sHasInitBeenCalled) {
      return;
    }
    sHasInitBeenCalled = true;
    Object localObject2 = null;
    try
    {
      localClass = Class.forName("android.graphics.FontFamily");
      Constructor localConstructor = localClass.getConstructor(new Class[0]);
      localObject1 = localClass.getMethod("addFontWeightStyle", new Class[] { String.class, Integer.TYPE, Boolean.TYPE });
      Method localMethod1 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(localClass, 1).getClass() });
      localObject2 = localConstructor;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Log.e("TypefaceCompatApi21Impl", localClassNotFoundException.getClass().getName(), localClassNotFoundException);
    Method localMethod2 = null;
    Class localClass = null;
    Object localObject1 = localClass;
    sFontFamilyCtor = (Constructor)localObject2;
    sFontFamily = localClass;
    sAddFontWeightStyle = (Method)localObject1;
    sCreateFromFamiliesWithDefault = localMethod2;
  }
  
  private static Object newFamily()
  {
    
    try
    {
      Object localObject = sFontFamilyCtor.newInstance(new Object[0]);
      return localObject;
    }
    catch (InvocationTargetException localInvocationTargetException) {}catch (InstantiationException localInstantiationException) {}catch (IllegalAccessException localIllegalAccessException) {}
    throw new RuntimeException(localIllegalAccessException);
  }
  
  /* Error */
  public Typeface createFromFontFamilyFilesResourceEntry(android.content.Context paramContext, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry, android.content.res.Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 197	androidx/core/graphics/TypefaceCompatApi21Impl:newFamily	()Ljava/lang/Object;
    //   3: astore 7
    //   5: aload_2
    //   6: invokevirtual 203	androidx/core/content/res/FontResourcesParserCompat$FontFamilyFilesResourceEntry:getEntries	()[Landroidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry;
    //   9: astore 8
    //   11: aload 8
    //   13: arraylength
    //   14: istore 5
    //   16: iconst_0
    //   17: istore 4
    //   19: iload 4
    //   21: iload 5
    //   23: if_icmpge +105 -> 128
    //   26: aload 8
    //   28: iload 4
    //   30: aaload
    //   31: astore 9
    //   33: aload_1
    //   34: invokestatic 209	androidx/core/graphics/TypefaceCompatUtil:getTempFile	(Landroid/content/Context;)Ljava/io/File;
    //   37: astore_2
    //   38: aload_2
    //   39: ifnonnull +5 -> 44
    //   42: aconst_null
    //   43: areturn
    //   44: aload_2
    //   45: aload_3
    //   46: aload 9
    //   48: invokevirtual 214	androidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry:getResourceId	()I
    //   51: invokestatic 218	androidx/core/graphics/TypefaceCompatUtil:copyToFile	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   54: istore 6
    //   56: iload 6
    //   58: ifne +10 -> 68
    //   61: aload_2
    //   62: invokevirtual 221	java/io/File:delete	()Z
    //   65: pop
    //   66: aconst_null
    //   67: areturn
    //   68: aload 7
    //   70: aload_2
    //   71: invokevirtual 224	java/io/File:getPath	()Ljava/lang/String;
    //   74: aload 9
    //   76: invokevirtual 227	androidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry:getWeight	()I
    //   79: aload 9
    //   81: invokevirtual 230	androidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry:isItalic	()Z
    //   84: invokestatic 232	androidx/core/graphics/TypefaceCompatApi21Impl:addFontWeightStyle	(Ljava/lang/Object;Ljava/lang/String;IZ)Z
    //   87: istore 6
    //   89: iload 6
    //   91: ifne +10 -> 101
    //   94: aload_2
    //   95: invokevirtual 221	java/io/File:delete	()Z
    //   98: pop
    //   99: aconst_null
    //   100: areturn
    //   101: aload_2
    //   102: invokevirtual 221	java/io/File:delete	()Z
    //   105: pop
    //   106: iinc 4 1
    //   109: goto -90 -> 19
    //   112: astore_1
    //   113: aload_2
    //   114: invokevirtual 221	java/io/File:delete	()Z
    //   117: pop
    //   118: aload_1
    //   119: athrow
    //   120: astore_1
    //   121: aload_2
    //   122: invokevirtual 221	java/io/File:delete	()Z
    //   125: pop
    //   126: aconst_null
    //   127: areturn
    //   128: aload 7
    //   130: invokestatic 234	androidx/core/graphics/TypefaceCompatApi21Impl:createFromFamiliesWithDefault	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   133: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	134	0	this	TypefaceCompatApi21Impl
    //   0	134	1	paramContext	android.content.Context
    //   0	134	2	paramFontFamilyFilesResourceEntry	androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry
    //   0	134	3	paramResources	android.content.res.Resources
    //   0	134	4	paramInt	int
    //   14	10	5	i	int
    //   54	36	6	bool	boolean
    //   3	126	7	localObject	Object
    //   9	18	8	arrayOfFontFileResourceEntry	androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[]
    //   31	49	9	localFontFileResourceEntry	androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry
    // Exception table:
    //   from	to	target	type
    //   44	56	112	finally
    //   68	89	112	finally
    //   44	56	120	java/lang/RuntimeException
    //   68	89	120	java/lang/RuntimeException
  }
  
  /* Error */
  public Typeface createFromFontInfo(android.content.Context paramContext, android.os.CancellationSignal paramCancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: aload_3
    //   10: iload 4
    //   12: invokevirtual 242	androidx/core/graphics/TypefaceCompatApi21Impl:findBestInfo	([Landroidx/core/provider/FontsContractCompat$FontInfo;I)Landroidx/core/provider/FontsContractCompat$FontInfo;
    //   15: astore 5
    //   17: aload_1
    //   18: invokevirtual 248	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   21: astore_3
    //   22: aload_3
    //   23: aload 5
    //   25: invokevirtual 254	androidx/core/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   28: ldc_w 256
    //   31: aload_2
    //   32: invokevirtual 262	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   35: astore_2
    //   36: aload_2
    //   37: ifnonnull +13 -> 50
    //   40: aload_2
    //   41: ifnull +7 -> 48
    //   44: aload_2
    //   45: invokevirtual 265	android/os/ParcelFileDescriptor:close	()V
    //   48: aconst_null
    //   49: areturn
    //   50: aload_0
    //   51: aload_2
    //   52: invokespecial 267	androidx/core/graphics/TypefaceCompatApi21Impl:getFile	(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
    //   55: astore_3
    //   56: aload_3
    //   57: ifnull +28 -> 85
    //   60: aload_3
    //   61: invokevirtual 270	java/io/File:canRead	()Z
    //   64: ifne +6 -> 70
    //   67: goto +18 -> 85
    //   70: aload_3
    //   71: invokestatic 274	android/graphics/Typeface:createFromFile	(Ljava/io/File;)Landroid/graphics/Typeface;
    //   74: astore_1
    //   75: aload_2
    //   76: ifnull +7 -> 83
    //   79: aload_2
    //   80: invokevirtual 265	android/os/ParcelFileDescriptor:close	()V
    //   83: aload_1
    //   84: areturn
    //   85: new 276	java/io/FileInputStream
    //   88: astore_3
    //   89: aload_3
    //   90: aload_2
    //   91: invokevirtual 280	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   94: invokespecial 283	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   97: aload_0
    //   98: aload_1
    //   99: aload_3
    //   100: invokespecial 287	androidx/core/graphics/TypefaceCompatBaseImpl:createFromInputStream	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   103: astore_1
    //   104: aload_3
    //   105: invokevirtual 288	java/io/FileInputStream:close	()V
    //   108: aload_2
    //   109: ifnull +7 -> 116
    //   112: aload_2
    //   113: invokevirtual 265	android/os/ParcelFileDescriptor:close	()V
    //   116: aload_1
    //   117: areturn
    //   118: astore_1
    //   119: aload_3
    //   120: invokevirtual 288	java/io/FileInputStream:close	()V
    //   123: goto +9 -> 132
    //   126: astore_3
    //   127: aload_1
    //   128: aload_3
    //   129: invokevirtual 293	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   132: aload_1
    //   133: athrow
    //   134: astore_1
    //   135: aload_2
    //   136: ifnull +16 -> 152
    //   139: aload_2
    //   140: invokevirtual 265	android/os/ParcelFileDescriptor:close	()V
    //   143: goto +9 -> 152
    //   146: astore_2
    //   147: aload_1
    //   148: aload_2
    //   149: invokevirtual 293	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   152: aload_1
    //   153: athrow
    //   154: astore_1
    //   155: aconst_null
    //   156: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	this	TypefaceCompatApi21Impl
    //   0	157	1	paramContext	android.content.Context
    //   0	157	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	157	3	paramArrayOfFontInfo	androidx.core.provider.FontsContractCompat.FontInfo[]
    //   0	157	4	paramInt	int
    //   15	9	5	localFontInfo	androidx.core.provider.FontsContractCompat.FontInfo
    // Exception table:
    //   from	to	target	type
    //   97	104	118	finally
    //   119	123	126	finally
    //   50	56	134	finally
    //   60	67	134	finally
    //   70	75	134	finally
    //   85	97	134	finally
    //   104	108	134	finally
    //   127	132	134	finally
    //   132	134	134	finally
    //   139	143	146	finally
    //   22	36	154	java/io/IOException
    //   44	48	154	java/io/IOException
    //   79	83	154	java/io/IOException
    //   112	116	154	java/io/IOException
    //   147	152	154	java/io/IOException
    //   152	154	154	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\graphics\TypefaceCompatApi21Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */