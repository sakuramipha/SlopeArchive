package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public final class zzfxp
{
  private final zzgkh zza;
  private final List zzb;
  private final zzggx zzc;
  
  private zzfxp(zzgkh paramzzgkh, List paramList)
  {
    this.zza = paramzzgkh;
    this.zzb = paramList;
    this.zzc = zzggx.zza;
  }
  
  private zzfxp(zzgkh paramzzgkh, List paramList, zzggx paramzzggx)
  {
    this.zza = paramzzgkh;
    this.zzb = paramList;
    this.zzc = paramzzggx;
  }
  
  static final zzfxp zza(zzgkh paramzzgkh)
    throws GeneralSecurityException
  {
    zzi(paramzzgkh);
    return new zzfxp(paramzzgkh, zzh(paramzzgkh));
  }
  
  static final zzfxp zzb(zzgkh paramzzgkh, zzggx paramzzggx)
    throws GeneralSecurityException
  {
    zzi(paramzzgkh);
    return new zzfxp(paramzzgkh, zzh(paramzzgkh), paramzzggx);
  }
  
  public static final zzfxp zzc(zzfxh paramzzfxh)
    throws GeneralSecurityException
  {
    Object localObject = new zzgdk(zzgem.zza(paramzzfxh.zza()));
    paramzzfxh = new zzfxm();
    localObject = new zzfxk((zzfxt)localObject, null);
    ((zzfxk)localObject).zzd();
    ((zzfxk)localObject).zze();
    paramzzfxh.zza((zzfxk)localObject);
    return paramzzfxh.zzb();
  }
  
  private static zzgel zzf(zzgkg paramzzgkg)
  {
    int i = paramzzgkg.zza();
    Integer localInteger;
    if (paramzzgkg.zzf() == zzgla.zzd) {
      localInteger = null;
    } else {
      localInteger = Integer.valueOf(i);
    }
    try
    {
      paramzzgkg = zzgel.zza(paramzzgkg.zzc().zzg(), paramzzgkg.zzc().zzf(), paramzzgkg.zzc().zzc(), paramzzgkg.zzf(), localInteger);
      return paramzzgkg;
    }
    catch (GeneralSecurityException paramzzgkg)
    {
      throw new zzgev("Creating a protokey serialization failed", paramzzgkg);
    }
  }
  
  @Nullable
  private static Object zzg(zzgkg paramzzgkg, Class paramClass)
    throws GeneralSecurityException
  {
    try
    {
      paramzzgkg = paramzzgkg.zzc();
      int i = zzfyd.zza;
      paramzzgkg = zzfyd.zzc(paramzzgkg.zzg(), paramzzgkg.zzf(), paramClass);
      return paramzzgkg;
    }
    catch (GeneralSecurityException paramzzgkg)
    {
      if ((!paramzzgkg.getMessage().contains("No key manager found for key type ")) && (!paramzzgkg.getMessage().contains(" not supported by key manager of type "))) {
        throw paramzzgkg;
      }
    }
    return null;
  }
  
  private static List zzh(zzgkh paramzzgkh)
  {
    ArrayList localArrayList = new ArrayList(paramzzgkh.zza());
    Iterator localIterator = paramzzgkh.zzh().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (zzgkg)localIterator.next();
      int j = ((zzgkg)localObject1).zza();
      Object localObject2 = zzf((zzgkg)localObject1);
      try
      {
        zzfxb localzzfxb = zzgds.zzb().zza((zzgel)localObject2, zzfye.zza());
        localObject2 = new com/google/android/gms/internal/ads/zzfxo;
        int i = ((zzgkg)localObject1).zzk() - 2;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3)
            {
              localObject1 = zzfxg.zzc;
            }
            else
            {
              localObject1 = new java/security/GeneralSecurityException;
              ((GeneralSecurityException)localObject1).<init>("Unknown key status");
              throw ((Throwable)localObject1);
            }
          }
          else {
            localObject1 = zzfxg.zzb;
          }
        }
        else {
          localObject1 = zzfxg.zza;
        }
        boolean bool;
        if (j == paramzzgkh.zzc()) {
          bool = true;
        } else {
          bool = false;
        }
        ((zzfxo)localObject2).<init>(localzzfxb, (zzfxg)localObject1, j, bool, null);
        localArrayList.add(localObject2);
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        localArrayList.add(null);
      }
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  private static void zzi(zzgkh paramzzgkh)
    throws GeneralSecurityException
  {
    if ((paramzzgkh != null) && (paramzzgkh.zza() > 0)) {
      return;
    }
    throw new GeneralSecurityException("empty keyset");
  }
  
  @Nullable
  private static final Object zzj(zzfxb paramzzfxb, Class paramClass)
    throws GeneralSecurityException
  {
    try
    {
      int i = zzfyd.zza;
      paramzzfxb = zzgdr.zza().zzc(paramzzfxb, paramClass);
      return paramzzfxb;
    }
    catch (GeneralSecurityException paramzzfxb) {}
    return null;
  }
  
  public final String toString()
  {
    Object localObject2 = this.zza;
    Object localObject1 = zzfyf.zza;
    localObject1 = zzgkm.zza();
    ((zzgkj)localObject1).zzb(((zzgkh)localObject2).zzc());
    Iterator localIterator = ((zzgkh)localObject2).zzh().iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (zzgkg)localIterator.next();
      zzgkk localzzgkk = zzgkl.zza();
      localzzgkk.zzc(((zzgkg)localObject2).zzc().zzg());
      localzzgkk.zzd(((zzgkg)localObject2).zzk());
      localzzgkk.zzb(((zzgkg)localObject2).zzf());
      localzzgkk.zza(((zzgkg)localObject2).zza());
      ((zzgkj)localObject1).zza((zzgkl)localzzgkk.zzal());
    }
    return ((zzgkm)((zzgos)localObject1).zzal()).toString();
  }
  
  final zzgkh zzd()
  {
    return this.zza;
  }
  
  public final Object zze(Class paramClass)
    throws GeneralSecurityException
  {
    Object localObject2 = zzfyd.zzb(paramClass);
    if (localObject2 != null)
    {
      Object localObject1 = this.zza;
      Object localObject3 = zzfyf.zza;
      int i1 = ((zzgkh)localObject1).zzc();
      localObject3 = ((zzgkh)localObject1).zzh().iterator();
      int n = 0;
      int j = 0;
      int m = 0;
      int i = 1;
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (zzgkg)((Iterator)localObject3).next();
        if (((zzgkg)localObject1).zzk() == 3) {
          if (((zzgkg)localObject1).zzj())
          {
            if (((zzgkg)localObject1).zzf() != zzgla.zza)
            {
              if (((zzgkg)localObject1).zzk() != 2)
              {
                int k = m;
                if (((zzgkg)localObject1).zza() == i1) {
                  if (m == 0) {
                    k = 1;
                  } else {
                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                  }
                }
                if (((zzgkg)localObject1).zzc().zzc() != zzgjt.zzd) {
                  m = 0;
                } else {
                  m = 1;
                }
                i &= m;
                j++;
                m = k;
              }
              else
              {
                throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[] { Integer.valueOf(((zzgkg)localObject1).zza()) }));
              }
            }
            else {
              throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[] { Integer.valueOf(((zzgkg)localObject1).zza()) }));
            }
          }
          else {
            throw new GeneralSecurityException(String.format("key %d has no key data", new Object[] { Integer.valueOf(((zzgkg)localObject1).zza()) }));
          }
        }
      }
      if (j != 0)
      {
        if ((m == 0) && (i == 0)) {
          throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzfxv localzzfxv = new zzfxv((Class)localObject2, null);
        localzzfxv.zzc(this.zzc);
        for (i = n; i < this.zza.zza(); i++)
        {
          localObject3 = this.zza.zze(i);
          if (((zzgkg)localObject3).zzk() == 3)
          {
            Object localObject4 = zzg((zzgkg)localObject3, (Class)localObject2);
            if (this.zzb.get(i) != null) {
              localObject1 = zzj(((zzfxo)this.zzb.get(i)).zza(), (Class)localObject2);
            } else {
              localObject1 = null;
            }
            if ((localObject1 == null) && (localObject4 == null))
            {
              paramClass = localObject2.toString();
              localObject1 = ((zzgkg)localObject3).zzc().zzg();
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("Unable to get primitive ");
              ((StringBuilder)localObject2).append(paramClass);
              ((StringBuilder)localObject2).append(" for key of type ");
              ((StringBuilder)localObject2).append((String)localObject1);
              throw new GeneralSecurityException(((StringBuilder)localObject2).toString());
            }
            if (((zzgkg)localObject3).zza() == this.zza.zzc()) {
              localzzfxv.zzb(localObject1, localObject4, (zzgkg)localObject3);
            } else {
              localzzfxv.zza(localObject1, localObject4, (zzgkg)localObject3);
            }
          }
        }
        localObject1 = localzzfxv.zzd();
        return zzgdr.zza().zzd((zzfya)localObject1, paramClass);
      }
      throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
    throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(paramClass.getName())));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfxp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */