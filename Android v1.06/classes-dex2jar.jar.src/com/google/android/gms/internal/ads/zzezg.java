package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class zzezg
{
  public final int zza;
  public final int zzb;
  public final boolean zzc;
  
  public zzezg(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramBoolean;
  }
  
  static List zza(JsonReader paramJsonReader)
    throws IllegalStateException, IOException, NumberFormatException
  {
    ArrayList localArrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext())
    {
      paramJsonReader.beginObject();
      int j = 0;
      int i = 0;
      boolean bool = false;
      while (paramJsonReader.hasNext())
      {
        String str = paramJsonReader.nextName();
        if ("width".equals(str)) {
          j = paramJsonReader.nextInt();
        } else if ("height".equals(str)) {
          i = paramJsonReader.nextInt();
        } else if ("is_fluid_height".equals(str)) {
          bool = paramJsonReader.nextBoolean();
        } else {
          paramJsonReader.skipValue();
        }
      }
      paramJsonReader.endObject();
      localArrayList.add(new zzezg(j, i, bool));
    }
    paramJsonReader.endArray();
    return localArrayList;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzezg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */