package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzala
{
  private final String zza;
  private final String zzb;
  
  public zzala(String paramString1, String paramString2)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzala)paramObject;
      if ((TextUtils.equals(this.zza, ((zzala)paramObject).zza)) && (TextUtils.equals(this.zzb, ((zzala)paramObject).zzb))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode() * 31 + this.zzb.hashCode();
  }
  
  public final String toString()
  {
    String str2 = this.zza;
    String str1 = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Header[name=");
    localStringBuilder.append(str2);
    localStringBuilder.append(",value=");
    localStringBuilder.append(str1);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final String zza()
  {
    return this.zza;
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzala.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */