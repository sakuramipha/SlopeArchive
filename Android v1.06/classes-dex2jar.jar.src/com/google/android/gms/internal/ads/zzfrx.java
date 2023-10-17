package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

public final class zzfrx
{
  public static boolean zza(Iterable paramIterable, zzfpa paramzzfpa)
  {
    if (((paramIterable instanceof RandomAccess)) && ((paramIterable instanceof List)))
    {
      paramIterable = (List)paramIterable;
      Objects.requireNonNull(paramzzfpa);
      return zzc(paramIterable, paramzzfpa);
    }
    paramIterable = paramIterable.iterator();
    Objects.requireNonNull(paramzzfpa);
    boolean bool = false;
    while (paramIterable.hasNext()) {
      if (paramzzfpa.zza(paramIterable.next()))
      {
        paramIterable.remove();
        bool = true;
      }
    }
    return bool;
  }
  
  private static void zzb(List paramList, zzfpa paramzzfpa, int paramInt1, int paramInt2)
  {
    int i = paramList.size();
    for (;;)
    {
      int j = i - 1;
      i = paramInt2;
      if (j <= paramInt2) {
        break;
      }
      i = j;
      if (paramzzfpa.zza(paramList.get(j)))
      {
        paramList.remove(j);
        i = j;
      }
    }
    for (;;)
    {
      i--;
      if (i < paramInt1) {
        break;
      }
      paramList.remove(i);
    }
  }
  
  private static boolean zzc(List paramList, zzfpa paramzzfpa)
  {
    int j = 0;
    int k;
    for (int i = 0; j < paramList.size(); i = k)
    {
      Object localObject = paramList.get(j);
      k = i;
      if (!paramzzfpa.zza(localObject))
      {
        if (j > i) {
          try
          {
            paramList.set(i, localObject);
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            zzb(paramList, paramzzfpa, i, j);
            return true;
          }
          catch (UnsupportedOperationException localUnsupportedOperationException)
          {
            zzb(paramList, paramzzfpa, i, j);
            return true;
          }
        }
        k = i + 1;
      }
      j++;
    }
    paramList.subList(i, paramList.size()).clear();
    return j != i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */