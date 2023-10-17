package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class zzbyv
{
  private final Clock zza;
  private final zzbzg zzb;
  private final LinkedList zzc;
  private final Object zzd = new Object();
  private final String zze;
  private final String zzf;
  private long zzg = -1L;
  private long zzh = -1L;
  private long zzi = 0L;
  private long zzj = -1L;
  private long zzk = -1L;
  
  zzbyv(Clock paramClock, zzbzg paramzzbzg, String paramString1, String paramString2)
  {
    this.zza = paramClock;
    this.zzb = paramzzbzg;
    this.zze = paramString1;
    this.zzf = paramString2;
    this.zzc = new LinkedList();
  }
  
  public final Bundle zza()
  {
    synchronized (this.zzd)
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("seq_num", this.zze);
      localBundle.putString("slotid", this.zzf);
      localBundle.putBoolean("ismediation", false);
      localBundle.putLong("treq", this.zzj);
      localBundle.putLong("tresponse", this.zzk);
      localBundle.putLong("timp", this.zzg);
      localBundle.putLong("tload", this.zzh);
      localBundle.putLong("pcc", this.zzi);
      localBundle.putLong("tfetch", -1L);
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = this.zzc.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((zzbyu)localIterator.next()).zzb());
      }
      localBundle.putParcelableArrayList("tclick", localArrayList);
      return localBundle;
    }
  }
  
  public final String zzc()
  {
    return this.zze;
  }
  
  public final void zzd()
  {
    synchronized (this.zzd)
    {
      if (this.zzk != -1L)
      {
        zzbyu localzzbyu = new com/google/android/gms/internal/ads/zzbyu;
        localzzbyu.<init>(this);
        localzzbyu.zzd();
        this.zzc.add(localzzbyu);
        this.zzi += 1L;
        this.zzb.zze();
        this.zzb.zzd(this);
      }
      return;
    }
  }
  
  public final void zze()
  {
    synchronized (this.zzd)
    {
      if ((this.zzk != -1L) && (!this.zzc.isEmpty()))
      {
        zzbyu localzzbyu = (zzbyu)this.zzc.getLast();
        if (localzzbyu.zza() == -1L)
        {
          localzzbyu.zzc();
          this.zzb.zzd(this);
        }
      }
      return;
    }
  }
  
  public final void zzf()
  {
    synchronized (this.zzd)
    {
      if ((this.zzk != -1L) && (this.zzg == -1L))
      {
        this.zzg = this.zza.elapsedRealtime();
        this.zzb.zzd(this);
      }
      this.zzb.zzf();
      return;
    }
  }
  
  public final void zzg()
  {
    synchronized (this.zzd)
    {
      this.zzb.zzg();
      return;
    }
  }
  
  public final void zzh(boolean paramBoolean)
  {
    synchronized (this.zzd)
    {
      if (this.zzk != -1L) {
        this.zzh = this.zza.elapsedRealtime();
      }
      return;
    }
  }
  
  public final void zzi()
  {
    synchronized (this.zzd)
    {
      this.zzb.zzh();
      return;
    }
  }
  
  public final void zzj(zzl paramzzl)
  {
    synchronized (this.zzd)
    {
      long l = this.zza.elapsedRealtime();
      this.zzj = l;
      this.zzb.zzi(paramzzl, l);
      return;
    }
  }
  
  public final void zzk(long paramLong)
  {
    synchronized (this.zzd)
    {
      this.zzk = paramLong;
      if (paramLong != -1L) {
        this.zzb.zzd(this);
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */