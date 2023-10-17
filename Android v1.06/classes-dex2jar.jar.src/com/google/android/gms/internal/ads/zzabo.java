package com.google.android.gms.internal.ads;

public final class zzabo
{
  public static final zzabo zza = new zzabo(0L, 0L);
  public final long zzb;
  public final long zzc;
  
  public zzabo(long paramLong1, long paramLong2)
  {
    this.zzb = paramLong1;
    this.zzc = paramLong2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzabo)paramObject;
      if ((this.zzb == ((zzabo)paramObject).zzb) && (this.zzc == ((zzabo)paramObject).zzc)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (int)this.zzb * 31 + (int)this.zzc;
  }
  
  public final String toString()
  {
    long l1 = this.zzb;
    long l2 = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[timeUs=");
    localStringBuilder.append(l1);
    localStringBuilder.append(", position=");
    localStringBuilder.append(l2);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */