package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class zzfna
  extends zzfnm
{
  final zzfnb zza;
  private final zzfng zzb;
  
  zzfna(zzfnb paramzzfnb, zzfng paramzzfng)
  {
    this.zzb = paramzzfng;
  }
  
  public final void zzb(Bundle paramBundle)
  {
    int i = paramBundle.getInt("statusCode", 8150);
    String str = paramBundle.getString("sessionToken");
    paramBundle = zzfnf.zzc();
    paramBundle.zzb(i);
    if (str != null) {
      paramBundle.zza(str);
    }
    this.zzb.zza(paramBundle.zzc());
    if (i == 8157) {
      this.zza.zzc();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */