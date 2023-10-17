package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

public final class zzflz
  extends zzflx
{
  private static zzflz zzc;
  
  private zzflz(Context paramContext)
  {
    super(paramContext, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
  }
  
  public static final zzflz zzj(Context paramContext)
  {
    try
    {
      if (zzc == null)
      {
        zzflz localzzflz = new com/google/android/gms/internal/ads/zzflz;
        localzzflz.<init>(paramContext);
        zzc = localzzflz;
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
      zzflw localzzflw = zzb(null, null, paramLong, paramBoolean);
      return localzzflw;
    }
    finally {}
  }
  
  public final zzflw zzi(String paramString1, String paramString2, long paramLong, boolean paramBoolean)
    throws IOException
  {
    try
    {
      paramString1 = zzb(paramString1, paramString2, paramLong, paramBoolean);
      return paramString1;
    }
    finally {}
  }
  
  public final void zzk()
    throws IOException
  {
    try
    {
      zzf(false);
      return;
    }
    finally {}
  }
  
  public final void zzl()
    throws IOException
  {
    try
    {
      zzf(true);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzflz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */