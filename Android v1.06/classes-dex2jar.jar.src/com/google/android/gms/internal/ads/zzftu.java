package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.Queue;

public final class zzftu
{
  private static final OutputStream zza = new zzftt();
  
  public static byte[] zza(InputStream paramInputStream)
    throws IOException
  {
    Objects.requireNonNull(paramInputStream);
    ArrayDeque localArrayDeque = new ArrayDeque(20);
    int i = Integer.highestOneBit(0);
    i = Math.min(8192, Math.max(128, i + i));
    int j = 0;
    while (j < 2147483639)
    {
      int m = Math.min(i, 2147483639 - j);
      byte[] arrayOfByte = new byte[m];
      localArrayDeque.add(arrayOfByte);
      int k = 0;
      while (k < m)
      {
        int n = paramInputStream.read(arrayOfByte, k, m - k);
        if (n == -1)
        {
          paramInputStream = zzb(localArrayDeque, j);
          break label163;
        }
        k += n;
        j += n;
      }
      if (i < 4096) {
        k = 4;
      } else {
        k = 2;
      }
      i = zzftz.zzc(i * k);
    }
    if (paramInputStream.read() == -1)
    {
      paramInputStream = zzb(localArrayDeque, 2147483639);
      label163:
      return paramInputStream;
    }
    throw new OutOfMemoryError("input is too large to fit in a byte array");
  }
  
  private static byte[] zzb(Queue paramQueue, int paramInt)
  {
    if (paramQueue.isEmpty()) {
      return new byte[0];
    }
    byte[] arrayOfByte1 = (byte[])paramQueue.remove();
    int i = arrayOfByte1.length;
    if (i == paramInt) {
      return arrayOfByte1;
    }
    arrayOfByte1 = Arrays.copyOf(arrayOfByte1, paramInt);
    i = paramInt - i;
    while (i > 0)
    {
      byte[] arrayOfByte2 = (byte[])paramQueue.remove();
      int j = Math.min(i, arrayOfByte2.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramInt - i, j);
      i -= j;
    }
    return arrayOfByte1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */