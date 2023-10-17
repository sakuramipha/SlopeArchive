package com.google.android.gms.internal.ads;

import java.util.Locale;

public final class zzea
{
  public static final int zza = 0;
  private static final byte[] zzb = { 0, 0, 0, 1 };
  private static final String[] zzc = { "", "A", "B", "C" };
  
  public static String zza(int paramInt1, int paramInt2, int paramInt3)
  {
    return String.format("avc1.%02X%02X%02X", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public static String zzb(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
  {
    Object localObject = zzc[paramInt1];
    char c;
    if (true != paramBoolean) {
      c = 'L';
    } else {
      c = 'H';
    }
    localObject = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", new Object[] { localObject, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Character.valueOf(c), Integer.valueOf(paramInt4) }));
    for (paramInt1 = 6; paramInt1 > 0; paramInt1 = paramInt2)
    {
      paramInt2 = paramInt1 - 1;
      if (paramArrayOfInt[paramInt2] != 0) {
        break;
      }
    }
    for (paramInt2 = 0; paramInt2 < paramInt1; paramInt2++) {
      ((StringBuilder)localObject).append(String.format(".%02X", new Object[] { Integer.valueOf(paramArrayOfInt[paramInt2]) }));
    }
    return ((StringBuilder)localObject).toString();
  }
  
  public static byte[] zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2 + 4];
    System.arraycopy(zzb, 0, arrayOfByte, 0, 4);
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 4, paramInt2);
    return arrayOfByte;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */