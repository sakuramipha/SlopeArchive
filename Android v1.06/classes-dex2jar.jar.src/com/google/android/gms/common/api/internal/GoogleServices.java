package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R.string;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzag;

@Deprecated
public final class GoogleServices
{
  private static final Object zza = new Object();
  private static GoogleServices zzb;
  private final String zzc;
  private final Status zzd;
  private final boolean zze;
  private final boolean zzf;
  
  GoogleServices(Context paramContext)
  {
    Object localObject = paramContext.getResources();
    int i = ((Resources)localObject).getIdentifier("google_app_measurement_enable", "integer", ((Resources)localObject).getResourcePackageName(R.string.common_google_play_services_unknown_issue));
    boolean bool2 = true;
    boolean bool1 = true;
    if (i != 0)
    {
      i = ((Resources)localObject).getInteger(i);
      if (i != 0) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      if (i == 0) {
        bool1 = false;
      }
      this.zzf = bool2;
    }
    else
    {
      this.zzf = false;
      bool1 = bool2;
    }
    this.zze = bool1;
    String str = zzag.zzb(paramContext);
    localObject = str;
    if (str == null) {
      localObject = new StringResourceValueReader(paramContext).getString("google_app_id");
    }
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      this.zzd = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
      this.zzc = null;
      return;
    }
    this.zzc = ((String)localObject);
    this.zzd = Status.RESULT_SUCCESS;
  }
  
  GoogleServices(String paramString, boolean paramBoolean)
  {
    this.zzc = paramString;
    this.zzd = Status.RESULT_SUCCESS;
    this.zze = paramBoolean;
    this.zzf = (paramBoolean ^ true);
  }
  
  private static GoogleServices checkInitialized(String paramString)
  {
    synchronized (zza)
    {
      Object localObject2 = zzb;
      if (localObject2 != null) {
        return (GoogleServices)localObject2;
      }
      localObject2 = new java/lang/IllegalStateException;
      int i = String.valueOf(paramString).length();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i + 34);
      localStringBuilder.append("Initialize must be called before ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(".");
      ((IllegalStateException)localObject2).<init>(localStringBuilder.toString());
      throw ((Throwable)localObject2);
    }
  }
  
  static void clearInstanceForTest()
  {
    synchronized (zza)
    {
      zzb = null;
      return;
    }
  }
  
  public static String getGoogleAppId()
  {
    return checkInitialized("getGoogleAppId").zzc;
  }
  
  public static Status initialize(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext, "Context must not be null.");
    synchronized (zza)
    {
      if (zzb == null)
      {
        GoogleServices localGoogleServices = new com/google/android/gms/common/api/internal/GoogleServices;
        localGoogleServices.<init>(paramContext);
        zzb = localGoogleServices;
      }
      paramContext = zzb.zzd;
      return paramContext;
    }
  }
  
  public static Status initialize(Context arg0, String paramString, boolean paramBoolean)
  {
    Preconditions.checkNotNull(???, "Context must not be null.");
    Preconditions.checkNotEmpty(paramString, "App ID must be nonempty.");
    synchronized (zza)
    {
      GoogleServices localGoogleServices = zzb;
      if (localGoogleServices != null)
      {
        paramString = localGoogleServices.checkGoogleAppId(paramString);
        return paramString;
      }
      localGoogleServices = new com/google/android/gms/common/api/internal/GoogleServices;
      localGoogleServices.<init>(paramString, paramBoolean);
      zzb = localGoogleServices;
      paramString = localGoogleServices.zzd;
      return paramString;
    }
  }
  
  public static boolean isMeasurementEnabled()
  {
    GoogleServices localGoogleServices = checkInitialized("isMeasurementEnabled");
    return (localGoogleServices.zzd.isSuccess()) && (localGoogleServices.zze);
  }
  
  public static boolean isMeasurementExplicitlyDisabled()
  {
    return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
  }
  
  Status checkGoogleAppId(String paramString)
  {
    String str = this.zzc;
    if ((str != null) && (!str.equals(paramString)))
    {
      str = this.zzc;
      paramString = new StringBuilder(String.valueOf(str).length() + 97);
      paramString.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
      paramString.append(str);
      paramString.append("'.");
      return new Status(10, paramString.toString());
    }
    return Status.RESULT_SUCCESS;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\GoogleServices.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */