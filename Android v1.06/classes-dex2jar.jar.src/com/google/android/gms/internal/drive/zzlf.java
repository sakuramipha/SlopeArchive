package com.google.android.gms.internal.drive;

import java.lang.reflect.Method;

final class zzlf
  implements zzmg
{
  private static final zzlp zzts = new zzlg();
  private final zzlp zztr;
  
  public zzlf()
  {
    this(new zzlh(new zzlp[] { zzkj.zzcv(), zzdv() }));
  }
  
  private zzlf(zzlp paramzzlp)
  {
    this.zztr = ((zzlp)zzkm.zza(paramzzlp, "messageInfoFactory"));
  }
  
  private static boolean zza(zzlo paramzzlo)
  {
    return paramzzlo.zzec() == zzkk.zze.zzsf;
  }
  
  private static zzlp zzdv()
  {
    try
    {
      zzlp localzzlp = (zzlp)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
      return localzzlp;
    }
    catch (Exception localException) {}
    return zzts;
  }
  
  public final <T> zzmf<T> zze(Class<T> paramClass)
  {
    zzmh.zzg(paramClass);
    zzlo localzzlo = this.zztr.zzc(paramClass);
    if (localzzlo.zzed())
    {
      if (zzkk.class.isAssignableFrom(paramClass)) {
        return zzlw.zza(zzmh.zzeo(), zzka.zzcl(), localzzlo.zzee());
      }
      return zzlw.zza(zzmh.zzem(), zzka.zzcm(), localzzlo.zzee());
    }
    if (zzkk.class.isAssignableFrom(paramClass))
    {
      if (zza(localzzlo)) {
        return zzlu.zza(paramClass, localzzlo, zzma.zzeh(), zzla.zzdu(), zzmh.zzeo(), zzka.zzcl(), zzln.zzea());
      }
      return zzlu.zza(paramClass, localzzlo, zzma.zzeh(), zzla.zzdu(), zzmh.zzeo(), null, zzln.zzea());
    }
    if (zza(localzzlo)) {
      return zzlu.zza(paramClass, localzzlo, zzma.zzeg(), zzla.zzdt(), zzmh.zzem(), zzka.zzcm(), zzln.zzdz());
    }
    return zzlu.zza(paramClass, localzzlo, zzma.zzeg(), zzla.zzdt(), zzmh.zzen(), null, zzln.zzdz());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzlf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */