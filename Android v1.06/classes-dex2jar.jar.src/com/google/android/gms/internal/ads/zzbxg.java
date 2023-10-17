package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

public final class zzbxg
  implements zzaty
{
  private final Context zza;
  private final Object zzb;
  private final String zzc;
  private boolean zzd;
  
  public zzbxg(Context paramContext, String paramString)
  {
    Context localContext = paramContext;
    if (paramContext.getApplicationContext() != null) {
      localContext = paramContext.getApplicationContext();
    }
    this.zza = localContext;
    this.zzc = paramString;
    this.zzd = false;
    this.zzb = new Object();
  }
  
  public final String zza()
  {
    return this.zzc;
  }
  
  public final void zzb(boolean paramBoolean)
  {
    if (!zzt.zzn().zzu(this.zza)) {
      return;
    }
    synchronized (this.zzb)
    {
      if (this.zzd == paramBoolean) {
        return;
      }
      this.zzd = paramBoolean;
      if (TextUtils.isEmpty(this.zzc)) {
        return;
      }
      if (this.zzd) {
        zzt.zzn().zzh(this.zza, this.zzc);
      } else {
        zzt.zzn().zzi(this.zza, this.zzc);
      }
      return;
    }
  }
  
  public final void zzc(zzatx paramzzatx)
  {
    zzb(paramzzatx.zzj);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbxg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */