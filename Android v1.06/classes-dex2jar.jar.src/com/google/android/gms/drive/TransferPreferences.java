package com.google.android.gms.drive;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface TransferPreferences
{
  public static final int BATTERY_USAGE_CHARGING_ONLY = 257;
  public static final int BATTERY_USAGE_UNKNOWN = 0;
  public static final int BATTERY_USAGE_UNRESTRICTED = 256;
  public static final int NETWORK_TYPE_ANY = 1;
  public static final int NETWORK_TYPE_UNKNOWN = 0;
  public static final int NETWORK_TYPE_WIFI_ONLY = 2;
  
  public abstract int getBatteryUsagePreference();
  
  public abstract int getNetworkPreference();
  
  public abstract boolean isRoamingAllowed();
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface BatteryUsage {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface NetworkType {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\TransferPreferences.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */