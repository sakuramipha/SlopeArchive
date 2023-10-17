package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

public final class zzbue
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbue> CREATOR = new zzbuf();
  ParcelFileDescriptor zza;
  private Parcelable zzb;
  private boolean zzc;
  
  public zzbue(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.zza = paramParcelFileDescriptor;
    this.zzb = null;
    this.zzc = true;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject1;
    if (this.zza == null) {
      localObject1 = Parcel.obtain();
    }
    int i;
    try
    {
      this.zzb.writeToParcel((Parcel)localObject1, 0);
      byte[] arrayOfByte = ((Parcel)localObject1).marshall();
      ((Parcel)localObject1).recycle();
      Object localObject2 = null;
      try
      {
        ParcelFileDescriptor[] arrayOfParcelFileDescriptor = ParcelFileDescriptor.createPipe();
        Object localObject3 = arrayOfParcelFileDescriptor[1];
        localObject1 = new android/os/ParcelFileDescriptor$AutoCloseOutputStream;
        ((ParcelFileDescriptor.AutoCloseOutputStream)localObject1).<init>((ParcelFileDescriptor)localObject3);
        try
        {
          zzfwc localzzfwc = zzcag.zza;
          localObject3 = new com/google/android/gms/internal/ads/zzbud;
          ((zzbud)localObject3).<init>((OutputStream)localObject1, arrayOfByte);
          localzzfwc.execute((Runnable)localObject3);
          localObject1 = arrayOfParcelFileDescriptor[0];
        }
        catch (IOException localIOException1) {}
        zzbzt.zzh("Error transporting the ad response", localIOException2);
      }
      catch (IOException localIOException2)
      {
        localObject1 = null;
      }
      zzt.zzo().zzu(localIOException2, "LargeParcelTeleporter.pipeData.2");
      IOUtils.closeQuietly((Closeable)localObject1);
      localObject1 = localObject2;
      this.zza = ((ParcelFileDescriptor)localObject1);
    }
    finally
    {
      ((Parcel)localObject1).recycle();
    }
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zza, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  /* Error */
  public final com.google.android.gms.common.internal.safeparcel.SafeParcelable zza(Parcelable.Creator paramCreator)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	com/google/android/gms/internal/ads/zzbue:zzc	Z
    //   4: ifeq +131 -> 135
    //   7: aload_0
    //   8: getfield 27	com/google/android/gms/internal/ads/zzbue:zza	Landroid/os/ParcelFileDescriptor;
    //   11: ifnonnull +10 -> 21
    //   14: ldc 122
    //   16: invokestatic 126	com/google/android/gms/internal/ads/zzbzt:zzg	(Ljava/lang/String;)V
    //   19: aconst_null
    //   20: areturn
    //   21: new 128	java/io/DataInputStream
    //   24: dup
    //   25: new 130	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   28: dup
    //   29: aload_0
    //   30: getfield 27	com/google/android/gms/internal/ads/zzbue:zza	Landroid/os/ParcelFileDescriptor;
    //   33: invokespecial 131	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   36: invokespecial 134	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   39: astore_3
    //   40: aload_3
    //   41: invokevirtual 138	java/io/DataInputStream:readInt	()I
    //   44: istore_2
    //   45: iload_2
    //   46: newarray <illegal type>
    //   48: astore 4
    //   50: aload_3
    //   51: aload 4
    //   53: iconst_0
    //   54: iload_2
    //   55: invokevirtual 142	java/io/DataInputStream:readFully	([BII)V
    //   58: aload_3
    //   59: invokestatic 106	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   62: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   65: astore_3
    //   66: aload_3
    //   67: aload 4
    //   69: iconst_0
    //   70: iload_2
    //   71: invokevirtual 145	android/os/Parcel:unmarshall	([BII)V
    //   74: aload_3
    //   75: iconst_0
    //   76: invokevirtual 149	android/os/Parcel:setDataPosition	(I)V
    //   79: aload_0
    //   80: aload_1
    //   81: aload_3
    //   82: invokeinterface 155 2 0
    //   87: checkcast 43	android/os/Parcelable
    //   90: putfield 29	com/google/android/gms/internal/ads/zzbue:zzb	Landroid/os/Parcelable;
    //   93: aload_3
    //   94: invokevirtual 52	android/os/Parcel:recycle	()V
    //   97: aload_0
    //   98: iconst_0
    //   99: putfield 31	com/google/android/gms/internal/ads/zzbue:zzc	Z
    //   102: goto +33 -> 135
    //   105: astore_1
    //   106: aload_3
    //   107: invokevirtual 52	android/os/Parcel:recycle	()V
    //   110: aload_1
    //   111: athrow
    //   112: astore_1
    //   113: goto +16 -> 129
    //   116: astore_1
    //   117: ldc -99
    //   119: aload_1
    //   120: invokestatic 86	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   123: aload_3
    //   124: invokestatic 106	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   127: aconst_null
    //   128: areturn
    //   129: aload_3
    //   130: invokestatic 106	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   133: aload_1
    //   134: athrow
    //   135: aload_0
    //   136: getfield 29	com/google/android/gms/internal/ads/zzbue:zzb	Landroid/os/Parcelable;
    //   139: checkcast 159	com/google/android/gms/common/internal/safeparcel/SafeParcelable
    //   142: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	zzbue
    //   0	143	1	paramCreator	Parcelable.Creator
    //   44	27	2	i	int
    //   39	91	3	localObject	Object
    //   48	20	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   66	93	105	finally
    //   40	58	112	finally
    //   117	123	112	finally
    //   40	58	116	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */