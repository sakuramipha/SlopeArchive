package com.google.android.gms.common;

public class GooglePlayServicesManifestException
  extends IllegalStateException
{
  private final int zza;
  
  public GooglePlayServicesManifestException(int paramInt, String paramString)
  {
    super(paramString);
    this.zza = paramInt;
  }
  
  public int getActualVersion()
  {
    return this.zza;
  }
  
  public int getExpectedVersion()
  {
    return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\GooglePlayServicesManifestException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */