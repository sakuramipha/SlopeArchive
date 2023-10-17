package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public final class zzfkp
{
  private static final Object zza = new Object();
  private final Context zzb;
  private final SharedPreferences zzc;
  private final String zzd;
  private final zzfjw zze;
  private boolean zzf = false;
  
  public zzfkp(Context paramContext, int paramInt, zzfjw paramzzfjw, boolean paramBoolean)
  {
    this.zzb = paramContext;
    this.zzd = Integer.toString(paramInt - 1);
    this.zzc = paramContext.getSharedPreferences("pcvmspf", 0);
    this.zze = paramzzfjw;
    this.zzf = paramBoolean;
  }
  
  private final File zze(String paramString)
  {
    return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), paramString);
  }
  
  private static String zzf(zzatk paramzzatk)
  {
    zzatm localzzatm = zzatn.zze();
    localzzatm.zze(paramzzatk.zzd().zzk());
    localzzatm.zza(paramzzatk.zzd().zzj());
    localzzatm.zzb(paramzzatk.zzd().zza());
    localzzatm.zzd(paramzzatk.zzd().zzd());
    localzzatm.zzc(paramzzatk.zzd().zzc());
    return Hex.bytesToStringLowercase(((zzatn)localzzatm.zzal()).zzax());
  }
  
  private final String zzg()
  {
    return "FBAMTD".concat(String.valueOf(this.zzd));
  }
  
  private final String zzh()
  {
    return "LATMTD".concat(String.valueOf(this.zzd));
  }
  
  private final void zzi(int paramInt, long paramLong)
  {
    zzfjw localzzfjw = this.zze;
    if (localzzfjw != null) {
      localzzfjw.zza(paramInt, paramLong);
    }
  }
  
  private final void zzj(int paramInt, long paramLong, String paramString)
  {
    zzfjw localzzfjw = this.zze;
    if (localzzfjw != null) {
      localzzfjw.zzb(paramInt, paramLong, paramString);
    }
  }
  
  private final zzatn zzk(int paramInt)
  {
    Object localObject1;
    if (paramInt == 1) {
      localObject1 = this.zzc.getString(zzh(), null);
    } else {
      localObject1 = this.zzc.getString(zzg(), null);
    }
    if (localObject1 == null) {
      return null;
    }
    long l = System.currentTimeMillis();
    try
    {
      try
      {
        Object localObject2 = Hex.stringToBytes((String)localObject1);
        localObject1 = zzgno.zzb;
        localObject2 = zzgno.zzv((byte[])localObject2, 0, localObject2.length);
        if (this.zzf) {
          localObject1 = zzgoi.zza();
        } else {
          localObject1 = zzgoi.zzb();
        }
        localObject1 = zzatn.zzi((zzgno)localObject2, (zzgoi)localObject1);
        return (zzatn)localObject1;
      }
      catch (RuntimeException localRuntimeException)
      {
        zzi(2032, l);
      }
      catch (NullPointerException localNullPointerException)
      {
        zzi(2029, l);
      }
    }
    catch (zzgpi localzzgpi)
    {
      for (;;) {}
    }
    return null;
  }
  
  public final boolean zza(zzatk paramzzatk)
  {
    long l = System.currentTimeMillis();
    synchronized (zza)
    {
      File localFile = zze(paramzzatk.zzd().zzk());
      Object localObject2 = new java/io/File;
      ((File)localObject2).<init>(localFile, "pcbc");
      if (!zzfkj.zze((File)localObject2, paramzzatk.zze().zzA()))
      {
        zzi(4020, l);
        return false;
      }
      paramzzatk = zzf(paramzzatk);
      localObject2 = this.zzc.edit();
      ((SharedPreferences.Editor)localObject2).putString(zzh(), paramzzatk);
      boolean bool = ((SharedPreferences.Editor)localObject2).commit();
      if (bool) {
        zzi(5015, l);
      } else {
        zzi(4021, l);
      }
      return bool;
    }
  }
  
  public final boolean zzb(zzatk paramzzatk, zzfko paramzzfko)
  {
    long l1 = System.currentTimeMillis();
    synchronized (zza)
    {
      Object localObject1 = zzk(1);
      Object localObject4 = paramzzatk.zzd().zzk();
      int i = 0;
      if ((localObject1 != null) && (((zzatn)localObject1).zzk().equals(localObject4)))
      {
        zzi(4014, l1);
        return false;
      }
      long l2 = System.currentTimeMillis();
      Object localObject2 = zze((String)localObject4);
      boolean bool;
      if (((File)localObject2).exists())
      {
        bool = ((File)localObject2).isDirectory();
        localObject1 = "1";
        if (true != bool) {
          localObject1 = "0";
        }
        bool = ((File)localObject2).isFile();
        localObject2 = "1";
        if (true != bool) {
          localObject2 = "0";
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("d:");
        localStringBuilder.append((String)localObject1);
        localStringBuilder.append(",f:");
        localStringBuilder.append((String)localObject2);
        zzj(4023, l2, localStringBuilder.toString());
        zzi(4015, l2);
      }
      else if (!((File)localObject2).mkdirs())
      {
        bool = ((File)localObject2).canWrite();
        paramzzatk = "1";
        if (true != bool) {
          paramzzatk = "0";
        }
        zzj(4024, l2, "cw:".concat(paramzzatk));
        zzi(4015, l2);
        return false;
      }
      localObject4 = zze((String)localObject4);
      localObject1 = new java/io/File;
      ((File)localObject1).<init>((File)localObject4, "pcam.jar");
      localObject2 = new java/io/File;
      ((File)localObject2).<init>((File)localObject4, "pcbc");
      if (!zzfkj.zze((File)localObject1, paramzzatk.zzf().zzA()))
      {
        zzi(4016, l1);
        return false;
      }
      if (!zzfkj.zze((File)localObject2, paramzzatk.zze().zzA()))
      {
        zzi(4017, l1);
        return false;
      }
      if ((paramzzfko != null) && (!paramzzfko.zza((File)localObject1)))
      {
        zzi(4018, l1);
        zzfkj.zzd((File)localObject4);
        return false;
      }
      paramzzatk = zzf(paramzzatk);
      l2 = System.currentTimeMillis();
      localObject1 = this.zzc.getString(zzh(), null);
      paramzzfko = this.zzc.edit();
      paramzzfko.putString(zzh(), paramzzatk);
      if (localObject1 != null) {
        paramzzfko.putString(zzg(), (String)localObject1);
      }
      if (!paramzzfko.commit())
      {
        zzi(4019, l2);
        return false;
      }
      paramzzatk = new java/util/HashSet;
      paramzzatk.<init>();
      paramzzfko = zzk(1);
      if (paramzzfko != null) {
        paramzzatk.add(paramzzfko.zzk());
      }
      paramzzfko = zzk(2);
      if (paramzzfko != null) {
        paramzzatk.add(paramzzfko.zzk());
      }
      paramzzfko = new java/io/File;
      paramzzfko.<init>(this.zzb.getDir("pccache", 0), this.zzd);
      paramzzfko = paramzzfko.listFiles();
      int j = paramzzfko.length;
      while (i < j)
      {
        localObject1 = paramzzfko[i];
        if (!paramzzatk.contains(((File)localObject1).getName())) {
          zzfkj.zzd((File)localObject1);
        }
        i++;
      }
      zzi(5014, l1);
      return true;
    }
  }
  
  public final zzfkh zzc(int paramInt)
  {
    long l = System.currentTimeMillis();
    synchronized (zza)
    {
      zzatn localzzatn = zzk(1);
      if (localzzatn == null)
      {
        zzi(4022, l);
        return null;
      }
      Object localObject3 = zze(localzzatn.zzk());
      File localFile2 = new java/io/File;
      localFile2.<init>((File)localObject3, "pcam.jar");
      File localFile1 = localFile2;
      if (!localFile2.exists())
      {
        localFile1 = new java/io/File;
        localFile1.<init>((File)localObject3, "pcam");
      }
      localFile2 = new java/io/File;
      localFile2.<init>((File)localObject3, "pcbc");
      File localFile3 = new java/io/File;
      localFile3.<init>((File)localObject3, "pcopt");
      zzi(5016, l);
      localObject3 = new com/google/android/gms/internal/ads/zzfkh;
      ((zzfkh)localObject3).<init>(localzzatn, localFile1, localFile2, localFile3);
      return (zzfkh)localObject3;
    }
  }
  
  public final boolean zzd(int paramInt)
  {
    long l = System.currentTimeMillis();
    synchronized (zza)
    {
      Object localObject2 = zzk(1);
      if (localObject2 == null)
      {
        zzi(4025, l);
        return false;
      }
      localObject2 = zze(((zzatn)localObject2).zzk());
      File localFile = new java/io/File;
      localFile.<init>((File)localObject2, "pcam.jar");
      if (!localFile.exists())
      {
        zzi(4026, l);
        return false;
      }
      localFile = new java/io/File;
      localFile.<init>((File)localObject2, "pcbc");
      if (!localFile.exists())
      {
        zzi(4027, l);
        return false;
      }
      zzi(5019, l);
      return true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */