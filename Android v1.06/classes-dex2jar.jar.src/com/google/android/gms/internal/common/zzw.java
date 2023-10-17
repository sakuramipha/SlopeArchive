package com.google.android.gms.internal.common;

abstract class zzw
  extends zzj<String>
{
  final CharSequence zzb;
  final zzo zzc;
  final boolean zzd;
  int zze = 0;
  int zzf;
  
  protected zzw(zzx paramzzx, CharSequence paramCharSequence)
  {
    this.zzc = zzx.zza(paramzzx);
    this.zzd = zzx.zzg(paramzzx);
    this.zzf = Integer.MAX_VALUE;
    this.zzb = paramCharSequence;
  }
  
  abstract int zzc(int paramInt);
  
  abstract int zzd(int paramInt);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */