package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public final class zzccw
  implements zzfx
{
  private final Context zza;
  private final zzfx zzb;
  private final String zzc;
  private final int zzd;
  private final boolean zze;
  private InputStream zzf;
  private boolean zzg;
  private Uri zzh;
  private volatile zzawj zzi;
  private boolean zzj;
  private boolean zzk;
  private final AtomicLong zzl;
  private zzgc zzm;
  
  public zzccw(Context paramContext, zzfx paramzzfx, String paramString, int paramInt, zzgz paramzzgz, zzccv paramzzccv)
  {
    this.zza = paramContext;
    this.zzb = paramzzfx;
    this.zzc = paramString;
    this.zzd = paramInt;
    this.zzj = false;
    this.zzk = false;
    this.zzl = new AtomicLong(-1L);
    paramContext = zzbbk.zzbJ;
    this.zze = ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
  }
  
  private final boolean zzg()
  {
    if (!this.zze) {
      return false;
    }
    zzbbc localzzbbc = zzbbk.zzeb;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (!this.zzj)) {
      return true;
    }
    localzzbbc = zzbbk.zzec;
    return (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (!this.zzk);
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (this.zzg)
    {
      InputStream localInputStream = this.zzf;
      if (localInputStream != null) {
        paramInt1 = localInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      } else {
        paramInt1 = this.zzb.zza(paramArrayOfByte, paramInt1, paramInt2);
      }
      return paramInt1;
    }
    throw new IOException("Attempt to read closed CacheDataSource.");
  }
  
  public final long zzb(zzgc paramzzgc)
    throws IOException
  {
    if (!this.zzg)
    {
      this.zzg = true;
      this.zzh = paramzzgc.zza;
      this.zzm = paramzzgc;
      this.zzi = zzawj.zza(paramzzgc.zza);
      Object localObject1 = zzbbk.zzdY;
      boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue();
      localObject1 = null;
      long l1;
      Object localObject2;
      if (bool)
      {
        if (this.zzi != null)
        {
          this.zzi.zzh = paramzzgc.zzf;
          this.zzi.zzi = zzfpo.zzc(this.zzc);
          this.zzi.zzj = this.zzd;
          if (this.zzi.zzg)
          {
            paramzzgc = zzbbk.zzea;
            paramzzgc = (Long)zzba.zzc().zzb(paramzzgc);
          }
          else
          {
            paramzzgc = zzbbk.zzdZ;
            paramzzgc = (Long)zzba.zzc().zzb(paramzzgc);
          }
          l1 = paramzzgc.longValue();
          zzt.zzB().elapsedRealtime();
          zzt.zzd();
          paramzzgc = zzawu.zza(this.zza, this.zzi);
          try
          {
            localObject1 = (zzawv)paramzzgc.get(l1, TimeUnit.MILLISECONDS);
            ((zzawv)localObject1).zzd();
            this.zzj = ((zzawv)localObject1).zzf();
            this.zzk = ((zzawv)localObject1).zze();
            ((zzawv)localObject1).zza();
            if (!zzg())
            {
              this.zzf = ((zzawv)localObject1).zzc();
              throw null;
            }
            throw null;
          }
          catch (InterruptedException localInterruptedException)
          {
            paramzzgc.cancel(false);
            Thread.currentThread().interrupt();
            throw null;
          }
          catch (ExecutionException|TimeoutException localExecutionException)
          {
            paramzzgc.cancel(false);
            throw null;
          }
          finally
          {
            zzt.zzB().elapsedRealtime();
          }
        }
      }
      else
      {
        if (this.zzi != null)
        {
          this.zzi.zzh = paramzzgc.zzf;
          this.zzi.zzi = zzfpo.zzc(this.zzc);
          this.zzi.zzj = this.zzd;
          localObject2 = zzt.zzc().zzb(this.zzi);
        }
        if ((localObject2 != null) && (((zzawg)localObject2).zze()))
        {
          this.zzj = ((zzawg)localObject2).zzg();
          this.zzk = ((zzawg)localObject2).zzf();
          if (!zzg())
          {
            this.zzf = ((zzawg)localObject2).zzc();
            return -1L;
          }
        }
      }
      if (this.zzi != null)
      {
        localObject2 = Uri.parse(this.zzi.zza);
        Object localObject3 = paramzzgc.zzc;
        long l3 = paramzzgc.zze;
        l1 = paramzzgc.zzf;
        long l2 = paramzzgc.zzg;
        localObject3 = paramzzgc.zzh;
        this.zzm = new zzgc((Uri)localObject2, null, l3, l1, l2, null, paramzzgc.zzi);
      }
      return this.zzb.zzb(this.zzm);
    }
    throw new IOException("Attempt to open an already open CacheDataSource.");
  }
  
  public final Uri zzc()
  {
    return this.zzh;
  }
  
  public final void zzd()
    throws IOException
  {
    if (this.zzg)
    {
      this.zzg = false;
      this.zzh = null;
      InputStream localInputStream = this.zzf;
      if (localInputStream != null)
      {
        IOUtils.closeQuietly(localInputStream);
        this.zzf = null;
        return;
      }
      this.zzb.zzd();
      return;
    }
    throw new IOException("Attempt to close an already closed CacheDataSource.");
  }
  
  public final void zzf(zzgz paramzzgz) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzccw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */