package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;

public abstract interface ExperienceEvent
  extends Freezable<ExperienceEvent>, Parcelable
{
  @Deprecated
  public abstract String getIconImageUrl();
  
  public abstract int zza();
  
  public abstract int zzb();
  
  public abstract long zzc();
  
  public abstract long zzd();
  
  public abstract long zze();
  
  public abstract Uri zzf();
  
  public abstract Game zzg();
  
  public abstract String zzh();
  
  public abstract String zzi();
  
  public abstract String zzj();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\experience\ExperienceEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */