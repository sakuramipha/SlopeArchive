package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzbzm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class zzp
{
  public static final zzp zza = new zzp();
  
  public final zzl zza(Context paramContext, zzdx paramzzdx)
  {
    Object localObject1 = paramzzdx.zzn();
    long l;
    if (localObject1 != null) {
      l = ((Date)localObject1).getTime();
    } else {
      l = -1L;
    }
    String str1 = paramzzdx.zzk();
    int j = paramzzdx.zza();
    localObject1 = paramzzdx.zzq();
    if (!((Set)localObject1).isEmpty()) {
      localObject1 = Collections.unmodifiableList(new ArrayList((Collection)localObject1));
    } else {
      localObject1 = null;
    }
    boolean bool1 = paramzzdx.zzs(paramContext);
    Bundle localBundle = paramzzdx.zzf(AdMobAdapter.class);
    String str2 = paramzzdx.zzl();
    Object localObject2 = paramzzdx.zzi();
    if (localObject2 != null) {
      localObject2 = new zzfh((SearchAdRequest)localObject2);
    } else {
      localObject2 = null;
    }
    paramContext = paramContext.getApplicationContext();
    if (paramContext != null)
    {
      paramContext = paramContext.getPackageName();
      zzay.zzb();
      paramContext = zzbzm.zzq(Thread.currentThread().getStackTrace(), paramContext);
    }
    else
    {
      paramContext = null;
    }
    boolean bool2 = paramzzdx.zzr();
    RequestConfiguration localRequestConfiguration = zzej.zzf().zzc();
    int i = Math.max(paramzzdx.zzc(), localRequestConfiguration.getTagForChildDirectedTreatment());
    String str3 = (String)Collections.max(Arrays.asList(new String[] { null, localRequestConfiguration.getMaxAdContentRating() }), zzo.zza);
    List localList = paramzzdx.zzo();
    return new zzl(8, l, localBundle, j, (List)localObject1, bool1, i, false, str2, (zzfh)localObject2, null, str1, paramzzdx.zzg(), paramzzdx.zze(), Collections.unmodifiableList(new ArrayList(paramzzdx.zzp())), paramzzdx.zzm(), paramContext, bool2, null, localRequestConfiguration.getTagForUnderAgeOfConsent(), str3, localList, paramzzdx.zzb(), paramzzdx.zzj());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */