package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public abstract interface zzgva
  extends Closeable
{
  public abstract int zza(ByteBuffer paramByteBuffer)
    throws IOException;
  
  public abstract long zzb()
    throws IOException;
  
  public abstract long zzc()
    throws IOException;
  
  public abstract ByteBuffer zzd(long paramLong1, long paramLong2)
    throws IOException;
  
  public abstract void zze(long paramLong)
    throws IOException;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */