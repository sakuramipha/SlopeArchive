package com.google.android.gms.internal.measurement;

public enum zzkn
{
  private static final zzkn[] zzk;
  private final Class zzl;
  private final Class zzm;
  private final Object zzn;
  
  static
  {
    zzkn localzzkn3 = new zzkn("VOID", 0, Void.class, Void.class, null);
    zza = localzzkn3;
    zzkn localzzkn5 = new zzkn("INT", 1, Integer.TYPE, Integer.class, Integer.valueOf(0));
    zzb = localzzkn5;
    zzkn localzzkn2 = new zzkn("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0L));
    zzc = localzzkn2;
    zzkn localzzkn10 = new zzkn("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0F));
    zzd = localzzkn10;
    zzkn localzzkn8 = new zzkn("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0D));
    zze = localzzkn8;
    zzkn localzzkn1 = new zzkn("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.valueOf(false));
    zzf = localzzkn1;
    zzkn localzzkn9 = new zzkn("STRING", 6, String.class, String.class, "");
    zzg = localzzkn9;
    zzkn localzzkn7 = new zzkn("BYTE_STRING", 7, zzjb.class, zzjb.class, zzjb.zzb);
    zzh = localzzkn7;
    zzkn localzzkn6 = new zzkn("ENUM", 8, Integer.TYPE, Integer.class, null);
    zzi = localzzkn6;
    zzkn localzzkn4 = new zzkn("MESSAGE", 9, Object.class, Object.class, null);
    zzj = localzzkn4;
    zzk = new zzkn[] { localzzkn3, localzzkn5, localzzkn2, localzzkn10, localzzkn8, localzzkn1, localzzkn9, localzzkn7, localzzkn6, localzzkn4 };
  }
  
  private zzkn(Class paramClass1, Class paramClass2, Object paramObject)
  {
    this.zzl = paramClass1;
    this.zzm = paramClass2;
    this.zzn = paramObject;
  }
  
  public final Class zza()
  {
    return this.zzm;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzkn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */