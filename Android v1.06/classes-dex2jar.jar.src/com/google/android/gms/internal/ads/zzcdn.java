package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class zzcdn
  implements Releasable
{
  protected final Context zza;
  protected final String zzb;
  protected final WeakReference zzc;
  
  public zzcdn(zzccc paramzzccc)
  {
    Context localContext = paramzzccc.getContext();
    this.zza = localContext;
    this.zzb = zzt.zzp().zzc(localContext, paramzzccc.zzn().zza);
    this.zzc = new WeakReference(paramzzccc);
  }
  
  public void release() {}
  
  public abstract void zzf();
  
  public final void zzg(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    zzbzm.zza.post(new zzcdm(this, paramString1, paramString2, paramString3, paramString4));
  }
  
  protected final void zzh(String paramString1, String paramString2, int paramInt)
  {
    zzbzm.zza.post(new zzcdk(this, paramString1, paramString2, paramInt));
  }
  
  public final void zzj(String paramString1, String paramString2, long paramLong)
  {
    zzbzm.zza.post(new zzcdl(this, paramString1, paramString2, paramLong));
  }
  
  public final void zzn(String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, int paramInt3, int paramInt4)
  {
    zzbzm.zza.post(new zzcdj(this, paramString1, paramString2, paramInt1, paramInt2, paramLong1, paramLong2, paramBoolean, paramInt3, paramInt4));
  }
  
  public final void zzo(String paramString1, String paramString2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, long paramLong4, long paramLong5, int paramInt1, int paramInt2)
  {
    zzbzm.zza.post(new zzcdi(this, paramString1, paramString2, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramBoolean, paramInt1, paramInt2));
  }
  
  protected void zzp(int paramInt) {}
  
  protected void zzq(int paramInt) {}
  
  protected void zzr(int paramInt) {}
  
  protected void zzs(int paramInt) {}
  
  public abstract boolean zzt(String paramString);
  
  public boolean zzu(String paramString, String[] paramArrayOfString)
  {
    return zzt(paramString);
  }
  
  public boolean zzw(String paramString, String[] paramArrayOfString, zzcdf paramzzcdf)
  {
    return zzt(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */