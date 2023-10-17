package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class zzamf
{
  public static long zza(String paramString)
  {
    try
    {
      long l = zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(paramString).getTime();
      return l;
    }
    catch (ParseException localParseException)
    {
      if ((!"0".equals(paramString)) && (!"-1".equals(paramString))) {
        zzalu.zzc(localParseException, "Unable to parse dateStr: %s, falling back to 0", new Object[] { paramString });
      } else {
        zzalu.zzd("Unable to parse dateStr: %s, falling back to 0", new Object[] { paramString });
      }
    }
    return 0L;
  }
  
  public static zzakr zzb(zzale paramzzale)
  {
    long l6 = System.currentTimeMillis();
    Map localMap = paramzzale.zzc;
    if (localMap == null) {
      return null;
    }
    Object localObject1 = (String)localMap.get("Date");
    long l3;
    if (localObject1 != null) {
      l3 = zza((String)localObject1);
    } else {
      l3 = 0L;
    }
    localObject1 = (String)localMap.get("Cache-Control");
    int i = 0;
    int j = 0;
    if (localObject1 != null)
    {
      localObject1 = ((String)localObject1).split(",", 0);
      i = 0;
      l2 = 0L;
      l1 = 0L;
      while (j < localObject1.length)
      {
        localObject2 = localObject1[j].trim();
        if ((((String)localObject2).equals("no-cache")) || (((String)localObject2).equals("no-store")) || (((String)localObject2).startsWith("max-age="))) {}
        try
        {
          l5 = Long.parseLong(((String)localObject2).substring(8));
          l4 = l2;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            long l4 = l2;
            long l5 = l1;
          }
        }
        if (((String)localObject2).startsWith("stale-while-revalidate="))
        {
          l4 = Long.parseLong(((String)localObject2).substring(23));
          l5 = l1;
        }
        else if (!((String)localObject2).equals("must-revalidate"))
        {
          l4 = l2;
          l5 = l1;
          if (!((String)localObject2).equals("proxy-revalidate")) {}
        }
        else
        {
          i = 1;
          l5 = l1;
          l4 = l2;
        }
        j++;
        l2 = l4;
        l1 = l5;
        continue;
        return null;
      }
      j = 1;
    }
    else
    {
      j = 0;
      l2 = 0L;
      l1 = 0L;
    }
    localObject1 = (String)localMap.get("Expires");
    if (localObject1 != null) {
      l5 = zza((String)localObject1);
    } else {
      l5 = 0L;
    }
    localObject1 = (String)localMap.get("Last-Modified");
    if (localObject1 != null) {
      l4 = zza((String)localObject1);
    } else {
      l4 = 0L;
    }
    localObject1 = (String)localMap.get("ETag");
    if (j != 0)
    {
      l5 = l6 + l1 * 1000L;
      if (i != 0)
      {
        l1 = l5;
      }
      else
      {
        Long.signum(l2);
        l1 = l2 * 1000L + l5;
      }
      l2 = l1;
      l1 = l5;
    }
    else
    {
      l2 = 0L;
      if ((l3 > 0L) && (l5 >= l3))
      {
        l1 = l6 + (l5 - l3);
        l2 = l1;
      }
      else
      {
        l1 = 0L;
      }
    }
    Object localObject2 = new zzakr();
    ((zzakr)localObject2).zza = paramzzale.zzb;
    ((zzakr)localObject2).zzb = ((String)localObject1);
    ((zzakr)localObject2).zzf = l1;
    ((zzakr)localObject2).zze = l2;
    ((zzakr)localObject2).zzc = l3;
    ((zzakr)localObject2).zzd = l4;
    ((zzakr)localObject2).zzg = localMap;
    ((zzakr)localObject2).zzh = paramzzale.zzd;
    return (zzakr)localObject2;
  }
  
  static String zzc(long paramLong)
  {
    return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(paramLong));
  }
  
  private static SimpleDateFormat zzd(String paramString)
  {
    paramString = new SimpleDateFormat(paramString, Locale.US);
    paramString.setTimeZone(TimeZone.getTimeZone("GMT"));
    return paramString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzamf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */