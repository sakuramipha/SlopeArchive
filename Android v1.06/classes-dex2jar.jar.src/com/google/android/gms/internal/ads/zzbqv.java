package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbqv
  extends zzbqy
{
  private final Map zza;
  private final Context zzb;
  
  public zzbqv(zzcfb paramzzcfb, Map paramMap)
  {
    super(paramzzcfb, "storePicture");
    this.zza = paramMap;
    this.zzb = paramzzcfb.zzi();
  }
  
  public final void zzb()
  {
    if (this.zzb == null)
    {
      zzg("Activity context is not available");
      return;
    }
    zzt.zzp();
    if (!new zzbau(this.zzb).zzc())
    {
      zzg("Feature is not supported by the device.");
      return;
    }
    String str2 = (String)this.zza.get("iurl");
    if (TextUtils.isEmpty(str2))
    {
      zzg("Image url cannot be empty.");
      return;
    }
    if (URLUtil.isValidUrl(str2))
    {
      String str3 = Uri.parse(str2).getLastPathSegment();
      zzt.zzp();
      if ((!TextUtils.isEmpty(str3)) && (str3.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")))
      {
        Resources localResources = zzt.zzo().zzd();
        zzt.zzp();
        AlertDialog.Builder localBuilder = zzs.zzG(this.zzb);
        String str1;
        if (localResources != null) {
          str1 = localResources.getString(R.string.s1);
        } else {
          str1 = "Save image";
        }
        localBuilder.setTitle(str1);
        if (localResources != null) {
          str1 = localResources.getString(R.string.s2);
        } else {
          str1 = "Allow Ad to store image in Picture gallery?";
        }
        localBuilder.setMessage(str1);
        if (localResources != null) {
          str1 = localResources.getString(R.string.s3);
        } else {
          str1 = "Accept";
        }
        localBuilder.setPositiveButton(str1, new zzbqt(this, str2, str3));
        if (localResources != null) {
          str1 = localResources.getString(R.string.s4);
        } else {
          str1 = "Decline";
        }
        localBuilder.setNegativeButton(str1, new zzbqu(this));
        localBuilder.create().show();
        return;
      }
      zzg("Image type not recognized: ".concat(String.valueOf(str3)));
      return;
    }
    zzg("Invalid image url: ".concat(String.valueOf(str2)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */