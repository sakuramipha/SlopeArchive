package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzaqx
  extends zzapa
{
  public long zza = -1L;
  public long zzb = -1L;
  
  public zzaqx() {}
  
  public zzaqx(String paramString)
  {
    paramString = zza(paramString);
    if (paramString != null)
    {
      this.zza = ((Long)paramString.get(Integer.valueOf(0))).longValue();
      this.zzb = ((Long)paramString.get(Integer.valueOf(1))).longValue();
    }
  }
  
  protected final HashMap zzb()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), Long.valueOf(this.zza));
    localHashMap.put(Integer.valueOf(1), Long.valueOf(this.zzb));
    return localHashMap;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */