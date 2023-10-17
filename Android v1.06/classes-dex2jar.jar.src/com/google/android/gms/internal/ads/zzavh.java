package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzavh
{
  static long zza(long paramLong, int paramInt)
  {
    if (paramInt == 1) {
      return paramLong;
    }
    if ((paramInt & 0x1) == 0) {}
    for (paramLong = zza(paramLong * paramLong % 1073807359L, paramInt >> 1);; paramLong *= zza(paramLong * paramLong % 1073807359L, paramInt >> 1) % 1073807359L) {
      return paramLong % 1073807359L;
    }
  }
  
  static String zzb(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfString.length;
    paramInt2 += paramInt1;
    if (i < paramInt2)
    {
      zzbzt.zzg("Unable to construct shingle");
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      i = paramInt2 - 1;
      if (paramInt1 >= i) {
        break;
      }
      localStringBuilder.append(paramArrayOfString[paramInt1]);
      localStringBuilder.append(' ');
      paramInt1++;
    }
    localStringBuilder.append(paramArrayOfString[i]);
    return localStringBuilder.toString();
  }
  
  public static void zzc(String[] paramArrayOfString, int paramInt1, int paramInt2, PriorityQueue paramPriorityQueue)
  {
    paramInt2 = paramArrayOfString.length;
    if (paramInt2 < 6)
    {
      zzd(paramInt1, zze(paramArrayOfString, 0, paramInt2), zzb(paramArrayOfString, 0, paramInt2), paramInt2, paramPriorityQueue);
      return;
    }
    long l1 = zze(paramArrayOfString, 0, 6);
    zzd(paramInt1, l1, zzb(paramArrayOfString, 0, 6), 6, paramPriorityQueue);
    for (paramInt2 = 1;; paramInt2++)
    {
      int i = paramArrayOfString.length;
      if (paramInt2 >= i - 5) {
        break;
      }
      int j = zzavd.zza(paramArrayOfString[(paramInt2 - 1)]);
      int k = zzavd.zza(paramArrayOfString[(paramInt2 + 5)]);
      long l3 = j;
      long l2 = k;
      String str = zzb(paramArrayOfString, paramInt2, 6);
      l1 = ((l1 + 1073807359L - zza(16785407L, 5) * ((l3 + 2147483647L) % 1073807359L) % 1073807359L) % 1073807359L * 16785407L % 1073807359L + (l2 + 2147483647L) % 1073807359L) % 1073807359L;
      zzd(paramInt1, l1, str, i, paramPriorityQueue);
    }
  }
  
  static void zzd(int paramInt1, long paramLong, String paramString, int paramInt2, PriorityQueue paramPriorityQueue)
  {
    paramString = new zzavg(paramLong, paramString, paramInt2);
    if ((paramPriorityQueue.size() == paramInt1) && ((((zzavg)paramPriorityQueue.peek()).zzc > paramString.zzc) || (((zzavg)paramPriorityQueue.peek()).zza > paramString.zza))) {
      return;
    }
    if (paramPriorityQueue.contains(paramString)) {
      return;
    }
    paramPriorityQueue.add(paramString);
    if (paramPriorityQueue.size() > paramInt1) {
      paramPriorityQueue.poll();
    }
  }
  
  private static long zze(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    long l = (zzavd.zza(paramArrayOfString[0]) + 2147483647L) % 1073807359L;
    for (paramInt1 = 1; paramInt1 < paramInt2; paramInt1++) {
      l = (l * 16785407L % 1073807359L + (zzavd.zza(paramArrayOfString[paramInt1]) + 2147483647L) % 1073807359L) % 1073807359L;
    }
    return l;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */