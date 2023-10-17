package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzaai
{
  private final zzaah zza;
  private final AtomicBoolean zzb;
  
  public zzaai(zzaah paramzzaah)
  {
    this.zza = paramzzaah;
    this.zzb = new AtomicBoolean(false);
  }
  
  public final zzaao zza(Object... paramVarArgs)
  {
    synchronized (this.zzb)
    {
      if (this.zzb.get()) {}
      for (;;)
      {
        Constructor localConstructor = null;
        break;
        try
        {
          localConstructor = this.zza.zza();
        }
        catch (Exception localException)
        {
          paramVarArgs = new java/lang/RuntimeException;
          paramVarArgs.<init>("Error instantiating extension", localException);
          throw paramVarArgs;
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          this.zzb.set(true);
        }
      }
      if (localClassNotFoundException == null) {
        return null;
      }
      try
      {
        paramVarArgs = (zzaao)localClassNotFoundException.newInstance(paramVarArgs);
        return paramVarArgs;
      }
      catch (Exception paramVarArgs)
      {
        throw new IllegalStateException("Unexpected error creating extractor", paramVarArgs);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */