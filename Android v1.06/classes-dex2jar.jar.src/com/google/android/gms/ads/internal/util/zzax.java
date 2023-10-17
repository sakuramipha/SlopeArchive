package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzale;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzalr;
import com.google.android.gms.internal.ads.zzalw;
import com.google.android.gms.internal.ads.zzalx;
import com.google.android.gms.internal.ads.zzame;
import com.google.android.gms.internal.ads.zzami;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbkd;
import com.google.android.gms.internal.ads.zzbzm;
import java.io.File;
import java.util.regex.Pattern;

public final class zzax
  extends zzalx
{
  private final Context zzc;
  
  private zzax(Context paramContext, zzalw paramzzalw)
  {
    super(paramzzalw);
    this.zzc = paramContext;
  }
  
  public static zzall zzb(Context paramContext)
  {
    zzax localzzax = new zzax(paramContext, new zzami());
    paramContext = new zzall(new zzame(new File(paramContext.getCacheDir(), "admob_volley"), 20971520), localzzax, 4);
    paramContext.zzd();
    return paramContext;
  }
  
  public final zzale zza(zzali paramzzali)
    throws zzalr
  {
    if (paramzzali.zza() == 0)
    {
      Object localObject = paramzzali.zzk();
      zzbbc localzzbbc = zzbbk.zzeh;
      if (Pattern.matches((String)zzba.zzc().zzb(localzzbbc), (CharSequence)localObject))
      {
        zzay.zzb();
        if (zzbzm.zzs(this.zzc, 13400000))
        {
          localObject = new zzbkd(this.zzc).zza(paramzzali);
          if (localObject != null)
          {
            zze.zza("Got gmscore asset response: ".concat(String.valueOf(paramzzali.zzk())));
            return (zzale)localObject;
          }
          zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(paramzzali.zzk())));
        }
      }
    }
    return super.zza(paramzzali);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */