package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzaaa
{
  protected final zzzu zza;
  protected final zzzz zzb;
  protected zzzw zzc;
  private final int zzd;
  
  protected zzaaa(zzzx paramzzzx, zzzz paramzzzz, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt)
  {
    this.zzb = paramzzzz;
    this.zzd = paramInt;
    this.zza = new zzzu(paramzzzx, paramLong1, 0L, paramLong3, paramLong4, paramLong5, paramLong6);
  }
  
  protected static final int zzf(zzaap paramzzaap, long paramLong, zzabk paramzzabk)
  {
    if (paramLong == paramzzaap.zzf()) {
      return 0;
    }
    paramzzabk.zza = paramLong;
    return 1;
  }
  
  protected static final boolean zzg(zzaap paramzzaap, long paramLong)
    throws IOException
  {
    paramLong -= paramzzaap.zzf();
    if ((paramLong >= 0L) && (paramLong <= 262144L))
    {
      int i = (int)paramLong;
      ((zzaae)paramzzaap).zzo(i, false);
      return true;
    }
    return false;
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    long l3;
    for (;;)
    {
      zzzw localzzzw = this.zzc;
      zzdy.zzb(localzzzw);
      long l1 = zzzw.zzb(localzzzw);
      long l2 = zzzw.zza(localzzzw);
      l3 = zzzw.zzc(localzzzw);
      if (l2 - l1 <= this.zzd)
      {
        zzc(false, l1);
        return zzf(paramzzaap, l1, paramzzabk);
      }
      if (!zzg(paramzzaap, l3)) {
        return zzf(paramzzaap, l3, paramzzabk);
      }
      paramzzaap.zzj();
      zzzy localzzzy = this.zzb.zza(paramzzaap, zzzw.zze(localzzzw));
      int i = zzzy.zza(localzzzy);
      if (i == -3) {
        break;
      }
      if (i != -2)
      {
        if (i != -1)
        {
          zzg(paramzzaap, zzzy.zzb(localzzzy));
          zzc(true, zzzy.zzb(localzzzy));
          return zzf(paramzzaap, zzzy.zzb(localzzzy), paramzzabk);
        }
        zzzw.zzg(localzzzw, zzzy.zzc(localzzzy), zzzy.zzb(localzzzy));
      }
      else
      {
        zzzw.zzh(localzzzw, zzzy.zzc(localzzzy), zzzy.zzb(localzzzy));
      }
    }
    zzc(false, l3);
    return zzf(paramzzaap, l3, paramzzabk);
  }
  
  public final zzabn zzb()
  {
    return this.zza;
  }
  
  protected final void zzc(boolean paramBoolean, long paramLong)
  {
    this.zzc = null;
    this.zzb.zzb();
  }
  
  public final void zzd(long paramLong)
  {
    Object localObject = this.zzc;
    if ((localObject != null) && (zzzw.zzd((zzzw)localObject) == paramLong)) {
      return;
    }
    long l = this.zza.zzf(paramLong);
    localObject = this.zza;
    this.zzc = new zzzw(paramLong, l, 0L, zzzu.zzc((zzzu)localObject), zzzu.zzd((zzzu)localObject), zzzu.zzb((zzzu)localObject), zzzu.zza((zzzu)localObject));
  }
  
  public final boolean zze()
  {
    return this.zzc != null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */