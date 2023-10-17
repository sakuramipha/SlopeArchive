package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzezk;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbu
{
  public static final zzbt zza = new zzbs();
  
  public static Bundle zza(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return null;
    }
    Iterator localIterator = paramJSONObject.keys();
    Bundle localBundle = new Bundle();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramJSONObject.opt(str);
      if (localObject1 != null) {
        if ((localObject1 instanceof Boolean))
        {
          localBundle.putBoolean(str, ((Boolean)localObject1).booleanValue());
        }
        else if ((localObject1 instanceof Double))
        {
          localBundle.putDouble(str, ((Double)localObject1).doubleValue());
        }
        else if ((localObject1 instanceof Integer))
        {
          localBundle.putInt(str, ((Integer)localObject1).intValue());
        }
        else if ((localObject1 instanceof Long))
        {
          localBundle.putLong(str, ((Long)localObject1).longValue());
        }
        else if ((localObject1 instanceof String))
        {
          localBundle.putString(str, (String)localObject1);
        }
        else if ((localObject1 instanceof JSONArray))
        {
          JSONArray localJSONArray = (JSONArray)localObject1;
          if (localJSONArray.length() != 0)
          {
            int i1 = localJSONArray.length();
            int k = 0;
            int m = 0;
            int j = 0;
            int n = 0;
            localObject1 = null;
            for (int i = 0; (localObject1 == null) && (i < i1); i++) {
              if (!localJSONArray.isNull(i)) {
                localObject1 = localJSONArray.opt(i);
              } else {
                localObject1 = null;
              }
            }
            if (localObject1 == null)
            {
              zzbzt.zzj("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(str)));
            }
            else
            {
              Object localObject2;
              if ((localObject1 instanceof JSONObject))
              {
                localObject2 = new Bundle[i1];
                for (i = n; i < i1; i++)
                {
                  if (!localJSONArray.isNull(i)) {
                    localObject1 = zza(localJSONArray.optJSONObject(i));
                  } else {
                    localObject1 = null;
                  }
                  localObject2[i] = localObject1;
                }
                localBundle.putParcelableArray(str, (Parcelable[])localObject2);
              }
              else if ((localObject1 instanceof Number))
              {
                localObject1 = new double[localJSONArray.length()];
                for (i = k; i < i1; i++) {
                  localObject1[i] = localJSONArray.optDouble(i);
                }
                localBundle.putDoubleArray(str, (double[])localObject1);
              }
              else if ((localObject1 instanceof CharSequence))
              {
                localObject2 = new String[i1];
                for (i = m; i < i1; i++)
                {
                  if (!localJSONArray.isNull(i)) {
                    localObject1 = localJSONArray.optString(i);
                  } else {
                    localObject1 = null;
                  }
                  localObject2[i] = localObject1;
                }
                localBundle.putStringArray(str, (String[])localObject2);
              }
              else if ((localObject1 instanceof Boolean))
              {
                localObject1 = new boolean[i1];
                for (i = j; i < i1; i++) {
                  localObject1[i] = localJSONArray.optBoolean(i);
                }
                localBundle.putBooleanArray(str, (boolean[])localObject1);
              }
              else
              {
                zzbzt.zzj(String.format("JSONArray with unsupported type %s for key:%s", new Object[] { localObject1.getClass().getCanonicalName(), str }));
              }
            }
          }
        }
        else if ((localObject1 instanceof JSONObject))
        {
          localBundle.putBundle(str, zza((JSONObject)localObject1));
        }
        else
        {
          zzbzt.zzj("Unsupported type for key:".concat(String.valueOf(str)));
        }
      }
    }
    return localBundle;
  }
  
  public static String zzb(String paramString, JSONObject paramJSONObject, String... paramVarArgs)
  {
    paramString = zzm(paramJSONObject, paramVarArgs);
    if (paramString == null) {
      return "";
    }
    return paramString.optString(paramVarArgs[0], "");
  }
  
  public static List zzc(JSONArray paramJSONArray, List paramList)
    throws JSONException
  {
    Object localObject = paramList;
    if (paramList == null) {
      localObject = new ArrayList();
    }
    if (paramJSONArray != null) {
      for (int i = 0; i < paramJSONArray.length(); i++) {
        ((List)localObject).add(paramJSONArray.getString(i));
      }
    }
    return (List)localObject;
  }
  
  public static List zzd(JsonReader paramJsonReader)
    throws IllegalStateException, IOException
  {
    ArrayList localArrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      localArrayList.add(paramJsonReader.nextString());
    }
    paramJsonReader.endArray();
    return localArrayList;
  }
  
  public static JSONArray zze(JsonReader paramJsonReader)
    throws IllegalStateException, IOException, JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext())
    {
      JsonToken localJsonToken = paramJsonReader.peek();
      if (JsonToken.BEGIN_ARRAY.equals(localJsonToken)) {
        localJSONArray.put(zze(paramJsonReader));
      } else if (JsonToken.BEGIN_OBJECT.equals(localJsonToken)) {
        localJSONArray.put(zzh(paramJsonReader));
      } else if (JsonToken.BOOLEAN.equals(localJsonToken)) {
        localJSONArray.put(paramJsonReader.nextBoolean());
      } else if (JsonToken.NUMBER.equals(localJsonToken)) {
        localJSONArray.put(paramJsonReader.nextDouble());
      } else if (JsonToken.STRING.equals(localJsonToken)) {
        localJSONArray.put(paramJsonReader.nextString());
      } else {
        throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(String.valueOf(localJsonToken))));
      }
    }
    paramJsonReader.endArray();
    return localJSONArray;
  }
  
  public static JSONObject zzf(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    try
    {
      JSONObject localJSONObject1 = paramJSONObject.getJSONObject(paramString);
      paramJSONObject = localJSONObject1;
    }
    catch (JSONException localJSONException)
    {
      JSONObject localJSONObject2 = new JSONObject();
      paramJSONObject.put(paramString, localJSONObject2);
      paramJSONObject = localJSONObject2;
    }
    return paramJSONObject;
  }
  
  public static JSONObject zzg(JSONObject paramJSONObject, String... paramVarArgs)
  {
    paramJSONObject = zzm(paramJSONObject, paramVarArgs);
    if (paramJSONObject == null) {
      return null;
    }
    return paramJSONObject.optJSONObject(paramVarArgs[1]);
  }
  
  public static JSONObject zzh(JsonReader paramJsonReader)
    throws IllegalStateException, IOException, JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      JsonToken localJsonToken = paramJsonReader.peek();
      if (JsonToken.BEGIN_ARRAY.equals(localJsonToken)) {
        localJSONObject.put(str, zze(paramJsonReader));
      } else if (JsonToken.BEGIN_OBJECT.equals(localJsonToken)) {
        localJSONObject.put(str, zzh(paramJsonReader));
      } else if (JsonToken.BOOLEAN.equals(localJsonToken)) {
        localJSONObject.put(str, paramJsonReader.nextBoolean());
      } else if (JsonToken.NUMBER.equals(localJsonToken)) {
        localJSONObject.put(str, paramJsonReader.nextDouble());
      } else if (JsonToken.STRING.equals(localJsonToken)) {
        localJSONObject.put(str, paramJsonReader.nextString());
      } else {
        throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(String.valueOf(localJsonToken))));
      }
    }
    paramJsonReader.endObject();
    return localJSONObject;
  }
  
  public static void zzi(JsonWriter paramJsonWriter, JSONArray paramJSONArray)
    throws IOException
  {
    try
    {
      paramJsonWriter.beginArray();
      int i = 0;
      while (i < paramJSONArray.length())
      {
        Object localObject = paramJSONArray.get(i);
        if ((localObject instanceof String))
        {
          paramJsonWriter.value((String)localObject);
        }
        else if ((localObject instanceof Number))
        {
          paramJsonWriter.value((Number)localObject);
        }
        else if ((localObject instanceof Boolean))
        {
          paramJsonWriter.value(((Boolean)localObject).booleanValue());
        }
        else if ((localObject instanceof JSONObject))
        {
          zzj(paramJsonWriter, (JSONObject)localObject);
        }
        else
        {
          if (!(localObject instanceof JSONArray)) {
            break label120;
          }
          zzi(paramJsonWriter, (JSONArray)localObject);
        }
        i++;
        continue;
        label120:
        paramJsonWriter = new org/json/JSONException;
        localObject = String.valueOf(localObject);
        paramJSONArray = new java/lang/StringBuilder;
        paramJSONArray.<init>();
        paramJSONArray.append("unable to write field: ");
        paramJSONArray.append((String)localObject);
        paramJsonWriter.<init>(paramJSONArray.toString());
        throw paramJsonWriter;
      }
      paramJsonWriter.endArray();
      return;
    }
    catch (JSONException paramJsonWriter)
    {
      throw new IOException(paramJsonWriter);
    }
  }
  
  public static void zzj(JsonWriter paramJsonWriter, JSONObject paramJSONObject)
    throws IOException
  {
    try
    {
      paramJsonWriter.beginObject();
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramJSONObject.get(str);
        if ((localObject instanceof String))
        {
          paramJsonWriter.name(str).value((String)localObject);
        }
        else if ((localObject instanceof Number))
        {
          paramJsonWriter.name(str).value((Number)localObject);
        }
        else if ((localObject instanceof Boolean))
        {
          paramJsonWriter.name(str).value(((Boolean)localObject).booleanValue());
        }
        else if ((localObject instanceof JSONObject))
        {
          zzj(paramJsonWriter.name(str), (JSONObject)localObject);
        }
        else if ((localObject instanceof JSONArray))
        {
          zzi(paramJsonWriter.name(str), (JSONArray)localObject);
        }
        else
        {
          paramJsonWriter = new org/json/JSONException;
          paramJSONObject = String.valueOf(localObject);
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("unable to write field: ");
          ((StringBuilder)localObject).append(paramJSONObject);
          paramJsonWriter.<init>(((StringBuilder)localObject).toString());
          throw paramJsonWriter;
        }
      }
      paramJsonWriter.endObject();
      return;
    }
    catch (JSONException paramJsonWriter)
    {
      throw new IOException(paramJsonWriter);
    }
  }
  
  public static boolean zzk(boolean paramBoolean, JSONObject paramJSONObject, String... paramVarArgs)
  {
    paramJSONObject = zzm(paramJSONObject, paramVarArgs);
    if (paramJSONObject == null) {
      return false;
    }
    return paramJSONObject.optBoolean(paramVarArgs[(paramVarArgs.length - 1)], false);
  }
  
  public static String zzl(zzezk paramzzezk)
  {
    Object localObject = null;
    if (paramzzezk == null)
    {
      paramzzezk = (zzezk)localObject;
    }
    else
    {
      StringWriter localStringWriter = new StringWriter();
      try
      {
        JsonWriter localJsonWriter = new android/util/JsonWriter;
        localJsonWriter.<init>(localStringWriter);
        zzn(localJsonWriter, paramzzezk);
        localJsonWriter.close();
        paramzzezk = localStringWriter.toString();
      }
      catch (IOException paramzzezk)
      {
        zzbzt.zzh("Error when writing JSON.", paramzzezk);
        paramzzezk = (zzezk)localObject;
      }
    }
    return paramzzezk;
  }
  
  private static JSONObject zzm(JSONObject paramJSONObject, String[] paramArrayOfString)
  {
    for (int i = 0; i < paramArrayOfString.length - 1; i++)
    {
      if (paramJSONObject == null) {
        return null;
      }
      paramJSONObject = paramJSONObject.optJSONObject(paramArrayOfString[i]);
    }
    return paramJSONObject;
  }
  
  private static void zzn(JsonWriter paramJsonWriter, Object paramObject)
    throws IOException
  {
    if (paramObject == null)
    {
      paramJsonWriter.nullValue();
      return;
    }
    if ((paramObject instanceof Number))
    {
      paramJsonWriter.value((Number)paramObject);
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      paramJsonWriter.value(((Boolean)paramObject).booleanValue());
      return;
    }
    if ((paramObject instanceof String))
    {
      paramJsonWriter.value((String)paramObject);
      return;
    }
    if ((paramObject instanceof zzezk))
    {
      zzj(paramJsonWriter, ((zzezk)paramObject).zzd);
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJsonWriter.beginObject();
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext())
      {
        Object localObject2 = (Map.Entry)((Iterator)paramObject).next();
        Object localObject1 = ((Map.Entry)localObject2).getKey();
        if ((localObject1 instanceof String))
        {
          localObject2 = ((Map.Entry)localObject2).getValue();
          zzn(paramJsonWriter.name((String)localObject1), localObject2);
        }
      }
      paramJsonWriter.endObject();
      return;
    }
    if ((paramObject instanceof List))
    {
      paramJsonWriter.beginArray();
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        zzn(paramJsonWriter, ((Iterator)paramObject).next());
      }
      paramJsonWriter.endArray();
      return;
    }
    paramJsonWriter.nullValue();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */