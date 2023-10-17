package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public final class zzdsu
{
  private final zzdse zza;
  private final zzdnu zzb;
  private final Object zzc = new Object();
  private final List zzd;
  private boolean zze;
  
  zzdsu(zzdse paramzzdse, zzdnu paramzzdnu)
  {
    this.zza = paramzzdse;
    this.zzb = paramzzdnu;
    this.zzd = new ArrayList();
  }
  
  private final void zzd(List paramList)
  {
    synchronized (this.zzc)
    {
      if (this.zze) {
        return;
      }
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        zzbke localzzbke = (zzbke)localIterator.next();
        paramList = zzbbk.zziL;
        if (((Boolean)zzba.zzc().zzb(paramList)).booleanValue())
        {
          paramList = this.zzb.zza(localzzbke.zza);
          if (paramList != null)
          {
            paramList = paramList.zzc;
            if (paramList != null)
            {
              paramList = paramList.toString();
              break label113;
            }
          }
          paramList = "";
        }
        else
        {
          paramList = "";
        }
        label113:
        Object localObject2 = zzbbk.zziM;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
        {
          localObject2 = this.zzb.zza(localzzbke.zza);
          if ((localObject2 != null) && (((zzdnt)localObject2).zzd))
          {
            bool = true;
            break label172;
          }
        }
        boolean bool = false;
        label172:
        List localList = this.zzd;
        zzdst localzzdst = new com/google/android/gms/internal/ads/zzdst;
        localObject2 = localzzbke.zza;
        localzzdst.<init>((String)localObject2, paramList, this.zzb.zzc((String)localObject2), localzzbke.zzb, localzzbke.zzd, localzzbke.zzc, bool);
        localList.add(localzzdst);
      }
      this.zze = true;
      return;
    }
  }
  
  public final JSONArray zza()
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    synchronized (this.zzc)
    {
      if (!this.zze) {
        if (this.zza.zzt())
        {
          zzd(this.zza.zzg());
        }
        else
        {
          zzc();
          return localJSONArray;
        }
      }
      Iterator localIterator = this.zzd.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((zzdst)localIterator.next()).zza());
      }
      return localJSONArray;
    }
  }
  
  public final void zzc()
  {
    this.zza.zzs(new zzdss(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdsu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */