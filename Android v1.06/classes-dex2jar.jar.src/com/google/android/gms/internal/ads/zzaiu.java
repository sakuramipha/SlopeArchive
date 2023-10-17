package com.google.android.gms.internal.ads;

import java.util.Collections;

public final class zzaiu
  implements zzaih
{
  private final String zza;
  private final zzfd zzb;
  private final zzfc zzc;
  private zzabr zzd;
  private String zze;
  private zzam zzf;
  private int zzg;
  private int zzh;
  private int zzi;
  private int zzj;
  private long zzk;
  private boolean zzl;
  private int zzm;
  private int zzn;
  private int zzo;
  private boolean zzp;
  private long zzq;
  private int zzr;
  private long zzs;
  private int zzt;
  private String zzu;
  
  public zzaiu(String paramString)
  {
    this.zza = paramString;
    paramString = new zzfd(1024);
    this.zzb = paramString;
    paramString = paramString.zzH();
    this.zzc = new zzfc(paramString, paramString.length);
    this.zzk = -9223372036854775807L;
  }
  
  private final int zzf(zzfc paramzzfc)
    throws zzce
  {
    int i = paramzzfc.zza();
    zzzl localzzzl = zzzm.zzb(paramzzfc, true);
    this.zzu = localzzzl.zzc;
    this.zzr = localzzzl.zza;
    this.zzt = localzzzl.zzb;
    return i - paramzzfc.zza();
  }
  
  private static long zzg(zzfc paramzzfc)
  {
    return paramzzfc.zzd((paramzzfc.zzd(2) + 1) * 8);
  }
  
  public final void zza(zzfd paramzzfd)
    throws zzce
  {
    zzdy.zzb(this.zzd);
    while (paramzzfd.zza() > 0)
    {
      int i = this.zzg;
      if (i != 0)
      {
        if (i != 1)
        {
          Object localObject1;
          Object localObject2;
          if (i != 2)
          {
            i = Math.min(paramzzfd.zza(), this.zzi - this.zzh);
            paramzzfd.zzB(this.zzc.zza, this.zzh, i);
            i = this.zzh + i;
            this.zzh = i;
            if (i == this.zzi)
            {
              this.zzc.zzj(0);
              localObject1 = this.zzc;
              int j;
              if (!((zzfc)localObject1).zzn())
              {
                this.zzl = true;
                i = ((zzfc)localObject1).zzd(1);
                if (i == 1)
                {
                  j = ((zzfc)localObject1).zzd(1);
                  i = 1;
                }
                else
                {
                  j = 0;
                }
                this.zzm = j;
                if (j == 0)
                {
                  j = i;
                  if (i == 1)
                  {
                    zzg((zzfc)localObject1);
                    j = 1;
                  }
                  if (((zzfc)localObject1).zzn())
                  {
                    this.zzn = ((zzfc)localObject1).zzd(6);
                    i = ((zzfc)localObject1).zzd(4);
                    int k = ((zzfc)localObject1).zzd(3);
                    if ((i == 0) && (k == 0))
                    {
                      if (j == 0)
                      {
                        k = ((zzfc)localObject1).zzc();
                        i = zzf((zzfc)localObject1);
                        ((zzfc)localObject1).zzj(k);
                        localObject2 = new byte[(i + 7) / 8];
                        ((zzfc)localObject1).zzg((byte[])localObject2, 0, i);
                        zzak localzzak = new zzak();
                        localzzak.zzH(this.zze);
                        localzzak.zzS("audio/mp4a-latm");
                        localzzak.zzx(this.zzu);
                        localzzak.zzw(this.zzt);
                        localzzak.zzT(this.zzr);
                        localzzak.zzI(Collections.singletonList(localObject2));
                        localzzak.zzK(this.zza);
                        localObject2 = localzzak.zzY();
                        if (!((zzam)localObject2).equals(this.zzf))
                        {
                          this.zzf = ((zzam)localObject2);
                          this.zzs = (1024000000L / ((zzam)localObject2).zzA);
                          this.zzd.zzk((zzam)localObject2);
                        }
                      }
                      else
                      {
                        ((zzfc)localObject1).zzl((int)zzg((zzfc)localObject1) - zzf((zzfc)localObject1));
                      }
                      i = ((zzfc)localObject1).zzd(3);
                      this.zzo = i;
                      if (i != 0)
                      {
                        if (i != 1)
                        {
                          if ((i != 3) && (i != 4) && (i != 5))
                          {
                            if ((i != 6) && (i != 7)) {
                              throw new IllegalStateException();
                            }
                            ((zzfc)localObject1).zzl(1);
                          }
                          else
                          {
                            ((zzfc)localObject1).zzl(6);
                          }
                        }
                        else {
                          ((zzfc)localObject1).zzl(9);
                        }
                      }
                      else {
                        ((zzfc)localObject1).zzl(8);
                      }
                      boolean bool = ((zzfc)localObject1).zzn();
                      this.zzp = bool;
                      this.zzq = 0L;
                      if (bool) {
                        if (j != 1) {
                          do
                          {
                            bool = ((zzfc)localObject1).zzn();
                            this.zzq = ((this.zzq << 8) + ((zzfc)localObject1).zzd(8));
                          } while (bool);
                        } else {
                          this.zzq = zzg((zzfc)localObject1);
                        }
                      }
                      if (((zzfc)localObject1).zzn()) {
                        ((zzfc)localObject1).zzl(8);
                      }
                    }
                    else
                    {
                      throw zzce.zza(null, null);
                    }
                  }
                  else
                  {
                    throw zzce.zza(null, null);
                  }
                }
                else
                {
                  throw zzce.zza(null, null);
                }
              }
              else
              {
                if (!this.zzl) {
                  break label781;
                }
              }
              if (this.zzm == 0)
              {
                if (this.zzn == 0)
                {
                  if (this.zzo == 0)
                  {
                    i = 0;
                    for (;;)
                    {
                      j = ((zzfc)localObject1).zzd(8);
                      i += j;
                      if (j != 255)
                      {
                        j = ((zzfc)localObject1).zzc();
                        if ((j & 0x7) == 0)
                        {
                          this.zzb.zzF(j >> 3);
                        }
                        else
                        {
                          ((zzfc)localObject1).zzg(this.zzb.zzH(), 0, i * 8);
                          this.zzb.zzF(0);
                        }
                        this.zzd.zzq(this.zzb, i);
                        long l = this.zzk;
                        if (l != -9223372036854775807L)
                        {
                          this.zzd.zzs(l, 1, i, 0, null);
                          this.zzk += this.zzs;
                        }
                        if (this.zzp) {
                          ((zzfc)localObject1).zzl((int)this.zzq);
                        }
                        label781:
                        this.zzg = 0;
                        break;
                      }
                    }
                  }
                  throw zzce.zza(null, null);
                }
                throw zzce.zza(null, null);
              }
              throw zzce.zza(null, null);
            }
          }
          else
          {
            i = (this.zzj & 0xFF1F) << 8 | paramzzfd.zzk();
            this.zzi = i;
            localObject1 = this.zzb;
            if (i > ((zzfd)localObject1).zzH().length)
            {
              ((zzfd)localObject1).zzC(i);
              localObject1 = this.zzc;
              localObject2 = this.zzb.zzH();
              ((zzfc)localObject1).zzi((byte[])localObject2, localObject2.length);
            }
            this.zzh = 0;
            this.zzg = 3;
          }
        }
        else
        {
          i = paramzzfd.zzk();
          if ((i & 0xE0) == 224)
          {
            this.zzj = i;
            this.zzg = 2;
          }
          else if (i != 86)
          {
            this.zzg = 0;
          }
        }
      }
      else if (paramzzfd.zzk() == 86) {
        this.zzg = 1;
      }
    }
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    paramzzajt.zzc();
    this.zzd = paramzzaar.zzv(paramzzajt.zza(), 1);
    this.zze = paramzzajt.zzb();
  }
  
  public final void zzc() {}
  
  public final void zzd(long paramLong, int paramInt)
  {
    if (paramLong != -9223372036854775807L) {
      this.zzk = paramLong;
    }
  }
  
  public final void zze()
  {
    this.zzg = 0;
    this.zzk = -9223372036854775807L;
    this.zzl = false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaiu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */