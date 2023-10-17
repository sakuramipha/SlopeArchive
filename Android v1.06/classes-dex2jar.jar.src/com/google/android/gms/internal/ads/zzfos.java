package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;

public final class zzfos
{
  private final String zza;
  private final zzfoq zzb;
  private zzfoq zzc;
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(32);
    localStringBuilder.append(this.zza);
    localStringBuilder.append('{');
    zzfoq localzzfoq = this.zzb.zzb;
    for (String str = ""; localzzfoq != null; str = ", ")
    {
      Object localObject = localzzfoq.zza;
      localStringBuilder.append(str);
      if ((localObject != null) && (localObject.getClass().isArray()))
      {
        str = Arrays.deepToString(new Object[] { localObject });
        localStringBuilder.append(str, 1, str.length() - 1);
      }
      else
      {
        localStringBuilder.append(localObject);
      }
      localzzfoq = localzzfoq.zzb;
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final zzfos zza(@CheckForNull Object paramObject)
  {
    zzfoq localzzfoq = new zzfoq(null);
    this.zzc.zzb = localzzfoq;
    this.zzc = localzzfoq;
    localzzfoq.zza = paramObject;
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */