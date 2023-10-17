package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

public final class zzfsz
{
  static Object zza(@CheckForNull Object paramObject, int paramInt)
  {
    if (paramObject != null) {
      return paramObject;
    }
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("at index ");
    ((StringBuilder)paramObject).append(paramInt);
    throw new NullPointerException(((StringBuilder)paramObject).toString());
  }
  
  static Object[] zzb(Object[] paramArrayOfObject, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      zza(paramArrayOfObject[i], i);
    }
    return paramArrayOfObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfsz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */