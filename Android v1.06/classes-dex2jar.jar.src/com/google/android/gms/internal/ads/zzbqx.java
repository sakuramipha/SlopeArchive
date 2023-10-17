package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

public final class zzbqx
  extends zzbqy
  implements zzbii
{
  DisplayMetrics zza;
  int zzb = -1;
  int zzc = -1;
  int zzd = -1;
  int zze = -1;
  int zzf = -1;
  int zzg = -1;
  private final zzcfb zzh;
  private final Context zzi;
  private final WindowManager zzj;
  private final zzbau zzk;
  private float zzl;
  private int zzm;
  
  public zzbqx(zzcfb paramzzcfb, Context paramContext, zzbau paramzzbau)
  {
    super(paramzzcfb, "");
    this.zzh = paramzzcfb;
    this.zzi = paramContext;
    this.zzk = paramzzbau;
    this.zzj = ((WindowManager)paramContext.getSystemService("window"));
  }
  
  public final void zzb(int paramInt1, int paramInt2)
  {
    boolean bool = this.zzi instanceof Activity;
    int n = 0;
    int k;
    if (bool)
    {
      zzt.zzp();
      k = com.google.android.gms.ads.internal.util.zzs.zzN((Activity)this.zzi)[0];
    }
    else
    {
      k = 0;
    }
    if ((this.zzh.zzO() == null) || (!this.zzh.zzO().zzi()))
    {
      int m = this.zzh.getWidth();
      int i1 = this.zzh.getHeight();
      zzbbc localzzbbc = zzbbk.zzS;
      int j = m;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        i = m;
        if (m == 0) {
          if (this.zzh.zzO() != null) {
            i = this.zzh.zzO().zzb;
          } else {
            i = 0;
          }
        }
        j = i;
        if (i1 == 0)
        {
          j = n;
          m = i;
          if (this.zzh.zzO() == null) {
            break label211;
          }
          j = this.zzh.zzO().zza;
          m = i;
          break label211;
        }
      }
      int i = i1;
      m = j;
      j = i;
      label211:
      this.zzf = zzay.zzb().zzb(this.zzi, m);
      this.zzg = zzay.zzb().zzb(this.zzi, j);
    }
    zzf(paramInt1, paramInt2 - k, this.zzf, this.zzg);
    this.zzh.zzN().zzB(paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */