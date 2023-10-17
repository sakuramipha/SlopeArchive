package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

final class zzfuf$zzg
  extends zzfuf.zza
{
  private zzfuf$zzg()
  {
    super(null);
  }
  
  final zzfuf.zzd zza(zzfuf paramzzfuf, zzfuf.zzd paramzzd)
  {
    try
    {
      zzfuf.zzd localzzd = zzfuf.zzi(paramzzfuf);
      if (localzzd != paramzzd) {
        zzfuf.zzn(paramzzfuf, paramzzd);
      }
      return localzzd;
    }
    finally {}
  }
  
  final zzfuf.zzk zzb(zzfuf paramzzfuf, zzfuf.zzk paramzzk)
  {
    try
    {
      zzfuf.zzk localzzk = zzfuf.zzj(paramzzfuf);
      if (localzzk != paramzzk) {
        zzfuf.zzp(paramzzfuf, paramzzk);
      }
      return localzzk;
    }
    finally {}
  }
  
  final void zzc(zzfuf.zzk paramzzk1, @CheckForNull zzfuf.zzk paramzzk2)
  {
    paramzzk1.next = paramzzk2;
  }
  
  final void zzd(zzfuf.zzk paramzzk, Thread paramThread)
  {
    paramzzk.thread = paramThread;
  }
  
  final boolean zze(zzfuf paramzzfuf, @CheckForNull zzfuf.zzd paramzzd1, zzfuf.zzd paramzzd2)
  {
    try
    {
      if (zzfuf.zzi(paramzzfuf) == paramzzd1)
      {
        zzfuf.zzn(paramzzfuf, paramzzd2);
        return true;
      }
      return false;
    }
    finally {}
  }
  
  final boolean zzf(zzfuf paramzzfuf, @CheckForNull Object paramObject1, Object paramObject2)
  {
    try
    {
      if (zzfuf.zzk(paramzzfuf) == paramObject1)
      {
        zzfuf.zzo(paramzzfuf, paramObject2);
        return true;
      }
      return false;
    }
    finally {}
  }
  
  final boolean zzg(zzfuf paramzzfuf, @CheckForNull zzfuf.zzk paramzzk1, @CheckForNull zzfuf.zzk paramzzk2)
  {
    try
    {
      if (zzfuf.zzj(paramzzfuf) == paramzzk1)
      {
        zzfuf.zzp(paramzzfuf, paramzzk2);
        return true;
      }
      return false;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfuf$zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */