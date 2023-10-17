package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

final class zzafg
  implements zzafi
{
  private final byte[] zza = new byte[8];
  private final ArrayDeque zzb = new ArrayDeque();
  private final zzafp zzc = new zzafp();
  private zzafh zzd;
  private int zze;
  private int zzf;
  private long zzg;
  
  private final long zzd(zzaap paramzzaap, int paramInt)
    throws IOException
  {
    byte[] arrayOfByte = this.zza;
    paramzzaap = (zzaae)paramzzaap;
    int i = 0;
    paramzzaap.zzn(arrayOfByte, 0, paramInt, false);
    long l = 0L;
    while (i < paramInt)
    {
      l = l << 8 | this.zza[i] & 0xFF;
      i++;
    }
    return l;
  }
  
  public final void zza(zzafh paramzzafh)
  {
    this.zzd = paramzzafh;
  }
  
  public final void zzb()
  {
    this.zze = 0;
    this.zzb.clear();
    this.zzc.zze();
  }
  
  public final boolean zzc(zzaap paramzzaap)
    throws IOException
  {
    zzdy.zzb(this.zzd);
    Object localObject1;
    Object localObject2;
    int k;
    int j;
    for (;;)
    {
      localObject1 = (zzaff)this.zzb.peek();
      if ((localObject1 != null) && (paramzzaap.zzf() >= zzaff.zzb((zzaff)localObject1)))
      {
        paramzzaap = this.zzd;
        i = zzaff.zza((zzaff)this.zzb.pop());
        ((zzafl)paramzzaap).zza.zzh(i);
        return true;
      }
      i = this.zze;
      if (i == 0)
      {
        l2 = this.zzc.zzd(paramzzaap, true, false, 4);
        l1 = l2;
        if (l2 == -2L)
        {
          paramzzaap.zzj();
          for (;;)
          {
            localObject2 = this.zza;
            localObject1 = (zzaae)paramzzaap;
            ((zzaae)localObject1).zzm((byte[])localObject2, 0, 4, false);
            k = zzafp.zzb(this.zza[0]);
            if ((k != -1) && (k <= 4))
            {
              j = (int)zzafp.zzc(this.zza, k, false);
              localObject2 = ((zzafl)this.zzd).zza;
              i = j;
              if (j != 357149030)
              {
                i = j;
                if (j != 524531317)
                {
                  i = j;
                  if (j != 475249515)
                  {
                    if (j != 374648427) {
                      break label252;
                    }
                    i = 374648427;
                  }
                }
              }
              ((zzaae)localObject1).zzo(k, false);
              l1 = i;
              break;
            }
            label252:
            ((zzaae)localObject1).zzo(1, false);
          }
        }
        if (l1 == -1L) {
          return false;
        }
        this.zzf = ((int)l1);
        this.zze = 1;
      }
      else
      {
        if (i != 1) {
          break label316;
        }
      }
      this.zzg = this.zzc.zzd(paramzzaap, false, true, 8);
      this.zze = 2;
      label316:
      localObject1 = this.zzd;
      k = this.zzf;
      localObject1 = (zzafl)localObject1;
      localObject2 = ((zzafl)localObject1).zza;
      switch (k)
      {
      default: 
        i = (int)this.zzg;
        ((zzaae)paramzzaap).zzo(i, false);
        this.zze = 0;
      }
    }
    long l1 = this.zzg;
    if ((l1 != 4L) && (l1 != 8L))
    {
      paramzzaap = new StringBuilder();
      paramzzaap.append("Invalid float size: ");
      paramzzaap.append(l1);
      throw zzce.zza(paramzzaap.toString(), null);
    }
    int i = (int)l1;
    l1 = zzd(paramzzaap, i);
    double d;
    if (i == 4) {
      d = Float.intBitsToFloat((int)l1);
    } else {
      d = Double.longBitsToDouble(l1);
    }
    ((zzafl)localObject1).zza.zzi(k, d);
    this.zze = 0;
    return true;
    ((zzafn)localObject2).zzg(k, (int)this.zzg, paramzzaap);
    this.zze = 0;
    return true;
    l1 = paramzzaap.zzf();
    long l2 = this.zzg;
    this.zzb.push(new zzaff(k, l2 + l1, null));
    paramzzaap = this.zzd;
    i = this.zzf;
    l2 = this.zzg;
    ((zzafl)paramzzaap).zza.zzk(i, l1, l2);
    this.zze = 0;
    return true;
    l1 = this.zzg;
    if (l1 <= 2147483647L)
    {
      i = (int)l1;
      if (i == 0)
      {
        paramzzaap = "";
      }
      else
      {
        localObject2 = new byte[i];
        ((zzaae)paramzzaap).zzn((byte[])localObject2, 0, i, false);
        while (i > 0)
        {
          j = i - 1;
          if (localObject2[j] != 0) {
            break;
          }
          i = j;
        }
        paramzzaap = new String((byte[])localObject2, 0, i);
      }
      ((zzafl)localObject1).zza.zzl(k, paramzzaap);
      this.zze = 0;
      return true;
    }
    paramzzaap = new StringBuilder();
    paramzzaap.append("String element size: ");
    paramzzaap.append(l1);
    throw zzce.zza(paramzzaap.toString(), null);
    l1 = this.zzg;
    if (l1 <= 8L)
    {
      l1 = zzd(paramzzaap, (int)l1);
      ((zzafl)localObject1).zza.zzj(k, l1);
      this.zze = 0;
      return true;
    }
    paramzzaap = new StringBuilder();
    paramzzaap.append("Invalid integer size: ");
    paramzzaap.append(l1);
    throw zzce.zza(paramzzaap.toString(), null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzafg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */