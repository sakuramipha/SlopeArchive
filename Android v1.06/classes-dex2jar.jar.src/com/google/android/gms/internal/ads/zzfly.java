package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import java.io.IOException;
import javax.annotation.Nullable;

final class zzfly
{
  private static zzfly zza;
  private final String zzb;
  private final SharedPreferences zzc;
  
  private zzfly(Context paramContext)
  {
    this.zzb = paramContext.getPackageName();
    this.zzc = paramContext.getSharedPreferences("paid_storage_sp", 0);
  }
  
  static zzfly zzb(Context paramContext)
  {
    if (zza == null) {
      zza = new zzfly(paramContext);
    }
    return zza;
  }
  
  final long zza(String paramString, long paramLong)
  {
    return this.zzc.getLong(paramString, -1L);
  }
  
  @Nullable
  final String zzc(String paramString1, String paramString2)
  {
    return this.zzc.getString(paramString1, null);
  }
  
  final void zzd(String paramString, Object paramObject)
    throws IOException
  {
    boolean bool;
    if ((paramObject instanceof String))
    {
      bool = this.zzc.edit().putString(paramString, (String)paramObject).commit();
    }
    else if ((paramObject instanceof Long))
    {
      bool = this.zzc.edit().putLong(paramString, ((Long)paramObject).longValue()).commit();
    }
    else
    {
      if (!(paramObject instanceof Boolean)) {
        break label175;
      }
      bool = this.zzc.edit().putBoolean(paramString, ((Boolean)paramObject).booleanValue()).commit();
    }
    if (bool) {
      return;
    }
    Object localObject = this.zzb;
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Failed to store ");
    ((StringBuilder)paramObject).append(paramString);
    ((StringBuilder)paramObject).append(" for app ");
    ((StringBuilder)paramObject).append((String)localObject);
    paramString = ((StringBuilder)paramObject).toString();
    Log.e("PaidLifecycleSPHandler", paramString);
    throw new IOException(paramString);
    label175:
    paramObject = String.valueOf(paramObject.getClass());
    paramString = this.zzb;
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unexpected object class ");
    ((StringBuilder)localObject).append((String)paramObject);
    ((StringBuilder)localObject).append(" for app ");
    ((StringBuilder)localObject).append(paramString);
    paramString = ((StringBuilder)localObject).toString();
    Log.e("PaidLifecycleSPHandler", paramString);
    throw new IllegalArgumentException(paramString);
  }
  
  final void zze(String paramString)
    throws IOException
  {
    if (this.zzc.edit().remove(paramString).commit()) {
      return;
    }
    String str = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Failed to remove ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" for app ");
    localStringBuilder.append(str);
    paramString = localStringBuilder.toString();
    Log.e("PaidLifecycleSPHandler", paramString);
    throw new IOException(paramString);
  }
  
  final boolean zzf(String paramString, boolean paramBoolean)
  {
    return this.zzc.getBoolean(paramString, true);
  }
  
  final boolean zzg(String paramString)
  {
    return this.zzc.contains(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */