package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzatc
  extends zzatf
{
  private final View zzi;
  
  public zzatc(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2, View paramView)
  {
    super(paramzzarr, "sZcaWvHk5YMGi5Y+Upjcj5xXN/uJAE5+o93AJh0tgcKgvaqPrd4dFC6HKBJZfNCh", "Sax58YmBV76Rsz+gTyIxls7MHtcGZGY5FRuTBSGuOW4=", paramzzano, paramInt1, 57);
    this.zzi = paramView;
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    if (this.zzi != null)
    {
      Object localObject1 = zzbbk.zzdb;
      localObject1 = (Boolean)zzba.zzc().zzb((zzbbc)localObject1);
      Object localObject2 = zzbbk.zzjv;
      localObject2 = (Boolean)zzba.zzc().zzb((zzbbc)localObject2);
      Object localObject3 = this.zzb.zzb().getResources().getDisplayMetrics();
      zzarv localzzarv = new zzarv((String)this.zzf.invoke(null, new Object[] { this.zzi, localObject3, localObject1, localObject2 }));
      localObject3 = zzaok.zza();
      ((zzaoj)localObject3).zzb(localzzarv.zza.longValue());
      ((zzaoj)localObject3).zzd(localzzarv.zzb.longValue());
      ((zzaoj)localObject3).zze(localzzarv.zzc.longValue());
      if (((Boolean)localObject2).booleanValue()) {
        ((zzaoj)localObject3).zzc(localzzarv.zze.longValue());
      }
      if (((Boolean)localObject1).booleanValue()) {
        ((zzaoj)localObject3).zza(localzzarv.zzd.longValue());
      }
      this.zze.zzY((zzaok)((zzgos)localObject3).zzal());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzatc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */