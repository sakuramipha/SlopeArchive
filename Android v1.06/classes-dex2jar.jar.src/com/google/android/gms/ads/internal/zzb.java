package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbwr;
import com.google.android.gms.internal.ads.zzbwu;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzb
{
  private final Context zza;
  private boolean zzb;
  private final zzbwu zzc;
  private final zzbtm zzd;
  
  public zzb(Context paramContext, zzbwu paramzzbwu, zzbtm paramzzbtm)
  {
    this.zza = paramContext;
    this.zzc = paramzzbwu;
    this.zzd = new zzbtm(false, Collections.emptyList());
  }
  
  private final boolean zzd()
  {
    zzbwu localzzbwu = this.zzc;
    return ((localzzbwu != null) && (localzzbwu.zza().zzf)) || (this.zzd.zza);
  }
  
  public final void zza()
  {
    this.zzb = true;
  }
  
  public final void zzb(String paramString)
  {
    if (!zzd()) {
      return;
    }
    String str1 = paramString;
    if (paramString == null) {
      str1 = "";
    }
    paramString = this.zzc;
    if (paramString != null)
    {
      paramString.zzd(str1, null, 3);
      return;
    }
    paramString = this.zzd;
    if (paramString.zza)
    {
      paramString = paramString.zzb;
      if (paramString != null)
      {
        paramString = paramString.iterator();
        while (paramString.hasNext())
        {
          String str2 = (String)paramString.next();
          if (!TextUtils.isEmpty(str2))
          {
            str2 = str2.replace("{NAVIGATION_URL}", Uri.encode(str1));
            zzt.zzp();
            zzs.zzH(this.zza, "", str2);
          }
        }
      }
    }
  }
  
  public final boolean zzc()
  {
    return (!zzd()) || (this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */