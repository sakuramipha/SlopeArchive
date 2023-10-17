package com.google.android.gms.internal.ads;

import java.util.Objects;

final class zzfwg
  extends zzfuf.zzi
  implements Runnable
{
  private final Runnable zza;
  
  public zzfwg(Runnable paramRunnable)
  {
    Objects.requireNonNull(paramRunnable);
    this.zza = paramRunnable;
  }
  
  public final void run()
  {
    try
    {
      this.zza.run();
      return;
    }
    catch (Error localError) {}catch (RuntimeException localRuntimeException) {}
    zze(localRuntimeException);
    throw localRuntimeException;
  }
  
  protected final String zza()
  {
    String str = this.zza.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("task=[");
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */