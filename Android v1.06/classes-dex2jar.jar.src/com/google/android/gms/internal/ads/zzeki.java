package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.List;

public final class zzeki
  implements zzeqq
{
  private final zzfwc zza;
  private final zzfwc zzb;
  private final Context zzc;
  private final zzfaa zzd;
  private final View zze;
  
  public zzeki(zzfwc paramzzfwc1, zzfwc paramzzfwc2, Context paramContext, zzfaa paramzzfaa, ViewGroup paramViewGroup)
  {
    this.zza = paramzzfwc1;
    this.zzb = paramzzfwc2;
    this.zzc = paramContext;
    this.zzd = paramzzfaa;
    this.zze = paramViewGroup;
  }
  
  private final List zze()
  {
    ArrayList localArrayList = new ArrayList();
    ViewParent localViewParent;
    for (Object localObject = this.zze; localObject != null; localObject = (View)localViewParent)
    {
      localViewParent = ((View)localObject).getParent();
      if (localViewParent == null) {
        break;
      }
      int i;
      if ((localViewParent instanceof ViewGroup)) {
        i = ((ViewGroup)localViewParent).indexOfChild((View)localObject);
      } else {
        i = -1;
      }
      localObject = new Bundle();
      ((Bundle)localObject).putString("type", localViewParent.getClass().getName());
      ((Bundle)localObject).putInt("index_of_child", i);
      localArrayList.add(localObject);
      if (!(localViewParent instanceof View)) {
        break;
      }
    }
    return localArrayList;
  }
  
  public final int zza()
  {
    return 3;
  }
  
  public final zzfwb zzb()
  {
    zzbbk.zza(this.zzc);
    zzbbc localzzbbc = zzbbk.zzjA;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return this.zzb.zzb(new zzekg(this));
    }
    return this.zza.zzb(new zzekh(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */