package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public final class zzasm
  extends zzatf
{
  private final Map zzi;
  private final View zzj;
  private final Context zzk;
  
  public zzasm(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2, Map paramMap, View paramView, Context paramContext)
  {
    super(paramzzarr, "saBI+3h2Lt3SmMRiIzkSzE+qZwwlCo+f51BVnuQZD0hVVNns8vrAQWZ7UlWn/0b0", "BoYdDgxF0J4Z6qBFEz0Y0ptcEBy4vkae+v/aE6rWTPA=", paramzzano, paramInt1, 85);
    this.zzi = paramMap;
    this.zzj = paramView;
    this.zzk = paramContext;
  }
  
  private final long zzc(int paramInt)
  {
    Map localMap = this.zzi;
    Integer localInteger = Integer.valueOf(paramInt);
    if (localMap.containsKey(localInteger)) {
      return ((Long)this.zzi.get(localInteger)).longValue();
    }
    return Long.MIN_VALUE;
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    long l2 = zzc(1);
    long l1 = zzc(2);
    Object localObject2 = this.zzk;
    ??? = localObject2;
    if (localObject2 == null) {
      ??? = this.zzb.zzb();
    }
    Method localMethod = this.zzf;
    localObject2 = this.zzj;
    ??? = (long[])localMethod.invoke(null, new Object[] { { l2, l1 }, ???, localObject2 });
    l1 = ???[0];
    this.zzi.put(Integer.valueOf(1), Long.valueOf(???[1]));
    l2 = ???[2];
    this.zzi.put(Integer.valueOf(2), Long.valueOf(???[3]));
    synchronized (this.zze)
    {
      this.zze.zzv(l1);
      this.zze.zzu(l2);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */