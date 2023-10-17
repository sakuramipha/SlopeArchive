package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzdvc
  implements zzfvn
{
  final zzdvd zza;
  
  zzdvc(zzdvd paramzzdvd) {}
  
  public final void zza(Throwable paramThrowable)
  {
    zzbbc localzzbbc = zzbbk.zzfU;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      paramThrowable = zzdvd.zzd().matcher(paramThrowable.getMessage());
      if (paramThrowable.matches())
      {
        paramThrowable = paramThrowable.group(1);
        zzdvd.zza(this.zza).zzi(Integer.parseInt(paramThrowable));
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdvc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */