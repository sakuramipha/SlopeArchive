package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzgnl
  extends OutputStream
{
  private static final byte[] zza = new byte[0];
  private final int zzb = 128;
  private final ArrayList zzc = new ArrayList();
  private int zzd;
  private byte[] zze = new byte[''];
  private int zzf;
  
  zzgnl(int paramInt) {}
  
  private final void zzd(int paramInt)
  {
    this.zzc.add(new zzgnk(this.zze));
    int i = this.zzd + this.zze.length;
    this.zzd = i;
    this.zze = new byte[Math.max(this.zzb, Math.max(paramInt, i >>> 1))];
    this.zzf = 0;
  }
  
  public final String toString()
  {
    return String.format("<ByteString.Output@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza()) });
  }
  
  public final void write(int paramInt)
  {
    try
    {
      if (this.zzf == this.zze.length) {
        zzd(1);
      }
      byte[] arrayOfByte = this.zze;
      int i = this.zzf;
      this.zzf = (i + 1);
      arrayOfByte[i] = ((byte)paramInt);
      return;
    }
    finally {}
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      byte[] arrayOfByte = this.zze;
      int j = arrayOfByte.length;
      int i = this.zzf;
      j -= i;
      if (paramInt2 <= j)
      {
        System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, i, paramInt2);
        this.zzf += paramInt2;
        return;
      }
      System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, i, j);
      paramInt2 -= j;
      zzd(paramInt2);
      System.arraycopy(paramArrayOfByte, paramInt1 + j, this.zze, 0, paramInt2);
      this.zzf = paramInt2;
      return;
    }
    finally {}
  }
  
  public final int zza()
  {
    try
    {
      int j = this.zzd;
      int i = this.zzf;
      return j + i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzgno zzb()
  {
    try
    {
      int i = this.zzf;
      Object localObject1 = this.zze;
      Object localObject3;
      if (i < localObject1.length)
      {
        if (i > 0)
        {
          byte[] arrayOfByte = Arrays.copyOf((byte[])localObject1, i);
          localObject1 = this.zzc;
          localObject3 = new com/google/android/gms/internal/ads/zzgnk;
          ((zzgnk)localObject3).<init>(arrayOfByte);
          ((ArrayList)localObject1).add(localObject3);
        }
      }
      else
      {
        localObject3 = this.zzc;
        localObject1 = new com/google/android/gms/internal/ads/zzgnk;
        ((zzgnk)localObject1).<init>(this.zze);
        ((ArrayList)localObject3).add(localObject1);
        this.zze = zza;
      }
      this.zzd += this.zzf;
      this.zzf = 0;
      localObject1 = zzgno.zzu(this.zzc);
      return (zzgno)localObject1;
    }
    finally {}
  }
  
  public final void zzc()
  {
    try
    {
      this.zzc.clear();
      this.zzd = 0;
      this.zzf = 0;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgnl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */