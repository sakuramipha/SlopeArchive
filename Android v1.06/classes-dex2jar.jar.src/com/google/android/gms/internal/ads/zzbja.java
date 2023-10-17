package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

public final class zzbja
  implements zzbii
{
  private final zzdsz zza;
  
  public zzbja(zzdsz paramzzdsz)
  {
    Preconditions.checkNotNull(paramzzdsz, "The Inspector Manager must not be null");
    this.zza = paramzzdsz;
  }
  
  public final void zza(Object paramObject, Map paramMap)
  {
    long l2;
    long l1;
    if ((paramMap != null) && (paramMap.containsKey("extras")))
    {
      boolean bool = paramMap.containsKey("expires");
      l2 = Long.MAX_VALUE;
      l1 = l2;
      if (!bool) {}
    }
    try
    {
      l1 = Long.parseLong((String)paramMap.get("expires"));
      this.zza.zzi((String)paramMap.get("extras"), l1);
      return;
    }
    catch (NumberFormatException paramObject)
    {
      for (;;)
      {
        l1 = l2;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */