package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class zzfrd
  extends zzfrg
{
  zzfrd()
  {
    super(null);
  }
  
  static final zzfrg zzf(int paramInt)
  {
    zzfrg localzzfrg;
    if (paramInt < 0) {
      localzzfrg = zzfrg.zzi();
    } else if (paramInt > 0) {
      localzzfrg = zzfrg.zzh();
    } else {
      localzzfrg = zzfrg.zzg();
    }
    return localzzfrg;
  }
  
  public final int zza()
  {
    return 0;
  }
  
  public final zzfrg zzb(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {
      paramInt1 = -1;
    } else if (paramInt1 > paramInt2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    return zzf(paramInt1);
  }
  
  public final zzfrg zzc(Object paramObject1, Object paramObject2, Comparator paramComparator)
  {
    return zzf(paramComparator.compare(paramObject1, paramObject2));
  }
  
  public final zzfrg zzd(boolean paramBoolean1, boolean paramBoolean2)
  {
    return zzf(zzfty.zza(paramBoolean1, paramBoolean2));
  }
  
  public final zzfrg zze(boolean paramBoolean1, boolean paramBoolean2)
  {
    return zzf(zzfty.zza(false, false));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */