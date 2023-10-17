package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.Nonnull;

public final class zzbsr
{
  @Nonnull
  private View zza;
  private final Map zzb = new HashMap();
  
  public final zzbsr zzb(View paramView)
  {
    this.zza = paramView;
    return this;
  }
  
  public final zzbsr zzc(Map paramMap)
  {
    this.zzb.clear();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      View localView = (View)localEntry.getValue();
      if (localView != null) {
        this.zzb.put((String)localEntry.getKey(), new WeakReference(localView));
      }
    }
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbsr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */