package com.google.android.gms.internal.play_billing;

import java.util.Map.Entry;
import javax.annotation.CheckForNull;

final class zzac
  extends zzy
{
  private final transient zzx zza;
  private final transient Object[] zzb;
  private final transient int zzc;
  
  zzac(zzx paramzzx, Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    this.zza = paramzzx;
    this.zzb = paramArrayOfObject;
    this.zzc = paramInt2;
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      Object localObject = (Map.Entry)paramObject;
      paramObject = ((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if ((localObject != null) && (localObject.equals(this.zza.get(paramObject)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int size()
  {
    return this.zzc;
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    return zzd().zza(paramArrayOfObject, 0);
  }
  
  public final zzah zze()
  {
    return zzd().zzm(0);
  }
  
  final boolean zzf()
  {
    throw null;
  }
  
  final zzu zzh()
  {
    return new zzab(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */