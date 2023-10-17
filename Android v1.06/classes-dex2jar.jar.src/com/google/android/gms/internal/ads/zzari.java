package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzari
  extends zzapa
{
  public Long zza;
  public Boolean zzb;
  public Boolean zzc;
  
  public zzari() {}
  
  public zzari(String paramString)
  {
    paramString = zza(paramString);
    if (paramString != null)
    {
      this.zza = ((Long)paramString.get(Integer.valueOf(0)));
      this.zzb = ((Boolean)paramString.get(Integer.valueOf(1)));
      this.zzc = ((Boolean)paramString.get(Integer.valueOf(2)));
    }
  }
  
  protected final HashMap zzb()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), this.zza);
    localHashMap.put(Integer.valueOf(1), this.zzb);
    localHashMap.put(Integer.valueOf(2), this.zzc);
    return localHashMap;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzari.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */