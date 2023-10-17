package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class zzbbd
{
  private final List zza = new ArrayList();
  private final List zzb = new ArrayList();
  private final List zzc = new ArrayList();
  
  public final List zza()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.zzb.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (zzbbc)localIterator.next();
      localObject = (String)zzba.zzc().zzb((zzbbc)localObject);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        localArrayList.add(localObject);
      }
    }
    localArrayList.addAll(zzbbo.zza());
    return localArrayList;
  }
  
  public final List zzb()
  {
    List localList = zza();
    Iterator localIterator = this.zzc.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (zzbbc)localIterator.next();
      localObject = (String)zzba.zzc().zzb((zzbbc)localObject);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        localList.add(localObject);
      }
    }
    localList.addAll(zzbbo.zzb());
    return localList;
  }
  
  public final void zzc(zzbbc paramzzbbc)
  {
    this.zzb.add(paramzzbbc);
  }
  
  public final void zzd(zzbbc paramzzbbc)
  {
    this.zza.add(paramzzbbc);
  }
  
  public final void zze(SharedPreferences.Editor paramEditor, int paramInt, JSONObject paramJSONObject)
  {
    Iterator localIterator = this.zza.iterator();
    while (localIterator.hasNext())
    {
      zzbbc localzzbbc = (zzbbc)localIterator.next();
      if (localzzbbc.zze() == 1) {
        localzzbbc.zzd(paramEditor, localzzbbc.zza(paramJSONObject));
      }
    }
    if (paramJSONObject != null)
    {
      paramEditor.putString("flag_configuration", paramJSONObject.toString());
      return;
    }
    zzbzt.zzg("Flag Json is null.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */