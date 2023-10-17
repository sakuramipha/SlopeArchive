package com.google.android.ump;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzcn;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ConsentDebugSettings
{
  private final boolean zza;
  private final int zzb;
  
  public int getDebugGeography()
  {
    return this.zzb;
  }
  
  public boolean isTestDevice()
  {
    return this.zza;
  }
  
  public static class Builder
  {
    private final List zza = new ArrayList();
    private final Context zzb;
    private int zzc = 0;
    private boolean zzd;
    
    public Builder(Context paramContext)
    {
      this.zzb = paramContext.getApplicationContext();
    }
    
    public Builder addTestDeviceHashedId(String paramString)
    {
      this.zza.add(paramString);
      return this;
    }
    
    public ConsentDebugSettings build()
    {
      Context localContext = this.zzb;
      List localList = this.zza;
      boolean bool3 = zzcn.zzb();
      boolean bool2 = true;
      boolean bool1 = bool2;
      if (!bool3) {
        if (localList.contains(zzcn.zza(localContext))) {
          bool1 = bool2;
        } else if (this.zzd) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      return new ConsentDebugSettings(bool1, this, null);
    }
    
    public Builder setDebugGeography(int paramInt)
    {
      this.zzc = paramInt;
      return this;
    }
    
    public Builder setForceTesting(boolean paramBoolean)
    {
      this.zzd = paramBoolean;
      return this;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface DebugGeography
  {
    public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
    public static final int DEBUG_GEOGRAPHY_EEA = 1;
    public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\androi\\ump\ConsentDebugSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */