package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

class zziy
  extends zzix
{
  protected final byte[] zza;
  
  zziy(byte[] paramArrayOfByte)
  {
    Objects.requireNonNull(paramArrayOfByte);
    this.zza = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzjb)) {
      return false;
    }
    if (zzd() != ((zzjb)paramObject).zzd()) {
      return false;
    }
    if (zzd() == 0) {
      return true;
    }
    if ((paramObject instanceof zziy))
    {
      zziy localzziy = (zziy)paramObject;
      int j = zzk();
      int i = localzziy.zzk();
      if ((j != 0) && (i != 0) && (j != i)) {
        return false;
      }
      int k = zzd();
      if (k <= localzziy.zzd())
      {
        if (k <= localzziy.zzd())
        {
          if ((localzziy instanceof zziy))
          {
            paramObject = this.zza;
            byte[] arrayOfByte = localzziy.zza;
            localzziy.zzc();
            i = 0;
            for (j = 0;; j++)
            {
              bool1 = bool2;
              if (i >= k) {
                break;
              }
              if (paramObject[i] != arrayOfByte[j])
              {
                bool1 = false;
                break;
              }
              i++;
            }
          }
          boolean bool1 = localzziy.zzf(0, k).equals(zzf(0, k));
          return bool1;
        }
        i = localzziy.zzd();
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("Ran off end of other: 0, ");
        ((StringBuilder)paramObject).append(k);
        ((StringBuilder)paramObject).append(", ");
        ((StringBuilder)paramObject).append(i);
        throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
      }
      i = zzd();
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("Length too large: ");
      ((StringBuilder)paramObject).append(k);
      ((StringBuilder)paramObject).append(i);
      throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
    }
    return paramObject.equals(this);
  }
  
  public byte zza(int paramInt)
  {
    return this.zza[paramInt];
  }
  
  byte zzb(int paramInt)
  {
    return this.zza[paramInt];
  }
  
  protected int zzc()
  {
    return 0;
  }
  
  public int zzd()
  {
    return this.zza.length;
  }
  
  protected final int zze(int paramInt1, int paramInt2, int paramInt3)
  {
    return zzkk.zzd(paramInt1, this.zza, 0, paramInt3);
  }
  
  public final zzjb zzf(int paramInt1, int paramInt2)
  {
    paramInt1 = zzj(0, paramInt2, zzd());
    if (paramInt1 == 0) {
      return zzjb.zzb;
    }
    return new zziv(this.zza, 0, paramInt1);
  }
  
  protected final String zzg(Charset paramCharset)
  {
    return new String(this.zza, 0, zzd(), paramCharset);
  }
  
  final void zzh(zzir paramzzir)
    throws IOException
  {
    byte[] arrayOfByte = this.zza;
    int i = zzd();
    ((zzjg)paramzzir).zzc(arrayOfByte, 0, i);
  }
  
  public final boolean zzi()
  {
    return zzna.zzf(this.zza, 0, zzd());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zziy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */