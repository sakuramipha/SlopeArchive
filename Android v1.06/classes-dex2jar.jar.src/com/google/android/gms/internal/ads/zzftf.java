package com.google.android.gms.internal.ads;

final class zzftf
  extends zzfrr
{
  private final transient Object[] zza;
  private final transient int zzb;
  private final transient int zzc;
  
  zzftf(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    this.zza = paramArrayOfObject;
    this.zzb = paramInt1;
    this.zzc = paramInt2;
  }
  
  public final Object get(int paramInt)
  {
    zzfoz.zza(paramInt, this.zzc, "index");
    Object localObject = this.zza[(paramInt + paramInt + this.zzb)];
    localObject.getClass();
    return localObject;
  }
  
  public final int size()
  {
    return this.zzc;
  }
  
  final boolean zzf()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */