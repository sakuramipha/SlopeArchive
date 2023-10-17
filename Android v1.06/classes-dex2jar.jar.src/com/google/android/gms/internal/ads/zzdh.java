package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzdh
{
  public static final zzn zza = zzdg.zza;
  private static final String zzc = Integer.toString(0, 36);
  private static final String zzd = Integer.toString(1, 36);
  private static final String zze = Integer.toString(3, 36);
  private static final String zzf = Integer.toString(4, 36);
  public final int zzb;
  private final zzcz zzg;
  private final int[] zzh;
  private final boolean[] zzi;
  
  public zzdh(zzcz paramzzcz, boolean paramBoolean, int[] paramArrayOfInt, boolean[] paramArrayOfBoolean)
  {
    int i = paramzzcz.zzb;
    this.zzb = 1;
    this.zzg = paramzzcz;
    this.zzh = ((int[])paramArrayOfInt.clone());
    this.zzi = ((boolean[])paramArrayOfBoolean.clone());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzdh)paramObject;
      if ((this.zzg.equals(((zzdh)paramObject).zzg)) && (Arrays.equals(this.zzh, ((zzdh)paramObject).zzh)) && (Arrays.equals(this.zzi, ((zzdh)paramObject).zzi))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (this.zzg.hashCode() * 961 + Arrays.hashCode(this.zzh)) * 31 + Arrays.hashCode(this.zzi);
  }
  
  public final int zza()
  {
    return this.zzg.zzd;
  }
  
  public final zzam zzb(int paramInt)
  {
    return this.zzg.zzb(paramInt);
  }
  
  public final boolean zzc()
  {
    boolean[] arrayOfBoolean = this.zzi;
    int j = arrayOfBoolean.length;
    boolean bool2 = false;
    boolean bool1;
    for (int i = 0;; i++)
    {
      bool1 = bool2;
      if (i >= j) {
        break;
      }
      if (arrayOfBoolean[i] == 1)
      {
        bool1 = true;
        break;
      }
    }
    return bool1;
  }
  
  public final boolean zzd(int paramInt)
  {
    return this.zzi[paramInt];
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */