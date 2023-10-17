package com.google.android.gms.internal.ads;

final class zzfrs
{
  private final Object zza;
  private final Object zzb;
  private final Object zzc;
  
  zzfrs(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    this.zza = paramObject1;
    this.zzb = paramObject2;
    this.zzc = paramObject3;
  }
  
  final IllegalArgumentException zza()
  {
    String str4 = String.valueOf(this.zza);
    String str3 = String.valueOf(this.zzb);
    String str2 = String.valueOf(this.zza);
    String str1 = String.valueOf(this.zzc);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Multiple entries with same key: ");
    localStringBuilder.append(str4);
    localStringBuilder.append("=");
    localStringBuilder.append(str3);
    localStringBuilder.append(" and ");
    localStringBuilder.append(str2);
    localStringBuilder.append("=");
    localStringBuilder.append(str1);
    return new IllegalArgumentException(localStringBuilder.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */