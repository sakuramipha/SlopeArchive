package com.google.android.gms.internal.ads;

import java.util.Objects;

final class zzfix
  extends zzfiu
{
  private String zza;
  private boolean zzb;
  private boolean zzc;
  private byte zzd;
  
  public final zzfiu zza(String paramString)
  {
    Objects.requireNonNull(paramString, "Null clientVersion");
    this.zza = paramString;
    return this;
  }
  
  public final zzfiu zzb(boolean paramBoolean)
  {
    this.zzc = true;
    this.zzd = ((byte)(this.zzd | 0x2));
    return this;
  }
  
  public final zzfiu zzc(boolean paramBoolean)
  {
    this.zzb = paramBoolean;
    this.zzd = ((byte)(this.zzd | 0x1));
    return this;
  }
  
  public final zzfiv zzd()
  {
    if (this.zzd == 3)
    {
      localObject = this.zza;
      if (localObject != null) {
        return new zzfiz((String)localObject, this.zzb, this.zzc, null);
      }
    }
    Object localObject = new StringBuilder();
    if (this.zza == null) {
      ((StringBuilder)localObject).append(" clientVersion");
    }
    if ((this.zzd & 0x1) == 0) {
      ((StringBuilder)localObject).append(" shouldGetAdvertisingId");
    }
    if ((this.zzd & 0x2) == 0) {
      ((StringBuilder)localObject).append(" isGooglePlayServicesAvailable");
    }
    throw new IllegalStateException("Missing required properties:".concat(localObject.toString()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */