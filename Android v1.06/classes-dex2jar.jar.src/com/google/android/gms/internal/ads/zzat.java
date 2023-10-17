package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public final class zzat
{
  private String zza;
  private Uri zzb;
  private final zzav zzc = new zzav();
  private final zzbb zzd = new zzbb(null);
  private final List zze = Collections.emptyList();
  private final zzfrr zzf = zzfrr.zzl();
  private final zzbe zzg = new zzbe();
  private final zzbn zzh = zzbn.zza;
  
  public final zzat zza(String paramString)
  {
    this.zza = paramString;
    return this;
  }
  
  public final zzat zzb(Uri paramUri)
  {
    this.zzb = paramUri;
    return this;
  }
  
  public final zzbq zzc()
  {
    Object localObject = this.zzb;
    if (localObject != null) {
      localObject = new zzbk((Uri)localObject, null, null, null, this.zze, null, this.zzf, null, null);
    } else {
      localObject = null;
    }
    String str2 = this.zza;
    String str1 = str2;
    if (str2 == null) {
      str1 = "";
    }
    return new zzbq(str1, new zzaz(this.zzc, null), (zzbk)localObject, new zzbg(this.zzg, null), zzbw.zza, this.zzh, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */