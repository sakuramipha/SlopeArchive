package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public final class zzasv
  extends zzatf
{
  private List zzi = null;
  private final Context zzj;
  
  public zzasv(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2, Context paramContext)
  {
    super(paramzzarr, "giiWqjx/aw0vfIeusCr0d5j05N3KWpgqLVDV7vWRzJE/pZfKVhVFd0wNllaUtOAl", "cxQLOgxIjd5GqHFd887UzcTVGYJaF4w3kSTCXM9zwKU=", paramzzano, paramInt1, 31);
    this.zzj = paramContext;
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    this.zze.zzW(-1L);
    this.zze.zzS(-1L);
    Context localContext = this.zzj;
    ??? = localContext;
    if (localContext == null) {
      ??? = this.zzb.zzb();
    }
    if (this.zzi == null) {
      this.zzi = ((List)this.zzf.invoke(null, new Object[] { ??? }));
    }
    ??? = this.zzi;
    if ((??? != null) && (((List)???).size() == 2)) {
      synchronized (this.zze)
      {
        this.zze.zzW(((Long)this.zzi.get(0)).longValue());
        this.zze.zzS(((Long)this.zzi.get(1)).longValue());
        return;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */