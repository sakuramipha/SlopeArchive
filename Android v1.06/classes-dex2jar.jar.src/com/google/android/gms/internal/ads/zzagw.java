package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class zzagw
  implements zzaao, zzabn
{
  public static final zzaav zza = zzagt.zza;
  private final zzfd zzb = new zzfd(zzew.zza);
  private final zzfd zzc = new zzfd(4);
  private final zzfd zzd = new zzfd();
  private final zzfd zze = new zzfd(16);
  private final ArrayDeque zzf = new ArrayDeque();
  private final zzagy zzg = new zzagy();
  private final List zzh = new ArrayList();
  private int zzi = 0;
  private int zzj;
  private long zzk;
  private int zzl;
  private zzfd zzm;
  private int zzn = -1;
  private int zzo;
  private int zzp;
  private int zzq;
  private zzaar zzr = zzaar.zza;
  private zzagv[] zzs = new zzagv[0];
  private long[][] zzt;
  private int zzu;
  private long zzv;
  private int zzw;
  private zzaev zzx;
  
  public zzagw()
  {
    this(0);
  }
  
  public zzagw(int paramInt) {}
  
  private static int zzf(int paramInt)
  {
    if (paramInt != 1751476579)
    {
      if (paramInt != 1903435808) {
        return 0;
      }
      return 1;
    }
    return 2;
  }
  
  private static int zzi(zzahd paramzzahd, long paramLong)
  {
    int i = paramzzahd.zza(paramLong);
    if (i == -1) {
      return paramzzahd.zzb(paramLong);
    }
    return i;
  }
  
  private static long zzj(zzahd paramzzahd, long paramLong1, long paramLong2)
  {
    int i = zzi(paramzzahd, paramLong1);
    if (i == -1) {
      return paramLong2;
    }
    return Math.min(paramzzahd.zzc[i], paramLong2);
  }
  
  private final void zzk()
  {
    this.zzi = 0;
    this.zzl = 0;
  }
  
  private final void zzl(long paramLong)
    throws zzce
  {
    while ((!this.zzf.isEmpty()) && (((zzaga)this.zzf.peek()).zza == paramLong))
    {
      Object localObject5 = (zzaga)this.zzf.pop();
      if (((zzaga)localObject5).zzd == 1836019574)
      {
        ArrayList localArrayList = new ArrayList();
        int i = this.zzw;
        Object localObject6 = new zzabd();
        Object localObject1 = ((zzaga)localObject5).zzb(1969517665);
        if (localObject1 != null)
        {
          localObject1 = zzagl.zzb((zzagb)localObject1);
          localObject2 = ((zzagk)localObject1).zza;
          localObject4 = ((zzagk)localObject1).zzb;
          localObject1 = ((zzagk)localObject1).zzc;
          if (localObject2 != null) {
            ((zzabd)localObject6).zzb((zzca)localObject2);
          }
        }
        else
        {
          localObject1 = null;
          localObject2 = null;
          localObject4 = null;
        }
        Object localObject3 = ((zzaga)localObject5).zza(1835365473);
        if (localObject3 != null) {
          localObject3 = zzagl.zza((zzaga)localObject3);
        } else {
          localObject3 = null;
        }
        boolean bool;
        if (i == 1) {
          bool = true;
        } else {
          bool = false;
        }
        Object localObject7 = zzagu.zza;
        Object localObject8 = zzagl.zzc((zzaga)localObject5, (zzabd)localObject6, -9223372036854775807L, null, false, bool, (zzfon)localObject7);
        int k = ((List)localObject8).size();
        long l1 = -9223372036854775807L;
        localObject5 = localObject1;
        i = -1;
        int j = 0;
        long l2 = -9223372036854775807L;
        localObject7 = localObject3;
        localObject1 = localObject6;
        localObject6 = localObject8;
        long l3;
        int m;
        for (;;)
        {
          l3 = 0L;
          if (j >= k) {
            break;
          }
          localObject3 = (zzahd)((List)localObject6).get(j);
          if (((zzahd)localObject3).zzb != 0)
          {
            zzaha localzzaha = ((zzahd)localObject3).zza;
            l3 = localzzaha.zze;
            if (l3 != l1) {
              l1 = l3;
            } else {
              l1 = ((zzahd)localObject3).zzh;
            }
            l2 = Math.max(l2, l1);
            zzagv localzzagv = new zzagv(localzzaha, (zzahd)localObject3, this.zzr.zzv(j, localzzaha.zzb));
            if ("audio/true-hd".equals(localzzaha.zzf.zzm)) {
              m = ((zzahd)localObject3).zze * 16;
            } else {
              m = ((zzahd)localObject3).zze + 30;
            }
            zzak localzzak = localzzaha.zzf.zzb();
            localzzak.zzL(m);
            if ((localzzaha.zzb == 2) && (l1 > 0L))
            {
              m = ((zzahd)localObject3).zzb;
              if (m > 1)
              {
                float f = (float)l1;
                localzzak.zzE(m / (f / 1000000.0F));
              }
            }
            int n = localzzaha.zzb;
            m = zzags.zzb;
            if ((n == 1) && (((zzabd)localObject1).zza()))
            {
              localzzak.zzC(((zzabd)localObject1).zza);
              localzzak.zzD(((zzabd)localObject1).zzb);
            }
            m = localzzaha.zzb;
            if (this.zzh.isEmpty()) {
              localObject8 = null;
            } else {
              localObject8 = new zzca(this.zzh);
            }
            zzca localzzca = new zzca(-9223372036854775807L, new zzbz[0]);
            if (m == 1)
            {
              if (localObject2 == null) {
                break label692;
              }
              localObject3 = localObject2;
            }
            for (;;)
            {
              break;
              if (m == 2)
              {
                localObject3 = localObject1;
                if (localObject7 != null) {
                  for (m = 0;; m++)
                  {
                    localObject3 = localObject1;
                    if (m >= ((zzca)localObject7).zza()) {
                      break;
                    }
                    localObject3 = ((zzca)localObject7).zzb(m);
                    if ((localObject3 instanceof zzaes))
                    {
                      localObject3 = (zzaes)localObject3;
                      if ("com.android.capture.fps".equals(((zzaes)localObject3).zza))
                      {
                        localObject3 = new zzca(-9223372036854775807L, new zzbz[] { localObject3 });
                        break label699;
                      }
                    }
                  }
                }
                localObject1 = localObject3;
                localObject3 = localzzca;
              }
              else
              {
                label692:
                localObject3 = localzzca;
              }
            }
            label699:
            l1 = -9223372036854775807L;
            for (m = 0; m < 3; m++) {
              localObject3 = ((zzca)localObject3).zzd(new zzca[] { localObject4, localObject8, localObject5 }[m]);
            }
            if (((zzca)localObject3).zza() > 0) {
              localzzak.zzM((zzca)localObject3);
            }
            localzzagv.zzc.zzk(localzzak.zzY());
            if ((localzzaha.zzb == 2) && (i == -1)) {
              i = localArrayList.size();
            }
            localArrayList.add(localzzagv);
          }
          j++;
        }
        this.zzu = i;
        this.zzv = l2;
        localObject3 = (zzagv[])localArrayList.toArray(new zzagv[0]);
        this.zzs = ((zzagv[])localObject3);
        i = localObject3.length;
        Object localObject4 = new long[i][];
        localObject5 = new int[i];
        Object localObject2 = new long[i];
        localObject7 = new boolean[i];
        for (i = 0; i < localObject3.length; i++)
        {
          localObject4[i] = new long[localObject3[i].zzb.zzb];
          localObject2[i] = localObject3[i].zzb.zzf[0];
        }
        j = 0;
        l1 = l3;
        while (j < localObject3.length)
        {
          l3 = Long.MAX_VALUE;
          i = 0;
          for (k = -1; i < localObject3.length; k = m)
          {
            l2 = l3;
            m = k;
            if (localObject7[i] == 0)
            {
              long l4 = localObject2[i];
              l2 = l3;
              m = k;
              if (l4 <= l3)
              {
                m = i;
                l2 = l4;
              }
            }
            i++;
            l3 = l2;
          }
          i = localObject5[k];
          localObject6 = localObject4[k];
          localObject6[i] = l1;
          localObject1 = localObject3[k].zzb;
          l1 += localObject1.zzd[i];
          i++;
          localObject5[k] = i;
          if (i < localObject6.length)
          {
            localObject2[k] = localObject1.zzf[i];
          }
          else
          {
            localObject7[k] = 1;
            j++;
          }
        }
        this.zzt = ((long[][])localObject4);
        this.zzr.zzC();
        this.zzr.zzN(this);
        this.zzf.clear();
        this.zzi = 2;
      }
      else if (!this.zzf.isEmpty())
      {
        ((zzaga)this.zzf.peek()).zzc((zzaga)localObject5);
      }
    }
    if (this.zzi != 2) {
      zzk();
    }
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    for (;;)
    {
      int i = this.zzi;
      int i4 = -1;
      int j;
      long l2;
      long l1;
      Object localObject1;
      long l3;
      if (i != 0)
      {
        if (i != 1)
        {
          long l8 = paramzzaap.zzf();
          i = this.zzn;
          j = i;
          int n;
          int k;
          if (i == -1)
          {
            long l4 = Long.MAX_VALUE;
            l2 = Long.MAX_VALUE;
            l1 = l2;
            i = 0;
            int i1 = 1;
            m = -1;
            j = -1;
            int i2;
            for (n = 1;; n = i2)
            {
              localObject1 = this.zzs;
              if (i >= localObject1.length) {
                break;
              }
              localObject1 = localObject1[i];
              k = ((zzagv)localObject1).zze;
              localObject1 = ((zzagv)localObject1).zzb;
              long l7;
              long l6;
              long l5;
              int i3;
              if (k == ((zzahd)localObject1).zzb)
              {
                l7 = l4;
                l6 = l2;
                l5 = l1;
                i3 = j;
                i2 = n;
              }
              else
              {
                l5 = localObject1.zzc[k];
                localObject1 = this.zzt;
                i2 = zzfn.zza;
                l3 = localObject1[i][k];
                l5 -= l8;
                if ((l5 >= 0L) && (l5 < 262144L)) {
                  k = 0;
                } else {
                  k = 1;
                }
                if (k == 0)
                {
                  if (n != 0) {
                    break label228;
                  }
                  n = 0;
                }
                if ((k == n) && (l5 < l1))
                {
                  label228:
                  n = k;
                  j = i;
                  l1 = l5;
                  l2 = l3;
                }
                l7 = l4;
                l6 = l2;
                l5 = l1;
                i3 = j;
                i2 = n;
                if (l3 < l4)
                {
                  m = i;
                  i2 = n;
                  i3 = j;
                  l5 = l1;
                  l6 = l2;
                  i1 = k;
                  l7 = l3;
                }
              }
              i++;
              l4 = l7;
              l2 = l6;
              l1 = l5;
              j = i3;
            }
            if ((l4 != Long.MAX_VALUE) && (i1 != 0) && (l2 >= l4 + 10485760L)) {
              i = m;
            } else {
              i = j;
            }
            this.zzn = i;
            j = i;
            if (i == -1)
            {
              i = i4;
              break label992;
            }
          }
          localObject1 = this.zzs[j];
          zzabr localzzabr = ((zzagv)localObject1).zzc;
          int m = ((zzagv)localObject1).zze;
          Object localObject2 = ((zzagv)localObject1).zzb;
          l1 = localObject2.zzc[m];
          j = localObject2.zzd[m];
          localObject2 = ((zzagv)localObject1).zzd;
          l2 = l1 - l8 + this.zzo;
          if ((l2 >= 0L) && (l2 < 262144L))
          {
            l1 = l2;
            i = j;
            if (((zzagv)localObject1).zza.zzg == 1)
            {
              l1 = l2 + 8L;
              i = j - 8;
            }
            paramzzaap.zzk((int)l1);
            paramzzabk = ((zzagv)localObject1).zza;
            j = paramzzabk.zzj;
            if (j != 0)
            {
              paramzzabk = this.zzc.zzH();
              paramzzabk[0] = 0;
              paramzzabk[1] = 0;
              paramzzabk[2] = 0;
              n = 4 - j;
              for (;;)
              {
                k = i;
                if (this.zzp >= i) {
                  break;
                }
                k = this.zzq;
                if (k == 0)
                {
                  paramzzaap.zzi(paramzzabk, n, j);
                  this.zzo += j;
                  this.zzc.zzF(0);
                  k = this.zzc.zze();
                  if (k >= 0)
                  {
                    this.zzq = k;
                    this.zzb.zzF(0);
                    localzzabr.zzq(this.zzb, 4);
                    this.zzp += 4;
                    i += n;
                  }
                  else
                  {
                    throw zzce.zza("Invalid NAL length", null);
                  }
                }
                else
                {
                  k = localzzabr.zze(paramzzaap, k, false);
                  this.zzo += k;
                  this.zzp += k;
                  this.zzq -= k;
                }
              }
            }
            if ("audio/ac4".equals(paramzzabk.zzf.zzm))
            {
              if (this.zzp == 0)
              {
                zzzs.zzb(i, this.zzd);
                localzzabr.zzq(this.zzd, 7);
                this.zzp += 7;
              }
              j = i + 7;
            }
            else
            {
              j = i;
              if (localObject2 != null)
              {
                ((zzabs)localObject2).zzd(paramzzaap);
                j = i;
              }
            }
            for (;;)
            {
              i = this.zzp;
              k = j;
              if (i >= j) {
                break;
              }
              i = localzzabr.zze(paramzzaap, j - i, false);
              this.zzo += i;
              this.zzp += i;
              this.zzq -= i;
            }
            paramzzaap = ((zzagv)localObject1).zzb;
            l1 = paramzzaap.zzf[m];
            i = paramzzaap.zzg[m];
            if (localObject2 != null)
            {
              ((zzabs)localObject2).zzc(localzzabr, l1, i, k, 0, null);
              if (m + 1 == ((zzagv)localObject1).zzb.zzb) {
                ((zzabs)localObject2).zza(localzzabr, null);
              }
            }
            else
            {
              localzzabr.zzs(l1, i, k, 0, null);
            }
            ((zzagv)localObject1).zze += 1;
            this.zzn = -1;
            this.zzo = 0;
            this.zzp = 0;
            this.zzq = 0;
            i = 0;
          }
          else
          {
            paramzzabk.zza = l1;
            i = 1;
          }
          label992:
          return i;
        }
        l1 = this.zzk - this.zzl;
        l2 = paramzzaap.zzf();
        localObject1 = this.zzm;
        if (localObject1 != null)
        {
          paramzzaap.zzi(((zzfd)localObject1).zzH(), this.zzl, (int)l1);
          if (this.zzj == 1718909296)
          {
            ((zzfd)localObject1).zzF(8);
            i = zzf(((zzfd)localObject1).zze());
            if (i == 0)
            {
              ((zzfd)localObject1).zzG(4);
              while (((zzfd)localObject1).zza() > 0)
              {
                i = zzf(((zzfd)localObject1).zze());
                if (i != 0) {
                  break label1108;
                }
              }
              i = 0;
            }
            label1108:
            this.zzw = i;
          }
          else if (!this.zzf.isEmpty())
          {
            ((zzaga)this.zzf.peek()).zzd(new zzagb(this.zzj, (zzfd)localObject1));
          }
        }
        else
        {
          if (l1 >= 262144L) {
            break label1178;
          }
          paramzzaap.zzk((int)l1);
        }
        i = 0;
        break label1193;
        label1178:
        paramzzabk.zza = (paramzzaap.zzf() + l1);
        i = 1;
        label1193:
        zzl(l2 + l1);
        if ((i != 0) && (this.zzi != 2)) {
          return 1;
        }
      }
      else
      {
        if (this.zzl == 0)
        {
          if (!paramzzaap.zzn(this.zze.zzH(), 0, 8, true)) {
            return -1;
          }
          this.zzl = 8;
          this.zze.zzF(0);
          this.zzk = this.zze.zzs();
          this.zzj = this.zze.zze();
        }
        l1 = this.zzk;
        if (l1 == 1L)
        {
          paramzzaap.zzi(this.zze.zzH(), 8, 8);
          this.zzl += 8;
          this.zzk = this.zze.zzt();
        }
        else if (l1 == 0L)
        {
          l2 = paramzzaap.zzd();
          l1 = l2;
          if (l2 == -1L)
          {
            localObject1 = (zzaga)this.zzf.peek();
            if (localObject1 != null) {
              l1 = ((zzaga)localObject1).zza;
            } else {
              l1 = -1L;
            }
          }
          if (l1 != -1L) {
            this.zzk = (l1 - paramzzaap.zzf() + this.zzl);
          }
        }
        l1 = this.zzk;
        i = this.zzl;
        if (l1 < i) {
          break;
        }
        j = this.zzj;
        if ((j != 1836019574) && (j != 1953653099) && (j != 1835297121) && (j != 1835626086) && (j != 1937007212) && (j != 1701082227) && (j != 1835365473))
        {
          if ((j != 1835296868) && (j != 1836476516) && (j != 1751411826) && (j != 1937011556) && (j != 1937011827) && (j != 1937011571) && (j != 1668576371) && (j != 1701606260) && (j != 1937011555) && (j != 1937011578) && (j != 1937013298) && (j != 1937007471) && (j != 1668232756) && (j != 1953196132) && (j != 1718909296) && (j != 1969517665) && (j != 1801812339) && (j != 1768715124))
          {
            l2 = paramzzaap.zzf();
            l1 = this.zzl;
            l2 -= l1;
            if (this.zzj == 1836086884) {
              this.zzx = new zzaev(0L, l2, -9223372036854775807L, l2 + l1, this.zzk - l1);
            }
            this.zzm = null;
            this.zzi = 1;
          }
          else
          {
            boolean bool;
            if (i == 8) {
              bool = true;
            } else {
              bool = false;
            }
            zzdy.zzf(bool);
            if (this.zzk <= 2147483647L) {
              bool = true;
            } else {
              bool = false;
            }
            zzdy.zzf(bool);
            localObject1 = new zzfd((int)this.zzk);
            System.arraycopy(this.zze.zzH(), 0, ((zzfd)localObject1).zzH(), 0, 8);
            this.zzm = ((zzfd)localObject1);
            this.zzi = 1;
          }
        }
        else
        {
          l3 = paramzzaap.zzf();
          l2 = this.zzk;
          l1 = this.zzl;
          if ((l2 != l1) && (this.zzj == 1835365473))
          {
            this.zzd.zzC(8);
            paramzzaap.zzh(this.zzd.zzH(), 0, 8);
            zzagl.zzd(this.zzd);
            paramzzaap.zzk(this.zzd.zzc());
            paramzzaap.zzj();
          }
          l1 = l3 + l2 - l1;
          this.zzf.push(new zzaga(this.zzj, l1));
          if (this.zzk == this.zzl) {
            zzl(l1);
          } else {
            zzk();
          }
        }
      }
    }
    throw zzce.zzc("Atom size less than header length (unsupported).");
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzr = paramzzaar;
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    this.zzf.clear();
    int i = 0;
    this.zzl = 0;
    this.zzn = -1;
    this.zzo = 0;
    this.zzp = 0;
    this.zzq = 0;
    if (paramLong1 == 0L)
    {
      zzk();
      return;
    }
    zzagv[] arrayOfzzagv = this.zzs;
    int m = arrayOfzzagv.length;
    while (i < m)
    {
      Object localObject = arrayOfzzagv[i];
      zzahd localzzahd = ((zzagv)localObject).zzb;
      int k = localzzahd.zza(paramLong2);
      int j = k;
      if (k == -1) {
        j = localzzahd.zzb(paramLong2);
      }
      ((zzagv)localObject).zze = j;
      localObject = ((zzagv)localObject).zzd;
      if (localObject != null) {
        ((zzabs)localObject).zzb();
      }
      i++;
    }
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    return zzagz.zzb(paramzzaap, false);
  }
  
  public final long zze()
  {
    return this.zzv;
  }
  
  public final zzabl zzg(long paramLong)
  {
    Object localObject = this.zzs;
    if (localObject.length == 0)
    {
      localObject = zzabo.zza;
      localObject = new zzabl((zzabo)localObject, (zzabo)localObject);
    }
    else
    {
      int i = this.zzu;
      long l2 = -1L;
      long l3;
      long l4;
      long l1;
      if (i != -1)
      {
        localObject = localObject[i].zzb;
        i = zzi((zzahd)localObject, paramLong);
        if (i == -1)
        {
          localObject = zzabo.zza;
          localObject = new zzabl((zzabo)localObject, (zzabo)localObject);
          break label355;
        }
        l3 = localObject.zzf[i];
        l4 = localObject.zzc[i];
        if ((l3 < paramLong) && (i < ((zzahd)localObject).zzb - 1))
        {
          int j = ((zzahd)localObject).zzb(paramLong);
          if ((j != -1) && (j != i))
          {
            l1 = localObject.zzf[j];
            paramLong = localObject.zzc[j];
            break label176;
          }
        }
        l1 = -9223372036854775807L;
        paramLong = l2;
        label176:
        l2 = l1;
        l1 = l4;
      }
      else
      {
        l1 = Long.MAX_VALUE;
        l4 = -9223372036854775807L;
        l3 = paramLong;
        paramLong = l2;
        l2 = l4;
      }
      i = 0;
      for (;;)
      {
        localObject = this.zzs;
        if (i >= localObject.length) {
          break;
        }
        long l5 = paramLong;
        l4 = l1;
        if (i != this.zzu)
        {
          localObject = localObject[i].zzb;
          l4 = zzj((zzahd)localObject, l3, l1);
          l1 = paramLong;
          if (l2 != -9223372036854775807L) {
            l1 = zzj((zzahd)localObject, l2, paramLong);
          }
          l5 = l1;
        }
        i++;
        paramLong = l5;
        l1 = l4;
      }
      localObject = new zzabo(l3, l1);
      if (l2 == -9223372036854775807L) {
        localObject = new zzabl((zzabo)localObject, (zzabo)localObject);
      } else {
        localObject = new zzabl((zzabo)localObject, new zzabo(l2, paramLong));
      }
    }
    label355:
    return (zzabl)localObject;
  }
  
  public final boolean zzh()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzagw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */