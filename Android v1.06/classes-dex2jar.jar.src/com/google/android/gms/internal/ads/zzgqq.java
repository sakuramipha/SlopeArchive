package com.google.android.gms.internal.ads;

final class zzgqq
  implements zzgqd
{
  private final zzgqg zza;
  private final String zzb;
  private final Object[] zzc;
  private final int zzd;
  
  zzgqq(zzgqg paramzzgqg, String paramString, Object[] paramArrayOfObject)
  {
    this.zza = paramzzgqg;
    this.zzb = paramString;
    this.zzc = paramArrayOfObject;
    int i = paramString.charAt(0);
    if (i < 55296)
    {
      this.zzd = i;
      return;
    }
    int k = i & 0x1FFF;
    int j = 1;
    i = 13;
    int m;
    for (;;)
    {
      m = paramString.charAt(j);
      if (m < 55296) {
        break;
      }
      k |= (m & 0x1FFF) << i;
      i += 13;
      j++;
    }
    this.zzd = (k | m << i);
  }
  
  public final zzgqg zza()
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */