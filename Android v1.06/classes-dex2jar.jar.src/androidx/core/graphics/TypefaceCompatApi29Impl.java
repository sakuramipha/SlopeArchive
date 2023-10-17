package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.Font.Builder;
import android.graphics.fonts.FontFamily.Builder;
import android.graphics.fonts.FontStyle;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.io.IOException;
import java.io.InputStream;

public class TypefaceCompatApi29Impl
  extends TypefaceCompatBaseImpl
{
  public Typeface createFromFontFamilyFilesResourceEntry(Context paramContext, FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry, Resources paramResources, int paramInt)
  {
    localObject1 = null;
    for (;;)
    {
      try
      {
        FontResourcesParserCompat.FontFileResourceEntry[] arrayOfFontFileResourceEntry = paramFontFamilyFilesResourceEntry.getEntries();
        int m = arrayOfFontFileResourceEntry.length;
        k = 0;
        paramContext = null;
        i = 0;
        j = 1;
        if (i < m) {
          paramFontFamilyFilesResourceEntry = arrayOfFontFileResourceEntry[i];
        }
      }
      catch (Exception paramContext)
      {
        int k;
        int i;
        int j;
        Object localObject2;
        paramContext = (Context)localObject1;
        continue;
      }
      try
      {
        localObject2 = new android/graphics/fonts/Font$Builder;
        ((Font.Builder)localObject2).<init>(paramResources, paramFontFamilyFilesResourceEntry.getResourceId());
        localObject2 = ((Font.Builder)localObject2).setWeight(paramFontFamilyFilesResourceEntry.getWeight());
        if (!paramFontFamilyFilesResourceEntry.isItalic()) {
          j = 0;
        }
        localObject2 = ((Font.Builder)localObject2).setSlant(j).setTtcIndex(paramFontFamilyFilesResourceEntry.getTtcIndex()).setFontVariationSettings(paramFontFamilyFilesResourceEntry.getVariationSettings()).build();
        if (paramContext == null)
        {
          paramFontFamilyFilesResourceEntry = new android/graphics/fonts/FontFamily$Builder;
          paramFontFamilyFilesResourceEntry.<init>((Font)localObject2);
          paramContext = paramFontFamilyFilesResourceEntry;
        }
        else
        {
          paramContext.addFont((Font)localObject2);
        }
        i++;
      }
      catch (IOException paramFontFamilyFilesResourceEntry) {}
    }
    if (paramContext == null) {
      return null;
    }
    paramResources = new android/graphics/fonts/FontStyle;
    if ((paramInt & 0x1) != 0) {
      i = 700;
    } else {
      i = 400;
    }
    j = k;
    if ((paramInt & 0x2) != 0) {
      j = 1;
    }
    paramResources.<init>(i, j);
    paramFontFamilyFilesResourceEntry = new android/graphics/Typeface$CustomFallbackBuilder;
    paramFontFamilyFilesResourceEntry.<init>(paramContext.build());
    paramContext = paramFontFamilyFilesResourceEntry.setStyle(paramResources).build();
    return paramContext;
  }
  
  /* Error */
  public Typeface createFromFontInfo(Context paramContext, android.os.CancellationSignal paramCancellationSignal, FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 101	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 10
    //   6: aload_3
    //   7: arraylength
    //   8: istore 8
    //   10: iconst_0
    //   11: istore 7
    //   13: aconst_null
    //   14: astore_1
    //   15: iconst_0
    //   16: istore 5
    //   18: iconst_1
    //   19: istore 6
    //   21: iload 5
    //   23: iload 8
    //   25: if_icmpge +193 -> 218
    //   28: aload_3
    //   29: iload 5
    //   31: aaload
    //   32: astore 12
    //   34: aload_1
    //   35: astore 9
    //   37: aload 10
    //   39: aload 12
    //   41: invokevirtual 107	androidx/core/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   44: ldc 109
    //   46: aload_2
    //   47: invokevirtual 115	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   50: astore 11
    //   52: aload 11
    //   54: ifnonnull +25 -> 79
    //   57: aload_1
    //   58: astore 9
    //   60: aload 11
    //   62: ifnull +147 -> 209
    //   65: aload_1
    //   66: astore 9
    //   68: aload 11
    //   70: invokevirtual 120	android/os/ParcelFileDescriptor:close	()V
    //   73: aload_1
    //   74: astore 9
    //   76: goto +133 -> 209
    //   79: new 23	android/graphics/fonts/Font$Builder
    //   82: astore 9
    //   84: aload 9
    //   86: aload 11
    //   88: invokespecial 123	android/graphics/fonts/Font$Builder:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   91: aload 9
    //   93: aload 12
    //   95: invokevirtual 124	androidx/core/provider/FontsContractCompat$FontInfo:getWeight	()I
    //   98: invokevirtual 39	android/graphics/fonts/Font$Builder:setWeight	(I)Landroid/graphics/fonts/Font$Builder;
    //   101: astore 9
    //   103: aload 12
    //   105: invokevirtual 125	androidx/core/provider/FontsContractCompat$FontInfo:isItalic	()Z
    //   108: ifeq +6 -> 114
    //   111: goto +6 -> 117
    //   114: iconst_0
    //   115: istore 6
    //   117: aload 9
    //   119: iload 6
    //   121: invokevirtual 46	android/graphics/fonts/Font$Builder:setSlant	(I)Landroid/graphics/fonts/Font$Builder;
    //   124: aload 12
    //   126: invokevirtual 126	androidx/core/provider/FontsContractCompat$FontInfo:getTtcIndex	()I
    //   129: invokevirtual 52	android/graphics/fonts/Font$Builder:setTtcIndex	(I)Landroid/graphics/fonts/Font$Builder;
    //   132: invokevirtual 64	android/graphics/fonts/Font$Builder:build	()Landroid/graphics/fonts/Font;
    //   135: astore 9
    //   137: aload_1
    //   138: ifnonnull +20 -> 158
    //   141: new 66	android/graphics/fonts/FontFamily$Builder
    //   144: dup
    //   145: aload 9
    //   147: invokespecial 69	android/graphics/fonts/FontFamily$Builder:<init>	(Landroid/graphics/fonts/Font;)V
    //   150: astore 9
    //   152: aload 9
    //   154: astore_1
    //   155: goto +10 -> 165
    //   158: aload_1
    //   159: aload 9
    //   161: invokevirtual 73	android/graphics/fonts/FontFamily$Builder:addFont	(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    //   164: pop
    //   165: aload_1
    //   166: astore 9
    //   168: aload 11
    //   170: ifnull +39 -> 209
    //   173: goto -108 -> 65
    //   176: astore 12
    //   178: aload 11
    //   180: ifnull +23 -> 203
    //   183: aload 11
    //   185: invokevirtual 120	android/os/ParcelFileDescriptor:close	()V
    //   188: goto +15 -> 203
    //   191: astore 11
    //   193: aload_1
    //   194: astore 9
    //   196: aload 12
    //   198: aload 11
    //   200: invokevirtual 132	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   203: aload_1
    //   204: astore 9
    //   206: aload 12
    //   208: athrow
    //   209: iinc 5 1
    //   212: aload 9
    //   214: astore_1
    //   215: goto -197 -> 18
    //   218: aload_1
    //   219: ifnonnull +5 -> 224
    //   222: aconst_null
    //   223: areturn
    //   224: new 75	android/graphics/fonts/FontStyle
    //   227: astore_3
    //   228: iload 4
    //   230: iconst_1
    //   231: iand
    //   232: ifeq +11 -> 243
    //   235: sipush 700
    //   238: istore 5
    //   240: goto +8 -> 248
    //   243: sipush 400
    //   246: istore 5
    //   248: iload 7
    //   250: istore 6
    //   252: iload 4
    //   254: iconst_2
    //   255: iand
    //   256: ifeq +6 -> 262
    //   259: iconst_1
    //   260: istore 6
    //   262: aload_3
    //   263: iload 5
    //   265: iload 6
    //   267: invokespecial 78	android/graphics/fonts/FontStyle:<init>	(II)V
    //   270: new 80	android/graphics/Typeface$CustomFallbackBuilder
    //   273: astore_2
    //   274: aload_2
    //   275: aload_1
    //   276: invokevirtual 83	android/graphics/fonts/FontFamily$Builder:build	()Landroid/graphics/fonts/FontFamily;
    //   279: invokespecial 86	android/graphics/Typeface$CustomFallbackBuilder:<init>	(Landroid/graphics/fonts/FontFamily;)V
    //   282: aload_2
    //   283: aload_3
    //   284: invokevirtual 90	android/graphics/Typeface$CustomFallbackBuilder:setStyle	(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
    //   287: invokevirtual 93	android/graphics/Typeface$CustomFallbackBuilder:build	()Landroid/graphics/Typeface;
    //   290: astore_1
    //   291: aload_1
    //   292: areturn
    //   293: astore_1
    //   294: aconst_null
    //   295: areturn
    //   296: astore_1
    //   297: goto -88 -> 209
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	300	0	this	TypefaceCompatApi29Impl
    //   0	300	1	paramContext	Context
    //   0	300	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	300	3	paramArrayOfFontInfo	FontsContractCompat.FontInfo[]
    //   0	300	4	paramInt	int
    //   16	248	5	i	int
    //   19	247	6	j	int
    //   11	238	7	k	int
    //   8	18	8	m	int
    //   35	178	9	localObject1	Object
    //   4	34	10	localContentResolver	android.content.ContentResolver
    //   50	134	11	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   191	8	11	localThrowable	Throwable
    //   32	93	12	localFontInfo	FontsContractCompat.FontInfo
    //   176	31	12	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   79	111	176	finally
    //   117	137	176	finally
    //   141	152	176	finally
    //   158	165	176	finally
    //   183	188	191	finally
    //   6	10	293	java/lang/Exception
    //   37	52	293	java/lang/Exception
    //   68	73	293	java/lang/Exception
    //   196	203	293	java/lang/Exception
    //   206	209	293	java/lang/Exception
    //   224	228	293	java/lang/Exception
    //   262	291	293	java/lang/Exception
    //   37	52	296	java/io/IOException
    //   68	73	296	java/io/IOException
    //   196	203	296	java/io/IOException
    //   206	209	296	java/io/IOException
  }
  
  protected Typeface createFromInputStream(Context paramContext, InputStream paramInputStream)
  {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
  
  public Typeface createFromResourcesFontFile(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    try
    {
      paramContext = new android/graphics/fonts/Font$Builder;
      paramContext.<init>(paramResources, paramInt1);
      paramContext = paramContext.build();
      paramResources = new android/graphics/fonts/FontFamily$Builder;
      paramResources.<init>(paramContext);
      paramString = paramResources.build();
      paramResources = new android/graphics/Typeface$CustomFallbackBuilder;
      paramResources.<init>(paramString);
      paramContext = paramResources.setStyle(paramContext.getStyle()).build();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  protected FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\graphics\TypefaceCompatApi29Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */