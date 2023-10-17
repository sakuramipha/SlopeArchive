package com.google.android.gms.common.util;

import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzx;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class HttpUtils
{
  private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
  private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
  private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
  
  public static Map<String, String> parse(URI paramURI, String paramString)
  {
    Object localObject1 = Collections.emptyMap();
    Object localObject2 = paramURI.getRawQuery();
    paramURI = (URI)localObject1;
    if (localObject2 != null)
    {
      paramURI = (URI)localObject1;
      if (((String)localObject2).length() > 0)
      {
        localObject1 = new HashMap();
        zzx localzzx = zzx.zzc(zzo.zzb('='));
        localObject2 = zzx.zzc(zzo.zzb('&')).zzb().zzd((CharSequence)localObject2).iterator();
        for (;;)
        {
          paramURI = (URI)localObject1;
          if (!((Iterator)localObject2).hasNext()) {
            return paramURI;
          }
          paramURI = localzzx.zzf((String)((Iterator)localObject2).next());
          if ((paramURI.isEmpty()) || (paramURI.size() > 2)) {
            break;
          }
          String str = zza((String)paramURI.get(0), paramString);
          if (paramURI.size() == 2) {
            paramURI = zza((String)paramURI.get(1), paramString);
          } else {
            paramURI = null;
          }
          ((Map)localObject1).put(str, paramURI);
        }
        throw new IllegalArgumentException("bad parameter");
      }
    }
    return paramURI;
  }
  
  private static String zza(String paramString1, String paramString2)
  {
    String str = paramString2;
    if (paramString2 == null) {
      str = "ISO-8859-1";
    }
    try
    {
      paramString1 = URLDecoder.decode(paramString1, str);
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      throw new IllegalArgumentException(paramString1);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\HttpUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */