package com.google.android.gms.internal.ads;

public enum zzgpk
{
  private static final zzgpk[] zzk;
  private final Class zzl;
  private final Class zzm;
  private final Object zzn;
  
  static
  {
    zzgpk localzzgpk6 = new zzgpk("VOID", 0, Void.class, Void.class, null);
    zza = localzzgpk6;
    zzgpk localzzgpk1 = new zzgpk("INT", 1, Integer.TYPE, Integer.class, Integer.valueOf(0));
    zzb = localzzgpk1;
    zzgpk localzzgpk3 = new zzgpk("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0L));
    zzc = localzzgpk3;
    zzgpk localzzgpk4 = new zzgpk("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0F));
    zzd = localzzgpk4;
    zzgpk localzzgpk5 = new zzgpk("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0D));
    zze = localzzgpk5;
    zzgpk localzzgpk7 = new zzgpk("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.valueOf(false));
    zzf = localzzgpk7;
    zzgpk localzzgpk2 = new zzgpk("STRING", 6, String.class, String.class, "");
    zzg = localzzgpk2;
    zzgpk localzzgpk8 = new zzgpk("BYTE_STRING", 7, zzgno.class, zzgno.class, zzgno.zzb);
    zzh = localzzgpk8;
    zzgpk localzzgpk9 = new zzgpk("ENUM", 8, Integer.TYPE, Integer.class, null);
    zzi = localzzgpk9;
    zzgpk localzzgpk10 = new zzgpk("MESSAGE", 9, Object.class, Object.class, null);
    zzj = localzzgpk10;
    zzk = new zzgpk[] { localzzgpk6, localzzgpk1, localzzgpk3, localzzgpk4, localzzgpk5, localzzgpk7, localzzgpk2, localzzgpk8, localzzgpk9, localzzgpk10 };
  }
  
  private zzgpk(Class paramClass1, Class paramClass2, Object paramObject)
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */