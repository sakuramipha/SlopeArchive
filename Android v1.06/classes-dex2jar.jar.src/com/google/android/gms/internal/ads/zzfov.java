package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

public abstract class zzfov
  implements Serializable
{
  public static zzfov zzc()
  {
    return zzfod.zza;
  }
  
  public static zzfov zzd(@CheckForNull Object paramObject)
  {
    if (paramObject == null) {
      paramObject = zzfod.zza;
    } else {
      paramObject = new zzfpe(paramObject);
    }
    return (zzfov)paramObject;
  }
  
  public abstract zzfov zza(zzfon paramzzfon);
  
  public abstract Object zzb(Object paramObject);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */