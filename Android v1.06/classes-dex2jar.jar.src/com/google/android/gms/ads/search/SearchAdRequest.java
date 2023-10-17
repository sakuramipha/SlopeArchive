package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

@Deprecated
public final class SearchAdRequest
{
  public static final int BORDER_TYPE_DASHED = 1;
  public static final int BORDER_TYPE_DOTTED = 2;
  public static final int BORDER_TYPE_NONE = 0;
  public static final int BORDER_TYPE_SOLID = 3;
  public static final int CALL_BUTTON_COLOR_DARK = 2;
  public static final int CALL_BUTTON_COLOR_LIGHT = 0;
  public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
  public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  @NotOnlyInitialized
  private final zzdx zza;
  private final String zzb;
  
  @Deprecated
  public int getAnchorTextColor()
  {
    return 0;
  }
  
  @Deprecated
  public int getBackgroundColor()
  {
    return 0;
  }
  
  @Deprecated
  public int getBackgroundGradientBottom()
  {
    return 0;
  }
  
  @Deprecated
  public int getBackgroundGradientTop()
  {
    return 0;
  }
  
  @Deprecated
  public int getBorderColor()
  {
    return 0;
  }
  
  @Deprecated
  public int getBorderThickness()
  {
    return 0;
  }
  
  @Deprecated
  public int getBorderType()
  {
    return 0;
  }
  
  @Deprecated
  public int getCallButtonColor()
  {
    return 0;
  }
  
  @Deprecated
  public String getCustomChannels()
  {
    return null;
  }
  
  public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> paramClass)
  {
    return this.zza.zzd(paramClass);
  }
  
  @Deprecated
  public int getDescriptionTextColor()
  {
    return 0;
  }
  
  @Deprecated
  public String getFontFace()
  {
    return null;
  }
  
  @Deprecated
  public int getHeaderTextColor()
  {
    return 0;
  }
  
  @Deprecated
  public int getHeaderTextSize()
  {
    return 0;
  }
  
  public Location getLocation()
  {
    return null;
  }
  
  @Deprecated
  public <T extends NetworkExtras> T getNetworkExtras(Class<T> paramClass)
  {
    return this.zza.zzh(paramClass);
  }
  
  public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> paramClass)
  {
    return this.zza.zzf(paramClass);
  }
  
  public String getQuery()
  {
    return this.zzb;
  }
  
  public boolean isTestDevice(Context paramContext)
  {
    return this.zza.zzs(paramContext);
  }
  
  final zzdx zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\search\SearchAdRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */