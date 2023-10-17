package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Objects;

public final class zzftx
{
  public static int zza(int paramInt1, int paramInt2, RoundingMode paramRoundingMode)
  {
    Objects.requireNonNull(paramRoundingMode);
    int i = paramInt1 / 8;
    int m = paramInt1 - i * 8;
    if (m == 0) {
      return i;
    }
    int k = zzftw.zza[paramRoundingMode.ordinal()];
    paramInt2 = 1;
    int j = (paramInt1 ^ 0x8) >> 31 | 0x1;
    switch (k)
    {
    default: 
      throw new AssertionError();
    case 6: 
    case 7: 
    case 8: 
      paramInt1 = Math.abs(m);
      paramInt1 -= Math.abs(8) - paramInt1;
      if (paramInt1 == 0)
      {
        paramInt1 = paramInt2;
        if (paramRoundingMode == RoundingMode.HALF_UP) {
          break label191;
        }
        if (paramRoundingMode == RoundingMode.HALF_EVEN) {
          paramInt1 = 1;
        } else {
          paramInt1 = 0;
        }
        if ((paramInt1 & i & 0x1) != 0)
        {
          paramInt1 = paramInt2;
          break label191;
        }
      }
      else if (paramInt1 > 0)
      {
        paramInt1 = paramInt2;
      }
      break;
    case 5: 
      if (j > 0) {
        paramInt1 = paramInt2;
      }
      break;
    case 3: 
      if (j < 0) {
        paramInt1 = paramInt2;
      } else {
        paramInt1 = 0;
      }
      if (paramInt1 == 0) {}
      break;
    case 4: 
      return i + j;
    case 1: 
      label191:
      if (m != 0) {
        break label207;
      }
    }
    return i;
    label207:
    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */