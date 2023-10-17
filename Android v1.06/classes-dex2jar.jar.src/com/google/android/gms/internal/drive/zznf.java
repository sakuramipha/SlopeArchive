package com.google.android.gms.internal.drive;

final class zznf
{
  private static final zznh zzwt;
  
  static
  {
    int i;
    if ((zznd.zzfd()) && (zznd.zzfe())) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject;
    if ((i != 0) && (!zzix.zzbr())) {
      localObject = new zznk();
    } else {
      localObject = new zzni();
    }
    zzwt = (zznh)localObject;
  }
  
  static int zza(CharSequence paramCharSequence)
  {
    int n = paramCharSequence.length();
    int m = 0;
    for (int j = 0; (j < n) && (paramCharSequence.charAt(j) < ''); j++) {}
    int i = n;
    for (;;)
    {
      k = i;
      if (j >= n) {
        break label206;
      }
      k = paramCharSequence.charAt(j);
      if (k >= 2048) {
        break;
      }
      i += (127 - k >>> 31);
      j++;
    }
    int i2 = paramCharSequence.length();
    int k = m;
    while (j < i2)
    {
      int i3 = paramCharSequence.charAt(j);
      if (i3 < 2048)
      {
        k += (127 - i3 >>> 31);
        m = j;
      }
      else
      {
        int i1 = k + 2;
        k = i1;
        m = j;
        if (55296 <= i3)
        {
          k = i1;
          m = j;
          if (i3 <= 57343) {
            if (Character.codePointAt(paramCharSequence, j) >= 65536)
            {
              m = j + 1;
              k = i1;
            }
            else
            {
              throw new zznj(j, i2);
            }
          }
        }
      }
      j = m + 1;
    }
    k = i + k;
    label206:
    if (k >= n) {
      return k;
    }
    long l = k;
    paramCharSequence = new StringBuilder(54);
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(l + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  static int zza(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zzwt.zzb(paramCharSequence, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static int zzay(int paramInt)
  {
    int i = paramInt;
    if (paramInt > -12) {
      i = -1;
    }
    return i;
  }
  
  private static int zzc(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65) && (paramInt3 <= -65)) {
      return paramInt1 ^ paramInt2 << 8 ^ paramInt3 << 16;
    }
    return -1;
  }
  
  public static boolean zzd(byte[] paramArrayOfByte)
  {
    return zzwt.zze(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static boolean zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zzwt.zze(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static int zzf(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte[(paramInt1 - 1)];
    paramInt2 -= paramInt1;
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2) {
          return zzc(i, paramArrayOfByte[paramInt1], paramArrayOfByte[(paramInt1 + 1)]);
        }
        throw new AssertionError();
      }
      return zzr(i, paramArrayOfByte[paramInt1]);
    }
    return zzay(i);
  }
  
  static String zzg(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzkq
  {
    return zzwt.zzg(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static int zzr(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65)) {
      return paramInt1 ^ paramInt2 << 8;
    }
    return -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zznf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */