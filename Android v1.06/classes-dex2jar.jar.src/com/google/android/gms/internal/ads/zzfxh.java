package com.google.android.gms.internal.ads;

public final class zzfxh
{
  private final zzgjz zza;
  
  private zzfxh(zzgjz paramzzgjz)
  {
    this.zza = paramzzgjz;
  }
  
  public static zzfxh zzb(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    zzgjy localzzgjy = zzgjz.zza();
    localzzgjy.zzb(paramString);
    paramString = zzgno.zzb;
    localzzgjy.zzc(zzgno.zzv(paramArrayOfByte, 0, paramArrayOfByte.length));
    paramInt--;
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        paramString = zzgla.zzd;
      } else {
        paramString = zzgla.zzc;
      }
    }
    else {
      paramString = zzgla.zzb;
    }
    localzzgjy.zza(paramString);
    return new zzfxh((zzgjz)localzzgjy.zzal());
  }
  
  final zzgjz zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfxh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */