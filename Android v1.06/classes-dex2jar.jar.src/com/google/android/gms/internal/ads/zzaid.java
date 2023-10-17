package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public final class zzaid
  implements zzaih
{
  private static final byte[] zza = { 73, 68, 51 };
  private final boolean zzb;
  private final zzfc zzc = new zzfc(new byte[7], 7);
  private final zzfd zzd = new zzfd(Arrays.copyOf(zza, 10));
  private final String zze;
  private String zzf;
  private zzabr zzg;
  private zzabr zzh;
  private int zzi;
  private int zzj;
  private int zzk;
  private boolean zzl;
  private boolean zzm;
  private int zzn;
  private int zzo;
  private int zzp;
  private boolean zzq;
  private long zzr;
  private int zzs;
  private long zzt;
  private zzabr zzu;
  private long zzv;
  
  public zzaid(boolean paramBoolean, String paramString)
  {
    zzh();
    this.zzn = -1;
    this.zzo = -1;
    this.zzr = -9223372036854775807L;
    this.zzt = -9223372036854775807L;
    this.zzb = paramBoolean;
    this.zze = paramString;
  }
  
  public static boolean zzf(int paramInt)
  {
    return (paramInt & 0xFFF6) == 65520;
  }
  
  private final void zzg()
  {
    this.zzm = false;
    zzh();
  }
  
  private final void zzh()
  {
    this.zzi = 0;
    this.zzj = 0;
    this.zzk = 256;
  }
  
  private final void zzi()
  {
    this.zzi = 3;
    this.zzj = 0;
  }
  
  private final void zzj(zzabr paramzzabr, long paramLong, int paramInt1, int paramInt2)
  {
    this.zzi = 4;
    this.zzj = paramInt1;
    this.zzu = paramzzabr;
    this.zzv = paramLong;
    this.zzs = paramInt2;
  }
  
  private final boolean zzk(zzfd paramzzfd, byte[] paramArrayOfByte, int paramInt)
  {
    int i = Math.min(paramzzfd.zza(), paramInt - this.zzj);
    paramzzfd.zzB(paramArrayOfByte, this.zzj, i);
    i = this.zzj + i;
    this.zzj = i;
    return i == paramInt;
  }
  
  private static final boolean zzl(byte paramByte1, byte paramByte2)
  {
    return zzf(paramByte2 & 0xFF | 0xFF00);
  }
  
  private static final boolean zzm(zzfd paramzzfd, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramzzfd.zza() < paramInt) {
      return false;
    }
    paramzzfd.zzB(paramArrayOfByte, 0, paramInt);
    return true;
  }
  
  public final void zza(zzfd paramzzfd)
    throws zzce
  {
    Objects.requireNonNull(this.zzg);
    int i = zzfn.zza;
    while (paramzzfd.zza() > 0)
    {
      i = this.zzi;
      int j;
      Object localObject;
      int k;
      byte b;
      byte[] arrayOfByte;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              i = Math.min(paramzzfd.zza(), this.zzs - this.zzj);
              this.zzu.zzq(paramzzfd, i);
              j = this.zzj + i;
              this.zzj = j;
              i = this.zzs;
              if (j == i)
              {
                long l = this.zzt;
                if (l != -9223372036854775807L)
                {
                  this.zzu.zzs(l, 1, i, 0, null);
                  this.zzt += this.zzv;
                }
                zzh();
              }
            }
            else
            {
              if (true != this.zzl) {
                i = 5;
              } else {
                i = 7;
              }
              if (zzk(paramzzfd, this.zzc.zza, i))
              {
                this.zzc.zzj(0);
                if (!this.zzq)
                {
                  i = this.zzc.zzd(2) + 1;
                  if (i != 2)
                  {
                    localObject = new StringBuilder();
                    ((StringBuilder)localObject).append("Detected audio object type: ");
                    ((StringBuilder)localObject).append(i);
                    ((StringBuilder)localObject).append(", but assuming AAC LC.");
                    zzer.zze("AdtsReader", ((StringBuilder)localObject).toString());
                  }
                  this.zzc.zzl(5);
                  k = this.zzc.zzd(3);
                  j = this.zzo;
                  i = zzzm.zza;
                  b = (byte)(j >> 1 & 0x7 | 0x10);
                  arrayOfByte = new byte[2];
                  arrayOfByte[0] = b;
                  arrayOfByte[1] = ((byte)(k << 3 & 0x78 | j << 7 & 0x80));
                  localObject = zzzm.zza(arrayOfByte);
                  zzak localzzak = new zzak();
                  localzzak.zzH(this.zzf);
                  localzzak.zzS("audio/mp4a-latm");
                  localzzak.zzx(((zzzl)localObject).zzc);
                  localzzak.zzw(((zzzl)localObject).zzb);
                  localzzak.zzT(((zzzl)localObject).zza);
                  localzzak.zzI(Collections.singletonList(arrayOfByte));
                  localzzak.zzK(this.zze);
                  localObject = localzzak.zzY();
                  this.zzr = (1024000000L / ((zzam)localObject).zzA);
                  this.zzg.zzk((zzam)localObject);
                  this.zzq = true;
                }
                else
                {
                  this.zzc.zzl(10);
                }
                this.zzc.zzl(4);
                j = this.zzc.zzd(13) - 7;
                i = j;
                if (this.zzl) {
                  i = j - 2;
                }
                zzj(this.zzg, this.zzr, 0, i);
              }
            }
          }
          else if (zzk(paramzzfd, this.zzd.zzH(), 10))
          {
            this.zzh.zzq(this.zzd, 10);
            this.zzd.zzF(6);
            zzj(this.zzh, 0L, 10, 10 + this.zzd.zzj());
          }
        }
        else if (paramzzfd.zza() != 0)
        {
          localObject = this.zzc;
          ((zzfc)localObject).zza[0] = paramzzfd.zzH()[paramzzfd.zzc()];
          ((zzfc)localObject).zzj(2);
          i = this.zzc.zzd(4);
          j = this.zzo;
          if ((j != -1) && (i != j))
          {
            zzg();
          }
          else
          {
            if (!this.zzm)
            {
              this.zzm = true;
              this.zzn = this.zzp;
              this.zzo = i;
            }
            zzi();
          }
        }
      }
      else
      {
        arrayOfByte = paramzzfd.zzH();
        i = paramzzfd.zzc();
        k = paramzzfd.zzd();
        label1108:
        label1223:
        label1228:
        label1231:
        for (;;)
        {
          if (i >= k) {
            break label1234;
          }
          j = i + 1;
          i = arrayOfByte[i] & 0xFF;
          if ((this.zzk == 512) && (zzl((byte)-1, (byte)i)))
          {
            if (!this.zzm)
            {
              int i1 = j - 2;
              paramzzfd.zzF(i1 + 1);
              if (!zzm(paramzzfd, this.zzc.zza, 1)) {
                break label1108;
              }
              this.zzc.zzj(4);
              int n = this.zzc.zzd(1);
              m = this.zzn;
              if ((m != -1) && (n != m)) {
                break label1108;
              }
              if (this.zzo != -1)
              {
                if (zzm(paramzzfd, this.zzc.zza, 1))
                {
                  this.zzc.zzj(2);
                  if (this.zzc.zzd(4) != this.zzo) {
                    break label1108;
                  }
                  paramzzfd.zzF(i1 + 2);
                }
              }
              else if (zzm(paramzzfd, this.zzc.zza, 4))
              {
                this.zzc.zzj(14);
                int i2 = this.zzc.zzd(13);
                if (i2 < 7) {
                  break label1108;
                }
                localObject = paramzzfd.zzH();
                m = paramzzfd.zzd();
                i1 += i2;
                if (i1 < m)
                {
                  i2 = localObject[i1];
                  if (i2 == -1)
                  {
                    i1++;
                    if (i1 != m)
                    {
                      b = localObject[i1];
                      if ((!zzl((byte)-1, b)) || ((b & 0x8) >> 3 != n)) {
                        break label1108;
                      }
                    }
                  }
                  else
                  {
                    if (i2 != 73) {
                      break label1108;
                    }
                    n = i1 + 1;
                    if (n != m)
                    {
                      if (localObject[n] != 68) {
                        break label1108;
                      }
                      n = i1 + 2;
                      if ((n != m) && (localObject[n] != 51)) {
                        break label1108;
                      }
                    }
                  }
                }
              }
            }
            this.zzp = ((i & 0x8) >> 3);
            boolean bool;
            if (1 != (i & 0x1 ^ 0x1)) {
              bool = false;
            } else {
              bool = true;
            }
            this.zzl = bool;
            if (!this.zzm)
            {
              this.zzi = 1;
              this.zzj = 0;
            }
            else
            {
              zzi();
            }
            paramzzfd.zzF(j);
            break;
          }
          int m = this.zzk;
          i = m | i;
          if (i != 329)
          {
            if (i != 511)
            {
              if (i != 836)
              {
                if (i != 1075)
                {
                  if (m != 256)
                  {
                    this.zzk = 256;
                    i = j - 1;
                    break label1231;
                  }
                  break label1228;
                }
                this.zzi = 2;
                this.zzj = 3;
                this.zzs = 0;
                this.zzd.zzF(0);
                paramzzfd.zzF(j);
                break;
              }
              i = 1024;
              break label1223;
            }
            i = 512;
            break label1223;
          }
          i = 768;
          this.zzk = i;
          i = j;
        }
        label1234:
        paramzzfd.zzF(i);
      }
    }
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    paramzzajt.zzc();
    this.zzf = paramzzajt.zzb();
    zzabr localzzabr = paramzzaar.zzv(paramzzajt.zza(), 1);
    this.zzg = localzzabr;
    this.zzu = localzzabr;
    if (this.zzb)
    {
      paramzzajt.zzc();
      localzzabr = paramzzaar.zzv(paramzzajt.zza(), 5);
      this.zzh = localzzabr;
      paramzzaar = new zzak();
      paramzzaar.zzH(paramzzajt.zzb());
      paramzzaar.zzS("application/id3");
      localzzabr.zzk(paramzzaar.zzY());
      return;
    }
    this.zzh = new zzaan();
  }
  
  public final void zzc() {}
  
  public final void zzd(long paramLong, int paramInt)
  {
    if (paramLong != -9223372036854775807L) {
      this.zzt = paramLong;
    }
  }
  
  public final void zze()
  {
    this.zzt = -9223372036854775807L;
    zzg();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */