package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzgno
  implements Iterable, Serializable
{
  private static final Comparator zza = new zzgnf();
  public static final zzgno zzb = new zzgnk(zzgpg.zzd);
  private static final zzgnn zzd;
  private int zzc = 0;
  
  static
  {
    int i = zzgmz.zza;
    zzd = new zzgnn(null);
  }
  
  private static zzgno zzc(Iterator paramIterator, int paramInt)
  {
    if (paramInt > 0)
    {
      zzgno localzzgno;
      if (paramInt == 1)
      {
        paramIterator = (zzgno)paramIterator.next();
      }
      else
      {
        i = paramInt >>> 1;
        localzzgno = zzc(paramIterator, i);
        paramIterator = zzc(paramIterator, paramInt - i);
        if (Integer.MAX_VALUE - localzzgno.zzd() < paramIterator.zzd()) {
          break label62;
        }
        paramIterator = zzgqy.zzC(localzzgno, paramIterator);
      }
      return paramIterator;
      label62:
      paramInt = localzzgno.zzd();
      int i = paramIterator.zzd();
      paramIterator = new StringBuilder();
      paramIterator.append("ByteString would be too long: ");
      paramIterator.append(paramInt);
      paramIterator.append("+");
      paramIterator.append(i);
      throw new IllegalArgumentException(paramIterator.toString());
    }
    throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  static int zzq(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 < paramInt1)
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Beginning index larger than ending index: ");
          localStringBuilder.append(paramInt1);
          localStringBuilder.append(", ");
          localStringBuilder.append(paramInt2);
          throw new IndexOutOfBoundsException(localStringBuilder.toString());
        }
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("End index: ");
        localStringBuilder.append(paramInt2);
        localStringBuilder.append(" >= ");
        localStringBuilder.append(paramInt3);
        throw new IndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Beginning index: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" < 0");
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    return i;
  }
  
  public static zzgnl zzt()
  {
    return new zzgnl(128);
  }
  
  public static zzgno zzu(Iterable paramIterable)
  {
    if (!(paramIterable instanceof Collection))
    {
      Iterator localIterator = paramIterable.iterator();
      for (int i = 0;; i++)
      {
        j = i;
        if (!localIterator.hasNext()) {
          break;
        }
        localIterator.next();
      }
    }
    int j = paramIterable.size();
    if (j == 0) {
      return zzb;
    }
    return zzc(paramIterable.iterator(), j);
  }
  
  public static zzgno zzv(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzq(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new zzgnk(arrayOfByte);
  }
  
  public static zzgno zzw(String paramString)
  {
    return new zzgnk(paramString.getBytes(zzgpg.zzb));
  }
  
  static void zzy(int paramInt1, int paramInt2)
  {
    if ((paramInt2 - (paramInt1 + 1) | paramInt1) < 0)
    {
      if (paramInt1 < 0)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Index < 0: ");
        localStringBuilder.append(paramInt1);
        throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Index > length: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramInt2);
      throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
    }
  }
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int j = this.zzc;
    int i = j;
    if (j == 0)
    {
      i = zzd();
      j = zzi(i, 0, i);
      i = j;
      if (j == 0) {
        i = 1;
      }
      this.zzc = i;
    }
    return i;
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.ROOT;
    String str2 = Integer.toHexString(System.identityHashCode(this));
    int i = zzd();
    String str1;
    if (zzd() <= 50) {
      str1 = zzgro.zza(this);
    } else {
      str1 = zzgro.zza(zzk(0, 47)).concat("...");
    }
    return String.format(localLocale, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { str2, Integer.valueOf(i), str1 });
  }
  
  public final byte[] zzA()
  {
    int i = zzd();
    if (i == 0) {
      return zzgpg.zzd;
    }
    byte[] arrayOfByte = new byte[i];
    zze(arrayOfByte, 0, 0, i);
    return arrayOfByte;
  }
  
  public abstract byte zza(int paramInt);
  
  abstract byte zzb(int paramInt);
  
  public abstract int zzd();
  
  protected abstract void zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  protected abstract int zzf();
  
  protected abstract boolean zzh();
  
  protected abstract int zzi(int paramInt1, int paramInt2, int paramInt3);
  
  protected abstract int zzj(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract zzgno zzk(int paramInt1, int paramInt2);
  
  public abstract zzgnw zzl();
  
  protected abstract String zzm(Charset paramCharset);
  
  public abstract ByteBuffer zzn();
  
  abstract void zzo(zzgnd paramzzgnd)
    throws IOException;
  
  public abstract boolean zzp();
  
  protected final int zzr()
  {
    return this.zzc;
  }
  
  public zzgni zzs()
  {
    return new zzgne(this);
  }
  
  public final String zzx(Charset paramCharset)
  {
    if (zzd() == 0) {
      paramCharset = "";
    } else {
      paramCharset = zzm(paramCharset);
    }
    return paramCharset;
  }
  
  @Deprecated
  public final void zzz(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    zzq(0, paramInt3, zzd());
    zzq(paramInt2, paramInt2 + paramInt3, paramArrayOfByte.length);
    if (paramInt3 > 0) {
      zze(paramArrayOfByte, 0, paramInt2, paramInt3);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgno.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */