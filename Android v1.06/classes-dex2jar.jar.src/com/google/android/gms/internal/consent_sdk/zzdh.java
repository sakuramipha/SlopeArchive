package com.google.android.gms.internal.consent_sdk;

final class zzdh
  extends zzde
{
  static final zzde zza = new zzdh(new Object[0], 0);
  final transient Object[] zzb;
  private final transient int zzc;
  
  zzdh(Object[] paramArrayOfObject, int paramInt)
  {
    this.zzb = paramArrayOfObject;
    this.zzc = paramInt;
  }
  
  public final Object get(int paramInt)
  {
    zzcx.zza(paramInt, this.zzc, "index");
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
  
  final Object[] zze()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzdh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */