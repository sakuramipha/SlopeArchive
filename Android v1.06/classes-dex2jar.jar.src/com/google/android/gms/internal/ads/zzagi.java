package com.google.android.gms.internal.ads;

final class zzagi
  implements zzagf
{
  private final zzfd zza;
  private final int zzb;
  private final int zzc;
  private int zzd;
  private int zze;
  
  public zzagi(zzagb paramzzagb)
  {
    paramzzagb = paramzzagb.zza;
    this.zza = paramzzagb;
    paramzzagb.zzF(12);
    this.zzc = (paramzzagb.zzn() & 0xFF);
    this.zzb = paramzzagb.zzn();
  }
  
  public final int zza()
  {
    return -1;
  }
  
  public final int zzb()
  {
    return this.zzb;
  }
  
  public final int zzc()
  {
    int i = this.zzc;
    if (i == 8) {
      return this.zza.zzk();
    }
    if (i == 16) {
      return this.zza.zzo();
    }
    i = this.zzd;
    this.zzd = (i + 1);
    if (i % 2 == 0)
    {
      i = this.zza.zzk();
      this.zze = i;
      return (i & 0xF0) >> 4;
    }
    return this.zze & 0xF;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzagi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */