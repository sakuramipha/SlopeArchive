package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class zzcbg
  extends zzcbi
  implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener
{
  private static final Map zzc;
  private final zzccc zzd;
  private final zzccd zze;
  private final boolean zzf;
  private int zzg = 0;
  private int zzh = 0;
  private MediaPlayer zzi;
  private Uri zzj;
  private int zzk;
  private int zzl;
  private int zzm;
  private zzcca zzn;
  private final boolean zzo;
  private int zzp;
  private zzcbh zzq;
  private boolean zzr = false;
  private Integer zzs = null;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzc = localHashMap;
    localHashMap.put(Integer.valueOf(64532), "MEDIA_ERROR_IO");
    localHashMap.put(Integer.valueOf(64529), "MEDIA_ERROR_MALFORMED");
    localHashMap.put(Integer.valueOf(64526), "MEDIA_ERROR_UNSUPPORTED");
    localHashMap.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
    localHashMap.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
    localHashMap.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
    Integer localInteger = Integer.valueOf(1);
    localHashMap.put(localInteger, "MEDIA_ERROR_UNKNOWN");
    localHashMap.put(localInteger, "MEDIA_INFO_UNKNOWN");
    localHashMap.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
    localHashMap.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
    localHashMap.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
    localHashMap.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
    localHashMap.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
    localHashMap.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
    localHashMap.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
    localHashMap.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
  }
  
  public zzcbg(Context paramContext, zzccc paramzzccc, boolean paramBoolean1, boolean paramBoolean2, zzccb paramzzccb, zzccd paramzzccd)
  {
    super(paramContext);
    setSurfaceTextureListener(this);
    this.zzd = paramzzccc;
    this.zze = paramzzccd;
    this.zzo = paramBoolean1;
    this.zzf = paramBoolean2;
    paramzzccd.zza(this);
  }
  
  private final void zzD()
  {
    zze.zza("AdMediaPlayerView init MediaPlayer");
    Object localObject2 = getSurfaceTexture();
    if ((this.zzj != null) && (localObject2 != null))
    {
      zzE(false);
      try
      {
        zzt.zzk();
        Object localObject1 = new android/media/MediaPlayer;
        ((MediaPlayer)localObject1).<init>();
        this.zzi = ((MediaPlayer)localObject1);
        ((MediaPlayer)localObject1).setOnBufferingUpdateListener(this);
        this.zzi.setOnCompletionListener(this);
        this.zzi.setOnErrorListener(this);
        this.zzi.setOnInfoListener(this);
        this.zzi.setOnPreparedListener(this);
        this.zzi.setOnVideoSizeChangedListener(this);
        this.zzm = 0;
        localObject1 = localObject2;
        if (this.zzo)
        {
          localObject1 = new com/google/android/gms/internal/ads/zzcca;
          ((zzcca)localObject1).<init>(getContext());
          this.zzn = ((zzcca)localObject1);
          ((zzcca)localObject1).zzd((SurfaceTexture)localObject2, getWidth(), getHeight());
          this.zzn.start();
          localObject1 = this.zzn.zzb();
          if (localObject1 == null)
          {
            this.zzn.zze();
            this.zzn = null;
            localObject1 = localObject2;
          }
        }
        this.zzi.setDataSource(getContext(), this.zzj);
        zzt.zzl();
        localObject2 = new android/view/Surface;
        ((Surface)localObject2).<init>((SurfaceTexture)localObject1);
        this.zzi.setSurface((Surface)localObject2);
        this.zzi.setAudioStreamType(3);
        this.zzi.setScreenOnWhilePlaying(true);
        this.zzi.prepareAsync();
        zzF(1);
        return;
      }
      catch (IllegalStateException localIllegalStateException) {}catch (IllegalArgumentException localIllegalArgumentException) {}catch (IOException localIOException) {}
      zzbzt.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(String.valueOf(this.zzj))), localIOException);
      onError(this.zzi, 1, 0);
    }
  }
  
  private final void zzE(boolean paramBoolean)
  {
    zze.zza("AdMediaPlayerView release");
    Object localObject = this.zzn;
    if (localObject != null)
    {
      ((zzcca)localObject).zze();
      this.zzn = null;
    }
    localObject = this.zzi;
    if (localObject != null)
    {
      ((MediaPlayer)localObject).reset();
      this.zzi.release();
      this.zzi = null;
      zzF(0);
      if (paramBoolean) {
        this.zzh = 0;
      }
    }
  }
  
  private final void zzF(int paramInt)
  {
    if (paramInt == 3)
    {
      this.zze.zzc();
      this.zzb.zzb();
    }
    else if (this.zzg == 3)
    {
      this.zze.zze();
      this.zzb.zzc();
    }
    this.zzg = paramInt;
  }
  
  private final void zzG(float paramFloat)
  {
    MediaPlayer localMediaPlayer = this.zzi;
    if (localMediaPlayer != null) {}
    try
    {
      localMediaPlayer.setVolume(paramFloat, paramFloat);
      return;
      zzbzt.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
  }
  
  private final boolean zzH()
  {
    if (this.zzi != null)
    {
      int i = this.zzg;
      if ((i != -1) && (i != 0) && (i != 1)) {
        return true;
      }
    }
    return false;
  }
  
  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    this.zzm = paramInt;
  }
  
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    zze.zza("AdMediaPlayerView completion");
    zzF(5);
    this.zzh = 5;
    zzs.zza.post(new zzcaz(this));
  }
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Object localObject = zzc;
    paramMediaPlayer = (String)((Map)localObject).get(Integer.valueOf(paramInt1));
    String str = (String)((Map)localObject).get(Integer.valueOf(paramInt2));
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("AdMediaPlayerView MediaPlayer error: ");
    ((StringBuilder)localObject).append(paramMediaPlayer);
    ((StringBuilder)localObject).append(":");
    ((StringBuilder)localObject).append(str);
    zzbzt.zzj(((StringBuilder)localObject).toString());
    zzF(-1);
    this.zzh = -1;
    zzs.zza.post(new zzcba(this, paramMediaPlayer, str));
    return true;
  }
  
  public final boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Object localObject = zzc;
    paramMediaPlayer = (String)((Map)localObject).get(Integer.valueOf(paramInt1));
    localObject = (String)((Map)localObject).get(Integer.valueOf(paramInt2));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdMediaPlayerView MediaPlayer info: ");
    localStringBuilder.append(paramMediaPlayer);
    localStringBuilder.append(":");
    localStringBuilder.append((String)localObject);
    zze.zza(localStringBuilder.toString());
    return true;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int m = getDefaultSize(this.zzk, paramInt1);
    int k = getDefaultSize(this.zzl, paramInt2);
    int i = m;
    int j = k;
    if (this.zzk > 0)
    {
      i = m;
      j = k;
      if (this.zzl > 0)
      {
        i = m;
        j = k;
        if (this.zzn == null)
        {
          i = View.MeasureSpec.getMode(paramInt1);
          k = View.MeasureSpec.getSize(paramInt1);
          j = View.MeasureSpec.getMode(paramInt2);
          paramInt2 = View.MeasureSpec.getSize(paramInt2);
          m = i;
          if (i == 1073741824)
          {
            if (j == 1073741824)
            {
              paramInt1 = this.zzk;
              j = paramInt1 * paramInt2;
              m = this.zzl;
              i = k * m;
              if (j < i)
              {
                paramInt1 = j / m;
                i = paramInt1;
                j = paramInt2;
                break label347;
              }
              if (j <= i) {
                break label254;
              }
              paramInt1 = i / paramInt1;
            }
            else
            {
              m = 1073741824;
            }
          }
          else
          {
            if (m != 1073741824) {
              break label208;
            }
            paramInt1 = this.zzl * k / this.zzk;
            if ((j == Integer.MIN_VALUE) && (paramInt1 > paramInt2)) {
              break label254;
            }
          }
          for (;;)
          {
            i = k;
            j = paramInt1;
            break label347;
            label208:
            if (j == 1073741824)
            {
              j = this.zzk * paramInt2 / this.zzl;
              paramInt1 = j;
              i = paramInt2;
              if (m == Integer.MIN_VALUE)
              {
                paramInt1 = j;
                i = paramInt2;
                if (j > k)
                {
                  label254:
                  paramInt1 = k;
                  break;
                }
              }
            }
            int i1;
            int n;
            do
            {
              do
              {
                paramInt2 = i;
                break;
                i1 = this.zzk;
                n = this.zzl;
                if ((j == Integer.MIN_VALUE) && (n > paramInt2))
                {
                  j = paramInt2 * i1 / n;
                }
                else
                {
                  j = i1;
                  paramInt2 = n;
                }
                paramInt1 = j;
                i = paramInt2;
              } while (m != Integer.MIN_VALUE);
              paramInt1 = j;
              i = paramInt2;
            } while (j <= k);
            paramInt1 = n * k / i1;
          }
        }
      }
    }
    label347:
    setMeasuredDimension(i, j);
    zzcca localzzcca = this.zzn;
    if (localzzcca != null) {
      localzzcca.zzc(i, j);
    }
  }
  
  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    zze.zza("AdMediaPlayerView prepared");
    zzF(2);
    this.zze.zzb();
    zzs.zza.post(new zzcay(this, paramMediaPlayer));
    this.zzk = paramMediaPlayer.getVideoWidth();
    this.zzl = paramMediaPlayer.getVideoHeight();
    int i = this.zzp;
    if (i != 0) {
      zzq(i);
    }
    if ((this.zzf) && (zzH()) && (this.zzi.getCurrentPosition() > 0) && (this.zzh != 3))
    {
      zze.zza("AdMediaPlayerView nudging MediaPlayer");
      zzG(0.0F);
      this.zzi.start();
      i = this.zzi.getCurrentPosition();
      long l = zzt.zzB().currentTimeMillis();
      while ((zzH()) && (this.zzi.getCurrentPosition() == i) && (zzt.zzB().currentTimeMillis() - l <= 250L)) {}
      this.zzi.pause();
      zzn();
    }
    i = this.zzk;
    int j = this.zzl;
    paramMediaPlayer = new StringBuilder();
    paramMediaPlayer.append("AdMediaPlayerView stream dimensions: ");
    paramMediaPlayer.append(i);
    paramMediaPlayer.append(" x ");
    paramMediaPlayer.append(j);
    zzbzt.zzi(paramMediaPlayer.toString());
    if (this.zzh == 3) {
      zzp();
    }
    zzn();
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    zze.zza("AdMediaPlayerView surface created");
    zzD();
    zzs.zza.post(new zzcbb(this));
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    zze.zza("AdMediaPlayerView surface destroyed");
    paramSurfaceTexture = this.zzi;
    if ((paramSurfaceTexture != null) && (this.zzp == 0)) {
      this.zzp = paramSurfaceTexture.getCurrentPosition();
    }
    paramSurfaceTexture = this.zzn;
    if (paramSurfaceTexture != null) {
      paramSurfaceTexture.zze();
    }
    zzs.zza.post(new zzcbd(this));
    zzE(true);
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    zze.zza("AdMediaPlayerView surface changed");
    int k = this.zzh;
    int m = this.zzk;
    int j = 0;
    int i = j;
    if (m == paramInt1)
    {
      i = j;
      if (this.zzl == paramInt2) {
        i = 1;
      }
    }
    if ((this.zzi != null) && (k == 3) && (i != 0))
    {
      i = this.zzp;
      if (i != 0) {
        zzq(i);
      }
      zzp();
    }
    paramSurfaceTexture = this.zzn;
    if (paramSurfaceTexture != null) {
      paramSurfaceTexture.zzc(paramInt1, paramInt2);
    }
    zzs.zza.post(new zzcbc(this, paramInt1, paramInt2));
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    this.zze.zzf(this);
    this.zza.zza(paramSurfaceTexture, this.zzq);
  }
  
  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdMediaPlayerView size changed: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(" x ");
    localStringBuilder.append(paramInt2);
    zze.zza(localStringBuilder.toString());
    this.zzk = paramMediaPlayer.getVideoWidth();
    paramInt1 = paramMediaPlayer.getVideoHeight();
    this.zzl = paramInt1;
    if ((this.zzk != 0) && (paramInt1 != 0)) {
      requestLayout();
    }
  }
  
  protected final void onWindowVisibilityChanged(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdMediaPlayerView window visibility changed to ");
    localStringBuilder.append(paramInt);
    zze.zza(localStringBuilder.toString());
    zzs.zza.post(new zzcax(this, paramInt));
    super.onWindowVisibilityChanged(paramInt);
  }
  
  public final String toString()
  {
    String str2 = getClass().getName();
    String str1 = Integer.toHexString(hashCode());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2);
    localStringBuilder.append("@");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    if (zzH()) {
      return this.zzi.getCurrentPosition();
    }
    return 0;
  }
  
  public final int zzb()
  {
    if ((Build.VERSION.SDK_INT >= 26) && (zzH())) {
      return this.zzi.getMetrics().getInt("android.media.mediaplayer.dropped");
    }
    return -1;
  }
  
  public final int zzc()
  {
    if (zzH()) {
      return this.zzi.getDuration();
    }
    return -1;
  }
  
  public final int zzd()
  {
    MediaPlayer localMediaPlayer = this.zzi;
    if (localMediaPlayer != null) {
      return localMediaPlayer.getVideoHeight();
    }
    return 0;
  }
  
  public final int zze()
  {
    MediaPlayer localMediaPlayer = this.zzi;
    if (localMediaPlayer != null) {
      return localMediaPlayer.getVideoWidth();
    }
    return 0;
  }
  
  public final long zzf()
  {
    return 0L;
  }
  
  public final long zzg()
  {
    if (this.zzs != null) {
      return zzh() * this.zzm / 100L;
    }
    return -1L;
  }
  
  public final long zzh()
  {
    if (this.zzs != null) {
      return zzc() * this.zzs.intValue();
    }
    return -1L;
  }
  
  public final String zzj()
  {
    String str;
    if (true != this.zzo) {
      str = "";
    } else {
      str = " spherical";
    }
    return "MediaPlayer".concat(str);
  }
  
  public final void zzn()
  {
    zzG(this.zzb.zza());
  }
  
  public final void zzo()
  {
    zze.zza("AdMediaPlayerView pause");
    if ((zzH()) && (this.zzi.isPlaying()))
    {
      this.zzi.pause();
      zzF(4);
      zzs.zza.post(new zzcbf(this));
    }
    this.zzh = 4;
  }
  
  public final void zzp()
  {
    zze.zza("AdMediaPlayerView play");
    if (zzH())
    {
      this.zzi.start();
      zzF(3);
      this.zza.zzb();
      zzs.zza.post(new zzcbe(this));
    }
    this.zzh = 3;
  }
  
  public final void zzq(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdMediaPlayerView seek ");
    localStringBuilder.append(paramInt);
    zze.zza(localStringBuilder.toString());
    if (zzH())
    {
      this.zzi.seekTo(paramInt);
      this.zzp = 0;
      return;
    }
    this.zzp = paramInt;
  }
  
  public final void zzr(zzcbh paramzzcbh)
  {
    this.zzq = paramzzcbh;
  }
  
  public final void zzs(String paramString)
  {
    paramString = Uri.parse(paramString);
    zzawj localzzawj = zzawj.zza(paramString);
    if ((localzzawj != null) && (localzzawj.zza == null)) {
      return;
    }
    if (localzzawj != null) {
      paramString = Uri.parse(localzzawj.zza);
    }
    this.zzj = paramString;
    this.zzp = 0;
    zzD();
    requestLayout();
    invalidate();
  }
  
  public final void zzt()
  {
    zze.zza("AdMediaPlayerView stop");
    MediaPlayer localMediaPlayer = this.zzi;
    if (localMediaPlayer != null)
    {
      localMediaPlayer.stop();
      this.zzi.release();
      this.zzi = null;
      zzF(0);
      this.zzh = 0;
    }
    this.zze.zzd();
  }
  
  public final void zzu(float paramFloat1, float paramFloat2)
  {
    zzcca localzzcca = this.zzn;
    if (localzzcca != null) {
      localzzcca.zzf(paramFloat1, paramFloat2);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */