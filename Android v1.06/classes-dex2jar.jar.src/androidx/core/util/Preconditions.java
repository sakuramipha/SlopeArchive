package androidx.core.util;

import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

public final class Preconditions
{
  public static void checkArgument(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void checkArgument(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static int checkArgumentInRange(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    if (paramInt1 >= paramInt2)
    {
      if (paramInt1 <= paramInt3) {
        return paramInt1;
      }
      throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
    }
    throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
  }
  
  public static int checkArgumentNonnegative(int paramInt)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    throw new IllegalArgumentException();
  }
  
  public static int checkArgumentNonnegative(int paramInt, String paramString)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    throw new IllegalArgumentException(paramString);
  }
  
  public static int checkFlagsArgument(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & paramInt2) == paramInt1) {
      return paramInt1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Requested flags 0x");
    localStringBuilder.append(Integer.toHexString(paramInt1));
    localStringBuilder.append(", but only 0x");
    localStringBuilder.append(Integer.toHexString(paramInt2));
    localStringBuilder.append(" are allowed");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static <T> T checkNotNull(T paramT)
  {
    Objects.requireNonNull(paramT);
    return paramT;
  }
  
  public static <T> T checkNotNull(T paramT, Object paramObject)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  public static void checkState(boolean paramBoolean)
  {
    checkState(paramBoolean, null);
  }
  
  public static void checkState(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(paramString);
  }
  
  public static <T extends CharSequence> T checkStringNotEmpty(T paramT)
  {
    if (!TextUtils.isEmpty(paramT)) {
      return paramT;
    }
    throw new IllegalArgumentException();
  }
  
  public static <T extends CharSequence> T checkStringNotEmpty(T paramT, Object paramObject)
  {
    if (!TextUtils.isEmpty(paramT)) {
      return paramT;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static <T extends CharSequence> T checkStringNotEmpty(T paramT, String paramString, Object... paramVarArgs)
  {
    if (!TextUtils.isEmpty(paramT)) {
      return paramT;
    }
    throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\cor\\util\Preconditions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */