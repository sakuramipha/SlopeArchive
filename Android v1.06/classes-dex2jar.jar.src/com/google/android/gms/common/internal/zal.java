package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.Client;

public final class zal
{
  private final SparseIntArray zaa = new SparseIntArray();
  private GoogleApiAvailabilityLight zab;
  
  public zal()
  {
    this(GoogleApiAvailability.getInstance());
  }
  
  public zal(GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight)
  {
    Preconditions.checkNotNull(paramGoogleApiAvailabilityLight);
    this.zab = paramGoogleApiAvailabilityLight;
  }
  
  public final int zaa(Context paramContext, int paramInt)
  {
    return this.zaa.get(paramInt, -1);
  }
  
  public final int zab(Context paramContext, Api.Client paramClient)
  {
    Preconditions.checkNotNull(paramContext);
    Preconditions.checkNotNull(paramClient);
    boolean bool = paramClient.requiresGooglePlayServices();
    int j = 0;
    if (!bool) {
      return 0;
    }
    int k = paramClient.getMinApkVersion();
    int i = zaa(paramContext, k);
    if (i == -1)
    {
      for (i = 0; i < this.zaa.size(); i++)
      {
        int m = this.zaa.keyAt(i);
        if ((m > k) && (this.zaa.get(m) == 0))
        {
          i = j;
          break label108;
        }
      }
      i = -1;
      label108:
      if (i == -1) {
        i = this.zab.isGooglePlayServicesAvailable(paramContext, k);
      }
      this.zaa.put(k, i);
    }
    return i;
  }
  
  public final void zac()
  {
    this.zaa.clear();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */