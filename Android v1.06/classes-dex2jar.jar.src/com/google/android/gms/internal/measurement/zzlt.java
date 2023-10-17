package com.google.android.gms.internal.measurement;

final class zzlt
  implements zzlg
{
  private final zzlj zza;
  private final String zzb;
  private final Object[] zzc;
  private final int zzd;
  
  zzlt(zzlj paramzzlj, String paramString, Object[] paramArrayOfObject)
  {
    this.zza = paramzzlj;
    this.zzb = paramString;
    this.zzc = paramArrayOfObject;
    int i = paramString.charAt(0);
    if (i < 55296)
    {
      this.zzd = i;
      return;
    }
    int j = i & 0x1FFF;
    int k = 13;
    int m;
    for (i = 1;; i++)
    {
      m = paramString.charAt(i);
      if (m < 55296) {
        break;
      }
      j |= (m & 0x1FFF) << k;
      k += 13;
    }
    this.zzd = (j | m << k);
  }
  
  public final zzlj zza()
  {
    return this.zza;
  }
  
  public final boolean zzb()
  {
    return (this.zzd & 0x2) == 2;
  }
  
  public final int zzc()
  {
    if ((this.zzd & 0x1) == 1) {
      return 1;
    }
    return 2;
  }
  
  final String zzd()
  {
    return this.zzb;
  }
  
  final Object[] zze()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzlt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */