package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzezq
{
  public final List zza;
  public final zzezi zzb;
  public final List zzc;
  
  zzezq(JsonReader paramJsonReader)
    throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError
  {
    Object localObject1 = Collections.emptyList();
    ArrayList localArrayList = new ArrayList();
    paramJsonReader.beginObject();
    zzezi localzzezi = null;
    while (paramJsonReader.hasNext())
    {
      Object localObject2 = paramJsonReader.nextName();
      if ("responses".equals(localObject2))
      {
        paramJsonReader.beginArray();
        paramJsonReader.beginObject();
        while (paramJsonReader.hasNext())
        {
          localObject2 = paramJsonReader.nextName();
          if ("ad_configs".equals(localObject2))
          {
            localObject1 = new ArrayList();
            paramJsonReader.beginArray();
            while (paramJsonReader.hasNext()) {
              ((List)localObject1).add(new zzezf(paramJsonReader));
            }
            paramJsonReader.endArray();
          }
          else if (((String)localObject2).equals("common"))
          {
            localzzezi = new zzezi(paramJsonReader);
          }
          else
          {
            paramJsonReader.skipValue();
          }
        }
        paramJsonReader.endObject();
        paramJsonReader.endArray();
      }
      else if (((String)localObject2).equals("actions"))
      {
        paramJsonReader.beginArray();
        while (paramJsonReader.hasNext())
        {
          paramJsonReader.beginObject();
          String str1 = null;
          localObject2 = null;
          while (paramJsonReader.hasNext())
          {
            String str2 = paramJsonReader.nextName();
            if ("name".equals(str2)) {
              str1 = paramJsonReader.nextString();
            } else if ("info".equals(str2)) {
              localObject2 = zzbu.zzh(paramJsonReader);
            } else {
              paramJsonReader.skipValue();
            }
          }
          if (str1 != null) {
            localArrayList.add(new zzezp(str1, (JSONObject)localObject2));
          }
          paramJsonReader.endObject();
        }
        paramJsonReader.endArray();
      }
    }
    this.zzc = localArrayList;
    this.zza = ((List)localObject1);
    paramJsonReader = localzzezi;
    if (localzzezi == null) {
      paramJsonReader = new zzezi(new JsonReader(new StringReader("{}")));
    }
    this.zzb = paramJsonReader;
  }
  
  /* Error */
  public static zzezq zza(java.io.Reader paramReader)
    throws zzezj
  {
    // Byte code:
    //   0: new 35	android/util/JsonReader
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 116	android/util/JsonReader:<init>	(Ljava/io/Reader;)V
    //   9: new 2	com/google/android/gms/internal/ads/zzezq
    //   12: dup
    //   13: aload_1
    //   14: invokespecial 124	com/google/android/gms/internal/ads/zzezq:<init>	(Landroid/util/JsonReader;)V
    //   17: astore_1
    //   18: aload_0
    //   19: invokestatic 130	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   22: aload_1
    //   23: areturn
    //   24: astore_1
    //   25: goto +33 -> 58
    //   28: astore_1
    //   29: goto +16 -> 45
    //   32: astore_1
    //   33: goto +12 -> 45
    //   36: astore_1
    //   37: goto +8 -> 45
    //   40: astore_1
    //   41: goto +4 -> 45
    //   44: astore_1
    //   45: new 123	com/google/android/gms/internal/ads/zzezj
    //   48: astore_2
    //   49: aload_2
    //   50: ldc -124
    //   52: aload_1
    //   53: invokespecial 135	com/google/android/gms/internal/ads/zzezj:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   56: aload_2
    //   57: athrow
    //   58: aload_0
    //   59: invokestatic 130	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   62: aload_1
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	paramReader	java.io.Reader
    //   3	20	1	localObject1	Object
    //   24	1	1	localObject2	Object
    //   28	1	1	localAssertionError	AssertionError
    //   32	1	1	localNumberFormatException	NumberFormatException
    //   36	1	1	localJSONException	JSONException
    //   40	1	1	localIllegalStateException	IllegalStateException
    //   44	19	1	localIOException	IOException
    //   48	9	2	localzzezj	zzezj
    // Exception table:
    //   from	to	target	type
    //   0	18	24	finally
    //   45	58	24	finally
    //   0	18	28	java/lang/AssertionError
    //   0	18	32	java/lang/NumberFormatException
    //   0	18	36	org/json/JSONException
    //   0	18	40	java/lang/IllegalStateException
    //   0	18	44	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzezq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */