package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import javax.annotation.CheckForNull;

final class zzfrc
  extends zzfta
  implements Serializable
{
  final Comparator zza;
  
  zzfrc(Comparator paramComparator)
  {
    Objects.requireNonNull(paramComparator);
    this.zza = paramComparator;
  }
  
  public final int compare(Object paramObject1, Object paramObject2)
  {
    return this.zza.compare(paramObject1, paramObject2);
  }
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzfrc))
    {
      paramObject = (zzfrc)paramObject;
      return this.zza.equals(((zzfrc)paramObject).zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public final String toString()
  {
    return this.zza.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */