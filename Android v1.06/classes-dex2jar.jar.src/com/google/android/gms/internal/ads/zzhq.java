package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

final class zzhq
{
  private final AudioManager zza;
  private final zzho zzb;
  private zzhp zzc;
  private int zzd;
  private float zze = 1.0F;
  
  public zzhq(Context paramContext, Handler paramHandler, zzhp paramzzhp)
  {
    paramContext = (AudioManager)paramContext.getApplicationContext().getSystemService("audio");
    Objects.requireNonNull(paramContext);
    this.zza = paramContext;
    this.zzc = paramzzhp;
    this.zzb = new zzho(this, paramHandler);
    this.zzd = 0;
  }
  
  private final void zze()
  {
    if (this.zzd == 0) {
      return;
    }
    if (zzfn.zza < 26) {
      this.zza.abandonAudioFocus(this.zzb);
    }
    zzg(0);
  }
  
  private final void zzf(int paramInt)
  {
    Object localObject = this.zzc;
    if (localObject != null)
    {
      localObject = (zzjp)localObject;
      boolean bool = ((zzjp)localObject).zza.zzv();
      int i = zzjt.zzC(bool, paramInt);
      zzjt.zzV(((zzjp)localObject).zza, bool, paramInt, i);
    }
  }
  
  private final void zzg(int paramInt)
  {
    if (this.zzd == paramInt) {
      return;
    }
    this.zzd = paramInt;
    float f;
    if (paramInt == 3) {
      f = 0.2F;
    } else {
      f = 1.0F;
    }
    if (this.zze == f) {
      return;
    }
    this.zze = f;
    zzhp localzzhp = this.zzc;
    if (localzzhp != null) {
      zzjt.zzS(((zzjp)localzzhp).zza);
    }
  }
  
  public final float zza()
  {
    return this.zze;
  }
  
  public final int zzb(boolean paramBoolean, int paramInt)
  {
    zze();
    if (paramBoolean) {
      return 1;
    }
    return -1;
  }
  
  public final void zzd()
  {
    this.zzc = null;
    zze();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */