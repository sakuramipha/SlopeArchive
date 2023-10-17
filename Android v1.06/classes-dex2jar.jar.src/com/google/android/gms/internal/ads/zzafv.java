package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzafv
  implements zzaao
{
  public static final zzaav zza = zzaft.zza;
  private static final zzaec zzb = zzafu.zza;
  private final zzfd zzc = new zzfd(10);
  private final zzabh zzd = new zzabh();
  private final zzabd zze = new zzabd();
  private final zzabf zzf = new zzabf();
  private final zzabr zzg;
  private zzaar zzh;
  private zzabr zzi;
  private zzabr zzj;
  private int zzk;
  private zzca zzl;
  private long zzm = -9223372036854775807L;
  private long zzn;
  private long zzo;
  private int zzp;
  private zzafx zzq;
  private boolean zzr;
  
  public zzafv()
  {
    this(0);
  }
  
  public zzafv(int paramInt)
  {
    zzaan localzzaan = new zzaan();
    this.zzg = localzzaan;
    this.zzj = localzzaan;
  }
  
  @RequiresNonNull({"extractorOutput", "realTrackOutput"})
  private final int zzf(zzaap paramzzaap)
    throws IOException
  {
    int i = this.zzk;
    int k = -1;
    if (i == 0) {
      try
      {
        zzk(paramzzaap, false);
      }
      catch (EOFException paramzzaap)
      {
        return -1;
      }
    }
    Object localObject1;
    Object localObject2;
    label126:
    label129:
    label208:
    long l2;
    long l1;
    if (this.zzq == null)
    {
      localObject1 = new zzfd(this.zzd.zzc);
      Object localObject3 = ((zzfd)localObject1).zzH();
      i = this.zzd.zzc;
      localObject2 = (zzaae)paramzzaap;
      ((zzaae)localObject2).zzm((byte[])localObject3, 0, i, false);
      localObject3 = this.zzd;
      if ((((zzabh)localObject3).zza & 0x1) != 0)
      {
        if (((zzabh)localObject3).zze != 1)
        {
          j = 36;
          break label129;
        }
      }
      else {
        if (((zzabh)localObject3).zze == 1) {
          break label126;
        }
      }
      j = 21;
      break label129;
      j = 13;
      if (((zzfd)localObject1).zzd() >= j + 4)
      {
        ((zzfd)localObject1).zzF(j);
        i = ((zzfd)localObject1).zze();
        if (i != 1483304551)
        {
          if (i == 1231971951)
          {
            i = 1231971951;
            break label208;
          }
        }
        else {
          break label208;
        }
      }
      if (((zzfd)localObject1).zzd() >= 40)
      {
        ((zzfd)localObject1).zzF(36);
        if (((zzfd)localObject1).zze() == 1447187017)
        {
          i = 1447187017;
          break label208;
        }
      }
      i = 0;
      if ((i != 1483304551) && (i != 1231971951))
      {
        if (i == 1447187017)
        {
          localObject1 = zzafy.zza(paramzzaap.zzd(), paramzzaap.zzf(), this.zzd, (zzfd)localObject1);
          ((zzaae)localObject2).zzo(this.zzd.zzc, false);
        }
        else
        {
          paramzzaap.zzj();
          localObject1 = null;
        }
      }
      else
      {
        localObject1 = zzafz.zza(paramzzaap.zzd(), paramzzaap.zzf(), this.zzd, (zzfd)localObject1);
        if ((localObject1 != null) && (!this.zze.zza()))
        {
          paramzzaap.zzj();
          ((zzaae)localObject2).zzl(j + 141, false);
          ((zzaae)localObject2).zzm(this.zzc.zzH(), 0, 3, false);
          this.zzc.zzF(0);
          localObject3 = this.zze;
          int m = this.zzc.zzm();
          j = m >> 12;
          m &= 0xFFF;
          if ((j > 0) || (m > 0))
          {
            ((zzabd)localObject3).zza = j;
            ((zzabd)localObject3).zzb = m;
          }
        }
        ((zzaae)localObject2).zzo(this.zzd.zzc, false);
        if ((localObject1 != null) && (!((zzafx)localObject1).zzh()) && (i == 1231971951)) {
          localObject1 = zzh(paramzzaap, false);
        }
      }
      localObject2 = this.zzl;
      l2 = paramzzaap.zzf();
      if (localObject2 != null)
      {
        j = ((zzca)localObject2).zza();
        for (i = 0; i < j; i++)
        {
          localObject3 = ((zzca)localObject2).zzb(i);
          if ((localObject3 instanceof zzaej))
          {
            localObject3 = (zzaej)localObject3;
            j = ((zzca)localObject2).zza();
            for (i = 0; i < j; i++)
            {
              Object localObject4 = ((zzca)localObject2).zzb(i);
              if ((localObject4 instanceof zzaen))
              {
                localObject4 = (zzaen)localObject4;
                if (((zzaen)localObject4).zzf.equals("TLEN"))
                {
                  l1 = zzfn.zzo(Long.parseLong((String)((zzaen)localObject4).zzc.get(0)));
                  break label596;
                }
              }
            }
            l1 = -9223372036854775807L;
            label596:
            localObject2 = zzafs.zza(l2, (zzaej)localObject3, l1);
            break label619;
          }
        }
      }
      localObject2 = null;
      label619:
      if (this.zzr)
      {
        localObject2 = new zzafw();
      }
      else
      {
        if (localObject2 == null)
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = null;
          }
        }
        if (localObject2 != null) {
          ((zzafx)localObject2).zzh();
        } else {
          localObject2 = zzh(paramzzaap, false);
        }
      }
      this.zzq = ((zzafx)localObject2);
      this.zzh.zzN((zzabn)localObject2);
      localObject1 = this.zzj;
      localObject2 = new zzak();
      ((zzak)localObject2).zzS(this.zzd.zzb);
      ((zzak)localObject2).zzL(4096);
      ((zzak)localObject2).zzw(this.zzd.zze);
      ((zzak)localObject2).zzT(this.zzd.zzd);
      ((zzak)localObject2).zzC(this.zze.zza);
      ((zzak)localObject2).zzD(this.zze.zzb);
      ((zzak)localObject2).zzM(this.zzl);
      ((zzabr)localObject1).zzk(((zzak)localObject2).zzY());
      this.zzo = paramzzaap.zzf();
    }
    else
    {
      l1 = this.zzo;
      if (l1 != 0L)
      {
        l2 = paramzzaap.zzf();
        if (l2 < l1) {
          ((zzaae)paramzzaap).zzo((int)(l1 - l2), false);
        }
      }
    }
    int j = this.zzp;
    i = j;
    if (j == 0)
    {
      paramzzaap.zzj();
      if (zzj(paramzzaap))
      {
        i = k;
        break label1094;
      }
      this.zzc.zzF(0);
      i = this.zzc.zze();
      if ((zzi(i, this.zzk)) && (zzabi.zzb(i) != -1))
      {
        this.zzd.zza(i);
        if (this.zzm == -9223372036854775807L) {
          this.zzm = this.zzq.zzc(paramzzaap.zzf());
        }
        localObject1 = this.zzd;
        i = ((zzabh)localObject1).zzc;
        this.zzp = i;
        localObject2 = this.zzq;
        if ((localObject2 instanceof zzafr))
        {
          paramzzaap = (zzafr)localObject2;
          zzg(this.zzn + ((zzabh)localObject1).zzg);
          throw null;
        }
      }
      else
      {
        ((zzaae)paramzzaap).zzo(1, false);
        this.zzk = 0;
        break label1092;
      }
    }
    i = this.zzj.zze(paramzzaap, i, true);
    if (i == -1)
    {
      i = k;
    }
    else
    {
      i = this.zzp - i;
      this.zzp = i;
      if (i <= 0) {
        break label1096;
      }
      label1092:
      i = 0;
    }
    label1094:
    return i;
    label1096:
    this.zzj.zzs(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
    this.zzn += this.zzd.zzg;
    this.zzp = 0;
    return 0;
  }
  
  private final long zzg(long paramLong)
  {
    return this.zzm + paramLong * 1000000L / this.zzd.zzd;
  }
  
  private final zzafx zzh(zzaap paramzzaap, boolean paramBoolean)
    throws IOException
  {
    byte[] arrayOfByte = this.zzc.zzH();
    ((zzaae)paramzzaap).zzm(arrayOfByte, 0, 4, false);
    this.zzc.zzF(0);
    this.zzd.zza(this.zzc.zze());
    return new zzafq(paramzzaap.zzd(), paramzzaap.zzf(), this.zzd, false);
  }
  
  private static boolean zzi(int paramInt, long paramLong)
  {
    return (paramInt & 0xFFFE0C00) == (paramLong & 0xFFFFFFFFFFFE0C00);
  }
  
  private final boolean zzj(zzaap paramzzaap)
    throws IOException
  {
    zzafx localzzafx = this.zzq;
    if (localzzafx != null)
    {
      long l = localzzafx.zzb();
      if ((l != -1L) && (paramzzaap.zze() > l - 4L)) {
        return true;
      }
    }
    try
    {
      boolean bool = paramzzaap.zzm(this.zzc.zzH(), 0, 4, true);
      return !bool;
    }
    catch (EOFException paramzzaap) {}
    return true;
  }
  
  private final boolean zzk(zzaap paramzzaap, boolean paramBoolean)
    throws IOException
  {
    paramzzaap.zzj();
    int k;
    if (paramzzaap.zzf() == 0L)
    {
      zzca localzzca = this.zzf.zza(paramzzaap, null);
      this.zzl = localzzca;
      if (localzzca != null) {
        this.zze.zzb(localzzca);
      }
      k = (int)paramzzaap.zze();
      if (!paramBoolean) {
        ((zzaae)paramzzaap).zzo(k, false);
      }
    }
    else
    {
      k = 0;
    }
    int i = 0;
    int j = 0;
    int m = 0;
    for (;;)
    {
      int i2;
      int n;
      if (zzj(paramzzaap))
      {
        if (j <= 0) {
          throw new EOFException();
        }
      }
      else
      {
        this.zzc.zzF(0);
        int i1 = this.zzc.zze();
        if ((i == 0) || (zzi(i1, i)))
        {
          i2 = zzabi.zzb(i1);
          if (i2 != -1) {}
        }
        else
        {
          if (true != paramBoolean) {
            i = 131072;
          } else {
            i = 32768;
          }
          j = m + 1;
          if (m == i)
          {
            if (paramBoolean) {
              return false;
            }
            throw zzce.zza("Searched too many bytes.", null);
          }
          if (paramBoolean)
          {
            paramzzaap.zzj();
            ((zzaae)paramzzaap).zzl(k + j, false);
          }
          else
          {
            ((zzaae)paramzzaap).zzo(1, false);
          }
          m = j;
          i = 0;
          j = 0;
          continue;
        }
        n = j + 1;
        if (n == 1)
        {
          this.zzd.zza(i1);
          j = i1;
          break label318;
        }
        j = i;
        if (n != 4) {
          break label318;
        }
      }
      if (paramBoolean) {
        ((zzaae)paramzzaap).zzo(k + m, false);
      } else {
        paramzzaap.zzj();
      }
      this.zzk = i;
      return true;
      label318:
      ((zzaae)paramzzaap).zzl(i2 - 4, false);
      i = j;
      j = n;
    }
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    zzdy.zzb(this.zzi);
    int i = zzfn.zza;
    i = zzf(paramzzaap);
    if ((i == -1) && ((this.zzq instanceof zzafr)))
    {
      long l = zzg(this.zzn);
      if (this.zzq.zze() != l)
      {
        paramzzaap = (zzafr)this.zzq;
        throw null;
      }
    }
    return i;
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzh = paramzzaar;
    paramzzaar = paramzzaar.zzv(0, 1);
    this.zzi = paramzzaar;
    this.zzj = paramzzaar;
    this.zzh.zzC();
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    this.zzk = 0;
    this.zzm = -9223372036854775807L;
    this.zzn = 0L;
    this.zzp = 0;
    Object localObject = this.zzq;
    if (!(localObject instanceof zzafr)) {
      return;
    }
    localObject = (zzafr)localObject;
    throw null;
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    return zzk(paramzzaap, true);
  }
  
  public final void zze()
  {
    this.zzr = true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzafv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */