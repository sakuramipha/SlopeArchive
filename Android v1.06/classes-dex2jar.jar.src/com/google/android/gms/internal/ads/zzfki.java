package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public final class zzfki
{
  final File zza;
  private final File zzb;
  private final SharedPreferences zzc;
  private final int zzd;
  
  public zzfki(Context paramContext, int paramInt)
  {
    this.zzc = paramContext.getSharedPreferences("pcvmspf", 0);
    File localFile = paramContext.getDir("pccache", 0);
    zzfkj.zza(localFile, false);
    this.zzb = localFile;
    paramContext = paramContext.getDir("tmppccache", 0);
    zzfkj.zza(paramContext, true);
    this.zza = paramContext;
    this.zzd = paramInt;
  }
  
  private final File zzd()
  {
    File localFile = new File(this.zzb, Integer.toString(this.zzd - 1));
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    return localFile;
  }
  
  private final String zze()
  {
    int i = this.zzd;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FBAMTD");
    localStringBuilder.append(i - 1);
    return localStringBuilder.toString();
  }
  
  private final String zzf()
  {
    int i = this.zzd;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LATMTD");
    localStringBuilder.append(i - 1);
    return localStringBuilder.toString();
  }
  
  public final boolean zza(zzatk paramzzatk, zzfko paramzzfko)
  {
    Object localObject3 = paramzzatk.zzd().zzk();
    Object localObject2 = paramzzatk.zzf().zzA();
    Object localObject1 = paramzzatk.zze().zzA();
    boolean bool = TextUtils.isEmpty((CharSequence)localObject3);
    int i = 0;
    if ((!bool) && (localObject1 != null) && (localObject1.length != 0))
    {
      zzfkj.zzd(this.zza);
      this.zza.mkdirs();
      zzfkj.zzc((String)localObject3, this.zza).mkdirs();
      File localFile = zzfkj.zzb((String)localObject3, "pcam.jar", this.zza);
      if (((localObject2 == null) || (localObject2.length <= 0) || (zzfkj.zze(localFile, (byte[])localObject2))) && (zzfkj.zze(zzfkj.zzb((String)localObject3, "pcbc", this.zza), (byte[])localObject1)))
      {
        localObject1 = zzfkj.zzb(paramzzatk.zzd().zzk(), "pcam.jar", this.zza);
        if ((((File)localObject1).exists()) && (paramzzfko != null) && (!paramzzfko.zza((File)localObject1))) {
          return false;
        }
        localObject3 = paramzzatk.zzd().zzk();
        if (TextUtils.isEmpty((CharSequence)localObject3)) {}
        do
        {
          do
          {
            bool = false;
            break;
            paramzzfko = zzfkj.zzb((String)localObject3, "pcam.jar", this.zza);
            localObject2 = zzfkj.zzb((String)localObject3, "pcbc", this.zza);
            localObject1 = zzfkj.zzb((String)localObject3, "pcam.jar", zzd());
            localObject3 = zzfkj.zzb((String)localObject3, "pcbc", zzd());
          } while (((paramzzfko.exists()) && (!paramzzfko.renameTo((File)localObject1))) || (!((File)localObject2).exists()) || (!((File)localObject2).renameTo((File)localObject3)));
          paramzzfko = zzatn.zze();
          paramzzfko.zze(paramzzatk.zzd().zzk());
          paramzzfko.zza(paramzzatk.zzd().zzj());
          paramzzfko.zzb(paramzzatk.zzd().zza());
          paramzzfko.zzd(paramzzatk.zzd().zzd());
          paramzzfko.zzc(paramzzatk.zzd().zzc());
          paramzzfko = (zzatn)paramzzfko.zzal();
          localObject1 = zzb(1);
          paramzzatk = this.zzc.edit();
          if ((localObject1 != null) && (!paramzzfko.zzk().equals(((zzatn)localObject1).zzk()))) {
            paramzzatk.putString(zze(), Hex.bytesToStringLowercase(((zzgmx)localObject1).zzax()));
          }
          paramzzatk.putString(zzf(), Hex.bytesToStringLowercase(paramzzfko.zzax()));
        } while (!paramzzatk.commit());
        bool = true;
        paramzzatk = new HashSet();
        paramzzfko = zzb(1);
        if (paramzzfko != null) {
          paramzzatk.add(paramzzfko.zzk());
        }
        paramzzfko = zzb(2);
        if (paramzzfko != null) {
          paramzzatk.add(paramzzfko.zzk());
        }
        localObject1 = zzd().listFiles();
        int j = localObject1.length;
        while (i < j)
        {
          paramzzfko = localObject1[i].getName();
          if (!paramzzatk.contains(paramzzfko)) {
            zzfkj.zzd(zzfkj.zzc(paramzzfko, zzd()));
          }
          i++;
        }
        return bool;
      }
    }
    return false;
  }
  
  final zzatn zzb(int paramInt)
  {
    Object localObject1;
    if (paramInt == 1) {
      localObject1 = this.zzc.getString(zzf(), null);
    } else {
      localObject1 = this.zzc.getString(zze(), null);
    }
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      return null;
    }
    try
    {
      Object localObject2 = Hex.stringToBytes((String)localObject1);
      localObject1 = zzgno.zzb;
      zzatn localzzatn = zzatn.zzh(zzgno.zzv((byte[])localObject2, 0, localObject2.length));
      String str = localzzatn.zzk();
      localObject2 = zzfkj.zzb(str, "pcam.jar", zzd());
      localObject1 = localObject2;
      if (!((File)localObject2).exists()) {
        localObject1 = zzfkj.zzb(str, "pcam", zzd());
      }
      localObject2 = zzfkj.zzb(str, "pcbc", zzd());
      if (((File)localObject1).exists())
      {
        boolean bool = ((File)localObject2).exists();
        if (bool) {
          return localzzatn;
        }
      }
    }
    catch (zzgpi localzzgpi)
    {
      for (;;) {}
    }
    return null;
  }
  
  public final zzfkh zzc(int paramInt)
  {
    zzatn localzzatn = zzb(1);
    if (localzzatn == null) {
      return null;
    }
    String str = localzzatn.zzk();
    File localFile2 = zzfkj.zzb(str, "pcam.jar", zzd());
    File localFile1 = localFile2;
    if (!localFile2.exists()) {
      localFile1 = zzfkj.zzb(str, "pcam", zzd());
    }
    localFile2 = zzfkj.zzb(str, "pcopt", zzd());
    return new zzfkh(localzzatn, localFile1, zzfkj.zzb(str, "pcbc", zzd()), localFile2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */