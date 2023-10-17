package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

abstract class zzfqn
  implements zzfsn
{
  @CheckForNull
  private transient Set zza;
  @CheckForNull
  private transient Collection zzb;
  @CheckForNull
  private transient Map zzc;
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    boolean bool;
    if (paramObject == this)
    {
      bool = true;
    }
    else
    {
      if ((paramObject instanceof zzfsn)) {
        break label21;
      }
      bool = false;
    }
    return bool;
    label21:
    paramObject = (zzfsn)paramObject;
    return zzs().equals(((zzfsn)paramObject).zzs());
  }
  
  public final int hashCode()
  {
    return zzs().hashCode();
  }
  
  public final String toString()
  {
    return zzs().toString();
  }
  
  abstract Collection zzf();
  
  Iterator zzg()
  {
    throw null;
  }
  
  abstract Map zzj();
  
  abstract Set zzl();
  
  public boolean zzq(Object paramObject1, Object paramObject2)
  {
    throw null;
  }
  
  public final Collection zzr()
  {
    Collection localCollection2 = this.zzb;
    Collection localCollection1 = localCollection2;
    if (localCollection2 == null)
    {
      localCollection1 = zzf();
      this.zzb = localCollection1;
    }
    return localCollection1;
  }
  
  public final Map zzs()
  {
    Map localMap2 = this.zzc;
    Map localMap1 = localMap2;
    if (localMap2 == null)
    {
      localMap1 = zzj();
      this.zzc = localMap1;
    }
    return localMap1;
  }
  
  public final Set zzt()
  {
    Set localSet2 = this.zza;
    Set localSet1 = localSet2;
    if (localSet2 == null)
    {
      localSet1 = zzl();
      this.zza = localSet1;
    }
    return localSet1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */