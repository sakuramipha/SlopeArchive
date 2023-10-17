package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzabq
{
  public final int zza;
  public final byte[] zzb;
  public final int zzc;
  public final int zzd;
  
  public zzabq(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    this.zza = paramInt1;
    this.zzb = paramArrayOfByte;
    this.zzc = paramInt2;
    this.zzd = paramInt3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzabq)paramObject;
      if ((this.zza == ((zzabq)paramObject).zza) && (this.zzc == ((zzabq)paramObject).zzc) && (this.zzd == ((zzabq)paramObject).zzd) && (Arrays.equals(this.zzb, ((zzabq)paramObject).zzb))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((this.zza * 31 + Arrays.hashCode(this.zzb)) * 31 + this.zzc) * 31 + this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */