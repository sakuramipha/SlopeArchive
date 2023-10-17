package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzd
  extends Fragment
  implements LifecycleFragment
{
  private static final WeakHashMap<FragmentActivity, WeakReference<zzd>> zza = new WeakHashMap();
  private final Map<String, LifecycleCallback> zzb = Collections.synchronizedMap(new ArrayMap());
  private int zzc = 0;
  private Bundle zzd;
  
  public static zzd zzc(FragmentActivity paramFragmentActivity)
  {
    WeakHashMap localWeakHashMap = zza;
    Object localObject = (WeakReference)localWeakHashMap.get(paramFragmentActivity);
    if (localObject != null)
    {
      localObject = (zzd)((WeakReference)localObject).get();
      if (localObject != null) {
        return (zzd)localObject;
      }
    }
    try
    {
      zzd localzzd = (zzd)paramFragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
      if (localzzd != null)
      {
        localObject = localzzd;
        if (!localzzd.isRemoving()) {}
      }
      else
      {
        localObject = new zzd();
        paramFragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment)localObject, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
      }
      localWeakHashMap.put(paramFragmentActivity, new WeakReference(localObject));
      return (zzd)localObject;
    }
    catch (ClassCastException paramFragmentActivity)
    {
      throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", paramFragmentActivity);
    }
  }
  
  public final void addCallback(String paramString, LifecycleCallback paramLifecycleCallback)
  {
    if (!this.zzb.containsKey(paramString))
    {
      this.zzb.put(paramString, paramLifecycleCallback);
      if (this.zzc > 0) {
        new zzi(Looper.getMainLooper()).post(new zzc(this, paramLifecycleCallback, paramString));
      }
      return;
    }
    paramLifecycleCallback = new StringBuilder(String.valueOf(paramString).length() + 59);
    paramLifecycleCallback.append("LifecycleCallback with tag ");
    paramLifecycleCallback.append(paramString);
    paramLifecycleCallback.append(" already added to this fragment.");
    throw new IllegalArgumentException(paramLifecycleCallback.toString());
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = this.zzb.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final <T extends LifecycleCallback> T getCallbackOrNull(String paramString, Class<T> paramClass)
  {
    return (LifecycleCallback)paramClass.cast(this.zzb.get(paramString));
  }
  
  public final boolean isCreated()
  {
    return this.zzc > 0;
  }
  
  public final boolean isStarted()
  {
    return this.zzc >= 2;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = this.zzb.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.zzc = 1;
    this.zzd = paramBundle;
    Iterator localIterator = this.zzb.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      LifecycleCallback localLifecycleCallback = (LifecycleCallback)((Map.Entry)localObject).getValue();
      if (paramBundle != null) {
        localObject = paramBundle.getBundle((String)((Map.Entry)localObject).getKey());
      } else {
        localObject = null;
      }
      localLifecycleCallback.onCreate((Bundle)localObject);
    }
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    this.zzc = 5;
    Iterator localIterator = this.zzb.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).onDestroy();
    }
  }
  
  public final void onResume()
  {
    super.onResume();
    this.zzc = 3;
    Iterator localIterator = this.zzb.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).onResume();
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (paramBundle == null) {
      return;
    }
    Iterator localIterator = this.zzb.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Bundle localBundle = new Bundle();
      ((LifecycleCallback)localEntry.getValue()).onSaveInstanceState(localBundle);
      paramBundle.putBundle((String)localEntry.getKey(), localBundle);
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    this.zzc = 2;
    Iterator localIterator = this.zzb.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).onStart();
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    this.zzc = 4;
    Iterator localIterator = this.zzb.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).onStop();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */