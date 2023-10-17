package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class zzasj
  extends zzatf
{
  public zzasj(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2)
  {
    super(paramzzarr, "IWc1kTmZyjEaYg+Bhy1Ic+NBj3x1Dc7qjnIeXSV6/dJrA8kzK2iK01R5H/P8KgRH", "tqyxGM79wOlAPNBhvtAr5QJDQ+dGmpZ4a1UkwVDI/lw=", paramzzano, paramInt1, 24);
  }
  
  private final void zzc()
  {
    Object localObject1 = this.zzb.zzh();
    if (localObject1 == null) {
      return;
    }
    try
    {
      AdvertisingIdClient.Info localInfo = ((AdvertisingIdClient)localObject1).getInfo();
      ??? = localInfo.getId();
      int i = zzaru.zza;
      localObject1 = ???;
      if (??? != null)
      {
        localObject1 = ???;
        if (((String)???).matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"))
        {
          localObject1 = UUID.fromString((String)???);
          ??? = new byte[16];
          ByteBuffer localByteBuffer = ByteBuffer.wrap((byte[])???);
          localByteBuffer.putLong(((UUID)localObject1).getMostSignificantBits());
          localByteBuffer.putLong(((UUID)localObject1).getLeastSignificantBits());
          localObject1 = zzapb.zza((byte[])???, true);
        }
      }
      if (localObject1 != null) {
        synchronized (this.zze)
        {
          this.zze.zzs((String)localObject1);
          this.zze.zzr(localInfo.isLimitAdTrackingEnabled());
          this.zze.zzab(6);
          return;
        }
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    if (!this.zzb.zzq()) {
      synchronized (this.zze)
      {
        this.zze.zzs((String)this.zzf.invoke(null, new Object[] { this.zzb.zzb() }));
        return;
      }
    }
    zzc();
  }
  
  public final Void zzk()
    throws Exception
  {
    if (this.zzb.zzr())
    {
      super.zzk();
      return null;
    }
    if (this.zzb.zzq()) {
      zzc();
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */