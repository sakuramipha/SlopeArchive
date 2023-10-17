package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

public final class zzdiz
  implements zzcwc
{
  private final zzdhc zza;
  private final zzdhh zzb;
  
  public zzdiz(zzdhc paramzzdhc, zzdhh paramzzdhh)
  {
    this.zza = paramzzdhc;
    this.zzb = paramzzdhh;
  }
  
  public final void zzl()
  {
    Object localObject2 = this.zza;
    if (((zzdhc)localObject2).zzt() == null) {
      return;
    }
    Object localObject1 = ((zzdhc)localObject2).zzq();
    localObject2 = ((zzdhc)localObject2).zzr();
    if (localObject1 == null) {
      if (localObject2 == null) {
        localObject1 = null;
      } else {
        localObject1 = localObject2;
      }
    }
    if ((this.zzb.zzd()) && (localObject1 != null)) {
      ((zzcfb)localObject1).zzd("onSdkImpression", new ArrayMap());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdiz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */