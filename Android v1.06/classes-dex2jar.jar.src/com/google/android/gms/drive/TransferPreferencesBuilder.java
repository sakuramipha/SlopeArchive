package com.google.android.gms.drive;

import com.google.android.gms.common.internal.Objects;

public class TransferPreferencesBuilder
{
  public static final TransferPreferences DEFAULT_PREFERENCES = new zza(1, true, 256);
  private int zzbl;
  private boolean zzbm;
  private int zzbn;
  
  public TransferPreferencesBuilder()
  {
    this(DEFAULT_PREFERENCES);
  }
  
  public TransferPreferencesBuilder(FileUploadPreferences paramFileUploadPreferences)
  {
    this.zzbl = paramFileUploadPreferences.getNetworkTypePreference();
    this.zzbm = paramFileUploadPreferences.isRoamingAllowed();
    this.zzbn = paramFileUploadPreferences.getBatteryUsagePreference();
  }
  
  public TransferPreferencesBuilder(TransferPreferences paramTransferPreferences)
  {
    this.zzbl = paramTransferPreferences.getNetworkPreference();
    this.zzbm = paramTransferPreferences.isRoamingAllowed();
    this.zzbn = paramTransferPreferences.getBatteryUsagePreference();
  }
  
  public TransferPreferences build()
  {
    return new zza(this.zzbl, this.zzbm, this.zzbn);
  }
  
  public TransferPreferencesBuilder setBatteryUsagePreference(int paramInt)
  {
    this.zzbn = paramInt;
    return this;
  }
  
  public TransferPreferencesBuilder setIsRoamingAllowed(boolean paramBoolean)
  {
    this.zzbm = paramBoolean;
    return this;
  }
  
  public TransferPreferencesBuilder setNetworkPreference(int paramInt)
  {
    this.zzbl = paramInt;
    return this;
  }
  
  static final class zza
    implements TransferPreferences
  {
    private final int zzbl;
    private final boolean zzbm;
    private final int zzbn;
    
    zza(int paramInt1, boolean paramBoolean, int paramInt2)
    {
      this.zzbl = paramInt1;
      this.zzbm = paramBoolean;
      this.zzbn = paramInt2;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (getClass() == paramObject.getClass()))
      {
        paramObject = (zza)paramObject;
        if ((((zza)paramObject).zzbl == this.zzbl) && (((zza)paramObject).zzbm == this.zzbm) && (((zza)paramObject).zzbn == this.zzbn)) {
          return true;
        }
      }
      return false;
    }
    
    public final int getBatteryUsagePreference()
    {
      return this.zzbn;
    }
    
    public final int getNetworkPreference()
    {
      return this.zzbl;
    }
    
    public final int hashCode()
    {
      return Objects.hashCode(new Object[] { Integer.valueOf(this.zzbl), Boolean.valueOf(this.zzbm), Integer.valueOf(this.zzbn) });
    }
    
    public final boolean isRoamingAllowed()
    {
      return this.zzbm;
    }
    
    public final String toString()
    {
      return String.format("NetworkPreference: %s, IsRoamingAllowed %s, BatteryUsagePreference %s", new Object[] { Integer.valueOf(this.zzbl), Boolean.valueOf(this.zzbm), Integer.valueOf(this.zzbn) });
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\TransferPreferencesBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */