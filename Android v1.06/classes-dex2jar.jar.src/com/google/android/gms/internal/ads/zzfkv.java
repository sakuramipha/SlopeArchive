package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzfkv
{
  final zzfky zza;
  final boolean zzb;
  
  private zzfkv(zzfky paramzzfky)
  {
    this.zza = paramzzfky;
    boolean bool;
    if (paramzzfky != null) {
      bool = true;
    } else {
      bool = false;
    }
    this.zzb = bool;
  }
  
  public static zzfkv zzb(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      paramString2 = DynamiteModule.load(paramContext, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite");
      IInterface localIInterface;
      return new zzfkv(new zzfkz());
    }
    catch (Exception paramContext)
    {
      try
      {
        paramString2 = paramString2.instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
        if (paramString2 == null)
        {
          paramString2 = null;
        }
        else
        {
          localIInterface = paramString2.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
          if ((localIInterface instanceof zzfky)) {
            paramString2 = (zzfky)localIInterface;
          } else {
            paramString2 = new zzfkw(paramString2);
          }
        }
      }
      catch (Exception paramContext)
      {
        paramString1 = new com/google/android/gms/internal/ads/zzfjx;
        paramString1.<init>(paramContext);
        throw paramString1;
      }
      try
      {
        paramString2.zze(ObjectWrapper.wrap(paramContext), paramString1, null);
        Log.i("GASS", "GassClearcutLogger Initialized.");
        paramContext = new zzfkv(paramString2);
        return paramContext;
      }
      catch (zzfjx|RemoteException|NullPointerException|SecurityException paramContext)
      {
        Log.d("GASS", "Cannot dynamite load clearcut");
      }
      paramContext = paramContext;
      paramString1 = new com/google/android/gms/internal/ads/zzfjx;
      paramString1.<init>(paramContext);
      throw paramString1;
    }
  }
  
  public static zzfkv zzc()
  {
    zzfkz localzzfkz = new zzfkz();
    Log.d("GASS", "Clearcut logging disabled");
    return new zzfkv(localzzfkz);
  }
  
  public final zzfku zza(byte[] paramArrayOfByte)
  {
    return new zzfku(this, paramArrayOfByte, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */