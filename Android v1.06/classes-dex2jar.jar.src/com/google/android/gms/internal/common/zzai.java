package com.google.android.gms.internal.common;

final class zzai<E>
  extends zzag<E>
{
  static final zzag<Object> zza = new zzai(new Object[0], 0);
  final transient Object[] zzb;
  private final transient int zzc;
  
  zzai(Object[] paramArrayOfObject, int paramInt)
  {
    this.zzb = paramArrayOfObject;
    this.zzc = paramInt;
  }
  
  public final E get(int paramInt)
  {
    zzs.zza(paramInt, this.zzc, "index");
    Object localObject = this.zzb[paramInt];
    localObject.getClass();
    return (E)localObject;
  }
  
  public final int size()
  {
    return this.zzc;
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(this.zzb, 0, paramArrayOfObject, 0, this.zzc);
    return this.zzc;
  }
  
  final int zzb()
  {
    return this.zzc;
  }
  
  final int zzc()
  {
    return 0;
  }
  
  final boolean zzf()
  {
    return false;
  }
  
  final Object[] zzg()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */