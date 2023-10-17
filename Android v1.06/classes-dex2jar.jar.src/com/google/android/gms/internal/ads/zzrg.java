package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzrg
  extends zzhi
{
  private long zzf;
  private int zzg;
  private int zzh = 32;
  
  public zzrg()
  {
    super(2, 0);
  }
  
  public final void zzb()
  {
    super.zzb();
    this.zzg = 0;
  }
  
  public final int zzm()
  {
    return this.zzg;
  }
  
  public final long zzn()
  {
    return this.zzf;
  }
  
  public final void zzo(int paramInt)
  {
    this.zzh = paramInt;
  }
  
  public final boolean zzp(zzhi paramzzhi)
  {
    zzdy.zzd(paramzzhi.zzd(1073741824) ^ true);
    zzdy.zzd(paramzzhi.zzd(268435456) ^ true);
    zzdy.zzd(paramzzhi.zzd(4) ^ true);
    if (zzq())
    {
      if ((this.zzg >= this.zzh) || (paramzzhi.zzd(Integer.MIN_VALUE) != zzd(Integer.MIN_VALUE))) {
        break label197;
      }
      ByteBuffer localByteBuffer2 = paramzzhi.zzb;
      if (localByteBuffer2 != null)
      {
        localByteBuffer1 = this.zzb;
        if ((localByteBuffer1 != null) && (localByteBuffer1.position() + localByteBuffer2.remaining() > 3072000)) {
          break label197;
        }
      }
    }
    int i = this.zzg;
    this.zzg = (i + 1);
    if (i == 0)
    {
      this.zzd = paramzzhi.zzd;
      if (paramzzhi.zzd(1)) {
        zzc(1);
      }
    }
    if (paramzzhi.zzd(Integer.MIN_VALUE)) {
      zzc(Integer.MIN_VALUE);
    }
    ByteBuffer localByteBuffer1 = paramzzhi.zzb;
    if (localByteBuffer1 != null)
    {
      zzj(localByteBuffer1.remaining());
      this.zzb.put(localByteBuffer1);
    }
    this.zzf = paramzzhi.zzd;
    return true;
    label197:
    return false;
  }
  
  public final boolean zzq()
  {
    return this.zzg > 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */