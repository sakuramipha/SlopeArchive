package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzapc
  extends zzapa
{
  public String zza;
  public long zzb;
  public String zzc;
  public String zzd;
  public String zze;
  
  public zzapc()
  {
    this.zza = "E";
    this.zzb = -1L;
    this.zzc = "E";
    this.zzd = "E";
    this.zze = "E";
  }
  
  public zzapc(String paramString)
  {
    String str = "E";
    this.zza = "E";
    long l = -1L;
    this.zzb = -1L;
    this.zzc = "E";
    this.zzd = "E";
    this.zze = "E";
    HashMap localHashMap = zza(paramString);
    if (localHashMap != null)
    {
      paramString = Integer.valueOf(0);
      if (localHashMap.get(paramString) == null) {
        paramString = "E";
      } else {
        paramString = (String)localHashMap.get(paramString);
      }
      this.zza = paramString;
      paramString = Integer.valueOf(1);
      if (localHashMap.get(paramString) != null) {
        l = ((Long)localHashMap.get(paramString)).longValue();
      }
      this.zzb = l;
      paramString = Integer.valueOf(2);
      if (localHashMap.get(paramString) == null) {
        paramString = "E";
      } else {
        paramString = (String)localHashMap.get(paramString);
      }
      this.zzc = paramString;
      paramString = Integer.valueOf(3);
      if (localHashMap.get(paramString) == null) {
        paramString = "E";
      } else {
        paramString = (String)localHashMap.get(paramString);
      }
      this.zzd = paramString;
      paramString = Integer.valueOf(4);
      if (localHashMap.get(paramString) == null) {
        paramString = str;
      } else {
        paramString = (String)localHashMap.get(paramString);
      }
      this.zze = paramString;
    }
  }
  
  protected final HashMap zzb()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), this.zza);
    localHashMap.put(Integer.valueOf(4), this.zze);
    localHashMap.put(Integer.valueOf(3), this.zzd);
    localHashMap.put(Integer.valueOf(2), this.zzc);
    localHashMap.put(Integer.valueOf(1), Long.valueOf(this.zzb));
    return localHashMap;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzapc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */