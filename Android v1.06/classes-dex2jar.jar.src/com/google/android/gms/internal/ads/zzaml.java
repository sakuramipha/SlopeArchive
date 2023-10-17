package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class zzaml
  extends ByteArrayOutputStream
{
  private final zzalz zza;
  
  public zzaml(zzalz paramzzalz, int paramInt)
  {
    this.zza = paramzzalz;
    this.buf = paramzzalz.zzb(Math.max(paramInt, 256));
  }
  
  private final void zza(int paramInt)
  {
    if (this.count + paramInt <= this.buf.length) {
      return;
    }
    Object localObject = this.zza;
    paramInt = this.count + paramInt;
    localObject = ((zzalz)localObject).zzb(paramInt + paramInt);
    System.arraycopy(this.buf, 0, localObject, 0, this.count);
    this.zza.zza(this.buf);
    this.buf = ((byte[])localObject);
  }
  
  public final void close()
    throws IOException
  {
    this.zza.zza(this.buf);
    this.buf = null;
    super.close();
  }
  
  public final void finalize()
  {
    this.zza.zza(this.buf);
  }
  
  public final void write(int paramInt)
  {
    try
    {
      zza(1);
      super.write(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      zza(paramInt2);
      super.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */