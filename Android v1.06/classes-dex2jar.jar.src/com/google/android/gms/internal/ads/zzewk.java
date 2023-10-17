package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzewk
{
  public static void zza(AtomicReference paramAtomicReference, zzewj paramzzewj)
  {
    paramAtomicReference = paramAtomicReference.get();
    if (paramAtomicReference == null) {
      return;
    }
    try
    {
      paramzzewj.zza(paramAtomicReference);
      return;
    }
    catch (NullPointerException paramAtomicReference)
    {
      zzbzt.zzk("NullPointerException occurs when invoking a method from a delegating listener.", paramAtomicReference);
      return;
    }
    catch (RemoteException paramAtomicReference)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramAtomicReference);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzewk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */