package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzdjm
{
  private final zzbo zza;
  private final Clock zzb;
  private final Executor zzc;
  
  public zzdjm(zzbo paramzzbo, Clock paramClock, Executor paramExecutor)
  {
    this.zza = paramzzbo;
    this.zzb = paramClock;
    this.zzc = paramExecutor;
  }
  
  private final Bitmap zzc(byte[] paramArrayOfByte, BitmapFactory.Options paramOptions)
  {
    long l1 = this.zzb.elapsedRealtime();
    int i = paramArrayOfByte.length;
    boolean bool = false;
    paramOptions = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, i, paramOptions);
    long l2 = this.zzb.elapsedRealtime();
    if (paramOptions != null)
    {
      int j = paramOptions.getWidth();
      i = paramOptions.getHeight();
      int k = paramOptions.getAllocationByteCount();
      if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        bool = true;
      }
      paramArrayOfByte = new StringBuilder();
      paramArrayOfByte.append("Decoded image w: ");
      paramArrayOfByte.append(j);
      paramArrayOfByte.append(" h:");
      paramArrayOfByte.append(i);
      paramArrayOfByte.append(" bytes: ");
      paramArrayOfByte.append(k);
      paramArrayOfByte.append(" time: ");
      paramArrayOfByte.append(l2 - l1);
      paramArrayOfByte.append(" on ui thread: ");
      paramArrayOfByte.append(bool);
      zze.zza(paramArrayOfByte.toString());
    }
    return paramOptions;
  }
  
  public final zzfwb zzb(String paramString, double paramDouble, boolean paramBoolean)
  {
    return zzfvr.zzl(this.zza.zza(paramString), new zzdjl(this, paramDouble, paramBoolean), this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */