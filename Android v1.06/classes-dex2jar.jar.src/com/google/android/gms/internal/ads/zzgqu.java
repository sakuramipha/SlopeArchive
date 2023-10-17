package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

final class zzgqu
{
  private final ArrayDeque zza = new ArrayDeque();
  
  private final void zzb(zzgno paramzzgno)
  {
    if (paramzzgno.zzh())
    {
      int i = zzc(paramzzgno.zzd());
      int j = zzgqy.zzc(i + 1);
      if ((!this.zza.isEmpty()) && (((zzgno)this.zza.peek()).zzd() < j))
      {
        i = zzgqy.zzc(i);
        for (Object localObject = (zzgno)this.zza.pop(); (!this.zza.isEmpty()) && (((zzgno)this.zza.peek()).zzd() < i); localObject = new zzgqy((zzgno)this.zza.pop(), (zzgno)localObject, null)) {}
        for (paramzzgno = new zzgqy((zzgno)localObject, paramzzgno, null); !this.zza.isEmpty(); paramzzgno = new zzgqy((zzgno)this.zza.pop(), paramzzgno, null))
        {
          i = zzgqy.zzc(zzc(paramzzgno.zzd()) + 1);
          if (((zzgno)this.zza.peek()).zzd() >= i) {
            break;
          }
        }
        this.zza.push(paramzzgno);
        return;
      }
      this.zza.push(paramzzgno);
      return;
    }
    if ((paramzzgno instanceof zzgqy))
    {
      paramzzgno = (zzgqy)paramzzgno;
      zzb(zzgqy.zzg(paramzzgno));
      zzb(zzgqy.zzB(paramzzgno));
      return;
    }
    throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(paramzzgno.getClass()))));
  }
  
  private static final int zzc(int paramInt)
  {
    int i = Arrays.binarySearch(zzgqy.zza, paramInt);
    paramInt = i;
    if (i < 0) {
      paramInt = -(i + 1) - 1;
    }
    return paramInt;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */