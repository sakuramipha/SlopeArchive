package com.google.android.gms.internal.ads;

public final class zzaiy
  implements zzaju
{
  private final zzaih zza;
  private final zzfc zzb;
  private int zzc;
  private int zzd;
  private zzfl zze;
  private boolean zzf;
  private boolean zzg;
  private boolean zzh;
  private int zzi;
  private int zzj;
  private boolean zzk;
  
  public zzaiy(zzaih paramzzaih)
  {
    this.zza = paramzzaih;
    this.zzb = new zzfc(new byte[10], 10);
    this.zzc = 0;
  }
  
  private final void zzd(int paramInt)
  {
    this.zzc = paramInt;
    this.zzd = 0;
  }
  
  private final boolean zze(zzfd paramzzfd, byte[] paramArrayOfByte, int paramInt)
  {
    int i = Math.min(paramzzfd.zza(), paramInt - this.zzd);
    if (i <= 0) {
      return true;
    }
    if (paramArrayOfByte == null) {
      paramzzfd.zzG(i);
    } else {
      paramzzfd.zzB(paramArrayOfByte, this.zzd, i);
    }
    i = this.zzd + i;
    this.zzd = i;
    return i == paramInt;
  }
  
  public final void zza(zzfd paramzzfd, int paramInt)
    throws zzce
  {
    zzdy.zzb(this.zze);
    int i = -1;
    int j = 1;
    int k;
    Object localObject;
    if ((paramInt & 0x1) != 0)
    {
      k = this.zzc;
      if ((k != 0) && (k != 1)) {
        if (k != 2)
        {
          k = this.zzj;
          if (k != -1)
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Unexpected start indicator: expected ");
            ((StringBuilder)localObject).append(k);
            ((StringBuilder)localObject).append(" more bytes");
            zzer.zze("PesReader", ((StringBuilder)localObject).toString());
          }
          this.zza.zzc();
        }
        else
        {
          zzer.zze("PesReader", "Unexpected start indicator reading extended header");
        }
      }
      zzd(1);
    }
    int m = paramInt;
    paramInt = j;
    label905:
    while (paramzzfd.zza() > 0)
    {
      k = this.zzc;
      if (k != 0)
      {
        j = 0;
        if (k != paramInt)
        {
          int n;
          if (k != 2)
          {
            k = paramzzfd.zza();
            n = this.zzj;
            if (n != i) {
              j = k - n;
            }
            n = k;
            if (j > 0)
            {
              n = k - j;
              paramzzfd.zzE(paramzzfd.zzc() + n);
            }
            this.zza.zza(paramzzfd);
            int i1 = this.zzj;
            k = i;
            j = paramInt;
            if (i1 != i)
            {
              n = i1 - n;
              this.zzj = n;
              k = i;
              j = paramInt;
              if (n == 0)
              {
                this.zza.zzc();
                zzd(paramInt);
                k = i;
                j = paramInt;
              }
            }
          }
          else
          {
            n = Math.min(10, this.zzi);
            k = i;
            j = paramInt;
            if (zze(paramzzfd, this.zzb.zza, n))
            {
              k = i;
              j = paramInt;
              if (zze(paramzzfd, null, this.zzi))
              {
                this.zzb.zzj(0);
                long l1;
                if (this.zzf)
                {
                  this.zzb.zzl(4);
                  l1 = this.zzb.zzd(3);
                  this.zzb.zzl(paramInt);
                  j = this.zzb.zzd(15) << 15;
                  this.zzb.zzl(paramInt);
                  long l2 = this.zzb.zzd(15);
                  this.zzb.zzl(paramInt);
                  if ((!this.zzh) && (this.zzg))
                  {
                    this.zzb.zzl(4);
                    long l4 = this.zzb.zzd(3);
                    this.zzb.zzl(paramInt);
                    i = this.zzb.zzd(15);
                    this.zzb.zzl(paramInt);
                    l3 = this.zzb.zzd(15);
                    this.zzb.zzl(paramInt);
                    this.zze.zzb(l4 << 30 | i << 15 | l3);
                    this.zzh = true;
                  }
                  long l3 = j;
                  l1 = this.zze.zzb(l1 << 30 | l3 | l2);
                }
                else
                {
                  l1 = -9223372036854775807L;
                }
                if (true != this.zzk) {
                  paramInt = 0;
                } else {
                  paramInt = 4;
                }
                m |= paramInt;
                this.zza.zzd(l1, m);
                zzd(3);
                i = -1;
                paramInt = 1;
              }
            }
          }
        }
        else
        {
          if (zze(paramzzfd, this.zzb.zza, 9))
          {
            localObject = this.zzb;
            paramInt = 0;
            ((zzfc)localObject).zzj(0);
            i = this.zzb.zzd(24);
            j = 1;
            if (i != 1)
            {
              localObject = new StringBuilder();
              ((StringBuilder)localObject).append("Unexpected start code prefix: ");
              ((StringBuilder)localObject).append(i);
              zzer.zze("PesReader", ((StringBuilder)localObject).toString());
              this.zzj = -1;
            }
            else
            {
              this.zzb.zzl(8);
              i = this.zzb.zzd(16);
              this.zzb.zzl(5);
              this.zzk = this.zzb.zzn();
              this.zzb.zzl(2);
              this.zzf = this.zzb.zzn();
              this.zzg = this.zzb.zzn();
              this.zzb.zzl(6);
              paramInt = this.zzb.zzd(8);
              this.zzi = paramInt;
              if (i == 0) {
                this.zzj = -1;
              }
              for (;;)
              {
                paramInt = 2;
                break;
                paramInt = i - 3 - paramInt;
                this.zzj = paramInt;
                if (paramInt < 0)
                {
                  localObject = new StringBuilder();
                  ((StringBuilder)localObject).append("Found negative packet payload size: ");
                  ((StringBuilder)localObject).append(paramInt);
                  zzer.zze("PesReader", ((StringBuilder)localObject).toString());
                  this.zzj = -1;
                }
              }
            }
            i = -1;
            zzd(paramInt);
            paramInt = j;
            break label905;
          }
          k = -1;
          j = 1;
        }
        i = k;
        paramInt = j;
      }
      else
      {
        paramzzfd.zzG(paramzzfd.zza());
      }
    }
  }
  
  public final void zzb(zzfl paramzzfl, zzaar paramzzaar, zzajt paramzzajt)
  {
    this.zze = paramzzfl;
    this.zza.zzb(paramzzaar, paramzzajt);
  }
  
  public final void zzc()
  {
    this.zzc = 0;
    this.zzd = 0;
    this.zzh = false;
    this.zza.zze();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaiy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */