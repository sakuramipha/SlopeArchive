package com.google.android.gms.games;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface PlayerRelationshipInfo
  extends Freezable<PlayerRelationshipInfo>, Parcelable
{
  public abstract int getFriendStatus();
  
  public abstract String zza();
  
  public abstract String zzb();
  
  public abstract String zzc();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\PlayerRelationshipInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */