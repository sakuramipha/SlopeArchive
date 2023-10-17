package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nullable;

public class GoogleSignatureVerifier
{
  @Nullable
  private static GoogleSignatureVerifier zza;
  private final Context zzb;
  private volatile String zzc;
  
  public GoogleSignatureVerifier(Context paramContext)
  {
    this.zzb = paramContext.getApplicationContext();
  }
  
  public static GoogleSignatureVerifier getInstance(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    try
    {
      if (zza == null)
      {
        zzm.zzd(paramContext);
        GoogleSignatureVerifier localGoogleSignatureVerifier = new com/google/android/gms/common/GoogleSignatureVerifier;
        localGoogleSignatureVerifier.<init>(paramContext);
        zza = localGoogleSignatureVerifier;
      }
      return zza;
    }
    finally {}
  }
  
  @Nullable
  static final zzi zza(PackageInfo paramPackageInfo, zzi... paramVarArgs)
  {
    if (paramPackageInfo.signatures == null) {
      return null;
    }
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    }
    paramPackageInfo = paramPackageInfo.signatures;
    int i = 0;
    paramPackageInfo = new zzj(paramPackageInfo[0].toByteArray());
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals(paramPackageInfo)) {
        return paramVarArgs[i];
      }
      i++;
    }
    return null;
  }
  
  public static final boolean zzb(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if ((paramPackageInfo != null) && (paramPackageInfo.signatures != null))
    {
      if (paramBoolean) {
        paramPackageInfo = zza(paramPackageInfo, zzl.zza);
      } else {
        paramPackageInfo = zza(paramPackageInfo, new zzi[] { zzl.zza[0] });
      }
      if (paramPackageInfo != null) {
        return true;
      }
    }
    return false;
  }
  
  private final zzw zzc(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramString == null) {
      return zzw.zzc("null pkg");
    }
    if (!paramString.equals(this.zzc))
    {
      zzw localzzw;
      if (zzm.zze()) {
        localzzw = zzm.zzb(paramString, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb), false, false);
      }
      try
      {
        PackageInfo localPackageInfo = this.zzb.getPackageManager().getPackageInfo(paramString, 64);
        paramBoolean1 = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
        if (localPackageInfo == null)
        {
          localzzw = zzw.zzc("null pkg");
        }
        else if ((localPackageInfo.signatures != null) && (localPackageInfo.signatures.length == 1))
        {
          zzj localzzj = new zzj(localPackageInfo.signatures[0].toByteArray());
          String str = localPackageInfo.packageName;
          localzzw = zzm.zza(str, localzzj, paramBoolean1, false);
          if ((localzzw.zza) && (localPackageInfo.applicationInfo != null) && ((localPackageInfo.applicationInfo.flags & 0x2) != 0) && (zzm.zza(str, localzzj, false, true).zza)) {
            localzzw = zzw.zzc("debuggable release cert app rejected");
          }
        }
        else
        {
          localzzw = zzw.zzc("single cert required");
        }
        if (localzzw.zza) {
          this.zzc = paramString;
        }
        return localzzw;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        if (paramString.length() != 0) {
          paramString = "no pkg ".concat(paramString);
        } else {
          paramString = new String("no pkg ");
        }
        return zzw.zzd(paramString, localNameNotFoundException);
      }
    }
    return zzw.zzb();
  }
  
  public boolean isGooglePublicSignedPackage(PackageInfo paramPackageInfo)
  {
    if (paramPackageInfo == null) {
      return false;
    }
    if (zzb(paramPackageInfo, false)) {
      return true;
    }
    if (zzb(paramPackageInfo, true))
    {
      if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
        return true;
      }
      Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    }
    return false;
  }
  
  public boolean isPackageGoogleSigned(String paramString)
  {
    paramString = zzc(paramString, false, false);
    paramString.zze();
    return paramString.zza;
  }
  
  public boolean isUidGoogleSigned(int paramInt)
  {
    String[] arrayOfString = this.zzb.getPackageManager().getPackagesForUid(paramInt);
    if (arrayOfString != null)
    {
      int i = arrayOfString.length;
      if (i != 0)
      {
        localzzw = null;
        for (paramInt = 0; paramInt < i; paramInt++)
        {
          localzzw = zzc(arrayOfString[paramInt], false, false);
          if (localzzw.zza) {
            break label79;
          }
        }
        Preconditions.checkNotNull(localzzw);
        break label79;
      }
    }
    zzw localzzw = zzw.zzc("no pkgs");
    label79:
    localzzw.zze();
    return localzzw.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\GoogleSignatureVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */