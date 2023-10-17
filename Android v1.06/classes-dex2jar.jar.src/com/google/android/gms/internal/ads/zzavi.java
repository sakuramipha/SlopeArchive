package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzavi
  extends zzauz
{
  private MessageDigest zzb;
  private final int zzc;
  private final int zzd;
  
  public zzavi(int paramInt)
  {
    int j = paramInt >> 3;
    int i = j;
    if ((paramInt & 0x7) > 0) {
      i = j + 1;
    }
    this.zzc = i;
    this.zzd = paramInt;
  }
  
  public final byte[] zzb(String paramString)
  {
    synchronized (this.zza)
    {
      Object localObject2 = zza();
      this.zzb = ((MessageDigest)localObject2);
      int j = 0;
      if (localObject2 == null) {
        return new byte[0];
      }
      ((MessageDigest)localObject2).reset();
      this.zzb.update(paramString.getBytes(Charset.forName("UTF-8")));
      localObject2 = this.zzb.digest();
      int k = localObject2.length;
      int m = this.zzc;
      int i = k;
      if (k > m) {
        i = m;
      }
      paramString = new byte[i];
      System.arraycopy(localObject2, 0, paramString, 0, i);
      if ((this.zzd & 0x7) > 0)
      {
        long l1 = 0L;
        while (j < i)
        {
          long l2 = l1;
          if (j > 0) {
            l2 = l1 << 8;
          }
          l1 = l2 + (paramString[j] & 0xFF);
          j++;
        }
        l1 >>>= 8 - (this.zzd & 0x7);
        i = this.zzc;
        for (;;)
        {
          i--;
          if (i < 0) {
            break;
          }
          paramString[i] = ((byte)(int)(0xFF & l1));
          l1 >>>= 8;
        }
      }
      return paramString;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */