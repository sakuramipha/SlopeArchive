package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzcmv
  implements zzcml
{
  private final Context zza;
  private final zzg zzb = zzt.zzo().zzh();
  
  public zzcmv(Context paramContext)
  {
    this.zza = paramContext;
  }
  
  public final void zza(Map paramMap)
  {
    if (paramMap.isEmpty()) {
      return;
    }
    Object localObject1 = (String)paramMap.get("gad_idless");
    if (localObject1 != null)
    {
      boolean bool = Boolean.parseBoolean((String)localObject1);
      paramMap.remove("gad_idless");
      if (bool) {
        try
        {
          localObject1 = zzbbk.zzcC;
          if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
            zzflz.zzj(this.zza).zzk();
          }
          localObject1 = zzbbk.zzcL;
          if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
            zzflz.zzj(this.zza).zzl();
          }
          localObject1 = zzbbk.zzcD;
          if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
          {
            zzfma.zzi(this.zza).zzj();
            localObject1 = zzbbk.zzcH;
            if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
              zzfma.zzi(this.zza).zzk();
            }
            localObject1 = zzbbk.zzcI;
            if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
              zzfma.zzi(this.zza).zzl();
            }
          }
        }
        catch (IOException localIOException)
        {
          zzt.zzo().zzu(localIOException, "SetAppMeasurementConsentConfig.run");
        }
      }
      localObject2 = zzbbk.zzau;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
      {
        this.zzb.zzH(bool);
        localObject2 = zzbbk.zzfU;
        if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue()) && (bool)) {
          this.zza.deleteDatabase("OfflineUpload.db");
        }
      }
    }
    Object localObject2 = new Bundle();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      ((Bundle)localObject2).putString((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    paramMap = zzbbk.zzap;
    if (((Boolean)zzba.zzc().zzb(paramMap)).booleanValue()) {
      zzt.zzn().zzr((Bundle)localObject2);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcmv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */