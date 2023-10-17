package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;

public final class zzbw
  extends WebView
{
  private final Handler zza;
  private final zzcc zzb;
  private boolean zzc = false;
  
  public zzbw(zzby paramzzby, Handler paramHandler, zzcc paramzzcc)
  {
    super(paramzzby);
    this.zza = paramHandler;
    this.zzb = paramzzcc;
  }
  
  public final void zzc(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append("(");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(");");
    paramString1 = localStringBuilder.toString();
    this.zza.post(new zzbt(this, paramString1));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */