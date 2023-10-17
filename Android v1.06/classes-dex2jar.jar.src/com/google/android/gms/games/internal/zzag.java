package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.internal.Preconditions;

class zzag
  extends zza
{
  private final BaseImplementation.ResultHolder zza;
  
  zzag(BaseImplementation.ResultHolder paramResultHolder)
  {
    this.zza = ((BaseImplementation.ResultHolder)Preconditions.checkNotNull(paramResultHolder, "Holder must not be null"));
  }
  
  final void zzs(Object paramObject)
  {
    this.zza.setResult(paramObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */