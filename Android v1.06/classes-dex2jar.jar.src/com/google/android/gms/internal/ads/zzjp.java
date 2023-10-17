package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView.SurfaceTextureListener;

final class zzjp
  implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzzj, zzot, zzvn, zzsl, zzhp, zzhl, zzll, zzib
{
  public static final int zzb = 0;
  final zzjt zza;
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    zzjt.zzT(this.zza, paramSurfaceTexture);
    zzjt.zzR(this.zza, paramInt1, paramInt2);
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    zzjt.zzU(this.zza, null);
    zzjt.zzR(this.zza, 0, 0);
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    zzjt.zzR(this.zza, paramInt1, paramInt2);
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    zzjt.zzR(this.zza, paramInt2, paramInt3);
  }
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder) {}
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    zzjt.zzR(this.zza, 0, 0);
  }
  
  public final void zza(boolean paramBoolean)
  {
    zzjt.zzW(this.zza);
  }
  
  public final void zzb(Exception paramException)
  {
    zzjt.zzI(this.zza).zzy(paramException);
  }
  
  public final void zzc(String paramString, long paramLong1, long paramLong2)
  {
    zzjt.zzI(this.zza).zzz(paramString, paramLong1, paramLong2);
  }
  
  public final void zzd(String paramString)
  {
    zzjt.zzI(this.zza).zzA(paramString);
  }
  
  public final void zze(zzhs paramzzhs)
  {
    zzjt.zzI(this.zza).zzB(paramzzhs);
    zzjt.zzL(this.zza, null);
    zzjt.zzK(this.zza, null);
  }
  
  public final void zzf(zzhs paramzzhs)
  {
    zzjt.zzK(this.zza, paramzzhs);
    zzjt.zzI(this.zza).zzC(paramzzhs);
  }
  
  public final void zzg(zzam paramzzam, zzht paramzzht)
  {
    zzjt.zzL(this.zza, paramzzam);
    zzjt.zzI(this.zza).zzD(paramzzam, paramzzht);
  }
  
  public final void zzh(long paramLong)
  {
    zzjt.zzI(this.zza).zzE(paramLong);
  }
  
  public final void zzi(Exception paramException)
  {
    zzjt.zzI(this.zza).zzF(paramException);
  }
  
  public final void zzj(int paramInt, long paramLong1, long paramLong2)
  {
    zzjt.zzI(this.zza).zzG(paramInt, paramLong1, paramLong2);
  }
  
  public final void zzk(int paramInt, long paramLong)
  {
    zzjt.zzI(this.zza).zzH(paramInt, paramLong);
  }
  
  public final void zzl(Object paramObject, long paramLong)
  {
    zzjt.zzI(this.zza).zzI(paramObject, paramLong);
    zzjt localzzjt = this.zza;
    if (zzjt.zzJ(localzzjt) == paramObject)
    {
      paramObject = zzjt.zzF(localzzjt);
      ((zzeo)paramObject).zzd(26, zzjj.zza);
      ((zzeo)paramObject).zzc();
    }
  }
  
  public final void zzm(boolean paramBoolean)
  {
    Object localObject = this.zza;
    if (zzjt.zzaa((zzjt)localObject) == paramBoolean) {
      return;
    }
    zzjt.zzN((zzjt)localObject, paramBoolean);
    localObject = zzjt.zzF(this.zza);
    ((zzeo)localObject).zzd(23, new zzjm(paramBoolean));
    ((zzeo)localObject).zzc();
  }
  
  public final void zzn(Exception paramException)
  {
    zzjt.zzI(this.zza).zzJ(paramException);
  }
  
  public final void zzo(String paramString, long paramLong1, long paramLong2)
  {
    zzjt.zzI(this.zza).zzK(paramString, paramLong1, paramLong2);
  }
  
  public final void zzp(String paramString)
  {
    zzjt.zzI(this.zza).zzL(paramString);
  }
  
  public final void zzq(zzhs paramzzhs)
  {
    zzjt.zzI(this.zza).zzM(paramzzhs);
    zzjt.zzP(this.zza, null);
    zzjt.zzO(this.zza, null);
  }
  
  public final void zzr(zzhs paramzzhs)
  {
    zzjt.zzO(this.zza, paramzzhs);
    zzjt.zzI(this.zza).zzN(paramzzhs);
  }
  
  public final void zzs(long paramLong, int paramInt)
  {
    zzjt.zzI(this.zza).zzO(paramLong, paramInt);
  }
  
  public final void zzt(zzam paramzzam, zzht paramzzht)
  {
    zzjt.zzP(this.zza, paramzzam);
    zzjt.zzI(this.zza).zzP(paramzzam, paramzzht);
  }
  
  public final void zzu(zzdn paramzzdn)
  {
    zzjt.zzQ(this.zza, paramzzdn);
    zzeo localzzeo = zzjt.zzF(this.zza);
    localzzeo.zzd(25, new zzjn(paramzzdn));
    localzzeo.zzc();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzjp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */