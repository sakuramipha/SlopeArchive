package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;

public abstract class RemoteCreator<T>
{
  private final String zza;
  private T zzb;
  
  protected RemoteCreator(String paramString)
  {
    this.zza = paramString;
  }
  
  protected abstract T getRemoteCreator(IBinder paramIBinder);
  
  protected final T getRemoteCreatorInstance(Context paramContext)
    throws RemoteCreator.RemoteCreatorException
  {
    if (this.zzb == null)
    {
      Preconditions.checkNotNull(paramContext);
      paramContext = GooglePlayServicesUtilLight.getRemoteContext(paramContext);
      if (paramContext != null)
      {
        paramContext = paramContext.getClassLoader();
        try
        {
          this.zzb = getRemoteCreator((IBinder)paramContext.loadClass(this.zza).newInstance());
        }
        catch (IllegalAccessException paramContext)
        {
          throw new RemoteCreatorException("Could not access creator.", paramContext);
        }
        catch (InstantiationException paramContext)
        {
          throw new RemoteCreatorException("Could not instantiate creator.", paramContext);
        }
        catch (ClassNotFoundException paramContext)
        {
          throw new RemoteCreatorException("Could not load creator class.", paramContext);
        }
      }
      else
      {
        throw new RemoteCreatorException("Could not get remote context.");
      }
    }
    return (T)this.zzb;
  }
  
  public static class RemoteCreatorException
    extends Exception
  {
    public RemoteCreatorException(String paramString)
    {
      super();
    }
    
    public RemoteCreatorException(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamic\RemoteCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */