package com.google.android.gms.internal.ads;

final class zzgnh
  extends zzgnk
{
  private final int zzc;
  private final int zzd;
  
  zzgnh(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    zzq(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    this.zzc = paramInt1;
    this.zzd = paramInt2;
  }
  
  public final byte zza(int paramInt)
  {
    zzy(paramInt, this.zzd);
    return this.zza[(this.zzc + paramInt)];
  }
  
  final byte zzb(int paramInt)
  {
    return this.zza[(this.zzc + paramInt)];
  }
  
  protected final int zzc()
  {
    return this.zzc;
  }
  
  public final int zzd()
  {
    return this.zzd;
  }
  
  protected final void zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.zza, this.zzc + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgnh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */