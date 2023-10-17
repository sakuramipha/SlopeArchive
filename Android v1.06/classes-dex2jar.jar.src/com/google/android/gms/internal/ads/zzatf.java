package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzatf
  implements Callable
{
  protected final String zza = getClass().getSimpleName();
  protected final zzarr zzb;
  protected final String zzc;
  protected final String zzd;
  protected final zzano zze;
  protected Method zzf;
  protected final int zzg;
  protected final int zzh;
  
  public zzatf(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2)
  {
    this.zzb = paramzzarr;
    this.zzc = paramString1;
    this.zzd = paramString2;
    this.zze = paramzzano;
    this.zzg = paramInt1;
    this.zzh = paramInt2;
  }
  
  protected abstract void zza()
    throws IllegalAccessException, InvocationTargetException;
  
  public Void zzk()
    throws Exception
  {
    try
    {
      long l = System.nanoTime();
      Object localObject = this.zzb.zzj(this.zzc, this.zzd);
      this.zzf = ((Method)localObject);
      if (localObject == null) {
        return null;
      }
      zza();
      localObject = this.zzb.zzd();
      if (localObject != null)
      {
        int i = this.zzg;
        if (i != Integer.MIN_VALUE) {
          ((zzaql)localObject).zzc(this.zzh, i, (System.nanoTime() - l) / 1000L, null, null);
        }
      }
    }
    catch (IllegalAccessException|InvocationTargetException localIllegalAccessException)
    {
      for (;;) {}
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzatf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */