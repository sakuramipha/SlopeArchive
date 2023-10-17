package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzk
  extends zzi
{
  private static final WeakReference<byte[]> zza = new WeakReference(null);
  private WeakReference<byte[]> zzb = zza;
  
  zzk(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  protected abstract byte[] zzb();
  
  final byte[] zzf()
  {
    try
    {
      Object localObject3 = (byte[])this.zzb.get();
      Object localObject1 = localObject3;
      if (localObject3 == null)
      {
        localObject1 = zzb();
        localObject3 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject3).<init>(localObject1);
        this.zzb = ((WeakReference)localObject3);
      }
      return (byte[])localObject1;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */