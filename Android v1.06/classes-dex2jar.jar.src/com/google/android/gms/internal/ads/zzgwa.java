package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class zzgwa
  implements zzgwb
{
  private static final Object zza = new Object();
  private volatile zzgwb zzb;
  private volatile Object zzc = zza;
  
  private zzgwa(zzgwb paramzzgwb)
  {
    this.zzb = paramzzgwb;
  }
  
  public static zzgwb zza(zzgwb paramzzgwb)
  {
    if ((!(paramzzgwb instanceof zzgwa)) && (!(paramzzgwb instanceof zzgvn)))
    {
      Objects.requireNonNull(paramzzgwb);
      return new zzgwa(paramzzgwb);
    }
    return paramzzgwb;
  }
  
  public final Object zzb()
  {
    Object localObject2 = this.zzc;
    Object localObject1 = localObject2;
    if (localObject2 == zza)
    {
      localObject1 = this.zzb;
      if (localObject1 == null)
      {
        localObject1 = this.zzc;
      }
      else
      {
        localObject1 = ((zzgwb)localObject1).zzb();
        this.zzc = localObject1;
        this.zzb = null;
      }
    }
    return localObject1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */