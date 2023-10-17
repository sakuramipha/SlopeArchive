package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

public final class zzfya
{
  private final ConcurrentMap zza;
  private final List zzb;
  private final zzfxw zzc;
  private final Class zzd;
  private final zzggx zze;
  
  @Nullable
  public final zzfxw zza()
  {
    return this.zzc;
  }
  
  public final zzggx zzb()
  {
    return this.zze;
  }
  
  public final Class zzc()
  {
    return this.zzd;
  }
  
  public final Collection zzd()
  {
    return this.zza.values();
  }
  
  public final List zze(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (List)this.zza.get(new zzfxy(paramArrayOfByte, null));
    if (paramArrayOfByte != null) {
      return paramArrayOfByte;
    }
    return Collections.emptyList();
  }
  
  public final boolean zzf()
  {
    return !this.zze.zza().isEmpty();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */