package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class zzgdn
{
  public static final zzggy zza = new zzgdm(null);
  
  public static zzghe zza(zzfya paramzzfya)
  {
    zzgha localzzgha = new zzgha();
    localzzgha.zzb(paramzzfya.zzb());
    Iterator localIterator1 = paramzzfya.zzd().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((List)localIterator1.next()).iterator();
      while (localIterator2.hasNext())
      {
        zzfxw localzzfxw = (zzfxw)localIterator2.next();
        int i = localzzfxw.zzh() - 2;
        zzfxg localzzfxg;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3) {
              localzzfxg = zzfxg.zzc;
            } else {
              throw new IllegalStateException("Unknown key status");
            }
          }
          else {
            localzzfxg = zzfxg.zzb;
          }
        }
        else {
          localzzfxg = zzfxg.zza;
        }
        i = localzzfxw.zza();
        String str2 = localzzfxw.zzf();
        String str1 = str2;
        if (str2.startsWith("type.googleapis.com/google.crypto.")) {
          str1 = str2.substring(34);
        }
        localzzgha.zza(localzzfxg, i, str1, localzzfxw.zzc().name());
      }
    }
    if (paramzzfya.zza() != null) {
      localzzgha.zzc(paramzzfya.zza().zza());
    }
    try
    {
      paramzzfya = localzzgha.zzd();
      return paramzzfya;
    }
    catch (GeneralSecurityException paramzzfya)
    {
      throw new IllegalStateException(paramzzfya);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */