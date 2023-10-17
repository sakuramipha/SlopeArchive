package com.google.android.gms.internal.drive;

final class zzjk
{
  private final byte[] buffer;
  private final zzjr zznx;
  
  private zzjk(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.buffer = arrayOfByte;
    this.zznx = zzjr.zzb(arrayOfByte);
  }
  
  public final zzjc zzbx()
  {
    this.zznx.zzcb();
    return new zzjm(this.buffer);
  }
  
  public final zzjr zzby()
  {
    return this.zznx;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */