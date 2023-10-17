package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzabe
{
  public final List zza;
  public final int zzb;
  public final int zzc;
  public final int zzd;
  public final int zze;
  public final float zzf;
  public final String zzg;
  
  private zzabe(List paramList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat, String paramString)
  {
    this.zza = paramList;
    this.zzb = paramInt1;
    this.zzc = paramInt4;
    this.zzd = paramInt5;
    this.zze = paramInt6;
    this.zzf = paramFloat;
    this.zzg = paramString;
  }
  
  public static zzabe zza(zzfd paramzzfd)
    throws zzce
  {
    try
    {
      paramzzfd.zzG(21);
      int i2 = paramzzfd.zzk() & 0x3;
      int i9 = paramzzfd.zzk();
      int m = paramzzfd.zzc();
      int j = 0;
      int i = 0;
      while (j < i9)
      {
        paramzzfd.zzG(1);
        n = paramzzfd.zzo();
        for (k = 0; k < n; k++)
        {
          i1 = paramzzfd.zzo();
          i += i1 + 4;
          paramzzfd.zzG(i1);
        }
        j++;
      }
      paramzzfd.zzF(m);
      Object localObject3 = new byte[i];
      Object localObject1 = null;
      j = 0;
      int i1 = 0;
      int i5 = -1;
      int i3 = -1;
      int i4 = -1;
      int n = -1;
      m = -1;
      float f1 = 1.0F;
      int i8 = i;
      i = j;
      int k = i2;
      while (i < i9)
      {
        int i7 = paramzzfd.zzk() & 0x3F;
        int i6 = paramzzfd.zzo();
        j = 0;
        Object localObject2 = localObject1;
        localObject1 = localObject3;
        while (j < i6)
        {
          i2 = paramzzfd.zzo();
          System.arraycopy(zzew.zza, 0, localObject1, i1, 4);
          i1 += 4;
          System.arraycopy(paramzzfd.zzH(), paramzzfd.zzc(), localObject1, i1, i2);
          int i14;
          int i12;
          if ((i7 == 33) && (j == 0))
          {
            zzfe localzzfe = new com/google/android/gms/internal/ads/zzfe;
            localzzfe.<init>((byte[])localObject1, i1 + 2, i1 + i2);
            localzzfe.zze(4);
            i3 = localzzfe.zza(3);
            localzzfe.zzd();
            int i17 = localzzfe.zza(2);
            boolean bool2 = localzzfe.zzf();
            int i16 = localzzfe.zza(5);
            j = 0;
            for (int i10 = 0; j < 32; i10 = m)
            {
              m = i10;
              if (localzzfe.zzf()) {
                m = i10 | 1 << j;
              }
              j++;
            }
            int[] arrayOfInt2 = new int[6];
            for (j = 0; j < 6; j++) {
              arrayOfInt2[j] = localzzfe.zza(8);
            }
            int i11 = localzzfe.zza(8);
            m = 0;
            for (n = 0; n < i3; n++)
            {
              j = m;
              if (localzzfe.zzf()) {
                j = m + 89;
              }
              m = j;
              if (localzzfe.zzf()) {
                m = j + 8;
              }
            }
            localzzfe.zze(m);
            if (i3 > 0)
            {
              j = 8 - i3;
              localzzfe.zze(j + j);
            }
            localzzfe.zzc();
            m = localzzfe.zzc();
            j = m;
            if (m == 3)
            {
              localzzfe.zzd();
              j = 3;
            }
            n = localzzfe.zzc();
            i4 = localzzfe.zzc();
            if (localzzfe.zzf())
            {
              i14 = localzzfe.zzc();
              i13 = localzzfe.zzc();
              i5 = localzzfe.zzc();
              i12 = localzzfe.zzc();
              if (j != 1) {
                if (j == 2)
                {
                  j = 2;
                }
                else
                {
                  m = 1;
                  break label570;
                }
              }
              m = 2;
              label570:
              if (j == 1) {
                j = 2;
              } else {
                j = 1;
              }
              m = n - m * (i14 + i13);
              n = i4 - j * (i5 + i12);
              j = m;
              m = n;
            }
            else
            {
              m = i4;
              j = n;
            }
            localzzfe.zzc();
            localzzfe.zzc();
            int i18 = localzzfe.zzc();
            if (true != localzzfe.zzf()) {
              n = i3;
            }
            for (n = 0; n <= i3; n++)
            {
              localzzfe.zzc();
              localzzfe.zzc();
              localzzfe.zzc();
            }
            localzzfe.zzc();
            localzzfe.zzc();
            localzzfe.zzc();
            localzzfe.zzc();
            localzzfe.zzc();
            localzzfe.zzc();
            localObject2 = localObject1;
            n = j;
            if (localzzfe.zzf())
            {
              localObject2 = localObject1;
              n = j;
              if (localzzfe.zzf()) {
                for (i3 = 0;; i3++)
                {
                  localObject2 = localObject1;
                  n = j;
                  if (i3 >= 4) {
                    break;
                  }
                  n = 0;
                  while (n < 6)
                  {
                    if (!localzzfe.zzf())
                    {
                      localzzfe.zzc();
                    }
                    else
                    {
                      i5 = Math.min(64, 1 << i3 + i3 + 4);
                      if (i3 > 1) {
                        localzzfe.zzb();
                      }
                      for (i4 = 0; i4 < i5; i4++) {
                        localzzfe.zzb();
                      }
                    }
                    if (i3 == 3) {
                      i4 = 3;
                    } else {
                      i4 = 1;
                    }
                    n += i4;
                  }
                }
              }
            }
            localObject3 = localObject2;
            localzzfe.zze(2);
            if (localzzfe.zzf())
            {
              localzzfe.zze(8);
              localzzfe.zzc();
              localzzfe.zzc();
              localzzfe.zzd();
            }
            i12 = localzzfe.zzc();
            localObject2 = new int[0];
            localObject1 = new int[0];
            i14 = -1;
            int i13 = -1;
            i5 = 0;
            j = i2;
            while (i5 < i12)
            {
              if ((i5 != 0) && (localzzfe.zzf()))
              {
                int i19 = i14 + i13;
                boolean bool1 = localzzfe.zzf();
                int i15 = localzzfe.zzc();
                i4 = i19 + 1;
                boolean[] arrayOfBoolean = new boolean[i4];
                for (i2 = 0; i2 <= i19; i2++) {
                  if (!localzzfe.zzf()) {
                    arrayOfBoolean[i2] = localzzfe.zzf();
                  } else {
                    arrayOfBoolean[i2] = true;
                  }
                }
                i3 = i13 - 1;
                int[] arrayOfInt1 = new int[i4];
                int[] arrayOfInt3 = new int[i4];
                int i20;
                for (i2 = 0;; i2 = i4)
                {
                  i20 = (1 - (bool1 + bool1)) * (i15 + 1);
                  if (i3 < 0) {
                    break;
                  }
                  i20 = localObject1[i3] + i20;
                  i4 = i2;
                  if (i20 < 0)
                  {
                    i4 = i2;
                    if (arrayOfBoolean[(i14 + i3)] != 0)
                    {
                      arrayOfInt1[i2] = i20;
                      i4 = i2 + 1;
                    }
                  }
                  i3--;
                }
                i3 = i2;
                if (i20 < 0)
                {
                  i3 = i2;
                  if (arrayOfBoolean[i19] != 0)
                  {
                    arrayOfInt1[i2] = i20;
                    i3 = i2 + 1;
                  }
                }
                i2 = i3;
                i3 = 0;
                while (i3 < i14)
                {
                  i15 = localObject2[i3] + i20;
                  i4 = i2;
                  if (i15 < 0)
                  {
                    i4 = i2;
                    if (arrayOfBoolean[i3] != 0)
                    {
                      arrayOfInt1[i2] = i15;
                      i4 = i2 + 1;
                    }
                  }
                  i3++;
                  i2 = i4;
                }
                arrayOfInt1 = Arrays.copyOf(arrayOfInt1, i2);
                i4 = i14 - 1;
                for (i3 = 0; i4 >= 0; i3 = i15)
                {
                  int i21 = localObject2[i4] + i20;
                  i15 = i3;
                  if (i21 > 0)
                  {
                    i15 = i3;
                    if (arrayOfBoolean[i4] != 0)
                    {
                      arrayOfInt3[i3] = i21;
                      i15 = i3 + 1;
                    }
                  }
                  i4--;
                }
                i4 = i3;
                if (i20 > 0)
                {
                  i4 = i3;
                  if (arrayOfBoolean[i19] != 0)
                  {
                    arrayOfInt3[i3] = i20;
                    i4 = i3 + 1;
                  }
                }
                i3 = i4;
                i4 = 0;
                while (i4 < i13)
                {
                  i19 = localObject1[i4] + i20;
                  i15 = i3;
                  if (i19 > 0)
                  {
                    i15 = i3;
                    if (arrayOfBoolean[(i14 + i4)] != 0)
                    {
                      arrayOfInt3[i3] = i19;
                      i15 = i3 + 1;
                    }
                  }
                  i4++;
                  i3 = i15;
                }
                localObject1 = Arrays.copyOf(arrayOfInt3, i3);
                i4 = i3;
                localObject2 = arrayOfInt1;
                i3 = i2;
                i2 = i4;
              }
              else
              {
                i3 = localzzfe.zzc();
                i4 = localzzfe.zzc();
                localObject2 = new int[i3];
                for (i2 = 0; i2 < i3; i2++)
                {
                  localObject2[i2] = (localzzfe.zzc() + 1);
                  localzzfe.zzd();
                }
                localObject1 = new int[i4];
                for (i2 = 0; i2 < i4; i2++)
                {
                  localObject1[i2] = (localzzfe.zzc() + 1);
                  localzzfe.zzd();
                }
                i2 = i4;
              }
              i5++;
              i14 = i3;
              i13 = i2;
            }
            i13 = i;
            i12 = j;
            i14 = i1;
            if (localzzfe.zzf()) {
              for (i = 0; i < localzzfe.zzc(); i++) {
                localzzfe.zze(i18 + 5);
              }
            }
            i = 2;
            localzzfe.zze(2);
            label1759:
            label1865:
            float f2;
            if (localzzfe.zzf())
            {
              if (localzzfe.zzf())
              {
                j = localzzfe.zza(8);
                if (j == 255)
                {
                  j = localzzfe.zza(16);
                  i1 = localzzfe.zza(16);
                  if ((j != 0) && (i1 != 0))
                  {
                    f1 = j / i1;
                    break label1759;
                  }
                }
                else
                {
                  if (j < 17)
                  {
                    f1 = zzew.zzb[j];
                    break label1759;
                  }
                  localObject1 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject1).<init>();
                  ((StringBuilder)localObject1).append("Unexpected aspect_ratio_idc value: ");
                  ((StringBuilder)localObject1).append(j);
                  zzer.zze("NalUnitUtil", ((StringBuilder)localObject1).toString());
                }
              }
              f1 = 1.0F;
              if (localzzfe.zzf()) {
                localzzfe.zzd();
              }
              if (localzzfe.zzf())
              {
                localzzfe.zze(3);
                if (true == localzzfe.zzf()) {
                  i = 1;
                }
                i1 = i;
                if (localzzfe.zzf())
                {
                  i1 = localzzfe.zza(8);
                  j = localzzfe.zza(8);
                  localzzfe.zze(8);
                  i4 = zzs.zza(i1);
                  i2 = zzs.zzb(j);
                  i1 = i;
                  break label1865;
                }
              }
              else
              {
                i1 = -1;
              }
              i4 = -1;
              i2 = -1;
              if (localzzfe.zzf())
              {
                localzzfe.zzc();
                localzzfe.zzc();
              }
              localzzfe.zzd();
              i5 = i1;
              f2 = f1;
              i3 = i4;
              j = i2;
              i = m;
              if (localzzfe.zzf())
              {
                i = m + m;
                i5 = i1;
                f2 = f1;
                i3 = i4;
                j = i2;
              }
            }
            else
            {
              i5 = -1;
              f2 = 1.0F;
              i3 = -1;
              j = -1;
              i = m;
            }
            localObject2 = zzea.zzb(i17, bool2, i16, i10, arrayOfInt2, i11);
            m = i5;
            f1 = f2;
            i4 = i3;
            i1 = j;
            j = 0;
            i5 = n;
            i3 = i;
            n = m;
            m = i1;
            localObject1 = localObject3;
            i = i13;
          }
          else
          {
            i12 = i2;
            i14 = i1;
          }
          i1 = i14 + i12;
          paramzzfd.zzG(i12);
          j++;
        }
        i++;
        localObject3 = localObject1;
        localObject1 = localObject2;
      }
      if (i8 == 0) {
        paramzzfd = Collections.emptyList();
      } else {
        paramzzfd = Collections.singletonList(localObject3);
      }
      paramzzfd = new zzabe(paramzzfd, k + 1, i5, i3, i4, n, m, f1, (String)localObject1);
      return paramzzfd;
    }
    catch (ArrayIndexOutOfBoundsException paramzzfd)
    {
      throw zzce.zza("Error parsing HEVC config", paramzzfd);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */