package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

abstract class zzfsl
  extends AbstractMap
{
  @CheckForNull
  private transient Set zza;
  @CheckForNull
  private transient Set zzb;
  @CheckForNull
  private transient Collection zzc;
  
  public final Set entrySet()
  {
    Set localSet2 = this.zza;
    Set localSet1 = localSet2;
    if (localSet2 == null)
    {
      localSet1 = zzb();
      this.zza = localSet1;
    }
    return localSet1;
  }
  
  public Set keySet()
  {
    Set localSet2 = this.zzb;
    Set localSet1 = localSet2;
    if (localSet2 == null)
    {
      localSet1 = zze();
      this.zzb = localSet1;
    }
    return localSet1;
  }
  
  public final Collection values()
  {
    Collection localCollection = this.zzc;
    Object localObject = localCollection;
    if (localCollection == null)
    {
      localObject = new zzfsk(this);
      this.zzc = ((Collection)localObject);
    }
    return (Collection)localObject;
  }
  
  abstract Set zzb();
  
  Set zze()
  {
    return new zzfsj(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfsl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */