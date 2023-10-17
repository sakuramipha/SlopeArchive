package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

public final class zzqd
{
  private ByteBuffer zza = zzdr.zza;
  private int zzb = 2;
  private int zzc = 0;
  
  public final void zza(zzhi paramzzhi)
  {
    ByteBuffer localByteBuffer1 = paramzzhi.zzb;
    Objects.requireNonNull(localByteBuffer1);
    if (localByteBuffer1.limit() - paramzzhi.zzb.position() == 0) {
      return;
    }
    ByteBuffer localByteBuffer2 = paramzzhi.zzb;
    int m = localByteBuffer2.position();
    int n = localByteBuffer2.limit();
    int i = n - m;
    int k = this.zza.capacity();
    int i1 = (i + 255) / 255;
    int j = i1 + 27 + i;
    if (k < j) {
      this.zza = ByteBuffer.allocate(j).order(ByteOrder.LITTLE_ENDIAN);
    } else {
      this.zza.clear();
    }
    localByteBuffer1 = this.zza;
    localByteBuffer1.put((byte)79);
    localByteBuffer1.put((byte)103);
    localByteBuffer1.put((byte)103);
    localByteBuffer1.put((byte)83);
    localByteBuffer1.put((byte)0);
    localByteBuffer1.put((byte)0);
    j = zzabj.zzb(localByteBuffer2);
    j = this.zzc + j;
    this.zzc = j;
    localByteBuffer1.putLong(j);
    localByteBuffer1.putInt(0);
    localByteBuffer1.putInt(this.zzb);
    this.zzb += 1;
    localByteBuffer1.putInt(0);
    localByteBuffer1.put((byte)i1);
    for (j = 0;; j++)
    {
      k = m;
      if (j >= i1) {
        break;
      }
      if (i >= 255)
      {
        localByteBuffer1.put((byte)-1);
        i -= 255;
      }
      else
      {
        localByteBuffer1.put((byte)i);
        i = 0;
      }
    }
    while (k < n)
    {
      localByteBuffer1.put(localByteBuffer2.get(k));
      k++;
    }
    localByteBuffer2.position(localByteBuffer2.limit());
    localByteBuffer1.flip();
    localByteBuffer1.putInt(22, zzfn.zzd(localByteBuffer1.array(), localByteBuffer1.arrayOffset(), localByteBuffer1.limit() - localByteBuffer1.position(), 0));
    localByteBuffer1.position(0);
    this.zza = localByteBuffer1;
    paramzzhi.zzb();
    paramzzhi.zzj(this.zza.remaining());
    paramzzhi.zzb.put(this.zza);
    paramzzhi.zzk();
  }
  
  public final void zzb()
  {
    this.zza = zzdr.zza;
    this.zzc = 0;
    this.zzb = 2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzqd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */