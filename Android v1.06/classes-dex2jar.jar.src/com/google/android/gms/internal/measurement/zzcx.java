package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.internal.zzga;

final class zzcx
  extends zzdt
{
  final zzee zze;
  
  zzcx(zzee paramzzee, String paramString1, String paramString2, Context paramContext, Bundle paramBundle)
  {
    super(paramzzee, true);
  }
  
  public final void zza()
  {
    try
    {
      Object localObject1;
      String str1;
      String str2;
      if (zzee.zzQ(this.zze, this.zza, this.zzb))
      {
        localObject1 = this.zzb;
        str1 = this.zza;
        str2 = zzee.zzi(this.zze);
      }
      else
      {
        str2 = null;
        str1 = null;
        localObject1 = str1;
      }
      Preconditions.checkNotNull(this.zzc);
      Object localObject2 = this.zze;
      zzee.zzr((zzee)localObject2, ((zzee)localObject2).zzf(this.zzc, true));
      if (zzee.zze(this.zze) == null)
      {
        Log.w(zzee.zzi(this.zze), "Failed to connect to measurement client.");
        return;
      }
      int k = DynamiteModule.getLocalVersion(this.zzc, "com.google.android.gms.measurement.dynamite");
      int j = DynamiteModule.getRemoteVersion(this.zzc, "com.google.android.gms.measurement.dynamite");
      int i = Math.max(k, j);
      boolean bool;
      if (j < k) {
        bool = true;
      } else {
        bool = false;
      }
      localObject2 = new com/google/android/gms/internal/measurement/zzcl;
      ((zzcl)localObject2).<init>(61000L, i, bool, str2, str1, (String)localObject1, this.zzd, zzga.zza(this.zzc));
      ((zzcc)Preconditions.checkNotNull(zzee.zze(this.zze))).initialize(ObjectWrapper.wrap(this.zzc), (zzcl)localObject2, this.zzh);
      return;
    }
    catch (Exception localException)
    {
      zzee.zzs(this.zze, localException, true, false);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */