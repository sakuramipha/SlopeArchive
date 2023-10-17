package com.google.android.gms.games;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.internal.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzn
  implements Api.ApiOptions.Optional, GoogleSignInOptionsExtension, Api.ApiOptions.HasGoogleSignInAccountOptions
{
  public final boolean zza;
  public final boolean zzb;
  public final int zzc;
  public final boolean zzd;
  public final int zze;
  public final String zzf;
  public final ArrayList zzg;
  public final boolean zzh;
  public final boolean zzi;
  public final boolean zzj;
  public final GoogleSignInAccount zzk;
  public final String zzl;
  public final int zzm;
  public final String zzn;
  public final com.google.android.gms.games.internal.zzl zzo;
  private final int zzp;
  
  public static zzl zzb()
  {
    return new zzl(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzn)) {
      return false;
    }
    paramObject = (zzn)paramObject;
    boolean bool = ((zzn)paramObject).zza;
    bool = ((zzn)paramObject).zzb;
    int i = ((zzn)paramObject).zzc;
    bool = ((zzn)paramObject).zzd;
    if (this.zze == ((zzn)paramObject).zze)
    {
      Object localObject = ((zzn)paramObject).zzf;
      if (this.zzg.equals(((zzn)paramObject).zzg))
      {
        bool = ((zzn)paramObject).zzh;
        bool = ((zzn)paramObject).zzi;
        bool = ((zzn)paramObject).zzj;
        localObject = this.zzk;
        if (localObject == null ? ((zzn)paramObject).zzk == null : ((GoogleSignInAccount)localObject).equals(((zzn)paramObject).zzk))
        {
          localObject = ((zzn)paramObject).zzl;
          if (TextUtils.equals(null, null))
          {
            i = ((zzn)paramObject).zzp;
            i = ((zzn)paramObject).zzm;
            if (Objects.equal(this.zzn, ((zzn)paramObject).zzn)) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public final int getExtensionType()
  {
    return 1;
  }
  
  public final GoogleSignInAccount getGoogleSignInAccount()
  {
    return this.zzk;
  }
  
  public final List getImpliedScopes()
  {
    return Collections.singletonList(Games.zzc);
  }
  
  public final int hashCode()
  {
    int m = this.zze;
    int k = this.zzg.hashCode();
    Object localObject = this.zzk;
    int j = 0;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = ((GoogleSignInAccount)localObject).hashCode();
    }
    localObject = this.zzn;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    }
    return ((((m + 486741695) * 961 + k) * 923521 + i) * 29791 + 9) * 31 + j;
  }
  
  public final Bundle toBundle()
  {
    return zza();
  }
  
  public final Bundle zza()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("com.google.android.gms.games.key.isHeadless", false);
    localBundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", true);
    localBundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", 17);
    localBundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", false);
    localBundle.putInt("com.google.android.gms.games.key.sdkVariant", this.zze);
    localBundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", null);
    localBundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.zzg);
    localBundle.putBoolean("com.google.android.gms.games.key.unauthenticated", false);
    localBundle.putBoolean("com.google.android.gms.games.key.skipPgaCheck", false);
    localBundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", false);
    localBundle.putParcelable("com.google.android.gms.games.key.googleSignInAccount", this.zzk);
    localBundle.putString("com.google.android.gms.games.key.realClientPackageName", null);
    localBundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
    localBundle.putString("com.google.android.gms.games.key.gameRunToken", this.zzn);
    return localBundle;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */