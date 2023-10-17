package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

public final class zzave
  extends zzauz
{
  private MessageDigest zzb;
  
  public final byte[] zzb(String paramString)
  {
    Object localObject2 = paramString.split(" ");
    int j = localObject2.length;
    int k = 4;
    if (j == 1)
    {
      j = zzavd.zza(localObject2[0]);
      paramString = ByteBuffer.allocate(4);
      paramString.order(ByteOrder.LITTLE_ENDIAN);
      paramString.putInt(j);
      paramString = paramString.array();
    }
    else
    {
      int m;
      if (j < 5)
      {
        ??? = new byte[j + j];
        for (j = 0;; j++)
        {
          paramString = (String)???;
          if (j >= localObject2.length) {
            break;
          }
          m = zzavd.zza(localObject2[j]);
          m = m >> 16 ^ (char)m;
          int i = (byte)m;
          paramString = new byte[2];
          paramString[0] = i;
          paramString[1] = ((byte)(m >> 8));
          i = paramString[0];
          m = j + j;
          ???[m] = i;
          ???[(m + 1)] = paramString[1];
        }
      }
      ??? = new byte[j];
      for (j = 0;; j++)
      {
        paramString = (String)???;
        if (j >= localObject2.length) {
          break;
        }
        m = zzavd.zza(localObject2[j]);
        ???[j] = ((byte)(m >> 24 ^ m & 0xFF ^ m >> 8 & 0xFF ^ m >> 16 & 0xFF));
      }
    }
    this.zzb = zza();
    synchronized (this.zza)
    {
      localObject2 = this.zzb;
      if (localObject2 == null) {
        return new byte[0];
      }
      ((MessageDigest)localObject2).reset();
      this.zzb.update(paramString);
      localObject2 = this.zzb.digest();
      j = localObject2.length;
      if (j > 4) {
        j = k;
      }
      paramString = new byte[j];
      System.arraycopy(localObject2, 0, paramString, 0, j);
      return paramString;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzave.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */