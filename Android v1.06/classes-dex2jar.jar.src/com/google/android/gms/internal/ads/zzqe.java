package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzqe
  extends zzds
{
  private int zzd;
  private boolean zze;
  private byte[] zzf = zzfn.zzf;
  private byte[] zzg = zzfn.zzf;
  private int zzh;
  private int zzi;
  private int zzj;
  private boolean zzk;
  private long zzl;
  
  private final int zzq(long paramLong)
  {
    return (int)(paramLong * this.zzb.zzb / 1000000L);
  }
  
  private final int zzr(ByteBuffer paramByteBuffer)
  {
    for (int i = paramByteBuffer.position(); i < paramByteBuffer.limit(); i += 2) {
      if (Math.abs(paramByteBuffer.getShort(i)) > 1024)
      {
        int j = this.zzd;
        return j * (i / j);
      }
    }
    return paramByteBuffer.limit();
  }
  
  private final void zzs(byte[] paramArrayOfByte, int paramInt)
  {
    zzj(paramInt).put(paramArrayOfByte, 0, paramInt).flip();
    if (paramInt > 0) {
      this.zzk = true;
    }
  }
  
  private final void zzt(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte, int paramInt)
  {
    int j = Math.min(paramByteBuffer.remaining(), this.zzj);
    int i = this.zzj - j;
    System.arraycopy(paramArrayOfByte, paramInt - i, this.zzg, 0, i);
    paramByteBuffer.position(paramByteBuffer.limit() - j);
    paramByteBuffer.get(this.zzg, i, j);
  }
  
  public final void zze(ByteBuffer paramByteBuffer)
  {
    while ((paramByteBuffer.hasRemaining()) && (!zzn()))
    {
      int i = this.zzh;
      int j;
      int k;
      if (i != 0)
      {
        if (i != 1)
        {
          i = paramByteBuffer.limit();
          j = zzr(paramByteBuffer);
          paramByteBuffer.limit(j);
          this.zzl += paramByteBuffer.remaining() / this.zzd;
          zzt(paramByteBuffer, this.zzg, this.zzj);
          if (j < i)
          {
            zzs(this.zzg, this.zzj);
            this.zzh = 0;
            paramByteBuffer.limit(i);
          }
        }
        else
        {
          j = paramByteBuffer.limit();
          int m = zzr(paramByteBuffer);
          i = m - paramByteBuffer.position();
          byte[] arrayOfByte = this.zzf;
          int n = arrayOfByte.length;
          k = this.zzi;
          n -= k;
          if ((m < j) && (i < n))
          {
            zzs(arrayOfByte, k);
            this.zzi = 0;
            this.zzh = 0;
          }
          else
          {
            i = Math.min(i, n);
            paramByteBuffer.limit(paramByteBuffer.position() + i);
            paramByteBuffer.get(this.zzf, this.zzi, i);
            i = this.zzi + i;
            this.zzi = i;
            arrayOfByte = this.zzf;
            if (i == arrayOfByte.length)
            {
              if (this.zzk)
              {
                zzs(arrayOfByte, this.zzj);
                long l = this.zzl;
                i = this.zzi;
                k = this.zzj;
                this.zzl = (l + (i - (k + k)) / this.zzd);
              }
              else
              {
                this.zzl += (i - this.zzj) / this.zzd;
              }
              zzt(paramByteBuffer, this.zzf, i);
              this.zzi = 0;
              this.zzh = 2;
            }
            paramByteBuffer.limit(j);
          }
        }
      }
      else
      {
        k = paramByteBuffer.limit();
        paramByteBuffer.limit(Math.min(k, paramByteBuffer.position() + this.zzf.length));
        i = paramByteBuffer.limit();
        do
        {
          j = i - 2;
          if (j < paramByteBuffer.position()) {
            break;
          }
          i = j;
        } while (Math.abs(paramByteBuffer.getShort(j)) <= 1024);
        i = this.zzd;
        i = j / i * i + i;
        break label429;
        i = paramByteBuffer.position();
        label429:
        if (i == paramByteBuffer.position())
        {
          this.zzh = 1;
        }
        else
        {
          paramByteBuffer.limit(i);
          i = paramByteBuffer.remaining();
          zzj(i).put(paramByteBuffer).flip();
          if (i > 0) {
            this.zzk = true;
          }
        }
        paramByteBuffer.limit(k);
      }
    }
  }
  
  public final boolean zzg()
  {
    return this.zze;
  }
  
  public final zzdp zzi(zzdp paramzzdp)
    throws zzdq
  {
    if (paramzzdp.zzd == 2)
    {
      if (this.zze) {
        return paramzzdp;
      }
      return zzdp.zza;
    }
    throw new zzdq("Unhandled input format:", paramzzdp);
  }
  
  protected final void zzk()
  {
    if (this.zze)
    {
      this.zzd = this.zzb.zze;
      int i = zzq(150000L) * this.zzd;
      if (this.zzf.length != i) {
        this.zzf = new byte[i];
      }
      i = zzq(20000L) * this.zzd;
      this.zzj = i;
      if (this.zzg.length != i) {
        this.zzg = new byte[i];
      }
    }
    this.zzh = 0;
    this.zzl = 0L;
    this.zzi = 0;
    this.zzk = false;
  }
  
  protected final void zzl()
  {
    int i = this.zzi;
    if (i > 0) {
      zzs(this.zzf, i);
    }
    if (!this.zzk) {
      this.zzl += this.zzj / this.zzd;
    }
  }
  
  protected final void zzm()
  {
    this.zze = false;
    this.zzj = 0;
    this.zzf = zzfn.zzf;
    this.zzg = zzfn.zzf;
  }
  
  public final long zzo()
  {
    return this.zzl;
  }
  
  public final void zzp(boolean paramBoolean)
  {
    this.zze = paramBoolean;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzqe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */