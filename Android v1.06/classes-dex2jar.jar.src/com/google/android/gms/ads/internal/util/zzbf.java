package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

public final class zzbf
{
  private final String[] zza;
  private final double[] zzb;
  private final double[] zzc;
  private final int[] zzd;
  private int zze;
  
  private static final double[] zzc(List paramList)
  {
    int j = paramList.size();
    double[] arrayOfDouble = new double[j];
    for (int i = 0; i < j; i++) {
      arrayOfDouble[i] = ((Double)paramList.get(i)).doubleValue();
    }
    return arrayOfDouble;
  }
  
  public final List zza()
  {
    ArrayList localArrayList = new ArrayList(this.zza.length);
    for (int i = 0;; i++)
    {
      Object localObject = this.zza;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      double d1 = this.zzc[i];
      double d2 = this.zzb[i];
      int j = this.zzd[i];
      localArrayList.add(new zzbc((String)localObject, d1, d2, j / this.zze, j));
    }
    return localArrayList;
  }
  
  public final void zzb(double paramDouble)
  {
    this.zze += 1;
    for (int i = 0;; i++)
    {
      Object localObject = this.zzc;
      if (i >= localObject.length) {
        break;
      }
      double d = localObject[i];
      if ((d <= paramDouble) && (paramDouble < this.zzb[i]))
      {
        localObject = this.zzd;
        localObject[i] += 1;
      }
      if (paramDouble < d) {
        break;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */