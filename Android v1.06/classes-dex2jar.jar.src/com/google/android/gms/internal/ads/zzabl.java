package com.google.android.gms.internal.ads;

public final class zzabl
{
  public final zzabo zza;
  public final zzabo zzb;
  
  public zzabl(zzabo paramzzabo1, zzabo paramzzabo2)
  {
    this.zza = paramzzabo1;
    this.zzb = paramzzabo2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzabl)paramObject;
      if ((this.zza.equals(((zzabl)paramObject).zza)) && (this.zzb.equals(((zzabl)paramObject).zzb))) {
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
    String str2 = this.zza.toString();
    String str1;
    if (this.zza.equals(this.zzb)) {
      str1 = "";
    } else {
      str1 = ", ".concat(this.zzb.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */