package com.google.android.gms.internal.ads;

final class zzfmn
  extends zzfnf
{
  private final int zza;
  private final String zzb;
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzfnf))
    {
      zzfnf localzzfnf = (zzfnf)paramObject;
      if (this.zza == localzzfnf.zza())
      {
        paramObject = this.zzb;
        if (paramObject == null ? localzzfnf.zzb() == null : ((String)paramObject).equals(localzzfnf.zzb())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zza;
    String str = this.zzb;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    return (j ^ 0xF4243) * 1000003 ^ i;
  }
  
  public final String toString()
  {
    int i = this.zza;
    String str = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OverlayDisplayState{statusCode=");
    localStringBuilder.append(i);
    localStringBuilder.append(", sessionToken=");
    localStringBuilder.append(str);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    return this.zza;
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */