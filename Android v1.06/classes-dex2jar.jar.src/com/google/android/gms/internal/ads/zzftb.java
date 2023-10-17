package com.google.android.gms.internal.ads;

final class zzftb
  extends zzfrr
{
  static final zzfrr zza = new zzftb(new Object[0], 0);
  final transient Object[] zzb;
  private final transient int zzc;
  
  zzftb(Object[] paramArrayOfObject, int paramInt)
  {
    this.zzb = paramArrayOfObject;
    this.zzc = paramInt;
  }
  
  public final Object get(int paramInt)
  {
    zzfoz.zza(paramInt, this.zzc, "index");
    Object localObject = this.zzb[paramInt];
    localObject.getClass();
    return localObject;
  }
  
  public final int size()
  {
    return this.zzc;
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(this.zzb, 0, paramArrayOfObject, paramInt, this.zzc);
    return paramInt + this.zzc;
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */