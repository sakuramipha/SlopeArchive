package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

final class zzfth
  extends zzfrw
{
  static final zzfth zza;
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
    zza = new zzfth(arrayOfObject, 0, arrayOfObject, 0, 0);
  }
  
  zzfth(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
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
      for (int i = zzfrj.zzb(paramObject);; i++)
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
    System.arraycopy(this.zzb, 0, paramArrayOfObject, paramInt, this.zzg);
    return paramInt + this.zzg;
  }
  
  final int zzb()
  {
    return this.zzg;
  }
  
  final int zzc()
  {
    return 0;
  }
  
  public final zzftr zze()
  {
    return zzd().zzr(0);
  }
  
  final boolean zzf()
  {
    throw null;
  }
  
  final Object[] zzg()
  {
    return this.zzb;
  }
  
  final zzfrr zzi()
  {
    return zzfrr.zzi(this.zzb, this.zzg);
  }
  
  final boolean zzr()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */