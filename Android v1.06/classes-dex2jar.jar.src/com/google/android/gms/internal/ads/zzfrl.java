package com.google.android.gms.internal.ads;

public abstract class zzfrl
{
  static int zze(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + (paramInt1 >> 1) + 1;
    paramInt1 = i;
    if (i < paramInt2)
    {
      paramInt1 = Integer.highestOneBit(paramInt2 - 1);
      paramInt1 += paramInt1;
    }
    paramInt2 = paramInt1;
    if (paramInt1 < 0) {
      paramInt2 = Integer.MAX_VALUE;
    }
    return paramInt2;
  }
  
  public abstract zzfrl zzb(Object paramObject);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */