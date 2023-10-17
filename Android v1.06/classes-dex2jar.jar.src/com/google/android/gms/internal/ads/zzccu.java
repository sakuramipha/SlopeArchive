package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class zzccu
  extends zzcbi
  implements TextureView.SurfaceTextureListener, zzcbs
{
  private final zzccc zzc;
  private final zzccd zzd;
  private final zzccb zze;
  private zzcbh zzf;
  private Surface zzg;
  private zzcbt zzh;
  private String zzi;
  private String[] zzj;
  private boolean zzk;
  private int zzl = 1;
  private zzcca zzm;
  private final boolean zzn;
  private boolean zzo;
  private boolean zzp;
  private int zzq;
  private int zzr;
  private float zzs;
  
  public zzccu(Context paramContext, zzccd paramzzccd, zzccc paramzzccc, boolean paramBoolean1, boolean paramBoolean2, zzccb paramzzccb)
  {
    super(paramContext);
    this.zzc = paramzzccc;
    this.zzd = paramzzccd;
    this.zzn = paramBoolean1;
    this.zze = paramzzccb;
    setSurfaceTextureListener(this);
    paramzzccd.zza(this);
  }
  
  private static String zzT(String paramString, Exception paramException)
  {
    String str1 = paramException.getClass().getCanonicalName();
    String str2 = paramException.getMessage();
    paramException = new StringBuilder();
    paramException.append(paramString);
    paramException.append("/");
    paramException.append(str1);
    paramException.append(":");
    paramException.append(str2);
    return paramException.toString();
  }
  
  private final void zzU()
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      localzzcbt.zzQ(true);
    }
  }
  
  private final void zzV()
  {
    if (this.zzo) {
      return;
    }
    this.zzo = true;
    zzs.zza.post(new zzccp(this));
    zzn();
    this.zzd.zzb();
    if (this.zzp) {
      zzp();
    }
  }
  
  private final void zzW(boolean paramBoolean, Integer paramInteger)
  {
    Object localObject1 = this.zzh;
    if ((localObject1 != null) && (!paramBoolean))
    {
      ((zzcbt)localObject1).zzP(paramInteger);
      return;
    }
    if ((this.zzi != null) && (this.zzg != null))
    {
      if (paramBoolean) {
        if (zzad())
        {
          ((zzcbt)localObject1).zzU();
          zzY();
        }
        else
        {
          zzbzt.zzj("No valid ExoPlayerAdapter exists when switch source.");
          return;
        }
      }
      Object localObject2;
      int i;
      if (this.zzi.startsWith("cache:"))
      {
        localObject1 = this.zzc.zzp(this.zzi);
        if ((localObject1 instanceof zzcdw))
        {
          localObject1 = ((zzcdw)localObject1).zza();
          this.zzh = ((zzcbt)localObject1);
          ((zzcbt)localObject1).zzP(paramInteger);
          if (!this.zzh.zzV()) {
            zzbzt.zzj("Precached video player has been released.");
          }
        }
        else if ((localObject1 instanceof zzcdt))
        {
          Object localObject3 = (zzcdt)localObject1;
          localObject2 = zzF();
          localObject1 = ((zzcdt)localObject3).zzk();
          paramBoolean = ((zzcdt)localObject3).zzl();
          localObject3 = ((zzcdt)localObject3).zzi();
          if (localObject3 == null)
          {
            zzbzt.zzj("Stream cache URL is null.");
            return;
          }
          paramInteger = zzE(paramInteger);
          this.zzh = paramInteger;
          paramInteger.zzG(new Uri[] { Uri.parse((String)localObject3) }, (String)localObject2, (ByteBuffer)localObject1, paramBoolean);
        }
        else
        {
          zzbzt.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
        }
      }
      else
      {
        this.zzh = zzE(paramInteger);
        paramInteger = zzF();
        localObject2 = new Uri[this.zzj.length];
        for (i = 0;; i++)
        {
          localObject1 = this.zzj;
          if (i >= localObject1.length) {
            break;
          }
          localObject2[i] = Uri.parse(localObject1[i]);
        }
        this.zzh.zzF((Uri[])localObject2, paramInteger);
      }
      this.zzh.zzL(this);
      zzZ(this.zzg, false);
      if (this.zzh.zzV())
      {
        i = this.zzh.zzt();
        this.zzl = i;
        if (i == 3) {
          zzV();
        }
      }
    }
  }
  
  private final void zzX()
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      localzzcbt.zzQ(false);
    }
  }
  
  private final void zzY()
  {
    if (this.zzh != null)
    {
      zzZ(null, true);
      zzcbt localzzcbt = this.zzh;
      if (localzzcbt != null)
      {
        localzzcbt.zzL(null);
        this.zzh.zzH();
        this.zzh = null;
      }
      this.zzl = 1;
      this.zzk = false;
      this.zzo = false;
      this.zzp = false;
    }
  }
  
  private final void zzZ(Surface paramSurface, boolean paramBoolean)
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      try
      {
        localzzcbt.zzS(paramSurface, paramBoolean);
        return;
      }
      catch (IOException paramSurface)
      {
        zzbzt.zzk("", paramSurface);
        return;
      }
    }
    zzbzt.zzj("Trying to set surface before player is initialized.");
  }
  
  private final void zzaa()
  {
    zzab(this.zzq, this.zzr);
  }
  
  private final void zzab(int paramInt1, int paramInt2)
  {
    float f;
    if (paramInt2 > 0) {
      f = paramInt1 / paramInt2;
    } else {
      f = 1.0F;
    }
    if (this.zzs != f)
    {
      this.zzs = f;
      requestLayout();
    }
  }
  
  private final boolean zzac()
  {
    return (zzad()) && (this.zzl != 1);
  }
  
  private final boolean zzad()
  {
    zzcbt localzzcbt = this.zzh;
    return (localzzcbt != null) && (localzzcbt.zzV()) && (!this.zzk);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int j = getMeasuredWidth();
    paramInt1 = getMeasuredHeight();
    float f3 = this.zzs;
    int i = j;
    paramInt2 = paramInt1;
    if (f3 != 0.0F)
    {
      i = j;
      paramInt2 = paramInt1;
      if (this.zzm == null)
      {
        float f2 = j;
        float f1 = f2 / paramInt1;
        if (f3 > f1) {
          paramInt1 = (int)(f2 / f3);
        }
        i = j;
        paramInt2 = paramInt1;
        if (f3 < f1)
        {
          i = (int)(paramInt1 * f3);
          paramInt2 = paramInt1;
        }
      }
    }
    setMeasuredDimension(i, paramInt2);
    zzcca localzzcca = this.zzm;
    if (localzzcca != null) {
      localzzcca.zzc(i, paramInt2);
    }
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    Object localObject = paramSurfaceTexture;
    if (this.zzn)
    {
      localObject = new zzcca(getContext());
      this.zzm = ((zzcca)localObject);
      ((zzcca)localObject).zzd(paramSurfaceTexture, paramInt1, paramInt2);
      this.zzm.start();
      localObject = this.zzm.zzb();
      if (localObject == null)
      {
        this.zzm.zze();
        this.zzm = null;
        localObject = paramSurfaceTexture;
      }
    }
    paramSurfaceTexture = new Surface((SurfaceTexture)localObject);
    this.zzg = paramSurfaceTexture;
    if (this.zzh == null)
    {
      zzW(false, null);
    }
    else
    {
      zzZ(paramSurfaceTexture, true);
      if (!this.zze.zza) {
        zzU();
      }
    }
    if ((this.zzq != 0) && (this.zzr != 0)) {
      zzaa();
    } else {
      zzab(paramInt1, paramInt2);
    }
    zzs.zza.post(new zzcco(this));
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    zzo();
    paramSurfaceTexture = this.zzm;
    if (paramSurfaceTexture != null)
    {
      paramSurfaceTexture.zze();
      this.zzm = null;
    }
    if (this.zzh != null)
    {
      zzX();
      paramSurfaceTexture = this.zzg;
      if (paramSurfaceTexture != null) {
        paramSurfaceTexture.release();
      }
      this.zzg = null;
      zzZ(null, true);
    }
    zzs.zza.post(new zzccs(this));
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    paramSurfaceTexture = this.zzm;
    if (paramSurfaceTexture != null) {
      paramSurfaceTexture.zzc(paramInt1, paramInt2);
    }
    zzs.zza.post(new zzcci(this, paramInt1, paramInt2));
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    this.zzd.zzf(this);
    this.zza.zza(paramSurfaceTexture, this.zzf);
  }
  
  protected final void onWindowVisibilityChanged(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdExoPlayerView3 window visibility changed to ");
    localStringBuilder.append(paramInt);
    zze.zza(localStringBuilder.toString());
    zzs.zza.post(new zzccr(this, paramInt));
    super.onWindowVisibilityChanged(paramInt);
  }
  
  public final void zzA(int paramInt)
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      localzzcbt.zzN(paramInt);
    }
  }
  
  public final void zzB(int paramInt)
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      localzzcbt.zzR(paramInt);
    }
  }
  
  public final void zzC(String paramString, String[] paramArrayOfString, Integer paramInteger)
  {
    if (paramString == null) {
      return;
    }
    boolean bool = true;
    if (paramArrayOfString == null) {
      this.zzj = new String[] { paramString };
    } else {
      this.zzj = ((String[])Arrays.copyOf(paramArrayOfString, paramArrayOfString.length));
    }
    paramArrayOfString = this.zzi;
    if ((!this.zze.zzl) || (paramArrayOfString == null) || (paramString.equals(paramArrayOfString)) || (this.zzl != 4)) {
      bool = false;
    }
    this.zzi = paramString;
    zzW(bool, paramInteger);
  }
  
  public final void zzD(int paramInt1, int paramInt2)
  {
    this.zzq = paramInt1;
    this.zzr = paramInt2;
    zzaa();
  }
  
  final zzcbt zzE(Integer paramInteger)
  {
    paramInteger = new zzceo(this.zzc.getContext(), this.zze, this.zzc, paramInteger);
    zzbzt.zzi("ExoPlayerAdapter initialized.");
    return paramInteger;
  }
  
  final String zzF()
  {
    return zzt.zzp().zzc(this.zzc.getContext(), this.zzc.zzn().zza);
  }
  
  public final int zza()
  {
    if (zzac()) {
      return (int)this.zzh.zzy();
    }
    return 0;
  }
  
  public final int zzb()
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      return localzzcbt.zzr();
    }
    return -1;
  }
  
  public final int zzc()
  {
    if (zzac()) {
      return (int)this.zzh.zzz();
    }
    return 0;
  }
  
  public final int zzd()
  {
    return this.zzr;
  }
  
  public final int zze()
  {
    return this.zzq;
  }
  
  public final long zzf()
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      return localzzcbt.zzx();
    }
    return -1L;
  }
  
  public final long zzg()
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      return localzzcbt.zzA();
    }
    return -1L;
  }
  
  public final long zzh()
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      return localzzcbt.zzB();
    }
    return -1L;
  }
  
  public final void zzi(boolean paramBoolean, long paramLong)
  {
    if (this.zzc != null) {
      zzcag.zze.execute(new zzccq(this, paramBoolean, paramLong));
    }
  }
  
  public final String zzj()
  {
    String str;
    if (true != this.zzn) {
      str = "";
    } else {
      str = " spherical";
    }
    return "ExoPlayer/2".concat(str);
  }
  
  public final void zzk(String paramString, Exception paramException)
  {
    paramString = zzT(paramString, paramException);
    zzbzt.zzj("ExoPlayerAdapter error: ".concat(paramString));
    this.zzk = true;
    if (this.zze.zza) {
      zzX();
    }
    zzs.zza.post(new zzcch(this, paramString));
    zzt.zzo().zzt(paramException, "AdExoPlayerView.onError");
  }
  
  public final void zzl(String paramString, Exception paramException)
  {
    paramString = zzT("onLoadException", paramException);
    zzbzt.zzj("ExoPlayerAdapter exception: ".concat(paramString));
    zzt.zzo().zzt(paramException, "AdExoPlayerView.onException");
    zzs.zza.post(new zzcck(this, paramString));
  }
  
  public final void zzm(int paramInt)
  {
    if (this.zzl != paramInt)
    {
      this.zzl = paramInt;
      if (paramInt != 3)
      {
        if (paramInt == 4)
        {
          if (this.zze.zza) {
            zzX();
          }
          this.zzd.zze();
          this.zzb.zzc();
          zzs.zza.post(new zzccn(this));
        }
      }
      else {
        zzV();
      }
    }
  }
  
  public final void zzn()
  {
    zzs.zza.post(new zzccl(this));
  }
  
  public final void zzo()
  {
    if (zzac())
    {
      if (this.zze.zza) {
        zzX();
      }
      this.zzh.zzO(false);
      this.zzd.zze();
      this.zzb.zzc();
      zzs.zza.post(new zzccm(this));
    }
  }
  
  public final void zzp()
  {
    if (zzac())
    {
      if (this.zze.zza) {
        zzU();
      }
      this.zzh.zzO(true);
      this.zzd.zzc();
      this.zzb.zzb();
      this.zza.zzb();
      zzs.zza.post(new zzccj(this));
      return;
    }
    this.zzp = true;
  }
  
  public final void zzq(int paramInt)
  {
    if (zzac()) {
      this.zzh.zzI(paramInt);
    }
  }
  
  public final void zzr(zzcbh paramzzcbh)
  {
    this.zzf = paramzzcbh;
  }
  
  public final void zzs(String paramString)
  {
    if (paramString != null) {
      zzC(paramString, null, null);
    }
  }
  
  public final void zzt()
  {
    if (zzad())
    {
      this.zzh.zzU();
      zzY();
    }
    this.zzd.zze();
    this.zzb.zzc();
    this.zzd.zzd();
  }
  
  public final void zzu(float paramFloat1, float paramFloat2)
  {
    zzcca localzzcca = this.zzm;
    if (localzzcca != null) {
      localzzcca.zzf(paramFloat1, paramFloat2);
    }
  }
  
  public final void zzv()
  {
    zzs.zza.post(new zzcct(this));
  }
  
  public final Integer zzw()
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      return localzzcbt.zzC();
    }
    return null;
  }
  
  public final void zzx(int paramInt)
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      localzzcbt.zzJ(paramInt);
    }
  }
  
  public final void zzy(int paramInt)
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      localzzcbt.zzK(paramInt);
    }
  }
  
  public final void zzz(int paramInt)
  {
    zzcbt localzzcbt = this.zzh;
    if (localzzcbt != null) {
      localzzcbt.zzM(paramInt);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzccu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */