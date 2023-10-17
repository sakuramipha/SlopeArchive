package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzdv
  extends zzds
{
  public final void zze(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int m = paramByteBuffer.limit();
    int k = m - i;
    int n = this.zzb.zzd;
    int j = k;
    if (n != 3)
    {
      if (n != 4)
      {
        j = k;
        if (n == 268435456) {
          break label96;
        }
        if (n != 536870912)
        {
          if (n != 805306368) {
            throw new IllegalStateException();
          }
        }
        else
        {
          j = k / 3;
          break label92;
        }
      }
      j = k / 2;
      break label96;
    }
    label92:
    j += j;
    label96:
    ByteBuffer localByteBuffer = zzj(j);
    k = this.zzb.zzd;
    j = i;
    if (k != 3)
    {
      j = i;
      if (k != 4)
      {
        j = i;
        if (k != 268435456)
        {
          j = i;
          if (k != 536870912)
          {
            if (k == 805306368) {
              while (i < m)
              {
                localByteBuffer.put(paramByteBuffer.get(i + 2));
                localByteBuffer.put(paramByteBuffer.get(i + 3));
                i += 4;
              }
            }
            throw new IllegalStateException();
          }
          while (j < m)
          {
            localByteBuffer.put(paramByteBuffer.get(j + 1));
            localByteBuffer.put(paramByteBuffer.get(j + 2));
            j += 3;
          }
        }
        while (j < m)
        {
          localByteBuffer.put(paramByteBuffer.get(j + 1));
          localByteBuffer.put(paramByteBuffer.get(j));
          j += 2;
        }
      }
      while (j < m)
      {
        i = (short)(int)(Math.max(-1.0F, Math.min(paramByteBuffer.getFloat(j), 1.0F)) * 32767.0F);
        localByteBuffer.put((byte)(i & 0xFF));
        localByteBuffer.put((byte)(i >> 8 & 0xFF));
        j += 4;
      }
    }
    while (j < m)
    {
      localByteBuffer.put((byte)0);
      localByteBuffer.put((byte)((paramByteBuffer.get(j) & 0xFF) - 128));
      j++;
    }
    paramByteBuffer.position(paramByteBuffer.limit());
    localByteBuffer.flip();
  }
  
  public final zzdp zzi(zzdp paramzzdp)
    throws zzdq
  {
    int i = paramzzdp.zzd;
    if (i != 3) {
      if (i != 2)
      {
        if ((i != 268435456) && (i != 536870912) && (i != 805306368) && (i != 4)) {
          throw new zzdq("Unhandled input format:", paramzzdp);
        }
      }
      else {
        return zzdp.zza;
      }
    }
    paramzzdp = new zzdp(paramzzdp.zzb, paramzzdp.zzc, 2);
    return paramzzdp;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */