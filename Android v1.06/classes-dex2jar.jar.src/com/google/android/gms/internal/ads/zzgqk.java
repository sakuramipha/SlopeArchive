package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzgqk
  implements zzgqz
{
  private final zzgqg zza;
  private final zzgrq zzb;
  private final boolean zzc;
  private final zzgoj zzd;
  
  private zzgqk(zzgrq paramzzgrq, zzgoj paramzzgoj, zzgqg paramzzgqg)
  {
    this.zzb = paramzzgrq;
    this.zzc = paramzzgoj.zzh(paramzzgqg);
    this.zzd = paramzzgoj;
    this.zza = paramzzgqg;
  }
  
  static zzgqk zzc(zzgrq paramzzgrq, zzgoj paramzzgoj, zzgqg paramzzgqg)
  {
    return new zzgqk(paramzzgrq, paramzzgoj, paramzzgqg);
  }
  
  public final int zza(Object paramObject)
  {
    zzgrq localzzgrq = this.zzb;
    int i = localzzgrq.zzb(localzzgrq.zzd(paramObject));
    if (!this.zzc) {
      return i;
    }
    this.zzd.zza(paramObject);
    throw null;
  }
  
  public final int zzb(Object paramObject)
  {
    int i = this.zzb.zzd(paramObject).hashCode();
    if (!this.zzc) {
      return i;
    }
    this.zzd.zza(paramObject);
    throw null;
  }
  
  public final Object zze()
  {
    zzgqg localzzgqg = this.zza;
    if ((localzzgqg instanceof zzgow)) {
      return ((zzgow)localzzgqg).zzaD();
    }
    return localzzgqg.zzaP().zzan();
  }
  
  public final void zzf(Object paramObject)
  {
    this.zzb.zzm(paramObject);
    this.zzd.zze(paramObject);
  }
  
  public final void zzg(Object paramObject1, Object paramObject2)
  {
    zzgrb.zzC(this.zzb, paramObject1, paramObject2);
    if (!this.zzc) {
      return;
    }
    this.zzd.zza(paramObject2);
    throw null;
  }
  
  public final void zzh(Object paramObject, zzgqr paramzzgqr, zzgoi paramzzgoi)
    throws IOException
  {
    zzgrq localzzgrq = this.zzb;
    zzgoj localzzgoj = this.zzd;
    Object localObject3 = localzzgrq.zzc(paramObject);
    zzgon localzzgon = localzzgoj.zzb(paramObject);
    try
    {
      while (paramzzgqr.zzc() != Integer.MAX_VALUE)
      {
        int i = paramzzgqr.zzd();
        Object localObject1;
        if (i != 11)
        {
          boolean bool;
          if ((i & 0x7) == 2)
          {
            localObject1 = localzzgoj.zzc(paramzzgoi, this.zza, i >>> 3);
            if (localObject1 != null)
            {
              localzzgoj.zzf(paramzzgqr, localObject1, paramzzgoi, localzzgon);
              continue;
            }
            bool = localzzgrq.zzp(localObject3, paramzzgqr);
          }
          else
          {
            bool = paramzzgqr.zzO();
          }
          if (bool) {
            break;
          }
        }
        else
        {
          i = 0;
          Object localObject2 = null;
          localObject1 = null;
          do
          {
            for (;;)
            {
              if (paramzzgqr.zzc() == Integer.MAX_VALUE) {
                break label242;
              }
              int j = paramzzgqr.zzd();
              if (j == 16)
              {
                i = paramzzgqr.zzj();
                localObject2 = localzzgoj.zzc(paramzzgoi, this.zza, i);
              }
              else
              {
                if (j != 26) {
                  break;
                }
                if (localObject2 != null) {
                  localzzgoj.zzf(paramzzgqr, localObject2, paramzzgoi, localzzgon);
                } else {
                  localObject1 = paramzzgqr.zzp();
                }
              }
            }
          } while (paramzzgqr.zzO());
          label242:
          if (paramzzgqr.zzd() == 12)
          {
            if (localObject1 != null) {
              if (localObject2 != null) {
                localzzgoj.zzg((zzgno)localObject1, localObject2, paramzzgoi, localzzgon);
              } else {
                localzzgrq.zzk(localObject3, i, (zzgno)localObject1);
              }
            }
          }
          else {
            throw zzgpi.zzb();
          }
        }
      }
      return;
    }
    finally
    {
      localzzgrq.zzn(paramObject, localObject3);
    }
  }
  
  public final void zzi(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzgna paramzzgna)
    throws IOException
  {
    paramArrayOfByte = (zzgow)paramObject;
    if (paramArrayOfByte.zzc == zzgrr.zzc()) {
      paramArrayOfByte.zzc = zzgrr.zzf();
    }
    paramObject = (zzgot)paramObject;
    throw null;
  }
  
  public final boolean zzj(Object paramObject1, Object paramObject2)
  {
    if (!this.zzb.zzd(paramObject1).equals(this.zzb.zzd(paramObject2))) {
      return false;
    }
    if (!this.zzc) {
      return true;
    }
    this.zzd.zza(paramObject1);
    this.zzd.zza(paramObject2);
    throw null;
  }
  
  public final boolean zzk(Object paramObject)
  {
    this.zzd.zza(paramObject);
    throw null;
  }
  
  public final void zzm(Object paramObject, zzgoe paramzzgoe)
    throws IOException
  {
    this.zzd.zza(paramObject);
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */