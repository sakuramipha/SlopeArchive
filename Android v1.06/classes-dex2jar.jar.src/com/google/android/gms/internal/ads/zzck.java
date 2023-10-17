package com.google.android.gms.internal.ads;

public final class zzck
{
  private final zzaf zza = new zzaf();
  
  public final zzck zza(int paramInt)
  {
    this.zza.zza(paramInt);
    return this;
  }
  
  public final zzck zzb(zzcm paramzzcm)
  {
    zzaf localzzaf = this.zza;
    paramzzcm = zzcm.zza(paramzzcm);
    for (int i = 0; i < paramzzcm.zzb(); i++) {
      localzzaf.zza(paramzzcm.zza(i));
    }
    return this;
  }
  
  public final zzck zzc(int... paramVarArgs)
  {
    zzaf localzzaf = this.zza;
    for (int i = 0; i < 24; i++) {
      localzzaf.zza(paramVarArgs[i]);
    }
    return this;
  }
  
  public final zzck zzd(int paramInt, boolean paramBoolean)
  {
    zzaf localzzaf = this.zza;
    if (paramBoolean) {
      localzzaf.zza(paramInt);
    }
    return this;
  }
  
  public final zzcm zze()
  {
    return new zzcm(this.zza.zzb(), null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */