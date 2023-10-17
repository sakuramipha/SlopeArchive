package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.Objects;

public final class zzyx
{
  private final zzyg zza = new zzyg();
  private final zzyt zzb;
  private final zzyw zzc;
  private boolean zzd;
  private Surface zze;
  private float zzf;
  private float zzg;
  private float zzh;
  private float zzi;
  private int zzj;
  private long zzk;
  private long zzl;
  private long zzm;
  private long zzn;
  private long zzo;
  private long zzp;
  private long zzq;
  
  public zzyx(Context paramContext)
  {
    zzyw localzzyw = null;
    if (paramContext != null)
    {
      Context localContext = paramContext.getApplicationContext();
      int i = zzfn.zza;
      zzyt localzzyt = zzyv.zzc(localContext);
      paramContext = localzzyt;
      if (localzzyt == null) {
        paramContext = zzyu.zzc(localContext);
      }
    }
    else
    {
      paramContext = null;
    }
    this.zzb = paramContext;
    if (paramContext != null) {
      localzzyw = zzyw.zza();
    }
    this.zzc = localzzyw;
    this.zzk = -9223372036854775807L;
    this.zzl = -9223372036854775807L;
    this.zzf = -1.0F;
    this.zzi = 1.0F;
    this.zzj = 0;
  }
  
  private final void zzk()
  {
    if (zzfn.zza >= 30)
    {
      Surface localSurface = this.zze;
      if ((localSurface != null) && (this.zzj != Integer.MIN_VALUE) && (this.zzh != 0.0F))
      {
        this.zzh = 0.0F;
        zzys.zza(localSurface, 0.0F);
      }
    }
  }
  
  private final void zzl()
  {
    this.zzm = 0L;
    this.zzp = -1L;
    this.zzn = -1L;
  }
  
  private final void zzm()
  {
    if ((zzfn.zza >= 30) && (this.zze != null))
    {
      float f1;
      if (this.zza.zzg()) {
        f1 = this.zza.zza();
      } else {
        f1 = this.zzf;
      }
      float f2 = this.zzg;
      if (f1 == f2) {
        return;
      }
      int i = 1;
      boolean bool1 = f1 < -1.0F;
      if ((bool1) && (f2 != -1.0F))
      {
        boolean bool2 = this.zza.zzg();
        float f3 = 1.0F;
        f2 = f3;
        if (bool2)
        {
          f2 = f3;
          if (this.zza.zzd() >= 5000000000L) {
            f2 = 0.02F;
          }
        }
        if (Math.abs(f1 - this.zzg) >= f2) {
          break label154;
        }
      }
      else
      {
        if (bool1) {
          break label163;
        }
        if (this.zza.zzb() >= 30) {
          break label154;
        }
      }
      i = 0;
      label154:
      if (i == 0) {
        return;
      }
      label163:
      this.zzg = f1;
      zzn(false);
    }
  }
  
  private final void zzn(boolean paramBoolean)
  {
    if (zzfn.zza >= 30)
    {
      Surface localSurface = this.zze;
      if ((localSurface != null) && (this.zzj != Integer.MIN_VALUE))
      {
        boolean bool = this.zzd;
        float f2 = 0.0F;
        float f1 = f2;
        if (bool)
        {
          float f3 = this.zzg;
          f1 = f2;
          if (f3 != -1.0F) {
            f1 = this.zzi * f3;
          }
        }
        if ((!paramBoolean) && (this.zzh == f1)) {
          return;
        }
        this.zzh = f1;
        zzys.zza(localSurface, f1);
      }
    }
  }
  
  public final long zza(long paramLong)
  {
    long l2 = paramLong;
    long l1;
    long l3;
    if (this.zzp != -1L)
    {
      l2 = paramLong;
      if (this.zza.zzg())
      {
        long l4 = this.zza.zzc();
        l1 = this.zzq;
        l3 = this.zzm;
        l2 = this.zzp;
        float f = this.zzi;
        l2 = l1 + ((float)(l4 * (l3 - l2)) / f);
        if (Math.abs(paramLong - l2) > 20000000L)
        {
          zzl();
          l2 = paramLong;
        }
      }
    }
    this.zzn = this.zzm;
    this.zzo = l2;
    zzyw localzzyw = this.zzc;
    if ((localzzyw != null) && (this.zzk != -9223372036854775807L))
    {
      l1 = localzzyw.zza;
      if (l1 == -9223372036854775807L) {
        return l2;
      }
      paramLong = this.zzk;
      l1 += (l2 - l1) / paramLong * paramLong;
      if (l2 <= l1)
      {
        paramLong = l1 - paramLong;
      }
      else
      {
        l3 = paramLong + l1;
        paramLong = l1;
        l1 = l3;
      }
      l3 = this.zzl;
      if (l1 - l2 < l2 - paramLong) {
        paramLong = l1;
      }
      return paramLong - l3;
    }
    return l2;
  }
  
  public final void zzc(float paramFloat)
  {
    this.zzf = paramFloat;
    this.zza.zzf();
    zzm();
  }
  
  public final void zzd(long paramLong)
  {
    long l = this.zzn;
    if (l != -1L)
    {
      this.zzp = l;
      this.zzq = this.zzo;
    }
    this.zzm += 1L;
    this.zza.zze(paramLong * 1000L);
    zzm();
  }
  
  public final void zze(float paramFloat)
  {
    this.zzi = paramFloat;
    zzl();
    zzn(false);
  }
  
  public final void zzf()
  {
    zzl();
  }
  
  public final void zzg()
  {
    this.zzd = true;
    zzl();
    if (this.zzb != null)
    {
      zzyw localzzyw = this.zzc;
      Objects.requireNonNull(localzzyw);
      localzzyw.zzb();
      this.zzb.zzb(new zzyr(this));
    }
    zzn(false);
  }
  
  public final void zzh()
  {
    this.zzd = false;
    Object localObject = this.zzb;
    if (localObject != null)
    {
      ((zzyt)localObject).zza();
      localObject = this.zzc;
      Objects.requireNonNull(localObject);
      ((zzyw)localObject).zzc();
    }
    zzk();
  }
  
  public final void zzi(Surface paramSurface)
  {
    Surface localSurface = paramSurface;
    if (true == paramSurface instanceof zzyp) {
      localSurface = null;
    }
    if (this.zze == localSurface) {
      return;
    }
    zzk();
    this.zze = localSurface;
    zzn(true);
  }
  
  public final void zzj(int paramInt)
  {
    if (this.zzj == paramInt) {
      return;
    }
    this.zzj = paramInt;
    zzn(true);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */