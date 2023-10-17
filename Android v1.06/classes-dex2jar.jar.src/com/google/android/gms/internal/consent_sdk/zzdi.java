package com.google.android.gms.internal.consent_sdk;

import javax.annotation.CheckForNull;

final class zzdi
  extends zzdf
{
  static final zzdi zza;
  private static final Object[] zzd;
  final transient Object[] zzb;
  final transient Object[] zzc;
  private final transient int zze;
  private final transient int zzf;
  private final transient int zzg;
  
  static
  {
    Object[] arrayOfObject = new Object[0];
    zzd = arrayOfObject;
    zza = new zzdi(arrayOfObject, 0, arrayOfObject, 0, 0);
  }
  
  zzdi(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
  {
    this.zzb = paramArrayOfObject1;
    this.zze = paramInt1;
    this.zzc = paramArrayOfObject2;
    this.zzf = paramInt2;
    this.zzg = paramInt3;
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    Object[] arrayOfObject = this.zzc;
    if ((paramObject != null) && (arrayOfObject.length != 0)) {
      for (int i = zzda.zza(paramObject.hashCode());; i++)
      {
        i &= this.zzf;
        Object localObject = arrayOfObject[i];
        if (localObject == null) {
          return false;
        }
        if (localObject.equals(paramObject)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zze;
  }
  
  public final int size()
  {
    return this.zzg;
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(this.zzb, 0, paramArrayOfObject, 0, this.zzg);
    return this.zzg;
  }
  
  final int zzb()
  {
    return this.zzg;
  }
  
  final int zzc()
  {
    return 0;
  }
  
  public final zzdk zzd()
  {
    return zzg().zzh(0);
  }
  
  final Object[] zze()
  {
    return this.zzb;
  }
  
  final zzde zzh()
  {
    return zzde.zzg(this.zzb, this.zzg);
  }
  
  final boolean zzk()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */