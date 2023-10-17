package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public final class zzccy
{
  private long zza;
  
  public final long zza(ByteBuffer paramByteBuffer)
  {
    long l = this.zza;
    if (l > 0L) {
      return l;
    }
    try
    {
      Object localObject = paramByteBuffer.duplicate();
      ((ByteBuffer)localObject).flip();
      paramByteBuffer = new com/google/android/gms/internal/ads/zzccx;
      paramByteBuffer.<init>((ByteBuffer)localObject);
      localObject = new com/google/android/gms/internal/ads/zzams;
      ((zzams)localObject).<init>(paramByteBuffer, zzcda.zzb);
      Iterator localIterator = ((zzguz)localObject).zze().iterator();
      do
      {
        boolean bool = localIterator.hasNext();
        localObject = null;
        if (!bool) {
          break;
        }
        paramByteBuffer = (zzamu)localIterator.next();
      } while (!(paramByteBuffer instanceof zzamw));
      paramByteBuffer = (zzamw)paramByteBuffer;
      break label104;
      paramByteBuffer = null;
      label104:
      localIterator = paramByteBuffer.zze().iterator();
      do
      {
        paramByteBuffer = (ByteBuffer)localObject;
        if (!localIterator.hasNext()) {
          break;
        }
        paramByteBuffer = (zzamu)localIterator.next();
      } while (!(paramByteBuffer instanceof zzamx));
      paramByteBuffer = (zzamx)paramByteBuffer;
      l = paramByteBuffer.zzd() * 1000L / paramByteBuffer.zze();
      this.zza = l;
      return l;
    }
    catch (RuntimeException|IOException paramByteBuffer) {}
    return 0L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzccy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */