package com.google.android.gms.internal.drive;

final class zzjq
  extends zzjo
{
  private final byte[] buffer;
  private int limit;
  private int pos;
  private final boolean zzoc;
  private int zzod;
  private int zzoe;
  private int zzof = Integer.MAX_VALUE;
  
  private zzjq(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(null);
    this.buffer = paramArrayOfByte;
    this.limit = (paramInt2 + paramInt1);
    this.pos = paramInt1;
    this.zzoe = paramInt1;
    this.zzoc = paramBoolean;
  }
  
  public final int zzbz()
  {
    return this.pos - this.zzoe;
  }
  
  public final int zzv(int paramInt)
    throws zzkq
  {
    if (paramInt >= 0)
    {
      int k = paramInt + zzbz();
      paramInt = this.zzof;
      if (k <= paramInt)
      {
        this.zzof = k;
        int i = this.limit + this.zzod;
        this.limit = i;
        int j = i - this.zzoe;
        if (j > k)
        {
          j -= k;
          this.zzod = j;
          this.limit = (i - j);
        }
        else
        {
          this.zzod = 0;
        }
        return paramInt;
      }
      throw zzkq.zzdi();
    }
    throw zzkq.zzdj();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */