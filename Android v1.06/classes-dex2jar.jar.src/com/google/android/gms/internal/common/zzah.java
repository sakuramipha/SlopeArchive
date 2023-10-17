package com.google.android.gms.internal.common;

public final class zzah
{
  static Object[] zza(Object[] paramArrayOfObject, int paramInt)
  {
    int i = 0;
    while (i < paramInt) {
      if (paramArrayOfObject[i] != null)
      {
        i++;
      }
      else
      {
        paramArrayOfObject = new StringBuilder(20);
        paramArrayOfObject.append("at index ");
        paramArrayOfObject.append(i);
        throw new NullPointerException(paramArrayOfObject.toString());
      }
    }
    return paramArrayOfObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */