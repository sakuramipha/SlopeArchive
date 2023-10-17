package com.google.android.gms.drive;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.drive.zzaf;
import com.google.android.gms.internal.drive.zzaw;
import com.google.android.gms.internal.drive.zzbb;
import com.google.android.gms.internal.drive.zzbr;
import com.google.android.gms.internal.drive.zzcb;
import com.google.android.gms.internal.drive.zzch;
import com.google.android.gms.internal.drive.zzeb;
import java.util.Set;

@Deprecated
public final class Drive
{
  @Deprecated
  public static final Api<Api.ApiOptions.NoOptions> API;
  public static final Api.ClientKey<zzaw> CLIENT_KEY;
  @Deprecated
  public static final DriveApi DriveApi;
  @Deprecated
  public static final DrivePreferencesApi DrivePreferencesApi = new zzcb();
  public static final Scope SCOPE_APPFOLDER;
  public static final Scope SCOPE_FILE;
  private static final Api.AbstractClientBuilder<zzaw, Api.ApiOptions.NoOptions> zzq;
  private static final Api.AbstractClientBuilder<zzaw, zzb> zzr;
  private static final Api.AbstractClientBuilder<zzaw, zza> zzs;
  private static final Scope zzt;
  private static final Scope zzu;
  private static final Api<zzb> zzv;
  public static final Api<zza> zzw;
  @Deprecated
  private static final zzj zzx;
  private static final zzl zzy;
  
  static
  {
    Api.ClientKey localClientKey = new Api.ClientKey();
    CLIENT_KEY = localClientKey;
    zze localzze = new zze();
    zzq = localzze;
    zzf localzzf = new zzf();
    zzr = localzzf;
    zzg localzzg = new zzg();
    zzs = localzzg;
    SCOPE_FILE = new Scope("https://www.googleapis.com/auth/drive.file");
    SCOPE_APPFOLDER = new Scope("https://www.googleapis.com/auth/drive.appdata");
    zzt = new Scope("https://www.googleapis.com/auth/drive");
    zzu = new Scope("https://www.googleapis.com/auth/drive.apps");
    API = new Api("Drive.API", localzze, localClientKey);
    zzv = new Api("Drive.INTERNAL_API", localzzf, localClientKey);
    zzw = new Api("Drive.API_CONNECTIONLESS", localzzg, localClientKey);
    DriveApi = new zzaf();
    zzx = new zzbr();
    zzy = new zzeb();
  }
  
  @Deprecated
  public static DriveClient getDriveClient(Activity paramActivity, GoogleSignInAccount paramGoogleSignInAccount)
  {
    zza(paramGoogleSignInAccount);
    return new zzbb(paramActivity, new zza(paramGoogleSignInAccount));
  }
  
  @Deprecated
  public static DriveClient getDriveClient(Context paramContext, GoogleSignInAccount paramGoogleSignInAccount)
  {
    zza(paramGoogleSignInAccount);
    return new zzbb(paramContext, new zza(paramGoogleSignInAccount));
  }
  
  @Deprecated
  public static DriveResourceClient getDriveResourceClient(Activity paramActivity, GoogleSignInAccount paramGoogleSignInAccount)
  {
    zza(paramGoogleSignInAccount);
    return new zzch(paramActivity, new zza(paramGoogleSignInAccount));
  }
  
  @Deprecated
  public static DriveResourceClient getDriveResourceClient(Context paramContext, GoogleSignInAccount paramGoogleSignInAccount)
  {
    zza(paramGoogleSignInAccount);
    return new zzch(paramContext, new zza(paramGoogleSignInAccount));
  }
  
  private static void zza(GoogleSignInAccount paramGoogleSignInAccount)
  {
    Preconditions.checkNotNull(paramGoogleSignInAccount);
    paramGoogleSignInAccount = paramGoogleSignInAccount.getRequestedScopes();
    boolean bool;
    if ((!paramGoogleSignInAccount.contains(SCOPE_FILE)) && (!paramGoogleSignInAccount.contains(SCOPE_APPFOLDER)) && (!paramGoogleSignInAccount.contains(zzt)) && (!paramGoogleSignInAccount.contains(zzu))) {
      bool = false;
    } else {
      bool = true;
    }
    Preconditions.checkArgument(bool, "You must request a Drive scope in order to interact with the Drive API.");
  }
  
  public static final class zza
    implements Api.ApiOptions.HasGoogleSignInAccountOptions
  {
    private final GoogleSignInAccount zzaa;
    private final Bundle zzz = new Bundle();
    
    public zza(GoogleSignInAccount paramGoogleSignInAccount)
    {
      this.zzaa = paramGoogleSignInAccount;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if ((paramObject != null) && (paramObject.getClass() == getClass()))
      {
        zza localzza = (zza)paramObject;
        if (!Objects.equal(this.zzaa, localzza.getGoogleSignInAccount())) {
          return false;
        }
        paramObject = this.zzz.getString("method_trace_filename");
        String str = localzza.zzz.getString("method_trace_filename");
        if (((paramObject == null) && (str == null)) || ((paramObject != null) && (str != null) && (((String)paramObject).equals(str)) && (this.zzz.getBoolean("bypass_initial_sync") == localzza.zzz.getBoolean("bypass_initial_sync")) && (this.zzz.getInt("proxy_type") == localzza.zzz.getInt("proxy_type")))) {
          return true;
        }
      }
      return false;
    }
    
    public final GoogleSignInAccount getGoogleSignInAccount()
    {
      return this.zzaa;
    }
    
    public final int hashCode()
    {
      String str = this.zzz.getString("method_trace_filename", "");
      int i = this.zzz.getInt("proxy_type");
      boolean bool = this.zzz.getBoolean("bypass_initial_sync");
      return Objects.hashCode(new Object[] { this.zzaa, str, Integer.valueOf(i), Boolean.valueOf(bool) });
    }
    
    public final Bundle zzh()
    {
      return this.zzz;
    }
  }
  
  public static final class zzb
    implements Api.ApiOptions.Optional
  {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\Drive.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */