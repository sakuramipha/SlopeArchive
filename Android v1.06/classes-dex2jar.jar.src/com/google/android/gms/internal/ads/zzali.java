package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class zzali
  implements Comparable
{
  private final zzalt zza;
  private final int zzb;
  private final String zzc;
  private final int zzd;
  private final Object zze;
  private final zzalm zzf;
  private Integer zzg;
  private zzall zzh;
  private boolean zzi;
  private zzakr zzj;
  private zzalh zzk;
  private final zzakw zzl;
  
  public zzali(int paramInt, String paramString, zzalm paramzzalm)
  {
    zzalt localzzalt;
    if (zzalt.zza) {
      localzzalt = new zzalt();
    } else {
      localzzalt = null;
    }
    this.zza = localzzalt;
    this.zze = new Object();
    int i = 0;
    this.zzi = false;
    this.zzj = null;
    this.zzb = paramInt;
    this.zzc = paramString;
    this.zzf = paramzzalm;
    this.zzl = new zzakw();
    paramInt = i;
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = Uri.parse(paramString);
      paramInt = i;
      if (paramString != null)
      {
        paramString = paramString.getHost();
        paramInt = i;
        if (paramString != null) {
          paramInt = paramString.hashCode();
        }
      }
    }
    this.zzd = paramInt;
  }
  
  public final String toString()
  {
    String str2 = String.valueOf(Integer.toHexString(this.zzd));
    zzw();
    String str1 = this.zzc;
    Integer localInteger = this.zzg;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[ ] ");
    localStringBuilder.append(str1);
    localStringBuilder.append(" ");
    localStringBuilder.append("0x".concat(str2));
    localStringBuilder.append(" NORMAL ");
    localStringBuilder.append(localInteger);
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    return this.zzb;
  }
  
  public final int zzb()
  {
    return this.zzl.zzb();
  }
  
  public final int zzc()
  {
    return this.zzd;
  }
  
  public final zzakr zzd()
  {
    return this.zzj;
  }
  
  public final zzali zze(zzakr paramzzakr)
  {
    this.zzj = paramzzakr;
    return this;
  }
  
  public final zzali zzf(zzall paramzzall)
  {
    this.zzh = paramzzall;
    return this;
  }
  
  public final zzali zzg(int paramInt)
  {
    this.zzg = Integer.valueOf(paramInt);
    return this;
  }
  
  protected abstract zzalo zzh(zzale paramzzale);
  
  public final String zzj()
  {
    String str2 = this.zzc;
    String str1 = str2;
    if (this.zzb != 0)
    {
      str1 = Integer.toString(1);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str1);
      localStringBuilder.append("-");
      localStringBuilder.append(str2);
      str1 = localStringBuilder.toString();
    }
    return str1;
  }
  
  public final String zzk()
  {
    return this.zzc;
  }
  
  public Map zzl()
    throws zzakq
  {
    return Collections.emptyMap();
  }
  
  public final void zzm(String paramString)
  {
    if (zzalt.zza) {
      this.zza.zza(paramString, Thread.currentThread().getId());
    }
  }
  
  public final void zzn(zzalr paramzzalr)
  {
    synchronized (this.zze)
    {
      zzalm localzzalm = this.zzf;
      if (localzzalm != null) {
        localzzalm.zza(paramzzalr);
      }
      return;
    }
  }
  
  protected abstract void zzo(Object paramObject);
  
  final void zzp(String paramString)
  {
    zzall localzzall = this.zzh;
    if (localzzall != null) {
      localzzall.zzb(this);
    }
    if (zzalt.zza)
    {
      long l = Thread.currentThread().getId();
      if (Looper.myLooper() != Looper.getMainLooper())
      {
        new Handler(Looper.getMainLooper()).post(new zzalg(this, paramString, l));
        return;
      }
      this.zza.zza(paramString, l);
      this.zza.zzb(toString());
    }
  }
  
  public final void zzq()
  {
    synchronized (this.zze)
    {
      this.zzi = true;
      return;
    }
  }
  
  final void zzr()
  {
    synchronized (this.zze)
    {
      zzalh localzzalh = this.zzk;
      if (localzzalh != null) {
        localzzalh.zza(this);
      }
      return;
    }
  }
  
  final void zzs(zzalo paramzzalo)
  {
    synchronized (this.zze)
    {
      zzalh localzzalh = this.zzk;
      if (localzzalh != null) {
        localzzalh.zzb(this, paramzzalo);
      }
      return;
    }
  }
  
  final void zzt(int paramInt)
  {
    zzall localzzall = this.zzh;
    if (localzzall != null) {
      localzzall.zzc(this, paramInt);
    }
  }
  
  final void zzu(zzalh paramzzalh)
  {
    synchronized (this.zze)
    {
      this.zzk = paramzzalh;
      return;
    }
  }
  
  public final boolean zzv()
  {
    synchronized (this.zze)
    {
      boolean bool = this.zzi;
      return bool;
    }
  }
  
  public final boolean zzw()
  {
    synchronized (this.zze)
    {
      return false;
    }
  }
  
  public byte[] zzx()
    throws zzakq
  {
    return null;
  }
  
  public final zzakw zzy()
  {
    return this.zzl;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzali.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */