package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class zzb
  extends LinkedHashMap
{
  final zzc zza;
  
  zzb(zzc paramzzc) {}
  
  protected final boolean removeEldestEntry(Map.Entry paramEntry)
  {
    synchronized (this.zza)
    {
      int j = size();
      Object localObject = this.zza;
      int i = zzc.zza((zzc)localObject);
      boolean bool = false;
      if (j <= i) {
        return false;
      }
      localObject = zzc.zzc((zzc)localObject);
      Pair localPair = new android/util/Pair;
      localPair.<init>((String)paramEntry.getKey(), (String)((Pair)paramEntry.getValue()).second);
      ((ArrayDeque)localObject).add(localPair);
      if (size() > zzc.zza(this.zza)) {
        bool = true;
      }
      return bool;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */