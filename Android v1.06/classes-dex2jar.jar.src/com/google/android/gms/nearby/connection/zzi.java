package com.google.android.gms.nearby.connection;

public final class zzi
{
  private String zza;
  private String zzb;
  private byte[] zzc;
  private boolean zzd;
  private boolean zze;
  private byte[] zzf;
  
  public final zzi zza(String paramString)
  {
    this.zza = paramString;
    return this;
  }
  
  @Deprecated
  public final zzi zzb(String paramString)
  {
    this.zzb = paramString;
    return this;
  }
  
  public final zzi zzc(byte[] paramArrayOfByte)
  {
    this.zzc = paramArrayOfByte;
    return this;
  }
  
  public final zzi zzd(boolean paramBoolean)
  {
    this.zzd = paramBoolean;
    return this;
  }
  
  public final zzi zze(byte[] paramArrayOfByte)
  {
    this.zzf = paramArrayOfByte;
    return this;
  }
  
  @Deprecated
  public final zzi zzf(boolean paramBoolean)
  {
    this.zze = paramBoolean;
    return this;
  }
  
  public final ConnectionInfo zzg()
  {
    return new ConnectionInfo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */