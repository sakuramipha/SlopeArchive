package com.google.android.gms.internal.play_billing;

 enum zza
{
  private static final zzx zzo;
  private static final zza[] zzp;
  private final int zzq;
  
  static
  {
    zza localzza10 = new zza("RESPONSE_CODE_UNSPECIFIED", 0, 64537);
    zza = localzza10;
    zza localzza3 = new zza("SERVICE_TIMEOUT", 1, -3);
    zzb = localzza3;
    zza localzza2 = new zza("FEATURE_NOT_SUPPORTED", 2, -2);
    zzc = localzza2;
    zza localzza7 = new zza("SERVICE_DISCONNECTED", 3, -1);
    zzd = localzza7;
    Object localObject2 = new zza("OK", 4, 0);
    zze = (zza)localObject2;
    Object localObject1 = new zza("USER_CANCELED", 5, 1);
    zzf = (zza)localObject1;
    zza localzza12 = new zza("SERVICE_UNAVAILABLE", 6, 2);
    zzg = localzza12;
    zza localzza11 = new zza("BILLING_UNAVAILABLE", 7, 3);
    zzh = localzza11;
    zza localzza1 = new zza("ITEM_UNAVAILABLE", 8, 4);
    zzi = localzza1;
    zza localzza4 = new zza("DEVELOPER_ERROR", 9, 5);
    zzj = localzza4;
    zza localzza8 = new zza("ERROR", 10, 6);
    zzk = localzza8;
    zza localzza5 = new zza("ITEM_ALREADY_OWNED", 11, 7);
    zzl = localzza5;
    zza localzza9 = new zza("ITEM_NOT_OWNED", 12, 8);
    zzm = localzza9;
    zza localzza6 = new zza("EXPIRED_OFFER_TOKEN", 13, 11);
    zzn = localzza6;
    int i = 0;
    zzp = new zza[] { localzza10, localzza3, localzza2, localzza7, localObject2, localObject1, localzza12, localzza11, localzza1, localzza4, localzza8, localzza5, localzza9, localzza6 };
    localObject1 = new zzw();
    localObject2 = values();
    int j = localObject2.length;
    while (i < j)
    {
      localzza1 = localObject2[i];
      ((zzw)localObject1).zza(Integer.valueOf(localzza1.zzq), localzza1);
      i++;
    }
    zzo = ((zzw)localObject1).zzb();
  }
  
  private zza(int paramInt1)
  {
    this.zzq = paramInt1;
  }
  
  static zza zza(int paramInt)
  {
    zzx localzzx = zzo;
    Integer localInteger = Integer.valueOf(paramInt);
    if (!localzzx.containsKey(localInteger)) {
      return zza;
    }
    return (zza)localzzx.get(localInteger);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */