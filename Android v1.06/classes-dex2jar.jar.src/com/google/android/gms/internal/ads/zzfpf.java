package com.google.android.gms.internal.ads;

final class zzfpf
  extends zzfpk
{
  final zzfpg zza;
  
  zzfpf(zzfpg paramzzfpg, zzfpm paramzzfpm, CharSequence paramCharSequence)
  {
    super(paramzzfpm, paramCharSequence);
  }
  
  final int zzc(int paramInt)
  {
    return paramInt + 1;
  }
  
  final int zzd(int paramInt)
  {
    zzfok localzzfok = this.zza.zza;
    CharSequence localCharSequence = this.zzb;
    int i = localCharSequence.length();
    zzfoz.zzb(paramInt, i, "index");
    while (paramInt < i)
    {
      if (localzzfok.zzb(localCharSequence.charAt(paramInt))) {
        return paramInt;
      }
      paramInt++;
    }
    paramInt = -1;
    return paramInt;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */