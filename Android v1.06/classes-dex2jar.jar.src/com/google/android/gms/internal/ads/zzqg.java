package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzqg
  extends zzds
{
  private int zzd;
  private int zze;
  private boolean zzf;
  private int zzg;
  private byte[] zzh = zzfn.zzf;
  private int zzi;
  private long zzj;
  
  public final ByteBuffer zzb()
  {
    if (super.zzh())
    {
      int i = this.zzi;
      if (i > 0)
      {
        zzj(i).put(this.zzh, 0, this.zzi).flip();
        this.zzi = 0;
      }
    }
    return super.zzb();
  }
  
  public final void zze(ByteBuffer paramByteBuffer)
  {
    int k = paramByteBuffer.position();
    int i = paramByteBuffer.limit();
    int j = i - k;
    if (j == 0) {
      return;
    }
    int m = Math.min(j, this.zzg);
    this.zzj += m / this.zzb.zze;
    this.zzg -= m;
    paramByteBuffer.position(k + m);
    if (this.zzg > 0) {
      return;
    }
    k = j - m;
    m = this.zzi + k - this.zzh.length;
    ByteBuffer localByteBuffer = zzj(m);
    j = Math.max(0, Math.min(m, this.zzi));
    localByteBuffer.put(this.zzh, 0, j);
    m = Math.max(0, Math.min(m - j, k));
    paramByteBuffer.limit(paramByteBuffer.position() + m);
    localByteBuffer.put(paramByteBuffer);
    paramByteBuffer.limit(i);
    k -= m;
    i = this.zzi - j;
    this.zzi = i;
    byte[] arrayOfByte = this.zzh;
    System.arraycopy(arrayOfByte, j, arrayOfByte, 0, i);
    paramByteBuffer.get(this.zzh, this.zzi, k);
    this.zzi += k;
    localByteBuffer.flip();
  }
  
  public final boolean zzh()
  {
    return (super.zzh()) && (this.zzi == 0);
  }
  
  public final zzdp zzi(zzdp paramzzdp)
    throws zzdq
  {
    if (paramzzdp.zzd == 2)
    {
      this.zzf = true;
      zzdp localzzdp = paramzzdp;
      if (this.zzd == 0) {
        if (this.zze != 0) {
          localzzdp = paramzzdp;
        } else {
          localzzdp = zzdp.zza;
        }
      }
      return localzzdp;
    }
    throw new zzdq("Unhandled input format:", paramzzdp);
  }
  
  protected final void zzk()
  {
    if (this.zzf)
    {
      this.zzf = false;
      int i = this.zze;
      int j = this.zzb.zze;
      this.zzh = new byte[i * j];
      this.zzg = (this.zzd * j);
    }
    this.zzi = 0;
  }
  
  protected final void zzl()
  {
    if (this.zzf)
    {
      int i = this.zzi;
      if (i > 0) {
        this.zzj += i / this.zzb.zze;
      }
      this.zzi = 0;
    }
  }
  
  protected final void zzm()
  {
    this.zzh = zzfn.zzf;
  }
  
  public final long zzo()
  {
    return this.zzj;
  }
  
  public final void zzp()
  {
    this.zzj = 0L;
  }
  
  public final void zzq(int paramInt1, int paramInt2)
  {
    this.zzd = paramInt1;
    this.zze = paramInt2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzqg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */