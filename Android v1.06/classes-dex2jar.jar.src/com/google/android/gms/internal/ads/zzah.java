package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

public final class zzah
{
  private final SparseBooleanArray zza;
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzah)) {
      return false;
    }
    paramObject = (zzah)paramObject;
    if (zzfn.zza < 24)
    {
      if (this.zza.size() == ((zzah)paramObject).zza.size())
      {
        for (int i = 0; i < this.zza.size(); i++) {
          if (zza(i) != ((zzah)paramObject).zza(i)) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
    return this.zza.equals(((zzah)paramObject).zza);
  }
  
  public final int hashCode()
  {
    if (zzfn.zza < 24)
    {
      int j = 0;
      int i = this.zza.size();
      while (j < this.zza.size())
      {
        i = i * 31 + zza(j);
        j++;
      }
      return i;
    }
    return this.zza.hashCode();
  }
  
  public final int zza(int paramInt)
  {
    zzdy.zza(paramInt, 0, this.zza.size());
    return this.zza.keyAt(paramInt);
  }
  
  public final int zzb()
  {
    return this.zza.size();
  }
  
  public final boolean zzc(int paramInt)
  {
    return this.zza.get(paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */