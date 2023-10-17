package androidx.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.CancellationSignal.OnCancelListener;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintAttributes.Builder;
import android.print.PrintAttributes.Margins;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.PrintDocumentInfo.Builder;
import android.print.PrintManager;
import android.util.Log;
import java.io.FileNotFoundException;

public final class PrintHelper
{
  public static final int COLOR_MODE_COLOR = 2;
  public static final int COLOR_MODE_MONOCHROME = 1;
  static final boolean IS_MIN_MARGINS_HANDLING_CORRECT;
  private static final String LOG_TAG = "PrintHelper";
  private static final int MAX_PRINT_SIZE = 3500;
  public static final int ORIENTATION_LANDSCAPE = 1;
  public static final int ORIENTATION_PORTRAIT = 2;
  static final boolean PRINT_ACTIVITY_RESPECTS_ORIENTATION;
  public static final int SCALE_MODE_FILL = 2;
  public static final int SCALE_MODE_FIT = 1;
  int mColorMode = 2;
  final Context mContext;
  BitmapFactory.Options mDecodeOptions = null;
  final Object mLock = new Object();
  int mOrientation = 1;
  int mScaleMode = 2;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    if ((i >= 20) && (Build.VERSION.SDK_INT <= 23)) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    PRINT_ACTIVITY_RESPECTS_ORIENTATION = bool1;
    boolean bool1 = bool2;
    if (Build.VERSION.SDK_INT != 23) {
      bool1 = true;
    }
    IS_MIN_MARGINS_HANDLING_CORRECT = bool1;
  }
  
  public PrintHelper(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  static Bitmap convertBitmapForColorMode(Bitmap paramBitmap, int paramInt)
  {
    if (paramInt != 1) {
      return paramBitmap;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    ColorMatrix localColorMatrix = new ColorMatrix();
    localColorMatrix.setSaturation(0.0F);
    localPaint.setColorFilter(new ColorMatrixColorFilter(localColorMatrix));
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    localCanvas.setBitmap(null);
    return localBitmap;
  }
  
  private static PrintAttributes.Builder copyAttributes(PrintAttributes paramPrintAttributes)
  {
    PrintAttributes.Builder localBuilder = new PrintAttributes.Builder().setMediaSize(paramPrintAttributes.getMediaSize()).setResolution(paramPrintAttributes.getResolution()).setMinMargins(paramPrintAttributes.getMinMargins());
    if (paramPrintAttributes.getColorMode() != 0) {
      localBuilder.setColorMode(paramPrintAttributes.getColorMode());
    }
    if ((Build.VERSION.SDK_INT >= 23) && (paramPrintAttributes.getDuplexMode() != 0)) {
      localBuilder.setDuplexMode(paramPrintAttributes.getDuplexMode());
    }
    return localBuilder;
  }
  
  static Matrix getMatrix(int paramInt1, int paramInt2, RectF paramRectF, int paramInt3)
  {
    Matrix localMatrix = new Matrix();
    float f1 = paramRectF.width();
    float f2 = paramInt1;
    f1 /= f2;
    if (paramInt3 == 2) {
      f1 = Math.max(f1, paramRectF.height() / paramInt2);
    } else {
      f1 = Math.min(f1, paramRectF.height() / paramInt2);
    }
    localMatrix.postScale(f1, f1);
    localMatrix.postTranslate((paramRectF.width() - f2 * f1) / 2.0F, (paramRectF.height() - paramInt2 * f1) / 2.0F);
    return localMatrix;
  }
  
  static boolean isPortrait(Bitmap paramBitmap)
  {
    boolean bool;
    if (paramBitmap.getWidth() <= paramBitmap.getHeight()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  private Bitmap loadBitmap(Uri paramUri, BitmapFactory.Options paramOptions)
    throws FileNotFoundException
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +93 -> 94
    //   4: aload_0
    //   5: getfield 74	androidx/print/PrintHelper:mContext	Landroid/content/Context;
    //   8: astore 4
    //   10: aload 4
    //   12: ifnull +82 -> 94
    //   15: aconst_null
    //   16: astore_3
    //   17: aload 4
    //   19: invokevirtual 214	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   22: aload_1
    //   23: invokevirtual 220	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   26: astore 4
    //   28: aload 4
    //   30: aconst_null
    //   31: aload_2
    //   32: invokestatic 226	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   35: astore_1
    //   36: aload 4
    //   38: ifnull +21 -> 59
    //   41: aload 4
    //   43: invokevirtual 231	java/io/InputStream:close	()V
    //   46: goto +13 -> 59
    //   49: astore_2
    //   50: ldc 30
    //   52: ldc -23
    //   54: aload_2
    //   55: invokestatic 239	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   58: pop
    //   59: aload_1
    //   60: areturn
    //   61: astore_1
    //   62: aload 4
    //   64: astore_2
    //   65: goto +6 -> 71
    //   68: astore_1
    //   69: aload_3
    //   70: astore_2
    //   71: aload_2
    //   72: ifnull +20 -> 92
    //   75: aload_2
    //   76: invokevirtual 231	java/io/InputStream:close	()V
    //   79: goto +13 -> 92
    //   82: astore_2
    //   83: ldc 30
    //   85: ldc -23
    //   87: aload_2
    //   88: invokestatic 239	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   91: pop
    //   92: aload_1
    //   93: athrow
    //   94: new 241	java/lang/IllegalArgumentException
    //   97: dup
    //   98: ldc -13
    //   100: invokespecial 246	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	PrintHelper
    //   0	104	1	paramUri	Uri
    //   0	104	2	paramOptions	BitmapFactory.Options
    //   16	54	3	localObject1	Object
    //   8	55	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   41	46	49	java/io/IOException
    //   28	36	61	finally
    //   17	28	68	finally
    //   75	79	82	java/io/IOException
  }
  
  public static boolean systemSupportsPrint()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 19) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int getColorMode()
  {
    return this.mColorMode;
  }
  
  public int getOrientation()
  {
    if ((Build.VERSION.SDK_INT >= 19) && (this.mOrientation == 0)) {
      return 1;
    }
    return this.mOrientation;
  }
  
  public int getScaleMode()
  {
    return this.mScaleMode;
  }
  
  /* Error */
  Bitmap loadConstrainedBitmap(Uri arg1)
    throws FileNotFoundException
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +222 -> 223
    //   4: aload_0
    //   5: getfield 74	androidx/print/PrintHelper:mContext	Landroid/content/Context;
    //   8: ifnull +215 -> 223
    //   11: new 255	android/graphics/BitmapFactory$Options
    //   14: dup
    //   15: invokespecial 256	android/graphics/BitmapFactory$Options:<init>	()V
    //   18: astore 6
    //   20: aload 6
    //   22: iconst_1
    //   23: putfield 259	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   26: aload_0
    //   27: aload_1
    //   28: aload 6
    //   30: invokespecial 261	androidx/print/PrintHelper:loadBitmap	(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   33: pop
    //   34: aload 6
    //   36: getfield 264	android/graphics/BitmapFactory$Options:outWidth	I
    //   39: istore 5
    //   41: aload 6
    //   43: getfield 267	android/graphics/BitmapFactory$Options:outHeight	I
    //   46: istore 4
    //   48: iload 5
    //   50: ifle +171 -> 221
    //   53: iload 4
    //   55: ifgt +6 -> 61
    //   58: goto +163 -> 221
    //   61: iload 5
    //   63: iload 4
    //   65: invokestatic 270	java/lang/Math:max	(II)I
    //   68: istore_3
    //   69: iconst_1
    //   70: istore_2
    //   71: iload_3
    //   72: sipush 3500
    //   75: if_icmple +14 -> 89
    //   78: iload_3
    //   79: iconst_1
    //   80: iushr
    //   81: istore_3
    //   82: iload_2
    //   83: iconst_1
    //   84: ishl
    //   85: istore_2
    //   86: goto -15 -> 71
    //   89: iload_2
    //   90: ifle +131 -> 221
    //   93: iload 5
    //   95: iload 4
    //   97: invokestatic 272	java/lang/Math:min	(II)I
    //   100: iload_2
    //   101: idiv
    //   102: ifgt +6 -> 108
    //   105: goto +116 -> 221
    //   108: aload_0
    //   109: getfield 66	androidx/print/PrintHelper:mLock	Ljava/lang/Object;
    //   112: astore 6
    //   114: aload 6
    //   116: monitorenter
    //   117: new 255	android/graphics/BitmapFactory$Options
    //   120: astore 7
    //   122: aload 7
    //   124: invokespecial 256	android/graphics/BitmapFactory$Options:<init>	()V
    //   127: aload_0
    //   128: aload 7
    //   130: putfield 64	androidx/print/PrintHelper:mDecodeOptions	Landroid/graphics/BitmapFactory$Options;
    //   133: aload 7
    //   135: iconst_1
    //   136: putfield 275	android/graphics/BitmapFactory$Options:inMutable	Z
    //   139: aload_0
    //   140: getfield 64	androidx/print/PrintHelper:mDecodeOptions	Landroid/graphics/BitmapFactory$Options;
    //   143: iload_2
    //   144: putfield 278	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   147: aload_0
    //   148: getfield 64	androidx/print/PrintHelper:mDecodeOptions	Landroid/graphics/BitmapFactory$Options;
    //   151: astore 7
    //   153: aload 6
    //   155: monitorexit
    //   156: aload_0
    //   157: aload_1
    //   158: aload 7
    //   160: invokespecial 261	androidx/print/PrintHelper:loadBitmap	(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   163: astore 6
    //   165: aload_0
    //   166: getfield 66	androidx/print/PrintHelper:mLock	Ljava/lang/Object;
    //   169: astore_1
    //   170: aload_1
    //   171: monitorenter
    //   172: aload_0
    //   173: aconst_null
    //   174: putfield 64	androidx/print/PrintHelper:mDecodeOptions	Landroid/graphics/BitmapFactory$Options;
    //   177: aload_1
    //   178: monitorexit
    //   179: aload 6
    //   181: areturn
    //   182: astore 6
    //   184: aload_1
    //   185: monitorexit
    //   186: aload 6
    //   188: athrow
    //   189: astore 6
    //   191: aload_0
    //   192: getfield 66	androidx/print/PrintHelper:mLock	Ljava/lang/Object;
    //   195: astore_1
    //   196: aload_1
    //   197: monitorenter
    //   198: aload_0
    //   199: aconst_null
    //   200: putfield 64	androidx/print/PrintHelper:mDecodeOptions	Landroid/graphics/BitmapFactory$Options;
    //   203: aload_1
    //   204: monitorexit
    //   205: aload 6
    //   207: athrow
    //   208: astore 6
    //   210: aload_1
    //   211: monitorexit
    //   212: aload 6
    //   214: athrow
    //   215: astore_1
    //   216: aload 6
    //   218: monitorexit
    //   219: aload_1
    //   220: athrow
    //   221: aconst_null
    //   222: areturn
    //   223: new 241	java/lang/IllegalArgumentException
    //   226: dup
    //   227: ldc_w 280
    //   230: invokespecial 246	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   233: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	PrintHelper
    //   70	74	2	i	int
    //   68	14	3	j	int
    //   46	50	4	k	int
    //   39	55	5	m	int
    //   18	162	6	localObject1	Object
    //   182	5	6	localObject2	Object
    //   189	17	6	localObject3	Object
    //   208	9	6	localObject4	Object
    //   120	39	7	localOptions	BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   172	179	182	finally
    //   184	186	182	finally
    //   156	165	189	finally
    //   198	205	208	finally
    //   210	212	208	finally
    //   117	156	215	finally
    //   216	219	215	finally
  }
  
  public void printBitmap(String paramString, Bitmap paramBitmap)
  {
    printBitmap(paramString, paramBitmap, null);
  }
  
  public void printBitmap(String paramString, Bitmap paramBitmap, OnPrintFinishCallback paramOnPrintFinishCallback)
  {
    if ((Build.VERSION.SDK_INT >= 19) && (paramBitmap != null))
    {
      PrintManager localPrintManager = (PrintManager)this.mContext.getSystemService("print");
      if (isPortrait(paramBitmap)) {
        localObject = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
      } else {
        localObject = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
      }
      Object localObject = new PrintAttributes.Builder().setMediaSize((PrintAttributes.MediaSize)localObject).setColorMode(this.mColorMode).build();
      localPrintManager.print(paramString, new PrintBitmapAdapter(paramString, this.mScaleMode, paramBitmap, paramOnPrintFinishCallback), (PrintAttributes)localObject);
    }
  }
  
  public void printBitmap(String paramString, Uri paramUri)
    throws FileNotFoundException
  {
    printBitmap(paramString, paramUri, null);
  }
  
  public void printBitmap(String paramString, Uri paramUri, OnPrintFinishCallback paramOnPrintFinishCallback)
    throws FileNotFoundException
  {
    if (Build.VERSION.SDK_INT < 19) {
      return;
    }
    paramUri = new PrintUriAdapter(paramString, paramUri, paramOnPrintFinishCallback, this.mScaleMode);
    PrintManager localPrintManager = (PrintManager)this.mContext.getSystemService("print");
    paramOnPrintFinishCallback = new PrintAttributes.Builder();
    paramOnPrintFinishCallback.setColorMode(this.mColorMode);
    int i = this.mOrientation;
    if ((i != 1) && (i != 0))
    {
      if (i == 2) {
        paramOnPrintFinishCallback.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
      }
    }
    else {
      paramOnPrintFinishCallback.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
    }
    localPrintManager.print(paramString, paramUri, paramOnPrintFinishCallback.build());
  }
  
  public void setColorMode(int paramInt)
  {
    this.mColorMode = paramInt;
  }
  
  public void setOrientation(int paramInt)
  {
    this.mOrientation = paramInt;
  }
  
  public void setScaleMode(int paramInt)
  {
    this.mScaleMode = paramInt;
  }
  
  void writeBitmap(final PrintAttributes paramPrintAttributes, final int paramInt, final Bitmap paramBitmap, final ParcelFileDescriptor paramParcelFileDescriptor, final CancellationSignal paramCancellationSignal, final PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
  {
    final PrintAttributes localPrintAttributes;
    if (IS_MIN_MARGINS_HANDLING_CORRECT) {
      localPrintAttributes = paramPrintAttributes;
    } else {
      localPrintAttributes = copyAttributes(paramPrintAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build();
    }
    new AsyncTask()
    {
      /* Error */
      protected Throwable doInBackground(Void... paramAnonymousVarArgs)
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 31	androidx/print/PrintHelper$1:val$cancellationSignal	Landroid/os/CancellationSignal;
        //   4: invokevirtual 62	android/os/CancellationSignal:isCanceled	()Z
        //   7: ifeq +5 -> 12
        //   10: aconst_null
        //   11: areturn
        //   12: new 64	android/print/pdf/PrintedPdfDocument
        //   15: astore 4
        //   17: aload 4
        //   19: aload_0
        //   20: getfield 29	androidx/print/PrintHelper$1:this$0	Landroidx/print/PrintHelper;
        //   23: getfield 68	androidx/print/PrintHelper:mContext	Landroid/content/Context;
        //   26: aload_0
        //   27: getfield 33	androidx/print/PrintHelper$1:val$pdfAttributes	Landroid/print/PrintAttributes;
        //   30: invokespecial 71	android/print/pdf/PrintedPdfDocument:<init>	(Landroid/content/Context;Landroid/print/PrintAttributes;)V
        //   33: aload_0
        //   34: getfield 35	androidx/print/PrintHelper$1:val$bitmap	Landroid/graphics/Bitmap;
        //   37: aload_0
        //   38: getfield 33	androidx/print/PrintHelper$1:val$pdfAttributes	Landroid/print/PrintAttributes;
        //   41: invokevirtual 77	android/print/PrintAttributes:getColorMode	()I
        //   44: invokestatic 81	androidx/print/PrintHelper:convertBitmapForColorMode	(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
        //   47: astore_3
        //   48: aload_0
        //   49: getfield 31	androidx/print/PrintHelper$1:val$cancellationSignal	Landroid/os/CancellationSignal;
        //   52: invokevirtual 62	android/os/CancellationSignal:isCanceled	()Z
        //   55: istore_2
        //   56: iload_2
        //   57: ifeq +5 -> 62
        //   60: aconst_null
        //   61: areturn
        //   62: aload 4
        //   64: iconst_1
        //   65: invokevirtual 85	android/print/pdf/PrintedPdfDocument:startPage	(I)Landroid/graphics/pdf/PdfDocument$Page;
        //   68: astore 5
        //   70: getstatic 89	androidx/print/PrintHelper:IS_MIN_MARGINS_HANDLING_CORRECT	Z
        //   73: ifeq +22 -> 95
        //   76: new 91	android/graphics/RectF
        //   79: astore_1
        //   80: aload_1
        //   81: aload 5
        //   83: invokevirtual 97	android/graphics/pdf/PdfDocument$Page:getInfo	()Landroid/graphics/pdf/PdfDocument$PageInfo;
        //   86: invokevirtual 103	android/graphics/pdf/PdfDocument$PageInfo:getContentRect	()Landroid/graphics/Rect;
        //   89: invokespecial 106	android/graphics/RectF:<init>	(Landroid/graphics/Rect;)V
        //   92: goto +60 -> 152
        //   95: new 64	android/print/pdf/PrintedPdfDocument
        //   98: astore 6
        //   100: aload 6
        //   102: aload_0
        //   103: getfield 29	androidx/print/PrintHelper$1:this$0	Landroidx/print/PrintHelper;
        //   106: getfield 68	androidx/print/PrintHelper:mContext	Landroid/content/Context;
        //   109: aload_0
        //   110: getfield 37	androidx/print/PrintHelper$1:val$attributes	Landroid/print/PrintAttributes;
        //   113: invokespecial 71	android/print/pdf/PrintedPdfDocument:<init>	(Landroid/content/Context;Landroid/print/PrintAttributes;)V
        //   116: aload 6
        //   118: iconst_1
        //   119: invokevirtual 85	android/print/pdf/PrintedPdfDocument:startPage	(I)Landroid/graphics/pdf/PdfDocument$Page;
        //   122: astore 7
        //   124: new 91	android/graphics/RectF
        //   127: astore_1
        //   128: aload_1
        //   129: aload 7
        //   131: invokevirtual 97	android/graphics/pdf/PdfDocument$Page:getInfo	()Landroid/graphics/pdf/PdfDocument$PageInfo;
        //   134: invokevirtual 103	android/graphics/pdf/PdfDocument$PageInfo:getContentRect	()Landroid/graphics/Rect;
        //   137: invokespecial 106	android/graphics/RectF:<init>	(Landroid/graphics/Rect;)V
        //   140: aload 6
        //   142: aload 7
        //   144: invokevirtual 110	android/print/pdf/PrintedPdfDocument:finishPage	(Landroid/graphics/pdf/PdfDocument$Page;)V
        //   147: aload 6
        //   149: invokevirtual 113	android/print/pdf/PrintedPdfDocument:close	()V
        //   152: aload_3
        //   153: invokevirtual 118	android/graphics/Bitmap:getWidth	()I
        //   156: aload_3
        //   157: invokevirtual 121	android/graphics/Bitmap:getHeight	()I
        //   160: aload_1
        //   161: aload_0
        //   162: getfield 39	androidx/print/PrintHelper$1:val$fittingMode	I
        //   165: invokestatic 125	androidx/print/PrintHelper:getMatrix	(IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
        //   168: astore 6
        //   170: getstatic 89	androidx/print/PrintHelper:IS_MIN_MARGINS_HANDLING_CORRECT	Z
        //   173: ifeq +6 -> 179
        //   176: goto +27 -> 203
        //   179: aload 6
        //   181: aload_1
        //   182: getfield 129	android/graphics/RectF:left	F
        //   185: aload_1
        //   186: getfield 132	android/graphics/RectF:top	F
        //   189: invokevirtual 138	android/graphics/Matrix:postTranslate	(FF)Z
        //   192: pop
        //   193: aload 5
        //   195: invokevirtual 142	android/graphics/pdf/PdfDocument$Page:getCanvas	()Landroid/graphics/Canvas;
        //   198: aload_1
        //   199: invokevirtual 148	android/graphics/Canvas:clipRect	(Landroid/graphics/RectF;)Z
        //   202: pop
        //   203: aload 5
        //   205: invokevirtual 142	android/graphics/pdf/PdfDocument$Page:getCanvas	()Landroid/graphics/Canvas;
        //   208: aload_3
        //   209: aload 6
        //   211: aconst_null
        //   212: invokevirtual 152	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
        //   215: aload 4
        //   217: aload 5
        //   219: invokevirtual 110	android/print/pdf/PrintedPdfDocument:finishPage	(Landroid/graphics/pdf/PdfDocument$Page;)V
        //   222: aload_0
        //   223: getfield 31	androidx/print/PrintHelper$1:val$cancellationSignal	Landroid/os/CancellationSignal;
        //   226: invokevirtual 62	android/os/CancellationSignal:isCanceled	()Z
        //   229: istore_2
        //   230: iload_2
        //   231: ifeq +35 -> 266
        //   234: aload 4
        //   236: invokevirtual 113	android/print/pdf/PrintedPdfDocument:close	()V
        //   239: aload_0
        //   240: getfield 41	androidx/print/PrintHelper$1:val$fileDescriptor	Landroid/os/ParcelFileDescriptor;
        //   243: astore_1
        //   244: aload_1
        //   245: ifnull +7 -> 252
        //   248: aload_1
        //   249: invokevirtual 155	android/os/ParcelFileDescriptor:close	()V
        //   252: aload_3
        //   253: aload_0
        //   254: getfield 35	androidx/print/PrintHelper$1:val$bitmap	Landroid/graphics/Bitmap;
        //   257: if_acmpeq +7 -> 264
        //   260: aload_3
        //   261: invokevirtual 158	android/graphics/Bitmap:recycle	()V
        //   264: aconst_null
        //   265: areturn
        //   266: new 160	java/io/FileOutputStream
        //   269: astore_1
        //   270: aload_1
        //   271: aload_0
        //   272: getfield 41	androidx/print/PrintHelper$1:val$fileDescriptor	Landroid/os/ParcelFileDescriptor;
        //   275: invokevirtual 164	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
        //   278: invokespecial 167	java/io/FileOutputStream:<init>	(Ljava/io/FileDescriptor;)V
        //   281: aload 4
        //   283: aload_1
        //   284: invokevirtual 171	android/print/pdf/PrintedPdfDocument:writeTo	(Ljava/io/OutputStream;)V
        //   287: aload 4
        //   289: invokevirtual 113	android/print/pdf/PrintedPdfDocument:close	()V
        //   292: aload_0
        //   293: getfield 41	androidx/print/PrintHelper$1:val$fileDescriptor	Landroid/os/ParcelFileDescriptor;
        //   296: astore_1
        //   297: aload_1
        //   298: ifnull +7 -> 305
        //   301: aload_1
        //   302: invokevirtual 155	android/os/ParcelFileDescriptor:close	()V
        //   305: aload_3
        //   306: aload_0
        //   307: getfield 35	androidx/print/PrintHelper$1:val$bitmap	Landroid/graphics/Bitmap;
        //   310: if_acmpeq +7 -> 317
        //   313: aload_3
        //   314: invokevirtual 158	android/graphics/Bitmap:recycle	()V
        //   317: aconst_null
        //   318: areturn
        //   319: astore_1
        //   320: aload 4
        //   322: invokevirtual 113	android/print/pdf/PrintedPdfDocument:close	()V
        //   325: aload_0
        //   326: getfield 41	androidx/print/PrintHelper$1:val$fileDescriptor	Landroid/os/ParcelFileDescriptor;
        //   329: astore 4
        //   331: aload 4
        //   333: ifnull +8 -> 341
        //   336: aload 4
        //   338: invokevirtual 155	android/os/ParcelFileDescriptor:close	()V
        //   341: aload_3
        //   342: aload_0
        //   343: getfield 35	androidx/print/PrintHelper$1:val$bitmap	Landroid/graphics/Bitmap;
        //   346: if_acmpeq +7 -> 353
        //   349: aload_3
        //   350: invokevirtual 158	android/graphics/Bitmap:recycle	()V
        //   353: aload_1
        //   354: athrow
        //   355: astore_1
        //   356: aload_1
        //   357: areturn
        //   358: astore_1
        //   359: goto -107 -> 252
        //   362: astore_1
        //   363: goto -58 -> 305
        //   366: astore 4
        //   368: goto -27 -> 341
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	371	0	this	1
        //   0	371	1	paramAnonymousVarArgs	Void[]
        //   55	176	2	bool	boolean
        //   47	303	3	localBitmap	Bitmap
        //   15	322	4	localObject1	Object
        //   366	1	4	localIOException	java.io.IOException
        //   68	150	5	localPage1	android.graphics.pdf.PdfDocument.Page
        //   98	112	6	localObject2	Object
        //   122	21	7	localPage2	android.graphics.pdf.PdfDocument.Page
        // Exception table:
        //   from	to	target	type
        //   62	92	319	finally
        //   95	152	319	finally
        //   152	176	319	finally
        //   179	203	319	finally
        //   203	230	319	finally
        //   266	287	319	finally
        //   0	10	355	finally
        //   12	56	355	finally
        //   234	244	355	finally
        //   248	252	355	finally
        //   252	264	355	finally
        //   287	297	355	finally
        //   301	305	355	finally
        //   305	317	355	finally
        //   320	331	355	finally
        //   336	341	355	finally
        //   341	353	355	finally
        //   353	355	355	finally
        //   248	252	358	java/io/IOException
        //   301	305	362	java/io/IOException
        //   336	341	366	java/io/IOException
      }
      
      protected void onPostExecute(Throwable paramAnonymousThrowable)
      {
        if (paramCancellationSignal.isCanceled())
        {
          paramWriteResultCallback.onWriteCancelled();
        }
        else if (paramAnonymousThrowable == null)
        {
          paramWriteResultCallback.onWriteFinished(new PageRange[] { PageRange.ALL_PAGES });
        }
        else
        {
          Log.e("PrintHelper", "Error writing printed content", paramAnonymousThrowable);
          paramWriteResultCallback.onWriteFailed(null);
        }
      }
    }.execute(new Void[0]);
  }
  
  public static abstract interface OnPrintFinishCallback
  {
    public abstract void onFinish();
  }
  
  private class PrintBitmapAdapter
    extends PrintDocumentAdapter
  {
    private PrintAttributes mAttributes;
    private final Bitmap mBitmap;
    private final PrintHelper.OnPrintFinishCallback mCallback;
    private final int mFittingMode;
    private final String mJobName;
    
    PrintBitmapAdapter(String paramString, int paramInt, Bitmap paramBitmap, PrintHelper.OnPrintFinishCallback paramOnPrintFinishCallback)
    {
      this.mJobName = paramString;
      this.mFittingMode = paramInt;
      this.mBitmap = paramBitmap;
      this.mCallback = paramOnPrintFinishCallback;
    }
    
    public void onFinish()
    {
      PrintHelper.OnPrintFinishCallback localOnPrintFinishCallback = this.mCallback;
      if (localOnPrintFinishCallback != null) {
        localOnPrintFinishCallback.onFinish();
      }
    }
    
    public void onLayout(PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback, Bundle paramBundle)
    {
      this.mAttributes = paramPrintAttributes2;
      paramLayoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.mJobName).setContentType(1).setPageCount(1).build(), paramPrintAttributes2.equals(paramPrintAttributes1) ^ true);
    }
    
    public void onWrite(PageRange[] paramArrayOfPageRange, ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
    {
      PrintHelper.this.writeBitmap(this.mAttributes, this.mFittingMode, this.mBitmap, paramParcelFileDescriptor, paramCancellationSignal, paramWriteResultCallback);
    }
  }
  
  private class PrintUriAdapter
    extends PrintDocumentAdapter
  {
    PrintAttributes mAttributes;
    Bitmap mBitmap;
    final PrintHelper.OnPrintFinishCallback mCallback;
    final int mFittingMode;
    final Uri mImageFile;
    final String mJobName;
    AsyncTask<Uri, Boolean, Bitmap> mLoadBitmap;
    
    PrintUriAdapter(String paramString, Uri paramUri, PrintHelper.OnPrintFinishCallback paramOnPrintFinishCallback, int paramInt)
    {
      this.mJobName = paramString;
      this.mImageFile = paramUri;
      this.mCallback = paramOnPrintFinishCallback;
      this.mFittingMode = paramInt;
      this.mBitmap = null;
    }
    
    void cancelLoad()
    {
      synchronized (PrintHelper.this.mLock)
      {
        if (PrintHelper.this.mDecodeOptions != null)
        {
          if (Build.VERSION.SDK_INT < 24) {
            PrintHelper.this.mDecodeOptions.requestCancelDecode();
          }
          PrintHelper.this.mDecodeOptions = null;
        }
        return;
      }
    }
    
    public void onFinish()
    {
      super.onFinish();
      cancelLoad();
      Object localObject = this.mLoadBitmap;
      if (localObject != null) {
        ((AsyncTask)localObject).cancel(true);
      }
      localObject = this.mCallback;
      if (localObject != null) {
        ((PrintHelper.OnPrintFinishCallback)localObject).onFinish();
      }
      localObject = this.mBitmap;
      if (localObject != null)
      {
        ((Bitmap)localObject).recycle();
        this.mBitmap = null;
      }
    }
    
    public void onLayout(final PrintAttributes paramPrintAttributes1, final PrintAttributes paramPrintAttributes2, final CancellationSignal paramCancellationSignal, final PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback, Bundle paramBundle)
    {
      try
      {
        this.mAttributes = paramPrintAttributes2;
        if (paramCancellationSignal.isCanceled())
        {
          paramLayoutResultCallback.onLayoutCancelled();
          return;
        }
        if (this.mBitmap != null)
        {
          paramLayoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.mJobName).setContentType(1).setPageCount(1).build(), paramPrintAttributes2.equals(paramPrintAttributes1) ^ true);
          return;
        }
        this.mLoadBitmap = new AsyncTask()
        {
          protected Bitmap doInBackground(Uri... paramAnonymousVarArgs)
          {
            try
            {
              paramAnonymousVarArgs = PrintHelper.this.loadConstrainedBitmap(PrintHelper.PrintUriAdapter.this.mImageFile);
              return paramAnonymousVarArgs;
            }
            catch (FileNotFoundException paramAnonymousVarArgs) {}
            return null;
          }
          
          protected void onCancelled(Bitmap paramAnonymousBitmap)
          {
            paramLayoutResultCallback.onLayoutCancelled();
            PrintHelper.PrintUriAdapter.this.mLoadBitmap = null;
          }
          
          protected void onPostExecute(Bitmap paramAnonymousBitmap)
          {
            super.onPostExecute(paramAnonymousBitmap);
            Object localObject = paramAnonymousBitmap;
            if (paramAnonymousBitmap != null) {
              if (PrintHelper.PRINT_ACTIVITY_RESPECTS_ORIENTATION)
              {
                localObject = paramAnonymousBitmap;
                if (PrintHelper.this.mOrientation != 0) {}
              }
              else
              {
                try
                {
                  PrintAttributes.MediaSize localMediaSize = PrintHelper.PrintUriAdapter.this.mAttributes.getMediaSize();
                  localObject = paramAnonymousBitmap;
                  if (localMediaSize != null)
                  {
                    localObject = paramAnonymousBitmap;
                    if (localMediaSize.isPortrait() != PrintHelper.isPortrait(paramAnonymousBitmap))
                    {
                      localObject = new Matrix();
                      ((Matrix)localObject).postRotate(90.0F);
                      localObject = Bitmap.createBitmap(paramAnonymousBitmap, 0, 0, paramAnonymousBitmap.getWidth(), paramAnonymousBitmap.getHeight(), (Matrix)localObject, true);
                    }
                  }
                }
                finally {}
              }
            }
            PrintHelper.PrintUriAdapter.this.mBitmap = ((Bitmap)localObject);
            if (localObject != null)
            {
              paramAnonymousBitmap = new PrintDocumentInfo.Builder(PrintHelper.PrintUriAdapter.this.mJobName).setContentType(1).setPageCount(1).build();
              boolean bool = paramPrintAttributes2.equals(paramPrintAttributes1);
              paramLayoutResultCallback.onLayoutFinished(paramAnonymousBitmap, true ^ bool);
            }
            else
            {
              paramLayoutResultCallback.onLayoutFailed(null);
            }
            PrintHelper.PrintUriAdapter.this.mLoadBitmap = null;
          }
          
          protected void onPreExecute()
          {
            paramCancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener()
            {
              public void onCancel()
              {
                PrintHelper.PrintUriAdapter.this.cancelLoad();
                PrintHelper.PrintUriAdapter.1.this.cancel(false);
              }
            });
          }
        }.execute(new Uri[0]);
        return;
      }
      finally {}
    }
    
    public void onWrite(PageRange[] paramArrayOfPageRange, ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
    {
      PrintHelper.this.writeBitmap(this.mAttributes, this.mFittingMode, this.mBitmap, paramParcelFileDescriptor, paramCancellationSignal, paramWriteResultCallback);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\print\PrintHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */