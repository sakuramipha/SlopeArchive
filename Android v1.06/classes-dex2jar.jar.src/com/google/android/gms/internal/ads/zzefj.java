package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

final class zzefj
  implements zzfvn
{
  final zzefk zzg;
  
  zzefj(zzefk paramzzefk, long paramLong, String paramString, zzezf paramzzezf, zzezi paramzzezi, zzfgf paramzzfgf, zzezr paramzzezr) {}
  
  public final void zza(Throwable paramThrowable)
  {
    long l = zzefk.zzd(this.zzg).elapsedRealtime() - this.zza;
    boolean bool = paramThrowable instanceof TimeoutException;
    int i = 6;
    if (bool)
    {
      localObject1 = null;
      i = 2;
    }
    else if ((paramThrowable instanceof zzeex))
    {
      localObject1 = null;
      i = 3;
    }
    else if ((paramThrowable instanceof CancellationException))
    {
      localObject1 = null;
      i = 4;
    }
    else if ((paramThrowable instanceof zzfaf))
    {
      localObject1 = null;
      i = 5;
    }
    else
    {
      int j = i;
      if ((paramThrowable instanceof zzdtz))
      {
        if (zzfba.zza(paramThrowable).zza == 3) {
          i = 1;
        }
        localObject1 = zzbbk.zzby;
        j = i;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          j = i;
          if ((paramThrowable instanceof zzebz))
          {
            localObject1 = ((zzebz)paramThrowable).zzb();
            j = i;
            if (localObject1 != null)
            {
              localObject1 = Integer.valueOf(((zze)localObject1).zza);
              break label175;
            }
          }
        }
      }
      localObject1 = null;
      i = j;
    }
    label175:
    zzefk.zzg(this.zzg, this.zzb, i, l, this.zzc.zzag, (Integer)localObject1);
    Object localObject1 = this.zzg;
    Object localObject3;
    Object localObject4;
    Object localObject2;
    if (zzefk.zzh((zzefk)localObject1))
    {
      localObject3 = zzefk.zzb((zzefk)localObject1);
      localObject4 = this.zzd;
      localObject2 = this.zzc;
      if ((paramThrowable instanceof zzebz)) {
        localObject1 = (zzebz)paramThrowable;
      } else {
        localObject1 = null;
      }
      ((zzefl)localObject3).zza((zzezi)localObject4, (zzezf)localObject2, i, (zzebz)localObject1, l);
    }
    localObject1 = zzbbk.zzhR;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
    {
      localObject4 = zzefk.zzc(this.zzg);
      localObject2 = this.zze;
      localObject3 = this.zzf;
      localObject1 = this.zzc;
      ((zzfgj)localObject4).zzd(((zzfgf)localObject2).zzc((zzezr)localObject3, (zzezf)localObject1, ((zzezf)localObject1).zzo));
    }
    localObject1 = zzfba.zza(paramThrowable);
    i = ((zze)localObject1).zza;
    if (i != 3)
    {
      paramThrowable = (Throwable)localObject1;
      if (i != 0) {}
    }
    else
    {
      localObject2 = ((zze)localObject1).zzd;
      paramThrowable = (Throwable)localObject1;
      if (localObject2 != null)
      {
        paramThrowable = (Throwable)localObject1;
        if (!((zze)localObject2).zzc.equals("com.google.android.gms.ads")) {
          paramThrowable = zzfba.zza(new zzebz(13, ((zze)localObject1).zzd));
        }
      }
    }
    zzefk.zza(this.zzg).zze(this.zzc, l, paramThrowable);
  }
  
  public final void zzb(Object paramObject)
  {
    long l = zzefk.zzd(this.zzg).elapsedRealtime() - this.zza;
    zzefk.zzg(this.zzg, this.zzb, 0, l, this.zzc.zzag, null);
    paramObject = this.zzg;
    if (zzefk.zzh((zzefk)paramObject)) {
      zzefk.zzb((zzefk)paramObject).zza(this.zzd, this.zzc, 0, null, l);
    }
    zzefk.zza(this.zzg).zzf(this.zzc, l, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzefj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */