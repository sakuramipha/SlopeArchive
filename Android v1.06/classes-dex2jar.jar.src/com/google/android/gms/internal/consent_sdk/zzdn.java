package com.google.android.gms.internal.consent_sdk;

public final class zzdn
  implements zzdr
{
  private static final Object zza = new Object();
  private volatile zzdr zzb;
  private volatile Object zzc = zza;
  
  private zzdn(zzdr paramzzdr)
  {
    this.zzb = paramzzdr;
  }
  
  public static zzdr zza(zzdr paramzzdr)
  {
    if ((paramzzdr instanceof zzdn)) {
      return paramzzdr;
    }
    return new zzdn(paramzzdr);
  }
  
  public final Object zzb()
  {
    Object localObject3 = this.zzc;
    Object localObject4 = zza;
    Object localObject1 = localObject3;
    if (localObject3 == localObject4) {
      try
      {
        localObject3 = this.zzc;
        localObject1 = localObject3;
        if (localObject3 == localObject4)
        {
          localObject1 = this.zzb.zzb();
          localObject3 = this.zzc;
          if ((localObject3 != localObject4) && (localObject3 != localObject1))
          {
            IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append("Scoped provider was invoked recursively returning different results: ");
            ((StringBuilder)localObject4).append(localObject3);
            ((StringBuilder)localObject4).append(" & ");
            ((StringBuilder)localObject4).append(localObject1);
            ((StringBuilder)localObject4).append(". This is likely due to a circular dependency.");
            localIllegalStateException.<init>(((StringBuilder)localObject4).toString());
            throw localIllegalStateException;
          }
          this.zzc = localObject1;
          this.zzb = null;
        }
      }
      finally {}
    }
    return localObject2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */