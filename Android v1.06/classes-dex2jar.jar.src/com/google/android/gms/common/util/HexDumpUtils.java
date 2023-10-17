package com.google.android.gms.common.util;

public final class HexDumpUtils
{
  public static String dump(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfByte != null)
    {
      int i = paramArrayOfByte.length;
      if ((i != 0) && (paramInt1 >= 0) && (paramInt2 > 0) && (paramInt1 + paramInt2 <= i))
      {
        if (paramBoolean) {
          i = 75;
        } else {
          i = 57;
        }
        StringBuilder localStringBuilder = new StringBuilder(i * ((paramInt2 + 15) / 16));
        int m = paramInt2;
        i = 0;
        int j;
        for (int k = 0; m > 0; k = j)
        {
          if (i == 0)
          {
            if (paramInt2 < 65536) {
              localStringBuilder.append(String.format("%04X:", new Object[] { Integer.valueOf(paramInt1) }));
            } else {
              localStringBuilder.append(String.format("%08X:", new Object[] { Integer.valueOf(paramInt1) }));
            }
            j = paramInt1;
          }
          else
          {
            j = k;
            if (i == 8)
            {
              localStringBuilder.append(" -");
              j = k;
            }
          }
          localStringBuilder.append(String.format(" %02X", new Object[] { Integer.valueOf(paramArrayOfByte[paramInt1] & 0xFF) }));
          m--;
          k = i + 1;
          if ((paramBoolean) && ((k == 16) || (m == 0)))
          {
            int n = 16 - k;
            if (n > 0) {
              for (i = 0; i < n; i++) {
                localStringBuilder.append("   ");
              }
            }
            if (n >= 8) {
              localStringBuilder.append("  ");
            }
            localStringBuilder.append("  ");
            for (i = 0; i < k; i++)
            {
              char c2 = (char)paramArrayOfByte[(j + i)];
              char c1;
              if (c2 >= ' ')
              {
                c1 = c2;
                if (c2 <= '~') {}
              }
              else
              {
                c1 = '.';
              }
              localStringBuilder.append(c1);
            }
          }
          if (k != 16)
          {
            i = k;
            if (m != 0) {}
          }
          else
          {
            localStringBuilder.append('\n');
            i = 0;
          }
          paramInt1++;
        }
        return localStringBuilder.toString();
      }
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\HexDumpUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */