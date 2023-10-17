package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

final class zzbqo
  implements DialogInterface.OnClickListener
{
  final zzbqq zza;
  
  zzbqo(zzbqq paramzzbqq) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.zza.zzb();
    zzt.zzp();
    zzs.zzP(zzbqq.zza(this.zza), paramDialogInterface);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */