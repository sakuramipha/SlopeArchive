package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

public final class zzn
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
      String str;
      if (localObject2 == null) {
        str = "null";
      } else {
        try
        {
          str = localObject2.toString();
        }
        catch (Exception localException)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(localObject2.getClass().getName());
          localStringBuilder.append('@');
          localStringBuilder.append(Integer.toHexString(System.identityHashCode(localObject2)));
          localObject2 = localStringBuilder.toString();
          Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat((String)localObject2), localException);
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("<");
          localStringBuilder.append((String)localObject2);
          localStringBuilder.append(" threw ");
          localStringBuilder.append(localException.getClass().getName());
          localStringBuilder.append(">");
          localObject1 = localStringBuilder.toString();
        }
      }
      paramVarArgs[i] = localObject1;
    }
    Object localObject1 = new StringBuilder(paramString.length() + j * 16);
    int j = 0;
    int m;
    for (i = k;; i++)
    {
      m = paramVarArgs.length;
      if (i >= m) {
        break;
      }
      k = paramString.indexOf("%s", j);
      if (k == -1) {
        break;
      }
      ((StringBuilder)localObject1).append(paramString, j, k);
      ((StringBuilder)localObject1).append(paramVarArgs[i]);
      j = k + 2;
    }
    ((StringBuilder)localObject1).append(paramString, j, paramString.length());
    if (i < m)
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */