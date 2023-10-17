package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public final class zzghe
{
  private final zzggx zza;
  private final List zzb;
  @Nullable
  private final Integer zzc;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzghe)) {
      return false;
    }
    Object localObject = (zzghe)paramObject;
    if ((this.zza.equals(((zzghe)localObject).zza)) && (this.zzb.equals(((zzghe)localObject).zzb)))
    {
      paramObject = this.zzc;
      localObject = ((zzghe)localObject).zzc;
      if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.zza, this.zzb });
  }
  
  public final String toString()
  {
    return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[] { this.zza, this.zzb, this.zzc });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzghe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */