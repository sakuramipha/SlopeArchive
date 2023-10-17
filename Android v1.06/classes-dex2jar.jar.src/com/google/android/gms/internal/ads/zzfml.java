package com.google.android.gms.internal.ads;

final class zzfml
  extends zzfne
{
  private int zza;
  private String zzb;
  private byte zzc;
  
  public final zzfne zza(String paramString)
  {
    this.zzb = paramString;
    return this;
  }
  
  public final zzfne zzb(int paramInt)
  {
    this.zza = paramInt;
    this.zzc = 1;
    return this;
  }
  
  public final zzfnf zzc()
  {
    if (this.zzc == 1) {
      return new zzfmn(this.zza, this.zzb, null);
    }
    throw new IllegalStateException("Missing required properties: statusCode");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */