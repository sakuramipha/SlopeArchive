package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

public final class zzbd
{
  private final List zza = new ArrayList();
  private final List zzb = new ArrayList();
  private final List zzc = new ArrayList();
  
  public final zzbd zza(String paramString, double paramDouble1, double paramDouble2)
  {
    for (int i = 0; i < this.zza.size(); i++)
    {
      double d1 = ((Double)this.zzc.get(i)).doubleValue();
      double d2 = ((Double)this.zzb.get(i)).doubleValue();
      if ((paramDouble1 < d1) || ((d1 == paramDouble1) && (paramDouble2 < d2))) {
        break;
      }
    }
    this.zza.add(i, paramString);
    this.zzc.add(i, Double.valueOf(paramDouble1));
    this.zzb.add(i, Double.valueOf(paramDouble2));
    return this;
  }
  
  public final zzbf zzb()
  {
    return new zzbf(this, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */