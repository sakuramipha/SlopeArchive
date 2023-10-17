package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbzm;

public final class zzq
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzq> CREATOR = new zzr();
  public final String zza;
  public final int zzb;
  public final int zzc;
  public final boolean zzd;
  public final int zze;
  public final int zzf;
  public final zzq[] zzg;
  public final boolean zzh;
  public final boolean zzi;
  public boolean zzj;
  public boolean zzk;
  public boolean zzl;
  public boolean zzm;
  public boolean zzn;
  public boolean zzo;
  
  public zzq()
  {
    this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
  }
  
  public zzq(Context paramContext, AdSize paramAdSize)
  {
    this(paramContext, new AdSize[] { paramAdSize });
  }
  
  public zzq(Context paramContext, AdSize[] paramArrayOfAdSize)
  {
    AdSize localAdSize = paramArrayOfAdSize[0];
    this.zzd = false;
    boolean bool1 = localAdSize.isFluid();
    this.zzi = bool1;
    this.zzm = zzb.zzf(localAdSize);
    this.zzn = zzb.zzg(localAdSize);
    boolean bool2 = zzb.zzh(localAdSize);
    this.zzo = bool2;
    if (bool1)
    {
      this.zze = AdSize.BANNER.getWidth();
      i = AdSize.BANNER.getHeight();
      this.zzb = i;
    }
    else if (this.zzn)
    {
      this.zze = localAdSize.getWidth();
      i = zzb.zza(localAdSize);
      this.zzb = i;
    }
    else if (bool2)
    {
      this.zze = localAdSize.getWidth();
      i = zzb.zzb(localAdSize);
      this.zzb = i;
    }
    else
    {
      this.zze = localAdSize.getWidth();
      i = localAdSize.getHeight();
      this.zzb = i;
    }
    int j;
    if (this.zze == -1) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if (i == -2) {
      k = 1;
    } else {
      k = 0;
    }
    Object localObject1 = paramContext.getResources().getDisplayMetrics();
    int m;
    if (j != 0)
    {
      zzay.zzb();
      if (paramContext.getResources().getConfiguration().orientation == 2)
      {
        DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
        if ((int)(localDisplayMetrics.heightPixels / localDisplayMetrics.density) < 600)
        {
          zzay.zzb();
          localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
          Object localObject2 = (WindowManager)paramContext.getSystemService("window");
          if (localObject2 != null)
          {
            localObject2 = ((WindowManager)localObject2).getDefaultDisplay();
            ((Display)localObject2).getRealMetrics(localDisplayMetrics);
            int n = localDisplayMetrics.heightPixels;
            m = localDisplayMetrics.widthPixels;
            ((Display)localObject2).getMetrics(localDisplayMetrics);
            i = localDisplayMetrics.heightPixels;
            int i1 = localDisplayMetrics.widthPixels;
            if ((i == n) && (i1 == m))
            {
              m = ((DisplayMetrics)localObject1).widthPixels;
              zzay.zzb();
              i = paramContext.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
              if (i > 0) {
                i = paramContext.getResources().getDimensionPixelSize(i);
              } else {
                i = 0;
              }
              i = m - i;
              this.zzf = i;
              break label441;
            }
          }
        }
      }
      i = ((DisplayMetrics)localObject1).widthPixels;
      this.zzf = i;
      label441:
      float f = ((DisplayMetrics)localObject1).density;
      double d = i / f;
      m = (int)d;
      i = m;
      if (d - m >= 0.01D) {
        i = m + 1;
      }
    }
    else
    {
      i = this.zze;
      zzay.zzb();
      this.zzf = zzbzm.zzp((DisplayMetrics)localObject1, this.zze);
    }
    if (k != 0) {
      m = zzf((DisplayMetrics)localObject1);
    } else {
      m = this.zzb;
    }
    zzay.zzb();
    this.zzc = zzbzm.zzp((DisplayMetrics)localObject1, m);
    if ((j == 0) && (k == 0))
    {
      if ((!this.zzn) && (!this.zzo))
      {
        if (bool1)
        {
          localObject1 = "320x50_mb";
        }
        else
        {
          this.zza = localAdSize.toString();
          break label717;
        }
      }
      else
      {
        j = this.zze;
        i = this.zzb;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append(j);
        ((StringBuilder)localObject1).append("x");
        ((StringBuilder)localObject1).append(i);
        ((StringBuilder)localObject1).append("_as");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      this.zza = ((String)localObject1);
    }
    else
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(i);
      ((StringBuilder)localObject1).append("x");
      ((StringBuilder)localObject1).append(m);
      ((StringBuilder)localObject1).append("_as");
      this.zza = ((StringBuilder)localObject1).toString();
    }
    label717:
    int i = paramArrayOfAdSize.length;
    if (i > 1)
    {
      this.zzg = new zzq[i];
      for (i = 0; i < paramArrayOfAdSize.length; i++) {
        this.zzg[i] = new zzq(paramContext, paramArrayOfAdSize[i]);
      }
    }
    this.zzg = null;
    this.zzh = false;
    this.zzj = false;
  }
  
  zzq(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, int paramInt4, zzq[] paramArrayOfzzq, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9)
  {
    this.zza = paramString;
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    this.zzd = paramBoolean1;
    this.zze = paramInt3;
    this.zzf = paramInt4;
    this.zzg = paramArrayOfzzq;
    this.zzh = paramBoolean2;
    this.zzi = paramBoolean3;
    this.zzj = paramBoolean4;
    this.zzk = paramBoolean5;
    this.zzl = paramBoolean6;
    this.zzm = paramBoolean7;
    this.zzn = paramBoolean8;
    this.zzo = paramBoolean9;
  }
  
  public static int zza(DisplayMetrics paramDisplayMetrics)
  {
    return (int)(zzf(paramDisplayMetrics) * paramDisplayMetrics.density);
  }
  
  public static zzq zzb()
  {
    return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
  }
  
  public static zzq zzc()
  {
    return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
  }
  
  public static zzq zzd()
  {
    return new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
  }
  
  public static zzq zze()
  {
    return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
  }
  
  private static int zzf(DisplayMetrics paramDisplayMetrics)
  {
    int i = (int)(paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
    if (i <= 400) {
      return 32;
    }
    if (i <= 720) {
      return 50;
    }
    return 90;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zza, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzb);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zzd);
    SafeParcelWriter.writeInt(paramParcel, 6, this.zze);
    SafeParcelWriter.writeInt(paramParcel, 7, this.zzf);
    SafeParcelWriter.writeTypedArray(paramParcel, 8, this.zzg, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 9, this.zzh);
    SafeParcelWriter.writeBoolean(paramParcel, 10, this.zzi);
    SafeParcelWriter.writeBoolean(paramParcel, 11, this.zzj);
    SafeParcelWriter.writeBoolean(paramParcel, 12, this.zzk);
    SafeParcelWriter.writeBoolean(paramParcel, 13, this.zzl);
    SafeParcelWriter.writeBoolean(paramParcel, 14, this.zzm);
    SafeParcelWriter.writeBoolean(paramParcel, 15, this.zzn);
    SafeParcelWriter.writeBoolean(paramParcel, 16, this.zzo);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */