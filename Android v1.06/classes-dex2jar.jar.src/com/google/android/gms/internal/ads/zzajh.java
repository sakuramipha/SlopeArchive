package com.google.android.gms.internal.ads;

public final class zzajh
  implements zzaju
{
  private final zzajg zza;
  private final zzfd zzb;
  private int zzc;
  private int zzd;
  private boolean zze;
  private boolean zzf;
  
  public zzajh(zzajg paramzzajg)
  {
    this.zza = paramzzajg;
    this.zzb = new zzfd(32);
  }
  
  public final void zza(zzfd paramzzfd, int paramInt)
  {
    int i = paramInt & 0x1;
    if (i != 0)
    {
      paramInt = paramzzfd.zzk();
      paramInt = paramzzfd.zzc() + paramInt;
    }
    else
    {
      paramInt = -1;
    }
    if (this.zzf)
    {
      if (i == 0) {
        return;
      }
      this.zzf = false;
      paramzzfd.zzF(paramInt);
      this.zzd = 0;
    }
    while (paramzzfd.zza() > 0)
    {
      paramInt = this.zzd;
      if (paramInt < 3)
      {
        if (paramInt == 0)
        {
          paramInt = paramzzfd.zzk();
          paramzzfd.zzF(paramzzfd.zzc() - 1);
          if (paramInt == 255)
          {
            this.zzf = true;
            return;
          }
        }
        paramInt = Math.min(paramzzfd.zza(), 3 - this.zzd);
        paramzzfd.zzB(this.zzb.zzH(), this.zzd, paramInt);
        paramInt = this.zzd + paramInt;
        this.zzd = paramInt;
        if (paramInt == 3)
        {
          this.zzb.zzF(0);
          this.zzb.zzE(3);
          this.zzb.zzG(1);
          i = this.zzb.zzk();
          paramInt = this.zzb.zzk();
          boolean bool;
          if ((i & 0x80) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          this.zze = bool;
          this.zzc = (((i & 0xF) << 8 | paramInt) + 3);
          i = this.zzb.zzb();
          paramInt = this.zzc;
          if (i < paramInt)
          {
            i = this.zzb.zzb();
            paramInt = Math.min(4098, Math.max(paramInt, i + i));
            this.zzb.zzz(paramInt);
          }
        }
      }
      else
      {
        paramInt = Math.min(paramzzfd.zza(), this.zzc - paramInt);
        paramzzfd.zzB(this.zzb.zzH(), this.zzd, paramInt);
        paramInt = this.zzd + paramInt;
        this.zzd = paramInt;
        i = this.zzc;
        if (paramInt == i)
        {
          if (this.zze)
          {
            if (zzfn.zzd(this.zzb.zzH(), 0, i, -1) != 0)
            {
              this.zzf = true;
              return;
            }
            this.zzb.zzE(this.zzc - 4);
          }
          else
          {
            this.zzb.zzE(i);
          }
          this.zzb.zzF(0);
          this.zza.zza(this.zzb);
          this.zzd = 0;
        }
      }
    }
  }
  
  public final void zzb(zzfl paramzzfl, zzaar paramzzaar, zzajt paramzzajt)
  {
    this.zza.zzb(paramzzfl, paramzzaar, paramzzajt);
    this.zzf = true;
  }
  
  public final void zzc()
  {
    this.zzf = true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */