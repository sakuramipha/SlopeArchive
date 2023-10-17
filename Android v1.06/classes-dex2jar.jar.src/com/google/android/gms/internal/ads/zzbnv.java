package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.lang.reflect.Constructor;

public final class zzbnv
  extends zzbnx
{
  private static final zzbpz zza = new zzbpz();
  
  public final zzbob zzb(String paramString)
    throws RemoteException
  {
    try
    {
      Object localObject1 = Class.forName(paramString, false, zzbnv.class.getClassLoader());
      if (MediationAdapter.class.isAssignableFrom((Class)localObject1))
      {
        localObject4 = (MediationAdapter)((Class)localObject1).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        localObject1 = new com/google/android/gms/internal/ads/zzboy;
        ((zzboy)localObject1).<init>((MediationAdapter)localObject4);
        paramString = (String)localObject1;
      }
      else if (Adapter.class.isAssignableFrom((Class)localObject1))
      {
        localObject1 = new zzboy((Adapter)((Class)localObject1).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        paramString = (String)localObject1;
      }
      else
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Could not instantiate mediation adapter: ");
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append(" (not a valid adapter).");
        zzbzt.zzj(((StringBuilder)localObject1).toString());
        localObject1 = new android/os/RemoteException;
        ((RemoteException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
      label242:
      try
      {
        zzbzt.zze("Reflection failed, retrying using direct instantiation");
        Object localObject3;
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString))
        {
          localObject3 = new com/google/ads/mediation/admob/AdMobAdapter;
          ((AdMobAdapter)localObject3).<init>();
          localObject3 = new zzboy((MediationAdapter)localObject3);
          paramString = (String)localObject3;
        }
        else
        {
          if (!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString)) {
            break label242;
          }
          localObject3 = new com/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
          ((CustomEventAdapter)localObject3).<init>();
          localObject3 = new zzboy((MediationAdapter)localObject3);
          paramString = (String)localObject3;
        }
        return paramString;
      }
      finally
      {
        Object localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append("Could not instantiate mediation adapter: ");
        ((StringBuilder)localObject4).append(paramString);
        ((StringBuilder)localObject4).append(". ");
        zzbzt.zzk(((StringBuilder)localObject4).toString(), localThrowable);
      }
    }
  }
  
  public final zzbpv zzc(String paramString)
    throws RemoteException
  {
    try
    {
      paramString = new zzbqh((RtbAdapter)Class.forName(paramString, false, zzbpz.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
      return paramString;
    }
    finally {}
  }
  
  public final boolean zzd(String paramString)
    throws RemoteException
  {
    try
    {
      boolean bool = Adapter.class.isAssignableFrom(Class.forName(paramString, false, zzbnv.class.getClassLoader()));
      return bool;
    }
    finally
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not load custom event implementation class as Adapter: ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(", assuming old custom event implementation.");
      zzbzt.zzj(localStringBuilder.toString());
    }
    return false;
  }
  
  public final boolean zze(String paramString)
    throws RemoteException
  {
    try
    {
      boolean bool = CustomEvent.class.isAssignableFrom(Class.forName(paramString, false, zzbnv.class.getClassLoader()));
      return bool;
    }
    finally
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not load custom event implementation class: ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(", trying Adapter implementation class.");
      zzbzt.zzj(localStringBuilder.toString());
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */