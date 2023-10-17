package com.google.android.gms.internal.ads;

public final class zzbme
  extends zzcas
{
  private final Object zza = new Object();
  private final zzbmj zzb;
  private boolean zzc;
  
  public zzbme(zzbmj paramzzbmj)
  {
    this.zzb = paramzzbmj;
  }
  
  public final void zzb()
  {
    synchronized (this.zza)
    {
      if (this.zzc) {
        return;
      }
      this.zzc = true;
      Object localObject4 = new com/google/android/gms/internal/ads/zzbmb;
      ((zzbmb)localObject4).<init>(this);
      Object localObject2 = new com/google/android/gms/internal/ads/zzcao;
      ((zzcao)localObject2).<init>();
      zzi((zzcap)localObject4, (zzcan)localObject2);
      localObject2 = new com/google/android/gms/internal/ads/zzbmc;
      ((zzbmc)localObject2).<init>(this);
      localObject4 = new com/google/android/gms/internal/ads/zzbmd;
      ((zzbmd)localObject4).<init>(this);
      zzi((zzcap)localObject2, (zzcan)localObject4);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbme.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */