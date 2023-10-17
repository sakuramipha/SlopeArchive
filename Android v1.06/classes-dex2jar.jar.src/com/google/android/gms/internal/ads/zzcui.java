package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

final class zzcui
  implements zzcww, zzcwd
{
  private final Context zza;
  private final zzezf zzb;
  private final zzbsa zzc;
  
  public zzcui(Context paramContext, zzezf paramzzezf, zzbsa paramzzbsa)
  {
    this.zza = paramContext;
    this.zzb = paramzzezf;
    this.zzc = paramzzbsa;
  }
  
  public final void zzbn(Context paramContext) {}
  
  public final void zzbp(Context paramContext) {}
  
  public final void zzbq(Context paramContext) {}
  
  public final void zzn()
  {
    Object localObject = this.zzb.zzae;
    if ((localObject != null) && (((zzbsb)localObject).zza))
    {
      localObject = new ArrayList();
      if (!this.zzb.zzae.zzb.isEmpty()) {
        ((ArrayList)localObject).add(this.zzb.zzae.zzb);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */