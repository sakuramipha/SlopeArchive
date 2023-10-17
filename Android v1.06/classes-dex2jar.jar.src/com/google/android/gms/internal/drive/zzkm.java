package com.google.android.gms.internal.drive;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class zzkm
{
  private static final Charset ISO_8859_1;
  static final Charset UTF_8 = Charset.forName("UTF-8");
  public static final byte[] zzsn;
  private static final ByteBuffer zzso;
  private static final zzjo zzsp;
  
  static
  {
    ISO_8859_1 = Charset.forName("ISO-8859-1");
    byte[] arrayOfByte = new byte[0];
    zzsn = arrayOfByte;
    zzso = ByteBuffer.wrap(arrayOfByte);
    zzsp = zzjo.zza(arrayOfByte, 0, arrayOfByte.length, false);
  }
  
  static <T> T checkNotNull(T paramT)
  {
    Objects.requireNonNull(paramT);
    return paramT;
  }
  
  public static int hashCode(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = zza(i, paramArrayOfByte, 0, i);
    i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
  
  static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (int i = paramInt2; i < paramInt2 + paramInt3; i++) {
      paramInt1 = paramInt1 * 31 + paramArrayOfByte[i];
    }
    return paramInt1;
  }
  
  static Object zza(Object paramObject1, Object paramObject2)
  {
    return ((zzlq)paramObject1).zzcy().zza((zzlq)paramObject2).zzde();
  }
  
  static <T> T zza(T paramT, String paramString)
  {
    Objects.requireNonNull(paramT, paramString);
    return paramT;
  }
  
  public static boolean zzd(byte[] paramArrayOfByte)
  {
    return zznf.zzd(paramArrayOfByte);
  }
  
  public static int zze(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 1231;
    }
    return 1237;
  }
  
  public static String zze(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, UTF_8);
  }
  
  static boolean zzf(zzlq paramzzlq)
  {
    return false;
  }
  
  public static int zzu(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */