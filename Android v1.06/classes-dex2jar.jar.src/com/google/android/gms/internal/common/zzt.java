package com.google.android.gms.internal.common;

final class zzt
  extends zzw
{
  final zzu zza;
  
  zzt(zzu paramzzu, zzx paramzzx, CharSequence paramCharSequence)
  {
    super(paramzzx, paramCharSequence);
  }
  
  final int zzc(int paramInt)
  {
    return paramInt + 1;
  }
  
  final int zzd(int paramInt)
  {
    zzo localzzo = this.zza.zza;
    CharSequence localCharSequence = this.zzb;
    int j = localCharSequence.length();
    zzs.zzb(paramInt, j, "index");
    while (paramInt < j)
    {
      i = paramInt;
      if (localzzo.zza(localCharSequence.charAt(paramInt))) {
        return i;
      }
      paramInt++;
    }
    int i = -1;
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */