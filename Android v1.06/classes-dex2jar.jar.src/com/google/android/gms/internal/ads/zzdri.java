package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzdri
  extends zzbjh
{
  private final zzdrl zza;
  private final zzdrg zzb;
  private final Map zzc = new HashMap();
  
  zzdri(zzdrl paramzzdrl, zzdrg paramzzdrg)
  {
    this.zza = paramzzdrl;
    this.zzb = paramzzdrg;
  }
  
  private static zzl zzc(Map paramMap)
  {
    Object localObject1 = new zzm();
    paramMap = (String)paramMap.get("ad_request");
    if (paramMap == null) {
      return ((zzm)localObject1).zza();
    }
    paramMap = new JsonReader(new StringReader(Uri.decode(paramMap)));
    try
    {
      paramMap.beginObject();
      while (paramMap.hasNext())
      {
        localObject2 = paramMap.nextName();
        int i = ((String)localObject2).hashCode();
        switch (i)
        {
        default: 
          break;
        case 1411582723: 
          if (((String)localObject2).equals("tagForChildDirectedTreatment")) {
            i = 3;
          }
          break;
        case 597632527: 
          if (((String)localObject2).equals("maxAdContentRating")) {
            i = 5;
          }
          break;
        case 523149226: 
          if (((String)localObject2).equals("keywords")) {
            i = 1;
          }
          break;
        case -99890337: 
          if (((String)localObject2).equals("httpTimeoutMillis")) {
            i = 6;
          }
          break;
        case -733436947: 
          if (((String)localObject2).equals("tagForUnderAgeOfConsent")) {
            i = 4;
          }
          break;
        case -839117230: 
          if (((String)localObject2).equals("isTestDevice")) {
            i = 2;
          }
          break;
        case -1289032093: 
          if (((String)localObject2).equals("extras")) {
            i = 0;
          }
          break;
        }
        i = -1;
        switch (i)
        {
        default: 
          paramMap.skipValue();
          break;
        case 6: 
          ((zzm)localObject1).zzc(paramMap.nextInt());
          break;
        case 5: 
          localObject2 = paramMap.nextString();
          if (RequestConfiguration.zza.contains(localObject2)) {
            ((zzm)localObject1).zzf((String)localObject2);
          }
          break;
        case 4: 
          if (paramMap.nextBoolean()) {
            ((zzm)localObject1).zzh(1);
          } else {
            ((zzm)localObject1).zzh(0);
          }
          break;
        case 3: 
          if (paramMap.nextBoolean()) {
            ((zzm)localObject1).zzg(1);
          } else {
            ((zzm)localObject1).zzg(0);
          }
          break;
        case 2: 
          ((zzm)localObject1).zzd(paramMap.nextBoolean());
          break;
        case 1: 
          paramMap.beginArray();
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          while (paramMap.hasNext()) {
            ((ArrayList)localObject2).add(paramMap.nextString());
          }
          paramMap.endArray();
          ((zzm)localObject1).zze((List)localObject2);
          break;
        case 0: 
          paramMap.beginObject();
          localObject2 = new android/os/Bundle;
          ((Bundle)localObject2).<init>();
          while (paramMap.hasNext()) {
            ((Bundle)localObject2).putString(paramMap.nextName(), paramMap.nextString());
          }
          paramMap.endObject();
          ((zzm)localObject1).zzb((Bundle)localObject2);
        }
      }
      paramMap.endObject();
    }
    catch (IOException paramMap)
    {
      zzbzt.zze("Ad Request json was malformed, parsing ended early.");
    }
    Object localObject2 = ((zzm)localObject1).zza();
    localObject1 = ((zzl)localObject2).zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    paramMap = (Map)localObject1;
    if (localObject1 == null)
    {
      paramMap = ((zzl)localObject2).zzc;
      ((zzl)localObject2).zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", paramMap);
    }
    return new zzl(((zzl)localObject2).zza, ((zzl)localObject2).zzb, paramMap, ((zzl)localObject2).zzd, ((zzl)localObject2).zze, ((zzl)localObject2).zzf, ((zzl)localObject2).zzg, ((zzl)localObject2).zzh, ((zzl)localObject2).zzi, ((zzl)localObject2).zzj, ((zzl)localObject2).zzk, ((zzl)localObject2).zzl, ((zzl)localObject2).zzm, ((zzl)localObject2).zzn, ((zzl)localObject2).zzo, ((zzl)localObject2).zzp, ((zzl)localObject2).zzq, ((zzl)localObject2).zzr, ((zzl)localObject2).zzs, ((zzl)localObject2).zzt, ((zzl)localObject2).zzu, ((zzl)localObject2).zzv, ((zzl)localObject2).zzw, ((zzl)localObject2).zzx);
  }
  
  public final void zze()
  {
    this.zzc.clear();
  }
  
  public final void zzf(String paramString)
    throws RemoteException
  {
    Object localObject1 = zzbbk.zziY;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
      return;
    }
    zze.zza("Received H5 gmsg: ".concat(String.valueOf(paramString)));
    paramString = Uri.parse(paramString);
    zzt.zzp();
    paramString = zzs.zzL(paramString);
    Object localObject2 = (String)paramString.get("action");
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      zzbzt.zze("H5 gmsg did not contain an action");
      return;
    }
    int i = ((String)localObject2).hashCode();
    int j = 0;
    if (i != 579053441)
    {
      if ((i == 871091088) && (((String)localObject2).equals("initialize")))
      {
        i = 0;
        break label138;
      }
    }
    else if (((String)localObject2).equals("dispose_all"))
    {
      i = 1;
      break label138;
    }
    i = -1;
    label138:
    if (i != 0)
    {
      if (i != 1)
      {
        localObject1 = (String)paramString.get("obj_id");
        try
        {
          localObject1.getClass();
          long l = Long.parseLong((String)localObject1);
          switch (((String)localObject2).hashCode())
          {
          default: 
            break;
          case 2109237041: 
            if (((String)localObject2).equals("create_rewarded_ad")) {
              i = 3;
            }
            break;
          case 1671767583: 
            if (((String)localObject2).equals("dispose")) {
              i = 6;
            }
            break;
          case 585513149: 
            if (((String)localObject2).equals("load_interstitial_ad")) {
              i = 1;
            }
            break;
          case 393881811: 
            if (((String)localObject2).equals("create_interstitial_ad")) {
              i = j;
            }
            break;
          case -257098725: 
            if (((String)localObject2).equals("load_rewarded_ad")) {
              i = 4;
            }
            break;
          case -1266374734: 
            if (((String)localObject2).equals("show_rewarded_ad")) {
              i = 5;
            }
            break;
          case -1790951212: 
            if (((String)localObject2).equals("show_interstitial_ad")) {
              i = 2;
            }
            break;
          }
          i = -1;
          switch (i)
          {
          default: 
            zzbzt.zze("H5 gmsg contained invalid action: ".concat(String.valueOf(localObject2)));
            return;
          case 6: 
            localObject1 = this.zzc;
            paramString = Long.valueOf(l);
            localObject1 = (zzdrb)((Map)localObject1).get(paramString);
            if (localObject1 == null)
            {
              zzbzt.zze("Could not dispose H5 ad, object ID does not exist");
              return;
            }
            ((zzdrb)localObject1).zza();
            this.zzc.remove(paramString);
            paramString = new StringBuilder();
            paramString.append("Disposed H5 ad #");
            paramString.append(l);
            zze.zza(paramString.toString());
            return;
          case 5: 
            paramString = (zzdrb)this.zzc.get(Long.valueOf(l));
            if (paramString == null)
            {
              zzbzt.zze("Could not show H5 ad, object ID does not exist");
              this.zzb.zzq(l);
              return;
            }
            paramString.zzc();
            return;
          case 4: 
            localObject1 = (zzdrb)this.zzc.get(Long.valueOf(l));
            if (localObject1 == null)
            {
              zzbzt.zze("Could not load H5 ad, object ID does not exist");
              this.zzb.zzq(l);
              return;
            }
            ((zzdrb)localObject1).zzb(zzc(paramString));
            return;
          case 3: 
            i = this.zzc.size();
            localObject1 = zzbbk.zziZ;
            if (i >= ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue())
            {
              zzbzt.zzj("Could not create H5 ad, too many existing objects");
              this.zzb.zzi(l);
              return;
            }
            localObject2 = this.zzc;
            localObject1 = Long.valueOf(l);
            if (((Map)localObject2).containsKey(localObject1))
            {
              zzbzt.zze("Could not create H5 ad, object ID already exists");
              this.zzb.zzi(l);
              return;
            }
            paramString = (String)paramString.get("ad_unit");
            if (TextUtils.isEmpty(paramString))
            {
              zzbzt.zzj("Could not create H5 ad, missing ad unit id");
              this.zzb.zzi(l);
              return;
            }
            localObject2 = this.zza.zzb();
            ((zzdrc)localObject2).zzb(l);
            ((zzdrc)localObject2).zza(paramString);
            localObject2 = ((zzdrc)localObject2).zzc().zzb();
            this.zzc.put(localObject1, localObject2);
            this.zzb.zzh(l);
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Created H5 rewarded #");
            ((StringBuilder)localObject1).append(l);
            ((StringBuilder)localObject1).append(" with ad unit ");
            ((StringBuilder)localObject1).append(paramString);
            zze.zza(((StringBuilder)localObject1).toString());
            return;
          case 2: 
            paramString = (zzdrb)this.zzc.get(Long.valueOf(l));
            if (paramString == null)
            {
              zzbzt.zze("Could not show H5 ad, object ID does not exist");
              this.zzb.zzf(l);
              return;
            }
            paramString.zzc();
            return;
          case 1: 
            localObject1 = (zzdrb)this.zzc.get(Long.valueOf(l));
            if (localObject1 == null)
            {
              zzbzt.zze("Could not load H5 ad, object ID does not exist");
              this.zzb.zzf(l);
              return;
            }
            ((zzdrb)localObject1).zzb(zzc(paramString));
            return;
          }
          i = this.zzc.size();
          localObject1 = zzbbk.zziZ;
          if (i >= ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue())
          {
            zzbzt.zzj("Could not create H5 ad, too many existing objects");
            this.zzb.zzi(l);
            return;
          }
          localObject2 = this.zzc;
          localObject1 = Long.valueOf(l);
          if (((Map)localObject2).containsKey(localObject1))
          {
            zzbzt.zze("Could not create H5 ad, object ID already exists");
            this.zzb.zzi(l);
            return;
          }
          paramString = (String)paramString.get("ad_unit");
          if (TextUtils.isEmpty(paramString))
          {
            zzbzt.zzj("Could not create H5 ad, missing ad unit id");
            this.zzb.zzi(l);
            return;
          }
          localObject2 = this.zza.zzb();
          ((zzdrc)localObject2).zzb(l);
          ((zzdrc)localObject2).zza(paramString);
          localObject2 = ((zzdrc)localObject2).zzc().zza();
          this.zzc.put(localObject1, localObject2);
          this.zzb.zzh(l);
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Created H5 interstitial #");
          ((StringBuilder)localObject1).append(l);
          ((StringBuilder)localObject1).append(" with ad unit ");
          ((StringBuilder)localObject1).append(paramString);
          zze.zza(((StringBuilder)localObject1).toString());
          return;
        }
        catch (NumberFormatException|NullPointerException paramString)
        {
          zzbzt.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(localObject1)));
          return;
        }
      }
      paramString = this.zzc.values().iterator();
      while (paramString.hasNext()) {
        ((zzdrb)paramString.next()).zza();
      }
      this.zzc.clear();
      return;
    }
    this.zzc.clear();
    this.zzb.zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */