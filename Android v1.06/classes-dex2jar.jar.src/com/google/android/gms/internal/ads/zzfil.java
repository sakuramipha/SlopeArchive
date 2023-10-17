package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class zzfil
  extends zzfig
{
  public zzfil(zzfhz paramzzfhz, HashSet paramHashSet, JSONObject paramJSONObject, long paramLong)
  {
    super(paramzzfhz, paramHashSet, paramJSONObject, paramLong);
  }
  
  protected final void zza(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      Object localObject = zzfhd.zza();
      if (localObject != null)
      {
        Iterator localIterator = ((zzfhd)localObject).zzc().iterator();
        while (localIterator.hasNext())
        {
          localObject = (zzfgs)localIterator.next();
          if (this.zza.contains(((zzfgs)localObject).zzh())) {
            ((zzfgs)localObject).zzg().zze(paramString, this.zzc);
          }
        }
      }
    }
    super.zza(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */