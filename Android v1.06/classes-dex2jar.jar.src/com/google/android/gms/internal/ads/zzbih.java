package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

public final class zzbih
{
  public static final zzbii zzA = new zzbhx();
  public static final zzbii zza = zzbhm.zza;
  public static final zzbii zzb = zzbhn.zza;
  public static final zzbii zzc = zzbhf.zza;
  public static final zzbii zzd = new zzbhz();
  public static final zzbii zze = new zzbia();
  public static final zzbii zzf = zzbhl.zza;
  public static final zzbii zzg = new zzbib();
  public static final zzbii zzh = new zzbic();
  public static final zzbii zzi = zzbhk.zza;
  public static final zzbii zzj = new zzbid();
  public static final zzbii zzk = new zzbie();
  public static final zzbii zzl = new zzcdb();
  public static final zzbii zzm = new zzcdc();
  public static final zzbii zzn = new zzbhe();
  public static final zzbiw zzo = new zzbiw();
  public static final zzbii zzp = new zzbif();
  public static final zzbii zzq = new zzbig();
  public static final zzbii zzr = new zzbho();
  public static final zzbii zzs = new zzbhp();
  public static final zzbii zzt = new zzbhq();
  public static final zzbii zzu = new zzbhr();
  public static final zzbii zzv = new zzbhs();
  public static final zzbii zzw = new zzbht();
  public static final zzbii zzx = new zzbhu();
  public static final zzbii zzy = new zzbhv();
  public static final zzbii zzz = new zzbhw();
  
  public static zzfwb zza(zzcfb paramzzcfb, String paramString)
  {
    Uri localUri3 = Uri.parse(paramString);
    Uri localUri2;
    try
    {
      zzaqq localzzaqq = paramzzcfb.zzI();
      Uri localUri1 = localUri3;
      if (localzzaqq != null)
      {
        localUri1 = localUri3;
        if (localzzaqq.zzf(localUri3)) {
          localUri1 = localzzaqq.zza(localUri3, paramzzcfb.getContext(), paramzzcfb.zzF(), paramzzcfb.zzi());
        }
      }
    }
    catch (zzaqr localzzaqr)
    {
      zzbzt.zzj("Unable to append parameter to URL: ".concat(paramString));
      localUri2 = localUri3;
    }
    paramString = zzbya.zzb(localUri2, paramzzcfb.getContext());
    long l = ((Long)zzbdc.zze.zze()).longValue();
    if ((l > 0L) && (l <= 231710100L)) {
      return zzfvr.zze(zzfvr.zzl(zzfvr.zze(zzfvi.zzv(paramzzcfb.zzR()), Throwable.class, zzbhg.zza, zzcag.zzf), new zzbhh(paramString), zzcag.zzf), Throwable.class, new zzbhi(paramString), zzcag.zzf);
    }
    return zzfvr.zzh(paramString);
  }
  
  public static void zzc(Map paramMap, zzdcw paramzzdcw)
  {
    zzbbc localzzbbc = zzbbk.zzjo;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (paramMap.containsKey("sc")) && (((String)paramMap.get("sc")).equals("1")) && (paramzzdcw != null)) {
      paramzzdcw.zzr();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */