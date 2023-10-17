package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzetv
  implements zzgvo
{
  public static zzeqt zza(Context paramContext, zzbyq paramzzbyq, zzbyr paramzzbyr, Object paramObject, zzerl paramzzerl, zzetb paramzzetb, zzgvi paramzzgvi1, zzgvi paramzzgvi2, zzgvi paramzzgvi3, zzgvi paramzzgvi4, zzgvi paramzzgvi5, zzgvi paramzzgvi6, zzgvi paramzzgvi7, zzgvi paramzzgvi8, zzgvi paramzzgvi9, Executor paramExecutor, zzffq paramzzffq, zzdqc paramzzdqc)
  {
    paramzzbyr = (zzesu)paramObject;
    paramzzbyq = new HashSet();
    paramzzbyq.add(paramzzbyr);
    paramzzbyq.add(paramzzerl);
    paramzzbyq.add(paramzzetb);
    paramzzbyr = zzbbk.zzfv;
    if (((Boolean)zzba.zzc().zzb(paramzzbyr)).booleanValue()) {
      paramzzbyq.add((zzeqq)paramzzgvi1.zzb());
    }
    paramzzbyr = zzbbk.zzfw;
    if (((Boolean)zzba.zzc().zzb(paramzzbyr)).booleanValue()) {
      paramzzbyq.add((zzeqq)paramzzgvi2.zzb());
    }
    paramzzbyr = zzbbk.zzfx;
    if (((Boolean)zzba.zzc().zzb(paramzzbyr)).booleanValue()) {
      paramzzbyq.add((zzeqq)paramzzgvi3.zzb());
    }
    paramzzbyr = zzbbk.zzfy;
    if (((Boolean)zzba.zzc().zzb(paramzzbyr)).booleanValue()) {
      paramzzbyq.add((zzeqq)paramzzgvi4.zzb());
    }
    paramzzbyr = zzbbk.zzfC;
    if (((Boolean)zzba.zzc().zzb(paramzzbyr)).booleanValue()) {
      paramzzbyq.add((zzeqq)paramzzgvi6.zzb());
    }
    paramzzbyr = zzbbk.zzfD;
    if (((Boolean)zzba.zzc().zzb(paramzzbyr)).booleanValue()) {
      paramzzbyq.add((zzeqq)paramzzgvi7.zzb());
    }
    paramzzbyr = zzbbk.zzcA;
    if (((Boolean)zzba.zzc().zzb(paramzzbyr)).booleanValue()) {
      paramzzbyq.add((zzeqq)paramzzgvi9.zzb());
    }
    return new zzeqt(paramContext, paramExecutor, paramzzbyq, paramzzffq, paramzzdqc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzetv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */