package com.google.android.gms.internal.ads;

public final class zzaoz
{
  private final byte[] zza = new byte['Ā'];
  private int zzb;
  private int zzc;
  
  public zzaoz(byte[] paramArrayOfByte)
  {
    for (int j = 0; j < 256; j++) {
      this.zza[j] = ((byte)j);
    }
    j = 0;
    int k = 0;
    while (j < 256)
    {
      byte[] arrayOfByte = this.zza;
      int i = arrayOfByte[j];
      k = k + i + paramArrayOfByte[(j % paramArrayOfByte.length)] & 0xFF;
      arrayOfByte[j] = arrayOfByte[k];
      arrayOfByte[k] = i;
      j++;
    }
    this.zzb = 0;
    this.zzc = 0;
  }
  
  public final void zza(byte[] paramArrayOfByte)
  {
    int m = this.zzb;
    int k = this.zzc;
    for (int j = 0; j < 256; j++)
    {
      byte[] arrayOfByte = this.zza;
      m = m + 1 & 0xFF;
      int i = arrayOfByte[m];
      k = k + i & 0xFF;
      arrayOfByte[m] = arrayOfByte[k];
      arrayOfByte[k] = i;
      int n = paramArrayOfByte[j];
      paramArrayOfByte[j] = ((byte)(arrayOfByte[(arrayOfByte[m] + i & 0xFF)] ^ n));
    }
    this.zzb = m;
    this.zzc = k;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaoz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */