package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Field;

public final class ObjectWrapper<T>
  extends IObjectWrapper.Stub
{
  private final T zza;
  
  private ObjectWrapper(T paramT)
  {
    this.zza = paramT;
  }
  
  public static <T> T unwrap(IObjectWrapper paramIObjectWrapper)
  {
    if ((paramIObjectWrapper instanceof ObjectWrapper)) {
      return (T)((ObjectWrapper)paramIObjectWrapper).zza;
    }
    IBinder localIBinder = paramIObjectWrapper.asBinder();
    Field[] arrayOfField = localIBinder.getClass().getDeclaredFields();
    int m = arrayOfField.length;
    paramIObjectWrapper = null;
    int k = 0;
    int j;
    for (int i = 0; k < m; i = j)
    {
      Field localField = arrayOfField[k];
      j = i;
      if (!localField.isSynthetic())
      {
        j = i + 1;
        paramIObjectWrapper = localField;
      }
      k++;
    }
    if (i == 1)
    {
      Preconditions.checkNotNull(paramIObjectWrapper);
      if (!paramIObjectWrapper.isAccessible())
      {
        paramIObjectWrapper.setAccessible(true);
        try
        {
          paramIObjectWrapper = paramIObjectWrapper.get(localIBinder);
          return paramIObjectWrapper;
        }
        catch (IllegalAccessException paramIObjectWrapper)
        {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", paramIObjectWrapper);
        }
        catch (NullPointerException paramIObjectWrapper)
        {
          throw new IllegalArgumentException("Binder object is null.", paramIObjectWrapper);
        }
      }
      throw new IllegalArgumentException("IObjectWrapper declared field not private!");
    }
    i = arrayOfField.length;
    paramIObjectWrapper = new StringBuilder(64);
    paramIObjectWrapper.append("Unexpected number of IObjectWrapper declared fields: ");
    paramIObjectWrapper.append(i);
    throw new IllegalArgumentException(paramIObjectWrapper.toString());
  }
  
  public static <T> IObjectWrapper wrap(T paramT)
  {
    return new ObjectWrapper(paramT);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamic\ObjectWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */