package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbin
  implements zzbii
{
  private final Context zza;
  
  public zzbin(Context paramContext)
  {
    this.zza = paramContext;
  }
  
  public final void zza(Object paramObject, Map paramMap)
  {
    if (!zzt.zzn().zzu(this.zza)) {
      return;
    }
    paramObject = (String)paramMap.get("eventName");
    paramMap = (String)paramMap.get("eventId");
    int i = ((String)paramObject).hashCode();
    if (i != 94399)
    {
      if (i != 94401)
      {
        if ((i == 94407) && (((String)paramObject).equals("_ai")))
        {
          i = 1;
          break label108;
        }
      }
      else if (((String)paramObject).equals("_ac"))
      {
        i = 0;
        break label108;
      }
    }
    else if (((String)paramObject).equals("_aa"))
    {
      i = 2;
      break label108;
    }
    i = -1;
    label108:
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          zzbzt.zzg("logScionEvent gmsg contained unsupported eventName");
          return;
        }
        zzt.zzn().zzk(this.zza, paramMap);
        return;
      }
      zzt.zzn().zzn(this.zza, paramMap);
      return;
    }
    zzt.zzn().zzm(this.zza, paramMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */