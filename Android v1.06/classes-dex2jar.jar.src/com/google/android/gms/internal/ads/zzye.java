package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class zzye
{
  private static final Comparator zza = zzya.zza;
  private static final Comparator zzb = zzyb.zza;
  private final ArrayList zzc = new ArrayList();
  private final zzyd[] zzd = new zzyd[5];
  private int zze = -1;
  private int zzf;
  private int zzg;
  private int zzh;
  
  public zzye(int paramInt) {}
  
  public final float zza(float paramFloat)
  {
    int j = this.zze;
    int i = 0;
    if (j != 0)
    {
      Collections.sort(this.zzc, zzb);
      this.zze = 0;
    }
    paramFloat = this.zzg;
    j = 0;
    while (i < this.zzc.size())
    {
      localObject = (zzyd)this.zzc.get(i);
      j += ((zzyd)localObject).zzb;
      if (j >= 0.5F * paramFloat) {
        return ((zzyd)localObject).zzc;
      }
      i++;
    }
    if (this.zzc.isEmpty()) {
      return NaN.0F;
    }
    Object localObject = this.zzc;
    return ((zzyd)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1)).zzc;
  }
  
  public final void zzb(int paramInt, float paramFloat)
  {
    if (this.zze != 1)
    {
      Collections.sort(this.zzc, zza);
      this.zze = 1;
    }
    int i = this.zzh;
    Object localObject;
    if (i > 0)
    {
      localObject = this.zzd;
      i--;
      this.zzh = i;
      localObject = localObject[i];
    }
    else
    {
      localObject = new zzyd(null);
    }
    i = this.zzf;
    this.zzf = (i + 1);
    ((zzyd)localObject).zza = i;
    ((zzyd)localObject).zzb = paramInt;
    ((zzyd)localObject).zzc = paramFloat;
    this.zzc.add(localObject);
    this.zzg += paramInt;
    for (;;)
    {
      paramInt = this.zzg;
      if (paramInt <= 2000) {
        break;
      }
      paramInt -= 2000;
      zzyd localzzyd = (zzyd)this.zzc.get(0);
      i = localzzyd.zzb;
      if (i <= paramInt)
      {
        this.zzg -= i;
        this.zzc.remove(0);
        paramInt = this.zzh;
        if (paramInt < 5)
        {
          localObject = this.zzd;
          this.zzh = (paramInt + 1);
          localObject[paramInt] = localzzyd;
        }
      }
      else
      {
        localzzyd.zzb = (i - paramInt);
        this.zzg -= paramInt;
      }
    }
  }
  
  public final void zzc()
  {
    this.zzc.clear();
    this.zze = -1;
    this.zzf = 0;
    this.zzg = 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */