package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.List;

public final class zzffh
  implements zzfff
{
  private final Context zza;
  private long zzb = 0L;
  private long zzc = -1L;
  private boolean zzd = false;
  private int zze = 0;
  private String zzf = "";
  private String zzg = "";
  private String zzh = "";
  private String zzi = "";
  private String zzj = "";
  private String zzk = "";
  private String zzl = "";
  private boolean zzm = false;
  private boolean zzn = false;
  private final int zzo;
  private int zzp = 2;
  private int zzq = 2;
  
  zzffh(Context paramContext, int paramInt)
  {
    this.zza = paramContext;
    this.zzo = paramInt;
  }
  
  public final zzffh zzH(int paramInt)
  {
    try
    {
      this.zzp = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzj()
  {
    try
    {
      boolean bool = this.zzn;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzk()
  {
    return !TextUtils.isEmpty(this.zzh);
  }
  
  public final zzffj zzl()
  {
    try
    {
      boolean bool = this.zzm;
      if (bool) {
        return null;
      }
      this.zzm = true;
      if (!this.zzn) {
        zzx();
      }
      if (this.zzc < 0L) {
        zzy();
      }
      zzffj localzzffj = new zzffj(this, null);
      return localzzffj;
    }
    finally {}
  }
  
  public final zzffh zzq(zze paramzze)
  {
    try
    {
      paramzze = paramzze.zze;
      if (paramzze == null) {
        return this;
      }
      paramzze = (zzcvb)paramzze;
      String str = paramzze.zzk();
      if (!TextUtils.isEmpty(str)) {
        this.zzf = str;
      }
      paramzze = paramzze.zzi();
      if (!TextUtils.isEmpty(paramzze)) {
        this.zzg = paramzze;
      }
      return this;
    }
    finally {}
  }
  
  public final zzffh zzr(zzezq paramzzezq)
  {
    try
    {
      if (!TextUtils.isEmpty(paramzzezq.zzb.zzb)) {
        this.zzf = paramzzezq.zzb.zzb;
      }
      paramzzezq = paramzzezq.zza.iterator();
      while (paramzzezq.hasNext())
      {
        zzezf localzzezf = (zzezf)paramzzezq.next();
        if (!TextUtils.isEmpty(localzzezf.zzac)) {
          this.zzg = localzzezf.zzac;
        }
      }
      return this;
    }
    finally {}
  }
  
  public final zzffh zzs(String paramString)
  {
    try
    {
      zzbbc localzzbbc = zzbbk.zzim;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        this.zzl = paramString;
      }
      return this;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final zzffh zzt(String paramString)
  {
    try
    {
      this.zzh = paramString;
      return this;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final zzffh zzu(String paramString)
  {
    try
    {
      this.zzi = paramString;
      return this;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final zzffh zzv(boolean paramBoolean)
  {
    try
    {
      this.zzd = paramBoolean;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzffh zzw(Throwable paramThrowable)
  {
    try
    {
      zzbbc localzzbbc = zzbbk.zzim;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        this.zzk = zzbsy.zzd(paramThrowable);
        paramThrowable = zzbsy.zzc(paramThrowable);
        this.zzj = ((String)zzfpm.zzc(zzfok.zzc('\n')).zzd(paramThrowable).iterator().next());
      }
      return this;
    }
    finally
    {
      paramThrowable = finally;
      throw paramThrowable;
    }
  }
  
  public final zzffh zzx()
  {
    try
    {
      this.zze = zzt.zzq().zzn(this.zza);
      Object localObject1 = this.zza.getResources();
      int i = 2;
      if (localObject1 != null)
      {
        localObject1 = ((Resources)localObject1).getConfiguration();
        if (localObject1 != null) {
          if (((Configuration)localObject1).orientation == 2) {
            i = 4;
          } else {
            i = 3;
          }
        }
      }
      this.zzq = i;
      this.zzb = zzt.zzB().elapsedRealtime();
      this.zzn = true;
      return this;
    }
    finally {}
  }
  
  public final zzffh zzy()
  {
    try
    {
      this.zzc = zzt.zzB().elapsedRealtime();
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzffh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */