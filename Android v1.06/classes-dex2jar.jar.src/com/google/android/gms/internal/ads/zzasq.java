package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzasq
  extends zzatf
{
  private final zzaqu zzi;
  private final long zzj;
  private final long zzk;
  
  public zzasq(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2, zzaqu paramzzaqu, long paramLong1, long paramLong2)
  {
    super(paramzzarr, "Bdd/SXecSODrNYWNMJakrwr0suwau+ZSaygsyNqj5IcjiKGPVCNYxfh9jESu1wRd", "Cb3a/0oybs716dPr7UCf4ZWTrxhPatWThTypQohUWkM=", paramzzano, paramInt1, 11);
    this.zzi = paramzzaqu;
    this.zzj = paramLong1;
    this.zzk = paramLong2;
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    ??? = this.zzi;
    if (??? != null)
    {
      zzaqs localzzaqs = new zzaqs((String)this.zzf.invoke(null, new Object[] { ((zzaqu)???).zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk) }));
      synchronized (this.zze)
      {
        this.zze.zzz(localzzaqs.zza.longValue());
        if (localzzaqs.zzb.longValue() >= 0L) {
          this.zze.zzQ(localzzaqs.zzb.longValue());
        }
        if (localzzaqs.zzc.longValue() >= 0L) {
          this.zze.zzf(localzzaqs.zzc.longValue());
        }
        return;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */