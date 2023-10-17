package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import java.util.List;

@Deprecated
public class WakeLockTracker
{
  private static WakeLockTracker zza = new WakeLockTracker();
  
  public static WakeLockTracker getInstance()
  {
    return zza;
  }
  
  public void registerAcquireEvent(Context paramContext, Intent paramIntent, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4) {}
  
  public void registerDeadlineEvent(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, List<String> paramList, boolean paramBoolean, long paramLong) {}
  
  public void registerEvent(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, int paramInt2, List<String> paramList) {}
  
  public void registerEvent(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, int paramInt2, List<String> paramList, long paramLong) {}
  
  public void registerReleaseEvent(Context paramContext, Intent paramIntent) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\stats\WakeLockTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */