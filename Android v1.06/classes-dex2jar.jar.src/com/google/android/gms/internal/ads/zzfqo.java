package com.google.android.gms.internal.ads;

final class zzfqo
{
  static int zza(int paramInt, String paramString)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" cannot be negative but was: ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  static void zzb(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null)
    {
      if (paramObject2 != null) {
        return;
      }
      paramObject1 = paramObject1.toString();
      paramObject2 = new StringBuilder();
      ((StringBuilder)paramObject2).append("null value in entry: ");
      ((StringBuilder)paramObject2).append((String)paramObject1);
      ((StringBuilder)paramObject2).append("=null");
      throw new NullPointerException(((StringBuilder)paramObject2).toString());
    }
    throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(paramObject2))));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */