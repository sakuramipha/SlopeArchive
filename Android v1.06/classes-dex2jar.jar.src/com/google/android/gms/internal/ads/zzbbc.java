package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

public abstract class zzbbc
{
  private final int zza;
  private final String zzb;
  private final Object zzc;
  
  public static zzbbc zzf(int paramInt, String paramString, float paramFloat)
  {
    return new zzbaz(1, paramString, Float.valueOf(paramFloat));
  }
  
  public static zzbbc zzg(int paramInt1, String paramString, int paramInt2)
  {
    return new zzbax(1, paramString, Integer.valueOf(paramInt2));
  }
  
  public static zzbbc zzh(int paramInt, String paramString, long paramLong)
  {
    return new zzbay(1, paramString, Long.valueOf(paramLong));
  }
  
  public static zzbbc zzi(int paramInt, String paramString, Boolean paramBoolean)
  {
    return new zzbaw(paramInt, paramString, paramBoolean);
  }
  
  public static zzbbc zzj(int paramInt, String paramString1, String paramString2)
  {
    return new zzbba(1, paramString1, paramString2);
  }
  
  public static zzbbc zzk(int paramInt, String paramString)
  {
    paramString = zzj(1, "gads:sdk_core_constants:experiment_id", null);
    zzba.zza().zzc(paramString);
    return paramString;
  }
  
  protected abstract Object zza(JSONObject paramJSONObject);
  
  public abstract Object zzb(Bundle paramBundle);
  
  protected abstract Object zzc(SharedPreferences paramSharedPreferences);
  
  public abstract void zzd(SharedPreferences.Editor paramEditor, Object paramObject);
  
  public final int zze()
  {
    return this.zza;
  }
  
  public final Object zzl()
  {
    return zzba.zzc().zzb(this);
  }
  
  public final Object zzm()
  {
    return this.zzc;
  }
  
  public final String zzn()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbbc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */