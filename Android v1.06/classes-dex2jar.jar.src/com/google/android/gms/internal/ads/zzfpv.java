package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.CheckForNull;

final class zzfpv
  extends zzfsi
{
  final zzfpx zza;
  
  zzfpv(zzfpx paramzzfpx) {}
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    return zzfqq.zza(this.zza.zza.entrySet(), paramObject);
  }
  
  public final Iterator iterator()
  {
    return new zzfpw(this.zza);
  }
  
  public final boolean remove(@CheckForNull Object paramObject)
  {
    if (!contains(paramObject)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    paramObject.getClass();
    zzfqk.zzo(this.zza.zzb, ((Map.Entry)paramObject).getKey());
    return true;
  }
  
  final Map zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */