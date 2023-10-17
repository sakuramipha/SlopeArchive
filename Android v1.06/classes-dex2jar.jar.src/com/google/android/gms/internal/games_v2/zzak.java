package com.google.android.gms.internal.games_v2;

import java.util.concurrent.atomic.AtomicReference;

public abstract class zzak
{
  private final AtomicReference zza = new AtomicReference();
  
  protected abstract zzaj zza();
  
  public final void zzb()
  {
    zzaj localzzaj = (zzaj)this.zza.get();
    if (localzzaj != null) {
      localzzaj.zzd();
    }
  }
  
  public final void zzc(String paramString, int paramInt)
  {
    Object localObject2 = (zzaj)this.zza.get();
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = zza();
      localObject2 = this.zza;
      while (!((AtomicReference)localObject2).compareAndSet(null, localObject1)) {
        if (((AtomicReference)localObject2).get() != null) {
          localObject1 = (zzaj)this.zza.get();
        }
      }
    }
    ((zzaj)localObject1).zzc(paramString, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */