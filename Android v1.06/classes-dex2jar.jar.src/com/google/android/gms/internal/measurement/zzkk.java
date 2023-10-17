package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class zzkk
{
  static final Charset zza = Charset.forName("US-ASCII");
  static final Charset zzb = Charset.forName("UTF-8");
  static final Charset zzc = Charset.forName("ISO-8859-1");
  public static final byte[] zzd;
  public static final ByteBuffer zze;
  public static final zzjf zzf;
  
  static
  {
    Object localObject = new byte[0];
    zzd = (byte[])localObject;
    zze = ByteBuffer.wrap((byte[])localObject);
    int i = zzjf.zza;
    localObject = new zzjd((byte[])localObject, 0, 0, false, null);
    try
    {
      ((zzjd)localObject).zza(0);
      zzf = (zzjf)localObject;
      return;
    }
    catch (zzkm localzzkm)
    {
      throw new IllegalArgumentException(localzzkm);
    }
  }
  
  public static int zza(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 1231;
    }
    return 1237;
  }
  
  public static int zzb(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = zzd(i, paramArrayOfByte, 0, i);
    i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
  
  public static int zzc(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  static int zzd(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (paramInt2 = 0; paramInt2 < paramInt3; paramInt2++) {
      paramInt1 = paramInt1 * 31 + paramArrayOfByte[paramInt2];
    }
    return paramInt1;
  }
  
  static Object zze(Object paramObject)
  {
    Objects.requireNonNull(paramObject);
    return paramObject;
  }
  
  static Object zzf(Object paramObject, String paramString)
  {
    Objects.requireNonNull(paramObject, paramString);
    return paramObject;
  }
  
  static Object zzg(Object paramObject1, Object paramObject2)
  {
    return ((zzlj)paramObject1).zzbJ().zzay((zzlj)paramObject2).zzaG();
  }
  
  public static String zzh(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, zzb);
  }
  
  public static boolean zzi(byte[] paramArrayOfByte)
  {
    return zzna.zze(paramArrayOfByte);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzkk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */