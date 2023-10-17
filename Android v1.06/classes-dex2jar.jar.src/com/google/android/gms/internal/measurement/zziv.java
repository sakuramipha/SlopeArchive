package com.google.android.gms.internal.measurement;

final class zziv
  extends zziy
{
  private final int zzc;
  
  zziv(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    zzj(0, paramInt2, paramArrayOfByte.length);
    this.zzc = paramInt2;
  }
  
  public final byte zza(int paramInt)
  {
    int i = this.zzc;
    if ((i - (paramInt + 1) | paramInt) < 0)
    {
      if (paramInt < 0)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Index < 0: ");
        localStringBuilder.append(paramInt);
        throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Index > length: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(", ");
      localStringBuilder.append(i);
      throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
    }
    return this.zza[paramInt];
  }
  
  final byte zzb(int paramInt)
  {
    return this.zza[paramInt];
  }
  
  protected final int zzc()
  {
    return 0;
  }
  
  public final int zzd()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zziv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */