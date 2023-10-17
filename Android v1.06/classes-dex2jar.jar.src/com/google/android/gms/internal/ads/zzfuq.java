package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

abstract class zzfuq
  extends zzfuw
{
  private static final Logger zza = Logger.getLogger(zzfuq.class.getName());
  @CheckForNull
  private zzfrm zzb;
  private final boolean zzc;
  private final boolean zze;
  
  zzfuq(zzfrm paramzzfrm, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramzzfrm.size());
    Objects.requireNonNull(paramzzfrm);
    this.zzb = paramzzfrm;
    this.zzc = paramBoolean1;
    this.zze = paramBoolean2;
  }
  
  private final void zzH(int paramInt, Future paramFuture)
  {
    try
    {
      try
      {
        zzg(paramInt, zzfvr.zzo(paramFuture));
        return;
      }
      catch (Error paramFuture) {}catch (RuntimeException paramFuture) {}
      zzJ(paramFuture);
      return;
    }
    catch (ExecutionException paramFuture)
    {
      zzJ(paramFuture.getCause());
    }
  }
  
  private final void zzI(@CheckForNull zzfrm paramzzfrm)
  {
    int j = zzB();
    int i = 0;
    boolean bool;
    if (j >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzfoz.zzi(bool, "Less than 0 remaining futures");
    if (j == 0)
    {
      if (paramzzfrm != null)
      {
        paramzzfrm = paramzzfrm.zze();
        while (paramzzfrm.hasNext())
        {
          Future localFuture = (Future)paramzzfrm.next();
          if (!localFuture.isCancelled()) {
            zzH(i, localFuture);
          }
          i++;
        }
      }
      zzG();
      zzv();
      zzz(2);
    }
  }
  
  private final void zzJ(Throwable paramThrowable)
  {
    Objects.requireNonNull(paramThrowable);
    if ((this.zzc) && (!zze(paramThrowable)) && (zzL(zzD(), paramThrowable)))
    {
      zzK(paramThrowable);
      return;
    }
    if ((paramThrowable instanceof Error)) {
      zzK(paramThrowable);
    }
  }
  
  private static void zzK(Throwable paramThrowable)
  {
    String str;
    if (true != paramThrowable instanceof Error) {
      str = "Got more than one input Future failure. Logging failures after the first";
    } else {
      str = "Input Future failed with Error";
    }
    zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, paramThrowable);
  }
  
  private static boolean zzL(Set paramSet, Throwable paramThrowable)
  {
    while (paramThrowable != null)
    {
      if (!paramSet.add(paramThrowable)) {
        return false;
      }
      paramThrowable = paramThrowable.getCause();
    }
    return true;
  }
  
  @CheckForNull
  protected final String zza()
  {
    zzfrm localzzfrm = this.zzb;
    if (localzzfrm != null) {
      return "futures=".concat(localzzfrm.toString());
    }
    return super.zza();
  }
  
  protected final void zzb()
  {
    Object localObject = this.zzb;
    boolean bool1 = true;
    zzz(1);
    boolean bool2 = isCancelled();
    if (localObject == null) {
      bool1 = false;
    }
    if ((bool1 & bool2))
    {
      bool2 = zzu();
      localObject = ((zzfrm)localObject).zze();
      while (((Iterator)localObject).hasNext()) {
        ((Future)((Iterator)localObject).next()).cancel(bool2);
      }
    }
  }
  
  final void zzf(Set paramSet)
  {
    Objects.requireNonNull(paramSet);
    if (!isCancelled())
    {
      Throwable localThrowable = zzm();
      localThrowable.getClass();
      zzL(paramSet, localThrowable);
    }
  }
  
  abstract void zzg(int paramInt, Object paramObject);
  
  abstract void zzv();
  
  final void zzw()
  {
    Object localObject = this.zzb;
    localObject.getClass();
    if (((zzfrm)localObject).isEmpty())
    {
      zzv();
      return;
    }
    if (this.zzc)
    {
      localzzftr = this.zzb.zze();
      for (int i = 0; localzzftr.hasNext(); i++)
      {
        localObject = (zzfwb)localzzftr.next();
        ((zzfwb)localObject).zzc(new zzfuo(this, (zzfwb)localObject, i), zzfvf.zza);
      }
    }
    if (this.zze) {
      localObject = this.zzb;
    } else {
      localObject = null;
    }
    localObject = new zzfup(this, (zzfrm)localObject);
    zzftr localzzftr = this.zzb.zze();
    while (localzzftr.hasNext()) {
      ((zzfwb)localzzftr.next()).zzc((Runnable)localObject, zzfvf.zza);
    }
  }
  
  void zzz(int paramInt)
  {
    this.zzb = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfuq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */