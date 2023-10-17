package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;

public class zzdd
{
  private final int zza = Integer.MAX_VALUE;
  private final int zzb = Integer.MAX_VALUE;
  private final int zzc = Integer.MAX_VALUE;
  private final int zzd = Integer.MAX_VALUE;
  private int zze;
  private int zzf;
  private boolean zzg;
  private final zzfrr zzh;
  private final zzfrr zzi;
  private final int zzj;
  private final int zzk;
  private final zzfrr zzl;
  private zzfrr zzm;
  private int zzn;
  private final HashMap zzo;
  private final HashSet zzp;
  
  @Deprecated
  public zzdd()
  {
    this.zze = Integer.MAX_VALUE;
    this.zzf = Integer.MAX_VALUE;
    this.zzg = true;
    this.zzh = zzfrr.zzl();
    this.zzi = zzfrr.zzl();
    this.zzj = Integer.MAX_VALUE;
    this.zzk = Integer.MAX_VALUE;
    this.zzl = zzfrr.zzl();
    this.zzm = zzfrr.zzl();
    this.zzn = 0;
    this.zzo = new HashMap();
    this.zzp = new HashSet();
  }
  
  protected zzdd(zzde paramzzde)
  {
    this.zze = paramzzde.zzl;
    this.zzf = paramzzde.zzm;
    this.zzg = paramzzde.zzn;
    this.zzh = paramzzde.zzo;
    this.zzi = paramzzde.zzq;
    this.zzj = Integer.MAX_VALUE;
    this.zzk = Integer.MAX_VALUE;
    this.zzl = paramzzde.zzu;
    this.zzm = paramzzde.zzv;
    this.zzn = paramzzde.zzw;
    this.zzp = new HashSet(paramzzde.zzC);
    this.zzo = new HashMap(paramzzde.zzB);
  }
  
  public final zzdd zzd(Context paramContext)
  {
    if ((zzfn.zza >= 23) || (Looper.myLooper() != null))
    {
      paramContext = (CaptioningManager)paramContext.getSystemService("captioning");
      if ((paramContext != null) && (paramContext.isEnabled()))
      {
        this.zzn = 1088;
        paramContext = paramContext.getLocale();
        if (paramContext != null) {
          this.zzm = zzfrr.zzm(zzfn.zzw(paramContext));
        }
      }
    }
    return this;
  }
  
  public zzdd zze(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.zze = paramInt1;
    this.zzf = paramInt2;
    this.zzg = true;
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */