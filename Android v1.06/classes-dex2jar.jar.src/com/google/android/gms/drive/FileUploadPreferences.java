package com.google.android.gms.drive;

@Deprecated
public abstract interface FileUploadPreferences
{
  public static final int BATTERY_USAGE_CHARGING_ONLY = 257;
  public static final int BATTERY_USAGE_UNRESTRICTED = 256;
  public static final int NETWORK_TYPE_ANY = 1;
  public static final int NETWORK_TYPE_WIFI_ONLY = 2;
  public static final int PREFERENCE_VALUE_UNKNOWN = 0;
  
  public abstract int getBatteryUsagePreference();
  
  public abstract int getNetworkTypePreference();
  
  public abstract boolean isRoamingAllowed();
  
  public abstract void setBatteryUsagePreference(int paramInt);
  
  public abstract void setNetworkTypePreference(int paramInt);
  
  public abstract void setRoamingAllowed(boolean paramBoolean);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\FileUploadPreferences.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */