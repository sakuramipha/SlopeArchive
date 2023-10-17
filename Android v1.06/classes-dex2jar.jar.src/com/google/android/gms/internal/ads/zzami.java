package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzami
  extends zzalw
{
  static List zza(Map paramMap)
  {
    ArrayList localArrayList = new ArrayList(paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localEntry.getKey() != null)
      {
        paramMap = ((List)localEntry.getValue()).iterator();
        while (paramMap.hasNext())
        {
          String str = (String)paramMap.next();
          localArrayList.add(new zzala((String)localEntry.getKey(), str));
        }
      }
    }
    return localArrayList;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzami.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */