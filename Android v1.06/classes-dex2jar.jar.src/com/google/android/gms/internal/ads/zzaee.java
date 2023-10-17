package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class zzaee
{
  public static final zzaec zza = zzaeb.zza;
  
  public static final zzca zza(byte[] paramArrayOfByte, int paramInt, zzaec paramzzaec, zzadf paramzzadf)
  {
    paramzzadf = new ArrayList();
    zzfd localzzfd = new zzfd(paramArrayOfByte, paramInt);
    paramInt = localzzfd.zza();
    int k = 10;
    boolean bool2 = false;
    if (paramInt < 10) {
      zzer.zze("Id3Decoder", "Data too short to be an ID3 tag");
    }
    for (;;)
    {
      paramArrayOfByte = null;
      break;
      paramInt = localzzfd.zzm();
      if (paramInt != 4801587)
      {
        zzer.zze("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", new Object[] { Integer.valueOf(paramInt) }))));
      }
      else
      {
        int m = localzzfd.zzk();
        localzzfd.zzG(1);
        int n = localzzfd.zzk();
        j = localzzfd.zzj();
        if (m == 2)
        {
          paramInt = j;
          if ((n & 0x40) != 0) {
            zzer.zze("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
          }
        }
        else if (m == 3)
        {
          paramInt = j;
          if ((n & 0x40) != 0)
          {
            paramInt = localzzfd.zze();
            localzzfd.zzG(paramInt);
            paramInt = j - (paramInt + 4);
          }
        }
        else
        {
          if (m != 4) {
            break label282;
          }
          i = j;
          if ((n & 0x40) != 0)
          {
            paramInt = localzzfd.zzj();
            localzzfd.zzG(paramInt - 4);
            i = j - paramInt;
          }
          paramInt = i;
          if ((n & 0x10) != 0) {
            paramInt = i - 10;
          }
        }
        if ((m < 4) && ((n & 0x80) != 0)) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        paramArrayOfByte = new zzaed(m, bool1, paramInt);
        break;
        label282:
        paramArrayOfByte = new StringBuilder();
        paramArrayOfByte.append("Skipped ID3 tag with unsupported majorVersion=");
        paramArrayOfByte.append(m);
        zzer.zze("Id3Decoder", paramArrayOfByte.toString());
      }
    }
    if (paramArrayOfByte == null) {
      return null;
    }
    int j = localzzfd.zzc();
    paramInt = k;
    if (zzaed.zzb(paramArrayOfByte) == 2) {
      paramInt = 6;
    }
    int i = zzaed.zza(paramArrayOfByte);
    if (zzaed.zzc(paramArrayOfByte)) {
      i = zze(localzzfd, zzaed.zza(paramArrayOfByte));
    }
    localzzfd.zzE(j + i);
    boolean bool1 = bool2;
    if (!zzk(localzzfd, zzaed.zzb(paramArrayOfByte), paramInt, false)) {
      if ((zzaed.zzb(paramArrayOfByte) == 4) && (zzk(localzzfd, 4, paramInt, true)))
      {
        bool1 = true;
      }
      else
      {
        paramInt = zzaed.zzb(paramArrayOfByte);
        paramArrayOfByte = new StringBuilder();
        paramArrayOfByte.append("Failed to validate ID3 tag with majorVersion=");
        paramArrayOfByte.append(paramInt);
        zzer.zze("Id3Decoder", paramArrayOfByte.toString());
        return null;
      }
    }
    while (localzzfd.zza() >= paramInt)
    {
      zzaef localzzaef = zzf(zzaed.zzb(paramArrayOfByte), localzzfd, bool1, paramInt, paramzzaec);
      if (localzzaef != null) {
        paramzzadf.add(localzzaef);
      }
    }
    return new zzca(paramzzadf);
  }
  
  private static int zzb(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 3)) {
      return 2;
    }
    return 1;
  }
  
  private static int zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = zzd(paramArrayOfByte, paramInt1);
    if ((paramInt2 != 0) && (paramInt2 != 3))
    {
      for (paramInt2 = i;; paramInt2 = zzd(paramArrayOfByte, paramInt2 + 1))
      {
        i = paramArrayOfByte.length;
        if (paramInt2 >= i - 1) {
          break;
        }
        if (((paramInt2 - paramInt1) % 2 == 0) && (paramArrayOfByte[(paramInt2 + 1)] == 0)) {
          return paramInt2;
        }
      }
      return i;
    }
    return i;
  }
  
  private static int zzd(byte[] paramArrayOfByte, int paramInt)
  {
    int i;
    for (;;)
    {
      i = paramArrayOfByte.length;
      if (paramInt >= i) {
        break;
      }
      if (paramArrayOfByte[paramInt] == 0) {
        return paramInt;
      }
      paramInt++;
    }
    return i;
  }
  
  private static int zze(zzfd paramzzfd, int paramInt)
  {
    byte[] arrayOfByte = paramzzfd.zzH();
    int k = paramzzfd.zzc();
    int j = k;
    for (int i = paramInt;; i = paramInt)
    {
      int m = j + 1;
      if (m >= k + i) {
        break;
      }
      paramInt = i;
      if ((arrayOfByte[j] & 0xFF) == 255)
      {
        paramInt = i;
        if (arrayOfByte[m] == 0)
        {
          System.arraycopy(arrayOfByte, j + 2, arrayOfByte, m, i - (j - k) - 2);
          paramInt = i - 1;
        }
      }
      j = m;
    }
    return i;
  }
  
  private static zzaef zzf(int paramInt1, zzfd paramzzfd, boolean paramBoolean, int paramInt2, zzaec paramzzaec)
  {
    int i9 = paramzzfd.zzk();
    int k = paramzzfd.zzk();
    int i1 = k;
    int m = paramzzfd.zzk();
    int n = m;
    int i;
    if (paramInt1 >= 3) {
      i = paramzzfd.zzk();
    } else {
      i = 0;
    }
    int i2;
    int j;
    if (paramInt1 == 4)
    {
      i2 = paramzzfd.zzn();
      j = i2;
      if (!paramBoolean) {
        j = i2 >> 24 << 21 | i2 & 0xFF | (i2 >> 8 & 0xFF) << 7 | (i2 >> 16 & 0xFF) << 14;
      }
    }
    else if (paramInt1 == 3)
    {
      j = paramzzfd.zzn();
    }
    else
    {
      j = paramzzfd.zzm();
    }
    int i4;
    if (paramInt1 >= 3) {
      i4 = paramzzfd.zzo();
    } else {
      i4 = 0;
    }
    Object localObject1 = null;
    if ((i9 == 0) && (i1 == 0) && (n == 0) && (i == 0) && (j == 0) && (i4 == 0))
    {
      paramzzfd.zzF(paramzzfd.zzd());
      return null;
    }
    int i8 = paramzzfd.zzc() + j;
    if (i8 > paramzzfd.zzd())
    {
      zzer.zze("Id3Decoder", "Frame size exceeds remaining tag data");
      paramzzfd.zzF(paramzzfd.zzd());
      return null;
    }
    if (paramzzaec == null)
    {
      int i3;
      int i7;
      int i6;
      int i5;
      if (paramInt1 == 3)
      {
        if ((i4 & 0x80) != 0) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if ((i4 & 0x40) != 0) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        if ((i4 & 0x20) != 0) {
          i4 = 1;
        } else {
          i4 = 0;
        }
        i7 = 0;
        i6 = i2;
        i5 = i3;
        i3 = i7;
      }
      else if (paramInt1 == 4)
      {
        if ((i4 & 0x40) != 0) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if ((i4 & 0x8) != 0) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        if ((i4 & 0x4) != 0) {
          i5 = 1;
        } else {
          i5 = 0;
        }
        if ((i4 & 0x2) != 0) {
          i7 = 1;
        } else {
          i7 = 0;
        }
        i6 = i2;
        i2 = i4 & 0x1;
        i4 = i6;
        i6 = i3;
        i3 = i7;
      }
      else
      {
        i2 = 0;
        i4 = 0;
        i6 = 0;
        i5 = 0;
        i3 = 0;
      }
      if ((i6 == 0) && (i5 == 0))
      {
        i5 = j;
        if (i4 != 0)
        {
          paramzzfd.zzG(1);
          i5 = j - 1;
        }
        j = i5;
        if (i2 != 0)
        {
          paramzzfd.zzG(4);
          j = i5 - 4;
        }
        i4 = j;
        if (i3 != 0) {
          i4 = zze(paramzzfd, j);
        }
        if ((i9 == 84) && (i1 == 88) && (n == 88) && ((paramInt1 == 2) || (i == 88))) {
          if (i4 <= 0)
          {
            paramzzaec = (zzaec)localObject1;
            break label645;
          }
        }
        try
        {
          paramInt2 = paramzzfd.zzk();
          j = i4 - 1;
          paramzzaec = new byte[j];
          paramzzfd.zzB(paramzzaec, 0, j);
          j = zzc(paramzzaec, 0, paramInt2);
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(paramzzaec, 0, j, zzj(paramInt2));
          paramzzaec = new zzaen("TXXX", (String)localObject1, zzg(paramzzaec, paramInt2, j + zzb(paramInt2)));
        }
        finally
        {
          for (;;)
          {
            label645:
            break;
            if (i9 == 87)
            {
              if ((i1 == 88) && (n == 88) && ((paramInt1 == 2) || (i == 88)))
              {
                if (i4 <= 0)
                {
                  paramzzaec = (zzaec)localObject1;
                  continue;
                }
                paramInt2 = paramzzfd.zzk();
                j = i4 - 1;
                localObject1 = new byte[j];
                paramzzfd.zzB((byte[])localObject1, 0, j);
                j = zzc((byte[])localObject1, 0, paramInt2);
                paramzzaec = new java/lang/String;
                paramzzaec.<init>((byte[])localObject1, 0, j, zzj(paramInt2));
                paramInt2 = j + zzb(paramInt2);
                paramzzaec = new zzaep("WXXX", paramzzaec, zzh((byte[])localObject1, paramInt2, zzd((byte[])localObject1, paramInt2), zzfol.zzb));
                continue;
              }
              i2 = 87;
            }
            else
            {
              i2 = i9;
            }
            Object localObject2;
            if (i2 == 87)
            {
              localObject2 = zzi(paramInt1, 87, i1, n, i);
              paramzzaec = new byte[i4];
              paramzzfd.zzB(paramzzaec, 0, i4);
              paramInt2 = zzd(paramzzaec, 0);
              localObject1 = new java/lang/String;
              ((String)localObject1).<init>(paramzzaec, 0, paramInt2, zzfol.zzb);
              paramzzaec = new zzaep((String)localObject2, null, (String)localObject1);
            }
            else
            {
              j = i2;
              if (i2 == 80)
              {
                if ((i1 == 82) && (n == 73) && (i == 86))
                {
                  paramzzaec = new byte[i4];
                  paramzzfd.zzB(paramzzaec, 0, i4);
                  paramInt2 = zzd(paramzzaec, 0);
                  localObject1 = new java/lang/String;
                  ((String)localObject1).<init>(paramzzaec, 0, paramInt2, zzfol.zzb);
                  paramzzaec = new zzael((String)localObject1, zzl(paramzzaec, paramInt2 + 1, i4));
                }
                else
                {
                  j = 80;
                }
              }
              else
              {
                if (j == 71) {
                  if ((i1 == 69) && (n == 79) && ((i == 66) || (paramInt1 == 2)))
                  {
                    paramInt2 = paramzzfd.zzk();
                    localObject1 = zzj(paramInt2);
                    j = i4 - 1;
                    paramzzaec = new byte[j];
                    paramzzfd.zzB(paramzzaec, 0, j);
                    n = zzd(paramzzaec, 0);
                    localObject2 = new java/lang/String;
                  }
                }
                try
                {
                  ((String)localObject2).<init>(paramzzaec, 0, n, zzfol.zzb);
                  n++;
                  i1 = zzc(paramzzaec, n, paramInt2);
                  Object localObject3 = zzh(paramzzaec, n, i1, (Charset)localObject1);
                  n = i1 + zzb(paramInt2);
                  i1 = zzc(paramzzaec, n, paramInt2);
                  paramzzaec = new zzaea((String)localObject2, (String)localObject3, zzh(paramzzaec, n, i1, (Charset)localObject1), zzl(paramzzaec, i1 + zzb(paramInt2), j));
                  break label1701;
                  i2 = 71;
                  break label1225;
                  i2 = j;
                  if (paramInt1 == 2 ? (i2 == 80) && (i1 == 73) && (n == 67) : (i2 == 65) && (i1 == 80) && (n == 73) && (i == 67))
                  {
                    i1 = paramzzfd.zzk();
                    localObject2 = zzj(i1);
                    n = i4 - 1;
                    localObject3 = new byte[n];
                    paramzzfd.zzB((byte[])localObject3, 0, n);
                    if (paramInt1 == 2)
                    {
                      paramzzaec = new java/lang/String;
                      paramzzaec.<init>((byte[])localObject3, 0, 3, zzfol.zzb);
                      localObject1 = "image/".concat(String.valueOf(zzfof.zza(paramzzaec)));
                      paramzzaec = (zzaec)localObject1;
                      if ("image/jpg".equals(localObject1)) {
                        paramzzaec = "image/jpeg";
                      }
                      paramInt2 = 2;
                    }
                    else
                    {
                      j = zzd((byte[])localObject3, 0);
                      paramzzaec = new java/lang/String;
                      paramzzaec.<init>((byte[])localObject3, 0, j, zzfol.zzb);
                      localObject1 = zzfof.zza(paramzzaec);
                      paramzzaec = (zzaec)localObject1;
                      paramInt2 = j;
                      if (((String)localObject1).indexOf('/') == -1)
                      {
                        paramzzaec = "image/".concat(String.valueOf(localObject1));
                        paramInt2 = j;
                      }
                    }
                    j = localObject3[(paramInt2 + 1)];
                    i2 = paramInt2 + 2;
                    paramInt2 = zzc((byte[])localObject3, i2, i1);
                    localObject1 = new java/lang/String;
                    ((String)localObject1).<init>((byte[])localObject3, i2, paramInt2 - i2, (Charset)localObject2);
                    paramzzaec = new zzadq(paramzzaec, (String)localObject1, j & 0xFF, zzl((byte[])localObject3, paramInt2 + zzb(i1), n));
                  }
                  else
                  {
                    if ((i2 != 67) || (i1 != 79) || (n != 77) || ((i != 77) && (paramInt1 != 2))) {
                      break label1715;
                    }
                    if (i4 < 4)
                    {
                      paramInt2 = i1;
                      j = i;
                      paramzzaec = null;
                      i = n;
                      break label2464;
                    }
                    paramInt2 = paramzzfd.zzk();
                    paramzzaec = zzj(paramInt2);
                    localObject2 = new byte[3];
                    paramzzfd.zzB((byte[])localObject2, 0, 3);
                    localObject1 = new java/lang/String;
                    ((String)localObject1).<init>((byte[])localObject2, 0, 3);
                    j = i4 - 4;
                    localObject3 = new byte[j];
                    paramzzfd.zzB((byte[])localObject3, 0, j);
                    j = zzc((byte[])localObject3, 0, paramInt2);
                    localObject2 = new java/lang/String;
                    ((String)localObject2).<init>((byte[])localObject3, 0, j, paramzzaec);
                    j += zzb(paramInt2);
                  }
                  long l2;
                  long l1;
                  for (paramzzaec = new zzady((String)localObject1, (String)localObject2, zzh((byte[])localObject3, j, zzc((byte[])localObject3, j, paramInt2), paramzzaec));; paramzzaec = new zzadu((String)localObject1, i1, n, l1, l2, (zzaef[])paramzzaec.toArray(new zzaef[0])))
                  {
                    paramInt2 = k;
                    j = i;
                    i = m;
                    break label2464;
                    if ((i2 != 67) || (i1 != 72) || (n != 65) || (i != 80)) {
                      break;
                    }
                    j = paramzzfd.zzc();
                    n = zzd(paramzzfd.zzH(), j);
                    localObject1 = new java/lang/String;
                    ((String)localObject1).<init>(paramzzfd.zzH(), j, n - j, zzfol.zzb);
                    paramzzfd.zzF(n + 1);
                    i1 = paramzzfd.zze();
                    n = paramzzfd.zze();
                    l2 = paramzzfd.zzs();
                    l1 = l2;
                    if (l2 == 4294967295L) {
                      l1 = -1L;
                    }
                    long l3 = paramzzfd.zzs();
                    l2 = l3;
                    if (l3 == 4294967295L) {
                      l2 = -1L;
                    }
                    paramzzaec = new java/util/ArrayList;
                    paramzzaec.<init>();
                    while (paramzzfd.zzc() < j + i4)
                    {
                      localObject2 = zzf(paramInt1, paramzzfd, paramBoolean, paramInt2, null);
                      if (localObject2 != null) {
                        paramzzaec.add(localObject2);
                      }
                    }
                  }
                  if ((i2 == 67) && (i1 == 84) && (n == 79) && (i == 67))
                  {
                    m = paramzzfd.zzc();
                    j = zzd(paramzzfd.zzH(), m);
                    paramzzaec = new java/lang/String;
                    paramzzaec.<init>(paramzzfd.zzH(), m, j - m, zzfol.zzb);
                    paramzzfd.zzF(j + 1);
                    i2 = paramzzfd.zzk();
                    boolean bool;
                    if ((i2 & 0x2) != 0) {
                      bool = true;
                    } else {
                      bool = false;
                    }
                    j = paramzzfd.zzk();
                    localObject1 = new String[j];
                    for (k = 0; k < j; k++)
                    {
                      i5 = paramzzfd.zzc();
                      i3 = zzd(paramzzfd.zzH(), i5);
                      localObject2 = new java/lang/String;
                      ((String)localObject2).<init>(paramzzfd.zzH(), i5, i3 - i5, zzfol.zzb);
                      localObject1[k] = localObject2;
                      paramzzfd.zzF(i3 + 1);
                    }
                    localObject2 = new java/util/ArrayList;
                    ((ArrayList)localObject2).<init>();
                    while (paramzzfd.zzc() < m + i4)
                    {
                      localObject3 = zzf(paramInt1, paramzzfd, paramBoolean, paramInt2, null);
                      if (localObject3 != null) {
                        ((ArrayList)localObject2).add(localObject3);
                      }
                    }
                    localObject2 = (zzaef[])((ArrayList)localObject2).toArray(new zzaef[0]);
                    if (1 != (i2 & 0x1)) {
                      paramBoolean = false;
                    } else {
                      paramBoolean = true;
                    }
                    paramzzaec = new zzadw(paramzzaec, bool, paramBoolean, (String[])localObject1, (zzaef[])localObject2);
                    j = i;
                    i = n;
                    paramInt2 = i1;
                  }
                  else
                  {
                    if (i2 == 77)
                    {
                      paramInt2 = i1;
                      if (paramInt2 == 76)
                      {
                        j = i;
                        if ((n == 76) && (j == 84))
                        {
                          i3 = paramzzfd.zzo();
                          i5 = paramzzfd.zzm();
                          m = paramzzfd.zzm();
                          i1 = paramzzfd.zzk();
                          i2 = paramzzfd.zzk();
                          paramzzaec = new com/google/android/gms/internal/ads/zzfc;
                          paramzzaec.<init>();
                          paramzzaec.zzh(paramzzfd);
                          k = (i4 - 10) * 8 / (i1 + i2);
                          localObject2 = new int[k];
                          localObject1 = new int[k];
                          for (i = 0; i < k; i++)
                          {
                            i6 = paramzzaec.zzd(i1);
                            i7 = paramzzaec.zzd(i2);
                            localObject2[i] = i6;
                            localObject1[i] = i7;
                          }
                          paramzzaec = new zzaej(i3, i5, m, (int[])localObject2, (int[])localObject1);
                          i = n;
                          break label2464;
                        }
                      }
                      else {}
                    }
                    j = i;
                    i = m;
                    paramInt2 = k;
                    localObject1 = zzi(paramInt1, i2, paramInt2, i, j);
                    paramzzaec = new byte[i4];
                    paramzzfd.zzB(paramzzaec, 0, i4);
                    paramzzaec = new zzads((String)localObject1, paramzzaec);
                  }
                  if (paramzzaec == null)
                  {
                    localObject2 = zzi(paramInt1, i9, paramInt2, i, j);
                    localObject1 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject1).<init>();
                    ((StringBuilder)localObject1).append("Failed to decode frame: id=");
                    ((StringBuilder)localObject1).append((String)localObject2);
                    ((StringBuilder)localObject1).append(", frameSize=");
                    ((StringBuilder)localObject1).append(i4);
                    zzer.zze("Id3Decoder", ((StringBuilder)localObject1).toString());
                  }
                }
                finally
                {
                  break;
                }
                paramzzfd.zzF(i8);
                return paramzzaec;
              }
            }
          }
          paramzzfd.zzF(i8);
        }
        if (i9 == 84)
        {
          paramzzaec = zzi(paramInt1, 84, i1, n, i);
          if (i4 <= 0) {}
          for (paramzzaec = (zzaec)localObject1;; paramzzaec = new zzaen(paramzzaec, null, zzg((byte[])localObject1, paramInt2, 0)))
          {
            paramInt2 = k;
            j = i;
            i = m;
            break;
            paramInt2 = paramzzfd.zzk();
            j = i4 - 1;
            localObject1 = new byte[j];
            paramzzfd.zzB((byte[])localObject1, 0, j);
          }
        }
      }
      label1225:
      label1701:
      label1715:
      label2464:
      zzer.zze("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
      paramzzfd.zzF(i8);
      return null;
    }
    paramzzfd.zzF(i8);
    return null;
  }
  
  private static zzfrr zzg(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= paramArrayOfByte.length) {
      return zzfrr.zzm("");
    }
    Object localObject = new zzfro();
    for (int i = zzc(paramArrayOfByte, paramInt2, paramInt1); paramInt2 < i; i = zzc(paramArrayOfByte, paramInt2, paramInt1))
    {
      ((zzfro)localObject).zzf(new String(paramArrayOfByte, paramInt2, i - paramInt2, zzj(paramInt1)));
      paramInt2 = zzb(paramInt1) + i;
    }
    localObject = ((zzfro)localObject).zzi();
    paramArrayOfByte = (byte[])localObject;
    if (((zzfrr)localObject).isEmpty()) {
      paramArrayOfByte = zzfrr.zzm("");
    }
    return paramArrayOfByte;
  }
  
  private static String zzh(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Charset paramCharset)
  {
    if ((paramInt2 > paramInt1) && (paramInt2 <= paramArrayOfByte.length)) {
      return new String(paramArrayOfByte, paramInt1, paramInt2 - paramInt1, paramCharset);
    }
    return "";
  }
  
  private static String zzi(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    String str;
    if (paramInt1 == 2) {
      str = String.format(Locale.US, "%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    } else {
      str = String.format(Locale.US, "%c%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
    }
    return str;
  }
  
  private static Charset zzj(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return zzfol.zzb;
        }
        return zzfol.zzc;
      }
      return zzfol.zzd;
    }
    return zzfol.zzf;
  }
  
  private static boolean zzk(zzfd paramzzfd, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int n = paramzzfd.zzc();
    try
    {
      for (;;)
      {
        int i = paramzzfd.zza();
        int m = 1;
        int j = 1;
        if (i < paramInt2) {
          break;
        }
        long l1;
        int k;
        if (paramInt1 >= 3)
        {
          i = paramzzfd.zze();
          l1 = paramzzfd.zzs();
          k = paramzzfd.zzo();
        }
        else
        {
          i = paramzzfd.zzm();
          k = paramzzfd.zzm();
          l1 = k;
          k = 0;
        }
        if ((i == 0) && (l1 == 0L) && (k == 0)) {
          return true;
        }
        long l2 = l1;
        if (paramInt1 == 4)
        {
          l2 = l1;
          if (!paramBoolean)
          {
            if ((0x808080 & l1) != 0L) {
              return false;
            }
            l2 = l1 >> 24 << 21 | (l1 >> 16 & 0xFF) << 14 | l1 & 0xFF | (l1 >> 8 & 0xFF) << 7;
          }
        }
        if (paramInt1 == 4)
        {
          if ((k & 0x40) != 0) {
            i = j;
          } else {
            i = 0;
          }
          k &= 0x1;
        }
        else
        {
          if (paramInt1 == 3)
          {
            if ((k & 0x20) != 0) {
              i = 1;
            } else {
              i = 0;
            }
            j = i;
            if ((k & 0x80) != 0)
            {
              k = m;
              break label261;
            }
          }
          else
          {
            j = 0;
          }
          k = 0;
          i = j;
        }
        label261:
        j = i;
        if (k != 0) {
          j = i + 4;
        }
        if (l2 < j) {
          return false;
        }
        i = paramzzfd.zza();
        if (i < l2) {
          return false;
        }
        i = (int)l2;
        paramzzfd.zzG(i);
      }
      return true;
    }
    finally
    {
      paramzzfd.zzF(n);
    }
  }
  
  private static byte[] zzl(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramInt1) {
      return zzfn.zzf;
    }
    return Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */