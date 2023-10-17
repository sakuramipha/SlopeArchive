package com.google.android.gms.internal.ads;

public final class zzdn
{
  public static final zzdn zza = new zzdn(0, 0, 0, 1.0F);
  public static final zzn zzb = zzdm.zza;
  private static final String zzg = Integer.toString(0, 36);
  private static final String zzh = Integer.toString(1, 36);
  private static final String zzi = Integer.toString(2, 36);
  private static final String zzj = Integer.toString(3, 36);
  public final int zzc;
  public final int zzd;
  public final int zze;
  public final float zzf;
  
  public zzdn(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this.zzc = paramInt1;
    this.zzd = paramInt2;
    this.zze = paramInt3;
    this.zzf = paramFloat;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzdn))
    {
      paramObject = (zzdn)paramObject;
      if ((this.zzc == ((zzdn)paramObject).zzc) && (this.zzd == ((zzdn)paramObject).zzd) && (this.zze == ((zzdn)paramObject).zze) && (this.zzf == ((zzdn)paramObject).zzf)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (((this.zzc + 217) * 31 + this.zzd) * 31 + this.zze) * 31 + Float.floatToRawIntBits(this.zzf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */