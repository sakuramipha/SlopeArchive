package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzcz
{
  public static final zzn zza = zzcy.zza;
  private static final String zze = Integer.toString(0, 36);
  private static final String zzf = Integer.toString(1, 36);
  public final int zzb;
  public final String zzc;
  public final int zzd;
  private final zzam[] zzg;
  private int zzh;
  
  public zzcz(String paramString, zzam... paramVarArgs)
  {
    this.zzc = paramString;
    this.zzg = paramVarArgs;
    this.zzb = 1;
    int j = zzcd.zzb(paramVarArgs[0].zzm);
    int i = j;
    if (j == -1) {
      i = zzcd.zzb(paramVarArgs[0].zzl);
    }
    this.zzd = i;
    zzd(paramVarArgs[0].zzd);
    i = paramVarArgs[0].zzf;
  }
  
  private static String zzd(String paramString)
  {
    if ((paramString != null) && (!paramString.equals("und"))) {
      return paramString;
    }
    return "";
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzcz)paramObject;
      if ((this.zzc.equals(((zzcz)paramObject).zzc)) && (Arrays.equals(this.zzg, ((zzcz)paramObject).zzg))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zzh;
    int i = j;
    if (j == 0)
    {
      i = (this.zzc.hashCode() + 527) * 31 + Arrays.hashCode(this.zzg);
      this.zzh = i;
    }
    return i;
  }
  
  public final int zza(zzam paramzzam)
  {
    for (int i = 0; i <= 0; i++) {
      if (paramzzam == this.zzg[i]) {
        return i;
      }
    }
    return -1;
  }
  
  public final zzam zzb(int paramInt)
  {
    return this.zzg[paramInt];
  }
  
  public final zzcz zzc(String paramString)
  {
    return new zzcz(paramString, this.zzg);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */