package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class zzzt
{
  public final List zza;
  public final int zzb;
  public final int zzc;
  public final int zzd;
  public final int zze;
  public final int zzf;
  public final int zzg;
  public final float zzh;
  public final String zzi;
  
  private zzzt(List paramList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat, String paramString)
  {
    this.zza = paramList;
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    this.zzd = paramInt3;
    this.zze = paramInt4;
    this.zzf = paramInt5;
    this.zzg = paramInt6;
    this.zzh = paramFloat;
    this.zzi = paramString;
  }
  
  public static zzzt zza(zzfd paramzzfd)
    throws zzce
  {
    try
    {
      paramzzfd.zzG(4);
      int i1 = (paramzzfd.zzk() & 0x3) + 1;
      if (i1 != 3)
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int j = paramzzfd.zzk() & 0x1F;
        for (int i = 0; i < j; i++) {
          localArrayList.add(zzb(paramzzfd));
        }
        int k = paramzzfd.zzk();
        for (i = 0; i < k; i++) {
          localArrayList.add(zzb(paramzzfd));
        }
        int n;
        int m;
        float f;
        if (j > 0)
        {
          paramzzfd = (byte[])localArrayList.get(0);
          paramzzfd = zzew.zzd((byte[])localArrayList.get(0), i1 + 1, paramzzfd.length);
          n = paramzzfd.zze;
          m = paramzzfd.zzf;
          k = paramzzfd.zzh;
          j = paramzzfd.zzi;
          i = paramzzfd.zzj;
          f = paramzzfd.zzg;
          paramzzfd = zzea.zza(paramzzfd.zza, paramzzfd.zzb, paramzzfd.zzc);
        }
        else
        {
          paramzzfd = null;
          n = -1;
          m = -1;
          k = -1;
          j = -1;
          i = -1;
          f = 1.0F;
        }
        return new zzzt(localArrayList, i1, n, m, k, j, i, f, paramzzfd);
      }
      paramzzfd = new java/lang/IllegalStateException;
      paramzzfd.<init>();
      throw paramzzfd;
    }
    catch (ArrayIndexOutOfBoundsException paramzzfd)
    {
      throw zzce.zza("Error parsing AVC config", paramzzfd);
    }
  }
  
  private static byte[] zzb(zzfd paramzzfd)
  {
    int i = paramzzfd.zzo();
    int j = paramzzfd.zzc();
    paramzzfd.zzG(i);
    return zzea.zzc(paramzzfd.zzH(), j, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */