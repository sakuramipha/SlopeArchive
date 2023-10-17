package com.google.android.gms.internal.ads;

public final class zzff
{
  public static final zzff zza = new zzff(-1, -1);
  public static final zzff zzb = new zzff(0, 0);
  private final int zzc;
  private final int zzd;
  
  public zzff(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramInt1 != -1)
    {
      bool1 = bool2;
      if (paramInt1 < 0) {}
    }
    else if (paramInt2 != -1)
    {
      bool1 = bool2;
      if (paramInt2 < 0) {}
    }
    else
    {
      bool1 = true;
    }
    zzdy.zzd(bool1);
    this.zzc = paramInt1;
    this.zzd = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzff))
    {
      paramObject = (zzff)paramObject;
      if ((this.zzc == ((zzff)paramObject).zzc) && (this.zzd == ((zzff)paramObject).zzd)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zzd;
    int i = this.zzc;
    return j ^ (i >>> 16 | i << 16);
  }
  
  public final String toString()
  {
    int i = this.zzc;
    int j = this.zzd;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(i);
    localStringBuilder.append("x");
    localStringBuilder.append(j);
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    return this.zzd;
  }
  
  public final int zzb()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */