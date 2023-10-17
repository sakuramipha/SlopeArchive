package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzfhy
{
  private final HashMap zza = new HashMap();
  private final HashMap zzb = new HashMap();
  private final HashMap zzc = new HashMap();
  private final HashSet zzd = new HashSet();
  private final HashSet zze = new HashSet();
  private final HashSet zzf = new HashSet();
  private final HashMap zzg = new HashMap();
  private final Map zzh = new WeakHashMap();
  private boolean zzi;
  
  public final View zza(String paramString)
  {
    return (View)this.zzc.get(paramString);
  }
  
  public final zzfhx zzb(View paramView)
  {
    zzfhx localzzfhx = (zzfhx)this.zzb.get(paramView);
    if (localzzfhx != null) {
      this.zzb.remove(paramView);
    }
    return localzzfhx;
  }
  
  public final String zzc(String paramString)
  {
    return (String)this.zzg.get(paramString);
  }
  
  public final String zzd(View paramView)
  {
    if (this.zza.size() == 0) {
      return null;
    }
    String str = (String)this.zza.get(paramView);
    if (str != null) {
      this.zza.remove(paramView);
    }
    return str;
  }
  
  public final HashSet zze()
  {
    return this.zzf;
  }
  
  public final HashSet zzf()
  {
    return this.zze;
  }
  
  public final void zzg()
  {
    this.zza.clear();
    this.zzb.clear();
    this.zzc.clear();
    this.zzd.clear();
    this.zze.clear();
    this.zzf.clear();
    this.zzg.clear();
    this.zzi = false;
  }
  
  public final void zzh()
  {
    this.zzi = true;
  }
  
  public final void zzi()
  {
    Object localObject1 = zzfhd.zza();
    if (localObject1 != null)
    {
      Iterator localIterator = ((zzfhd)localObject1).zzb().iterator();
      while (localIterator.hasNext())
      {
        zzfgs localzzfgs = (zzfgs)localIterator.next();
        Object localObject2 = localzzfgs.zzf();
        if (localzzfgs.zzj())
        {
          String str = localzzfgs.zzh();
          if (localObject2 != null)
          {
            boolean bool = ((View)localObject2).isAttachedToWindow();
            View localView = null;
            Object localObject3;
            if (!bool)
            {
              localObject1 = "notAttached";
            }
            else
            {
              if (((View)localObject2).hasWindowFocus())
              {
                this.zzh.remove(localObject2);
                localObject1 = Boolean.valueOf(false);
              }
              else if (this.zzh.containsKey(localObject2))
              {
                localObject1 = (Boolean)this.zzh.get(localObject2);
              }
              else
              {
                localObject3 = this.zzh;
                localObject1 = Boolean.valueOf(false);
                ((Map)localObject3).put(localObject2, localObject1);
              }
              if (((Boolean)localObject1).booleanValue())
              {
                localObject1 = "noWindowFocus";
              }
              else
              {
                HashSet localHashSet = new HashSet();
                localObject1 = localObject2;
                while (localObject1 != null)
                {
                  localObject3 = zzfhw.zzb((View)localObject1);
                  if (localObject3 != null)
                  {
                    localObject1 = localObject3;
                    break label251;
                  }
                  localHashSet.add(localObject1);
                  localObject1 = ((View)localObject1).getParent();
                  if ((localObject1 instanceof View)) {
                    localObject1 = (View)localObject1;
                  } else {
                    localObject1 = null;
                  }
                }
                this.zzd.addAll(localHashSet);
                localObject1 = localView;
              }
            }
            label251:
            if (localObject1 == null)
            {
              this.zze.add(str);
              this.zza.put(localObject2, str);
              localObject1 = localzzfgs.zzi().iterator();
              while (((Iterator)localObject1).hasNext())
              {
                localObject2 = (zzfhf)((Iterator)localObject1).next();
                localView = (View)((zzfhf)localObject2).zzb().get();
                if (localView != null)
                {
                  localObject3 = (zzfhx)this.zzb.get(localView);
                  if (localObject3 != null) {
                    ((zzfhx)localObject3).zzc(localzzfgs.zzh());
                  } else {
                    this.zzb.put(localView, new zzfhx((zzfhf)localObject2, localzzfgs.zzh()));
                  }
                }
              }
            }
            else if (localObject1 != "noWindowFocus")
            {
              this.zzf.add(str);
              this.zzc.put(str, localObject2);
              this.zzg.put(str, localObject1);
            }
          }
          else
          {
            this.zzf.add(str);
            this.zzg.put(str, "noAdView");
          }
        }
      }
    }
  }
  
  public final boolean zzj(View paramView)
  {
    if (this.zzh.containsKey(paramView))
    {
      this.zzh.put(paramView, Boolean.valueOf(true));
      return false;
    }
    return true;
  }
  
  public final int zzk(View paramView)
  {
    if (this.zzd.contains(paramView)) {
      return 1;
    }
    if (this.zzi) {
      return 2;
    }
    return 3;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */