package com.google.android.gms.internal.games_v2;

import android.content.Intent;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.tasks.Task;

public final class zzce
  implements AchievementsClient
{
  private final zzar zza;
  
  public zzce(zzar paramzzar)
  {
    this.zza = paramzzar;
  }
  
  public final Task<Intent> getAchievementsIntent()
  {
    return this.zza.zzb(zzbv.zza);
  }
  
  public final void increment(String paramString, int paramInt)
  {
    this.zza.zzb(new zzbs(paramString, paramInt));
  }
  
  public final Task<Boolean> incrementImmediate(String paramString, int paramInt)
  {
    return this.zza.zzb(new zzbs(paramString, paramInt));
  }
  
  public final Task<AnnotatedData<AchievementBuffer>> load(boolean paramBoolean)
  {
    return this.zza.zzb(new zzbu(paramBoolean));
  }
  
  public final void reveal(String paramString)
  {
    this.zza.zzb(new zzcc(paramString));
  }
  
  public final Task<Void> revealImmediate(String paramString)
  {
    return this.zza.zzb(new zzcc(paramString));
  }
  
  public final void setSteps(String paramString, int paramInt)
  {
    this.zza.zzb(new zzbt(paramString, paramInt));
  }
  
  public final Task<Boolean> setStepsImmediate(String paramString, int paramInt)
  {
    return this.zza.zzb(new zzbt(paramString, paramInt));
  }
  
  public final void unlock(String paramString)
  {
    this.zza.zzb(new zzcd(paramString));
  }
  
  public final Task<Void> unlockImmediate(String paramString)
  {
    return this.zza.zzb(new zzcd(paramString));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */