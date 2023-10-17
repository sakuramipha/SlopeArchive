package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class zzgvn
  implements zzgwb, zzgvi
{
  private static final Object zza = new Object();
  private volatile zzgwb zzb;
  private volatile Object zzc = zza;
  
  private zzgvn(zzgwb paramzzgwb)
  {
    this.zzb = paramzzgwb;
  }
  
  public static zzgvi zza(zzgwb paramzzgwb)
  {
    if ((paramzzgwb instanceof zzgvi)) {
      return (zzgvi)paramzzgwb;
    }
    Objects.requireNonNull(paramzzgwb);
    return new zzgvn(paramzzgwb);
  }
  
  public static zzgwb zzc(zzgwb paramzzgwb)
  {
    Objects.requireNonNull(paramzzgwb);
    if ((paramzzgwb instanceof zzgvn)) {
      return paramzzgwb;
    }
    return new zzgvn(paramzzgwb);
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
            localObject4 = new java/lang/IllegalStateException;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("Scoped provider was invoked recursively returning different results: ");
            localStringBuilder.append(localObject3);
            localStringBuilder.append(" & ");
            localStringBuilder.append(localObject1);
            localStringBuilder.append(". This is likely due to a circular dependency.");
            ((IllegalStateException)localObject4).<init>(localStringBuilder.toString());
            throw ((Throwable)localObject4);
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */