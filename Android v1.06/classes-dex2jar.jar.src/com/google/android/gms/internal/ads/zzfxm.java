package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class zzfxm
{
  private final List zza = new ArrayList();
  private final zzggx zzb = zzggx.zza;
  private boolean zzc = false;
  
  private final void zzd()
  {
    Iterator localIterator = this.zza.iterator();
    while (localIterator.hasNext()) {
      zzfxk.zzj((zzfxk)localIterator.next(), false);
    }
  }
  
  public final zzfxm zza(zzfxk paramzzfxk)
  {
    if (zzfxk.zzg(paramzzfxk) == null)
    {
      if (zzfxk.zzk(paramzzfxk)) {
        zzd();
      }
      zzfxk.zzi(paramzzfxk, this);
      this.zza.add(paramzzfxk);
      return this;
    }
    throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
  }
  
  public final zzfxp zzb()
    throws GeneralSecurityException
  {
    if (!this.zzc)
    {
      this.zzc = true;
      zzgke localzzgke = zzgkh.zzd();
      Object localObject1 = this.zza;
      for (int i = 0; i < ((List)localObject1).size() - 1; i++) {
        if ((zzfxk.zzf((zzfxk)((List)localObject1).get(i)) == zzfxl.zza()) && (zzfxk.zzf((zzfxk)((List)localObject1).get(i + 1)) != zzfxl.zza())) {
          throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
        }
      }
      HashSet localHashSet = new HashSet();
      Iterator localIterator = this.zza.iterator();
      localObject1 = null;
      while (localIterator.hasNext())
      {
        zzfxk localzzfxk = (zzfxk)localIterator.next();
        zzfxk.zzb(localzzfxk);
        if (zzfxk.zzf(localzzfxk) != null)
        {
          Object localObject2 = zzfxk.zzf(localzzfxk);
          Object localObject3 = zzfxl.zza();
          int k = 3;
          if (localObject2 == localObject3)
          {
            i = 0;
            for (;;)
            {
              if (i != 0)
              {
                j = i;
                if (!localHashSet.contains(Integer.valueOf(i))) {
                  break;
                }
              }
              localObject2 = new SecureRandom();
              localObject3 = new byte[4];
              for (i = 0; i == 0; i = (localObject3[0] & 0x7F) << 24 | (localObject3[1] & 0xFF) << 16 | (localObject3[2] & 0xFF) << 8 | localObject3[3] & 0xFF) {
                ((SecureRandom)localObject2).nextBytes((byte[])localObject3);
              }
            }
          }
          zzfxk.zzf(localzzfxk);
          int j = 0;
          localObject2 = Integer.valueOf(j);
          if (!localHashSet.contains(localObject2))
          {
            localHashSet.add(localObject2);
            zzfxk.zza(localzzfxk);
            localObject3 = zzfxk.zzh(localzzfxk);
            Object localObject4 = localzzfxk.zzc();
            if (zzfxg.zza.equals(localObject4))
            {
              i = k;
            }
            else if (zzfxg.zzb.equals(localObject4))
            {
              i = 4;
            }
            else
            {
              if (!zzfxg.zzc.equals(localObject4)) {
                break label484;
              }
              i = 5;
            }
            localObject4 = ((zzgdk)localObject3).zza();
            localObject3 = zzfyd.zza(((zzgem)localObject4).zzb());
            zzgkf localzzgkf = zzgkg.zzd();
            localzzgkf.zzb(j);
            localzzgkf.zzd(i);
            localzzgkf.zza((zzgju)localObject3);
            localzzgkf.zzc(((zzgem)localObject4).zzb().zze());
            localzzgke.zza((zzgkg)localzzgkf.zzal());
            if (zzfxk.zzk(localzzfxk)) {
              if (localObject1 == null)
              {
                localObject1 = localObject2;
              }
              else
              {
                throw new GeneralSecurityException("Two primaries were set");
                label484:
                throw new IllegalStateException("Unknown key status");
              }
            }
          }
          else
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Id ");
            ((StringBuilder)localObject1).append(j);
            ((StringBuilder)localObject1).append(" is used twice in the keyset");
            throw new GeneralSecurityException(((StringBuilder)localObject1).toString());
          }
        }
        else
        {
          throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
        }
      }
      if (localObject1 != null)
      {
        localzzgke.zzb(((Integer)localObject1).intValue());
        return zzfxp.zzb((zzgkh)localzzgke.zzal(), this.zzb);
      }
      throw new GeneralSecurityException("No primary was set");
    }
    throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfxm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */