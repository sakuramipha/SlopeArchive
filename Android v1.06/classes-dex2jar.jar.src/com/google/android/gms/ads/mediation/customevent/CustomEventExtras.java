package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;

@Deprecated
public final class CustomEventExtras
{
  private final HashMap zza = new HashMap();
  
  public Object getExtra(String paramString)
  {
    return this.zza.get(paramString);
  }
  
  public void setExtra(String paramString, Object paramObject)
  {
    this.zza.put(paramString, paramObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\customevent\CustomEventExtras.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */