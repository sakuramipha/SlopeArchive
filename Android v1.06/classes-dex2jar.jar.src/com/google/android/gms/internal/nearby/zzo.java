package com.google.android.gms.internal.nearby;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzo
{
  private static final Map<zzn, zzo> zza = new ArrayMap();
  private final Map<String, Set<ListenerHolder.ListenerKey<?>>> zzb = new ArrayMap();
  private final Set<ListenerHolder.ListenerKey<?>> zzc = new ArraySet();
  private final Map<String, Object> zzd = new ArrayMap();
  
  public static zzo zza(GoogleApi<?> paramGoogleApi, Api.ApiOptions paramApiOptions)
  {
    try
    {
      paramApiOptions = new com/google/android/gms/internal/nearby/zzn;
      paramApiOptions.<init>(paramGoogleApi, null);
      paramGoogleApi = zza;
      if (!paramGoogleApi.containsKey(paramApiOptions))
      {
        zzo localzzo = new com/google/android/gms/internal/nearby/zzo;
        localzzo.<init>();
        paramGoogleApi.put(paramApiOptions, localzzo);
      }
      paramGoogleApi = (zzo)paramGoogleApi.get(paramApiOptions);
      return paramGoogleApi;
    }
    finally {}
  }
  
  private final Object zzh(String paramString)
  {
    if (!this.zzd.containsKey(paramString)) {
      this.zzd.put(paramString, new Object());
    }
    return this.zzd.get(paramString);
  }
  
  public final <T> ListenerHolder<T> zzb(GoogleApi paramGoogleApi, T paramT, String paramString)
  {
    try
    {
      ListenerHolder localListenerHolder = paramGoogleApi.registerListener(paramT, paramString);
      ListenerHolder.ListenerKey localListenerKey = (ListenerHolder.ListenerKey)Preconditions.checkNotNull(localListenerHolder.getListenerKey(), "Key must not be null");
      paramT = (Set)this.zzb.get(paramString);
      paramGoogleApi = paramT;
      if (paramT == null)
      {
        paramGoogleApi = new androidx/collection/ArraySet;
        paramGoogleApi.<init>();
        this.zzb.put(paramString, paramGoogleApi);
      }
      paramGoogleApi.add(localListenerKey);
      return localListenerHolder;
    }
    finally {}
  }
  
  public final ListenerHolder<Object> zzc(GoogleApi<?> paramGoogleApi, String paramString1, String paramString2)
  {
    try
    {
      paramGoogleApi = zzb(paramGoogleApi, zzh(paramString1), "connection");
      return paramGoogleApi;
    }
    finally
    {
      paramGoogleApi = finally;
      throw paramGoogleApi;
    }
  }
  
  public final ListenerHolder.ListenerKey<Object> zzd(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = ListenerHolders.createListenerKey(zzh(paramString1), "connection");
      return paramString1;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final Task<Void> zze(GoogleApi<?> paramGoogleApi, RegistrationMethods<?, ?> paramRegistrationMethods)
  {
    try
    {
      ListenerHolder.ListenerKey localListenerKey = (ListenerHolder.ListenerKey)Preconditions.checkNotNull(paramRegistrationMethods.register.getListenerKey(), "Key must not be null");
      this.zzc.add(localListenerKey);
      paramRegistrationMethods = paramGoogleApi.doRegisterEventListener(paramRegistrationMethods);
      zzm localzzm = new com/google/android/gms/internal/nearby/zzm;
      localzzm.<init>(this, paramGoogleApi, localListenerKey);
      paramGoogleApi = paramRegistrationMethods.addOnFailureListener(localzzm);
      return paramGoogleApi;
    }
    finally
    {
      paramGoogleApi = finally;
      throw paramGoogleApi;
    }
  }
  
  public final Task<Boolean> zzf(GoogleApi<?> paramGoogleApi, ListenerHolder.ListenerKey<?> paramListenerKey)
  {
    try
    {
      this.zzc.remove(paramListenerKey);
      Iterator localIterator = this.zzb.keySet().iterator();
      Object localObject;
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localObject = (Set)this.zzb.get(str);
        if (((Set)localObject).contains(paramListenerKey))
        {
          ((Set)localObject).remove(paramListenerKey);
          break label90;
        }
      }
      String str = null;
      label90:
      if (str != null)
      {
        localIterator = this.zzd.entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          if (ListenerHolders.createListenerKey(((Map.Entry)localObject).getValue(), str).equals(paramListenerKey)) {
            this.zzd.remove(((Map.Entry)localObject).getKey());
          }
        }
      }
      paramGoogleApi = paramGoogleApi.doUnregisterEventListener(paramListenerKey);
      return paramGoogleApi;
    }
    finally {}
  }
  
  public final Task<Void> zzg(GoogleApi<?> paramGoogleApi, String paramString)
  {
    try
    {
      ArraySet localArraySet = new androidx/collection/ArraySet;
      localArraySet.<init>();
      Object localObject2 = (Set)this.zzb.get(paramString);
      if (localObject2 == null)
      {
        paramGoogleApi = Tasks.whenAll(localArraySet);
        return paramGoogleApi;
      }
      Object localObject1 = new androidx/collection/ArraySet;
      ((ArraySet)localObject1).<init>((Collection)localObject2);
      localObject2 = ((ArraySet)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (ListenerHolder.ListenerKey)((Iterator)localObject2).next();
        if (this.zzc.contains(localObject1)) {
          localArraySet.add(zzf(paramGoogleApi, (ListenerHolder.ListenerKey)localObject1));
        }
      }
      this.zzb.remove(paramString);
      paramGoogleApi = Tasks.whenAll(localArraySet);
      return paramGoogleApi;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */