package com.google.android.gms.internal.ads;

final class zzfer
{
  public final String zza;
  public final String zzb;
  
  public zzfer(String paramString1, String paramString2)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzfer)) {
      return false;
    }
    paramObject = (zzfer)paramObject;
    return (this.zza.equals(((zzfer)paramObject).zza)) && (this.zzb.equals(((zzfer)paramObject).zzb));
  }
  
  public final int hashCode()
  {
    return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */