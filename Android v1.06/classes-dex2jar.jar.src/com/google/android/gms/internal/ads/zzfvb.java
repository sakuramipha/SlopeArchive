package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

abstract class zzfvb
  extends zzfuq
{
  @CheckForNull
  private List zza;
  
  zzfvb(zzfrm paramzzfrm, boolean paramBoolean)
  {
    super(paramzzfrm, true, true);
    Object localObject;
    if (paramzzfrm.isEmpty()) {
      localObject = Collections.emptyList();
    } else {
      localObject = zzfsf.zza(paramzzfrm.size());
    }
    for (int i = 0; i < paramzzfrm.size(); i++) {
      ((List)localObject).add(null);
    }
    this.zza = ((List)localObject);
  }
  
  abstract Object zzH(List paramList);
  
  final void zzg(int paramInt, Object paramObject)
  {
    List localList = this.zza;
    if (localList != null) {
      localList.set(paramInt, new zzfva(paramObject));
    }
  }
  
  final void zzv()
  {
    List localList = this.zza;
    if (localList != null) {
      zzd(zzH(localList));
    }
  }
  
  final void zzz(int paramInt)
  {
    super.zzz(paramInt);
    this.zza = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfvb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */