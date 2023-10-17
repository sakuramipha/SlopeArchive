package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

public final class zzaf
{
  private final SparseBooleanArray zza = new SparseBooleanArray();
  private boolean zzb;
  
  public final zzaf zza(int paramInt)
  {
    zzdy.zzf(this.zzb ^ true);
    this.zza.append(paramInt, true);
    return this;
  }
  
  public final zzah zzb()
  {
    zzdy.zzf(this.zzb ^ true);
    this.zzb = true;
    return new zzah(this.zza, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */