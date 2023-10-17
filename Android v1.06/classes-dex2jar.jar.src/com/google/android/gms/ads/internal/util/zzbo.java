package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzamo;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcal;
import com.google.android.gms.internal.ads.zzfwb;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbo
{
  @Deprecated
  public static final zzbj zza = new zzbg();
  private static zzall zzb;
  private static final Object zzc = new Object();
  
  public zzbo(Context paramContext)
  {
    Context localContext = paramContext;
    if (paramContext.getApplicationContext() != null) {
      localContext = paramContext.getApplicationContext();
    }
    synchronized (zzc)
    {
      if (zzb == null)
      {
        zzbbk.zza(localContext);
        if (!ClientLibraryUtils.isPackageSide())
        {
          paramContext = zzbbk.zzeg;
          if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue())
          {
            paramContext = zzax.zzb(localContext);
            break label74;
          }
        }
        paramContext = zzamo.zza(localContext, null);
        label74:
        zzb = paramContext;
      }
      return;
    }
  }
  
  public final zzfwb zza(String paramString)
  {
    zzcal localzzcal = new zzcal();
    zzb.zza(new zzbn(paramString, null, localzzcal));
    return localzzcal;
  }
  
  public final zzfwb zzb(int paramInt, String paramString, Map paramMap, byte[] paramArrayOfByte)
  {
    zzbl localzzbl = new zzbl(null);
    zzbh localzzbh = new zzbh(this, paramString, localzzbl);
    zzbzs localzzbzs = new zzbzs(null);
    paramMap = new zzbi(this, paramInt, paramString, localzzbl, localzzbh, paramArrayOfByte, paramMap, localzzbzs);
    if (zzbzs.zzk()) {
      try
      {
        localzzbzs.zzd(paramString, "GET", paramMap.zzl(), paramMap.zzx());
      }
      catch (zzakq paramString)
      {
        zzbzt.zzj(paramString.getMessage());
      }
    }
    zzb.zza(paramMap);
    return localzzbl;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */