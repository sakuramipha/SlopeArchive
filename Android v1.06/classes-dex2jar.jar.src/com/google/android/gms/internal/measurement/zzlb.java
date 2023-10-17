package com.google.android.gms.internal.measurement;

final class zzlb
  implements zzlv
{
  private static final zzlh zza = new zzkz();
  private final zzlh zzb;
  
  public zzlb()
  {
    zzkk.zzf(localObject, "messageInfoFactory");
    this.zzb = ((zzlh)localObject);
  }
  
  private static boolean zzb(zzlg paramzzlg)
  {
    return paramzzlg.zzc() == 1;
  }
  
  public final zzlu zza(Class paramClass)
  {
    zzlw.zzG(paramClass);
    zzlg localzzlg = this.zzb.zzb(paramClass);
    if (localzzlg.zzb())
    {
      if (zzkc.class.isAssignableFrom(paramClass)) {
        return zzln.zzc(zzlw.zzB(), zzjr.zzb(), localzzlg.zza());
      }
      return zzln.zzc(zzlw.zzz(), zzjr.zza(), localzzlg.zza());
    }
    if (zzkc.class.isAssignableFrom(paramClass))
    {
      if (zzb(localzzlg)) {
        paramClass = zzlm.zzl(paramClass, localzzlg, zzlp.zzb(), zzkx.zzd(), zzlw.zzB(), zzjr.zzb(), zzlf.zzb());
      } else {
        paramClass = zzlm.zzl(paramClass, localzzlg, zzlp.zzb(), zzkx.zzd(), zzlw.zzB(), null, zzlf.zzb());
      }
    }
    else if (zzb(localzzlg)) {
      paramClass = zzlm.zzl(paramClass, localzzlg, zzlp.zza(), zzkx.zzc(), zzlw.zzz(), zzjr.zza(), zzlf.zza());
    } else {
      paramClass = zzlm.zzl(paramClass, localzzlg, zzlp.zza(), zzkx.zzc(), zzlw.zzA(), null, zzlf.zza());
    }
    return paramClass;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzlb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */