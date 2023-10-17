package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzcbq
  extends FrameLayout
  implements zzcbh
{
  final zzcce zza;
  private final zzccc zzb;
  private final FrameLayout zzc;
  private final View zzd;
  private final zzbcc zze;
  private final long zzf;
  private final zzcbi zzg;
  private boolean zzh;
  private boolean zzi;
  private boolean zzj;
  private boolean zzk;
  private long zzl;
  private long zzm;
  private String zzn;
  private String[] zzo;
  private Bitmap zzp;
  private final ImageView zzq;
  private boolean zzr;
  
  public zzcbq(Context paramContext, zzccc paramzzccc, int paramInt, boolean paramBoolean, zzbcc paramzzbcc, zzccb paramzzccb)
  {
    super(paramContext);
    this.zzb = paramzzccc;
    this.zze = paramzzbcc;
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    this.zzc = localFrameLayout;
    addView(localFrameLayout, new FrameLayout.LayoutParams(-1, -1));
    Preconditions.checkNotNull(paramzzccc.zzj());
    Object localObject = paramzzccc.zzj().zza;
    localObject = new zzccd(paramContext, paramzzccc.zzn(), paramzzccc.zzbm(), paramzzbcc, paramzzccc.zzk());
    if (paramInt == 2) {
      paramzzccc = new zzccu(paramContext, (zzccd)localObject, paramzzccc, paramBoolean, zzcbu.zza(paramzzccc), paramzzccb);
    } else {
      paramzzccc = new zzcbg(paramContext, paramzzccc, paramBoolean, zzcbu.zza(paramzzccc), paramzzccb, new zzccd(paramContext, paramzzccc.zzn(), paramzzccc.zzbm(), paramzzbcc, paramzzccc.zzk()));
    }
    this.zzg = paramzzccc;
    paramzzccb = new View(paramContext);
    this.zzd = paramzzccb;
    paramzzccb.setBackgroundColor(0);
    localFrameLayout.addView(paramzzccc, new FrameLayout.LayoutParams(-1, -1, 17));
    localObject = zzbbk.zzF;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localFrameLayout.addView(paramzzccb, new FrameLayout.LayoutParams(-1, -1));
      localFrameLayout.bringChildToFront(paramzzccb);
    }
    paramzzccb = zzbbk.zzC;
    if (((Boolean)zzba.zzc().zzb(paramzzccb)).booleanValue()) {
      zzn();
    }
    this.zzq = new ImageView(paramContext);
    paramContext = zzbbk.zzI;
    this.zzf = ((Long)zzba.zzc().zzb(paramContext)).longValue();
    paramContext = zzbbk.zzE;
    paramBoolean = ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
    this.zzk = paramBoolean;
    if (paramzzbcc != null)
    {
      if (true != paramBoolean) {
        paramContext = "0";
      } else {
        paramContext = "1";
      }
      paramzzbcc.zzd("spinner_used", paramContext);
    }
    this.zza = new zzcce(this);
    paramzzccc.zzr(this);
  }
  
  private final void zzJ()
  {
    if (this.zzb.zzi() == null) {
      return;
    }
    if ((this.zzi) && (!this.zzj))
    {
      this.zzb.zzi().getWindow().clearFlags(128);
      this.zzi = false;
    }
  }
  
  private final void zzK(String paramString, String... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    Object localObject = zzl();
    if (localObject != null) {
      localHashMap.put("playerId", ((Integer)localObject).toString());
    }
    localHashMap.put("event", paramString);
    int j = paramVarArgs.length;
    int i = 0;
    paramString = null;
    while (i < j)
    {
      localObject = paramVarArgs[i];
      if (paramString == null)
      {
        paramString = (String)localObject;
      }
      else
      {
        localHashMap.put(paramString, localObject);
        paramString = null;
      }
      i++;
    }
    this.zzb.zzd("onVideoEvent", localHashMap);
  }
  
  private final boolean zzL()
  {
    return this.zzq.getParent() != null;
  }
  
  public final void finalize()
    throws Throwable
  {
    try
    {
      this.zza.zza();
      zzcbi localzzcbi = this.zzg;
      if (localzzcbi != null)
      {
        zzfwc localzzfwc = zzcag.zze;
        zzcbk localzzcbk = new com/google/android/gms/internal/ads/zzcbk;
        localzzcbk.<init>(localzzcbi);
        localzzfwc.execute(localzzcbk);
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean)
    {
      this.zza.zzb();
    }
    else
    {
      this.zza.zza();
      this.zzm = this.zzl;
    }
    zzs.zza.post(new zzcbl(this, paramBoolean));
  }
  
  public final void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    boolean bool;
    if (paramInt == 0)
    {
      this.zza.zzb();
      bool = true;
    }
    else
    {
      this.zza.zza();
      this.zzm = this.zzl;
      bool = false;
    }
    zzs.zza.post(new zzcbp(this, bool));
  }
  
  public final void zzA(int paramInt)
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzz(paramInt);
  }
  
  public final void zzB(int paramInt)
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzA(paramInt);
  }
  
  public final void zzC(int paramInt)
  {
    zzbbc localzzbbc = zzbbk.zzF;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      this.zzc.setBackgroundColor(paramInt);
      this.zzd.setBackgroundColor(paramInt);
    }
  }
  
  public final void zzD(int paramInt)
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzB(paramInt);
  }
  
  public final void zzE(String paramString, String[] paramArrayOfString)
  {
    this.zzn = paramString;
    this.zzo = paramArrayOfString;
  }
  
  public final void zzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject;
    if (zze.zzc())
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Set video bounds to x:");
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append(";y:");
      ((StringBuilder)localObject).append(paramInt2);
      ((StringBuilder)localObject).append(";w:");
      ((StringBuilder)localObject).append(paramInt3);
      ((StringBuilder)localObject).append(";h:");
      ((StringBuilder)localObject).append(paramInt4);
      zze.zza(((StringBuilder)localObject).toString());
    }
    if ((paramInt3 != 0) && (paramInt4 != 0))
    {
      localObject = new FrameLayout.LayoutParams(paramInt3, paramInt4);
      ((FrameLayout.LayoutParams)localObject).setMargins(paramInt1, paramInt2, 0, 0);
      this.zzc.setLayoutParams((ViewGroup.LayoutParams)localObject);
      requestLayout();
    }
  }
  
  public final void zzG(float paramFloat)
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzb.zze(paramFloat);
    localzzcbi.zzn();
  }
  
  public final void zzH(float paramFloat1, float paramFloat2)
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi != null) {
      localzzcbi.zzu(paramFloat1, paramFloat2);
    }
  }
  
  public final void zzI()
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzb.zzd(false);
    localzzcbi.zzn();
  }
  
  public final void zza()
  {
    zzbbc localzzbbc = zzbbk.zzbL;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      this.zza.zza();
    }
    zzK("ended", new String[0]);
    zzJ();
  }
  
  public final void zzb(String paramString1, String paramString2)
  {
    zzK("error", new String[] { "what", paramString1, "extra", paramString2 });
  }
  
  public final void zzc(String paramString1, String paramString2)
  {
    zzK("exception", new String[] { "what", "ExoPlayerAdapter exception", "extra", paramString2 });
  }
  
  public final void zzd()
  {
    zzK("pause", new String[0]);
    zzJ();
    this.zzh = false;
  }
  
  public final void zze()
  {
    zzbbc localzzbbc = zzbbk.zzbL;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      this.zza.zzb();
    }
    if ((this.zzb.zzi() != null) && (!this.zzi))
    {
      boolean bool;
      if ((this.zzb.zzi().getWindow().getAttributes().flags & 0x80) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      this.zzj = bool;
      if (!bool)
      {
        this.zzb.zzi().getWindow().addFlags(128);
        this.zzi = true;
      }
    }
    this.zzh = true;
  }
  
  public final void zzf()
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    if (this.zzm == 0L)
    {
      float f = localzzcbi.zzc();
      int i = this.zzg.zze();
      int j = this.zzg.zzd();
      zzK("canplaythrough", new String[] { "duration", String.valueOf(f / 1000.0F), "videoWidth", String.valueOf(i), "videoHeight", String.valueOf(j) });
    }
  }
  
  public final void zzg()
  {
    this.zzd.setVisibility(4);
    zzs.zza.post(new zzcbm(this));
  }
  
  public final void zzh()
  {
    this.zza.zzb();
    zzs.zza.post(new zzcbn(this));
  }
  
  public final void zzi()
  {
    if ((this.zzr) && (this.zzp != null) && (!zzL()))
    {
      this.zzq.setImageBitmap(this.zzp);
      this.zzq.invalidate();
      this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
      this.zzc.bringChildToFront(this.zzq);
    }
    this.zza.zza();
    this.zzm = this.zzl;
    zzs.zza.post(new zzcbo(this));
  }
  
  public final void zzj(int paramInt1, int paramInt2)
  {
    if (this.zzk)
    {
      Object localObject = zzbbk.zzH;
      paramInt1 = Math.max(paramInt1 / ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue(), 1);
      localObject = zzbbk.zzH;
      paramInt2 = Math.max(paramInt2 / ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue(), 1);
      localObject = this.zzp;
      if ((localObject == null) || (((Bitmap)localObject).getWidth() != paramInt1) || (this.zzp.getHeight() != paramInt2)) {}
    }
    else
    {
      return;
    }
    this.zzp = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    this.zzr = false;
  }
  
  public final void zzk()
  {
    if ((this.zzh) && (zzL())) {
      this.zzc.removeView(this.zzq);
    }
    if ((this.zzg != null) && (this.zzp != null))
    {
      long l = zzt.zzB().elapsedRealtime();
      if (this.zzg.getBitmap(this.zzp) != null) {
        this.zzr = true;
      }
      l = zzt.zzB().elapsedRealtime() - l;
      Object localObject;
      if (zze.zzc())
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Spinner frame grab took ");
        ((StringBuilder)localObject).append(l);
        ((StringBuilder)localObject).append("ms");
        zze.zza(((StringBuilder)localObject).toString());
      }
      if (l > this.zzf)
      {
        zzbzt.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
        this.zzk = false;
        this.zzp = null;
        localObject = this.zze;
        if (localObject != null) {
          ((zzbcc)localObject).zzd("spinner_jank", Long.toString(l));
        }
      }
    }
  }
  
  public final Integer zzl()
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi != null) {
      return localzzcbi.zzw();
    }
    return null;
  }
  
  public final void zzn()
  {
    Object localObject = this.zzg;
    if (localObject == null) {
      return;
    }
    TextView localTextView = new TextView(((zzcbi)localObject).getContext());
    localObject = zzt.zzo().zzd();
    if (localObject == null) {
      localObject = "AdMob - ";
    } else {
      localObject = ((Resources)localObject).getString(R.string.watermark_label_prefix);
    }
    String str = this.zzg.zzj();
    localTextView.setText(String.valueOf(localObject).concat(str));
    localTextView.setTextColor(-65536);
    localTextView.setBackgroundColor(65280);
    this.zzc.addView(localTextView, new FrameLayout.LayoutParams(-2, -2, 17));
    this.zzc.bringChildToFront(localTextView);
  }
  
  public final void zzo()
  {
    this.zza.zza();
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi != null) {
      localzzcbi.zzt();
    }
    zzJ();
  }
  
  public final void zzr(Integer paramInteger)
  {
    if (this.zzg == null) {
      return;
    }
    if (!TextUtils.isEmpty(this.zzn))
    {
      this.zzg.zzC(this.zzn, this.zzo, paramInteger);
      return;
    }
    zzK("no_src", new String[0]);
  }
  
  public final void zzs()
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzb.zzd(true);
    localzzcbi.zzn();
  }
  
  final void zzt()
  {
    Object localObject = this.zzg;
    if (localObject == null) {
      return;
    }
    long l = ((zzcbi)localObject).zza();
    if ((this.zzl != l) && (l > 0L))
    {
      float f = (float)l;
      localObject = zzbbk.zzbJ;
      boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
      f /= 1000.0F;
      if (bool) {
        zzK("timeupdate", new String[] { "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(zzt.zzB().currentTimeMillis()) });
      } else {
        zzK("timeupdate", new String[] { "time", String.valueOf(f) });
      }
      this.zzl = l;
    }
  }
  
  public final void zzu()
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzo();
  }
  
  public final void zzv()
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzp();
  }
  
  public final void zzw(int paramInt)
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzq(paramInt);
  }
  
  public final void zzx(MotionEvent paramMotionEvent)
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final void zzy(int paramInt)
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzx(paramInt);
  }
  
  public final void zzz(int paramInt)
  {
    zzcbi localzzcbi = this.zzg;
    if (localzzcbi == null) {
      return;
    }
    localzzcbi.zzy(paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */