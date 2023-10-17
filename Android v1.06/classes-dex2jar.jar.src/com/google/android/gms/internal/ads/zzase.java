package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

public final class zzase
  extends zzatf
{
  private static final zzatg zzi = new zzatg();
  private final Context zzj;
  
  public zzase(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2, Context paramContext)
  {
    super(paramzzarr, "PfXuYpXR8QASWK08ChzzefD8h4IQvIx6Xugf6O+BJbFGNBOs3F9abkomDjkEKIY/", "e8c4x8hx2nAUk6VVuY651BKZ4rbinGDtu4h/2o24aJo=", paramzzano, paramInt1, 29);
    this.zzj = paramContext;
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    this.zze.zzn("E");
    Object localObject2 = zzi.zza(this.zzj.getPackageName());
    if (((AtomicReference)localObject2).get() == null) {
      try
      {
        if (((AtomicReference)localObject2).get() == null) {
          ((AtomicReference)localObject2).set((String)this.zzf.invoke(null, new Object[] { this.zzj }));
        }
      }
      finally {}
    }
    localObject2 = (String)((AtomicReference)localObject2).get();
    synchronized (this.zze)
    {
      this.zze.zzn(zzapb.zza(((String)localObject2).getBytes(), true));
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */