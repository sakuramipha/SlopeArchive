package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class zzakg
  implements zzakh
{
  private final ByteBuffer zza;
  
  public zzakg(ByteBuffer paramByteBuffer)
  {
    this.zza = paramByteBuffer.slice();
  }
  
  public final long zza()
  {
    return this.zza.capacity();
  }
  
  public final void zzb(MessageDigest[] paramArrayOfMessageDigest, long paramLong, int paramInt)
    throws IOException
  {
    synchronized (this.zza)
    {
      ByteBuffer localByteBuffer = this.zza;
      int i = (int)paramLong;
      localByteBuffer.position(i);
      this.zza.limit(i + paramInt);
      localByteBuffer = this.zza.slice();
      i = paramArrayOfMessageDigest.length;
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        ??? = paramArrayOfMessageDigest[paramInt];
        localByteBuffer.position(0);
        ((MessageDigest)???).update(localByteBuffer);
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzakg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */