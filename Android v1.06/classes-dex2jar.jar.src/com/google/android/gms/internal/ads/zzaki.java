package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.MessageDigest;

final class zzaki
  implements zzakh
{
  private final FileChannel zza;
  private final long zzb;
  private final long zzc;
  
  public zzaki(FileChannel paramFileChannel, long paramLong1, long paramLong2)
  {
    this.zza = paramFileChannel;
    this.zzb = paramLong1;
    this.zzc = paramLong2;
  }
  
  public final long zza()
  {
    return this.zzc;
  }
  
  public final void zzb(MessageDigest[] paramArrayOfMessageDigest, long paramLong, int paramInt)
    throws IOException
  {
    long l1 = this.zzb;
    long l2 = paramInt;
    MappedByteBuffer localMappedByteBuffer = this.zza.map(FileChannel.MapMode.READ_ONLY, l1 + paramLong, l2);
    localMappedByteBuffer.load();
    for (paramInt = 0; paramInt < paramArrayOfMessageDigest.length; paramInt++)
    {
      MessageDigest localMessageDigest = paramArrayOfMessageDigest[paramInt];
      localMappedByteBuffer.position(0);
      localMessageDigest.update(localMappedByteBuffer);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */