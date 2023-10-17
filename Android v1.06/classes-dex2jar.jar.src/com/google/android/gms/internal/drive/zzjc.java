package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;

public abstract class zzjc
  implements Serializable, Iterable<Byte>
{
  public static final zzjc zznq = new zzjm(zzkm.zzsn);
  private static final zzji zznr;
  private static final Comparator<zzjc> zznt = new zzje();
  private int zzns = 0;
  
  static
  {
    Object localObject;
    if (zzix.zzbr()) {
      localObject = new zzjn(null);
    } else {
      localObject = new zzjg(null);
    }
    zznr = (zzji)localObject;
  }
  
  private static int zza(byte paramByte)
  {
    return paramByte & 0xFF;
  }
  
  static int zzb(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 < paramInt1)
        {
          localStringBuilder = new StringBuilder(66);
          localStringBuilder.append("Beginning index larger than ending index: ");
          localStringBuilder.append(paramInt1);
          localStringBuilder.append(", ");
          localStringBuilder.append(paramInt2);
          throw new IndexOutOfBoundsException(localStringBuilder.toString());
        }
        localStringBuilder = new StringBuilder(37);
        localStringBuilder.append("End index: ");
        localStringBuilder.append(paramInt2);
        localStringBuilder.append(" >= ");
        localStringBuilder.append(paramInt3);
        throw new IndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder(32);
      localStringBuilder.append("Beginning index: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" < 0");
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    return i;
  }
  
  public static zzjc zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzb(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    return new zzjm(zznr.zzc(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static zzjc zzk(String paramString)
  {
    return new zzjm(paramString.getBytes(zzkm.UTF_8));
  }
  
  static zzjk zzu(int paramInt)
  {
    return new zzjk(paramInt, null);
  }
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int j = this.zzns;
    int i = j;
    if (j == 0)
    {
      i = size();
      j = zza(i, 0, i);
      i = j;
      if (j == 0) {
        i = 1;
      }
      this.zzns = i;
    }
    return i;
  }
  
  public abstract int size();
  
  public final String toString()
  {
    return String.format("<ByteString@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()) });
  }
  
  protected abstract int zza(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract zzjc zza(int paramInt1, int paramInt2);
  
  protected abstract String zza(Charset paramCharset);
  
  abstract void zza(zzjb paramzzjb)
    throws IOException;
  
  public final String zzbt()
  {
    Charset localCharset = zzkm.UTF_8;
    if (size() == 0) {
      return "";
    }
    return zza(localCharset);
  }
  
  public abstract boolean zzbu();
  
  protected final int zzbv()
  {
    return this.zzns;
  }
  
  public abstract byte zzs(int paramInt);
  
  abstract byte zzt(int paramInt);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */