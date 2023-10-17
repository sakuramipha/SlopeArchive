package com.google.android.gms.games;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzl
{
  private static final AtomicInteger zzf = new AtomicInteger(0);
  int zza = 4368;
  final ArrayList zzb = new ArrayList();
  GoogleSignInAccount zzc = null;
  String zzd = null;
  com.google.android.gms.games.internal.zzl zze;
  
  private zzl()
  {
    throw null;
  }
  
  public final zzl zza(String paramString)
  {
    this.zzd = paramString;
    return this;
  }
  
  public final zzl zzb(com.google.android.gms.games.internal.zzl paramzzl)
  {
    this.zze = ((com.google.android.gms.games.internal.zzl)Preconditions.checkNotNull(paramzzl));
    return this;
  }
  
  public final zzl zzc(GoogleSignInAccount paramGoogleSignInAccount)
  {
    this.zzc = paramGoogleSignInAccount;
    return this;
  }
  
  public final zzl zzd(int paramInt)
  {
    this.zza = 2101523;
    return this;
  }
  
  public final zzn zze()
  {
    return new zzn(false, true, 17, false, this.zza, null, this.zzb, false, false, false, this.zzc, null, 0, 9, this.zzd, this.zze, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */