package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

public final class zzfpo
{
  @CheckForNull
  public static String zza(@CheckForNull String paramString)
  {
    String str = paramString;
    if (zzfoy.zza(paramString)) {
      str = null;
    }
    return str;
  }
  
  public static String zzb(@CheckForNull String paramString, @CheckForNull Object... paramVarArgs)
  {
    int k = 0;
    for (int i = 0;; i++)
    {
      j = paramVarArgs.length;
      if (i >= j) {
        break;
      }
      Object localObject2 = paramVarArgs[i];
      String str1;
      if (localObject2 == null) {
        str1 = "null";
      } else {
        try
        {
          str1 = localObject2.toString();
        }
        catch (Exception localException)
        {
          String str2 = localObject2.getClass().getName();
          localObject2 = Integer.toHexString(System.identityHashCode(localObject2));
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(str2);
          localStringBuilder.append("@");
          localStringBuilder.append((String)localObject2);
          str2 = localStringBuilder.toString();
          Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), localException);
          localObject2 = localException.getClass().getName();
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("<");
          ((StringBuilder)localObject1).append(str2);
          ((StringBuilder)localObject1).append(" threw ");
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(">");
          localObject1 = ((StringBuilder)localObject1).toString();
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
  
  public static String zzc(@CheckForNull String paramString)
  {
    int i = zzfoy.zza;
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static boolean zzd(@CheckForNull String paramString)
  {
    return zzfoy.zza(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */