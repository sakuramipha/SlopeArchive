package com.google.android.gms.internal.ads;

public final class zzvk
{
  public static final zzvk zza = new zzvk(new zzcz[0]);
  public static final zzn zzb = zzvj.zza;
  private static final String zzd = Integer.toString(0, 36);
  public final int zzc;
  private final zzfrr zze;
  private int zzf;
  
  public zzvk(zzcz... paramVarArgs)
  {
    this.zze = zzfrr.zzk(paramVarArgs);
    this.zzc = paramVarArgs.length;
    int i;
    for (int j = 0; j < this.zze.size(); j = i)
    {
      i = j + 1;
      for (int k = i; k < this.zze.size(); k++) {
        if (((zzcz)this.zze.get(j)).equals(this.zze.get(k))) {
          zzer.zzc("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
        }
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzvk)paramObject;
      if ((this.zzc == ((zzvk)paramObject).zzc) && (this.zze.equals(((zzvk)paramObject).zze))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zzf;
    int i = j;
    if (j == 0)
    {
      i = this.zze.hashCode();
      this.zzf = i;
    }
    return i;
  }
  
  public final int zza(zzcz paramzzcz)
  {
    int i = this.zze.indexOf(paramzzcz);
    if (i >= 0) {
      return i;
    }
    return -1;
  }
  
  public final zzcz zzb(int paramInt)
  {
    return (zzcz)this.zze.get(paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzvk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */