package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

public final class zzgpd
  extends AbstractList
{
  private final List zza;
  private final zzgpc zzb;
  
  public zzgpd(List paramList, zzgpc paramzzgpc)
  {
    this.zza = paramList;
    this.zzb = paramzzgpc;
  }
  
  public final Object get(int paramInt)
  {
    zzaxv localzzaxv2 = zzaxv.zzb(((Integer)this.zza.get(paramInt)).intValue());
    zzaxv localzzaxv1 = localzzaxv2;
    if (localzzaxv2 == null) {
      localzzaxv1 = zzaxv.zza;
    }
    return localzzaxv1;
  }
  
  public final int size()
  {
    return this.zza.size();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */