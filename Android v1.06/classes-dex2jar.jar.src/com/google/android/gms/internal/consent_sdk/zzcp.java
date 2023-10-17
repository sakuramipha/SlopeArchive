package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzcp
{
  private final Context zza;
  private final Map zzb = new HashMap();
  
  public zzcp(Context paramContext)
  {
    this.zza = paramContext;
  }
  
  private final SharedPreferences.Editor zzd(String paramString)
  {
    if (!this.zzb.containsKey(paramString)) {
      this.zzb.put(paramString, this.zza.getSharedPreferences(paramString, 0).edit());
    }
    return (SharedPreferences.Editor)this.zzb.get(paramString);
  }
  
  public final void zzb()
  {
    Iterator localIterator = this.zzb.values().iterator();
    while (localIterator.hasNext()) {
      ((SharedPreferences.Editor)localIterator.next()).apply();
    }
  }
  
  public final boolean zzc(String paramString, Object paramObject)
  {
    zzco localzzco = zzcq.zza(this.zza, paramString);
    if (localzzco == null) {
      return false;
    }
    paramString = zzd(localzzco.zza);
    if ((paramObject instanceof Integer))
    {
      paramString.putInt(localzzco.zzb, ((Integer)paramObject).intValue());
    }
    else if ((paramObject instanceof Long))
    {
      paramString.putLong(localzzco.zzb, ((Long)paramObject).longValue());
    }
    else if ((paramObject instanceof Double))
    {
      paramString.putFloat(localzzco.zzb, ((Double)paramObject).floatValue());
    }
    else if ((paramObject instanceof Float))
    {
      paramString.putFloat(localzzco.zzb, ((Float)paramObject).floatValue());
    }
    else if ((paramObject instanceof Boolean))
    {
      paramString.putBoolean(localzzco.zzb, ((Boolean)paramObject).booleanValue());
    }
    else
    {
      if (!(paramObject instanceof String)) {
        break label188;
      }
      paramString.putString(localzzco.zzb, (String)paramObject);
    }
    return true;
    label188:
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */