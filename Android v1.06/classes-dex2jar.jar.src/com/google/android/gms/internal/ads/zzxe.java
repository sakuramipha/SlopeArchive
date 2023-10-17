package com.google.android.gms.internal.ads;

public final class zzxe
{
  public final int zza;
  public final zzlg[] zzb;
  public final zzwx[] zzc;
  public final zzdi zzd;
  public final Object zze;
  
  public zzxe(zzlg[] paramArrayOfzzlg, zzwx[] paramArrayOfzzwx, zzdi paramzzdi, Object paramObject)
  {
    this.zzb = paramArrayOfzzlg;
    this.zzc = ((zzwx[])paramArrayOfzzwx.clone());
    this.zzd = paramzzdi;
    this.zze = paramObject;
    this.zza = paramArrayOfzzlg.length;
  }
  
  public final boolean zza(zzxe paramzzxe, int paramInt)
  {
    if (paramzzxe == null) {
      return false;
    }
    return (zzfn.zzB(this.zzb[paramInt], paramzzxe.zzb[paramInt])) && (zzfn.zzB(this.zzc[paramInt], paramzzxe.zzc[paramInt]));
  }
  
  public final boolean zzb(int paramInt)
  {
    return this.zzb[paramInt] != null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */