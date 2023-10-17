package com.google.android.gms.dynamite;

import android.content.Context;

final class zzi
  implements DynamiteModule.VersionPolicy
{
  public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context paramContext, String paramString, DynamiteModule.VersionPolicy.IVersions paramIVersions)
    throws DynamiteModule.LoadingException
  {
    DynamiteModule.VersionPolicy.SelectionResult localSelectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
    localSelectionResult.localVersion = paramIVersions.zza(paramContext, paramString);
    int k = paramIVersions.zzb(paramContext, paramString, true);
    localSelectionResult.remoteVersion = k;
    int j = localSelectionResult.localVersion;
    int i = j;
    if (j == 0)
    {
      if (k == 0) {
        localSelectionResult.selection = 0;
      } else {
        i = 0;
      }
    }
    else if (i >= k) {
      localSelectionResult.selection = -1;
    } else {
      localSelectionResult.selection = 1;
    }
    return localSelectionResult;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamite\zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */