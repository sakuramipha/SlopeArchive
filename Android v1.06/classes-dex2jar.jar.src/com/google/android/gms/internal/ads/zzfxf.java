package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

final class zzfxf
{
  private static final Logger zza = Logger.getLogger(zzfxf.class.getName());
  private final ConcurrentMap zzb;
  
  zzfxf()
  {
    this.zzb = new ConcurrentHashMap();
  }
  
  zzfxf(zzfxf paramzzfxf)
  {
    this.zzb = new ConcurrentHashMap(paramzzfxf.zzb);
  }
  
  private final zzfxe zze(String paramString)
    throws GeneralSecurityException
  {
    try
    {
      if (this.zzb.containsKey(paramString))
      {
        paramString = (zzfxe)this.zzb.get(paramString);
        return paramString;
      }
      paramString = String.valueOf(paramString);
      GeneralSecurityException localGeneralSecurityException = new java/security/GeneralSecurityException;
      localGeneralSecurityException.<init>("No key manager found for key type ".concat(paramString));
      throw localGeneralSecurityException;
    }
    finally {}
  }
  
  private final void zzf(zzfxe paramzzfxe, boolean paramBoolean)
    throws GeneralSecurityException
  {
    try
    {
      String str = paramzzfxe.zza().zzc();
      zzfxe localzzfxe = (zzfxe)this.zzb.get(str);
      if ((localzzfxe != null) && (!localzzfxe.zza.getClass().equals(paramzzfxe.zza.getClass())))
      {
        Object localObject = "Attempted overwrite of a registered key manager for key type ".concat(str);
        zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", (String)localObject);
        localObject = new java/security/GeneralSecurityException;
        ((GeneralSecurityException)localObject).<init>(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[] { str, localzzfxe.zza.getClass().getName(), paramzzfxe.zza.getClass().getName() }));
        throw ((Throwable)localObject);
      }
      this.zzb.putIfAbsent(str, paramzzfxe);
      return;
    }
    finally {}
  }
  
  final zzfxc zza(String paramString, Class paramClass)
    throws GeneralSecurityException
  {
    Object localObject1 = zze(paramString);
    if (((zzfxe)localObject1).zza.zzl().contains(paramClass)) {
      try
      {
        paramString = new zzfxd(((zzfxe)localObject1).zza, paramClass);
        return paramString;
      }
      catch (IllegalArgumentException paramString)
      {
        throw new GeneralSecurityException("Primitive type not supported", paramString);
      }
    }
    paramClass = paramClass.getName();
    paramString = String.valueOf(((zzfxe)localObject1).zza.getClass());
    Object localObject2 = ((zzfxe)localObject1).zza.zzl();
    localObject1 = new StringBuilder();
    localObject2 = ((Set)localObject2).iterator();
    for (int i = 1; ((Iterator)localObject2).hasNext(); i = 0)
    {
      Class localClass = (Class)((Iterator)localObject2).next();
      if (i == 0) {
        ((StringBuilder)localObject1).append(", ");
      }
      ((StringBuilder)localObject1).append(localClass.getCanonicalName());
    }
    localObject2 = ((StringBuilder)localObject1).toString();
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Primitive type ");
    ((StringBuilder)localObject1).append(paramClass);
    ((StringBuilder)localObject1).append(" not supported by key manager of type ");
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append(", supported primitives: ");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new GeneralSecurityException(((StringBuilder)localObject1).toString());
  }
  
  final zzfxc zzb(String paramString)
    throws GeneralSecurityException
  {
    return zze(paramString).zza();
  }
  
  final void zzc(zzgdh paramzzgdh)
    throws GeneralSecurityException
  {
    try
    {
      if (zzgcv.zza(paramzzgdh.zzf()))
      {
        localObject = new com/google/android/gms/internal/ads/zzfxe;
        ((zzfxe)localObject).<init>(paramzzgdh);
        zzf((zzfxe)localObject, false);
        return;
      }
      Object localObject = paramzzgdh.getClass();
      paramzzgdh = new java/security/GeneralSecurityException;
      String str = String.valueOf(localObject);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("failed to register key manager ");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(" as it is not FIPS compatible.");
      paramzzgdh.<init>(((StringBuilder)localObject).toString());
      throw paramzzgdh;
    }
    finally {}
  }
  
  final boolean zzd(String paramString)
  {
    return this.zzb.containsKey(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfxf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */