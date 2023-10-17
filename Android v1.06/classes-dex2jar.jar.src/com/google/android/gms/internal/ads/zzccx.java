package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

final class zzccx
  implements zzgva
{
  private final ByteBuffer zza;
  
  zzccx(ByteBuffer paramByteBuffer)
  {
    this.zza = paramByteBuffer.duplicate();
  }
  
  public final void close()
    throws IOException
  {}
  
  public final int zza(ByteBuffer paramByteBuffer)
    throws IOException
  {
    if ((this.zza.remaining() == 0) && (paramByteBuffer.remaining() > 0)) {
      return -1;
    }
    int i = Math.min(paramByteBuffer.remaining(), this.zza.remaining());
    byte[] arrayOfByte = new byte[i];
    this.zza.get(arrayOfByte);
    paramByteBuffer.put(arrayOfByte);
    return i;
  }
  
  public final long zzb()
    throws IOException
  {
    return this.zza.position();
  }
  
  public final long zzc()
    throws IOException
  {
    return this.zza.limit();
  }
  
  public final ByteBuffer zzd(long paramLong1, long paramLong2)
    throws IOException
  {
    int i = this.zza.position();
    this.zza.position((int)paramLong1);
    ByteBuffer localByteBuffer = this.zza.slice();
    localByteBuffer.limit((int)paramLong2);
    this.zza.position(i);
    return localByteBuffer;
  }
  
  public final void zze(long paramLong)
    throws IOException
  {
    this.zza.position((int)paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzccx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */