package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzqf
  extends zzds
{
  private static final int zzd = Float.floatToIntBits(NaN.0F);
  
  private static void zzo(int paramInt, ByteBuffer paramByteBuffer)
  {
    int i = Float.floatToIntBits((float)(paramInt * 4.656612875245797E-10D));
    paramInt = i;
    if (i == zzd) {
      paramInt = Float.floatToIntBits(0.0F);
    }
    paramByteBuffer.putInt(paramInt);
  }
  
  public final void zze(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int m = j - i;
    int k = this.zzb.zzd;
    ByteBuffer localByteBuffer1;
    if (k != 536870912)
    {
      if (k == 805306368)
      {
        localByteBuffer2 = zzj(m);
        for (;;)
        {
          localByteBuffer1 = localByteBuffer2;
          if (i >= j) {
            break;
          }
          zzo(paramByteBuffer.get(i) & 0xFF | (paramByteBuffer.get(i + 1) & 0xFF) << 8 | (paramByteBuffer.get(i + 2) & 0xFF) << 16 | (paramByteBuffer.get(i + 3) & 0xFF) << 24, localByteBuffer2);
          i += 4;
        }
      }
      throw new IllegalStateException();
    }
    ByteBuffer localByteBuffer2 = zzj(m / 3 * 4);
    for (;;)
    {
      localByteBuffer1 = localByteBuffer2;
      if (i >= j) {
        break;
      }
      zzo((paramByteBuffer.get(i) & 0xFF) << 8 | (paramByteBuffer.get(i + 1) & 0xFF) << 16 | (paramByteBuffer.get(i + 2) & 0xFF) << 24, localByteBuffer2);
      i += 3;
    }
    paramByteBuffer.position(paramByteBuffer.limit());
    localByteBuffer1.flip();
  }
  
  public final zzdp zzi(zzdp paramzzdp)
    throws zzdq
  {
    int i = paramzzdp.zzd;
    int j = zzfn.zza;
    if ((i != 536870912) && (i != 805306368))
    {
      if (i == 4) {
        paramzzdp = zzdp.zza;
      } else {
        throw new zzdq("Unhandled input format:", paramzzdp);
      }
    }
    else {
      paramzzdp = new zzdp(paramzzdp.zzb, paramzzdp.zzc, 4);
    }
    return paramzzdp;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */