package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

final class zzgob
  extends zzgny
{
  private final OutputStream zzg;
  
  zzgob(OutputStream paramOutputStream, int paramInt)
  {
    super(paramInt);
    this.zzg = paramOutputStream;
  }
  
  private final void zzG()
    throws IOException
  {
    this.zzg.write(this.zza, 0, this.zzc);
    this.zzc = 0;
  }
  
  private final void zzH(int paramInt)
    throws IOException
  {
    if (this.zzb - this.zzc < paramInt) {
      zzG();
    }
  }
  
  public final void zzI()
    throws IOException
  {
    if (this.zzc > 0) {
      zzG();
    }
  }
  
  public final void zzJ(byte paramByte)
    throws IOException
  {
    if (this.zzc == this.zzb) {
      zzG();
    }
    zzc(paramByte);
  }
  
  public final void zzK(int paramInt, boolean paramBoolean)
    throws IOException
  {
    zzH(11);
    zzf(paramInt << 3);
    zzc(paramBoolean);
  }
  
  public final void zzL(int paramInt, zzgno paramzzgno)
    throws IOException
  {
    zzs(paramInt << 3 | 0x2);
    zzs(paramzzgno.zzd());
    paramzzgno.zzo(this);
  }
  
  public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    zzp(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void zzh(int paramInt1, int paramInt2)
    throws IOException
  {
    zzH(14);
    zzf(paramInt1 << 3 | 0x5);
    zzd(paramInt2);
  }
  
  public final void zzi(int paramInt)
    throws IOException
  {
    zzH(4);
    zzd(paramInt);
  }
  
  public final void zzj(int paramInt, long paramLong)
    throws IOException
  {
    zzH(18);
    zzf(paramInt << 3 | 0x1);
    zze(paramLong);
  }
  
  public final void zzk(long paramLong)
    throws IOException
  {
    zzH(8);
    zze(paramLong);
  }
  
  public final void zzl(int paramInt1, int paramInt2)
    throws IOException
  {
    zzH(20);
    zzf(paramInt1 << 3);
    if (paramInt2 >= 0)
    {
      zzf(paramInt2);
      return;
    }
    zzg(paramInt2);
  }
  
  public final void zzm(int paramInt)
    throws IOException
  {
    if (paramInt >= 0)
    {
      zzs(paramInt);
      return;
    }
    zzu(paramInt);
  }
  
  final void zzn(int paramInt, zzgqg paramzzgqg, zzgqz paramzzgqz)
    throws IOException
  {
    zzs(paramInt << 3 | 0x2);
    zzs(((zzgmx)paramzzgqg).zzat(paramzzgqz));
    paramzzgqz.zzm(paramzzgqg, this.zze);
  }
  
  public final void zzo(int paramInt, String paramString)
    throws IOException
  {
    zzs(paramInt << 3 | 0x2);
    zzv(paramString);
  }
  
  public final void zzp(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = this.zzb;
    int j = this.zzc;
    i -= j;
    if (i >= paramInt2)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.zza, j, paramInt2);
      this.zzc += paramInt2;
      this.zzd += paramInt2;
      return;
    }
    System.arraycopy(paramArrayOfByte, paramInt1, this.zza, j, i);
    paramInt1 += i;
    this.zzc = this.zzb;
    this.zzd += i;
    zzG();
    j = this.zzb;
    paramInt2 -= i;
    if (paramInt2 <= j)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.zza, 0, paramInt2);
      this.zzc = paramInt2;
    }
    else
    {
      this.zzg.write(paramArrayOfByte, paramInt1, paramInt2);
    }
    this.zzd += paramInt2;
  }
  
  public final void zzq(int paramInt1, int paramInt2)
    throws IOException
  {
    zzs(paramInt1 << 3 | paramInt2);
  }
  
  public final void zzr(int paramInt1, int paramInt2)
    throws IOException
  {
    zzH(20);
    zzf(paramInt1 << 3);
    zzf(paramInt2);
  }
  
  public final void zzs(int paramInt)
    throws IOException
  {
    zzH(5);
    zzf(paramInt);
  }
  
  public final void zzt(int paramInt, long paramLong)
    throws IOException
  {
    zzH(20);
    zzf(paramInt << 3);
    zzg(paramLong);
  }
  
  public final void zzu(long paramLong)
    throws IOException
  {
    zzH(10);
    zzg(paramLong);
  }
  
  public final void zzv(String paramString)
    throws IOException
  {
    try
    {
      int k = paramString.length() * 3;
      int i = zzA(k);
      int m = i + k;
      int j = this.zzb;
      Object localObject;
      if (m > j)
      {
        localObject = new byte[k];
        i = zzgsf.zzd(paramString, (byte[])localObject, 0, k);
        zzs(i);
        zzp((byte[])localObject, 0, i);
        return;
      }
      if (m > j - this.zzc) {
        zzG();
      }
      k = zzA(paramString.length());
      j = this.zzc;
      if (k == i) {
        i = j + k;
      }
      try
      {
        this.zzc = i;
        m = zzgsf.zzd(paramString, this.zza, i, this.zzb - i);
        this.zzc = j;
        i = m - j - k;
        zzf(i);
        this.zzc = m;
        break label177;
        i = zzgsf.zze(paramString);
        zzf(i);
        this.zzc = zzgsf.zzd(paramString, this.zza, this.zzc, i);
        label177:
        this.zzd += i;
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        localObject = new com/google/android/gms/internal/ads/zzgoa;
        ((zzgoa)localObject).<init>(localArrayIndexOutOfBoundsException);
        throw ((Throwable)localObject);
      }
      catch (zzgse localzzgse1)
      {
        this.zzd -= this.zzc - j;
        this.zzc = j;
        throw localzzgse1;
      }
      return;
    }
    catch (zzgse localzzgse2)
    {
      zzE(paramString, localzzgse2);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */