package com.google.android.gms.internal.play_billing;

final class zzv
{
  private final Object zza;
  private final Object zzb;
  private final Object zzc;
  
  zzv(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    this.zza = paramObject1;
    this.zzb = paramObject2;
    this.zzc = paramObject3;
  }
  
  final IllegalArgumentException zza()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Multiple entries with same key: ");
    localStringBuilder.append(this.zza);
    localStringBuilder.append("=");
    localStringBuilder.append(this.zzb);
    localStringBuilder.append(" and ");
    localStringBuilder.append(this.zza);
    localStringBuilder.append("=");
    localStringBuilder.append(this.zzc);
    return new IllegalArgumentException(localStringBuilder.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */