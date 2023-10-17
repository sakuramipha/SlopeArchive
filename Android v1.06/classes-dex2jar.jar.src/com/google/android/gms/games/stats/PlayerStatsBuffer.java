package com.google.android.gms.games.stats;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class PlayerStatsBuffer
  extends AbstractDataBuffer<PlayerStats>
{
  public PlayerStatsBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final PlayerStats zza(int paramInt)
  {
    return new zzb(this.mDataHolder, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\stats\PlayerStatsBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */