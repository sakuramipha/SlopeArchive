package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

final class zzagl
{
  private static final byte[] zza = "OpusHead".getBytes(zzfol.zzc);
  
  static
  {
    int i = zzfn.zza;
  }
  
  public static zzca zza(zzaga paramzzaga)
  {
    Object localObject2 = paramzzaga.zzb(1751411826);
    Object localObject1 = paramzzaga.zzb(1801812339);
    paramzzaga = paramzzaga.zzb(1768715124);
    if ((localObject2 != null) && (localObject1 != null) && (paramzzaga != null) && (zzg(((zzagb)localObject2).zza) == 1835299937))
    {
      localObject2 = ((zzagb)localObject1).zza;
      ((zzfd)localObject2).zzF(12);
      int j = ((zzfd)localObject2).zze();
      localObject1 = new String[j];
      int k;
      for (int i = 0; i < j; i++)
      {
        k = ((zzfd)localObject2).zze();
        ((zzfd)localObject2).zzG(4);
        localObject1[i] = ((zzfd)localObject2).zzx(k - 8, zzfol.zzc);
      }
      zzfd localzzfd = paramzzaga.zza;
      localzzfd.zzF(8);
      localObject2 = new ArrayList();
      while (localzzfd.zza() > 8)
      {
        i = localzzfd.zzc();
        k = localzzfd.zze();
        int m = localzzfd.zze() - 1;
        if ((m >= 0) && (m < j))
        {
          paramzzaga = localObject1[m];
          m = zzags.zzb;
          for (;;)
          {
            m = localzzfd.zzc();
            if (m >= i + k) {
              break;
            }
            int i1 = localzzfd.zze();
            if (localzzfd.zze() == 1684108385)
            {
              m = localzzfd.zze();
              int n = localzzfd.zze();
              i1 -= 16;
              byte[] arrayOfByte = new byte[i1];
              localzzfd.zzB(arrayOfByte, 0, i1);
              paramzzaga = new zzaes(paramzzaga, arrayOfByte, n, m);
              break label293;
            }
            localzzfd.zzF(m + i1);
          }
          paramzzaga = null;
          label293:
          if (paramzzaga != null) {
            ((ArrayList)localObject2).add(paramzzaga);
          }
        }
        else
        {
          paramzzaga = new StringBuilder();
          paramzzaga.append("Skipped metadata with unknown key index: ");
          paramzzaga.append(m);
          zzer.zze("AtomParsers", paramzzaga.toString());
        }
        localzzfd.zzF(i + k);
      }
      if (((ArrayList)localObject2).isEmpty()) {
        return null;
      }
      return new zzca((List)localObject2);
    }
    return null;
  }
  
  public static zzagk zzb(zzagb paramzzagb)
  {
    zzfd localzzfd = paramzzagb.zza;
    localzzfd.zzF(8);
    zzagb localzzagb = null;
    Object localObject3 = null;
    Object localObject2 = localObject3;
    while (localzzfd.zza() >= 8)
    {
      int i = localzzfd.zzc();
      int j = localzzfd.zze();
      int k = localzzfd.zze();
      int m;
      Object localObject1;
      if (k == 1835365473)
      {
        localzzfd.zzF(i);
        localzzfd.zzG(8);
        zzd(localzzfd);
        while (localzzfd.zzc() < i + j)
        {
          k = localzzfd.zzc();
          m = localzzfd.zze();
          if (localzzfd.zze() == 1768715124)
          {
            localzzfd.zzF(k);
            localzzfd.zzG(8);
            localObject1 = new ArrayList();
            while (localzzfd.zzc() < k + m)
            {
              paramzzagb = zzags.zza(localzzfd);
              if (paramzzagb != null) {
                ((ArrayList)localObject1).add(paramzzagb);
              }
            }
            if (((ArrayList)localObject1).isEmpty()) {
              break;
            }
            paramzzagb = new zzca((List)localObject1);
            localObject1 = localObject3;
            break label420;
          }
          localzzfd.zzF(k + m);
        }
        paramzzagb = null;
        localObject1 = localObject3;
      }
      else if (k == 1936553057)
      {
        localzzfd.zzF(i);
        localzzfd.zzG(12);
        while (localzzfd.zzc() < i + j)
        {
          m = localzzfd.zzc();
          k = localzzfd.zze();
          if (localzzfd.zze() == 1935766900)
          {
            if (k < 14) {
              break;
            }
            localzzfd.zzG(5);
            k = localzzfd.zzk();
            float f = 120.0F;
            if (k != 12)
            {
              if (k != 13) {
                break;
              }
            }
            else if (k == 12) {
              f = 240.0F;
            }
            localzzfd.zzG(1);
            localObject1 = new zzca(-9223372036854775807L, new zzbz[] { new zzafb(f, localzzfd.zzk()) });
            paramzzagb = localzzagb;
            break label420;
          }
          localzzfd.zzF(m + k);
        }
        localObject1 = null;
        paramzzagb = localzzagb;
      }
      else
      {
        paramzzagb = localzzagb;
        localObject1 = localObject3;
        if (k == -1451722374)
        {
          localObject2 = zzk(localzzfd);
          localObject1 = localObject3;
          paramzzagb = localzzagb;
        }
      }
      label420:
      localzzfd.zzF(i + j);
      localzzagb = paramzzagb;
      localObject3 = localObject1;
    }
    return new zzagk(localzzagb, (zzca)localObject3, (zzca)localObject2);
  }
  
  public static List zzc(zzaga paramzzaga, zzabd paramzzabd, long paramLong, zzad paramzzad, boolean paramBoolean1, boolean paramBoolean2, zzfon paramzzfon)
    throws zzce
  {
    Object localObject1 = new ArrayList();
    int i9 = 0;
    while (i9 < paramzzaga.zzc.size())
    {
      Object localObject9 = (zzaga)paramzzaga.zzc.get(i9);
      if (((zzaga)localObject9).zzd == 1953653099) {
        for (;;)
        {
          Object localObject4 = paramzzaga.zzb(1836476516);
          Objects.requireNonNull(localObject4);
          Object localObject3 = ((zzaga)localObject9).zza(1835297121);
          Objects.requireNonNull(localObject3);
          Object localObject2 = ((zzaga)localObject3).zzb(1751411826);
          Objects.requireNonNull(localObject2);
          int i7 = zze(zzg(((zzagb)localObject2).zza));
          localObject2 = "AtomParsers";
          if (i7 == -1)
          {
            localObject3 = "AtomParsers";
            localObject2 = localObject1;
            localObject1 = localObject3;
          }
          Object localObject5;
          int k;
          int i;
          int i3;
          int m;
          int j;
          long l2;
          long l1;
          label319:
          label324:
          int i2;
          int i1;
          int n;
          int i4;
          label538:
          Object localObject13;
          long l3;
          Pair localPair;
          int i11;
          int i10;
          int i8;
          int i12;
          Object localObject10;
          Object localObject11;
          Object localObject7;
          Object localObject8;
          int i5;
          label2451:
          label2839:
          int i6;
          label3275:
          label3291:
          label3526:
          label3589:
          do
          {
            localObject3 = null;
            localObject6 = localObject1;
            break;
            localObject5 = ((zzaga)localObject9).zzb(1953196132);
            Objects.requireNonNull(localObject5);
            localObject5 = ((zzagb)localObject5).zza;
            ((zzfd)localObject5).zzF(8);
            k = zzagc.zze(((zzfd)localObject5).zze());
            if (k == 0) {
              i = 8;
            } else {
              i = 16;
            }
            ((zzfd)localObject5).zzG(i);
            i3 = ((zzfd)localObject5).zze();
            ((zzfd)localObject5).zzG(4);
            m = ((zzfd)localObject5).zzc();
            for (i = 0;; i++)
            {
              if (k == 0) {
                j = 4;
              } else {
                j = 8;
              }
              l2 = -9223372036854775807L;
              if (i >= j) {
                break;
              }
              if (localObject5.zzH()[(m + i)] != -1)
              {
                if (k == 0) {
                  l1 = ((zzfd)localObject5).zzs();
                } else {
                  l1 = ((zzfd)localObject5).zzt();
                }
                if (l1 == 0L) {
                  break label319;
                }
                break label324;
              }
            }
            ((zzfd)localObject5).zzG(j);
            l1 = -9223372036854775807L;
            ((zzfd)localObject5).zzG(16);
            i2 = ((zzfd)localObject5).zze();
            i1 = ((zzfd)localObject5).zze();
            ((zzfd)localObject5).zzG(4);
            n = ((zzfd)localObject5).zze();
            i4 = ((zzfd)localObject5).zze();
            m = 65536;
            i = i2;
            k = i1;
            j = n;
            if (i2 == 0) {
              if (i1 == 65536)
              {
                if (n == -65536)
                {
                  if (i4 == 0)
                  {
                    i = 90;
                    break label538;
                  }
                  i = 0;
                  k = 65536;
                  j = -65536;
                }
                else
                {
                  i = 0;
                  k = 65536;
                  j = n;
                }
              }
              else
              {
                i = 0;
                j = n;
                k = i1;
              }
            }
            if (i == 0) {
              if (k == -65536)
              {
                if (j == 65536)
                {
                  j = m;
                  if (i4 == 0)
                  {
                    i = 270;
                    break label538;
                  }
                }
                i = 0;
                k = -65536;
              }
              else
              {
                i = 0;
              }
            }
            if ((i == -65536) && (k == 0) && (j == 0) && (i4 == -65536)) {
              i = 180;
            } else {
              i = 0;
            }
            localObject13 = new zzagj(i3, l1, i);
            if (paramLong == -9223372036854775807L) {
              l1 = zzagj.zzc((zzagj)localObject13);
            } else {
              l1 = paramLong;
            }
            localObject4 = ((zzagb)localObject4).zza;
            ((zzfd)localObject4).zzF(8);
            if (zzagc.zze(((zzfd)localObject4).zze()) == 0) {
              i = 8;
            } else {
              i = 16;
            }
            ((zzfd)localObject4).zzG(i);
            l3 = ((zzfd)localObject4).zzs();
            if (l1 != -9223372036854775807L) {
              l2 = zzfn.zzp(l1, 1000000L, l3);
            }
            localObject4 = ((zzaga)localObject3).zza(1835626086);
            Objects.requireNonNull(localObject4);
            localObject4 = ((zzaga)localObject4).zza(1937007212);
            Objects.requireNonNull(localObject4);
            localObject3 = ((zzaga)localObject3).zzb(1835296868);
            Objects.requireNonNull(localObject3);
            localPair = zzi(((zzagb)localObject3).zza);
            localObject3 = ((zzaga)localObject4).zzb(1937011556);
            if (localObject3 == null) {
              break label6558;
            }
            zzfd localzzfd = ((zzagb)localObject3).zza;
            i11 = zzagj.zza((zzagj)localObject13);
            i10 = zzagj.zzb((zzagj)localObject13);
            localObject4 = (String)localPair.second;
            localzzfd.zzF(12);
            i8 = localzzfd.zze();
            localObject3 = new zzagg(i8);
            i12 = 0;
            localObject10 = localObject1;
            localObject1 = localObject4;
            while (i12 < i8)
            {
              j = localzzfd.zzc();
              i1 = j;
              i = localzzfd.zze();
              i2 = i;
              if (i2 > 0) {
                paramBoolean1 = true;
              } else {
                paramBoolean1 = false;
              }
              zzaas.zzb(paramBoolean1, "childAtomSize must be positive");
              k = localzzfd.zze();
              if ((k != 1635148593) && (k != 1635148595) && (k != 1701733238) && (k != 1831958048) && (k != 1836070006) && (k != 1752589105) && (k != 1751479857) && (k != 1932670515) && (k != 1211250227) && (k != 1987063864) && (k != 1987063865) && (k != 1635135537) && (k != 1685479798) && (k != 1685479729) && (k != 1685481573) && (k != 1685481521))
              {
                if ((k != 1836069985) && (k != 1701733217) && (k != 1633889587) && (k != 1700998451) && (k != 1633889588) && (k != 1835823201) && (k != 1685353315) && (k != 1685353317) && (k != 1685353320) && (k != 1685353324) && (k != 1685353336) && (k != 1935764850) && (k != 1935767394) && (k != 1819304813) && (k != 1936684916) && (k != 1953984371) && (k != 778924082) && (k != 778924083) && (k != 1835557169) && (k != 1835560241) && (k != 1634492771) && (k != 1634492791) && (k != 1970037111) && (k != 1332770163) && (k != 1716281667))
                {
                  if ((k != 1414810956) && (k != 1954034535) && (k != 2004251764) && (k != 1937010800) && (k != 1664495672))
                  {
                    if (k == 1835365492)
                    {
                      zzo(localzzfd, 1835365492, i1, i11, (zzagg)localObject3);
                    }
                    else if (k == 1667329389)
                    {
                      localObject4 = new zzak();
                      ((zzak)localObject4).zzG(i11);
                      ((zzak)localObject4).zzS("application/x-camera-motion");
                      ((zzagg)localObject3).zzb = ((zzak)localObject4).zzY();
                    }
                    i = i2;
                    localObject4 = localObject3;
                    localObject3 = localObject1;
                    j = i1;
                    localObject3 = localObject2;
                    localObject2 = localObject4;
                    break label3589;
                  }
                  localzzfd.zzF(i1 + 16);
                  if (k == 1414810956) {
                    localObject4 = "application/ttml+xml";
                  }
                  for (;;)
                  {
                    l1 = Long.MAX_VALUE;
                    localObject5 = null;
                    break;
                    if (k == 1954034535)
                    {
                      k = i2 - 16;
                      localObject4 = new byte[k];
                      localzzfd.zzB((byte[])localObject4, 0, k);
                      localObject5 = zzfrr.zzm(localObject4);
                      l1 = Long.MAX_VALUE;
                      localObject4 = "application/x-quicktime-tx3g";
                      break;
                    }
                    if (k == 2004251764)
                    {
                      localObject4 = "application/x-mp4-vtt";
                    }
                    else
                    {
                      if (k == 1937010800)
                      {
                        localObject4 = "application/ttml+xml";
                        localObject5 = null;
                        l1 = 0L;
                        break;
                      }
                      ((zzagg)localObject3).zzd = 1;
                      localObject4 = "application/x-mp4-cea-608";
                    }
                  }
                  localObject6 = new zzak();
                  ((zzak)localObject6).zzG(i11);
                  ((zzak)localObject6).zzS((String)localObject4);
                  ((zzak)localObject6).zzK((String)localObject1);
                  ((zzak)localObject6).zzW(l1);
                  ((zzak)localObject6).zzI((List)localObject5);
                  ((zzagg)localObject3).zzb = ((zzak)localObject6).zzY();
                  localObject4 = localObject3;
                  localObject4 = localObject2;
                  localObject4 = localObject1;
                }
                else
                {
                  localObject4 = localObject1;
                  zzn(localzzfd, k, i1, i2, i11, (String)localObject4, paramBoolean2, paramzzad, (zzagg)localObject3, i12);
                  localObject4 = localObject3;
                  localObject4 = localObject2;
                }
                localObject4 = localObject1;
                localObject4 = localObject3;
                localObject3 = localObject2;
                localObject2 = localObject4;
              }
              else
              {
                localObject4 = localObject1;
                localObject11 = localObject2;
                localzzfd.zzF(i1 + 16);
                localzzfd.zzG(16);
                int i14 = localzzfd.zzo();
                int i13 = localzzfd.zzo();
                localzzfd.zzG(50);
                int i15 = localzzfd.zzc();
                Object localObject14;
                if (k == 1701733238)
                {
                  localObject4 = zzj(localzzfd, i1, i2);
                  if (localObject4 != null)
                  {
                    i = ((Integer)((Pair)localObject4).first).intValue();
                    if (paramzzad == null) {
                      localObject2 = null;
                    } else {
                      localObject2 = paramzzad.zzb(((zzahb)((Pair)localObject4).second).zzb);
                    }
                    ((zzagg)localObject3).zza[i12] = ((zzahb)((Pair)localObject4).second);
                  }
                  else
                  {
                    localObject2 = paramzzad;
                    i = 1701733238;
                  }
                  localzzfd.zzF(i15);
                  localObject14 = localObject2;
                }
                else
                {
                  localObject14 = paramzzad;
                  i = k;
                }
                if (i == 1831958048)
                {
                  localObject2 = "video/mpeg";
                  m = i;
                }
                else
                {
                  m = 1211250227;
                  if (i == 1211250227)
                  {
                    localObject2 = "video/3gpp";
                  }
                  else
                  {
                    localObject2 = null;
                    m = i;
                  }
                }
                n = -1;
                localObject12 = null;
                j = -1;
                float f = 1.0F;
                localObject7 = null;
                localObject5 = null;
                localObject6 = null;
                localObject8 = null;
                int i17 = -1;
                k = -1;
                localObject4 = localObject2;
                i = 0;
                localObject2 = localObject5;
                localObject5 = localObject3;
                int i16 = m;
                localObject3 = localObject12;
                m = n;
                while (i15 - i1 < i2)
                {
                  localzzfd.zzF(i15);
                  i3 = localzzfd.zzc();
                  n = localzzfd.zze();
                  if (n == 0)
                  {
                    if (localzzfd.zzc() - i1 == i2) {
                      break;
                    }
                    n = 0;
                  }
                  if (n > 0) {
                    paramBoolean1 = true;
                  } else {
                    paramBoolean1 = false;
                  }
                  zzaas.zzb(paramBoolean1, "childAtomSize must be positive");
                  i4 = localzzfd.zze();
                  if (i4 == 1635148611)
                  {
                    if (localObject4 == null) {
                      paramBoolean1 = true;
                    } else {
                      paramBoolean1 = false;
                    }
                    zzaas.zzb(paramBoolean1, null);
                    localzzfd.zzF(i3 + 8);
                    localObject3 = zzzt.zza(localzzfd);
                    localObject8 = ((zzzt)localObject3).zza;
                    ((zzagg)localObject5).zzc = ((zzzt)localObject3).zzb;
                    if (i == 0) {
                      f = ((zzzt)localObject3).zzh;
                    }
                    localObject4 = ((zzzt)localObject3).zzi;
                    j = ((zzzt)localObject3).zze;
                    m = ((zzzt)localObject3).zzf;
                    k = ((zzzt)localObject3).zzg;
                  }
                  for (localObject3 = "video/avc";; localObject3 = "video/hevc")
                  {
                    localObject12 = localObject4;
                    i3 = m;
                    m = j;
                    localObject4 = localObject3;
                    j = k;
                    i5 = n;
                    n = i17;
                    k = i3;
                    localObject3 = localObject12;
                    break label3291;
                    if (i4 != 1752589123) {
                      break;
                    }
                    if (localObject4 == null) {
                      paramBoolean1 = true;
                    } else {
                      paramBoolean1 = false;
                    }
                    zzaas.zzb(paramBoolean1, null);
                    localzzfd.zzF(i3 + 8);
                    localObject3 = zzabe.zza(localzzfd);
                    localObject8 = ((zzabe)localObject3).zza;
                    ((zzagg)localObject5).zzc = ((zzabe)localObject3).zzb;
                    if (i == 0) {
                      f = ((zzabe)localObject3).zzf;
                    }
                    localObject4 = ((zzabe)localObject3).zzg;
                    j = ((zzabe)localObject3).zzc;
                    m = ((zzabe)localObject3).zzd;
                    k = ((zzabe)localObject3).zze;
                  }
                  if ((i4 != 1685480259) && (i4 != 1685485123))
                  {
                    if (i4 == 1987076931)
                    {
                      if (localObject4 == null) {
                        paramBoolean1 = true;
                      } else {
                        paramBoolean1 = false;
                      }
                      zzaas.zzb(paramBoolean1, null);
                      localzzfd.zzF(i3 + 12);
                      localzzfd.zzG(2);
                      j = localzzfd.zzk();
                      m = localzzfd.zzk();
                      k = localzzfd.zzk();
                      m = zzs.zza(m);
                      if (1 != (j & 0x1)) {
                        j = 2;
                      } else {
                        j = 1;
                      }
                      i3 = zzs.zzb(k);
                      if (i16 == 1987063864) {
                        localObject4 = "video/x-vnd.on2.vp8";
                      } else {
                        localObject4 = "video/x-vnd.on2.vp9";
                      }
                      k = j;
                      j = i3;
                    }
                    else if (i4 == 1635135811)
                    {
                      if (localObject4 == null) {
                        paramBoolean1 = true;
                      } else {
                        paramBoolean1 = false;
                      }
                      zzaas.zzb(paramBoolean1, null);
                      localObject4 = "video/av01";
                    }
                    else
                    {
                      if (i4 != 1668050025) {
                        break label2451;
                      }
                      localObject12 = localObject2;
                      if (localObject2 == null) {
                        localObject12 = zzm();
                      }
                      ((ByteBuffer)localObject12).position(21);
                      ((ByteBuffer)localObject12).putShort(localzzfd.zzy());
                      ((ByteBuffer)localObject12).putShort(localzzfd.zzy());
                      localObject2 = localObject12;
                    }
                    i5 = n;
                    n = i17;
                    break label3291;
                    if (i4 == 1835295606)
                    {
                      localObject12 = localObject2;
                      if (localObject2 == null) {
                        localObject12 = zzm();
                      }
                      short s1 = localzzfd.zzy();
                      short s4 = localzzfd.zzy();
                      short s5 = localzzfd.zzy();
                      short s8 = localzzfd.zzy();
                      short s2 = localzzfd.zzy();
                      short s7 = localzzfd.zzy();
                      short s6 = localzzfd.zzy();
                      short s3 = localzzfd.zzy();
                      l1 = localzzfd.zzs();
                      long l4 = localzzfd.zzs();
                      ((ByteBuffer)localObject12).position(1);
                      ((ByteBuffer)localObject12).putShort(s2);
                      ((ByteBuffer)localObject12).putShort(s7);
                      ((ByteBuffer)localObject12).putShort(s1);
                      ((ByteBuffer)localObject12).putShort(s4);
                      ((ByteBuffer)localObject12).putShort(s5);
                      ((ByteBuffer)localObject12).putShort(s8);
                      ((ByteBuffer)localObject12).putShort(s6);
                      ((ByteBuffer)localObject12).putShort(s3);
                      ((ByteBuffer)localObject12).putShort((short)(int)(l1 / 10000L));
                      ((ByteBuffer)localObject12).putShort((short)(int)(l4 / 10000L));
                      localObject2 = localObject12;
                    }
                    for (;;)
                    {
                      break;
                      localObject12 = localObject3;
                      if (i4 == 1681012275)
                      {
                        if (localObject4 == null) {
                          paramBoolean1 = true;
                        } else {
                          paramBoolean1 = false;
                        }
                        zzaas.zzb(paramBoolean1, null);
                        localObject4 = "video/3gpp";
                      }
                      else if (i4 == 1702061171)
                      {
                        if (localObject4 == null) {
                          paramBoolean1 = true;
                        } else {
                          paramBoolean1 = false;
                        }
                        zzaas.zzb(paramBoolean1, null);
                        localObject6 = zzl(localzzfd, i3);
                        localObject4 = zzage.zzc((zzage)localObject6);
                        localObject12 = zzage.zzd((zzage)localObject6);
                        if (localObject12 != null) {
                          localObject8 = zzfrr.zzm(localObject12);
                        }
                      }
                      else
                      {
                        if (i4 == 1885434736)
                        {
                          localzzfd.zzF(i3 + 8);
                          i3 = localzzfd.zzn();
                          i = localzzfd.zzn();
                          f = i3 / i;
                          i = 1;
                          i5 = n;
                          n = i17;
                          localObject3 = localObject12;
                          break label3291;
                        }
                        if (i4 != 1937126244) {
                          break label2839;
                        }
                        localObject7 = zzq(localzzfd, i3, n);
                      }
                    }
                    if (i4 == 1936995172)
                    {
                      i3 = localzzfd.zzk();
                      localzzfd.zzG(3);
                      if (i3 == 0)
                      {
                        i3 = localzzfd.zzk();
                        if (i3 != 0)
                        {
                          if (i3 != 1)
                          {
                            if (i3 != 2)
                            {
                              if (i3 == 3)
                              {
                                i3 = 3;
                                i5 = n;
                                n = i3;
                                localObject3 = localObject12;
                                break label3291;
                              }
                            }
                            else
                            {
                              i3 = 2;
                              i5 = n;
                              n = i3;
                              localObject3 = localObject12;
                              break label3291;
                            }
                          }
                          else
                          {
                            i3 = 1;
                            i5 = n;
                            n = i3;
                            localObject3 = localObject12;
                            break label3291;
                          }
                        }
                        else
                        {
                          i3 = 0;
                          i5 = n;
                          n = i3;
                          localObject3 = localObject12;
                          break label3291;
                        }
                      }
                    }
                    else if (i4 == 1668246642)
                    {
                      if (m == -1)
                      {
                        if (j == -1)
                        {
                          j = localzzfd.zze();
                          if ((j != 1852009592) && (j != 1852009571))
                          {
                            zzer.zze((String)localObject11, "Unsupported color type: ".concat(zzagc.zzf(j)));
                            m = -1;
                            j = -1;
                            i5 = n;
                            n = i17;
                            localObject3 = localObject12;
                            break label3291;
                          }
                          m = localzzfd.zzo();
                          k = localzzfd.zzo();
                          localzzfd.zzG(2);
                          if (n == 19)
                          {
                            if ((localzzfd.zzk() & 0x80) != 0) {
                              j = 1;
                            } else {
                              j = 0;
                            }
                            n = 19;
                          }
                          else
                          {
                            j = 0;
                          }
                          i3 = zzs.zza(m);
                          if (1 != j) {
                            j = 2;
                          } else {
                            j = 1;
                          }
                          i4 = zzs.zzb(k);
                          i5 = n;
                          i6 = j;
                          localObject3 = localObject12;
                          break label3275;
                        }
                        m = -1;
                        i5 = n;
                        n = i17;
                        localObject3 = localObject12;
                        break label3291;
                      }
                      i3 = m;
                      i4 = j;
                      i5 = n;
                      i6 = k;
                      localObject3 = localObject12;
                      break label3275;
                    }
                    i3 = m;
                    i4 = j;
                    i5 = n;
                    i6 = k;
                    localObject3 = localObject12;
                  }
                  else
                  {
                    localObject12 = zzaak.zza(localzzfd);
                    i3 = m;
                    i4 = j;
                    i5 = n;
                    i6 = k;
                    if (localObject12 != null)
                    {
                      localObject3 = ((zzaak)localObject12).zza;
                      localObject4 = "video/dolby-vision";
                      i6 = k;
                      i5 = n;
                      i4 = j;
                      i3 = m;
                    }
                  }
                  k = i6;
                  n = i17;
                  j = i4;
                  m = i3;
                  i15 += i5;
                  i17 = n;
                }
                if (localObject4 == null)
                {
                  localObject2 = localObject5;
                  localObject3 = localObject11;
                  i = i2;
                  j = i1;
                }
                else
                {
                  localObject12 = new zzak();
                  ((zzak)localObject12).zzG(i11);
                  ((zzak)localObject12).zzS((String)localObject4);
                  ((zzak)localObject12).zzx((String)localObject3);
                  ((zzak)localObject12).zzX(i14);
                  ((zzak)localObject12).zzF(i13);
                  ((zzak)localObject12).zzP(f);
                  ((zzak)localObject12).zzR(i10);
                  ((zzak)localObject12).zzQ((byte[])localObject7);
                  ((zzak)localObject12).zzV(i17);
                  ((zzak)localObject12).zzI((List)localObject8);
                  ((zzak)localObject12).zzB((zzad)localObject14);
                  if (m == -1)
                  {
                    if (k == -1)
                    {
                      if (j == -1)
                      {
                        if (localObject2 == null) {
                          break label3526;
                        }
                        i = -1;
                      }
                      else
                      {
                        i = j;
                      }
                      k = -1;
                    }
                    else
                    {
                      i = j;
                    }
                    m = -1;
                    j = i;
                    i = m;
                  }
                  else
                  {
                    i = m;
                  }
                  if (localObject2 != null) {
                    localObject2 = ((ByteBuffer)localObject2).array();
                  } else {
                    localObject2 = null;
                  }
                  ((zzak)localObject12).zzy(new zzs(i, k, j, (byte[])localObject2));
                  if (localObject6 != null)
                  {
                    ((zzak)localObject12).zzv(zzftz.zzc(zzage.zza((zzage)localObject6)));
                    ((zzak)localObject12).zzO(zzftz.zzc(zzage.zzb((zzage)localObject6)));
                  }
                  localObject3 = ((zzak)localObject12).zzY();
                  localObject2 = localObject5;
                  ((zzagg)localObject2).zzb = ((zzam)localObject3);
                  j = i1;
                  i = i2;
                  localObject3 = localObject11;
                }
              }
              localzzfd.zzF(j + i);
              i12++;
              localObject4 = localObject3;
              localObject3 = localObject2;
              localObject2 = localObject4;
            }
            localObject1 = localObject2;
            localObject2 = localObject10;
            localObject4 = ((zzaga)localObject9).zza(1701082227);
            if (localObject4 != null)
            {
              localObject5 = zzh((zzaga)localObject4);
              if (localObject5 != null)
              {
                localObject4 = (long[])((Pair)localObject5).first;
                localObject5 = (long[])((Pair)localObject5).second;
                continue;
              }
            }
            localObject4 = null;
            localObject5 = null;
          } while (((zzagg)localObject3).zzb == null);
          localObject3 = new zzaha(zzagj.zza((zzagj)localObject13), i7, ((Long)localPair.first).longValue(), l3, l2, ((zzagg)localObject3).zzb, ((zzagg)localObject3).zzd, ((zzagg)localObject3).zza, ((zzagg)localObject3).zzc, (long[])localObject4, (long[])localObject5);
          Object localObject6 = localObject1;
          Object localObject12 = (zzaha)paramzzfon.apply(localObject3);
          if (localObject12 != null)
          {
            localObject1 = ((zzaga)localObject9).zza(1835297121);
            Objects.requireNonNull(localObject1);
            localObject1 = ((zzaga)localObject1).zza(1835626086);
            Objects.requireNonNull(localObject1);
            localObject4 = ((zzaga)localObject1).zza(1937007212);
            Objects.requireNonNull(localObject4);
            localObject1 = ((zzaga)localObject4).zzb(1937011578);
            if (localObject1 != null)
            {
              localObject3 = new zzagh((zzagb)localObject1, ((zzaha)localObject12).zzf);
            }
            else
            {
              localObject1 = ((zzaga)localObject4).zzb(1937013298);
              if (localObject1 == null) {
                break label6537;
              }
              localObject3 = new zzagi((zzagb)localObject1);
            }
            i7 = ((zzagf)localObject3).zzb();
            if (i7 == 0) {
              localObject1 = new zzahd((zzaha)localObject12, new long[0], new int[0], 0, new long[0], new int[0], 0L);
            }
            for (;;)
            {
              break;
              localObject1 = ((zzaga)localObject4).zzb(1937007471);
              if (localObject1 == null)
              {
                localObject1 = ((zzaga)localObject4).zzb(1668232756);
                Objects.requireNonNull(localObject1);
                paramBoolean1 = true;
              }
              else
              {
                paramBoolean1 = false;
              }
              localObject5 = ((zzagb)localObject1).zza;
              localObject1 = ((zzaga)localObject4).zzb(1937011555);
              Objects.requireNonNull(localObject1);
              localObject8 = ((zzagb)localObject1).zza;
              localObject1 = ((zzaga)localObject4).zzb(1937011827);
              Objects.requireNonNull(localObject1);
              localObject11 = ((zzagb)localObject1).zza;
              localObject1 = ((zzaga)localObject4).zzb(1937011571);
              if (localObject1 != null) {
                localObject1 = ((zzagb)localObject1).zza;
              } else {
                localObject1 = null;
              }
              localObject4 = ((zzaga)localObject4).zzb(1668576371);
              if (localObject4 != null) {
                localObject7 = ((zzagb)localObject4).zza;
              } else {
                localObject7 = null;
              }
              localObject4 = new zzagd((zzfd)localObject8, (zzfd)localObject5, paramBoolean1);
              ((zzfd)localObject11).zzF(12);
              n = ((zzfd)localObject11).zzn() - 1;
              i1 = ((zzfd)localObject11).zzn();
              i10 = ((zzfd)localObject11).zzn();
              if (localObject7 != null)
              {
                ((zzfd)localObject7).zzF(12);
                i = ((zzfd)localObject7).zzn();
              }
              else
              {
                i = 0;
              }
              if (localObject1 != null)
              {
                ((zzfd)localObject1).zzF(12);
                m = ((zzfd)localObject1).zzn();
                if (m > 0)
                {
                  k = ((zzfd)localObject1).zzn() - 1;
                  break label4184;
                }
                localObject1 = null;
              }
              else
              {
                m = 0;
              }
              k = -1;
              label4184:
              i2 = ((zzagf)localObject3).zza();
              localObject5 = ((zzaha)localObject12).zzf.zzm;
              j = n;
              if (i2 != -1) {
                if ((!"audio/raw".equals(localObject5)) && (!"audio/g711-mlaw".equals(localObject5)))
                {
                  j = n;
                  if (!"audio/g711-alaw".equals(localObject5)) {}
                }
                else
                {
                  j = n;
                  if (n == 0)
                  {
                    if ((i == 0) && (m == 0))
                    {
                      k = ((zzagd)localObject4).zza;
                      localObject1 = new long[k];
                      localObject7 = new int[k];
                      while (((zzagd)localObject4).zza())
                      {
                        i = ((zzagd)localObject4).zzb;
                        localObject1[i] = ((zzagd)localObject4).zzd;
                        localObject7[i] = ((zzagd)localObject4).zzc;
                      }
                      l2 = i10;
                      i4 = 8192 / i2;
                      i = 0;
                      j = 0;
                      while (i < k)
                      {
                        m = localObject7[i];
                        n = zzfn.zza;
                        j += (m + i4 - 1) / i4;
                        i++;
                      }
                      localObject4 = new long[j];
                      localObject5 = new int[j];
                      localObject3 = new long[j];
                      localObject6 = new int[j];
                      j = 0;
                      n = 0;
                      i = 0;
                      m = 0;
                      while (j < k)
                      {
                        i3 = localObject7[j];
                        l1 = localObject1[j];
                        i1 = i;
                        i = i2;
                        i2 = i3;
                        while (i2 > 0)
                        {
                          i3 = Math.min(i4, i2);
                          localObject4[m] = l1;
                          i5 = i * i3;
                          localObject5[m] = i5;
                          i1 = Math.max(i1, i5);
                          localObject3[m] = (n * l2);
                          localObject6[m] = 1;
                          l1 += localObject5[m];
                          n += i3;
                          i2 -= i3;
                          m++;
                        }
                        j++;
                        i2 = i;
                        i = i1;
                      }
                      l1 = l2 * n;
                      localObject1 = localObject6;
                      i2 = i;
                      break label5495;
                    }
                    j = 0;
                  }
                }
              }
              localObject8 = new long[i7];
              localObject9 = new int[i7];
              localObject10 = new long[i7];
              localObject5 = new int[i7];
              i6 = k;
              i2 = 0;
              n = 0;
              i4 = 0;
              i5 = 0;
              l1 = 0L;
              l2 = 0L;
              k = j;
              i3 = 0;
              j = i;
              i = i4;
              i4 = m;
              m = i7;
              while (i3 < m)
              {
                paramBoolean1 = true;
                while (n == 0)
                {
                  paramBoolean1 = ((zzagd)localObject4).zza();
                  if (paramBoolean1)
                  {
                    l1 = ((zzagd)localObject4).zzd;
                    n = ((zzagd)localObject4).zzc;
                  }
                  else
                  {
                    i11 = 0;
                    break label4705;
                  }
                }
                i11 = n;
                label4705:
                if (!paramBoolean1)
                {
                  zzer.zze((String)localObject6, "Unexpected end of chunk data");
                  localObject3 = Arrays.copyOf((long[])localObject8, i3);
                  localObject1 = Arrays.copyOf((int[])localObject9, i3);
                  localObject4 = Arrays.copyOf((long[])localObject10, i3);
                  localObject5 = Arrays.copyOf((int[])localObject5, i3);
                  break label5085;
                }
                i8 = i5;
                n = i8;
                i7 = i;
                i5 = j;
                if (localObject7 == null)
                {
                  n = i8;
                  i7 = i;
                  i5 = j;
                }
                else
                {
                  while (i7 == 0) {
                    if (i5 > 0)
                    {
                      i5--;
                      i7 = ((zzfd)localObject7).zzn();
                      n = ((zzfd)localObject7).zze();
                    }
                    else
                    {
                      i7 = 0;
                    }
                  }
                  i7--;
                }
                localObject8[i3] = l1;
                j = ((zzagf)localObject3).zzc();
                localObject9[i3] = j;
                if (j <= i2) {
                  j = i2;
                }
                localObject10[i3] = (l2 + n);
                if (localObject1 == null) {
                  i = 1;
                } else {
                  i = 0;
                }
                localObject5[i3] = i;
                i2 = i6;
                i8 = i4;
                if (i3 == i6)
                {
                  localObject5[i3] = 1;
                  i = i4 - 1;
                  i2 = i6;
                  i8 = i;
                  if (i > 0)
                  {
                    Objects.requireNonNull(localObject1);
                    i2 = ((zzfd)localObject1).zzn() - 1;
                    i8 = i;
                  }
                }
                l2 += i10;
                i = i1 - 1;
                if (i == 0) {
                  if (k > 0)
                  {
                    i = ((zzfd)localObject11).zzn();
                    i10 = ((zzfd)localObject11).zze();
                    k--;
                  }
                  else
                  {
                    i = 0;
                  }
                }
                l3 = localObject9[i3];
                i3++;
                i12 = n;
                i6 = i2;
                n = i11 - 1;
                l1 += l3;
                i2 = j;
                i1 = i;
                i4 = i8;
                i = i7;
                j = i5;
                i5 = i12;
              }
              localObject4 = localObject10;
              i3 = m;
              localObject1 = localObject9;
              localObject3 = localObject8;
              label5085:
              l1 = i5;
              if (localObject7 != null) {
                while (j > 0)
                {
                  if (((zzfd)localObject7).zzn() != 0)
                  {
                    j = 0;
                    break label5129;
                  }
                  ((zzfd)localObject7).zze();
                  j--;
                }
              }
              j = 1;
              label5129:
              if (i4 == 0)
              {
                if (i1 == 0)
                {
                  if (n == 0)
                  {
                    if (k == 0)
                    {
                      if (i == 0)
                      {
                        if (j == 0)
                        {
                          i = 0;
                          j = 0;
                          k = 0;
                          m = 0;
                          n = 0;
                          i1 = 0;
                          break label5301;
                        }
                        break label5456;
                      }
                      i1 = j;
                      n = i;
                      i = 0;
                      j = 0;
                      k = 0;
                      m = 0;
                      break label5301;
                    }
                    i1 = j;
                    n = i;
                    m = k;
                    i = 0;
                    j = 0;
                    k = 0;
                    break label5301;
                  }
                  i1 = j;
                  m = n;
                  n = i;
                  i4 = k;
                  i = 0;
                  j = 0;
                  k = m;
                  m = i4;
                  break label5301;
                }
                i4 = 0;
              }
              i5 = i;
              m = k;
              k = n;
              i = i1;
              i1 = j;
              n = i5;
              j = i;
              i = i4;
              label5301:
              i4 = ((zzaha)localObject12).zza;
              localObject8 = new StringBuilder();
              ((StringBuilder)localObject8).append("Inconsistent stbl box for track ");
              ((StringBuilder)localObject8).append(i4);
              ((StringBuilder)localObject8).append(": remainingSynchronizationSamples ");
              ((StringBuilder)localObject8).append(i);
              ((StringBuilder)localObject8).append(", remainingSamplesAtTimestampDelta ");
              ((StringBuilder)localObject8).append(j);
              ((StringBuilder)localObject8).append(", remainingSamplesInChunk ");
              ((StringBuilder)localObject8).append(k);
              ((StringBuilder)localObject8).append(", remainingTimestampDeltaChanges ");
              ((StringBuilder)localObject8).append(m);
              ((StringBuilder)localObject8).append(", remainingSamplesAtTimestampOffset ");
              ((StringBuilder)localObject8).append(n);
              if (1 != i1) {
                localObject7 = ", ctts invalid";
              } else {
                localObject7 = "";
              }
              ((StringBuilder)localObject8).append((String)localObject7);
              zzer.zze((String)localObject6, ((StringBuilder)localObject8).toString());
              label5456:
              l1 = l2 + l1;
              localObject6 = localObject5;
              localObject5 = localObject4;
              localObject4 = localObject3;
              localObject7 = localObject1;
              localObject1 = localObject6;
              localObject3 = localObject5;
              i7 = i3;
              localObject5 = localObject7;
              label5495:
              l2 = zzfn.zzp(l1, 1000000L, ((zzaha)localObject12).zzc);
              localObject6 = ((zzaha)localObject12).zzh;
              if (localObject6 == null)
              {
                zzfn.zzA((long[])localObject3, 1000000L, ((zzaha)localObject12).zzc);
                localObject1 = new zzahd((zzaha)localObject12, (long[])localObject4, (int[])localObject5, i2, (long[])localObject3, (int[])localObject1, l2);
              }
              else
              {
                if ((localObject6.length == 1) && (((zzaha)localObject12).zzb == 1) && (localObject3.length >= 2))
                {
                  localObject7 = ((zzaha)localObject12).zzi;
                  Objects.requireNonNull(localObject7);
                  l2 = localObject7[0];
                  l3 = l2 + zzfn.zzp(localObject6[0], ((zzaha)localObject12).zzc, ((zzaha)localObject12).zzd);
                  if (zzp((long[])localObject3, l1, l2, l3))
                  {
                    l2 = zzfn.zzp(l2 - localObject3[0], ((zzaha)localObject12).zzf.zzA, ((zzaha)localObject12).zzc);
                    l3 = zzfn.zzp(l1 - l3, ((zzaha)localObject12).zzf.zzA, ((zzaha)localObject12).zzc);
                    if (l2 == 0L)
                    {
                      if (l3 == 0L) {
                        break label5796;
                      }
                      l2 = 0L;
                    }
                    if ((l2 <= 2147483647L) && (l3 <= 2147483647L))
                    {
                      paramzzabd.zza = ((int)l2);
                      paramzzabd.zzb = ((int)l3);
                      zzfn.zzA((long[])localObject3, 1000000L, ((zzaha)localObject12).zzc);
                      localObject1 = new zzahd((zzaha)localObject12, (long[])localObject4, (int[])localObject5, i2, (long[])localObject3, (int[])localObject1, zzfn.zzp(localObject12.zzh[0], 1000000L, ((zzaha)localObject12).zzd));
                      continue;
                    }
                  }
                }
                label5796:
                localObject6 = ((zzaha)localObject12).zzh;
                j = localObject6.length;
                i = j;
                if (j == 1)
                {
                  if (localObject6[0] == 0L)
                  {
                    localObject6 = ((zzaha)localObject12).zzi;
                    Objects.requireNonNull(localObject6);
                    l2 = localObject6[0];
                    for (i = 0; i < localObject3.length; i++) {
                      localObject3[i] = zzfn.zzp(localObject3[i] - l2, 1000000L, ((zzaha)localObject12).zzc);
                    }
                    localObject1 = new zzahd((zzaha)localObject12, (long[])localObject4, (int[])localObject5, i2, (long[])localObject3, (int[])localObject1, zzfn.zzp(l1 - l2, 1000000L, ((zzaha)localObject12).zzc));
                  }
                  else
                  {
                    i = 1;
                  }
                }
                else
                {
                  if (((zzaha)localObject12).zzb == 1) {
                    paramBoolean1 = true;
                  } else {
                    paramBoolean1 = false;
                  }
                  localObject9 = new int[i];
                  localObject11 = new int[i];
                  localObject7 = ((zzaha)localObject12).zzi;
                  Objects.requireNonNull(localObject7);
                  n = 0;
                  m = 0;
                  k = 0;
                  j = 0;
                  i = i2;
                  localObject6 = localObject5;
                  for (;;)
                  {
                    localObject5 = ((zzaha)localObject12).zzh;
                    if (m >= localObject5.length) {
                      break;
                    }
                    l2 = localObject7[m];
                    if (l2 != -1L)
                    {
                      l1 = zzfn.zzp(localObject5[m], ((zzaha)localObject12).zzc, ((zzaha)localObject12).zzd);
                      localObject9[m] = zzfn.zzc((long[])localObject3, l2, true, true);
                      localObject11[m] = zzfn.zza((long[])localObject3, l2 + l1, paramBoolean1, false);
                      for (;;)
                      {
                        i2 = localObject9[m];
                        i1 = localObject11[m];
                        if ((i2 >= i1) || ((localObject1[i2] & 0x1) != 0)) {
                          break;
                        }
                        localObject9[m] = (i2 + 1);
                      }
                      n += i1 - i2;
                      if (j != i2) {
                        j = 1;
                      } else {
                        j = 0;
                      }
                      k = j | k;
                      j = i1;
                    }
                    m++;
                  }
                  localObject5 = localObject4;
                  if (n != i7) {
                    j = 1;
                  } else {
                    j = 0;
                  }
                  i2 = j | k;
                  if (i2 != 0) {
                    localObject4 = new long[n];
                  } else {
                    localObject4 = localObject5;
                  }
                  if (i2 != 0) {
                    localObject8 = new int[n];
                  } else {
                    localObject8 = localObject6;
                  }
                  if (1 == i2) {
                    i = 0;
                  }
                  if (i2 != 0) {
                    localObject7 = new int[n];
                  } else {
                    localObject7 = localObject1;
                  }
                  localObject13 = new long[n];
                  j = 0;
                  l1 = 0L;
                  k = 0;
                  localObject10 = localObject3;
                  localObject3 = localObject7;
                  localObject7 = localObject11;
                  while (j < ((zzaha)localObject12).zzh.length)
                  {
                    l2 = localObject12.zzi[j];
                    m = localObject9[j];
                    n = localObject7[j];
                    if (i2 != 0)
                    {
                      i1 = n - m;
                      System.arraycopy(localObject5, m, localObject4, k, i1);
                      System.arraycopy(localObject6, m, localObject8, k, i1);
                      System.arraycopy(localObject1, m, localObject3, k, i1);
                    }
                    while (m < n)
                    {
                      localObject13[k] = (zzfn.zzp(l1, 1000000L, ((zzaha)localObject12).zzd) + zzfn.zzp(Math.max(0L, localObject10[m] - l2), 1000000L, ((zzaha)localObject12).zzc));
                      i1 = i;
                      if (i2 != 0)
                      {
                        i1 = i;
                        if (localObject8[k] > i) {
                          i1 = localObject6[m];
                        }
                      }
                      k++;
                      m++;
                      i = i1;
                    }
                    l2 = localObject12.zzh[j];
                    j++;
                    l1 += l2;
                  }
                  localObject1 = new zzahd((zzaha)localObject12, (long[])localObject4, (int[])localObject8, i, (long[])localObject13, (int[])localObject3, zzfn.zzp(l1, 1000000L, ((zzaha)localObject12).zzd));
                }
              }
            }
            ((List)localObject2).add(localObject1);
            localObject1 = localObject2;
            break;
            label6537:
            throw zzce.zza("Track has no sample table size information", null);
          }
          else
          {
            localObject1 = localObject2;
          }
        }
      }
      i9++;
      continue;
      label6558:
      throw zzce.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
    }
    return (List)localObject1;
  }
  
  public static void zzd(zzfd paramzzfd)
  {
    int j = paramzzfd.zzc();
    paramzzfd.zzG(4);
    int i = j;
    if (paramzzfd.zze() != 1751411826) {
      i = j + 4;
    }
    paramzzfd.zzF(i);
  }
  
  private static int zze(int paramInt)
  {
    if (paramInt == 1936684398) {
      return 1;
    }
    if (paramInt == 1986618469) {
      return 2;
    }
    if ((paramInt != 1952807028) && (paramInt != 1935832172) && (paramInt != 1937072756) && (paramInt != 1668047728))
    {
      if (paramInt == 1835365473) {
        return 5;
      }
      return -1;
    }
    return 3;
  }
  
  private static int zzf(zzfd paramzzfd)
  {
    int j = paramzzfd.zzk();
    for (int i = j & 0x7F; (j & 0x80) == 128; i = i << 7 | j & 0x7F) {
      j = paramzzfd.zzk();
    }
    return i;
  }
  
  private static int zzg(zzfd paramzzfd)
  {
    paramzzfd.zzF(16);
    return paramzzfd.zze();
  }
  
  private static Pair zzh(zzaga paramzzaga)
  {
    paramzzaga = paramzzaga.zzb(1701606260);
    if (paramzzaga == null) {
      return null;
    }
    paramzzaga = paramzzaga.zza;
    paramzzaga.zzF(8);
    int j = zzagc.zze(paramzzaga.zze());
    int k = paramzzaga.zzn();
    long[] arrayOfLong2 = new long[k];
    long[] arrayOfLong1 = new long[k];
    int i = 0;
    while (i < k)
    {
      long l;
      if (j == 1) {
        l = paramzzaga.zzt();
      } else {
        l = paramzzaga.zzs();
      }
      arrayOfLong2[i] = l;
      if (j == 1) {
        l = paramzzaga.zzr();
      } else {
        l = paramzzaga.zze();
      }
      arrayOfLong1[i] = l;
      if (paramzzaga.zzy() == 1)
      {
        paramzzaga.zzG(2);
        i++;
      }
      else
      {
        throw new IllegalArgumentException("Unsupported media rate.");
      }
    }
    return Pair.create(arrayOfLong2, arrayOfLong1);
  }
  
  private static Pair zzi(zzfd paramzzfd)
  {
    int j = 8;
    paramzzfd.zzF(8);
    int k = zzagc.zze(paramzzfd.zze());
    if (k == 0) {
      i = 8;
    } else {
      i = 16;
    }
    paramzzfd.zzG(i);
    long l = paramzzfd.zzs();
    int i = j;
    if (k == 0) {
      i = 4;
    }
    paramzzfd.zzG(i);
    i = paramzzfd.zzo();
    paramzzfd = new StringBuilder();
    paramzzfd.append((char)((i >> 10 & 0x1F) + 96));
    paramzzfd.append((char)((i >> 5 & 0x1F) + 96));
    paramzzfd.append((char)((i & 0x1F) + 96));
    return Pair.create(Long.valueOf(l), paramzzfd.toString());
  }
  
  private static Pair zzj(zzfd paramzzfd, int paramInt1, int paramInt2)
    throws zzce
  {
    int j = paramzzfd.zzc();
    while (j - paramInt1 < paramInt2)
    {
      paramzzfd.zzF(j);
      int i1 = paramzzfd.zze();
      boolean bool2 = true;
      boolean bool1;
      if (i1 > 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      zzaas.zzb(bool1, "childAtomSize must be positive");
      if (paramzzfd.zze() == 1936289382)
      {
        int i = j + 8;
        int m = -1;
        int k = 0;
        Object localObject2 = null;
        int n;
        Object localObject4;
        Object localObject3;
        for (Object localObject1 = null; i - j < i1; localObject1 = localObject4)
        {
          paramzzfd.zzF(i);
          n = paramzzfd.zze();
          int i2 = paramzzfd.zze();
          if (i2 == 1718775137)
          {
            localObject4 = Integer.valueOf(paramzzfd.zze());
            localObject3 = localObject2;
          }
          else if (i2 == 1935894637)
          {
            paramzzfd.zzG(4);
            localObject3 = paramzzfd.zzx(4, zzfol.zzc);
            localObject4 = localObject1;
          }
          else
          {
            localObject3 = localObject2;
            localObject4 = localObject1;
            if (i2 == 1935894633)
            {
              m = i;
              k = n;
              localObject4 = localObject1;
              localObject3 = localObject2;
            }
          }
          i += n;
          localObject2 = localObject3;
        }
        if ((!"cenc".equals(localObject2)) && (!"cbc1".equals(localObject2)) && (!"cens".equals(localObject2)) && (!"cbcs".equals(localObject2)))
        {
          localObject1 = null;
        }
        else
        {
          if (localObject1 != null) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          zzaas.zzb(bool1, "frma atom is mandatory");
          if (m != -1) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          zzaas.zzb(bool1, "schi atom is mandatory");
          i = m + 8;
          while (i - m < k)
          {
            paramzzfd.zzF(i);
            n = paramzzfd.zze();
            if (paramzzfd.zze() == 1952804451)
            {
              i = zzagc.zze(paramzzfd.zze());
              paramzzfd.zzG(1);
              if (i == 0)
              {
                paramzzfd.zzG(1);
                k = 0;
                i = 0;
              }
              else
              {
                i = paramzzfd.zzk();
                k = i & 0xF;
                i = (i & 0xF0) >> 4;
              }
              if (paramzzfd.zzk() == 1) {
                bool1 = true;
              } else {
                bool1 = false;
              }
              m = paramzzfd.zzk();
              localObject4 = new byte[16];
              paramzzfd.zzB((byte[])localObject4, 0, 16);
              if ((bool1) && (m == 0))
              {
                n = paramzzfd.zzk();
                localObject3 = new byte[n];
                paramzzfd.zzB((byte[])localObject3, 0, n);
              }
              else
              {
                localObject3 = null;
              }
              localObject2 = new zzahb(bool1, (String)localObject2, m, (byte[])localObject4, i, k, (byte[])localObject3);
              break label499;
            }
            i += n;
          }
          localObject2 = null;
          label499:
          if (localObject2 != null) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }
          zzaas.zzb(bool1, "tenc atom is mandatory");
          i = zzfn.zza;
          localObject1 = Pair.create(localObject1, localObject2);
        }
        if (localObject1 != null) {
          return (Pair)localObject1;
        }
      }
      j += i1;
    }
    return null;
  }
  
  private static zzca zzk(zzfd paramzzfd)
  {
    int i = paramzzfd.zzy();
    paramzzfd.zzG(2);
    paramzzfd = paramzzfd.zzx(i, zzfol.zzc);
    i = Math.max(paramzzfd.lastIndexOf('+'), paramzzfd.lastIndexOf('-'));
    try
    {
      float f1 = Float.parseFloat(paramzzfd.substring(0, i));
      float f2 = Float.parseFloat(paramzzfd.substring(i, paramzzfd.length() - 1));
      paramzzfd = new com/google/android/gms/internal/ads/zzaey;
      paramzzfd.<init>(f1, f2);
      paramzzfd = new zzca(-9223372036854775807L, new zzbz[] { paramzzfd });
      return paramzzfd;
    }
    catch (IndexOutOfBoundsException|NumberFormatException paramzzfd) {}
    return null;
  }
  
  private static zzage zzl(zzfd paramzzfd, int paramInt)
  {
    paramzzfd.zzF(paramInt + 12);
    paramzzfd.zzG(1);
    zzf(paramzzfd);
    paramzzfd.zzG(2);
    paramInt = paramzzfd.zzk();
    if ((paramInt & 0x80) != 0) {
      paramzzfd.zzG(2);
    }
    if ((paramInt & 0x40) != 0) {
      paramzzfd.zzG(paramzzfd.zzk());
    }
    if ((paramInt & 0x20) != 0) {
      paramzzfd.zzG(2);
    }
    paramzzfd.zzG(1);
    zzf(paramzzfd);
    String str = zzcd.zzd(paramzzfd.zzk());
    if ((!"audio/mpeg".equals(str)) && (!"audio/vnd.dts".equals(str)) && (!"audio/vnd.dts.hd".equals(str)))
    {
      paramzzfd.zzG(4);
      long l2 = paramzzfd.zzs();
      long l1 = paramzzfd.zzs();
      paramzzfd.zzG(1);
      paramInt = zzf(paramzzfd);
      byte[] arrayOfByte = new byte[paramInt];
      paramzzfd.zzB(arrayOfByte, 0, paramInt);
      if (l1 <= 0L) {
        l1 = -1L;
      }
      if (l2 <= 0L) {
        l2 = -1L;
      }
      return new zzage(str, arrayOfByte, l1, l2);
    }
    return new zzage(str, null, -1L, -1L);
  }
  
  private static ByteBuffer zzm()
  {
    return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
  }
  
  private static void zzn(zzfd paramzzfd, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean, zzad paramzzad, zzagg paramzzagg, int paramInt5)
    throws zzce
  {
    paramzzfd.zzF(paramInt2 + 16);
    int i;
    if (paramBoolean)
    {
      i = paramzzfd.zzo();
      paramzzfd.zzG(6);
    }
    else
    {
      paramzzfd.zzG(8);
      i = 0;
    }
    int j;
    int m;
    if ((i != 0) && (i != 1))
    {
      if (i == 2)
      {
        paramzzfd.zzG(16);
        i = (int)Math.round(Double.longBitsToDouble(paramzzfd.zzr()));
        j = paramzzfd.zzn();
        paramzzfd.zzG(20);
        m = 0;
      }
    }
    else
    {
      j = paramzzfd.zzo();
      paramzzfd.zzG(6);
      k = paramzzfd.zzl();
      paramzzfd.zzF(paramzzfd.zzc() - 4);
      m = paramzzfd.zze();
      if (i == 1) {
        paramzzfd.zzG(16);
      }
      i = k;
    }
    int n = paramzzfd.zzc();
    int i1 = 1701733217;
    int k = paramInt1;
    Object localObject4 = paramzzad;
    paramInt1 = k;
    Object localObject1;
    if (k == 1701733217)
    {
      localObject2 = zzj(paramzzfd, paramInt2, paramInt3);
      localObject1 = paramzzad;
      paramInt1 = i1;
      if (localObject2 != null)
      {
        paramInt1 = ((Integer)((Pair)localObject2).first).intValue();
        if (paramzzad == null) {
          localObject1 = null;
        } else {
          localObject1 = paramzzad.zzb(((zzahb)((Pair)localObject2).second).zzb);
        }
        paramzzagg.zza[paramInt5] = ((zzahb)((Pair)localObject2).second);
      }
      paramzzfd.zzF(n);
      localObject4 = localObject1;
    }
    paramzzad = "audio/raw";
    if (paramInt1 == 1633889587) {
      paramzzad = "audio/ac3";
    }
    for (;;)
    {
      paramInt1 = -1;
      break;
      if (paramInt1 == 1700998451) {
        paramzzad = "audio/eac3";
      } else if (paramInt1 == 1633889588) {
        paramzzad = "audio/ac4";
      } else if (paramInt1 == 1685353315) {
        paramzzad = "audio/vnd.dts";
      } else if ((paramInt1 != 1685353320) && (paramInt1 != 1685353324))
      {
        if (paramInt1 == 1685353317)
        {
          paramzzad = "audio/vnd.dts.hd;profile=lbr";
        }
        else if (paramInt1 == 1685353336)
        {
          paramzzad = "audio/vnd.dts.uhd;profile=p2";
        }
        else if (paramInt1 == 1935764850)
        {
          paramzzad = "audio/3gpp";
        }
        else if (paramInt1 == 1935767394)
        {
          paramzzad = "audio/amr-wb";
        }
        else if ((paramInt1 != 1819304813) && (paramInt1 != 1936684916))
        {
          if (paramInt1 == 1953984371)
          {
            paramInt1 = 268435456;
            break;
          }
          if ((paramInt1 != 778924082) && (paramInt1 != 778924083))
          {
            if (paramInt1 == 1835557169)
            {
              paramzzad = "audio/mha1";
            }
            else if (paramInt1 == 1835560241)
            {
              paramzzad = "audio/mhm1";
            }
            else if (paramInt1 == 1634492771)
            {
              paramzzad = "audio/alac";
            }
            else if (paramInt1 == 1634492791)
            {
              paramzzad = "audio/g711-alaw";
            }
            else if (paramInt1 == 1970037111)
            {
              paramzzad = "audio/g711-mlaw";
            }
            else if (paramInt1 == 1332770163)
            {
              paramzzad = "audio/opus";
            }
            else if (paramInt1 == 1716281667)
            {
              paramzzad = "audio/flac";
            }
            else if (paramInt1 == 1835823201)
            {
              paramzzad = "audio/true-hd";
            }
            else
            {
              paramInt1 = -1;
              paramzzad = null;
              break;
            }
          }
          else {
            paramzzad = "audio/mpeg";
          }
        }
        else
        {
          paramInt1 = 2;
          break;
        }
      }
      else {
        paramzzad = "audio/vnd.dts.hd";
      }
    }
    Object localObject5 = paramzzad;
    Object localObject3 = null;
    Object localObject2 = null;
    paramzzad = null;
    paramInt5 = j;
    while (n - paramInt2 < paramInt3)
    {
      paramzzfd.zzF(n);
      int i3 = paramzzfd.zze();
      boolean bool;
      if (i3 > 0) {
        bool = true;
      } else {
        bool = false;
      }
      localObject1 = "childAtomSize must be positive";
      zzaas.zzb(bool, "childAtomSize must be positive");
      j = paramzzfd.zze();
      if (j == 1835557187)
      {
        j = i3 - 13;
        paramzzad = new byte[j];
        paramzzfd.zzF(n + 13);
        paramzzfd.zzB(paramzzad, 0, j);
        paramzzad = zzfrr.zzm(paramzzad);
      }
      for (;;)
      {
        k = paramInt1;
        paramInt1 = i;
        j = paramInt5;
        localObject6 = localObject2;
        localObject1 = paramzzad;
        break label1656;
        if (j == 1702061171) {
          break label1514;
        }
        if ((paramBoolean) && (j == 2002876005))
        {
          j = paramzzfd.zzc();
          if (j >= n) {
            bool = true;
          } else {
            bool = false;
          }
          zzaas.zzb(bool, null);
          while (j - n < i3)
          {
            paramzzfd.zzF(j);
            k = paramzzfd.zze();
            if (k > 0) {
              bool = true;
            } else {
              bool = false;
            }
            zzaas.zzb(bool, (String)localObject1);
            if (paramzzfd.zze() != 1702061171) {
              j += k;
            } else {
              break label855;
            }
          }
          j = -1;
          label855:
          i2 = j;
          i1 = paramInt1;
          break label1521;
        }
        k = paramInt1;
        if (j == 1684103987)
        {
          paramzzfd.zzF(n + 8);
          paramzzagg.zzb = zzzp.zzc(paramzzfd, Integer.toString(paramInt4), paramString, (zzad)localObject4);
        }
        else if (j == 1684366131)
        {
          paramzzfd.zzF(n + 8);
          paramzzagg.zzb = zzzp.zzd(paramzzfd, Integer.toString(paramInt4), paramString, (zzad)localObject4);
        }
        else if (j == 1684103988)
        {
          paramzzfd.zzF(n + 8);
          localObject6 = Integer.toString(paramInt4);
          j = zzzs.zza;
          paramzzfd.zzG(1);
          j = paramzzfd.zzk();
          localObject1 = new zzak();
          ((zzak)localObject1).zzH((String)localObject6);
          ((zzak)localObject1).zzS("audio/ac4");
          ((zzak)localObject1).zzw(2);
          if (1 != (j & 0x20) >> 5) {
            j = 44100;
          } else {
            j = 48000;
          }
          ((zzak)localObject1).zzT(j);
          ((zzak)localObject1).zzB((zzad)localObject4);
          ((zzak)localObject1).zzK(paramString);
          paramzzagg.zzb = ((zzak)localObject1).zzY();
        }
        else if (j == 1684892784)
        {
          if (m > 0)
          {
            i = m;
            paramInt5 = 2;
          }
          else
          {
            paramzzfd = new StringBuilder();
            paramzzfd.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
            paramzzfd.append(m);
            throw zzce.zza(paramzzfd.toString(), null);
          }
        }
        else
        {
          if ((j == 1684305011) || (j == 1969517683)) {
            break label1429;
          }
          if (j != 1682927731) {
            break;
          }
          j = i3 - 8;
          paramzzad = zza;
          localObject1 = Arrays.copyOf(paramzzad, paramzzad.length + j);
          paramzzfd.zzF(n + 8);
          paramzzfd.zzB((byte[])localObject1, paramzzad.length, j);
          paramzzad = zzabj.zzd((byte[])localObject1);
        }
      }
      if (j == 1684425825)
      {
        paramInt1 = i3 - 12;
        paramzzad = new byte[paramInt1 + 4];
        paramzzad[0] = 102;
        paramzzad[1] = 76;
        paramzzad[2] = 97;
        paramzzad[3] = 67;
        paramzzfd.zzF(n + 12);
        paramzzfd.zzB(paramzzad, 4, paramInt1);
        paramzzad = zzfrr.zzm(paramzzad);
      }
      while (j != 1634492771)
      {
        paramInt1 = i;
        j = paramInt5;
        localObject6 = localObject2;
        localObject1 = paramzzad;
        break;
      }
      paramInt1 = i3 - 12;
      paramzzad = new byte[paramInt1];
      paramzzfd.zzF(n + 12);
      paramzzfd.zzB(paramzzad, 0, paramInt1);
      paramInt1 = zzea.zza;
      localObject1 = new zzfd(paramzzad);
      ((zzfd)localObject1).zzF(9);
      paramInt1 = ((zzfd)localObject1).zzk();
      ((zzfd)localObject1).zzF(20);
      localObject1 = Pair.create(Integer.valueOf(((zzfd)localObject1).zzn()), Integer.valueOf(paramInt1));
      paramInt1 = ((Integer)((Pair)localObject1).first).intValue();
      j = ((Integer)((Pair)localObject1).second).intValue();
      localObject1 = zzfrr.zzm(paramzzad);
      Object localObject6 = localObject2;
      break label1656;
      label1429:
      localObject1 = new zzak();
      ((zzak)localObject1).zzG(paramInt4);
      ((zzak)localObject1).zzS((String)localObject5);
      ((zzak)localObject1).zzw(paramInt5);
      ((zzak)localObject1).zzT(i);
      ((zzak)localObject1).zzB((zzad)localObject4);
      ((zzak)localObject1).zzK(paramString);
      paramzzagg.zzb = ((zzak)localObject1).zzY();
      paramInt1 = i;
      j = paramInt5;
      localObject6 = localObject2;
      localObject1 = paramzzad;
      break label1656;
      label1514:
      int i2 = n;
      i1 = paramInt1;
      label1521:
      paramInt1 = i;
      j = paramInt5;
      localObject6 = localObject2;
      localObject1 = paramzzad;
      k = i1;
      if (i2 != -1)
      {
        zzage localzzage = zzl(paramzzfd, i2);
        localObject5 = zzage.zzc(localzzage);
        localObject1 = zzage.zzd(localzzage);
        paramInt1 = i;
        j = paramInt5;
        localObject3 = localObject2;
        if (localObject1 != null)
        {
          paramInt1 = i;
          if ("audio/mp4a-latm".equals(localObject5))
          {
            paramzzad = zzzm.zza((byte[])localObject1);
            paramInt1 = paramzzad.zza;
            paramInt5 = paramzzad.zzb;
            localObject2 = paramzzad.zzc;
          }
          paramzzad = zzfrr.zzm(localObject1);
          localObject3 = localObject2;
          j = paramInt5;
        }
        k = i1;
        localObject1 = paramzzad;
        localObject6 = localObject3;
        localObject3 = localzzage;
      }
      label1656:
      n += i3;
      i = paramInt1;
      paramInt5 = j;
      paramInt1 = k;
      localObject2 = localObject6;
      paramzzad = (zzad)localObject1;
    }
    if ((paramzzagg.zzb == null) && (localObject5 != null))
    {
      paramzzfd = new zzak();
      paramzzfd.zzG(paramInt4);
      paramzzfd.zzS((String)localObject5);
      paramzzfd.zzx((String)localObject2);
      paramzzfd.zzw(paramInt5);
      paramzzfd.zzT(i);
      paramzzfd.zzN(paramInt1);
      paramzzfd.zzI(paramzzad);
      paramzzfd.zzB((zzad)localObject4);
      paramzzfd.zzK(paramString);
      if (localObject3 != null)
      {
        paramzzfd.zzv(zzftz.zzc(zzage.zza((zzage)localObject3)));
        paramzzfd.zzO(zzftz.zzc(zzage.zzb((zzage)localObject3)));
      }
      paramzzagg.zzb = paramzzfd.zzY();
    }
  }
  
  private static void zzo(zzfd paramzzfd, int paramInt1, int paramInt2, int paramInt3, zzagg paramzzagg)
  {
    paramzzfd.zzF(paramInt2 + 16);
    paramzzfd.zzv('\000');
    paramzzfd = paramzzfd.zzv('\000');
    if (paramzzfd != null)
    {
      zzak localzzak = new zzak();
      localzzak.zzG(paramInt3);
      localzzak.zzS(paramzzfd);
      paramzzagg.zzb = localzzak.zzY();
    }
  }
  
  private static boolean zzp(long[] paramArrayOfLong, long paramLong1, long paramLong2, long paramLong3)
  {
    int j = paramArrayOfLong.length;
    int k = j - 1;
    int i = Math.max(0, Math.min(4, k));
    j = Math.max(0, Math.min(j - 4, k));
    return (paramArrayOfLong[0] <= paramLong2) && (paramLong2 < paramArrayOfLong[i]) && (paramArrayOfLong[j] < paramLong3) && (paramLong3 <= paramLong1);
  }
  
  private static byte[] zzq(zzfd paramzzfd, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + 8;
    while (i - paramInt1 < paramInt2)
    {
      paramzzfd.zzF(i);
      int j = paramzzfd.zze();
      if (paramzzfd.zze() == 1886547818) {
        return Arrays.copyOfRange(paramzzfd.zzH(), i, j + i);
      }
      i += j;
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzagl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */