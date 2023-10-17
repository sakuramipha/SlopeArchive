package com.google.android.gms.internal.ads;

final class zzfmh
  extends zzfms
{
  private final String zza;
  private final String zzb;
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzfms))
    {
      paramObject = (zzfms)paramObject;
      String str = this.zza;
      if (str == null ? ((zzfms)paramObject).zzb() == null : str.equals(((zzfms)paramObject).zzb()))
      {
        str = this.zzb;
        if (str == null ? ((zzfms)paramObject).zza() == null : str.equals(((zzfms)paramObject).zza())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = this.zza;
    int j = 0;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    str = this.zzb;
    if (str != null) {
      j = str.hashCode();
    }
    return (i ^ 0xF4243) * 1000003 ^ j;
  }
  
  public final String toString()
  {
    String str2 = this.zza;
    String str1 = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OverlayDisplayDismissRequest{sessionToken=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", appId=");
    localStringBuilder.append(str1);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final String zza()
  {
    return this.zzb;
  }
  
  public final String zzb()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfmh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */