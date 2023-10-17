package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbmk
{
  private final Object zza = new Object();
  private final Context zzb;
  private final String zzc;
  private final zzbzz zzd;
  private final zzfft zze;
  private final zzbb zzf;
  private final zzbb zzg;
  private zzbmj zzh;
  private int zzi = 1;
  
  public zzbmk(Context paramContext, zzbzz paramzzbzz, String paramString, zzbb paramzzbb1, zzbb paramzzbb2, zzfft paramzzfft)
  {
    this.zzc = paramString;
    this.zzb = paramContext.getApplicationContext();
    this.zzd = paramzzbzz;
    this.zze = paramzzfft;
    this.zzf = paramzzbb1;
    this.zzg = paramzzbb2;
  }
  
  public final zzbme zzb(zzaqq arg1)
  {
    synchronized (this.zza)
    {
      synchronized (this.zza)
      {
        zzbmj localzzbmj = this.zzh;
        if ((localzzbmj != null) && (this.zzi == 0))
        {
          zzblp localzzblp = new com/google/android/gms/internal/ads/zzblp;
          localzzblp.<init>(this);
          localzzbmj.zzi(localzzblp, zzblq.zza);
        }
        ??? = this.zzh;
        if ((??? != null) && (((zzcas)???).zze() != -1))
        {
          int i = this.zzi;
          if (i == 0)
          {
            ??? = this.zzh.zza();
            return (zzbme)???;
          }
          if (i == 1)
          {
            this.zzi = 2;
            zzd(null);
            ??? = this.zzh.zza();
            return (zzbme)???;
          }
          ??? = this.zzh.zza();
          return (zzbme)???;
        }
        this.zzi = 2;
        ??? = zzd(null);
        this.zzh = ((zzbmj)???);
        ??? = ((zzbmj)???).zza();
        return (zzbme)???;
      }
    }
  }
  
  protected final zzbmj zzd(zzaqq paramzzaqq)
  {
    zzfff localzzfff = zzffe.zza(this.zzb, 6);
    localzzfff.zzh();
    paramzzaqq = new zzbmj(this.zzg);
    zzcag.zze.execute(new zzblt(this, null, paramzzaqq));
    paramzzaqq.zzi(new zzblz(this, paramzzaqq, localzzfff), new zzbma(this, paramzzaqq, localzzfff));
    return paramzzaqq;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbmk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */