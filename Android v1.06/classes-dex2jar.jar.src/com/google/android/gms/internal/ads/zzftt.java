package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.Objects;

final class zzftt
  extends OutputStream
{
  public final String toString()
  {
    return "ByteStreams.nullOutputStream()";
  }
  
  public final void write(int paramInt) {}
  
  public final void write(byte[] paramArrayOfByte)
  {
    Objects.requireNonNull(paramArrayOfByte);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Objects.requireNonNull(paramArrayOfByte);
    zzfoz.zzg(paramInt1, paramInt2 + paramInt1, paramArrayOfByte.length);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */