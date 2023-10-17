package com.google.android.gms.internal.games_v2;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.zzg;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbr
{
  private static final AtomicReference zza = new AtomicReference();
  private final Application zzb;
  private final zzau zzc;
  private final zzg zzd;
  
  private zzbr(Application paramApplication, zzau paramzzau, zzg paramzzg)
  {
    this.zzb = paramApplication;
    this.zzc = paramzzau;
    this.zzd = paramzzg;
  }
  
  public static Application zza()
  {
    zzb();
    return ((zzbr)zza.get()).zzb;
  }
  
  public static void zzb()
  {
    boolean bool;
    if (zza.get() != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.");
  }
  
  public static void zzc(Context paramContext)
  {
    boolean bool;
    if (paramContext != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    AtomicReference localAtomicReference = zza;
    if ((zzbr)localAtomicReference.get() == null)
    {
      Context localContext = paramContext.getApplicationContext();
      if (localContext != null) {
        paramContext = (Application)localContext;
      } else {
        paramContext = (Application)paramContext;
      }
      paramContext = new zzbr(paramContext, zzau.zza(paramContext), zzg.zzb(paramContext));
      do
      {
        if (localAtomicReference.compareAndSet(null, paramContext))
        {
          paramContext.zzc.zzc();
          paramContext.zzd.zzh();
          return;
        }
      } while (localAtomicReference.get() == null);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */