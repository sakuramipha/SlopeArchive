package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.InputStream;

public final class zzawg
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzawg> CREATOR = new zzawh();
  private ParcelFileDescriptor zza;
  private final boolean zzb;
  private final boolean zzc;
  private final long zzd;
  private final boolean zze;
  
  public zzawg()
  {
    this(null, false, false, 0L, false);
  }
  
  public zzawg(ParcelFileDescriptor paramParcelFileDescriptor, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3)
  {
    this.zza = paramParcelFileDescriptor;
    this.zzb = paramBoolean1;
    this.zzc = paramBoolean2;
    this.zzd = paramLong;
    this.zze = paramBoolean3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, zzb(), paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, zzd());
    SafeParcelWriter.writeBoolean(paramParcel, 4, zzf());
    SafeParcelWriter.writeLong(paramParcel, 5, zza());
    SafeParcelWriter.writeBoolean(paramParcel, 6, zzg());
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final long zza()
  {
    try
    {
      long l = this.zzd;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final ParcelFileDescriptor zzb()
  {
    try
    {
      ParcelFileDescriptor localParcelFileDescriptor = this.zza;
      return localParcelFileDescriptor;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final InputStream zzc()
  {
    try
    {
      Object localObject1 = this.zza;
      if (localObject1 == null) {
        return null;
      }
      localObject1 = new android/os/ParcelFileDescriptor$AutoCloseInputStream;
      ((ParcelFileDescriptor.AutoCloseInputStream)localObject1).<init>(this.zza);
      this.zza = null;
      return (InputStream)localObject1;
    }
    finally {}
  }
  
  public final boolean zzd()
  {
    try
    {
      boolean bool = this.zzb;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean zze()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 31	com/google/android/gms/internal/ads/zzawg:zza	Landroid/os/ParcelFileDescriptor;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	zzawg
    //   12	7	1	bool	boolean
    //   6	2	2	localParcelFileDescriptor	ParcelFileDescriptor
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final boolean zzf()
  {
    try
    {
      boolean bool = this.zzc;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzg()
  {
    try
    {
      boolean bool = this.zze;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */