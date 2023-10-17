package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public class zzegb
  extends zzehc
{
  private final zzddf zza;
  
  public zzegb(zzcvg paramzzcvg, zzdcu paramzzdcu, zzcwa paramzzcwa, zzcwp paramzzcwp, zzcwu paramzzcwu, zzcvv paramzzcvv, zzdac paramzzdac, zzddm paramzzddm, zzcxo paramzzcxo, zzddf paramzzddf, zzczy paramzzczy)
  {
    super(paramzzcvg, paramzzdcu, paramzzcwa, paramzzcwp, paramzzcwu, paramzzdac, paramzzcxo, paramzzddm, paramzzczy, paramzzcvv);
    this.zza = paramzzddf;
  }
  
  public final void zzs(zzbvi paramzzbvi)
  {
    this.zza.zza(paramzzbvi);
  }
  
  public final void zzt(zzbvm paramzzbvm)
    throws RemoteException
  {
    this.zza.zza(new zzbvi(paramzzbvm.zzf(), paramzzbvm.zze()));
  }
  
  public final void zzu()
    throws RemoteException
  {
    this.zza.zzb();
  }
  
  public final void zzv()
  {
    this.zza.zzb();
  }
  
  public final void zzy()
  {
    this.zza.zzc();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzegb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */