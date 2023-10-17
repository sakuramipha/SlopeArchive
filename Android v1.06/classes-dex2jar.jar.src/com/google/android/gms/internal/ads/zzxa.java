package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

public abstract class zzxa
  extends zzxd
{
  private zzwz zza;
  
  protected abstract Pair zzb(zzwz paramzzwz, int[][][] paramArrayOfInt, int[] paramArrayOfInt1, zztl paramzztl, zzcx paramzzcx)
    throws zzia;
  
  public final zzxe zzn(zzlf[] paramArrayOfzzlf, zzvk paramzzvk, zztl paramzztl, zzcx paramzzcx)
    throws zzia
  {
    Object localObject4 = new int[3];
    Object localObject5 = new zzcz[3][];
    Object localObject2 = new int[3][][];
    int j;
    for (int i = 0; i < 3; i++)
    {
      j = paramzzvk.zzc;
      localObject5[i] = new zzcz[j];
      localObject2[i] = new int[j][];
    }
    Object localObject3 = new int[2];
    for (i = 0; i < 2; i++) {
      localObject3[i] = paramArrayOfzzlf[i].zze();
    }
    int k;
    int m;
    for (int i2 = 0; i2 < paramzzvk.zzc; i2++)
    {
      localObject6 = paramzzvk.zzb(i2);
      int i6 = ((zzcz)localObject6).zzd;
      i = 0;
      int i3 = 2;
      int i5 = 0;
      int n;
      for (int i4 = 1; i < 2; i4 = n)
      {
        localObject1 = paramArrayOfzzlf[i];
        k = 0;
        j = 0;
        for (;;)
        {
          m = ((zzcz)localObject6).zzb;
          if (k > 0) {
            break;
          }
          j = Math.max(j, ((zzlf)localObject1).zzQ(((zzcz)localObject6).zzb(k)) & 0x7);
          k++;
        }
        int i1;
        if (localObject4[i] == 0) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (j <= i5)
        {
          k = i3;
          m = i5;
          n = i4;
          if (j == i5)
          {
            k = i3;
            m = i5;
            n = i4;
            if (i6 == 5)
            {
              k = i3;
              m = i5;
              n = i4;
              if (i4 == 0)
              {
                k = i3;
                m = i5;
                n = i4;
                if (i1 != 0)
                {
                  k = i;
                  n = 1;
                  m = j;
                }
              }
            }
          }
        }
        else
        {
          n = i1;
          k = i;
          m = j;
        }
        i++;
        i3 = k;
        i5 = m;
      }
      if (i3 == 2)
      {
        i = ((zzcz)localObject6).zzb;
        localObject1 = new int[1];
      }
      else
      {
        zzlf localzzlf = paramArrayOfzzlf[i3];
        i = ((zzcz)localObject6).zzb;
        localObject1 = new int[1];
        for (i = 0;; i++)
        {
          j = ((zzcz)localObject6).zzb;
          if (i > 0) {
            break;
          }
          localObject1[i] = localzzlf.zzQ(((zzcz)localObject6).zzb(i));
        }
      }
      i = localObject4[i3];
      localObject5[i3][i] = localObject6;
      localObject2[i3][i] = localObject1;
      localObject4[i3] = (i + 1);
    }
    Object localObject6 = new zzvk[2];
    Object localObject1 = new String[2];
    paramzzvk = new int[2];
    for (i = 0; i < 2; i++)
    {
      j = localObject4[i];
      localObject6[i] = new zzvk((zzcz[])zzfn.zzF(localObject5[i], j));
      localObject2[i] = ((int[][])zzfn.zzF(localObject2[i], j));
      localObject1[i] = paramArrayOfzzlf[i].zzM();
      paramzzvk[i] = paramArrayOfzzlf[i].zzb();
    }
    i = localObject4[2];
    paramzzvk = new zzwz((String[])localObject1, paramzzvk, (zzvk[])localObject6, (int[])localObject3, (int[][][])localObject2, new zzvk((zzcz[])zzfn.zzF(localObject5[2], i)));
    paramzztl = zzb(paramzzvk, (int[][][])localObject2, (int[])localObject3, paramzztl, paramzzcx);
    localObject1 = (zzxb[])paramzztl.second;
    paramzzcx = new List[localObject1.length];
    for (i = 0; i < localObject1.length; i++)
    {
      paramArrayOfzzlf = localObject1[i];
      if (paramArrayOfzzlf != null) {
        paramArrayOfzzlf = zzfrr.zzm(paramArrayOfzzlf);
      } else {
        paramArrayOfzzlf = zzfrr.zzl();
      }
      paramzzcx[i] = paramArrayOfzzlf;
    }
    paramArrayOfzzlf = new zzfro();
    for (i = 0; i < 2; i++)
    {
      localObject6 = paramzzvk.zzd(i);
      localObject2 = paramzzcx[i];
      for (j = 0; j < ((zzvk)localObject6).zzc; j++)
      {
        localObject4 = ((zzvk)localObject6).zzb(j);
        boolean bool;
        if (paramzzvk.zza(i, j, false) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        k = ((zzcz)localObject4).zzb;
        localObject1 = new int[1];
        localObject3 = new boolean[1];
        for (k = 0;; k++)
        {
          m = ((zzcz)localObject4).zzb;
          if (k > 0) {
            break;
          }
          localObject1[k] = (paramzzvk.zzb(i, j, k) & 0x7);
          for (m = 0; m < ((List)localObject2).size(); m++)
          {
            localObject5 = (zzxb)((List)localObject2).get(m);
            if ((((zzxb)localObject5).zze().equals(localObject4)) && (((zzxb)localObject5).zzb(k) != -1))
            {
              i7 = 1;
              break label873;
            }
          }
          int i7 = 0;
          label873:
          localObject3[k] = i7;
        }
        paramArrayOfzzlf.zzf(new zzdh((zzcz)localObject4, bool, (int[])localObject1, (boolean[])localObject3));
      }
    }
    localObject2 = paramzzvk.zze();
    for (i = 0; i < ((zzvk)localObject2).zzc; i++)
    {
      paramzzcx = ((zzvk)localObject2).zzb(i);
      j = paramzzcx.zzb;
      localObject1 = new int[1];
      Arrays.fill((int[])localObject1, 0);
      j = paramzzcx.zzb;
      paramArrayOfzzlf.zzf(new zzdh(paramzzcx, false, (int[])localObject1, new boolean[1]));
    }
    paramArrayOfzzlf = new zzdi(paramArrayOfzzlf.zzi());
    return new zzxe((zzlg[])paramzztl.first, (zzwx[])paramzztl.second, paramArrayOfzzlf, paramzzvk);
  }
  
  public final void zzo(Object paramObject)
  {
    this.zza = ((zzwz)paramObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */