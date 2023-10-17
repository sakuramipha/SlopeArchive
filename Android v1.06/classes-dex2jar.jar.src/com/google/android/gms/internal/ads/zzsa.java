package com.google.android.gms.internal.ads;

import android.text.TextUtils;

final class zzsa
{
  public final String zza;
  public final boolean zzb;
  public final boolean zzc;
  
  public zzsa(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zza = paramString;
    this.zzb = paramBoolean1;
    this.zzc = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == zzsa.class))
    {
      paramObject = (zzsa)paramObject;
      if ((TextUtils.equals(this.zza, ((zzsa)paramObject).zza)) && (this.zzb == ((zzsa)paramObject).zzb) && (this.zzc == ((zzsa)paramObject).zzc)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int k = this.zza.hashCode();
    boolean bool = this.zzb;
    int j = 1237;
    int i;
    if (true != bool) {
      i = 1237;
    } else {
      i = 1231;
    }
    if (true == this.zzc) {
      j = 1231;
    }
    return ((k + 31) * 31 + i) * 31 + j;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */