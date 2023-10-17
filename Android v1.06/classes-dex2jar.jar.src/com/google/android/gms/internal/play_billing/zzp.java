package com.google.android.gms.internal.play_billing;

import java.util.Objects;

final class zzp
{
  static void zza(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null)
    {
      if (paramObject2 != null) {
        return;
      }
      paramObject2 = new StringBuilder();
      ((StringBuilder)paramObject2).append("null value in entry: ");
      ((StringBuilder)paramObject2).append(paramObject1);
      ((StringBuilder)paramObject2).append("=null");
      throw new NullPointerException(((StringBuilder)paramObject2).toString());
    }
    Objects.toString(paramObject2);
    throw new NullPointerException("null key in entry: null=".concat(String.valueOf(paramObject2)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */