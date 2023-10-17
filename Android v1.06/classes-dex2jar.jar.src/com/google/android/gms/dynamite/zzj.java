package com.google.android.gms.dynamite;

import android.content.Context;

final class zzj
  implements DynamiteModule.VersionPolicy
{
  public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context paramContext, String paramString, DynamiteModule.VersionPolicy.IVersions paramIVersions)
    throws DynamiteModule.LoadingException
  {
    DynamiteModule.VersionPolicy.SelectionResult localSelectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
    int i = paramIVersions.zza(paramContext, paramString);
    localSelectionResult.localVersion = i;
    int j = 0;
    if (i != 0)
    {
      i = paramIVersions.zzb(paramContext, paramString, false);
      localSelectionResult.remoteVersion = i;
    }
    else
    {
      i = paramIVersions.zzb(paramContext, paramString, true);
      localSelectionResult.remoteVersion = i;
    }
    int k = localSelectionResult.localVersion;
    if (k == 0)
    {
      if (i == 0)
      {
        localSelectionResult.selection = 0;
        break label125;
      }
    }
    else {
      j = k;
    }
    if (j >= i) {
      localSelectionResult.selection = -1;
    } else {
      localSelectionResult.selection = 1;
    }
    label125:
    return localSelectionResult;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamite\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */