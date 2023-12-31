package androidx.core.util;

import java.io.PrintWriter;

public final class TimeUtils
{
  public static final int HUNDRED_DAY_FIELD_LEN = 19;
  private static final int SECONDS_PER_DAY = 86400;
  private static final int SECONDS_PER_HOUR = 3600;
  private static final int SECONDS_PER_MINUTE = 60;
  private static char[] sFormatStr = new char[24];
  private static final Object sFormatSync = new Object();
  
  private static int accumField(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if ((paramInt1 <= 99) && ((!paramBoolean) || (paramInt3 < 3)))
    {
      if ((paramInt1 <= 9) && ((!paramBoolean) || (paramInt3 < 2)))
      {
        if ((!paramBoolean) && (paramInt1 <= 0)) {
          return 0;
        }
        return paramInt2 + 1;
      }
      return paramInt2 + 2;
    }
    return paramInt2 + 3;
  }
  
  public static void formatDuration(long paramLong1, long paramLong2, PrintWriter paramPrintWriter)
  {
    if (paramLong1 == 0L)
    {
      paramPrintWriter.print("--");
      return;
    }
    formatDuration(paramLong1 - paramLong2, paramPrintWriter, 0);
  }
  
  public static void formatDuration(long paramLong, PrintWriter paramPrintWriter)
  {
    formatDuration(paramLong, paramPrintWriter, 0);
  }
  
  public static void formatDuration(long paramLong, PrintWriter paramPrintWriter, int paramInt)
  {
    synchronized (sFormatSync)
    {
      paramInt = formatDurationLocked(paramLong, paramInt);
      String str = new java/lang/String;
      str.<init>(sFormatStr, 0, paramInt);
      paramPrintWriter.print(str);
      return;
    }
  }
  
  public static void formatDuration(long paramLong, StringBuilder paramStringBuilder)
  {
    synchronized (sFormatSync)
    {
      int i = formatDurationLocked(paramLong, 0);
      paramStringBuilder.append(sFormatStr, 0, i);
      return;
    }
  }
  
  private static int formatDurationLocked(long paramLong, int paramInt)
  {
    if (sFormatStr.length < paramInt) {
      sFormatStr = new char[paramInt];
    }
    char[] arrayOfChar = sFormatStr;
    boolean bool1 = paramLong < 0L;
    if (!bool1)
    {
      while (paramInt - 1 > 0) {
        arrayOfChar[0] = ' ';
      }
      arrayOfChar[0] = '0';
      return 1;
    }
    int i;
    if (bool1)
    {
      i = 43;
    }
    else
    {
      i = 45;
      paramLong = -paramLong;
    }
    int i4 = (int)(paramLong % 1000L);
    int j = (int)Math.floor(paramLong / 1000L);
    if (j > 86400)
    {
      n = j / 86400;
      j -= 86400 * n;
    }
    else
    {
      n = 0;
    }
    if (j > 3600)
    {
      m = j / 3600;
      j -= m * 3600;
    }
    else
    {
      m = 0;
    }
    int i1;
    int k;
    if (j > 60)
    {
      i1 = j / 60;
      k = j - i1 * 60;
    }
    else
    {
      i1 = 0;
      k = j;
    }
    boolean bool2;
    if (paramInt != 0)
    {
      j = accumField(n, 1, false, 0);
      if (j > 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      j += accumField(m, 1, bool2, 2);
      if (j > 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      j += accumField(i1, 1, bool2, 2);
      if (j > 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      i2 = j + accumField(k, 1, bool2, 2);
      if (i2 > 0) {
        j = 3;
      } else {
        j = 0;
      }
      i2 += accumField(i4, 2, true, j) + 1;
      j = 0;
      for (;;)
      {
        i3 = j;
        if (i2 >= paramInt) {
          break;
        }
        arrayOfChar[j] = ' ';
        j++;
        i2++;
      }
    }
    int i3 = 0;
    arrayOfChar[i3] = i;
    int i2 = i3 + 1;
    if (paramInt != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    int n = printField(arrayOfChar, n, 'd', i2, false, 0);
    if (n != i2) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    if (paramInt != 0) {
      j = 2;
    } else {
      j = 0;
    }
    int m = printField(arrayOfChar, m, 'h', n, bool2, j);
    if (m != i2) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    if (paramInt != 0) {
      j = 2;
    } else {
      j = 0;
    }
    m = printField(arrayOfChar, i1, 'm', m, bool2, j);
    if (m != i2) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    if (paramInt != 0) {
      j = 2;
    } else {
      j = 0;
    }
    j = printField(arrayOfChar, k, 's', m, bool2, j);
    if ((paramInt != 0) && (j != i2)) {
      paramInt = 3;
    } else {
      paramInt = 0;
    }
    paramInt = printField(arrayOfChar, i4, 'm', j, true, paramInt);
    arrayOfChar[paramInt] = 's';
    return paramInt + 1;
  }
  
  private static int printField(char[] paramArrayOfChar, int paramInt1, char paramChar, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int i;
    if (!paramBoolean)
    {
      i = paramInt2;
      if (paramInt1 <= 0) {}
    }
    else
    {
      int j;
      if (((paramBoolean) && (paramInt3 >= 3)) || (paramInt1 > 99))
      {
        j = paramInt1 / 100;
        paramArrayOfChar[paramInt2] = ((char)(j + 48));
        i = paramInt2 + 1;
        paramInt1 -= j * 100;
      }
      else
      {
        i = paramInt2;
      }
      if (((!paramBoolean) || (paramInt3 < 2)) && (paramInt1 <= 9))
      {
        j = i;
        paramInt3 = paramInt1;
        if (paramInt2 == i) {}
      }
      else
      {
        paramInt2 = paramInt1 / 10;
        paramArrayOfChar[i] = ((char)(paramInt2 + 48));
        j = i + 1;
        paramInt3 = paramInt1 - paramInt2 * 10;
      }
      paramArrayOfChar[j] = ((char)(paramInt3 + 48));
      paramInt1 = j + 1;
      paramArrayOfChar[paramInt1] = paramChar;
      i = paramInt1 + 1;
    }
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\cor\\util\TimeUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */