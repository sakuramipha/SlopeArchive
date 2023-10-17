package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

public final class zzcfx
  extends zzdp
{
  private final zzccc zza;
  private final Object zzb = new Object();
  private final boolean zzc;
  private final boolean zzd;
  private int zze;
  private zzdt zzf;
  private boolean zzg;
  private boolean zzh = true;
  private float zzi;
  private float zzj;
  private float zzk;
  private boolean zzl;
  private boolean zzm;
  private zzbfy zzn;
  
  public zzcfx(zzccc paramzzccc, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zza = paramzzccc;
    this.zzi = paramFloat;
    this.zzc = paramBoolean1;
    this.zzd = paramBoolean2;
  }
  
  private final void zzw(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    zzcag.zze.execute(new zzcfw(this, paramInt1, paramInt2, paramBoolean1, paramBoolean2));
  }
  
  private final void zzx(String paramString, Map paramMap)
  {
    if (paramMap == null) {
      paramMap = new HashMap();
    } else {
      paramMap = new HashMap(paramMap);
    }
    paramMap.put("action", paramString);
    zzcag.zze.execute(new zzcfv(this, paramMap));
  }
  
  public final void zzc(float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean, float paramFloat3)
  {
    synchronized (this.zzb)
    {
      float f = this.zzi;
      int j = 1;
      int i = j;
      if (paramFloat2 == f) {
        if (paramFloat3 != this.zzk) {
          i = j;
        } else {
          i = 0;
        }
      }
      this.zzi = paramFloat2;
      this.zzj = paramFloat1;
      boolean bool = this.zzh;
      this.zzh = paramBoolean;
      j = this.zze;
      this.zze = paramInt;
      paramFloat1 = this.zzk;
      this.zzk = paramFloat3;
      if (Math.abs(paramFloat3 - paramFloat1) > 1.0E-4F) {
        this.zza.zzF().invalidate();
      }
      if (i != 0) {
        try
        {
          ??? = this.zzn;
          if (??? != null) {
            ((zzbfy)???).zze();
          }
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
        }
      }
      zzw(j, paramInt, bool, paramBoolean);
      return;
    }
  }
  
  public final float zze()
  {
    synchronized (this.zzb)
    {
      float f = this.zzk;
      return f;
    }
  }
  
  public final float zzf()
  {
    synchronized (this.zzb)
    {
      float f = this.zzj;
      return f;
    }
  }
  
  public final float zzg()
  {
    synchronized (this.zzb)
    {
      float f = this.zzi;
      return f;
    }
  }
  
  public final int zzh()
  {
    synchronized (this.zzb)
    {
      int i = this.zze;
      return i;
    }
  }
  
  public final zzdt zzi()
    throws RemoteException
  {
    synchronized (this.zzb)
    {
      zzdt localzzdt = this.zzf;
      return localzzdt;
    }
  }
  
  public final void zzj(boolean paramBoolean)
  {
    String str;
    if (true != paramBoolean) {
      str = "unmute";
    } else {
      str = "mute";
    }
    zzx(str, null);
  }
  
  public final void zzk()
  {
    zzx("pause", null);
  }
  
  public final void zzl()
  {
    zzx("play", null);
  }
  
  public final void zzm(zzdt paramzzdt)
  {
    synchronized (this.zzb)
    {
      this.zzf = paramzzdt;
      return;
    }
  }
  
  public final void zzn()
  {
    zzx("stop", null);
  }
  
  public final boolean zzo()
  {
    boolean bool3 = zzp();
    Object localObject2 = this.zzb;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (!bool3)
    {
      bool1 = bool2;
      try
      {
        if (this.zzm)
        {
          bool1 = bool2;
          if (this.zzd) {
            bool1 = true;
          }
        }
      }
      finally
      {
        break label55;
      }
    }
    return bool1;
    label55:
    throw ((Throwable)localObject1);
  }
  
  public final boolean zzp()
  {
    synchronized (this.zzb)
    {
      boolean bool3 = this.zzc;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (this.zzl) {
          bool1 = true;
        }
      }
      return bool1;
    }
  }
  
  public final boolean zzq()
  {
    synchronized (this.zzb)
    {
      boolean bool = this.zzh;
      return bool;
    }
  }
  
  public final void zzs(zzfl arg1)
  {
    boolean bool2 = ???.zza;
    boolean bool3 = ???.zzb;
    boolean bool1 = ???.zzc;
    synchronized (this.zzb)
    {
      this.zzl = bool3;
      this.zzm = bool1;
      if (true != bool2) {
        ??? = "0";
      } else {
        ??? = "1";
      }
      String str1;
      if (true != bool3) {
        str1 = "0";
      } else {
        str1 = "1";
      }
      String str2;
      if (true != bool1) {
        str2 = "0";
      } else {
        str2 = "1";
      }
      zzx("initialState", CollectionUtils.mapOf("muteStart", ???, "customControlsRequested", str1, "clickToExpandRequested", str2));
      return;
    }
  }
  
  public final void zzt(float paramFloat)
  {
    synchronized (this.zzb)
    {
      this.zzj = paramFloat;
      return;
    }
  }
  
  public final void zzu()
  {
    synchronized (this.zzb)
    {
      boolean bool = this.zzh;
      int i = this.zze;
      this.zze = 3;
      zzw(i, 3, bool, bool);
      return;
    }
  }
  
  public final void zzv(zzbfy paramzzbfy)
  {
    synchronized (this.zzb)
    {
      this.zzn = paramzzbfy;
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcfx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */