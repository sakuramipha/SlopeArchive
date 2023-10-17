package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class zzmr
  implements PrivilegedExceptionAction
{
  public static final Unsafe zza()
    throws Exception
  {
    for (Object localObject : Unsafe.class.getDeclaredFields())
    {
      ((Field)localObject).setAccessible(true);
      localObject = ((Field)localObject).get(null);
      if (Unsafe.class.isInstance(localObject)) {
        return (Unsafe)Unsafe.class.cast(localObject);
      }
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */