package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;

public final class zzwh
  extends zzdd
{
  private boolean zza;
  private boolean zzb;
  private boolean zzc;
  private boolean zzd;
  private boolean zze;
  private boolean zzf;
  private final SparseArray zzg;
  private final SparseBooleanArray zzh;
  
  @Deprecated
  public zzwh()
  {
    this.zzg = new SparseArray();
    this.zzh = new SparseBooleanArray();
    zzv();
  }
  
  public zzwh(Context paramContext)
  {
    super.zzd(paramContext);
    paramContext = zzfn.zzr(paramContext);
    zze(paramContext.x, paramContext.y, true);
    this.zzg = new SparseArray();
    this.zzh = new SparseBooleanArray();
    zzv();
  }
  
  private final void zzv()
  {
    this.zza = true;
    this.zzb = true;
    this.zzc = true;
    this.zzd = true;
    this.zze = true;
    this.zzf = true;
  }
  
  public final zzwh zzo(int paramInt, boolean paramBoolean)
  {
    if (this.zzh.get(paramInt) == paramBoolean) {
      return this;
    }
    if (paramBoolean) {
      this.zzh.put(paramInt, true);
    } else {
      this.zzh.delete(paramInt);
    }
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzwh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */