package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbmj
  extends zzcas
{
  private final Object zza = new Object();
  private final zzbb zzb;
  private boolean zzc;
  private int zzd;
  
  public zzbmj(zzbb paramzzbb)
  {
    this.zzb = paramzzbb;
    this.zzc = false;
    this.zzd = 0;
  }
  
  public final zzbme zza()
  {
    zzbme localzzbme = new zzbme(this);
    synchronized (this.zza)
    {
      zzbmf localzzbmf = new com/google/android/gms/internal/ads/zzbmf;
      localzzbmf.<init>(this, localzzbme);
      zzbmg localzzbmg = new com/google/android/gms/internal/ads/zzbmg;
      localzzbmg.<init>(this, localzzbme);
      zzi(localzzbmf, localzzbmg);
      boolean bool;
      if (this.zzd >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      this.zzd += 1;
      return localzzbme;
    }
  }
  
  public final void zzb()
  {
    synchronized (this.zza)
    {
      boolean bool;
      if (this.zzd >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
      this.zzc = true;
      zzc();
      return;
    }
  }
  
  protected final void zzc()
  {
    synchronized (this.zza)
    {
      boolean bool;
      if (this.zzd >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      if ((this.zzc) && (this.zzd == 0))
      {
        zze.zza("No reference is left (including root). Cleaning up engine.");
        zzbmi localzzbmi = new com/google/android/gms/internal/ads/zzbmi;
        localzzbmi.<init>(this);
        zzcao localzzcao = new com/google/android/gms/internal/ads/zzcao;
        localzzcao.<init>();
        zzi(localzzbmi, localzzcao);
      }
      else
      {
        zze.zza("There are still references to the engine. Not destroying.");
      }
      return;
    }
  }
  
  protected final void zzd()
  {
    synchronized (this.zza)
    {
      boolean bool;
      if (this.zzd > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      zze.zza("Releasing 1 reference for JS Engine");
      this.zzd -= 1;
      zzc();
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */