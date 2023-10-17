package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class BitmapTeleporter
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();
  final int zaa;
  ParcelFileDescriptor zab;
  final int zac;
  private Bitmap zad;
  private boolean zae;
  private File zaf;
  
  BitmapTeleporter(int paramInt1, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt2)
  {
    this.zaa = paramInt1;
    this.zab = paramParcelFileDescriptor;
    this.zac = paramInt2;
    this.zad = null;
    this.zae = false;
  }
  
  public BitmapTeleporter(Bitmap paramBitmap)
  {
    this.zaa = 1;
    this.zab = null;
    this.zac = 0;
    this.zad = paramBitmap;
    this.zae = true;
  }
  
  private static final void zaa(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      Log.w("BitmapTeleporter", "Could not close stream", paramCloseable);
    }
  }
  
  /* Error */
  public Bitmap get()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 42	com/google/android/gms/common/data/BitmapTeleporter:zae	Z
    //   4: ifne +132 -> 136
    //   7: new 65	java/io/DataInputStream
    //   10: dup
    //   11: new 67	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   14: dup
    //   15: aload_0
    //   16: getfield 36	com/google/android/gms/common/data/BitmapTeleporter:zab	Landroid/os/ParcelFileDescriptor;
    //   19: invokestatic 73	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast 75	android/os/ParcelFileDescriptor
    //   25: invokespecial 78	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   28: invokespecial 81	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   31: astore_3
    //   32: aload_3
    //   33: invokevirtual 85	java/io/DataInputStream:readInt	()I
    //   36: newarray <illegal type>
    //   38: astore 5
    //   40: aload_3
    //   41: invokevirtual 85	java/io/DataInputStream:readInt	()I
    //   44: istore_1
    //   45: aload_3
    //   46: invokevirtual 85	java/io/DataInputStream:readInt	()I
    //   49: istore_2
    //   50: aload_3
    //   51: invokevirtual 89	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   54: invokestatic 95	android/graphics/Bitmap$Config:valueOf	(Ljava/lang/String;)Landroid/graphics/Bitmap$Config;
    //   57: astore 4
    //   59: aload_3
    //   60: aload 5
    //   62: invokevirtual 99	java/io/DataInputStream:read	([B)I
    //   65: pop
    //   66: aload_3
    //   67: invokestatic 101	com/google/android/gms/common/data/BitmapTeleporter:zaa	(Ljava/io/Closeable;)V
    //   70: aload 5
    //   72: invokestatic 107	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   75: astore_3
    //   76: iload_1
    //   77: iload_2
    //   78: aload 4
    //   80: invokestatic 113	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   83: astore 4
    //   85: aload 4
    //   87: aload_3
    //   88: invokevirtual 117	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
    //   91: aload_0
    //   92: aload 4
    //   94: putfield 40	com/google/android/gms/common/data/BitmapTeleporter:zad	Landroid/graphics/Bitmap;
    //   97: aload_0
    //   98: iconst_1
    //   99: putfield 42	com/google/android/gms/common/data/BitmapTeleporter:zae	Z
    //   102: goto +34 -> 136
    //   105: astore 4
    //   107: goto +22 -> 129
    //   110: astore 4
    //   112: new 119	java/lang/IllegalStateException
    //   115: astore 5
    //   117: aload 5
    //   119: ldc 121
    //   121: aload 4
    //   123: invokespecial 124	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   126: aload 5
    //   128: athrow
    //   129: aload_3
    //   130: invokestatic 101	com/google/android/gms/common/data/BitmapTeleporter:zaa	(Ljava/io/Closeable;)V
    //   133: aload 4
    //   135: athrow
    //   136: aload_0
    //   137: getfield 40	com/google/android/gms/common/data/BitmapTeleporter:zad	Landroid/graphics/Bitmap;
    //   140: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	BitmapTeleporter
    //   44	33	1	i	int
    //   49	29	2	j	int
    //   31	99	3	localObject1	Object
    //   57	36	4	localObject2	Object
    //   105	1	4	localObject3	Object
    //   110	24	4	localIOException	IOException
    //   38	89	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   32	66	105	finally
    //   112	129	105	finally
    //   32	66	110	java/io/IOException
  }
  
  public void release()
  {
    if (!this.zae) {
      try
      {
        ((ParcelFileDescriptor)Preconditions.checkNotNull(this.zab)).close();
        return;
      }
      catch (IOException localIOException)
      {
        Log.w("BitmapTeleporter", "Could not close PFD", localIOException);
      }
    }
  }
  
  public void setTempDir(File paramFile)
  {
    Objects.requireNonNull(paramFile, "Cannot set null temp directory");
    this.zaf = paramFile;
  }
  
  /* Error */
  public final void writeToParcel(android.os.Parcel paramParcel, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	com/google/android/gms/common/data/BitmapTeleporter:zab	Landroid/os/ParcelFileDescriptor;
    //   4: ifnonnull +230 -> 234
    //   7: aload_0
    //   8: getfield 40	com/google/android/gms/common/data/BitmapTeleporter:zad	Landroid/graphics/Bitmap;
    //   11: invokestatic 73	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast 109	android/graphics/Bitmap
    //   17: astore 4
    //   19: aload 4
    //   21: invokevirtual 147	android/graphics/Bitmap:getRowBytes	()I
    //   24: aload 4
    //   26: invokevirtual 150	android/graphics/Bitmap:getHeight	()I
    //   29: imul
    //   30: invokestatic 154	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   33: astore 5
    //   35: aload 4
    //   37: aload 5
    //   39: invokevirtual 157	android/graphics/Bitmap:copyPixelsToBuffer	(Ljava/nio/Buffer;)V
    //   42: aload 5
    //   44: invokevirtual 161	java/nio/ByteBuffer:array	()[B
    //   47: astore 5
    //   49: aload_0
    //   50: getfield 140	com/google/android/gms/common/data/BitmapTeleporter:zaf	Ljava/io/File;
    //   53: astore 6
    //   55: aload 6
    //   57: ifnull +167 -> 224
    //   60: ldc -93
    //   62: ldc -91
    //   64: aload 6
    //   66: invokestatic 171	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   69: astore 7
    //   71: new 173	java/io/FileOutputStream
    //   74: astore 6
    //   76: aload 6
    //   78: aload 7
    //   80: invokespecial 175	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   83: aload_0
    //   84: aload 7
    //   86: ldc -80
    //   88: invokestatic 180	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   91: putfield 36	com/google/android/gms/common/data/BitmapTeleporter:zab	Landroid/os/ParcelFileDescriptor;
    //   94: aload 7
    //   96: invokevirtual 184	java/io/File:delete	()Z
    //   99: pop
    //   100: new 186	java/io/DataOutputStream
    //   103: dup
    //   104: new 188	java/io/BufferedOutputStream
    //   107: dup
    //   108: aload 6
    //   110: invokespecial 191	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   113: invokespecial 192	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   116: astore 6
    //   118: aload 6
    //   120: aload 5
    //   122: arraylength
    //   123: invokevirtual 196	java/io/DataOutputStream:writeInt	(I)V
    //   126: aload 6
    //   128: aload 4
    //   130: invokevirtual 199	android/graphics/Bitmap:getWidth	()I
    //   133: invokevirtual 196	java/io/DataOutputStream:writeInt	(I)V
    //   136: aload 6
    //   138: aload 4
    //   140: invokevirtual 150	android/graphics/Bitmap:getHeight	()I
    //   143: invokevirtual 196	java/io/DataOutputStream:writeInt	(I)V
    //   146: aload 6
    //   148: aload 4
    //   150: invokevirtual 203	android/graphics/Bitmap:getConfig	()Landroid/graphics/Bitmap$Config;
    //   153: invokevirtual 206	android/graphics/Bitmap$Config:toString	()Ljava/lang/String;
    //   156: invokevirtual 210	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   159: aload 6
    //   161: aload 5
    //   163: invokevirtual 214	java/io/DataOutputStream:write	([B)V
    //   166: aload 6
    //   168: invokestatic 101	com/google/android/gms/common/data/BitmapTeleporter:zaa	(Ljava/io/Closeable;)V
    //   171: goto +63 -> 234
    //   174: astore_1
    //   175: goto +19 -> 194
    //   178: astore 4
    //   180: new 119	java/lang/IllegalStateException
    //   183: astore_1
    //   184: aload_1
    //   185: ldc -40
    //   187: aload 4
    //   189: invokespecial 124	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   192: aload_1
    //   193: athrow
    //   194: aload 6
    //   196: invokestatic 101	com/google/android/gms/common/data/BitmapTeleporter:zaa	(Ljava/io/Closeable;)V
    //   199: aload_1
    //   200: athrow
    //   201: astore_1
    //   202: new 119	java/lang/IllegalStateException
    //   205: dup
    //   206: ldc -38
    //   208: invokespecial 220	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   211: athrow
    //   212: astore_1
    //   213: new 119	java/lang/IllegalStateException
    //   216: dup
    //   217: ldc -34
    //   219: aload_1
    //   220: invokespecial 124	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   223: athrow
    //   224: new 119	java/lang/IllegalStateException
    //   227: dup
    //   228: ldc -32
    //   230: invokespecial 220	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   233: athrow
    //   234: aload_1
    //   235: invokestatic 230	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:beginObjectHeader	(Landroid/os/Parcel;)I
    //   238: istore_3
    //   239: aload_1
    //   240: iconst_1
    //   241: aload_0
    //   242: getfield 34	com/google/android/gms/common/data/BitmapTeleporter:zaa	I
    //   245: invokestatic 233	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:writeInt	(Landroid/os/Parcel;II)V
    //   248: aload_1
    //   249: iconst_2
    //   250: aload_0
    //   251: getfield 36	com/google/android/gms/common/data/BitmapTeleporter:zab	Landroid/os/ParcelFileDescriptor;
    //   254: iload_2
    //   255: iconst_1
    //   256: ior
    //   257: iconst_0
    //   258: invokestatic 237	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:writeParcelable	(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //   261: aload_1
    //   262: iconst_3
    //   263: aload_0
    //   264: getfield 38	com/google/android/gms/common/data/BitmapTeleporter:zac	I
    //   267: invokestatic 233	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:writeInt	(Landroid/os/Parcel;II)V
    //   270: aload_1
    //   271: iload_3
    //   272: invokestatic 240	com/google/android/gms/common/internal/safeparcel/SafeParcelWriter:finishObjectHeader	(Landroid/os/Parcel;I)V
    //   275: aload_0
    //   276: aconst_null
    //   277: putfield 36	com/google/android/gms/common/data/BitmapTeleporter:zab	Landroid/os/ParcelFileDescriptor;
    //   280: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	281	0	this	BitmapTeleporter
    //   0	281	1	paramParcel	android.os.Parcel
    //   0	281	2	paramInt	int
    //   238	34	3	i	int
    //   17	132	4	localBitmap	Bitmap
    //   178	10	4	localIOException	IOException
    //   33	129	5	localObject1	Object
    //   53	142	6	localObject2	Object
    //   69	26	7	localFile	File
    // Exception table:
    //   from	to	target	type
    //   118	166	174	finally
    //   180	194	174	finally
    //   118	166	178	java/io/IOException
    //   71	94	201	java/io/FileNotFoundException
    //   60	71	212	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\data\BitmapTeleporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */