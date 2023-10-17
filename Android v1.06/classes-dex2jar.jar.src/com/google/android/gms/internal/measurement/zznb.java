package com.google.android.gms.internal.measurement;

public enum zznb
{
  private static final zznb[] zzs;
  private final zznc zzt;
  
  static
  {
    zznb localzznb3 = new zznb("DOUBLE", 0, zznc.zzd, 1);
    zza = localzznb3;
    zznb localzznb12 = new zznb("FLOAT", 1, zznc.zzc, 5);
    zzb = localzznb12;
    zznb localzznb8 = new zznb("INT64", 2, zznc.zzb, 0);
    zzc = localzznb8;
    zznb localzznb9 = new zznb("UINT64", 3, zznc.zzb, 0);
    zzd = localzznb9;
    zznb localzznb5 = new zznb("INT32", 4, zznc.zza, 0);
    zze = localzznb5;
    zznb localzznb16 = new zznb("FIXED64", 5, zznc.zzb, 1);
    zzf = localzznb16;
    zznb localzznb6 = new zznb("FIXED32", 6, zznc.zza, 5);
    zzg = localzznb6;
    zznb localzznb13 = new zznb("BOOL", 7, zznc.zze, 0);
    zzh = localzznb13;
    zznb localzznb4 = new zznb("STRING", 8, zznc.zzf, 2);
    zzi = localzznb4;
    zznb localzznb14 = new zznb("GROUP", 9, zznc.zzi, 3);
    zzj = localzznb14;
    zznb localzznb10 = new zznb("MESSAGE", 10, zznc.zzi, 2);
    zzk = localzznb10;
    zznb localzznb1 = new zznb("BYTES", 11, zznc.zzg, 2);
    zzl = localzznb1;
    zznb localzznb17 = new zznb("UINT32", 12, zznc.zza, 0);
    zzm = localzznb17;
    zznb localzznb15 = new zznb("ENUM", 13, zznc.zzh, 0);
    zzn = localzznb15;
    zznb localzznb18 = new zznb("SFIXED32", 14, zznc.zza, 5);
    zzo = localzznb18;
    zznb localzznb2 = new zznb("SFIXED64", 15, zznc.zzb, 1);
    zzp = localzznb2;
    zznb localzznb11 = new zznb("SINT32", 16, zznc.zza, 0);
    zzq = localzznb11;
    zznb localzznb7 = new zznb("SINT64", 17, zznc.zzb, 0);
    zzr = localzznb7;
    zzs = new zznb[] { localzznb3, localzznb12, localzznb8, localzznb9, localzznb5, localzznb16, localzznb6, localzznb13, localzznb4, localzznb14, localzznb10, localzznb1, localzznb17, localzznb15, localzznb18, localzznb2, localzznb11, localzznb7 };
  }
  
  private zznb(zznc paramzznc, int paramInt1)
  {
    this.zzt = paramzznc;
  }
  
  public final zznc zza()
  {
    return this.zzt;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zznb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */