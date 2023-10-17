package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzdp
{
  public static final zzdp zza = new zzdp(-1, -1, -1);
  public final int zzb;
  public final int zzc;
  public final int zzd;
  public final int zze;
  
  public zzdp(int paramInt1, int paramInt2, int paramInt3)
  {
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    this.zzd = paramInt3;
    if (zzfn.zzC(paramInt3)) {
      paramInt1 = zzfn.zzk(paramInt3, paramInt2);
    } else {
      paramInt1 = -1;
    }
    this.zze = paramInt1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzdp)) {
      return false;
    }
    paramObject = (zzdp)paramObject;
    return (this.zzb == ((zzdp)paramObject).zzb) && (this.zzc == ((zzdp)paramObject).zzc) && (this.zzd == ((zzdp)paramObject).zzd);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd) });
  }
  
  public final String toString()
  {
    int k = this.zzb;
    int i = this.zzc;
    int j = this.zzd;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AudioFormat[sampleRate=");
    localStringBuilder.append(k);
    localStringBuilder.append(", channelCount=");
    localStringBuilder.append(i);
    localStringBuilder.append(", encoding=");
    localStringBuilder.append(j);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */