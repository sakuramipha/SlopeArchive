package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgdk
  extends zzfxt
{
  private final zzgem zza;
  
  public zzgdk(zzgem paramzzgem)
  {
    this.zza = paramzzgem;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzgdk)) {
      return false;
    }
    paramObject = ((zzgdk)paramObject).zza;
    return (this.zza.zzb().zze().equals(((zzgem)paramObject).zzb().zze())) && (this.zza.zzb().zzg().equals(((zzgem)paramObject).zzb().zzg())) && (this.zza.zzb().zzf().equals(((zzgem)paramObject).zzb().zzf()));
  }
  
  public final int hashCode()
  {
    zzgem localzzgem = this.zza;
    return Arrays.hashCode(new Object[] { localzzgem.zzb(), localzzgem.zzd() });
  }
  
  public final String toString()
  {
    String str = this.zza.zzb().zzg();
    Object localObject = this.zza.zzb().zze();
    zzgla localzzgla = zzgla.zza;
    int i = ((zzgla)localObject).ordinal();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            localObject = "UNKNOWN";
          } else {
            localObject = "CRUNCHY";
          }
        }
        else {
          localObject = "RAW";
        }
      }
      else {
        localObject = "LEGACY";
      }
    }
    else {
      localObject = "TINK";
    }
    return String.format("(typeUrl=%s, outputPrefixType=%s)", new Object[] { str, localObject });
  }
  
  public final zzgem zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgdk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */