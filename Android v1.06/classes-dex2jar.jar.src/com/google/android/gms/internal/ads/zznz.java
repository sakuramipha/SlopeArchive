package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zznz
  implements zzod
{
  public static final zzfpp zza = zznx.zza;
  private static final Random zzb = new Random();
  private final zzcw zzc;
  private final zzcu zzd;
  private final HashMap zze;
  private final zzfpp zzf;
  private zzoc zzg;
  private zzcx zzh;
  private String zzi;
  
  public zznz() {}
  
  public zznz(zzfpp paramzzfpp)
  {
    this.zzf = paramzzfpp;
    this.zzc = new zzcw();
    this.zzd = new zzcu();
    this.zze = new HashMap();
    this.zzh = zzcx.zza;
  }
  
  private final zzny zzk(int paramInt, zztl paramzztl)
  {
    Iterator localIterator = this.zze.values().iterator();
    long l1 = Long.MAX_VALUE;
    Object localObject = null;
    while (localIterator.hasNext())
    {
      zzny localzzny = (zzny)localIterator.next();
      localzzny.zzg(paramInt, paramzztl);
      if (localzzny.zzj(paramInt, paramzztl))
      {
        long l2 = zzny.zzb(localzzny);
        if (l2 != -1L)
        {
          boolean bool = l2 < l1;
          if (!bool)
          {
            if (bool) {
              continue;
            }
            int i = zzfn.zza;
            if ((zzny.zzc((zzny)localObject) == null) || (zzny.zzc(localzzny) == null)) {
              continue;
            }
            localObject = localzzny;
            continue;
          }
        }
        localObject = localzzny;
        l1 = l2;
      }
    }
    if (localObject == null)
    {
      localObject = zzl();
      paramzztl = new zzny(this, (String)localObject, paramInt, paramzztl);
      this.zze.put(localObject, paramzztl);
      return paramzztl;
    }
    return (zzny)localObject;
  }
  
  private static String zzl()
  {
    byte[] arrayOfByte = new byte[12];
    zzb.nextBytes(arrayOfByte);
    return Base64.encodeToString(arrayOfByte, 10);
  }
  
  @RequiresNonNull({"listener"})
  private final void zzm(zzlt paramzzlt)
  {
    if (paramzzlt.zzb.zzo())
    {
      this.zzi = null;
      return;
    }
    zzny localzzny2 = (zzny)this.zze.get(this.zzi);
    zzny localzzny1 = zzk(paramzzlt.zzc, paramzzlt.zzd);
    this.zzi = zzny.zzd(localzzny1);
    zzh(paramzzlt);
    zztl localzztl = paramzzlt.zzd;
    if ((localzztl != null) && (localzztl.zzb()) && ((localzzny2 == null) || (zzny.zzb(localzzny2) != paramzzlt.zzd.zzd) || (zzny.zzc(localzzny2) == null) || (zzny.zzc(localzzny2).zzb != paramzzlt.zzd.zzb) || (zzny.zzc(localzzny2).zzc != paramzzlt.zzd.zzc)))
    {
      localzztl = paramzzlt.zzd;
      localzztl = new zztl(localzztl.zza, localzztl.zzd);
      zzny.zzd(zzk(paramzzlt.zzc, localzztl));
      zzny.zzd(localzzny1);
    }
  }
  
  public final String zzd()
  {
    try
    {
      String str = this.zzi;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zze(zzcx paramzzcx, zztl paramzztl)
  {
    try
    {
      paramzzcx = zzny.zzd(zzk(paramzzcx.zzn(paramzztl.zza, this.zzd).zzd, paramzztl));
      return paramzzcx;
    }
    finally
    {
      paramzzcx = finally;
      throw paramzzcx;
    }
  }
  
  public final void zzf(zzlt paramzzlt)
  {
    try
    {
      this.zzi = null;
      Iterator localIterator = this.zze.values().iterator();
      while (localIterator.hasNext())
      {
        zzny localzzny = (zzny)localIterator.next();
        localIterator.remove();
        if (zzny.zzi(localzzny))
        {
          zzoc localzzoc = this.zzg;
          if (localzzoc != null) {
            localzzoc.zzd(paramzzlt, zzny.zzd(localzzny), false);
          }
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzg(zzoc paramzzoc)
  {
    this.zzg = paramzzoc;
  }
  
  public final void zzh(zzlt paramzzlt)
  {
    try
    {
      Object localObject1 = this.zzg;
      Objects.requireNonNull(localObject1);
      boolean bool = paramzzlt.zzb.zzo();
      if (bool) {
        return;
      }
      localObject1 = (zzny)this.zze.get(this.zzi);
      if ((paramzzlt.zzd != null) && (localObject1 != null))
      {
        if (zzny.zzb((zzny)localObject1) == -1L)
        {
          if (zzny.zza((zzny)localObject1) == paramzzlt.zzc) {
            break label111;
          }
        }
        else
        {
          long l1 = paramzzlt.zzd.zzd;
          long l2 = zzny.zzb((zzny)localObject1);
          if (l1 >= l2) {
            break label111;
          }
        }
        return;
      }
      label111:
      localObject1 = zzk(paramzzlt.zzc, paramzzlt.zzd);
      if (this.zzi == null) {
        this.zzi = zzny.zzd((zzny)localObject1);
      }
      zztl localzztl = paramzzlt.zzd;
      if ((localzztl != null) && (localzztl.zzb()))
      {
        Object localObject2 = new com/google/android/gms/internal/ads/zztl;
        ((zztl)localObject2).<init>(localzztl.zza, localzztl.zzd, localzztl.zzb);
        localObject2 = zzk(paramzzlt.zzc, (zztl)localObject2);
        if (!zzny.zzi((zzny)localObject2))
        {
          zzny.zzf((zzny)localObject2, true);
          paramzzlt.zzb.zzn(paramzzlt.zzd.zza, this.zzd);
          this.zzd.zzi(paramzzlt.zzd.zzb);
          Math.max(0L, zzfn.zzq(0L) + zzfn.zzq(0L));
          zzny.zzd((zzny)localObject2);
        }
      }
      if (!zzny.zzi((zzny)localObject1))
      {
        zzny.zzf((zzny)localObject1, true);
        zzny.zzd((zzny)localObject1);
      }
      if ((zzny.zzd((zzny)localObject1).equals(this.zzi)) && (!zzny.zzh((zzny)localObject1)))
      {
        zzny.zze((zzny)localObject1, true);
        this.zzg.zzc(paramzzlt, zzny.zzd((zzny)localObject1));
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzi(zzlt paramzzlt, int paramInt)
  {
    try
    {
      Object localObject = this.zzg;
      Objects.requireNonNull(localObject);
      localObject = this.zze.values().iterator();
      while (((Iterator)localObject).hasNext())
      {
        zzny localzzny = (zzny)((Iterator)localObject).next();
        if (localzzny.zzk(paramzzlt))
        {
          ((Iterator)localObject).remove();
          if (zzny.zzi(localzzny))
          {
            boolean bool3 = zzny.zzd(localzzny).equals(this.zzi);
            boolean bool2 = false;
            boolean bool1 = bool2;
            if (paramInt == 0)
            {
              bool1 = bool2;
              if (bool3)
              {
                bool1 = bool2;
                if (zzny.zzh(localzzny)) {
                  bool1 = true;
                }
              }
            }
            if (bool3) {
              this.zzi = null;
            }
            this.zzg.zzd(paramzzlt, zzny.zzd(localzzny), bool1);
          }
        }
      }
      zzm(paramzzlt);
      return;
    }
    finally {}
  }
  
  public final void zzj(zzlt paramzzlt)
  {
    try
    {
      Object localObject = this.zzg;
      Objects.requireNonNull(localObject);
      zzcx localzzcx = this.zzh;
      this.zzh = paramzzlt.zzb;
      localObject = this.zze.values().iterator();
      while (((Iterator)localObject).hasNext())
      {
        zzny localzzny = (zzny)((Iterator)localObject).next();
        if ((!localzzny.zzl(localzzcx, this.zzh)) || (localzzny.zzk(paramzzlt)))
        {
          ((Iterator)localObject).remove();
          if (zzny.zzi(localzzny))
          {
            if (zzny.zzd(localzzny).equals(this.zzi)) {
              this.zzi = null;
            }
            this.zzg.zzd(paramzzlt, zzny.zzd(localzzny), false);
          }
        }
      }
      zzm(paramzzlt);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zznz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */