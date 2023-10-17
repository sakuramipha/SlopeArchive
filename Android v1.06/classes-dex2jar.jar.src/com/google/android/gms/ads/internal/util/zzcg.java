package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzcg
{
  private final BroadcastReceiver zza = new zzcf(this);
  private final Map zzb = new WeakHashMap();
  private boolean zzc = false;
  private boolean zzd;
  private Context zze;
  
  private final void zze(Context paramContext, Intent paramIntent)
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = this.zzb.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (((IntentFilter)localEntry.getValue()).hasAction(paramIntent.getAction())) {
          localArrayList.add((BroadcastReceiver)localEntry.getKey());
        }
      }
      int j = localArrayList.size();
      for (int i = 0; i < j; i++) {
        ((BroadcastReceiver)localArrayList.get(i)).onReceive(paramContext, paramIntent);
      }
      return;
    }
    finally {}
  }
  
  public final void zzb(Context paramContext)
  {
    try
    {
      boolean bool = this.zzc;
      if (bool) {
        return;
      }
      Object localObject = paramContext.getApplicationContext();
      this.zze = ((Context)localObject);
      if (localObject == null) {
        this.zze = paramContext;
      }
      zzbbk.zza(this.zze);
      paramContext = zzbbk.zzdz;
      this.zzd = ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
      paramContext = new android/content/IntentFilter;
      paramContext.<init>();
      paramContext.addAction("android.intent.action.SCREEN_ON");
      paramContext.addAction("android.intent.action.SCREEN_OFF");
      paramContext.addAction("android.intent.action.USER_PRESENT");
      localObject = zzbbk.zzjx;
      if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (Build.VERSION.SDK_INT >= 33)) {
        this.zze.registerReceiver(this.zza, paramContext, 4);
      } else {
        this.zze.registerReceiver(this.zza, paramContext);
      }
      this.zzc = true;
      return;
    }
    finally {}
  }
  
  public final void zzc(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    try
    {
      if (this.zzd)
      {
        this.zzb.put(paramBroadcastReceiver, paramIntentFilter);
        return;
      }
      zzbbk.zza(paramContext);
      zzbbc localzzbbc = zzbbk.zzjx;
      if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (Build.VERSION.SDK_INT >= 33))
      {
        paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, 4);
        return;
      }
      paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter);
      return;
    }
    finally {}
  }
  
  public final void zzd(Context paramContext, BroadcastReceiver paramBroadcastReceiver)
  {
    try
    {
      if (this.zzd)
      {
        this.zzb.remove(paramBroadcastReceiver);
        return;
      }
      paramContext.unregisterReceiver(paramBroadcastReceiver);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzcg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */