package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbmy
{
  static final zzbb zza = new zzbmw();
  static final zzbb zzb = new zzbmx();
  private final zzbmk zzc;
  
  public zzbmy(Context paramContext, zzbzz paramzzbzz, String paramString, @Nullable zzfft paramzzfft)
  {
    this.zzc = new zzbmk(paramContext, paramzzbzz, paramString, zza, zzb, paramzzfft);
  }
  
  public final zzbmo zza(String paramString, zzbmr paramzzbmr, zzbmq paramzzbmq)
  {
    return new zzbnc(this.zzc, paramString, paramzzbmr, paramzzbmq);
  }
  
  public final zzbnh zzb()
  {
    return new zzbnh(this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbmy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */