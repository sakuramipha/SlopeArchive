package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzgv
{
  private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
  private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
  
  public static long zza(String paramString1, String paramString2)
  {
    boolean bool = TextUtils.isEmpty(paramString1);
    long l2 = -1L;
    long l1 = l2;
    Object localObject;
    if (!bool) {
      try
      {
        l1 = Long.parseLong(paramString1);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unexpected Content-Length [");
        ((StringBuilder)localObject).append(paramString1);
        ((StringBuilder)localObject).append("]");
        zzer.zzb("HttpUtil", ((StringBuilder)localObject).toString());
        l1 = l2;
      }
    }
    l2 = l1;
    if (!TextUtils.isEmpty(paramString2))
    {
      localObject = zza.matcher(paramString2);
      l2 = l1;
      if (((Matcher)localObject).matches()) {
        try
        {
          String str = ((Matcher)localObject).group(2);
          Objects.requireNonNull(str);
          l2 = Long.parseLong(str);
          localObject = ((Matcher)localObject).group(1);
          Objects.requireNonNull(localObject);
          long l3 = l2 - Long.parseLong((String)localObject) + 1L;
          if (l1 < 0L)
          {
            l2 = l3;
          }
          else
          {
            l2 = l1;
            if (l1 != l3)
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>();
              ((StringBuilder)localObject).append("Inconsistent headers [");
              ((StringBuilder)localObject).append(paramString1);
              ((StringBuilder)localObject).append("] [");
              ((StringBuilder)localObject).append(paramString2);
              ((StringBuilder)localObject).append("]");
              zzer.zze("HttpUtil", ((StringBuilder)localObject).toString());
              l2 = Math.max(l1, l3);
            }
          }
        }
        catch (NumberFormatException paramString1)
        {
          paramString1 = new StringBuilder();
          paramString1.append("Unexpected Content-Range [");
          paramString1.append(paramString2);
          paramString1.append("]");
          zzer.zzb("HttpUtil", paramString1.toString());
          l2 = l1;
        }
      }
    }
    return l2;
  }
  
  public static long zzb(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return -1L;
    }
    paramString = zzb.matcher(paramString);
    if (paramString.matches())
    {
      paramString = paramString.group(1);
      Objects.requireNonNull(paramString);
      return Long.parseLong(paramString);
    }
    return -1L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */