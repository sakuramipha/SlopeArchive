package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

final class zzbbh
  implements zzbdt
{
  final zzbbi zza;
  
  zzbbh(zzbbi paramzzbbi) {}
  
  public final Boolean zza(String paramString, boolean paramBoolean)
  {
    try
    {
      boolean bool = zzbbi.zza(this.zza).getBoolean(paramString, paramBoolean);
      return Boolean.valueOf(bool);
    }
    catch (ClassCastException localClassCastException) {}
    return Boolean.valueOf(zzbbi.zza(this.zza).getString(paramString, String.valueOf(paramBoolean)));
  }
  
  public final Double zzb(String paramString, double paramDouble)
  {
    try
    {
      double d = zzbbi.zza(this.zza).getFloat(paramString, (float)paramDouble);
      return Double.valueOf(d);
    }
    catch (ClassCastException localClassCastException) {}
    return Double.valueOf(zzbbi.zza(this.zza).getString(paramString, String.valueOf(paramDouble)));
  }
  
  public final Long zzc(String paramString, long paramLong)
  {
    try
    {
      long l = zzbbi.zza(this.zza).getLong(paramString, paramLong);
      return Long.valueOf(l);
    }
    catch (ClassCastException localClassCastException) {}
    return Long.valueOf(zzbbi.zza(this.zza).getInt(paramString, (int)paramLong));
  }
  
  public final String zzd(String paramString1, String paramString2)
  {
    return zzbbi.zza(this.zza).getString(paramString1, paramString2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbbh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */