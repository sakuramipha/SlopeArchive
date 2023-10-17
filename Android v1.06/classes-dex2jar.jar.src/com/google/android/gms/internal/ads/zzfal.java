package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class zzfal
{
  public static Bundle zza(Bundle paramBundle, String paramString)
  {
    paramString = paramBundle.getBundle(paramString);
    paramBundle = paramString;
    if (paramString == null) {
      paramBundle = new Bundle();
    }
    return paramBundle;
  }
  
  public static void zzb(Bundle paramBundle1, String paramString, Bundle paramBundle2)
  {
    if (paramBundle2 != null) {
      paramBundle1.putBundle(paramString, paramBundle2);
    }
  }
  
  public static void zzc(Bundle paramBundle, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      paramBundle.putString(paramString1, paramString2);
    }
  }
  
  public static void zzd(Bundle paramBundle, String paramString, List paramList)
  {
    if (paramList != null) {
      paramBundle.putStringArrayList(paramString, new ArrayList(paramList));
    }
  }
  
  public static void zze(Bundle paramBundle, String paramString, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramBundle.putInt(paramString, paramInt);
    }
  }
  
  public static void zzf(Bundle paramBundle, String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramString2 != null)) {
      paramBundle.putString(paramString1, paramString2);
    }
  }
  
  public static void zzg(Bundle paramBundle, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2) {
      paramBundle.putBoolean(paramString, paramBoolean1);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */