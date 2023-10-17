package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class DowngradeableSafeParcel
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  private static final Object zza = new Object();
  private boolean zzb = false;
  
  protected static boolean canUnparcelSafely(String arg0)
  {
    synchronized (zza)
    {
      return true;
    }
  }
  
  protected static Integer getUnparcelClientVersion()
  {
    synchronized (zza)
    {
      return null;
    }
  }
  
  protected abstract boolean prepareForClientVersion(int paramInt);
  
  public void setShouldDowngrade(boolean paramBoolean)
  {
    this.zzb = paramBoolean;
  }
  
  protected boolean shouldDowngrade()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\DowngradeableSafeParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */