package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

public final class zzffp
{
  public static void zza(zzfwb paramzzfwb, zzffq paramzzffq, zzfff paramzzfff)
  {
    zzg(paramzzfwb, paramzzffq, paramzzfff, false);
  }
  
  public static void zzb(zzfwb paramzzfwb, zzffq paramzzffq, zzfff paramzzfff)
  {
    zzg(paramzzfwb, paramzzffq, paramzzfff, true);
  }
  
  public static void zzc(zzfwb paramzzfwb, zzffq paramzzffq, zzfff paramzzfff)
  {
    if (!((Boolean)zzbcw.zzc.zze()).booleanValue()) {
      return;
    }
    zzfvr.zzq(zzfvi.zzv(paramzzfwb), new zzffo(paramzzffq, paramzzfff), zzcag.zzf);
  }
  
  public static void zzd(zzfwb paramzzfwb, zzfff paramzzfff)
  {
    if (!((Boolean)zzbcw.zzc.zze()).booleanValue()) {
      return;
    }
    zzfvr.zzq(zzfvi.zzv(paramzzfwb), new zzffm(paramzzfff), zzcag.zzf);
  }
  
  public static boolean zze(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    zzbbc localzzbbc = zzbbk.zzil;
    return Pattern.matches((String)zzba.zzc().zzb(localzzbbc), paramString);
  }
  
  public static int zzf(zzfaa paramzzfaa)
  {
    int i = zzf.zze(paramzzfaa) - 1;
    if ((i != 0) && (i != 1)) {
      return 23;
    }
    return 7;
  }
  
  private static void zzg(zzfwb paramzzfwb, zzffq paramzzffq, zzfff paramzzfff, boolean paramBoolean)
  {
    if (!((Boolean)zzbcw.zzc.zze()).booleanValue()) {
      return;
    }
    zzfvr.zzq(zzfvi.zzv(paramzzfwb), new zzffn(paramzzffq, paramzzfff, paramBoolean), zzcag.zzf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzffp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */