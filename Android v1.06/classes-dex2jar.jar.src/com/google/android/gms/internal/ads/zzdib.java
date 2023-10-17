package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

final class zzdib
  implements zzbed
{
  final zzdiy zza;
  
  zzdib(zzdiy paramzzdiy, ViewGroup paramViewGroup) {}
  
  public final JSONObject zza()
  {
    return this.zza.zzo();
  }
  
  public final JSONObject zzb()
  {
    return this.zza.zzp();
  }
  
  public final void zzc()
  {
    Object localObject = this.zza;
    zzfrr localzzfrr = zzdhy.zza;
    Map localMap = ((zzdiy)localObject).zzm();
    if (localMap != null)
    {
      int j = localzzfrr.size();
      int i = 0;
      while (i < j)
      {
        localObject = localMap.get((String)localzzfrr.get(i));
        i++;
        if (localObject != null) {
          this.zza.onClick(this.zzb);
        }
      }
    }
  }
  
  public final void zzd(MotionEvent paramMotionEvent)
  {
    this.zza.onTouch(null, paramMotionEvent);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */