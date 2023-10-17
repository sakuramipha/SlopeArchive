package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class zzace
  implements zzaao
{
  private final zzfd zza = new zzfd(12);
  private final zzacd zzb = new zzacd(null);
  private int zzc;
  private zzaar zzd = new zzaam();
  private zzacf zze;
  private long zzf = -9223372036854775807L;
  private zzach[] zzg = new zzach[0];
  private long zzh;
  private zzach zzi;
  private int zzj = -1;
  private long zzk = -1L;
  private long zzl = -1L;
  private int zzm;
  private boolean zzn;
  
  private final zzach zzf(int paramInt)
  {
    for (zzach localzzach : this.zzg) {
      if (localzzach.zzg(paramInt)) {
        return localzzach;
      }
    }
    return null;
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    long l1 = this.zzh;
    int j = 0;
    long l2;
    if (l1 != -1L)
    {
      l2 = paramzzaap.zzf();
      if ((l1 >= l2) && (l1 <= 262144L + l2))
      {
        ((zzaae)paramzzaap).zzo((int)(l1 - l2), false);
      }
      else
      {
        paramzzabk.zza = l1;
        i = 1;
        break label80;
      }
    }
    int i = 0;
    label80:
    this.zzh = -1L;
    if (i != 0) {
      return 1;
    }
    int k = this.zzc;
    i = 12;
    if (k != 0)
    {
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 3)
          {
            if (k != 4)
            {
              if (k != 5)
              {
                if (paramzzaap.zzf() >= this.zzl)
                {
                  i = -1;
                }
                else
                {
                  paramzzabk = this.zzi;
                  if (paramzzabk != null)
                  {
                    if (!paramzzabk.zzh(paramzzaap))
                    {
                      i = j;
                    }
                    else
                    {
                      this.zzi = null;
                      return 0;
                    }
                  }
                  else
                  {
                    if ((paramzzaap.zzf() & 1L) == 1L) {
                      ((zzaae)paramzzaap).zzo(1, false);
                    }
                    paramzzabk = this.zza.zzH();
                    localObject1 = (zzaae)paramzzaap;
                    ((zzaae)localObject1).zzm(paramzzabk, 0, 12, false);
                    this.zza.zzF(0);
                    k = this.zza.zzg();
                    if (k == 1414744396)
                    {
                      this.zza.zzF(8);
                      if (this.zza.zzg() != 1769369453) {
                        i = 8;
                      }
                      ((zzaae)localObject1).zzo(i, false);
                      paramzzaap.zzj();
                      i = j;
                    }
                    else
                    {
                      i = this.zza.zzg();
                      if (k == 1263424842)
                      {
                        this.zzh = (paramzzaap.zzf() + i + 8L);
                        i = j;
                      }
                      else
                      {
                        ((zzaae)localObject1).zzo(8, false);
                        paramzzaap.zzj();
                        paramzzabk = zzf(k);
                        if (paramzzabk == null)
                        {
                          this.zzh = (paramzzaap.zzf() + i);
                          i = j;
                        }
                        else
                        {
                          paramzzabk.zze(i);
                          this.zzi = paramzzabk;
                          i = j;
                        }
                      }
                    }
                  }
                }
                return i;
              }
              paramzzabk = new zzfd(this.zzm);
              localObject1 = paramzzabk.zzH();
              i = this.zzm;
              ((zzaae)paramzzaap).zzn((byte[])localObject1, 0, i, false);
              if (paramzzabk.zza() < 16)
              {
                l1 = 0L;
              }
              else
              {
                i = paramzzabk.zzc();
                paramzzabk.zzG(8);
                l1 = paramzzabk.zzg();
                l2 = this.zzk;
                if (l1 > l2) {
                  l1 = 0L;
                } else {
                  l1 = l2 + 8L;
                }
                paramzzabk.zzF(i);
              }
              while (paramzzabk.zza() >= 16)
              {
                i = paramzzabk.zzg();
                j = paramzzabk.zzg();
                l2 = paramzzabk.zzg();
                paramzzabk.zzg();
                paramzzaap = zzf(i);
                if (paramzzaap != null)
                {
                  if ((j & 0x10) == 16) {
                    paramzzaap.zzb(l2 + l1);
                  }
                  paramzzaap.zzd();
                }
              }
              paramzzaap = this.zzg;
              j = paramzzaap.length;
              for (i = 0; i < j; i++) {
                paramzzaap[i].zzc();
              }
              this.zzn = true;
              this.zzd.zzN(new zzacb(this, this.zzf));
              this.zzc = 6;
              this.zzh = this.zzk;
              return 0;
            }
            paramzzabk = this.zza.zzH();
            ((zzaae)paramzzaap).zzn(paramzzabk, 0, 8, false);
            this.zza.zzF(0);
            i = this.zza.zzg();
            j = this.zza.zzg();
            if (i == 829973609)
            {
              this.zzc = 5;
              this.zzm = j;
            }
            else
            {
              this.zzh = (paramzzaap.zzf() + j);
            }
            return 0;
          }
          l1 = this.zzk;
          if ((l1 != -1L) && (paramzzaap.zzf() != l1))
          {
            this.zzh = l1;
            return 0;
          }
          localObject1 = this.zza.zzH();
          paramzzabk = (zzaae)paramzzaap;
          paramzzabk.zzm((byte[])localObject1, 0, 12, false);
          paramzzaap.zzj();
          this.zza.zzF(0);
          this.zzb.zza(this.zza);
          i = this.zza.zzg();
          localObject1 = this.zzb;
          j = ((zzacd)localObject1).zza;
          if (j == 1179011410)
          {
            paramzzabk.zzo(12, false);
            return 0;
          }
          if ((j == 1414744396) && (i == 1769369453))
          {
            l1 = paramzzaap.zzf();
            this.zzk = l1;
            l1 = l1 + ((zzacd)localObject1).zzb + 8L;
            this.zzl = l1;
            if (!this.zzn)
            {
              paramzzabk = this.zze;
              Objects.requireNonNull(paramzzabk);
              if ((paramzzabk.zzb & 0x10) != 16)
              {
                this.zzd.zzN(new zzabm(this.zzf, 0L));
                this.zzn = true;
              }
              else
              {
                this.zzc = 4;
                this.zzh = l1;
                return 0;
              }
            }
            this.zzh = (paramzzaap.zzf() + 12L);
            this.zzc = 6;
            return 0;
          }
          this.zzh = (paramzzaap.zzf() + ((zzacd)localObject1).zzb + 8L);
          return 0;
        }
        i = this.zzj - 4;
        Object localObject1 = new zzfd(i);
        paramzzabk = ((zzfd)localObject1).zzH();
        ((zzaae)paramzzaap).zzn(paramzzabk, 0, i, false);
        paramzzaap = zzaci.zzc(1819436136, (zzfd)localObject1);
        if (paramzzaap.zza() == 1819436136)
        {
          paramzzabk = (zzacf)paramzzaap.zzb(zzacf.class);
          if (paramzzabk != null)
          {
            this.zze = paramzzabk;
            this.zzf = (paramzzabk.zzc * paramzzabk.zza);
            paramzzabk = new ArrayList();
            localObject1 = paramzzaap.zza;
            int n = ((List)localObject1).size();
            i = 0;
            for (j = 0;; j = k)
            {
              paramzzaap = null;
              if (i >= n) {
                break;
              }
              Object localObject2 = (zzaca)((List)localObject1).get(i);
              k = j;
              if (((zzaca)localObject2).zza() == 1819440243)
              {
                Object localObject3 = (zzaci)localObject2;
                int m = j + 1;
                localObject2 = (zzacg)((zzaci)localObject3).zzb(zzacg.class);
                Object localObject4 = (zzacj)((zzaci)localObject3).zzb(zzacj.class);
                if (localObject2 == null) {
                  zzer.zze("AviExtractor", "Missing Stream Header");
                }
                for (;;)
                {
                  break;
                  if (localObject4 == null)
                  {
                    zzer.zze("AviExtractor", "Missing Stream Format");
                  }
                  else
                  {
                    l1 = zzfn.zzp(((zzacg)localObject2).zzd, ((zzacg)localObject2).zzb * 1000000L, ((zzacg)localObject2).zzc);
                    localObject4 = ((zzacj)localObject4).zza;
                    paramzzaap = ((zzam)localObject4).zzb();
                    paramzzaap.zzG(j);
                    k = ((zzacg)localObject2).zze;
                    if (k != 0) {
                      paramzzaap.zzL(k);
                    }
                    localObject3 = (zzack)((zzaci)localObject3).zzb(zzack.class);
                    if (localObject3 != null) {
                      paramzzaap.zzJ(((zzack)localObject3).zza);
                    }
                    k = zzcd.zzb(((zzam)localObject4).zzm);
                    if (k != 1) {
                      if (k == 2)
                      {
                        k = 2;
                      }
                      else
                      {
                        paramzzaap = null;
                        break;
                      }
                    }
                    localObject3 = this.zzd.zzv(j, k);
                    ((zzabr)localObject3).zzk(paramzzaap.zzY());
                    paramzzaap = new zzach(j, k, l1, ((zzacg)localObject2).zzd, (zzabr)localObject3);
                    this.zzf = l1;
                  }
                }
                if (paramzzaap != null) {
                  paramzzabk.add(paramzzaap);
                }
                k = m;
              }
              i++;
            }
            this.zzg = ((zzach[])paramzzabk.toArray(new zzach[0]));
            this.zzd.zzC();
            this.zzc = 3;
            return 0;
          }
          throw zzce.zza("AviHeader not found", null);
        }
        i = paramzzaap.zza();
        paramzzaap = new StringBuilder();
        paramzzaap.append("Unexpected header list type ");
        paramzzaap.append(i);
        throw zzce.zza(paramzzaap.toString(), null);
      }
      paramzzabk = this.zza.zzH();
      ((zzaae)paramzzaap).zzn(paramzzabk, 0, 12, false);
      this.zza.zzF(0);
      paramzzaap = this.zzb;
      paramzzabk = this.zza;
      paramzzaap.zza(paramzzabk);
      i = paramzzaap.zza;
      if (i == 1414744396)
      {
        paramzzaap.zzc = paramzzabk.zzg();
        paramzzaap = this.zzb;
        i = paramzzaap.zzc;
        if (i == 1819436136)
        {
          this.zzj = paramzzaap.zzb;
          this.zzc = 2;
          return 0;
        }
        paramzzaap = new StringBuilder();
        paramzzaap.append("hdrl expected, found: ");
        paramzzaap.append(i);
        throw zzce.zza(paramzzaap.toString(), null);
      }
      paramzzaap = new StringBuilder();
      paramzzaap.append("LIST expected, found: ");
      paramzzaap.append(i);
      throw zzce.zza(paramzzaap.toString(), null);
    }
    if (zzd(paramzzaap))
    {
      ((zzaae)paramzzaap).zzo(12, false);
      this.zzc = 1;
      return 0;
    }
    throw zzce.zza("AVI Header List not found", null);
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzc = 0;
    this.zzd = paramzzaar;
    this.zzh = -1L;
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    this.zzh = -1L;
    this.zzi = null;
    zzach[] arrayOfzzach = this.zzg;
    int j = arrayOfzzach.length;
    for (int i = 0; i < j; i++) {
      arrayOfzzach[i].zzf(paramLong1);
    }
    if (paramLong1 == 0L) {
      if (this.zzg.length == 0)
      {
        this.zzc = 0;
        return;
      }
    }
    for (i = 3;; i = 6)
    {
      this.zzc = i;
      return;
    }
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    byte[] arrayOfByte = this.zza.zzH();
    ((zzaae)paramzzaap).zzm(arrayOfByte, 0, 12, false);
    this.zza.zzF(0);
    if (this.zza.zzg() != 1179011410) {
      return false;
    }
    this.zza.zzG(4);
    return this.zza.zzg() == 541677121;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */