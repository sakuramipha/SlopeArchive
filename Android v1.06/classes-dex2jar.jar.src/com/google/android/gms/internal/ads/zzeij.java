package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzl;

public final class zzeij
  extends zzbm
{
  private final zzejq zza;
  
  public zzeij(Context paramContext, zzcgw paramzzcgw, zzezy paramzzezy, zzdhn paramzzdhn, zzbh paramzzbh)
  {
    paramzzdhn = new zzejs(paramzzdhn, paramzzcgw.zzx());
    paramzzdhn.zze(paramzzbh);
    this.zza = new zzejq(new zzekc(paramzzcgw, paramContext, paramzzdhn, paramzzezy), paramzzezy.zzI());
  }
  
  public final String zze()
  {
    try
    {
      String str = this.zza.zza();
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zzf()
  {
    try
    {
      String str = this.zza.zzb();
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzg(zzl paramzzl)
    throws RemoteException
  {
    this.zza.zzd(paramzzl, 1);
  }
  
  public final void zzh(zzl paramzzl, int paramInt)
    throws RemoteException
  {
    try
    {
      this.zza.zzd(paramzzl, paramInt);
      return;
    }
    finally
    {
      paramzzl = finally;
      throw paramzzl;
    }
  }
  
  public final boolean zzi()
    throws RemoteException
  {
    try
    {
      boolean bool = this.zza.zze();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */