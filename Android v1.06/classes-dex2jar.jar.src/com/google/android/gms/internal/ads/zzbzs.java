package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public final class zzbzs
{
  public static final int zza = 0;
  private static final Object zzb = new Object();
  private static boolean zzc = false;
  private static boolean zzd = false;
  private static final Clock zze = DefaultClock.getInstance();
  private static final Set zzf = new HashSet(Arrays.asList(new String[0]));
  private final List zzg;
  
  public zzbzs()
  {
    this(null);
  }
  
  public zzbzs(String paramString)
  {
    if (!zzk()) {
      paramString = new ArrayList();
    } else {
      paramString = Arrays.asList(new String[] { "network_request_".concat(String.valueOf(UUID.randomUUID().toString())) });
    }
    this.zzg = paramString;
  }
  
  public static void zzi()
  {
    synchronized (zzb)
    {
      zzc = false;
      zzd = false;
      zzbzt.zzj("Ad debug logging enablement is out of date.");
      return;
    }
  }
  
  public static void zzj(boolean paramBoolean)
  {
    synchronized (zzb)
    {
      zzc = true;
      zzd = paramBoolean;
      return;
    }
  }
  
  public static boolean zzk()
  {
    synchronized (zzb)
    {
      boolean bool3 = zzc;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (zzd) {
          bool1 = true;
        }
      }
      return bool1;
    }
  }
  
  public static boolean zzl()
  {
    synchronized (zzb)
    {
      boolean bool = zzc;
      return bool;
    }
  }
  
  private static void zzm(String paramString)
  {
    try
    {
      zzbzt.zzi("GMA Debug BEGIN");
      int j;
      for (int i = 0; i < paramString.length(); i = j)
      {
        j = i + 4000;
        zzbzt.zzi("GMA Debug CONTENT ".concat(String.valueOf(paramString.substring(i, Math.min(j, paramString.length())))));
      }
      zzbzt.zzi("GMA Debug FINISH");
      return;
    }
    finally {}
  }
  
  private final void zzn(String paramString, zzbzr paramzzbzr)
  {
    StringWriter localStringWriter = new StringWriter();
    JsonWriter localJsonWriter = new JsonWriter(localStringWriter);
    try
    {
      localJsonWriter.beginObject();
      localJsonWriter.name("timestamp").value(zze.currentTimeMillis());
      localJsonWriter.name("event").value(paramString);
      localJsonWriter.name("components").beginArray();
      paramString = this.zzg.iterator();
      while (paramString.hasNext()) {
        localJsonWriter.value((String)paramString.next());
      }
      localJsonWriter.endArray();
      paramzzbzr.zza(localJsonWriter);
      localJsonWriter.endObject();
      localJsonWriter.flush();
      localJsonWriter.close();
    }
    catch (IOException paramString)
    {
      zzbzt.zzh("unable to log", paramString);
    }
    zzm(localStringWriter.toString());
  }
  
  private final void zzo(String paramString)
  {
    zzn("onNetworkRequestError", new zzbzo(paramString));
  }
  
  private final void zzp(String paramString1, String paramString2, Map paramMap, byte[] paramArrayOfByte)
  {
    zzn("onNetworkRequest", new zzbzp(paramString1, paramString2, paramMap, paramArrayOfByte));
  }
  
  private final void zzq(Map paramMap, int paramInt)
  {
    zzn("onNetworkResponse", new zzbzn(paramInt, paramMap));
  }
  
  private static void zzr(JsonWriter paramJsonWriter, Map paramMap)
    throws IOException
  {
    if (paramMap == null) {
      return;
    }
    paramJsonWriter.name("headers").beginArray();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      String str = (String)((Map.Entry)localObject).getKey();
      if (!zzf.contains(str)) {
        if ((((Map.Entry)localObject).getValue() instanceof List))
        {
          Iterator localIterator = ((List)((Map.Entry)localObject).getValue()).iterator();
          while (localIterator.hasNext())
          {
            localObject = (String)localIterator.next();
            paramJsonWriter.beginObject();
            paramJsonWriter.name("name").value(str);
            paramJsonWriter.name("value").value((String)localObject);
            paramJsonWriter.endObject();
          }
        }
        else if ((((Map.Entry)localObject).getValue() instanceof String))
        {
          paramJsonWriter.beginObject();
          paramJsonWriter.name("name").value(str);
          paramJsonWriter.name("value").value((String)((Map.Entry)localObject).getValue());
          paramJsonWriter.endObject();
        }
        else
        {
          zzbzt.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
        }
      }
    }
    paramJsonWriter.endArray();
  }
  
  public final void zzc(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte)
  {
    if (!zzk()) {
      return;
    }
    HashMap localHashMap;
    if (paramHttpURLConnection.getRequestProperties() == null) {
      localHashMap = null;
    } else {
      localHashMap = new HashMap(paramHttpURLConnection.getRequestProperties());
    }
    zzp(new String(paramHttpURLConnection.getURL().toString()), new String(paramHttpURLConnection.getRequestMethod()), localHashMap, paramArrayOfByte);
  }
  
  public final void zzd(String paramString1, String paramString2, Map paramMap, byte[] paramArrayOfByte)
  {
    if (!zzk()) {
      return;
    }
    zzp(paramString1, "GET", paramMap, paramArrayOfByte);
  }
  
  public final void zze(HttpURLConnection paramHttpURLConnection, int paramInt)
  {
    if (!zzk()) {
      return;
    }
    Object localObject1 = paramHttpURLConnection.getHeaderFields();
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = new HashMap(paramHttpURLConnection.getHeaderFields());
    }
    zzq((Map)localObject1, paramInt);
    if ((paramInt >= 200) && (paramInt < 300)) {
      return;
    }
    try
    {
      paramHttpURLConnection = paramHttpURLConnection.getResponseMessage();
    }
    catch (IOException paramHttpURLConnection)
    {
      zzbzt.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(paramHttpURLConnection.getMessage())));
      paramHttpURLConnection = (HttpURLConnection)localObject2;
    }
    zzo(paramHttpURLConnection);
  }
  
  public final void zzf(Map paramMap, int paramInt)
  {
    if (!zzk()) {
      return;
    }
    zzq(paramMap, paramInt);
    if ((paramInt >= 200) && (paramInt < 300)) {
      return;
    }
    zzo(null);
  }
  
  public final void zzg(String paramString)
  {
    if (!zzk()) {
      return;
    }
    if (paramString == null) {
      return;
    }
    zzh(paramString.getBytes());
  }
  
  public final void zzh(byte[] paramArrayOfByte)
  {
    zzn("onNetworkResponseBody", new zzbzq(paramArrayOfByte));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */