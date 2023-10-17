package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.annotation.Nullable;

public final class zzfyd
{
  public static final int zza = 0;
  private static final Logger zzb = Logger.getLogger(zzfyd.class.getName());
  private static final AtomicReference zzc = new AtomicReference(new zzfxf());
  private static final ConcurrentMap zzd = new ConcurrentHashMap();
  private static final ConcurrentMap zze = new ConcurrentHashMap();
  private static final ConcurrentMap zzf = new ConcurrentHashMap();
  private static final ConcurrentMap zzg = new ConcurrentHashMap();
  
  public static zzgju zza(zzgjz paramzzgjz)
    throws GeneralSecurityException
  {
    try
    {
      Object localObject = paramzzgjz.zzg();
      localObject = ((zzfxf)zzc.get()).zzb((String)localObject);
      if (((Boolean)zze.get(paramzzgjz.zzg())).booleanValue())
      {
        paramzzgjz = ((zzfxc)localObject).zza(paramzzgjz.zzf());
        return paramzzgjz;
      }
      localObject = new java/security/GeneralSecurityException;
      ((GeneralSecurityException)localObject).<init>("newKey-operation not permitted for key type ".concat(String.valueOf(paramzzgjz.zzg())));
      throw ((Throwable)localObject);
    }
    finally {}
  }
  
  @Nullable
  public static Class zzb(Class paramClass)
  {
    try
    {
      paramClass = zzgdr.zza().zzb(paramClass);
      return paramClass;
    }
    catch (GeneralSecurityException paramClass) {}
    return null;
  }
  
  public static Object zzc(String paramString, zzgno paramzzgno, Class paramClass)
    throws GeneralSecurityException
  {
    return ((zzfxf)zzc.get()).zza(paramString, paramClass).zzb(paramzzgno);
  }
  
  static Map zzd()
  {
    try
    {
      Map localMap = Collections.unmodifiableMap(zzg);
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void zze(zzgdh paramzzgdh, boolean paramBoolean)
    throws GeneralSecurityException
  {
    try
    {
      zzfxf localzzfxf = new com/google/android/gms/internal/ads/zzfxf;
      Object localObject2 = zzc;
      localzzfxf.<init>((zzfxf)((AtomicReference)localObject2).get());
      localzzfxf.zzc(paramzzgdh);
      Object localObject1 = paramzzgdh.zza().zzc();
      String str = paramzzgdh.zzd();
      zzg(str, (Map)localObject1, true);
      if (!((zzfxf)((AtomicReference)localObject2).get()).zzd(str))
      {
        localObject1 = zzd;
        localObject2 = new com/google/android/gms/internal/ads/zzfyc;
        ((zzfyc)localObject2).<init>(paramzzgdh);
        ((ConcurrentMap)localObject1).put(str, localObject2);
        localObject1 = paramzzgdh.zza().zzc().entrySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramzzgdh = (Map.Entry)((Iterator)localObject1).next();
          zzg.put((String)paramzzgdh.getKey(), zzfxh.zzb(str, ((zzgdf)paramzzgdh.getValue()).zza.zzax(), ((zzgdf)paramzzgdh.getValue()).zzb));
        }
      }
      zze.put(str, Boolean.valueOf(true));
      zzc.set(localzzfxf);
      return;
    }
    finally {}
  }
  
  public static void zzf(zzfyb paramzzfyb)
    throws GeneralSecurityException
  {
    try
    {
      zzgdr.zza().zzf(paramzzfyb);
      return;
    }
    finally
    {
      paramzzfyb = finally;
      throw paramzzfyb;
    }
  }
  
  private static void zzg(String paramString, Map paramMap, boolean paramBoolean)
    throws GeneralSecurityException
  {
    try
    {
      Object localObject = zze;
      if ((((ConcurrentMap)localObject).containsKey(paramString)) && (!((Boolean)((ConcurrentMap)localObject).get(paramString)).booleanValue()))
      {
        paramString = "New keys are already disallowed for key type ".concat(paramString);
        paramMap = new java/security/GeneralSecurityException;
        paramMap.<init>(paramString);
        throw paramMap;
      }
      if (((zzfxf)zzc.get()).zzd(paramString))
      {
        paramMap = paramMap.entrySet().iterator();
        do
        {
          if (!paramMap.hasNext()) {
            break;
          }
          localObject = (Map.Entry)paramMap.next();
        } while (zzg.containsKey(((Map.Entry)localObject).getKey()));
        paramMap = new java/security/GeneralSecurityException;
        localObject = (String)((Map.Entry)localObject).getKey();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Attempted to register a new key template ");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(" from an existing key manager of type ");
        localStringBuilder.append(paramString);
        paramMap.<init>(localStringBuilder.toString());
        throw paramMap;
      }
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        paramString = (Map.Entry)paramMap.next();
        if (zzg.containsKey(paramString.getKey()))
        {
          paramMap = new java/security/GeneralSecurityException;
          paramMap.<init>("Attempted overwrite of a registered key template ".concat(String.valueOf((String)paramString.getKey())));
          throw paramMap;
        }
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfyd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */