package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

final class zzftj
  extends zzfta
  implements Serializable
{
  final zzfta zza;
  
  zzftj(zzfta paramzzfta)
  {
    this.zza = paramzzfta;
  }
  
  public final int compare(Object paramObject1, Object paramObject2)
  {
    return this.zza.compare(paramObject2, paramObject1);
  }
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzftj))
    {
      paramObject = (zzftj)paramObject;
      return this.zza.equals(((zzftj)paramObject).zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return -this.zza.hashCode();
  }
  
  public final String toString()
  {
    return this.zza.toString().concat(".reverse()");
  }
  
  public final zzfta zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */