package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public abstract class StatsEvent
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public final String toString()
  {
    long l1 = zzc();
    int i = zza();
    long l2 = zzb();
    String str = zzd();
    StringBuilder localStringBuilder = new StringBuilder(str.length() + 53);
    localStringBuilder.append(l1);
    localStringBuilder.append("\t");
    localStringBuilder.append(i);
    localStringBuilder.append("\t");
    localStringBuilder.append(l2);
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public abstract int zza();
  
  public abstract long zzb();
  
  public abstract long zzc();
  
  public abstract String zzd();
  
  public static abstract interface Types
  {
    public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
    public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\stats\StatsEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */