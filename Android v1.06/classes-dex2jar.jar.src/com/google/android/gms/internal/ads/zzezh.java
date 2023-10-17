package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;

public final class zzezh
{
  private String zza;
  
  zzezh(JsonReader paramJsonReader)
    throws IOException
  {
    paramJsonReader.beginObject();
    String str1 = "";
    while (paramJsonReader.hasNext())
    {
      String str2 = paramJsonReader.nextName();
      int i = str2.hashCode();
      if (i != -1724546052)
      {
        if ((i == 3059181) && (str2.equals("code")))
        {
          i = 0;
          break label77;
        }
      }
      else if (str2.equals("description"))
      {
        i = 1;
        break label77;
      }
      i = -1;
      label77:
      if (i != 0)
      {
        if (i != 1) {
          paramJsonReader.skipValue();
        } else {
          str1 = paramJsonReader.nextString();
        }
      }
      else {
        paramJsonReader.nextInt();
      }
    }
    paramJsonReader.endObject();
    this.zza = str1;
  }
  
  public final String zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzezh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */