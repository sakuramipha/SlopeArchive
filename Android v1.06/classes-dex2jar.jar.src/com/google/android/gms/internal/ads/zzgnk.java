package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

class zzgnk
  extends zzgnj
{
  protected final byte[] zza;
  
  zzgnk(byte[] paramArrayOfByte)
  {
    Objects.requireNonNull(paramArrayOfByte);
    this.zza = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzgno)) {
      return false;
    }
    if (zzd() != ((zzgno)paramObject).zzd()) {
      return false;
    }
    if (zzd() == 0) {
      return true;
    }
    if ((paramObject instanceof zzgnk))
    {
      paramObject = (zzgnk)paramObject;
      int j = zzr();
      int i = ((zzgno)paramObject).zzr();
      if ((j != 0) && (i != 0) && (j != i)) {
        return false;
      }
      return zzg((zzgno)paramObject, 0, zzd());
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
  
  protected void zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.zza, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  final boolean zzg(zzgno paramzzgno, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramzzgno.zzd())
    {
      int i = paramInt1 + paramInt2;
      if (i <= paramzzgno.zzd())
      {
        if ((paramzzgno instanceof zzgnk))
        {
          paramzzgno = (zzgnk)paramzzgno;
          byte[] arrayOfByte1 = this.zza;
          byte[] arrayOfByte2 = paramzzgno.zza;
          int k = zzc();
          i = zzc();
          int j = paramzzgno.zzc() + paramInt1;
          paramInt1 = i;
          for (i = j; paramInt1 < k + paramInt2; i++)
          {
            if (arrayOfByte1[paramInt1] != arrayOfByte2[i]) {
              return false;
            }
            paramInt1++;
          }
          return true;
        }
        return paramzzgno.zzk(paramInt1, i).equals(zzk(0, paramInt2));
      }
      i = paramzzgno.zzd();
      paramzzgno = new StringBuilder();
      paramzzgno.append("Ran off end of other: ");
      paramzzgno.append(paramInt1);
      paramzzgno.append(", ");
      paramzzgno.append(paramInt2);
      paramzzgno.append(", ");
      paramzzgno.append(i);
      throw new IllegalArgumentException(paramzzgno.toString());
    }
    paramInt1 = zzd();
    paramzzgno = new StringBuilder();
    paramzzgno.append("Length too large: ");
    paramzzgno.append(paramInt2);
    paramzzgno.append(paramInt1);
    throw new IllegalArgumentException(paramzzgno.toString());
  }
  
  protected final int zzi(int paramInt1, int paramInt2, int paramInt3)
  {
    return zzgpg.zzb(paramInt1, this.zza, zzc() + paramInt2, paramInt3);
  }
  
  protected final int zzj(int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = zzc() + paramInt2;
    return zzgsf.zzf(paramInt1, this.zza, paramInt2, paramInt3 + paramInt2);
  }
  
  public final zzgno zzk(int paramInt1, int paramInt2)
  {
    paramInt2 = zzq(paramInt1, paramInt2, zzd());
    if (paramInt2 == 0) {
      return zzgno.zzb;
    }
    return new zzgnh(this.zza, zzc() + paramInt1, paramInt2);
  }
  
  public final zzgnw zzl()
  {
    return zzgnw.zzI(this.zza, zzc(), zzd(), true);
  }
  
  protected final String zzm(Charset paramCharset)
  {
    return new String(this.zza, zzc(), zzd(), paramCharset);
  }
  
  public final ByteBuffer zzn()
  {
    return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
  }
  
  final void zzo(zzgnd paramzzgnd)
    throws IOException
  {
    paramzzgnd.zza(this.zza, zzc(), zzd());
  }
  
  public final boolean zzp()
  {
    int i = zzc();
    return zzgsf.zzj(this.zza, i, zzd() + i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgnk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */