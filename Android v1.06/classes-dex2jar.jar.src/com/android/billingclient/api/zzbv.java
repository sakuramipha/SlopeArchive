package com.android.billingclient.api;

import android.text.TextUtils;

public final class zzbv
{
  private String zza;
  
  public final zzbv zza(String paramString)
  {
    this.zza = paramString;
    return this;
  }
  
  public final zzbx zzb()
  {
    if (!TextUtils.isEmpty(this.zza)) {
      return new zzbx(this.zza, null, null, 0, null);
    }
    throw new IllegalArgumentException("SKU must be set.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zzbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */