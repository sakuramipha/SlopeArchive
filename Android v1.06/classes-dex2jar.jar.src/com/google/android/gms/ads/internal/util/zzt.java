package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzawx;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcgf;
import java.io.InputStream;
import java.util.Map;

public class zzt
  extends zzaa
{
  public zzt()
  {
    super(null);
  }
  
  public final int zza()
  {
    return 16974374;
  }
  
  public final CookieManager zzb(Context paramContext)
  {
    com.google.android.gms.ads.internal.zzt.zzp();
    if (zzs.zzB()) {
      return null;
    }
    try
    {
      paramContext = CookieManager.getInstance();
      return paramContext;
    }
    finally
    {
      zzbzt.zzh("Failed to obtain CookieManager.", paramContext);
      com.google.android.gms.ads.internal.zzt.zzo().zzu(paramContext, "ApiLevelUtil.getCookieManager");
    }
    return null;
  }
  
  public final WebResourceResponse zzc(String paramString1, String paramString2, int paramInt, String paramString3, Map paramMap, InputStream paramInputStream)
  {
    return new WebResourceResponse(paramString1, paramString2, paramInt, paramString3, paramMap, paramInputStream);
  }
  
  public final zzcfi zzd(zzcfb paramzzcfb, zzawx paramzzawx, boolean paramBoolean)
  {
    return new zzcgf(paramzzcfb, paramzzawx, paramBoolean);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */