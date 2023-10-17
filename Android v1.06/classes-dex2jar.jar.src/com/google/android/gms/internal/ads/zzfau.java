package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzfau
{
  public static void zza(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      zzbzt.zzi("This request is sent from a test device.");
      return;
    }
    zzay.zzb();
    paramContext = zzbzm.zzy(paramContext);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
    localStringBuilder.append(paramContext);
    localStringBuilder.append("\")) to get test ads on this device.");
    zzbzt.zzi(localStringBuilder.toString());
  }
  
  public static void zzb(int paramInt, Throwable paramThrowable, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Ad failed to load : ");
    localStringBuilder.append(paramInt);
    zzbzt.zzi(localStringBuilder.toString());
    zze.zzb(paramString, paramThrowable);
    if (paramInt == 3) {
      return;
    }
    zzt.zzo().zzt(paramThrowable, paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */