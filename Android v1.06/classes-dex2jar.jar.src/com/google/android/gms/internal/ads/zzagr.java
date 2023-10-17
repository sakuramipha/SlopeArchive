package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class zzagr
  implements zzaao
{
  public static final zzaav zza = zzagn.zza;
  private static final byte[] zzb = { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
  private static final zzam zzc;
  private int zzA;
  private int zzB;
  private boolean zzC;
  private zzaar zzD;
  private zzabr[] zzE;
  private zzabr[] zzF;
  private boolean zzG;
  private final List zzd;
  private final SparseArray zze;
  private final zzfd zzf;
  private final zzfd zzg;
  private final zzfd zzh;
  private final byte[] zzi;
  private final zzfd zzj;
  private final zzadi zzk;
  private final zzfd zzl;
  private final ArrayDeque zzm;
  private final ArrayDeque zzn;
  private int zzo;
  private int zzp;
  private long zzq;
  private int zzr;
  private zzfd zzs;
  private long zzt;
  private int zzu;
  private long zzv;
  private long zzw;
  private long zzx;
  private zzagq zzy;
  private int zzz;
  
  static
  {
    zzak localzzak = new zzak();
    localzzak.zzS("application/x-emsg");
    zzc = localzzak.zzY();
  }
  
  public zzagr()
  {
    this(0, null);
  }
  
  public zzagr(int paramInt, zzfl paramzzfl)
  {
    this.zzd = Collections.unmodifiableList(paramzzfl);
    this.zzk = new zzadi();
    this.zzl = new zzfd(16);
    this.zzf = new zzfd(zzew.zza);
    this.zzg = new zzfd(5);
    this.zzh = new zzfd();
    paramzzfl = new byte[16];
    this.zzi = paramzzfl;
    this.zzj = new zzfd(paramzzfl);
    this.zzm = new ArrayDeque();
    this.zzn = new ArrayDeque();
    this.zze = new SparseArray();
    this.zzw = -9223372036854775807L;
    this.zzv = -9223372036854775807L;
    this.zzx = -9223372036854775807L;
    this.zzD = zzaar.zza;
    this.zzE = new zzabr[0];
    this.zzF = new zzabr[0];
  }
  
  private static int zze(int paramInt)
    throws zzce
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unexpected negative value: ");
    localStringBuilder.append(paramInt);
    throw zzce.zza(localStringBuilder.toString(), null);
  }
  
  private static zzad zzf(List paramList)
  {
    int j = paramList.size();
    Object localObject2 = null;
    int i = 0;
    while (i < j)
    {
      Object localObject3 = (zzagb)paramList.get(i);
      Object localObject1 = localObject2;
      if (((zzagb)localObject3).zzd == 1886614376)
      {
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new ArrayList();
        }
        localObject3 = ((zzagb)localObject3).zza.zzH();
        localObject2 = new zzfd((byte[])localObject3);
        if (((zzfd)localObject2).zzd() < 32) {}
        int m;
        UUID localUUID;
        int k;
        do
        {
          for (;;)
          {
            localObject2 = null;
            break label274;
            ((zzfd)localObject2).zzF(0);
            if ((((zzfd)localObject2).zze() == ((zzfd)localObject2).zza() + 4) && (((zzfd)localObject2).zze() == 1886614376))
            {
              m = zzagc.zze(((zzfd)localObject2).zze());
              if (m <= 1) {
                break;
              }
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("Unsupported pssh version: ");
              ((StringBuilder)localObject2).append(m);
              zzer.zze("PsshAtomUtil", ((StringBuilder)localObject2).toString());
            }
          }
          localUUID = new UUID(((zzfd)localObject2).zzr(), ((zzfd)localObject2).zzr());
          if (m == 1) {
            ((zzfd)localObject2).zzG(((zzfd)localObject2).zzn() * 16);
          }
          k = ((zzfd)localObject2).zzn();
        } while (k != ((zzfd)localObject2).zza());
        byte[] arrayOfByte = new byte[k];
        ((zzfd)localObject2).zzB(arrayOfByte, 0, k);
        localObject2 = new zzagx(localUUID, m, arrayOfByte);
        label274:
        if (localObject2 == null) {
          localObject2 = null;
        } else {
          localObject2 = zzagx.zza((zzagx)localObject2);
        }
        if (localObject2 == null) {
          zzer.zze("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
        } else {
          ((ArrayList)localObject1).add(new zzac((UUID)localObject2, null, "video/mp4", (byte[])localObject3));
        }
      }
      i++;
      localObject2 = localObject1;
    }
    if (localObject2 == null) {
      return null;
    }
    return new zzad((List)localObject2);
  }
  
  private final void zzg()
  {
    this.zzo = 0;
    this.zzr = 0;
  }
  
  private static void zzh(zzfd paramzzfd, int paramInt, zzahc paramzzahc)
    throws zzce
  {
    paramzzfd.zzF(paramInt + 8);
    paramInt = paramzzfd.zze() & 0xFFFFFF;
    if ((paramInt & 0x1) == 0)
    {
      boolean bool;
      if ((paramInt & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      paramInt = paramzzfd.zzn();
      if (paramInt == 0)
      {
        Arrays.fill(paramzzahc.zzl, 0, paramzzahc.zze, false);
        return;
      }
      int i = paramzzahc.zze;
      if (paramInt == i)
      {
        Arrays.fill(paramzzahc.zzl, 0, paramInt, bool);
        paramzzahc.zza(paramzzfd.zza());
        zzfd localzzfd = paramzzahc.zzn;
        paramzzfd.zzB(localzzfd.zzH(), 0, localzzfd.zzd());
        paramzzahc.zzn.zzF(0);
        paramzzahc.zzo = false;
        return;
      }
      paramzzfd = new StringBuilder();
      paramzzfd.append("Senc sample count ");
      paramzzfd.append(paramInt);
      paramzzfd.append(" is different from fragment sample count");
      paramzzfd.append(i);
      throw zzce.zza(paramzzfd.toString(), null);
    }
    throw zzce.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
  }
  
  private final void zzi(long paramLong)
    throws zzce
  {
    Object localObject1 = this;
    while ((!((zzagr)localObject1).zzm.isEmpty()) && (((zzaga)((zzagr)localObject1).zzm.peek()).zza == paramLong))
    {
      Object localObject3 = (zzaga)((zzagr)localObject1).zzm.pop();
      int i = ((zzaga)localObject3).zzd;
      Object localObject5;
      Object localObject4;
      Object localObject2;
      int j;
      long l1;
      Object localObject6;
      int k;
      boolean bool;
      if (i == 1836019574)
      {
        localObject5 = zzf(((zzaga)localObject3).zzb);
        localObject4 = ((zzaga)localObject3).zza(1836475768);
        Objects.requireNonNull(localObject4);
        localObject2 = new SparseArray();
        j = ((zzaga)localObject4).zzb.size();
        l1 = -9223372036854775807L;
        for (i = 0; i < j; i++)
        {
          localObject6 = (zzagb)((zzaga)localObject4).zzb.get(i);
          k = ((zzagb)localObject6).zzd;
          if (k == 1953654136)
          {
            localObject6 = ((zzagb)localObject6).zza;
            ((zzfd)localObject6).zzF(12);
            localObject6 = Pair.create(Integer.valueOf(((zzfd)localObject6).zze()), new zzagm(((zzfd)localObject6).zze() - 1, ((zzfd)localObject6).zze(), ((zzfd)localObject6).zze(), ((zzfd)localObject6).zze()));
            ((SparseArray)localObject2).put(((Integer)((Pair)localObject6).first).intValue(), (zzagm)((Pair)localObject6).second);
          }
          else if (k == 1835362404)
          {
            localObject6 = ((zzagb)localObject6).zza;
            ((zzfd)localObject6).zzF(8);
            if (zzagc.zze(((zzfd)localObject6).zze()) == 0) {
              l1 = ((zzfd)localObject6).zzs();
            } else {
              l1 = ((zzfd)localObject6).zzt();
            }
          }
        }
        localObject3 = zzagl.zzc((zzaga)localObject3, new zzabd(), l1, (zzad)localObject5, false, false, new zzago((zzagr)localObject1));
        j = ((List)localObject3).size();
        if (((zzagr)localObject1).zze.size() == 0)
        {
          for (i = 0; i < j; i++)
          {
            localObject5 = (zzahd)((List)localObject3).get(i);
            localObject4 = ((zzahd)localObject5).zza;
            localObject5 = new zzagq(((zzagr)localObject1).zzD.zzv(i, ((zzaha)localObject4).zzb), (zzahd)localObject5, zzj((SparseArray)localObject2, ((zzaha)localObject4).zza));
            ((zzagr)localObject1).zze.put(((zzaha)localObject4).zza, localObject5);
            ((zzagr)localObject1).zzw = Math.max(((zzagr)localObject1).zzw, ((zzaha)localObject4).zze);
          }
          ((zzagr)localObject1).zzD.zzC();
        }
        else
        {
          if (((zzagr)localObject1).zze.size() == j) {
            bool = true;
          } else {
            bool = false;
          }
          zzdy.zzf(bool);
          for (i = 0; i < j; i++)
          {
            localObject4 = (zzahd)((List)localObject3).get(i);
            localObject5 = ((zzahd)localObject4).zza;
            ((zzagq)((zzagr)localObject1).zze.get(((zzaha)localObject5).zza)).zzh((zzahd)localObject4, zzj((SparseArray)localObject2, ((zzaha)localObject5).zza));
          }
        }
      }
      else if (i == 1836019558)
      {
        localObject4 = ((zzagr)localObject1).zze;
        localObject1 = ((zzagr)localObject1).zzi;
        i = ((zzaga)localObject3).zzc.size();
        j = 0;
        localObject2 = localObject3;
        localObject3 = localObject4;
        while (j < i)
        {
          Object localObject7 = (zzaga)((zzaga)localObject2).zzc.get(j);
          if (((zzaga)localObject7).zzd == 1953653094)
          {
            localObject4 = ((zzaga)localObject7).zzb(1952868452);
            Objects.requireNonNull(localObject4);
            localObject5 = ((zzagb)localObject4).zza;
            ((zzfd)localObject5).zzF(8);
            int i1 = ((zzfd)localObject5).zze() & 0xFFFFFF;
            localObject4 = (zzagq)((SparseArray)localObject3).get(((zzfd)localObject5).zze());
            int m;
            int n;
            if (localObject4 == null)
            {
              localObject4 = null;
            }
            else
            {
              if ((i1 & 0x1) != 0)
              {
                l1 = ((zzfd)localObject5).zzt();
                localObject6 = ((zzagq)localObject4).zzb;
                ((zzahc)localObject6).zzb = l1;
                ((zzahc)localObject6).zzc = l1;
              }
              localObject6 = ((zzagq)localObject4).zze;
              if ((i1 & 0x2) != 0) {
                k = ((zzfd)localObject5).zze() - 1;
              } else {
                k = ((zzagm)localObject6).zza;
              }
              if ((i1 & 0x8) != 0) {
                m = ((zzfd)localObject5).zze();
              } else {
                m = ((zzagm)localObject6).zzb;
              }
              if ((i1 & 0x10) != 0) {
                n = ((zzfd)localObject5).zze();
              } else {
                n = ((zzagm)localObject6).zzc;
              }
              if ((i1 & 0x20) != 0) {
                i1 = ((zzfd)localObject5).zze();
              } else {
                i1 = ((zzagm)localObject6).zzd;
              }
              ((zzagq)localObject4).zzb.zza = new zzagm(k, m, n, i1);
            }
            if (localObject4 != null)
            {
              Object localObject8 = ((zzagq)localObject4).zzb;
              l1 = ((zzahc)localObject8).zzp;
              bool = ((zzahc)localObject8).zzq;
              ((zzagq)localObject4).zzi();
              zzagq.zzg((zzagq)localObject4, true);
              localObject5 = ((zzaga)localObject7).zzb(1952867444);
              if (localObject5 != null)
              {
                localObject5 = ((zzagb)localObject5).zza;
                ((zzfd)localObject5).zzF(8);
                if (zzagc.zze(((zzfd)localObject5).zze()) == 1) {
                  l1 = ((zzfd)localObject5).zzt();
                } else {
                  l1 = ((zzfd)localObject5).zzs();
                }
                ((zzahc)localObject8).zzp = l1;
                ((zzahc)localObject8).zzq = true;
              }
              else
              {
                ((zzahc)localObject8).zzp = l1;
                ((zzahc)localObject8).zzq = bool;
              }
              Object localObject9 = ((zzaga)localObject7).zzb;
              int i3 = ((List)localObject9).size();
              m = 0;
              n = 0;
              for (i1 = 0; m < i3; i1 = k)
              {
                localObject5 = (zzagb)((List)localObject9).get(m);
                i2 = n;
                k = i1;
                if (((zzagb)localObject5).zzd == 1953658222)
                {
                  localObject5 = ((zzagb)localObject5).zza;
                  ((zzfd)localObject5).zzF(12);
                  i4 = ((zzfd)localObject5).zzn();
                  i2 = n;
                  k = i1;
                  if (i4 > 0)
                  {
                    k = i1 + i4;
                    i2 = n + 1;
                  }
                }
                m++;
                n = i2;
              }
              localObject5 = localObject3;
              ((zzagq)localObject4).zzh = 0;
              ((zzagq)localObject4).zzg = 0;
              ((zzagq)localObject4).zzf = 0;
              localObject3 = ((zzagq)localObject4).zzb;
              ((zzahc)localObject3).zzd = n;
              ((zzahc)localObject3).zze = i1;
              if (((zzahc)localObject3).zzg.length < n)
              {
                ((zzahc)localObject3).zzf = new long[n];
                ((zzahc)localObject3).zzg = new int[n];
              }
              if (((zzahc)localObject3).zzh.length < i1)
              {
                k = i1 * 125 / 100;
                ((zzahc)localObject3).zzh = new int[k];
                ((zzahc)localObject3).zzi = new long[k];
                ((zzahc)localObject3).zzj = new boolean[k];
                ((zzahc)localObject3).zzl = new boolean[k];
              }
              m = 0;
              int i4 = 0;
              n = 0;
              localObject6 = localObject4;
              localObject3 = localObject7;
              int i2 = i3;
              k = i;
              localObject7 = localObject9;
              localObject4 = localObject8;
              Object localObject11;
              Object localObject10;
              long l2;
              for (i3 = m;; i3++)
              {
                l1 = 0L;
                if (i3 >= i2) {
                  break;
                }
                localObject8 = (zzagb)((List)localObject7).get(i3);
                if (((zzagb)localObject8).zzd == 1953658222)
                {
                  localObject9 = ((zzagb)localObject8).zza;
                  ((zzfd)localObject9).zzF(8);
                  int i12 = ((zzfd)localObject9).zze() & 0xFFFFFF;
                  localObject11 = ((zzagq)localObject6).zzd.zza;
                  localObject10 = ((zzagq)localObject6).zzb;
                  localObject8 = ((zzahc)localObject10).zza;
                  i = zzfn.zza;
                  ((zzahc)localObject10).zzg[i4] = ((zzfd)localObject9).zzn();
                  Object localObject12 = ((zzahc)localObject10).zzf;
                  l2 = ((zzahc)localObject10).zzb;
                  localObject12[i4] = l2;
                  if ((i12 & 0x1) != 0) {
                    localObject12[i4] = (l2 + ((zzfd)localObject9).zze());
                  }
                  int i5;
                  if ((i12 & 0x4) != 0) {
                    i5 = 1;
                  } else {
                    i5 = 0;
                  }
                  m = ((zzagm)localObject8).zzd;
                  if (i5 != 0) {
                    m = ((zzfd)localObject9).zze();
                  }
                  int i8 = i12 & 0x100;
                  int i7 = i12 & 0x200;
                  int i6 = i12 & 0x800;
                  long[] arrayOfLong = ((zzaha)localObject11).zzh;
                  if (arrayOfLong != null) {
                    if (arrayOfLong.length == 1)
                    {
                      localObject12 = ((zzaha)localObject11).zzi;
                      if (localObject12 != null)
                      {
                        l2 = arrayOfLong[0];
                        if ((l2 != 0L) && (zzfn.zzp(l2 + localObject12[0], 1000000L, ((zzaha)localObject11).zzd) < ((zzaha)localObject11).zze)) {
                          break label1576;
                        }
                        l1 = localObject11.zzi[0];
                      }
                    }
                  }
                  label1576:
                  localObject12 = ((zzahc)localObject10).zzh;
                  arrayOfLong = ((zzahc)localObject10).zzi;
                  boolean[] arrayOfBoolean = ((zzahc)localObject10).zzj;
                  i1 = localObject10.zzg[i4] + n;
                  l2 = ((zzaha)localObject11).zzc;
                  long l3 = ((zzahc)localObject10).zzp;
                  i = n;
                  n = i1;
                  while (i < n)
                  {
                    int i9;
                    if (i8 != 0) {
                      i9 = ((zzfd)localObject9).zze();
                    } else {
                      i9 = ((zzagm)localObject8).zzb;
                    }
                    zze(i9);
                    int i10;
                    if (i7 != 0) {
                      i10 = ((zzfd)localObject9).zze();
                    } else {
                      i10 = ((zzagm)localObject8).zzc;
                    }
                    zze(i10);
                    int i11;
                    if ((i12 & 0x400) != 0)
                    {
                      i1 = ((zzfd)localObject9).zze();
                    }
                    else
                    {
                      i1 = i;
                      if (i == 0)
                      {
                        if (i5 != 0)
                        {
                          i1 = m;
                          i = 0;
                        }
                        else
                        {
                          i1 = 0;
                        }
                      }
                      else
                      {
                        i11 = ((zzagm)localObject8).zzd;
                        i = i1;
                        i1 = i11;
                      }
                    }
                    if (i6 != 0) {
                      i11 = ((zzfd)localObject9).zze();
                    } else {
                      i11 = 0;
                    }
                    long l4 = zzfn.zzp(i11 + l3 - l1, 1000000L, l2);
                    arrayOfLong[i] = l4;
                    if (!((zzahc)localObject10).zzq) {
                      arrayOfLong[i] = (l4 + ((zzagq)localObject6).zzd.zzh);
                    }
                    localObject12[i] = i10;
                    if (1 != (i1 >> 16 & 0x1 ^ 0x1)) {
                      bool = false;
                    } else {
                      bool = true;
                    }
                    arrayOfBoolean[i] = bool;
                    l3 += i9;
                    i++;
                  }
                  ((zzahc)localObject10).zzp = l3;
                  i4++;
                }
              }
              localObject6 = ((zzagq)localObject6).zzd.zza;
              localObject7 = ((zzahc)localObject4).zza;
              Objects.requireNonNull(localObject7);
              localObject6 = ((zzaha)localObject6).zza(((zzagm)localObject7).zza);
              localObject7 = ((zzaga)localObject3).zzb(1935763834);
              if (localObject7 != null)
              {
                Objects.requireNonNull(localObject6);
                localObject8 = ((zzagb)localObject7).zza;
                i1 = ((zzahb)localObject6).zzd;
                ((zzfd)localObject8).zzF(8);
                if ((((zzfd)localObject8).zze() & 0x1) == 1) {
                  ((zzfd)localObject8).zzG(8);
                }
                m = ((zzfd)localObject8).zzk();
                n = ((zzfd)localObject8).zzn();
                i = ((zzahc)localObject4).zze;
                if (n <= i)
                {
                  if (m == 0)
                  {
                    localObject7 = ((zzahc)localObject4).zzl;
                    m = 0;
                    i = 0;
                    while (m < n)
                    {
                      i2 = ((zzfd)localObject8).zzk();
                      i += i2;
                      if (i2 > i1) {
                        bool = true;
                      } else {
                        bool = false;
                      }
                      localObject7[m] = bool;
                      m++;
                    }
                  }
                  else
                  {
                    if (m > i1) {
                      bool = true;
                    } else {
                      bool = false;
                    }
                    i = m * n;
                    Arrays.fill(((zzahc)localObject4).zzl, 0, n, bool);
                  }
                  Arrays.fill(((zzahc)localObject4).zzl, n, ((zzahc)localObject4).zze, false);
                  if (i > 0) {
                    ((zzahc)localObject4).zza(i);
                  }
                }
                else
                {
                  localObject1 = new StringBuilder();
                  ((StringBuilder)localObject1).append("Saiz sample count ");
                  ((StringBuilder)localObject1).append(n);
                  ((StringBuilder)localObject1).append(" is greater than fragment sample count");
                  ((StringBuilder)localObject1).append(i);
                  throw zzce.zza(((StringBuilder)localObject1).toString(), null);
                }
              }
              localObject7 = ((zzaga)localObject3).zzb(1935763823);
              if (localObject7 != null)
              {
                localObject7 = ((zzagb)localObject7).zza;
                ((zzfd)localObject7).zzF(8);
                m = ((zzfd)localObject7).zze();
                if ((m & 0x1) == 1) {
                  ((zzfd)localObject7).zzG(8);
                }
                i = ((zzfd)localObject7).zzn();
                if (i == 1)
                {
                  i = zzagc.zze(m);
                  l2 = ((zzahc)localObject4).zzc;
                  if (i == 0) {
                    l1 = ((zzfd)localObject7).zzs();
                  } else {
                    l1 = ((zzfd)localObject7).zzt();
                  }
                  ((zzahc)localObject4).zzc = (l2 + l1);
                }
                else
                {
                  localObject1 = new StringBuilder();
                  ((StringBuilder)localObject1).append("Unexpected saio entry count: ");
                  ((StringBuilder)localObject1).append(i);
                  throw zzce.zza(((StringBuilder)localObject1).toString(), null);
                }
              }
              localObject7 = ((zzaga)localObject3).zzb(1936027235);
              if (localObject7 != null) {
                zzh(((zzagb)localObject7).zza, 0, (zzahc)localObject4);
              }
              if (localObject6 != null) {
                localObject6 = ((zzahb)localObject6).zzb;
              } else {
                localObject6 = null;
              }
              localObject8 = null;
              localObject7 = null;
              i = 0;
              while (i < ((zzaga)localObject3).zzb.size())
              {
                localObject10 = (zzagb)((zzaga)localObject3).zzb.get(i);
                localObject9 = ((zzagb)localObject10).zza;
                m = ((zzagb)localObject10).zzd;
                if (m == 1935828848)
                {
                  ((zzfd)localObject9).zzF(12);
                  localObject10 = localObject8;
                  localObject11 = localObject7;
                  if (((zzfd)localObject9).zze() == 1936025959)
                  {
                    localObject10 = localObject9;
                    localObject11 = localObject7;
                  }
                }
                else
                {
                  localObject10 = localObject8;
                  localObject11 = localObject7;
                  if (m == 1936158820)
                  {
                    ((zzfd)localObject9).zzF(12);
                    localObject10 = localObject8;
                    localObject11 = localObject7;
                    if (((zzfd)localObject9).zze() == 1936025959)
                    {
                      localObject11 = localObject9;
                      localObject10 = localObject8;
                    }
                  }
                }
                i++;
                localObject8 = localObject10;
                localObject7 = localObject11;
              }
              if ((localObject8 != null) && (localObject7 != null))
              {
                ((zzfd)localObject8).zzF(8);
                i = zzagc.zze(((zzfd)localObject8).zze());
                ((zzfd)localObject8).zzG(4);
                if (i == 1) {
                  ((zzfd)localObject8).zzG(4);
                }
                if (((zzfd)localObject8).zze() == 1)
                {
                  ((zzfd)localObject7).zzF(8);
                  i = zzagc.zze(((zzfd)localObject7).zze());
                  ((zzfd)localObject7).zzG(4);
                  if (i == 1)
                  {
                    if (((zzfd)localObject7).zzs() == 0L) {
                      throw zzce.zzc("Variable length description in sgpd found (unsupported)");
                    }
                  }
                  else if (i >= 2) {
                    ((zzfd)localObject7).zzG(4);
                  }
                  if (((zzfd)localObject7).zzs() == 1L)
                  {
                    ((zzfd)localObject7).zzG(1);
                    n = ((zzfd)localObject7).zzk();
                    if (((zzfd)localObject7).zzk() == 1)
                    {
                      i = ((zzfd)localObject7).zzk();
                      localObject9 = new byte[16];
                      ((zzfd)localObject7).zzB((byte[])localObject9, 0, 16);
                      if (i == 0)
                      {
                        m = ((zzfd)localObject7).zzk();
                        localObject8 = new byte[m];
                        ((zzfd)localObject7).zzB((byte[])localObject8, 0, m);
                        localObject7 = localObject8;
                      }
                      else
                      {
                        localObject7 = null;
                      }
                      ((zzahc)localObject4).zzk = true;
                      ((zzahc)localObject4).zzm = new zzahb(true, (String)localObject6, i, (byte[])localObject9, (n & 0xF0) >> 4, n & 0xF, (byte[])localObject7);
                    }
                  }
                  else
                  {
                    throw zzce.zzc("Entry count in sgpd != 1 (unsupported).");
                  }
                }
                else
                {
                  throw zzce.zzc("Entry count in sbgp != 1 (unsupported).");
                }
              }
              m = ((zzaga)localObject3).zzb.size();
              for (i = 0; i < m; i++)
              {
                localObject6 = (zzagb)((zzaga)localObject3).zzb.get(i);
                if (((zzagb)localObject6).zzd == 1970628964)
                {
                  localObject6 = ((zzagb)localObject6).zza;
                  ((zzfd)localObject6).zzF(8);
                  ((zzfd)localObject6).zzB((byte[])localObject1, 0, 16);
                  if (Arrays.equals((byte[])localObject1, zzb)) {
                    zzh((zzfd)localObject6, 16, (zzahc)localObject4);
                  }
                }
              }
              localObject3 = localObject1;
              localObject1 = localObject5;
              i = k;
              break label2923;
            }
          }
          localObject4 = localObject1;
          localObject1 = localObject3;
          localObject3 = localObject4;
          label2923:
          localObject4 = localObject3;
          j++;
          localObject3 = localObject1;
          localObject1 = localObject4;
        }
        localObject4 = zzf(((zzaga)localObject2).zzb);
        localObject2 = this;
        if (localObject4 != null)
        {
          j = ((zzagr)localObject2).zze.size();
          for (i = 0; i < j; i++)
          {
            localObject3 = (zzagq)((zzagr)localObject2).zze.valueAt(i);
            localObject5 = ((zzagq)localObject3).zzd.zza;
            localObject1 = ((zzagq)localObject3).zzb.zza;
            k = zzfn.zza;
            localObject1 = ((zzaha)localObject5).zza(((zzagm)localObject1).zza);
            if (localObject1 != null) {
              localObject1 = ((zzahb)localObject1).zzb;
            } else {
              localObject1 = null;
            }
            localObject1 = ((zzad)localObject4).zzb((String)localObject1);
            localObject5 = ((zzagq)localObject3).zzd.zza.zzf.zzb();
            ((zzak)localObject5).zzB((zzad)localObject1);
            localObject1 = ((zzak)localObject5).zzY();
            ((zzagq)localObject3).zza.zzk((zzam)localObject1);
          }
        }
        localObject1 = localObject2;
        if (((zzagr)localObject2).zzv != -9223372036854775807L)
        {
          k = ((zzagr)localObject2).zze.size();
          for (i = 0; i < k; i++)
          {
            localObject1 = (zzagq)((zzagr)localObject2).zze.valueAt(i);
            l1 = ((zzagr)localObject2).zzv;
            for (j = ((zzagq)localObject1).zzf;; j++)
            {
              localObject3 = ((zzagq)localObject1).zzb;
              if ((j >= ((zzahc)localObject3).zze) || (localObject3.zzi[j] > l1)) {
                break;
              }
              if (localObject3.zzj[j] != 0) {
                ((zzagq)localObject1).zzi = j;
              }
            }
          }
          ((zzagr)localObject2).zzv = -9223372036854775807L;
          localObject1 = localObject2;
        }
      }
      else
      {
        localObject2 = localObject1;
        localObject1 = localObject2;
        if (!((zzagr)localObject2).zzm.isEmpty())
        {
          ((zzaga)((zzagr)localObject2).zzm.peek()).zzc((zzaga)localObject3);
          localObject1 = localObject2;
        }
      }
    }
    zzg();
  }
  
  private static final zzagm zzj(SparseArray paramSparseArray, int paramInt)
  {
    if (paramSparseArray.size() == 1) {
      return (zzagm)paramSparseArray.valueAt(0);
    }
    paramSparseArray = (zzagm)paramSparseArray.get(paramInt);
    Objects.requireNonNull(paramSparseArray);
    return paramSparseArray;
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    Object localObject1 = paramzzaap;
    for (;;)
    {
      int i = this.zzo;
      int j = 1;
      long l2;
      long l1;
      if (i != 0)
      {
        Object localObject2;
        Object localObject4;
        int k;
        Object localObject3;
        long l3;
        if (i != 1)
        {
          l2 = Long.MAX_VALUE;
          if (i != 2)
          {
            localObject2 = this.zzy;
            paramzzabk = (zzabk)localObject2;
            if (localObject2 == null)
            {
              localObject4 = this.zze;
              k = ((SparseArray)localObject4).size();
              l2 = Long.MAX_VALUE;
              paramzzabk = null;
              i = 0;
              while (i < k)
              {
                localObject3 = (zzagq)((SparseArray)localObject4).valueAt(i);
                if (!zzagq.zzj((zzagq)localObject3))
                {
                  localObject2 = paramzzabk;
                  l1 = l2;
                  if (((zzagq)localObject3).zzf == ((zzagq)localObject3).zzd.zzb) {}
                }
                else if ((zzagq.zzj((zzagq)localObject3)) && (((zzagq)localObject3).zzh == ((zzagq)localObject3).zzb.zzd))
                {
                  localObject2 = paramzzabk;
                  l1 = l2;
                }
                else
                {
                  l3 = ((zzagq)localObject3).zzd();
                  localObject2 = paramzzabk;
                  l1 = l2;
                  if (l3 < l2)
                  {
                    localObject2 = localObject3;
                    l1 = l3;
                  }
                }
                i++;
                paramzzabk = (zzabk)localObject2;
                l2 = l1;
              }
              if (paramzzabk == null)
              {
                i = (int)(this.zzt - paramzzaap.zzf());
                if (i >= 0)
                {
                  ((zzaae)localObject1).zzo(i, false);
                  zzg();
                }
                else
                {
                  throw zzce.zza("Offset to end of mdat was negative.", null);
                }
              }
              else
              {
                k = (int)(paramzzabk.zzd() - paramzzaap.zzf());
                i = k;
                if (k < 0)
                {
                  zzer.zze("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                  i = 0;
                }
                ((zzaae)localObject1).zzo(i, false);
                this.zzy = paramzzabk;
              }
            }
            else
            {
              i = this.zzo;
              k = 6;
              if (i == 3)
              {
                i = paramzzabk.zzb();
                this.zzz = i;
                if (paramzzabk.zzf < paramzzabk.zzi)
                {
                  ((zzaae)localObject1).zzo(i, false);
                  paramzzaap = paramzzabk.zzf();
                  if (paramzzaap != null)
                  {
                    localObject1 = paramzzabk.zzb.zzn;
                    i = paramzzaap.zzd;
                    if (i != 0) {
                      ((zzfd)localObject1).zzG(i);
                    }
                    if (paramzzabk.zzb.zzb(paramzzabk.zzf)) {
                      ((zzfd)localObject1).zzG(((zzfd)localObject1).zzo() * 6);
                    }
                  }
                  if (!paramzzabk.zzk()) {
                    this.zzy = null;
                  }
                }
              }
              for (this.zzo = 3;; this.zzo = 3)
              {
                break;
                if (paramzzabk.zzd.zza.zzg == 1)
                {
                  this.zzz = (i - 8);
                  ((zzaae)localObject1).zzo(8, false);
                }
                if ("audio/ac4".equals(paramzzabk.zzd.zza.zzf.zzm))
                {
                  this.zzA = paramzzabk.zzc(this.zzz, 7);
                  zzzs.zzb(this.zzz, this.zzj);
                  paramzzabk.zza.zzq(this.zzj, 7);
                  i = this.zzA + 7;
                  this.zzA = i;
                }
                else
                {
                  i = paramzzabk.zzc(this.zzz, 0);
                  this.zzA = i;
                }
                this.zzz += i;
                this.zzo = 4;
                this.zzB = 0;
                paramzzaap = paramzzabk.zzd.zza;
                localObject2 = paramzzabk.zza;
                l3 = paramzzabk.zze();
                int n = paramzzaap.zzj;
                if (n == 0) {
                  for (;;)
                  {
                    j = this.zzA;
                    i = this.zzz;
                    if (j >= i) {
                      break;
                    }
                    i = ((zzabr)localObject2).zze((zzt)localObject1, i - j, false);
                    this.zzA += i;
                  }
                }
                localObject3 = this.zzg.zzH();
                localObject3[0] = 0;
                localObject3[1] = 0;
                localObject3[2] = 0;
                int m = 4 - n;
                i = j;
                j = k;
                while (this.zzA < this.zzz)
                {
                  k = this.zzB;
                  if (k == 0)
                  {
                    ((zzaae)localObject1).zzn((byte[])localObject3, m, n + 1, false);
                    this.zzg.zzF(0);
                    k = this.zzg.zze();
                    if (k > 0)
                    {
                      this.zzB = (k - 1);
                      this.zzf.zzF(0);
                      ((zzabr)localObject2).zzq(this.zzf, 4);
                      ((zzabr)localObject2).zzq(this.zzg, i);
                      if (this.zzF.length > 0)
                      {
                        localObject4 = paramzzaap.zzf.zzm;
                        k = localObject3[4];
                        byte[] arrayOfByte = zzew.zza;
                        if (("video/avc".equals(localObject4)) && ((k & 0x1F) == j)) {}
                        while (("video/hevc".equals(localObject4)) && ((k & 0x7E) >> i == 39))
                        {
                          bool = true;
                          break;
                        }
                      }
                      boolean bool = false;
                      this.zzC = bool;
                      this.zzA += 5;
                      this.zzz += m;
                    }
                    else
                    {
                      throw zzce.zza("Invalid NAL length", null);
                    }
                  }
                  else
                  {
                    if (this.zzC)
                    {
                      this.zzh.zzC(k);
                      localObject4 = this.zzh.zzH();
                      i = this.zzB;
                      ((zzaae)localObject1).zzn((byte[])localObject4, 0, i, false);
                      ((zzabr)localObject2).zzq(this.zzh, this.zzB);
                      i = this.zzB;
                      localObject4 = this.zzh;
                      j = zzew.zzb(((zzfd)localObject4).zzH(), ((zzfd)localObject4).zzd());
                      this.zzh.zzF("video/hevc".equals(paramzzaap.zzf.zzm));
                      this.zzh.zzE(j);
                      zzaab.zza(l3, this.zzh, this.zzF);
                    }
                    else
                    {
                      i = ((zzabr)localObject2).zze((zzt)localObject1, k, false);
                    }
                    this.zzA += i;
                    this.zzB -= i;
                    j = 6;
                    i = 1;
                  }
                }
                i = paramzzabk.zza();
                paramzzaap = paramzzabk.zzf();
                if (paramzzaap != null) {
                  paramzzaap = paramzzaap.zzc;
                } else {
                  paramzzaap = null;
                }
                ((zzabr)localObject2).zzs(l3, i, this.zzz, 0, paramzzaap);
                while (!this.zzn.isEmpty())
                {
                  paramzzaap = (zzagp)this.zzn.removeFirst();
                  this.zzu -= paramzzaap.zzc;
                  l2 = paramzzaap.zza;
                  l1 = l2;
                  if (paramzzaap.zzb) {
                    l1 = l2 + l3;
                  }
                  localObject1 = this.zzE;
                  j = localObject1.length;
                  for (i = 0; i < j; i++) {
                    localObject1[i].zzs(l1, 1, paramzzaap.zzc, this.zzu, null);
                  }
                }
                if (!paramzzabk.zzk()) {
                  this.zzy = null;
                }
              }
              return 0;
            }
          }
          else
          {
            j = this.zze.size();
            paramzzabk = null;
            i = 0;
            while (i < j)
            {
              localObject3 = ((zzagq)this.zze.valueAt(i)).zzb;
              l1 = l2;
              localObject2 = paramzzabk;
              if (((zzahc)localObject3).zzo)
              {
                l3 = ((zzahc)localObject3).zzc;
                l1 = l2;
                localObject2 = paramzzabk;
                if (l3 < l2)
                {
                  localObject2 = (zzagq)this.zze.valueAt(i);
                  l1 = l3;
                }
              }
              i++;
              l2 = l1;
              paramzzabk = (zzabk)localObject2;
            }
            if (paramzzabk == null)
            {
              this.zzo = 3;
            }
            else
            {
              i = (int)(l2 - paramzzaap.zzf());
              if (i >= 0)
              {
                localObject2 = (zzaae)localObject1;
                ((zzaae)localObject2).zzo(i, false);
                paramzzabk = paramzzabk.zzb;
                localObject3 = paramzzabk.zzn;
                ((zzaae)localObject2).zzn(((zzfd)localObject3).zzH(), 0, ((zzfd)localObject3).zzd(), false);
                paramzzabk.zzn.zzF(0);
                paramzzabk.zzo = false;
              }
              else
              {
                throw zzce.zza("Offset to encryption data was negative.", null);
              }
            }
          }
        }
        else
        {
          i = (int)this.zzq - this.zzr;
          localObject2 = this.zzs;
          if (localObject2 != null)
          {
            paramzzabk = ((zzfd)localObject2).zzH();
            ((zzaae)localObject1).zzn(paramzzabk, 8, i, false);
            paramzzabk = new zzagb(this.zzp, (zzfd)localObject2);
            l3 = paramzzaap.zzf();
            if (!this.zzm.isEmpty())
            {
              ((zzaga)this.zzm.peek()).zzd(paramzzabk);
            }
            else
            {
              i = paramzzabk.zzd;
              long l5;
              long l4;
              if (i == 1936286840)
              {
                localObject4 = paramzzabk.zza;
                ((zzfd)localObject4).zzF(8);
                i = zzagc.zze(((zzfd)localObject4).zze());
                ((zzfd)localObject4).zzG(4);
                l5 = ((zzfd)localObject4).zzs();
                if (i == 0)
                {
                  l1 = ((zzfd)localObject4).zzs();
                  l2 = ((zzfd)localObject4).zzs();
                }
                else
                {
                  l1 = ((zzfd)localObject4).zzt();
                  l2 = ((zzfd)localObject4).zzt();
                }
                l2 = l3 + l2;
                l4 = zzfn.zzp(l1, 1000000L, l5);
                ((zzfd)localObject4).zzG(2);
                i = ((zzfd)localObject4).zzo();
                localObject2 = new int[i];
                localObject3 = new long[i];
                paramzzabk = new long[i];
                localObject1 = new long[i];
                l3 = l4;
                j = 0;
                while (j < i)
                {
                  k = ((zzfd)localObject4).zze();
                  if ((k & 0x80000000) == 0)
                  {
                    long l6 = ((zzfd)localObject4).zzs();
                    localObject2[j] = (k & 0x7FFFFFFF);
                    localObject3[j] = l2;
                    localObject1[j] = l3;
                    l1 += l6;
                    l3 = zzfn.zzp(l1, 1000000L, l5);
                    paramzzabk[j] = (l3 - localObject1[j]);
                    ((zzfd)localObject4).zzG(4);
                    l2 += localObject2[j];
                    j++;
                  }
                  else
                  {
                    throw zzce.zza("Unhandled indirect reference", null);
                  }
                }
                paramzzabk = Pair.create(Long.valueOf(l4), new zzaac((int[])localObject2, (long[])localObject3, paramzzabk, (long[])localObject1));
                this.zzx = ((Long)paramzzabk.first).longValue();
                this.zzD.zzN((zzabn)paramzzabk.second);
                this.zzG = true;
              }
              else if (i == 1701671783)
              {
                localObject2 = paramzzabk.zza;
                if (this.zzE.length != 0)
                {
                  ((zzfd)localObject2).zzF(8);
                  i = zzagc.zze(((zzfd)localObject2).zze());
                  if (i != 0)
                  {
                    if (i != 1)
                    {
                      paramzzabk = new StringBuilder();
                      paramzzabk.append("Skipping unsupported emsg version: ");
                      paramzzabk.append(i);
                      zzer.zze("FragmentedMp4Extractor", paramzzabk.toString());
                      break label2359;
                    }
                    l1 = ((zzfd)localObject2).zzs();
                    l4 = zzfn.zzp(((zzfd)localObject2).zzt(), 1000000L, l1);
                    l1 = zzfn.zzp(((zzfd)localObject2).zzs(), 1000L, l1);
                    l2 = ((zzfd)localObject2).zzs();
                    paramzzabk = ((zzfd)localObject2).zzv('\000');
                    Objects.requireNonNull(paramzzabk);
                    localObject1 = ((zzfd)localObject2).zzv('\000');
                    Objects.requireNonNull(localObject1);
                    l3 = -9223372036854775807L;
                    l5 = l1;
                    l1 = l2;
                  }
                  else
                  {
                    paramzzabk = ((zzfd)localObject2).zzv('\000');
                    Objects.requireNonNull(paramzzabk);
                    localObject1 = ((zzfd)localObject2).zzv('\000');
                    Objects.requireNonNull(localObject1);
                    l3 = ((zzfd)localObject2).zzs();
                    l2 = zzfn.zzp(((zzfd)localObject2).zzs(), 1000000L, l3);
                    l1 = this.zzx;
                    if (l1 != -9223372036854775807L) {
                      l1 += l2;
                    } else {
                      l1 = -9223372036854775807L;
                    }
                    l3 = zzfn.zzp(((zzfd)localObject2).zzs(), 1000L, l3);
                    l5 = ((zzfd)localObject2).zzs();
                    l4 = l1;
                    l1 = l5;
                    l5 = l3;
                    l3 = l2;
                  }
                  localObject3 = new byte[((zzfd)localObject2).zza()];
                  ((zzfd)localObject2).zzB((byte[])localObject3, 0, ((zzfd)localObject2).zza());
                  paramzzabk = new zzadh(paramzzabk, (String)localObject1, l5, l1, (byte[])localObject3);
                  localObject2 = new zzfd(this.zzk.zza(paramzzabk));
                  j = ((zzfd)localObject2).zza();
                  for (localObject1 : this.zzE)
                  {
                    ((zzfd)localObject2).zzF(0);
                    ((zzabr)localObject1).zzq((zzfd)localObject2, j);
                  }
                  if (l4 == -9223372036854775807L)
                  {
                    this.zzn.addLast(new zzagp(l3, true, j));
                    this.zzu += j;
                  }
                  else if (!this.zzn.isEmpty())
                  {
                    this.zzn.addLast(new zzagp(l4, false, j));
                    this.zzu += j;
                  }
                  else
                  {
                    paramzzabk = this.zzE;
                    k = paramzzabk.length;
                    for (i = 0; i < k; i++) {
                      paramzzabk[i].zzs(l4, 1, j, 0, null);
                    }
                  }
                }
              }
              label2359:
              localObject1 = paramzzaap;
            }
          }
          else
          {
            ((zzaae)localObject1).zzo(i, false);
          }
          zzi(paramzzaap.zzf());
        }
      }
      else
      {
        if (this.zzr == 0)
        {
          if (!((zzaap)localObject1).zzn(this.zzl.zzH(), 0, 8, true)) {
            return -1;
          }
          this.zzr = 8;
          this.zzl.zzF(0);
          this.zzq = this.zzl.zzs();
          this.zzp = this.zzl.zze();
        }
        l1 = this.zzq;
        if (l1 == 1L)
        {
          paramzzabk = this.zzl.zzH();
          ((zzaae)localObject1).zzn(paramzzabk, 8, 8, false);
          this.zzr += 8;
          this.zzq = this.zzl.zzt();
        }
        else if (l1 == 0L)
        {
          l2 = paramzzaap.zzd();
          l1 = l2;
          if (l2 == -1L) {
            if (!this.zzm.isEmpty()) {
              l1 = ((zzaga)this.zzm.peek()).zza;
            } else {
              l1 = -1L;
            }
          }
          if (l1 != -1L) {
            this.zzq = (l1 - paramzzaap.zzf() + this.zzr);
          }
        }
        l2 = this.zzq;
        l1 = this.zzr;
        if (l2 < l1) {
          break;
        }
        l1 = paramzzaap.zzf() - l1;
        i = this.zzp;
        if (((i == 1836019558) || (i == 1835295092)) && (!this.zzG))
        {
          this.zzD.zzN(new zzabm(this.zzw, l1));
          this.zzG = true;
        }
        if (this.zzp == 1836019558)
        {
          j = this.zze.size();
          for (i = 0; i < j; i++)
          {
            paramzzabk = ((zzagq)this.zze.valueAt(i)).zzb;
            paramzzabk.zzc = l1;
            paramzzabk.zzb = l1;
          }
        }
        i = this.zzp;
        if (i == 1835295092)
        {
          this.zzy = null;
          this.zzt = (l1 + this.zzq);
          this.zzo = 2;
        }
        else if ((i != 1836019574) && (i != 1953653099) && (i != 1835297121) && (i != 1835626086) && (i != 1937007212) && (i != 1836019558) && (i != 1953653094) && (i != 1836475768) && (i != 1701082227))
        {
          if ((i != 1751411826) && (i != 1835296868) && (i != 1836476516) && (i != 1936286840) && (i != 1937011556) && (i != 1937011827) && (i != 1668576371) && (i != 1937011555) && (i != 1937011578) && (i != 1937013298) && (i != 1937007471) && (i != 1668232756) && (i != 1937011571) && (i != 1952867444) && (i != 1952868452) && (i != 1953196132) && (i != 1953654136) && (i != 1953658222) && (i != 1886614376) && (i != 1935763834) && (i != 1935763823) && (i != 1936027235) && (i != 1970628964) && (i != 1935828848) && (i != 1936158820) && (i != 1701606260) && (i != 1835362404) && (i != 1701671783))
          {
            if (this.zzq <= 2147483647L)
            {
              this.zzs = null;
              this.zzo = 1;
            }
            else
            {
              throw zzce.zzc("Skipping atom with length > 2147483647 (unsupported).");
            }
          }
          else if (this.zzr == 8)
          {
            if (this.zzq <= 2147483647L)
            {
              paramzzabk = new zzfd((int)this.zzq);
              System.arraycopy(this.zzl.zzH(), 0, paramzzabk.zzH(), 0, 8);
              this.zzs = paramzzabk;
              this.zzo = 1;
            }
            else
            {
              throw zzce.zzc("Leaf atom with length > 2147483647 (unsupported).");
            }
          }
          else {
            throw zzce.zzc("Leaf atom defines extended atom size (unsupported).");
          }
        }
        else
        {
          l1 = paramzzaap.zzf();
          l2 = this.zzq;
          paramzzabk = this.zzm;
          l1 = l1 + l2 - 8L;
          paramzzabk.push(new zzaga(i, l1));
          if (this.zzq == this.zzr) {
            zzi(l1);
          } else {
            zzg();
          }
        }
      }
    }
    throw zzce.zzc("Atom size less than header length (unsupported).");
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzD = paramzzaar;
    zzg();
    paramzzaar = new zzabr[2];
    this.zzE = paramzzaar;
    int j = 0;
    paramzzaar = (zzabr[])zzfn.zzF(paramzzaar, 0);
    this.zzE = paramzzaar;
    int k = paramzzaar.length;
    for (int i = 0; i < k; i++) {
      paramzzaar[i].zzk(zzc);
    }
    this.zzF = new zzabr[this.zzd.size()];
    for (i = 100; j < this.zzF.length; i++)
    {
      paramzzaar = this.zzD.zzv(i, 3);
      paramzzaar.zzk((zzam)this.zzd.get(j));
      this.zzF[j] = paramzzaar;
      j++;
    }
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    int j = this.zze.size();
    for (int i = 0; i < j; i++) {
      ((zzagq)this.zze.valueAt(i)).zzi();
    }
    this.zzn.clear();
    this.zzu = 0;
    this.zzv = paramLong2;
    this.zzm.clear();
    zzg();
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    return zzagz.zza(paramzzaap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzagr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */