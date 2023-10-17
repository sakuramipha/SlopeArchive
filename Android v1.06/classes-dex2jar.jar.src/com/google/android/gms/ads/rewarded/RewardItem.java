package com.google.android.gms.ads.rewarded;

public abstract interface RewardItem
{
  public static final RewardItem DEFAULT_REWARD = new zza();
  
  public abstract int getAmount();
  
  public abstract String getType();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\rewarded\RewardItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */