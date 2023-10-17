package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Locale;

public abstract class zzjb
  implements Iterable, Serializable
{
  private static final Comparator zza = new zzit();
  public static final zzjb zzb = new zziy(zzkk.zzd);
  private static final zzja zzd;
  private int zzc = 0;
  
  static
  {
    int i = zzin.zza;
    zzd = new zzja(null);
  }
  
  static int zzj(int paramInt1, int paramInt2, int paramInt3)
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
  
  public static zzjb zzl(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzj(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new zziy(arrayOfByte);
  }
  
  public static zzjb zzm(String paramString)
  {
    return new zziy(paramString.getBytes(zzkk.zzb));
  }
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int j = this.zzc;
    int i = j;
    if (j == 0)
    {
      i = zzd();
      j = zze(i, 0, i);
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
      str1 = zzmj.zza(this);
    } else {
      str1 = zzmj.zza(zzf(0, 47)).concat("...");
    }
    return String.format(localLocale, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { str2, Integer.valueOf(i), str1 });
  }
  
  public abstract byte zza(int paramInt);
  
  abstract byte zzb(int paramInt);
  
  public abstract int zzd();
  
  protected abstract int zze(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract zzjb zzf(int paramInt1, int paramInt2);
  
  protected abstract String zzg(Charset paramCharset);
  
  abstract void zzh(zzir paramzzir)
    throws IOException;
  
  public abstract boolean zzi();
  
  protected final int zzk()
  {
    return this.zzc;
  }
  
  public final String zzn(Charset paramCharset)
  {
    if (zzd() == 0) {
      paramCharset = "";
    } else {
      paramCharset = zzg(paramCharset);
    }
    return paramCharset;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */