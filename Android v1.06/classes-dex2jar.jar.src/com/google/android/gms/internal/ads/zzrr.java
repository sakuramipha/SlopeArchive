package com.google.android.gms.internal.ads;

public final class zzrr
  extends Exception
{
  public final String zza;
  public final boolean zzb;
  public final zzrp zzc;
  public final String zzd;
  public final zzrr zze;
  
  public zzrr(zzam paramzzam, Throwable paramThrowable, boolean paramBoolean, int paramInt)
  {
    this(str, paramThrowable, (String)localObject, false, null, paramzzam.toString(), null);
  }
  
  public zzrr(zzam paramzzam, Throwable paramThrowable, boolean paramBoolean, zzrp paramzzrp)
  {
    this((String)localObject, paramThrowable, str1, false, paramzzrp, paramzzam, null);
  }
  
  private zzrr(String paramString1, Throwable paramThrowable, String paramString2, boolean paramBoolean, zzrp paramzzrp, String paramString3, zzrr paramzzrr)
  {
    super(paramString1, paramThrowable);
    this.zza = paramString2;
    this.zzb = false;
    this.zzc = paramzzrp;
    this.zzd = paramString3;
    this.zze = paramzzrr;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */