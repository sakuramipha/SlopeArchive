package com.google.android.gms.internal.ads;

final class zzaky
  implements Runnable
{
  private final zzali zza;
  private final zzalo zzb;
  private final Runnable zzc;
  
  public zzaky(zzali paramzzali, zzalo paramzzalo, Runnable paramRunnable)
  {
    this.zza = paramzzali;
    this.zzb = paramzzalo;
    this.zzc = paramRunnable;
  }
  
  public final void run()
  {
    this.zza.zzw();
    Object localObject = this.zzb;
    if (((zzalo)localObject).zzc()) {
      this.zza.zzo(((zzalo)localObject).zza);
    } else {
      this.zza.zzn(((zzalo)localObject).zzc);
    }
    if (this.zzb.zzd) {
      this.zza.zzm("intermediate-response");
    } else {
      this.zza.zzp("done");
    }
    localObject = this.zzc;
    if (localObject != null) {
      ((Runnable)localObject).run();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */