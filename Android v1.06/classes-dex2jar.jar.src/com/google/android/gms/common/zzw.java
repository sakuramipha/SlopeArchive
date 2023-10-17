package com.google.android.gms.common;

import android.util.Log;
import javax.annotation.Nullable;

class zzw
{
  private static final zzw zzd = new zzw(true, null, null);
  final boolean zza;
  @Nullable
  final String zzb;
  @Nullable
  final Throwable zzc;
  
  zzw(boolean paramBoolean, @Nullable String paramString, @Nullable Throwable paramThrowable)
  {
    this.zza = paramBoolean;
    this.zzb = paramString;
    this.zzc = paramThrowable;
  }
  
  static zzw zzb()
  {
    return zzd;
  }
  
  static zzw zzc(String paramString)
  {
    return new zzw(false, paramString, null);
  }
  
  static zzw zzd(String paramString, Throwable paramThrowable)
  {
    return new zzw(false, paramString, paramThrowable);
  }
  
  @Nullable
  String zza()
  {
    return this.zzb;
  }
  
  final void zze()
  {
    if ((!this.zza) && (Log.isLoggable("GoogleCertificatesRslt", 3)))
    {
      if (this.zzc != null)
      {
        Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        return;
      }
      Log.d("GoogleCertificatesRslt", zza());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */