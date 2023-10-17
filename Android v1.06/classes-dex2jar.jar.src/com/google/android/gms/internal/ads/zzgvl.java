package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class zzgvl
{
  static HashSet zza(int paramInt)
  {
    return new HashSet(zzd(paramInt));
  }
  
  public static LinkedHashMap zzb(int paramInt)
  {
    return new LinkedHashMap(zzd(paramInt));
  }
  
  public static List zzc(int paramInt)
  {
    if (paramInt == 0) {
      return Collections.emptyList();
    }
    return new ArrayList(paramInt);
  }
  
  private static int zzd(int paramInt)
  {
    if (paramInt < 3) {
      return paramInt + 1;
    }
    if (paramInt < 1073741824) {
      return (int)(paramInt / 0.75F + 1.0F);
    }
    return Integer.MAX_VALUE;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */