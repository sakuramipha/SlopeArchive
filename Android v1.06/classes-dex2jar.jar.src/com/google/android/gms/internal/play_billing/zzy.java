package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzy
  extends zzr
  implements Set
{
  @CheckForNull
  private transient zzu zza;
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramObject != this) {
      if (paramObject == this) {
        bool1 = bool2;
      } else if ((paramObject instanceof Set)) {
        paramObject = (Set)paramObject;
      }
    }
    try
    {
      if (size() == ((Set)paramObject).size())
      {
        bool1 = containsAll((Collection)paramObject);
        if (bool1) {
          return true;
        }
      }
    }
    catch (NullPointerException|ClassCastException paramObject)
    {
      for (;;) {}
    }
    bool1 = false;
    return bool1;
  }
  
  public final int hashCode()
  {
    return zzag.zza(this);
  }
  
  public zzu zzd()
  {
    zzu localzzu2 = this.zza;
    zzu localzzu1 = localzzu2;
    if (localzzu2 == null)
    {
      localzzu1 = zzh();
      this.zza = localzzu1;
    }
    return localzzu1;
  }
  
  public abstract zzah zze();
  
  zzu zzh()
  {
    return zzu.zzi(toArray());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */