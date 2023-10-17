package com.google.android.gms.ads;

import java.util.Locale;

public class VersionInfo
{
  protected final int zza;
  protected final int zzb;
  protected final int zzc;
  
  public VersionInfo(int paramInt1, int paramInt2, int paramInt3)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramInt3;
  }
  
  public int getMajorVersion()
  {
    return this.zza;
  }
  
  public int getMicroVersion()
  {
    return this.zzc;
  }
  
  public int getMinorVersion()
  {
    return this.zzb;
  }
  
  public String toString()
  {
    return String.format(Locale.US, "%d.%d.%d", new Object[] { Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc) });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\VersionInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */