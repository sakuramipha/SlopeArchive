package com.google.android.gms.internal.ads;

final class zzfiz
  extends zzfiv
{
  private final String zza;
  private final boolean zzb;
  private final boolean zzc;
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzfiv))
    {
      paramObject = (zzfiv)paramObject;
      if ((this.zza.equals(((zzfiv)paramObject).zzb())) && (this.zzb == ((zzfiv)paramObject).zzd()) && (this.zzc == ((zzfiv)paramObject).zzc())) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int k = this.zza.hashCode();
    boolean bool = this.zzb;
    int j = 1237;
    int i;
    if (true != bool) {
      i = 1237;
    } else {
      i = 1231;
    }
    if (true == this.zzc) {
      j = 1231;
    }
    return ((k ^ 0xF4243) * 1000003 ^ i) * 1000003 ^ j;
  }
  
  public final String toString()
  {
    String str = this.zza;
    boolean bool2 = this.zzb;
    boolean bool1 = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdShield2Options{clientVersion=");
    localStringBuilder.append(str);
    localStringBuilder.append(", shouldGetAdvertisingId=");
    localStringBuilder.append(bool2);
    localStringBuilder.append(", isGooglePlayServicesAvailable=");
    localStringBuilder.append(bool1);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final String zzb()
  {
    return this.zza;
  }
  
  public final boolean zzc()
  {
    return this.zzc;
  }
  
  public final boolean zzd()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfiz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */