package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

final class zzfxd
  implements zzfxc
{
  private final zzgdh zza;
  private final Class zzb;
  
  public zzfxd(zzgdh paramzzgdh, Class paramClass)
  {
    if ((!paramzzgdh.zzl().contains(paramClass)) && (!Void.class.equals(paramClass))) {
      throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[] { paramzzgdh.toString(), paramClass.getName() }));
    }
    this.zza = paramzzgdh;
    this.zzb = paramClass;
  }
  
  public final zzgju zza(zzgno paramzzgno)
    throws GeneralSecurityException
  {
    try
    {
      Object localObject = this.zza.zza();
      paramzzgno = ((zzgdg)localObject).zzb(paramzzgno);
      ((zzgdg)localObject).zzd(paramzzgno);
      paramzzgno = ((zzgdg)localObject).zza(paramzzgno);
      localObject = zzgju.zza();
      ((zzgjr)localObject).zzb(this.zza.zzd());
      ((zzgjr)localObject).zzc(paramzzgno.zzau());
      ((zzgjr)localObject).zza(this.zza.zzb());
      paramzzgno = (zzgju)((zzgos)localObject).zzal();
      return paramzzgno;
    }
    catch (zzgpi paramzzgno)
    {
      throw new GeneralSecurityException("Unexpected proto", paramzzgno);
    }
  }
  
  public final Object zzb(zzgno paramzzgno)
    throws GeneralSecurityException
  {
    try
    {
      paramzzgno = this.zza.zzc(paramzzgno);
      if (!Void.class.equals(this.zzb))
      {
        this.zza.zze(paramzzgno);
        return this.zza.zzk(paramzzgno, this.zzb);
      }
      paramzzgno = new java/security/GeneralSecurityException;
      paramzzgno.<init>("Cannot create a primitive for Void");
      throw paramzzgno;
    }
    catch (zzgpi paramzzgno)
    {
      throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzj().getName())), paramzzgno);
    }
  }
  
  public final String zzc()
  {
    return this.zza.zzd();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfxd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */