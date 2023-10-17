package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

final class zzfpe
  extends zzfov
{
  private final Object zza;
  
  zzfpe(Object paramObject)
  {
    this.zza = paramObject;
  }
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    if ((paramObject instanceof zzfpe))
    {
      paramObject = (zzfpe)paramObject;
      return this.zza.equals(((zzfpe)paramObject).zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode() + 1502476572;
  }
  
  public final String toString()
  {
    String str = this.zza.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Optional.of(");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final zzfov zza(zzfon paramzzfon)
  {
    paramzzfon = paramzzfon.apply(this.zza);
    zzfoz.zzc(paramzzfon, "the Function passed to Optional.transform() must not return null.");
    return new zzfpe(paramzzfon);
  }
  
  public final Object zzb(Object paramObject)
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */