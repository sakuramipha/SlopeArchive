package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Objects;

final class zzfmi
  extends zzfnc
{
  private IBinder zza;
  private String zzb;
  private int zzc;
  private float zzd;
  private int zze;
  private String zzf;
  private byte zzg;
  
  public final zzfnc zza(String paramString)
  {
    this.zzf = paramString;
    return this;
  }
  
  public final zzfnc zzb(String paramString)
  {
    this.zzb = paramString;
    return this;
  }
  
  public final zzfnc zzc(int paramInt)
  {
    this.zzg = ((byte)(this.zzg | 0x8));
    return this;
  }
  
  public final zzfnc zzd(int paramInt)
  {
    this.zzc = paramInt;
    this.zzg = ((byte)(this.zzg | 0x2));
    return this;
  }
  
  public final zzfnc zze(float paramFloat)
  {
    this.zzd = paramFloat;
    this.zzg = ((byte)(this.zzg | 0x4));
    return this;
  }
  
  public final zzfnc zzf(boolean paramBoolean)
  {
    this.zzg = ((byte)(this.zzg | 0x1));
    return this;
  }
  
  public final zzfnc zzg(IBinder paramIBinder)
  {
    Objects.requireNonNull(paramIBinder, "Null windowToken");
    this.zza = paramIBinder;
    return this;
  }
  
  public final zzfnc zzh(int paramInt)
  {
    this.zze = paramInt;
    this.zzg = ((byte)(this.zzg | 0x10));
    return this;
  }
  
  public final zzfnd zzi()
  {
    if (this.zzg == 31)
    {
      localObject = this.zza;
      if (localObject != null) {
        return new zzfmk((IBinder)localObject, false, this.zzb, this.zzc, this.zzd, 0, null, this.zze, this.zzf, null);
      }
    }
    Object localObject = new StringBuilder();
    if (this.zza == null) {
      ((StringBuilder)localObject).append(" windowToken");
    }
    if ((this.zzg & 0x1) == 0) {
      ((StringBuilder)localObject).append(" stableSessionToken");
    }
    if ((this.zzg & 0x2) == 0) {
      ((StringBuilder)localObject).append(" layoutGravity");
    }
    if ((this.zzg & 0x4) == 0) {
      ((StringBuilder)localObject).append(" layoutVerticalMargin");
    }
    if ((this.zzg & 0x8) == 0) {
      ((StringBuilder)localObject).append(" displayMode");
    }
    if ((this.zzg & 0x10) == 0) {
      ((StringBuilder)localObject).append(" windowWidthPx");
    }
    throw new IllegalStateException("Missing required properties:".concat(localObject.toString()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfmi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */