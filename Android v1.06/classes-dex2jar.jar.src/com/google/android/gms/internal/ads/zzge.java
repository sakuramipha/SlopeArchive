package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class zzge
  implements zzfx
{
  private final Context zza;
  private final List zzb;
  private final zzfx zzc;
  private zzfx zzd;
  private zzfx zze;
  private zzfx zzf;
  private zzfx zzg;
  private zzfx zzh;
  private zzfx zzi;
  private zzfx zzj;
  private zzfx zzk;
  
  public zzge(Context paramContext, zzfx paramzzfx)
  {
    this.zza = paramContext.getApplicationContext();
    this.zzc = paramzzfx;
    this.zzb = new ArrayList();
  }
  
  private final zzfx zzg()
  {
    if (this.zze == null)
    {
      zzfq localzzfq = new zzfq(this.zza);
      this.zze = localzzfq;
      zzh(localzzfq);
    }
    return this.zze;
  }
  
  private final void zzh(zzfx paramzzfx)
  {
    for (int i = 0; i < this.zzb.size(); i++) {
      paramzzfx.zzf((zzgz)this.zzb.get(i));
    }
  }
  
  private static final void zzi(zzfx paramzzfx, zzgz paramzzgz)
  {
    if (paramzzfx != null) {
      paramzzfx.zzf(paramzzgz);
    }
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    zzfx localzzfx = this.zzk;
    Objects.requireNonNull(localzzfx);
    return localzzfx.zza(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final long zzb(zzgc paramzzgc)
    throws IOException
  {
    boolean bool;
    if (this.zzk == null) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    Object localObject1 = paramzzgc.zza.getScheme();
    Object localObject3 = paramzzgc.zza;
    int i = zzfn.zza;
    localObject3 = ((Uri)localObject3).getScheme();
    Object localObject2;
    if ((!TextUtils.isEmpty((CharSequence)localObject3)) && (!"file".equals(localObject3)))
    {
      if ("asset".equals(localObject1))
      {
        this.zzk = zzg();
      }
      else if ("content".equals(localObject1))
      {
        if (this.zzf == null)
        {
          localObject1 = new zzfu(this.zza);
          this.zzf = ((zzfx)localObject1);
          zzh((zzfx)localObject1);
        }
        this.zzk = this.zzf;
      }
      else if ("rtmp".equals(localObject1))
      {
        if (this.zzg == null)
        {
          try
          {
            localObject1 = (zzfx)Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
            this.zzg = ((zzfx)localObject1);
            zzh((zzfx)localObject1);
          }
          catch (Exception paramzzgc)
          {
            throw new RuntimeException("Error instantiating RTMP extension", paramzzgc);
          }
          catch (ClassNotFoundException localClassNotFoundException)
          {
            zzer.zze("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
          }
          if (this.zzg == null) {
            this.zzg = this.zzc;
          }
        }
        this.zzk = this.zzg;
      }
      else if ("udp".equals(localClassNotFoundException))
      {
        if (this.zzh == null)
        {
          localObject2 = new zzhb(2000);
          this.zzh = ((zzfx)localObject2);
          zzh((zzfx)localObject2);
        }
        this.zzk = this.zzh;
      }
      else if ("data".equals(localObject2))
      {
        if (this.zzi == null)
        {
          localObject2 = new zzfv();
          this.zzi = ((zzfx)localObject2);
          zzh((zzfx)localObject2);
        }
        this.zzk = this.zzi;
      }
      else
      {
        if ((!"rawresource".equals(localObject2)) && (!"android.resource".equals(localObject2)))
        {
          localObject2 = this.zzc;
        }
        else
        {
          if (this.zzj == null)
          {
            localObject2 = new zzgx(this.zza);
            this.zzj = ((zzfx)localObject2);
            zzh((zzfx)localObject2);
          }
          localObject2 = this.zzj;
        }
        this.zzk = ((zzfx)localObject2);
      }
    }
    else
    {
      localObject2 = paramzzgc.zza.getPath();
      if ((localObject2 != null) && (((String)localObject2).startsWith("/android_asset/")))
      {
        this.zzk = zzg();
      }
      else
      {
        if (this.zzd == null)
        {
          localObject2 = new zzgn();
          this.zzd = ((zzfx)localObject2);
          zzh((zzfx)localObject2);
        }
        this.zzk = this.zzd;
      }
    }
    return this.zzk.zzb(paramzzgc);
  }
  
  public final Uri zzc()
  {
    zzfx localzzfx = this.zzk;
    if (localzzfx == null) {
      return null;
    }
    return localzzfx.zzc();
  }
  
  public final void zzd()
    throws IOException
  {
    zzfx localzzfx = this.zzk;
    if (localzzfx != null) {
      try
      {
        localzzfx.zzd();
        return;
      }
      finally
      {
        this.zzk = null;
      }
    }
  }
  
  public final Map zze()
  {
    Object localObject = this.zzk;
    if (localObject == null) {
      localObject = Collections.emptyMap();
    } else {
      localObject = ((zzfx)localObject).zze();
    }
    return (Map)localObject;
  }
  
  public final void zzf(zzgz paramzzgz)
  {
    Objects.requireNonNull(paramzzgz);
    this.zzc.zzf(paramzzgz);
    this.zzb.add(paramzzgz);
    zzi(this.zzd, paramzzgz);
    zzi(this.zze, paramzzgz);
    zzi(this.zzf, paramzzgz);
    zzi(this.zzg, paramzzgz);
    zzi(this.zzh, paramzzgz);
    zzi(this.zzi, paramzzgz);
    zzi(this.zzj, paramzzgz);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */