package com.google.android.gms.internal.measurement;

public enum zznc
{
  private static final zznc[] zzj;
  private final Object zzk;
  
  static
  {
    zznc localzznc2 = new zznc("INT", 0, Integer.valueOf(0));
    zza = localzznc2;
    zznc localzznc6 = new zznc("LONG", 1, Long.valueOf(0L));
    zzb = localzznc6;
    zznc localzznc5 = new zznc("FLOAT", 2, Float.valueOf(0.0F));
    zzc = localzznc5;
    zznc localzznc1 = new zznc("DOUBLE", 3, Double.valueOf(0.0D));
    zzd = localzznc1;
    zznc localzznc3 = new zznc("BOOLEAN", 4, Boolean.valueOf(false));
    zze = localzznc3;
    zznc localzznc4 = new zznc("STRING", 5, "");
    zzf = localzznc4;
    zznc localzznc7 = new zznc("BYTE_STRING", 6, zzjb.zzb);
    zzg = localzznc7;
    zznc localzznc9 = new zznc("ENUM", 7, null);
    zzh = localzznc9;
    zznc localzznc8 = new zznc("MESSAGE", 8, null);
    zzi = localzznc8;
    zzj = new zznc[] { localzznc2, localzznc6, localzznc5, localzznc1, localzznc3, localzznc4, localzznc7, localzznc9, localzznc8 };
  }
  
  private zznc(Object paramObject)
  {
    this.zzk = paramObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zznc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */