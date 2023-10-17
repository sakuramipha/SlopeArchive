package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

public final class zzgek
{
  private final Map zza;
  private final Map zzb;
  
  public final Class zza(Class paramClass)
    throws GeneralSecurityException
  {
    if (this.zzb.containsKey(paramClass)) {
      return ((zzfyb)this.zzb.get(paramClass)).zza();
    }
    paramClass = paramClass.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("No input primitive class for ");
    localStringBuilder.append(paramClass);
    localStringBuilder.append(" available");
    throw new GeneralSecurityException(localStringBuilder.toString());
  }
  
  public final Object zzb(zzfxb paramzzfxb, Class paramClass)
    throws GeneralSecurityException
  {
    paramClass = new zzgei(paramzzfxb.getClass(), paramClass, null);
    if (this.zza.containsKey(paramClass)) {
      return ((zzgee)this.zza.get(paramClass)).zza(paramzzfxb);
    }
    paramzzfxb = paramClass.toString();
    paramClass = new StringBuilder();
    paramClass.append("No PrimitiveConstructor for ");
    paramClass.append(paramzzfxb);
    paramClass.append(" available");
    throw new GeneralSecurityException(paramClass.toString());
  }
  
  public final Object zzc(zzfya paramzzfya, Class paramClass)
    throws GeneralSecurityException
  {
    if (this.zzb.containsKey(paramClass))
    {
      paramClass = (zzfyb)this.zzb.get(paramClass);
      if ((paramzzfya.zzc().equals(paramClass.zza())) && (paramClass.zza().equals(paramzzfya.zzc()))) {
        return paramClass.zzc(paramzzfya);
      }
      throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
    throw new GeneralSecurityException("No wrapper found for ".concat(paramClass.toString()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */