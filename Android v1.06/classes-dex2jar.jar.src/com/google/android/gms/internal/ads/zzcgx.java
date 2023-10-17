package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class zzcgx
{
  private zzbzz zza;
  private Context zzb;
  private WeakReference zzc;
  
  public final zzcgx zzc(Context paramContext)
  {
    this.zzc = new WeakReference(paramContext);
    Context localContext = paramContext;
    if (paramContext.getApplicationContext() != null) {
      localContext = paramContext.getApplicationContext();
    }
    this.zzb = localContext;
    return this;
  }
  
  public final zzcgx zzd(zzbzz paramzzbzz)
  {
    this.zza = paramzzbzz;
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcgx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */