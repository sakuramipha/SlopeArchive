package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class zzajo
  implements zzajg
{
  final zzajp zza;
  private final zzfc zzb = new zzfc(new byte[5], 5);
  private final SparseArray zzc = new SparseArray();
  private final SparseIntArray zzd = new SparseIntArray();
  private final int zze;
  
  public zzajo(zzajp paramzzajp, int paramInt)
  {
    this.zze = paramInt;
  }
  
  public final void zza(zzfd paramzzfd)
  {
    if (paramzzfd.zzk() != 2) {
      return;
    }
    Object localObject1 = (zzfl)zzajp.zzk(this.zza).get(0);
    if ((paramzzfd.zzk() & 0x80) == 0) {
      return;
    }
    paramzzfd.zzG(1);
    int j = paramzzfd.zzo();
    paramzzfd.zzG(3);
    paramzzfd.zzA(this.zzb, 2);
    this.zzb.zzl(3);
    zzajp.zzl(this.zza, this.zzb.zzd(13));
    paramzzfd.zzA(this.zzb, 2);
    this.zzb.zzl(4);
    paramzzfd.zzG(this.zzb.zzd(12));
    this.zzc.clear();
    this.zzd.clear();
    int k = paramzzfd.zza();
    int n;
    int m;
    while (k > 0)
    {
      paramzzfd.zzA(this.zzb, 5);
      n = this.zzb.zzd(8);
      this.zzb.zzl(3);
      int i1 = this.zzb.zzd(13);
      this.zzb.zzl(4);
      int i2 = this.zzb.zzd(12);
      int i4 = paramzzfd.zzc();
      int i3 = i4 + i2;
      Object localObject2 = null;
      Object localObject3 = null;
      i = -1;
      while (paramzzfd.zzc() < i3)
      {
        int i6 = paramzzfd.zzk();
        m = paramzzfd.zzk();
        int i5 = paramzzfd.zzc() + m;
        if (i5 > i3) {
          break;
        }
        if (i6 == 5)
        {
          long l = paramzzfd.zzs();
          if (l != 1094921523L)
          {
            if (l == 1161904947L) {
              break label357;
            }
            if (l == 1094921524L)
            {
              i = 172;
              break label339;
            }
            if (l != 1212503619L) {
              break label383;
            }
            i = 36;
            break label339;
          }
        }
        else
        {
          if (i6 != 106) {
            break label350;
          }
        }
        i = 129;
        label339:
        Object localObject4;
        Object localObject5;
        label350:
        label357:
        label383:
        label420:
        for (;;)
        {
          localObject4 = localObject2;
          localObject5 = localObject3;
          break label560;
          if (i6 == 122)
          {
            i = 135;
          }
          else
          {
            if (i6 == 127)
            {
              if (paramzzfd.zzk() == 21) {
                break;
              }
              break label420;
            }
            if (i6 == 123)
            {
              i = 138;
            }
            else
            {
              if (i6 != 10) {
                break label423;
              }
              localObject2 = paramzzfd.zzx(3, zzfol.zzc).trim();
            }
          }
        }
        label423:
        if (i6 == 89)
        {
          localObject5 = new ArrayList();
          while (paramzzfd.zzc() < i5)
          {
            localObject4 = paramzzfd.zzx(3, zzfol.zzc).trim();
            i = paramzzfd.zzk();
            localObject3 = new byte[4];
            paramzzfd.zzB((byte[])localObject3, 0, 4);
            ((List)localObject5).add(new zzajq((String)localObject4, i, (byte[])localObject3));
          }
          i = 89;
          localObject4 = localObject2;
        }
        else
        {
          Object localObject6 = localObject1;
          m = j;
          localObject4 = localObject2;
          localObject5 = localObject3;
          localObject1 = localObject6;
          j = m;
          if (i6 == 111)
          {
            i = 257;
            j = m;
            localObject1 = localObject6;
            localObject5 = localObject3;
            localObject4 = localObject2;
          }
        }
        label560:
        paramzzfd.zzG(i5 - paramzzfd.zzc());
        localObject2 = localObject4;
        localObject3 = localObject5;
      }
      paramzzfd.zzF(i3);
      localObject2 = new zzajr(i, (String)localObject2, (List)localObject3, Arrays.copyOfRange(paramzzfd.zzH(), i4, i3));
      if (n != 6)
      {
        i = n;
        if (n != 5) {}
      }
      else
      {
        i = ((zzajr)localObject2).zza;
      }
      k -= i2 + 5;
      if (!zzajp.zzg(this.zza).get(i1))
      {
        localObject2 = zzajp.zzj(this.zza).zza(i, (zzajr)localObject2);
        this.zzd.put(i1, i1);
        this.zzc.put(i1, localObject2);
      }
    }
    paramzzfd = (zzfd)localObject1;
    int i = j;
    k = this.zzd.size();
    for (j = 0; j < k; j++)
    {
      n = this.zzd.keyAt(j);
      m = this.zzd.valueAt(j);
      zzajp.zzg(this.zza).put(n, true);
      zzajp.zzh(this.zza).put(m, true);
      localObject1 = (zzaju)this.zzc.valueAt(j);
      if (localObject1 != null)
      {
        ((zzaju)localObject1).zzb(paramzzfd, zzajp.zzi(this.zza), new zzajt(i, n, 8192));
        zzajp.zzf(this.zza).put(m, localObject1);
      }
    }
    zzajp.zzf(this.zza).remove(this.zze);
    zzajp.zzm(this.zza, 0);
    paramzzfd = this.zza;
    if (zzajp.zze(paramzzfd) == 0)
    {
      zzajp.zzi(paramzzfd).zzC();
      zzajp.zzn(this.zza, true);
    }
  }
  
  public final void zzb(zzfl paramzzfl, zzaar paramzzaar, zzajt paramzzajt) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */