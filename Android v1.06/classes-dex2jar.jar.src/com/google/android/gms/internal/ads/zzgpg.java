package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class zzgpg
{
  static final Charset zza = Charset.forName("US-ASCII");
  static final Charset zzb = Charset.forName("UTF-8");
  static final Charset zzc = Charset.forName("ISO-8859-1");
  public static final byte[] zzd;
  public static final ByteBuffer zze;
  public static final zzgnw zzf;
  
  static
  {
    byte[] arrayOfByte = new byte[0];
    zzd = arrayOfByte;
    zze = ByteBuffer.wrap(arrayOfByte);
    int i = zzgnw.zzd;
    zzf = zzgnw.zzI(arrayOfByte, 0, 0, false);
  }
  
  public static int zza(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 1231;
    }
    return 1237;
  }
  
  static int zzb(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (int i = paramInt2; i < paramInt2 + paramInt3; i++) {
      paramInt1 = paramInt1 * 31 + paramArrayOfByte[i];
    }
    return paramInt1;
  }
  
  static Object zzc(Object paramObject, String paramString)
  {
    Objects.requireNonNull(paramObject, paramString);
    return paramObject;
  }
  
  public static String zzd(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */