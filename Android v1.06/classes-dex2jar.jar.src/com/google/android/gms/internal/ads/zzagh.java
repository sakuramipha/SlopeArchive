package com.google.android.gms.internal.ads;

final class zzagh
  implements zzagf
{
  private final int zza;
  private final int zzb;
  private final zzfd zzc;
  
  public zzagh(zzagb paramzzagb, zzam paramzzam)
  {
    paramzzagb = paramzzagb.zza;
    this.zzc = paramzzagb;
    paramzzagb.zzF(12);
    int j = paramzzagb.zzn();
    int i = j;
    if ("audio/raw".equals(paramzzam.zzm))
    {
      int k = zzfn.zzk(paramzzam.zzB, paramzzam.zzz);
      if (j != 0)
      {
        i = j;
        if (j % k == 0) {}
      }
      else
      {
        paramzzam = new StringBuilder();
        paramzzam.append("Audio sample size mismatch. stsd sample size: ");
        paramzzam.append(k);
        paramzzam.append(", stsz sample size: ");
        paramzzam.append(j);
        zzer.zze("AtomParsers", paramzzam.toString());
        i = k;
      }
    }
    j = i;
    if (i == 0) {
      j = -1;
    }
    this.zza = j;
    this.zzb = paramzzagb.zzn();
  }
  
  public final int zza()
  {
    return this.zza;
  }
  
  public final int zzb()
  {
    return this.zzb;
  }
  
  public final int zzc()
  {
    int j = this.zza;
    int i = j;
    if (j == -1) {
      i = this.zzc.zzn();
    }
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzagh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */