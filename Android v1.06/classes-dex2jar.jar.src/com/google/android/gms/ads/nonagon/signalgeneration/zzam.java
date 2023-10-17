package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzam
{
  public final String zza;
  public String zzb;
  public Bundle zzc = new Bundle();
  
  public zzam(JsonReader paramJsonReader)
    throws IOException
  {
    HashMap localHashMap = new HashMap();
    paramJsonReader.beginObject();
    Object localObject = "";
    while (paramJsonReader.hasNext())
    {
      String str2 = paramJsonReader.nextName();
      String str1 = str2;
      if (str2 == null) {
        str1 = "";
      }
      int i = str1.hashCode();
      if (i != -995427962)
      {
        if ((i == -271442291) && (str1.equals("signal_dictionary")))
        {
          i = 1;
          break label110;
        }
      }
      else if (str1.equals("params"))
      {
        i = 0;
        break label110;
      }
      i = -1;
      label110:
      if (i != 0)
      {
        if (i != 1)
        {
          paramJsonReader.skipValue();
        }
        else
        {
          localHashMap = new HashMap();
          paramJsonReader.beginObject();
          while (paramJsonReader.hasNext()) {
            localHashMap.put(paramJsonReader.nextName(), paramJsonReader.nextString());
          }
          paramJsonReader.endObject();
        }
      }
      else {
        localObject = paramJsonReader.nextString();
      }
    }
    this.zza = ((String)localObject);
    paramJsonReader.endObject();
    paramJsonReader = localHashMap.entrySet().iterator();
    while (paramJsonReader.hasNext())
    {
      localObject = (Map.Entry)paramJsonReader.next();
      if ((((Map.Entry)localObject).getKey() != null) && (((Map.Entry)localObject).getValue() != null)) {
        this.zzc.putString((String)((Map.Entry)localObject).getKey(), (String)((Map.Entry)localObject).getValue());
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */