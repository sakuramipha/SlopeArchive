package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class AdRequest
{
  public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
  public static final int ERROR_CODE_APP_ID_MISSING = 8;
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_AD_STRING = 11;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
  public static final int GENDER_FEMALE = 2;
  public static final int GENDER_MALE = 1;
  public static final int GENDER_UNKNOWN = 0;
  public static final int MAX_CONTENT_URL_LENGTH = 512;
  protected final zzdx zza;
  
  protected AdRequest(Builder paramBuilder)
  {
    this.zza = new zzdx(paramBuilder.zza, null);
  }
  
  public String getAdString()
  {
    return this.zza.zzj();
  }
  
  public String getContentUrl()
  {
    return this.zza.zzk();
  }
  
  @Deprecated
  public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> paramClass)
  {
    return this.zza.zzd(paramClass);
  }
  
  public Bundle getCustomTargeting()
  {
    return this.zza.zze();
  }
  
  public Set<String> getKeywords()
  {
    return this.zza.zzq();
  }
  
  public List<String> getNeighboringContentUrls()
  {
    return this.zza.zzo();
  }
  
  public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> paramClass)
  {
    return this.zza.zzf(paramClass);
  }
  
  public String getRequestAgent()
  {
    return this.zza.zzm();
  }
  
  public boolean isTestDevice(Context paramContext)
  {
    return this.zza.zzs(paramContext);
  }
  
  public final zzdx zza()
  {
    return this.zza;
  }
  
  public static class Builder
  {
    protected final zzdw zza;
    
    public Builder()
    {
      zzdw localzzdw = new zzdw();
      this.zza = localzzdw;
      localzzdw.zzv("B3EEABB8EE11C2BE770B684D95219ECB");
    }
    
    @Deprecated
    public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
    {
      this.zza.zzq(paramClass, paramBundle);
      return this;
    }
    
    public Builder addKeyword(String paramString)
    {
      this.zza.zzs(paramString);
      return this;
    }
    
    public Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> paramClass, Bundle paramBundle)
    {
      this.zza.zzt(paramClass, paramBundle);
      if ((paramClass.equals(AdMobAdapter.class)) && (paramBundle.getBoolean("_emulatorLiveAds"))) {
        this.zza.zzw("B3EEABB8EE11C2BE770B684D95219ECB");
      }
      return this;
    }
    
    public AdRequest build()
    {
      return new AdRequest(this);
    }
    
    public Builder setAdString(String paramString)
    {
      this.zza.zzx(paramString);
      return this;
    }
    
    public Builder setContentUrl(String paramString)
    {
      Preconditions.checkNotNull(paramString, "Content URL must be non-null.");
      Preconditions.checkNotEmpty(paramString, "Content URL must be non-empty.");
      int i = paramString.length();
      boolean bool = false;
      int j = paramString.length();
      if (i <= 512) {
        bool = true;
      }
      Preconditions.checkArgument(bool, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] { Integer.valueOf(512), Integer.valueOf(j) });
      this.zza.zzz(paramString);
      return this;
    }
    
    public Builder setHttpTimeoutMillis(int paramInt)
    {
      this.zza.zzB(paramInt);
      return this;
    }
    
    public Builder setNeighboringContentUrls(List<String> paramList)
    {
      if (paramList == null)
      {
        zzbzt.zzj("neighboring content URLs list should not be null");
        return this;
      }
      this.zza.zzD(paramList);
      return this;
    }
    
    public Builder setRequestAgent(String paramString)
    {
      this.zza.zzF(paramString);
      return this;
    }
    
    @Deprecated
    public final Builder zza(String paramString)
    {
      this.zza.zzv(paramString);
      return this;
    }
    
    @Deprecated
    public final Builder zzb(Date paramDate)
    {
      this.zza.zzy(paramDate);
      return this;
    }
    
    @Deprecated
    public final Builder zzc(int paramInt)
    {
      this.zza.zzA(paramInt);
      return this;
    }
    
    @Deprecated
    public final Builder zzd(boolean paramBoolean)
    {
      this.zza.zzC(paramBoolean);
      return this;
    }
    
    @Deprecated
    public final Builder zze(boolean paramBoolean)
    {
      this.zza.zzG(paramBoolean);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */