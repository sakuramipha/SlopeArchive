package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;
import javax.annotation.CheckForNull;

final class zzdj
  extends zzdf
{
  final transient Object zza;
  
  zzdj(Object paramObject)
  {
    Objects.requireNonNull(paramObject);
    this.zza = paramObject;
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    return this.zza.equals(paramObject);
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public final int size()
  {
    return 1;
  }
  
  public final String toString()
  {
    String str = this.zza.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    paramArrayOfObject[0] = this.zza;
    return 1;
  }
  
  public final zzdk zzd()
  {
    return new zzdg(this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */