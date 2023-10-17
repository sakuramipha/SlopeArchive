package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfif
  implements zzfhk
{
  private static final zzfif zza = new zzfif();
  private static final Handler zzb = new Handler(Looper.getMainLooper());
  private static Handler zzc = null;
  private static final Runnable zzd = new zzfib();
  private static final Runnable zze = new zzfic();
  private final List zzf = new ArrayList();
  private int zzg;
  private boolean zzh = false;
  private final List zzi = new ArrayList();
  private final zzfhm zzj = new zzfhm();
  private final zzfhy zzk = new zzfhy();
  private final zzfhz zzl = new zzfhz(new zzfii());
  private long zzm;
  
  public static zzfif zzd()
  {
    return zza;
  }
  
  private final void zzk(View paramView, zzfhl paramzzfhl, JSONObject paramJSONObject, int paramInt, boolean paramBoolean)
  {
    boolean bool;
    if (paramInt == 1) {
      bool = true;
    } else {
      bool = false;
    }
    paramzzfhl.zzb(paramView, paramJSONObject, this, bool, paramBoolean);
  }
  
  private static final void zzl()
  {
    Handler localHandler = zzc;
    if (localHandler != null)
    {
      localHandler.removeCallbacks(zze);
      zzc = null;
    }
  }
  
  public final void zza(View paramView, zzfhl paramzzfhl, JSONObject paramJSONObject, boolean paramBoolean)
  {
    if (zzfhw.zzb(paramView) == null)
    {
      int j = this.zzk.zzk(paramView);
      if (j == 3) {
        return;
      }
      JSONObject localJSONObject = paramzzfhl.zza(paramView);
      zzfht.zzc(paramJSONObject, localJSONObject);
      paramJSONObject = this.zzk.zzd(paramView);
      if (paramJSONObject != null)
      {
        zzfht.zzb(localJSONObject, paramJSONObject);
        paramBoolean = this.zzk.zzj(paramView);
        try
        {
          localJSONObject.put("hasWindowFocus", Boolean.valueOf(paramBoolean));
        }
        catch (JSONException paramView)
        {
          zzfhu.zza("Error with setting not visible reason", paramView);
        }
        this.zzk.zzh();
      }
      else
      {
        Object localObject = this.zzk.zzb(paramView);
        int i;
        if (localObject != null)
        {
          zzfhf localzzfhf = ((zzfhx)localObject).zza();
          paramJSONObject = new JSONArray();
          localObject = ((zzfhx)localObject).zzb();
          int k = ((List)localObject).size();
          for (i = 0; i < k; i++) {
            paramJSONObject.put((String)((List)localObject).get(i));
          }
          try
          {
            localJSONObject.put("isFriendlyObstructionFor", paramJSONObject);
            localJSONObject.put("friendlyObstructionClass", localzzfhf.zzd());
            localJSONObject.put("friendlyObstructionPurpose", localzzfhf.zza());
            localJSONObject.put("friendlyObstructionReason", localzzfhf.zzc());
          }
          catch (JSONException paramJSONObject)
          {
            zzfhu.zza("Error with setting friendly obstruction", paramJSONObject);
          }
          i = 1;
        }
        else
        {
          i = 0;
        }
        if ((!paramBoolean) && (i == 0)) {
          paramBoolean = false;
        } else {
          paramBoolean = true;
        }
        zzk(paramView, paramzzfhl, localJSONObject, j, paramBoolean);
      }
      this.zzg += 1;
    }
  }
  
  public final void zzh() {}
  
  public final void zzi()
  {
    if (zzc == null)
    {
      Handler localHandler = new Handler(Looper.getMainLooper());
      zzc = localHandler;
      localHandler.post(zzd);
      zzc.postDelayed(zze, 200L);
    }
  }
  
  public final void zzj()
  {
    zzl();
    this.zzf.clear();
    zzb.post(new zzfia(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */