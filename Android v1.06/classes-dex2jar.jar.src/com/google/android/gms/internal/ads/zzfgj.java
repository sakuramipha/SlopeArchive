package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class zzfgj
{
  private final Context zza;
  private final Executor zzb;
  private final zzbzy zzc;
  private final zzfft zzd;
  
  zzfgj(Context paramContext, Executor paramExecutor, zzbzy paramzzbzy, zzfft paramzzfft)
  {
    this.zza = paramContext;
    this.zzb = paramExecutor;
    this.zzc = paramzzbzy;
    this.zzd = paramzzfft;
  }
  
  public final void zzc(String paramString, zzffq paramzzffq)
  {
    if ((zzfft.zza()) && (((Boolean)zzbcw.zzd.zze()).booleanValue()))
    {
      this.zzb.execute(new zzfgi(this, paramString, paramzzffq));
      return;
    }
    this.zzb.execute(new zzfgh(this, paramString));
  }
  
  public final void zzd(List paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      zzc((String)paramList.next(), null);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfgj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */