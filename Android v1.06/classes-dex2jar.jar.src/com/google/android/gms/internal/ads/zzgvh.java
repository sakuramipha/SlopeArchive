package com.google.android.gms.internal.ads;

public final class zzgvh
{
  public static final zzgvh zza = new zzgvh(1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
  public static final zzgvh zzb = new zzgvh(0.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
  public static final zzgvh zzc = new zzgvh(-1.0D, 0.0D, 0.0D, -1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
  public static final zzgvh zzd = new zzgvh(0.0D, -1.0D, 1.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
  public final double zze;
  public final double zzf;
  public final double zzg;
  public final double zzh;
  public final double zzi;
  public final double zzj;
  public final double zzk;
  public final double zzl;
  public final double zzm;
  
  public zzgvh(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
  {
    this.zze = paramDouble5;
    this.zzf = paramDouble6;
    this.zzg = paramDouble7;
    this.zzh = paramDouble1;
    this.zzi = paramDouble2;
    this.zzj = paramDouble3;
    this.zzk = paramDouble4;
    this.zzl = paramDouble8;
    this.zzm = paramDouble9;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzgvh)paramObject;
      if (Double.compare(((zzgvh)paramObject).zzh, this.zzh) != 0) {
        return false;
      }
      if (Double.compare(((zzgvh)paramObject).zzi, this.zzi) != 0) {
        return false;
      }
      if (Double.compare(((zzgvh)paramObject).zzj, this.zzj) != 0) {
        return false;
      }
      if (Double.compare(((zzgvh)paramObject).zzk, this.zzk) != 0) {
        return false;
      }
      if (Double.compare(((zzgvh)paramObject).zzl, this.zzl) != 0) {
        return false;
      }
      if (Double.compare(((zzgvh)paramObject).zzm, this.zzm) != 0) {
        return false;
      }
      if (Double.compare(((zzgvh)paramObject).zze, this.zze) != 0) {
        return false;
      }
      if (Double.compare(((zzgvh)paramObject).zzf, this.zzf) != 0) {
        return false;
      }
      return Double.compare(((zzgvh)paramObject).zzg, this.zzg) == 0;
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l5 = Double.doubleToLongBits(this.zze);
    long l3 = Double.doubleToLongBits(this.zzf);
    long l8 = Double.doubleToLongBits(this.zzg);
    long l1 = Double.doubleToLongBits(this.zzh);
    long l9 = Double.doubleToLongBits(this.zzi);
    long l2 = Double.doubleToLongBits(this.zzj);
    long l6 = Double.doubleToLongBits(this.zzk);
    long l4 = Double.doubleToLongBits(this.zzl);
    long l7 = Double.doubleToLongBits(this.zzm);
    return ((((((((int)(l5 ^ l5 >>> 32) * 31 + (int)(l3 ^ l3 >>> 32)) * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + (int)(l9 ^ l9 >>> 32)) * 31 + (int)(l2 ^ l2 >>> 32)) * 31 + (int)(l6 ^ l6 >>> 32)) * 31 + (int)(l4 ^ l4 >>> 32)) * 31 + (int)(l7 ^ l7 >>> 32);
  }
  
  public final String toString()
  {
    if (equals(zza)) {
      return "Rotate 0°";
    }
    if (equals(zzb)) {
      return "Rotate 90°";
    }
    if (equals(zzc)) {
      return "Rotate 180°";
    }
    if (equals(zzd)) {
      return "Rotate 270°";
    }
    double d2 = this.zze;
    double d1 = this.zzf;
    double d9 = this.zzg;
    double d4 = this.zzh;
    double d7 = this.zzi;
    double d5 = this.zzj;
    double d3 = this.zzk;
    double d8 = this.zzl;
    double d6 = this.zzm;
    StringBuilder localStringBuilder = new StringBuilder(260);
    localStringBuilder.append("Matrix{u=");
    localStringBuilder.append(d2);
    localStringBuilder.append(", v=");
    localStringBuilder.append(d1);
    localStringBuilder.append(", w=");
    localStringBuilder.append(d9);
    localStringBuilder.append(", a=");
    localStringBuilder.append(d4);
    localStringBuilder.append(", b=");
    localStringBuilder.append(d7);
    localStringBuilder.append(", c=");
    localStringBuilder.append(d5);
    localStringBuilder.append(", d=");
    localStringBuilder.append(d3);
    localStringBuilder.append(", tx=");
    localStringBuilder.append(d8);
    localStringBuilder.append(", ty=");
    localStringBuilder.append(d6);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */