package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzfgq
{
  private final zzfgx zza;
  private final WebView zzb;
  private final List zzc = new ArrayList();
  private final Map zzd = new HashMap();
  private final String zze;
  private final String zzf;
  private final zzfgr zzg;
  
  private zzfgq(zzfgx paramzzfgx, WebView paramWebView, String paramString1, List paramList, String paramString2, String paramString3, zzfgr paramzzfgr)
  {
    this.zza = paramzzfgx;
    this.zzb = paramWebView;
    this.zzg = paramzzfgr;
    this.zzf = paramString2;
    this.zze = "";
  }
  
  public static zzfgq zzb(zzfgx paramzzfgx, WebView paramWebView, String paramString1, String paramString2)
  {
    return new zzfgq(paramzzfgx, paramWebView, null, null, paramString1, "", zzfgr.zza);
  }
  
  public static zzfgq zzc(zzfgx paramzzfgx, WebView paramWebView, String paramString1, String paramString2)
  {
    return new zzfgq(paramzzfgx, paramWebView, null, null, paramString1, "", zzfgr.zzc);
  }
  
  public final WebView zza()
  {
    return this.zzb;
  }
  
  public final zzfgr zzd()
  {
    return this.zzg;
  }
  
  public final zzfgx zze()
  {
    return this.zza;
  }
  
  public final String zzf()
  {
    return this.zzf;
  }
  
  public final String zzg()
  {
    return this.zze;
  }
  
  public final List zzh()
  {
    return Collections.unmodifiableList(this.zzc);
  }
  
  public final Map zzi()
  {
    return Collections.unmodifiableMap(this.zzd);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */