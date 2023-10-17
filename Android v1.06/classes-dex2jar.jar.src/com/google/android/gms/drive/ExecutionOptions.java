package com.google.android.gms.drive;

import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.drive.zzaw;

public class ExecutionOptions
{
  public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
  public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
  public static final int MAX_TRACKING_TAG_STRING_LENGTH = 65536;
  private final String zzan;
  private final boolean zzao;
  private final int zzap;
  
  public ExecutionOptions(String paramString, boolean paramBoolean, int paramInt)
  {
    this.zzan = paramString;
    this.zzao = paramBoolean;
    this.zzap = paramInt;
  }
  
  public static boolean zza(int paramInt)
  {
    return paramInt == 1;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      if (paramObject == this) {
        return true;
      }
      paramObject = (ExecutionOptions)paramObject;
      if ((Objects.equal(this.zzan, ((ExecutionOptions)paramObject).zzan)) && (this.zzap == ((ExecutionOptions)paramObject).zzap) && (this.zzao == ((ExecutionOptions)paramObject).zzao)) {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzan, Integer.valueOf(this.zzap), Boolean.valueOf(this.zzao) });
  }
  
  @Deprecated
  public final void zza(GoogleApiClient paramGoogleApiClient)
  {
    zza((zzaw)paramGoogleApiClient.getClient(Drive.CLIENT_KEY));
  }
  
  public final void zza(zzaw paramzzaw)
  {
    if ((this.zzao) && (!paramzzaw.zzah())) {
      throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
    }
  }
  
  public final String zzl()
  {
    return this.zzan;
  }
  
  public final boolean zzm()
  {
    return this.zzao;
  }
  
  public final int zzn()
  {
    return this.zzap;
  }
  
  public static class Builder
  {
    protected String zzaq;
    protected boolean zzar;
    protected int zzas = 0;
    
    public ExecutionOptions build()
    {
      zzo();
      return new ExecutionOptions(this.zzaq, this.zzar, this.zzas);
    }
    
    public Builder setConflictStrategy(int paramInt)
    {
      int j = 1;
      int i = j;
      if (paramInt != 0)
      {
        i = j;
        if (paramInt != 1) {
          i = 0;
        }
      }
      if (i != 0)
      {
        this.zzas = paramInt;
        return this;
      }
      StringBuilder localStringBuilder = new StringBuilder(53);
      localStringBuilder.append("Unrecognized value for conflict strategy: ");
      localStringBuilder.append(paramInt);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    
    public Builder setNotifyOnCompletion(boolean paramBoolean)
    {
      this.zzar = paramBoolean;
      return this;
    }
    
    public Builder setTrackingTag(String paramString)
    {
      int i;
      if ((!TextUtils.isEmpty(paramString)) && (paramString.length() <= 65536)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        this.zzaq = paramString;
        return this;
      }
      throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[] { Integer.valueOf(65536) }));
    }
    
    protected final void zzo()
    {
      if ((this.zzas == 1) && (!this.zzar)) {
        throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\ExecutionOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */