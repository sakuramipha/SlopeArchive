package com.google.android.gms.dynamite;

import android.content.Context;

final class zzh
  implements DynamiteModule.VersionPolicy
{
  public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context paramContext, String paramString, DynamiteModule.VersionPolicy.IVersions paramIVersions)
    throws DynamiteModule.LoadingException
  {
    DynamiteModule.VersionPolicy.SelectionResult localSelectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
    int i = paramIVersions.zzb(paramContext, paramString, false);
    localSelectionResult.remoteVersion = i;
    if (i == 0) {
      localSelectionResult.selection = 0;
    } else {
      localSelectionResult.selection = 1;
    }
    return localSelectionResult;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamite\zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */