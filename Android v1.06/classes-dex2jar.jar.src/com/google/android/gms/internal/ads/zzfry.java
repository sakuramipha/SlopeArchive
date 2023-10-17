package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

final class zzfry
  extends zzfps
{
  final Iterator zza;
  
  zzfry(Iterator paramIterator, zzfpa paramzzfpa) {}
  
  @CheckForNull
  protected final Object zza()
  {
    while (this.zza.hasNext())
    {
      Object localObject = this.zza.next();
      if (this.zzb.zza(localObject)) {
        return localObject;
      }
    }
    zzb();
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */