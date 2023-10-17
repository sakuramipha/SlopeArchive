package com.google.android.gms.internal.drive;

final class zzjh
  extends zzjm
{
  private final int zznv;
  private final int zznw;
  
  zzjh(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    zzb(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    this.zznv = paramInt1;
    this.zznw = paramInt2;
  }
  
  public final int size()
  {
    return this.zznw;
  }
  
  protected final int zzbw()
  {
    return this.zznv;
  }
  
  public final byte zzs(int paramInt)
  {
    int i = size();
    if ((i - (paramInt + 1) | paramInt) < 0)
    {
      if (paramInt < 0)
      {
        localStringBuilder = new StringBuilder(22);
        localStringBuilder.append("Index < 0: ");
        localStringBuilder.append(paramInt);
        throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder(40);
      localStringBuilder.append("Index > length: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(", ");
      localStringBuilder.append(i);
      throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
    }
    return this.zzny[(this.zznv + paramInt)];
  }
  
  final byte zzt(int paramInt)
  {
    return this.zzny[(this.zznv + paramInt)];
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */