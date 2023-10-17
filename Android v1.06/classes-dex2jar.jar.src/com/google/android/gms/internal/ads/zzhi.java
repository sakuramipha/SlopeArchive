package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class zzhi
  extends zzhc
{
  public final zzhf zza = new zzhf();
  public ByteBuffer zzb;
  public boolean zzc;
  public long zzd;
  public ByteBuffer zze;
  private final int zzf;
  
  static
  {
    zzbr.zzb("media3.decoder");
  }
  
  public zzhi(int paramInt1, int paramInt2)
  {
    this.zzf = paramInt1;
  }
  
  private final ByteBuffer zzm(int paramInt)
  {
    int i = this.zzf;
    if (i == 1) {
      return ByteBuffer.allocate(paramInt);
    }
    if (i == 2) {
      return ByteBuffer.allocateDirect(paramInt);
    }
    ByteBuffer localByteBuffer = this.zzb;
    if (localByteBuffer == null) {
      i = 0;
    } else {
      i = localByteBuffer.capacity();
    }
    throw new zzhh(i, paramInt);
  }
  
  public void zzb()
  {
    super.zzb();
    ByteBuffer localByteBuffer = this.zzb;
    if (localByteBuffer != null) {
      localByteBuffer.clear();
    }
    localByteBuffer = this.zze;
    if (localByteBuffer != null) {
      localByteBuffer.clear();
    }
    this.zzc = false;
  }
  
  @EnsuresNonNull({"data"})
  public final void zzj(int paramInt)
  {
    ByteBuffer localByteBuffer1 = this.zzb;
    if (localByteBuffer1 == null)
    {
      this.zzb = zzm(paramInt);
      return;
    }
    int j = localByteBuffer1.capacity();
    int i = localByteBuffer1.position();
    paramInt += i;
    if (j >= paramInt)
    {
      this.zzb = localByteBuffer1;
      return;
    }
    ByteBuffer localByteBuffer2 = zzm(paramInt);
    localByteBuffer2.order(localByteBuffer1.order());
    if (i > 0)
    {
      localByteBuffer1.flip();
      localByteBuffer2.put(localByteBuffer1);
    }
    this.zzb = localByteBuffer2;
  }
  
  public final void zzk()
  {
    ByteBuffer localByteBuffer = this.zzb;
    if (localByteBuffer != null) {
      localByteBuffer.flip();
    }
    localByteBuffer = this.zze;
    if (localByteBuffer != null) {
      localByteBuffer.flip();
    }
  }
  
  public final boolean zzl()
  {
    return zzd(1073741824);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */