package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

public final class zzfma
  extends zzflx
{
  private static zzfma zzc;
  
  private zzfma(Context paramContext)
  {
    super(paramContext, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
  }
  
  public static final zzfma zzi(Context paramContext)
  {
    try
    {
      if (zzc == null)
      {
        zzfma localzzfma = new com/google/android/gms/internal/ads/zzfma;
        localzzfma.<init>(paramContext);
        zzc = localzzfma;
      }
      paramContext = zzc;
      return paramContext;
    }
    finally {}
  }
  
  public final zzflw zzh(long paramLong, boolean paramBoolean)
    throws IOException
  {
    try
    {
      if (!zzo())
      {
        localzzflw = new com/google/android/gms/internal/ads/zzflw;
        localzzflw.<init>();
        return localzzflw;
      }
      zzflw localzzflw = zzb(null, null, paramLong, paramBoolean);
      return localzzflw;
    }
    finally {}
  }
  
  public final void zzj()
    throws IOException
  {
    try
    {
      if (zzg(false)) {
        zzf(false);
      }
      return;
    }
    finally {}
  }
  
  public final void zzk()
    throws IOException
  {
    this.zzb.zze("paidv2_publisher_option");
  }
  
  public final void zzl()
    throws IOException
  {
    this.zzb.zze("paidv2_user_option");
  }
  
  public final void zzm(boolean paramBoolean)
    throws IOException
  {
    this.zzb.zzd("paidv2_user_option", Boolean.valueOf(paramBoolean));
  }
  
  public final void zzn(boolean paramBoolean)
    throws IOException
  {
    this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(paramBoolean));
    if (!paramBoolean) {
      zzj();
    }
  }
  
  public final boolean zzo()
  {
    return this.zzb.zzf("paidv2_publisher_option", true);
  }
  
  public final boolean zzp()
  {
    return this.zzb.zzf("paidv2_user_option", true);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */