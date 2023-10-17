package com.google.android.gms.internal.drive;

final class zzme
  implements zzlo
{
  private final int flags;
  private final String info;
  private final Object[] zzue;
  private final zzlq zzuh;
  
  zzme(zzlq paramzzlq, String paramString, Object[] paramArrayOfObject)
  {
    this.zzuh = paramzzlq;
    this.info = paramString;
    this.zzue = paramArrayOfObject;
    int i = paramString.charAt(0);
    if (i < 55296)
    {
      this.flags = i;
      return;
    }
    int k = i & 0x1FFF;
    int j = 13;
    int m;
    for (i = 1;; i++)
    {
      m = paramString.charAt(i);
      if (m < 55296) {
        break;
      }
      k |= (m & 0x1FFF) << j;
      j += 13;
    }
    this.flags = (k | m << j);
  }
  
  public final int zzec()
  {
    if ((this.flags & 0x1) == 1) {
      return zzkk.zze.zzsf;
    }
    return zzkk.zze.zzsg;
  }
  
  public final boolean zzed()
  {
    return (this.flags & 0x2) == 2;
  }
  
  public final zzlq zzee()
  {
    return this.zzuh;
  }
  
  final String zzek()
  {
    return this.info;
  }
  
  final Object[] zzel()
  {
    return this.zzue;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzme.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */