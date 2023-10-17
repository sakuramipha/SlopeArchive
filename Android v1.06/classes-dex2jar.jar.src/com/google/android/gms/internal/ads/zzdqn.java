package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

public final class zzdqn
{
  private final Clock zza;
  
  public zzdqn(Clock paramClock)
  {
    this.zza = paramClock;
  }
  
  public final void zza(List paramList, String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (!((Boolean)zzbdh.zza.zze()).booleanValue()) {
      return;
    }
    long l = this.zza.currentTimeMillis();
    StringWriter localStringWriter = new StringWriter();
    JsonWriter localJsonWriter = new JsonWriter(localStringWriter);
    try
    {
      localJsonWriter.beginObject();
      localJsonWriter.name("timestamp").value(l);
      localJsonWriter.name("source").value(paramString1);
      localJsonWriter.name("event").value(paramString2);
      localJsonWriter.name("components").beginArray();
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localJsonWriter.value(paramList.next().toString());
      }
      localJsonWriter.endArray();
      localJsonWriter.name("params").beginArray();
      int j = paramVarArgs.length;
      for (int i = 0; i < j; i++)
      {
        paramList = paramVarArgs[i];
        if (paramList != null) {
          paramList = paramList.toString();
        } else {
          paramList = null;
        }
        localJsonWriter.value(paramList);
      }
      localJsonWriter.endArray();
      localJsonWriter.endObject();
      localJsonWriter.flush();
      localJsonWriter.close();
    }
    catch (IOException paramList)
    {
      zzbzt.zzh("unable to log", paramList);
    }
    zzbzt.zzi("AD-DBG ".concat(String.valueOf(localStringWriter.toString())));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */