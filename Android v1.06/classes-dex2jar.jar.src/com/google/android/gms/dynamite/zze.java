package com.google.android.gms.dynamite;

import android.content.Context;

final class zze
  implements DynamiteModule.VersionPolicy.IVersions
{
  public final int zza(Context paramContext, String paramString)
  {
    return DynamiteModule.getLocalVersion(paramContext, paramString);
  }
  
  public final int zzb(Context paramContext, String paramString, boolean paramBoolean)
    throws DynamiteModule.LoadingException
  {
    return DynamiteModule.zza(paramContext, paramString, paramBoolean);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamite\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */