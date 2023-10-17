package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzfft
  implements Runnable
{
  public static final Object zza = new Object();
  public static Boolean zzb;
  private static final Object zzc = new Object();
  private static final Object zzd = new Object();
  private final Context zze;
  private final zzbzz zzf;
  private final zzffy zzg = zzfgb.zzc();
  private String zzh = "";
  private int zzi;
  private final zzdnu zzj;
  private final List zzk;
  private boolean zzl = false;
  private final zzdyy zzm;
  private final zzbus zzn;
  
  public zzfft(Context paramContext, zzbzz paramzzbzz, zzdnu paramzzdnu, zzdyy paramzzdyy, zzbus paramzzbus)
  {
    this.zze = paramContext;
    this.zzf = paramzzbzz;
    this.zzj = paramzzdnu;
    this.zzm = paramzzdyy;
    this.zzn = paramzzbus;
    paramContext = zzbbk.zzin;
    if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue())
    {
      this.zzk = zzs.zzd();
      return;
    }
    this.zzk = zzfrr.zzl();
  }
  
  public static boolean zza()
  {
    synchronized (zza)
    {
      if (zzb == null)
      {
        boolean bool2 = ((Boolean)zzbcw.zzb.zze()).booleanValue();
        bool1 = false;
        if (!bool2)
        {
          zzb = Boolean.valueOf(false);
        }
        else
        {
          double d = ((Double)zzbcw.zza.zze()).doubleValue();
          if (Math.random() < d) {
            bool1 = true;
          }
          zzb = Boolean.valueOf(bool1);
        }
      }
      boolean bool1 = zzb.booleanValue();
      return bool1;
    }
  }
  
  public final void run()
  {
    if (!zza()) {
      return;
    }
    synchronized (zzc)
    {
      if (this.zzg.zza() == 0) {
        return;
      }
      try
      {
        try
        {
          Object localObject2 = ((zzfgb)this.zzg.zzal()).zzax();
          this.zzg.zzc();
          ??? = new com/google/android/gms/internal/ads/zzdyv;
          Object localObject5 = zzbbk.zzih;
          Object localObject6 = (String)zzba.zzc().zzb((zzbbc)localObject5);
          localObject5 = new java/util/HashMap;
          ((HashMap)localObject5).<init>();
          ((zzdyv)???).<init>((String)localObject6, 60000, (Map)localObject5, (byte[])localObject2, "application/x-protobuf", false);
          localObject6 = this.zze;
          localObject2 = this.zzf.zza;
          localObject5 = this.zzn;
          int i = Binder.getCallingUid();
          zzdyx localzzdyx = new com/google/android/gms/internal/ads/zzdyx;
          localzzdyx.<init>((Context)localObject6, (String)localObject2, (zzbus)localObject5, i);
          localzzdyx.zzb((zzdyv)???);
          return;
        }
        finally {}
        localObject4 = finally;
      }
      catch (Exception localException)
      {
        if (((localException instanceof zzdtz)) && (((zzdtz)localException).zza() == 3)) {
          return;
        }
        zzt.zzo().zzt(localException, "CuiMonitor.sendCuiPing");
        return;
      }
    }
  }
  
  public final void zzb(zzffj paramzzffj)
  {
    zzcag.zza.zza(new zzffs(this, paramzzffj));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */