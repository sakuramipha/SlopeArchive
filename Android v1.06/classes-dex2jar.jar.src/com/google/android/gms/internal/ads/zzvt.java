package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

public class zzvt
  implements zzwx
{
  protected final zzcz zza;
  protected final int zzb;
  protected final int[] zzc;
  private final zzam[] zzd;
  private int zze;
  
  public zzvt(zzcz paramzzcz, int[] paramArrayOfInt, int paramInt)
  {
    paramInt = paramArrayOfInt.length;
    int i = 0;
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    Objects.requireNonNull(paramzzcz);
    this.zza = paramzzcz;
    this.zzb = paramInt;
    this.zzd = new zzam[paramInt];
    for (paramInt = 0; paramInt < paramArrayOfInt.length; paramInt++) {
      this.zzd[paramInt] = paramzzcz.zzb(paramArrayOfInt[paramInt]);
    }
    Arrays.sort(this.zzd, zzvs.zza);
    this.zzc = new int[this.zzb];
    for (paramInt = i; paramInt < this.zzb; paramInt++) {
      this.zzc[paramInt] = paramzzcz.zza(this.zzd[paramInt]);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzvt)paramObject;
      if ((this.zza == ((zzvt)paramObject).zza) && (Arrays.equals(this.zzc, ((zzvt)paramObject).zzc))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zze;
    int i = j;
    if (j == 0)
    {
      i = System.identityHashCode(this.zza) * 31 + Arrays.hashCode(this.zzc);
      this.zze = i;
    }
    return i;
  }
  
  public final int zza(int paramInt)
  {
    return this.zzc[0];
  }
  
  public final int zzb(int paramInt)
  {
    for (int i = 0; i < this.zzb; i++) {
      if (this.zzc[i] == paramInt) {
        return i;
      }
    }
    return -1;
  }
  
  public final int zzc()
  {
    return this.zzc.length;
  }
  
  public final zzam zzd(int paramInt)
  {
    return this.zzd[paramInt];
  }
  
  public final zzcz zze()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzvt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */