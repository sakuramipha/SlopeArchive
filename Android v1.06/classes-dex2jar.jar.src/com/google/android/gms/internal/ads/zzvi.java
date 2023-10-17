package com.google.android.gms.internal.ads;

import android.util.SparseArray;

final class zzvi
{
  private int zza;
  private final SparseArray zzb = new SparseArray();
  private final zzec zzc;
  
  public zzvi() {}
  
  public zzvi(zzec paramzzec)
  {
    this.zzc = paramzzec;
    this.zza = -1;
  }
  
  public final Object zza(int paramInt)
  {
    if (this.zza == -1) {}
    for (int i = 0;; i = this.zza - 1)
    {
      this.zza = i;
      i = this.zza;
      if ((i <= 0) || (paramInt >= this.zzb.keyAt(i))) {
        break;
      }
    }
    while ((this.zza < this.zzb.size() - 1) && (paramInt >= this.zzb.keyAt(this.zza + 1))) {
      this.zza += 1;
    }
    return this.zzb.valueAt(this.zza);
  }
  
  public final Object zzb()
  {
    SparseArray localSparseArray = this.zzb;
    return localSparseArray.valueAt(localSparseArray.size() - 1);
  }
  
  public final void zzc(int paramInt, Object paramObject)
  {
    int i = this.zza;
    boolean bool2 = true;
    boolean bool1;
    if (i == -1)
    {
      if (this.zzb.size() == 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      zzdy.zzf(bool1);
      this.zza = 0;
    }
    if (this.zzb.size() > 0)
    {
      SparseArray localSparseArray = this.zzb;
      i = localSparseArray.keyAt(localSparseArray.size() - 1);
      if (paramInt >= i) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      zzdy.zzd(bool1);
      if (i == paramInt)
      {
        localSparseArray = this.zzb;
        zzvb.zzl((zzuz)localSparseArray.valueAt(localSparseArray.size() - 1));
      }
    }
    this.zzb.append(paramInt, paramObject);
  }
  
  public final void zzd()
  {
    for (int i = 0; i < this.zzb.size(); i++) {
      zzvb.zzl((zzuz)this.zzb.valueAt(i));
    }
    this.zza = -1;
    this.zzb.clear();
  }
  
  public final void zze(int paramInt)
  {
    int j;
    for (int i = 0; i < this.zzb.size() - 1; i = j)
    {
      SparseArray localSparseArray = this.zzb;
      j = i + 1;
      if (paramInt < localSparseArray.keyAt(j)) {
        break;
      }
      zzvb.zzl((zzuz)this.zzb.valueAt(i));
      this.zzb.removeAt(i);
      i = this.zza;
      if (i > 0) {
        this.zza = (i - 1);
      }
    }
  }
  
  public final boolean zzf()
  {
    return this.zzb.size() == 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzvi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */