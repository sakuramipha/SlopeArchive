package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class zzz
{
  private final zzaa zza;
  private final zzcm zzb;
  private int zzc = 0;
  private ConsentInformation.PrivacyOptionsRequirementStatus zzd = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;
  
  zzz(zzaa paramzzaa, zzcm paramzzcm)
  {
    this.zza = paramzzaa;
    this.zzb = paramzzcm;
  }
  
  final zzac zza()
    throws zzi
  {
    Object localObject1 = this.zzb;
    int i = ((zzcm)localObject1).zzf;
    if (i != 0)
    {
      switch (i - 1)
      {
      default: 
        throw new zzi(1, "Invalid response from server.");
      case 7: 
        throw new zzi(3, "Publisher misconfiguration: ".concat(String.valueOf(((zzcm)localObject1).zzc)));
      case 6: 
        throw new zzi(1, "Invalid response from server: ".concat(String.valueOf(((zzcm)localObject1).zzc)));
      case 5: 
        this.zzc = 1;
        break;
      case 4: 
        this.zzc = 2;
        break;
      case 1: 
      case 2: 
      case 3: 
        this.zzc = 3;
      }
      int j = ((zzcm)localObject1).zzg;
      i = j - 1;
      if (j != 0)
      {
        if (i != 1)
        {
          if (i == 2) {
            this.zzd = ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
          } else {
            throw new zzi(1, "Invalid response from server.");
          }
        }
        else {
          this.zzd = ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        }
        localObject1 = this.zzb;
        Object localObject2 = ((zzcm)localObject1).zza;
        if (localObject2 == null) {
          localObject2 = null;
        } else {
          localObject2 = new zzbs(((zzcm)localObject1).zzb, (String)localObject2);
        }
        zzaa.zzc(this.zza).zzi(new HashSet(((zzcm)localObject1).zzd));
        Iterator localIterator = this.zzb.zze.iterator();
        while (localIterator.hasNext())
        {
          zzcl localzzcl = (zzcl)localIterator.next();
          i = localzzcl.zzb;
          j = i - 1;
          if (i != 0)
          {
            if (j != 0) {
              if (j != 1)
              {
                if (j == 2)
                {
                  localObject1 = "clear";
                  break label324;
                }
              }
              else
              {
                localObject1 = "write";
                break label324;
              }
            }
            localObject1 = null;
            label324:
            if (localObject1 != null)
            {
              zzaa localzzaa = this.zza;
              zzaa.zza(localzzaa).zzb((String)localObject1, localzzcl.zza, new zzf[] { zzaa.zzb(localzzaa) });
            }
          }
          else
          {
            throw null;
          }
        }
        return new zzac(this.zzc, this.zzd, (zzbs)localObject2, null);
      }
      throw null;
    }
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */