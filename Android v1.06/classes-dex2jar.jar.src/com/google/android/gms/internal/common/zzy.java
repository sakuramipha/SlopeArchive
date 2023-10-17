package com.google.android.gms.internal.common;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

public final class zzy
{
  public static String zza(@CheckForNull String paramString, @CheckForNull Object... paramVarArgs)
  {
    int k = 0;
    for (int i = 0;; i++)
    {
      j = paramVarArgs.length;
      if (i >= j) {
        break;
      }
      Object localObject2 = paramVarArgs[i];
      if (localObject2 == null) {
        localObject1 = "null";
      } else {
        try
        {
          localObject1 = localObject2.toString();
        }
        catch (Exception localException)
        {
          localObject1 = localObject2.getClass().getName();
          localObject2 = Integer.toHexString(System.identityHashCode(localObject2));
          Object localObject3 = new StringBuilder(String.valueOf(localObject1).length() + 1 + String.valueOf(localObject2).length());
          ((StringBuilder)localObject3).append((String)localObject1);
          ((StringBuilder)localObject3).append('@');
          ((StringBuilder)localObject3).append((String)localObject2);
          localObject2 = ((StringBuilder)localObject3).toString();
          Logger localLogger = Logger.getLogger("com.google.common.base.Strings");
          localObject3 = Level.WARNING;
          if (((String)localObject2).length() != 0) {
            localObject1 = "Exception during lenientFormat for ".concat((String)localObject2);
          } else {
            localObject1 = new String("Exception during lenientFormat for ");
          }
          localLogger.logp((Level)localObject3, "com.google.common.base.Strings", "lenientToString", (String)localObject1, localException);
          localObject1 = localException.getClass().getName();
          j = String.valueOf(localObject1).length();
          StringBuilder localStringBuilder = new StringBuilder(((String)localObject2).length() + 9 + j);
          localStringBuilder.append("<");
          localStringBuilder.append((String)localObject2);
          localStringBuilder.append(" threw ");
          localStringBuilder.append((String)localObject1);
          localStringBuilder.append(">");
          localObject1 = localStringBuilder.toString();
        }
      }
      paramVarArgs[i] = localObject1;
    }
    Object localObject1 = new StringBuilder(paramString.length() + j * 16);
    int j = 0;
    for (i = k;; i++)
    {
      k = paramVarArgs.length;
      if (i >= k) {
        break;
      }
      int m = paramString.indexOf("%s", j);
      if (m == -1) {
        break;
      }
      ((StringBuilder)localObject1).append(paramString, j, m);
      ((StringBuilder)localObject1).append(paramVarArgs[i]);
      j = m + 2;
    }
    ((StringBuilder)localObject1).append(paramString, j, paramString.length());
    if (i < k)
    {
      ((StringBuilder)localObject1).append(" [");
      j = i + 1;
      ((StringBuilder)localObject1).append(paramVarArgs[i]);
      for (i = j; i < paramVarArgs.length; i++)
      {
        ((StringBuilder)localObject1).append(", ");
        ((StringBuilder)localObject1).append(paramVarArgs[i]);
      }
      ((StringBuilder)localObject1).append(']');
    }
    return ((StringBuilder)localObject1).toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */