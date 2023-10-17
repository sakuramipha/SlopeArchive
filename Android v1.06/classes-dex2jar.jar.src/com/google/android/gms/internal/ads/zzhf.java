package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo;
import java.util.Objects;

public final class zzhf
{
  public byte[] zza;
  public byte[] zzb;
  public int zzc;
  public int[] zzd;
  public int[] zze;
  public int zzf;
  public int zzg;
  public int zzh;
  private final MediaCodec.CryptoInfo zzi;
  private final zzhe zzj;
  
  public zzhf()
  {
    MediaCodec.CryptoInfo localCryptoInfo = new MediaCodec.CryptoInfo();
    this.zzi = localCryptoInfo;
    int i = zzfn.zza;
    zzhe localzzhe = null;
    if (i >= 24) {
      localzzhe = new zzhe(localCryptoInfo, null);
    }
    this.zzj = localzzhe;
  }
  
  public final MediaCodec.CryptoInfo zza()
  {
    return this.zzi;
  }
  
  public final void zzb(int paramInt)
  {
    if (paramInt == 0) {
      return;
    }
    if (this.zzd == null)
    {
      arrayOfInt = new int[1];
      this.zzd = arrayOfInt;
      this.zzi.numBytesOfClearData = arrayOfInt;
    }
    int[] arrayOfInt = this.zzd;
    arrayOfInt[0] += paramInt;
  }
  
  public final void zzc(int paramInt1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, int paramInt4)
  {
    this.zzf = paramInt1;
    this.zzd = paramArrayOfInt1;
    this.zze = paramArrayOfInt2;
    this.zzb = paramArrayOfByte1;
    this.zza = paramArrayOfByte2;
    this.zzc = paramInt2;
    this.zzg = paramInt3;
    this.zzh = paramInt4;
    this.zzi.numSubSamples = paramInt1;
    this.zzi.numBytesOfClearData = paramArrayOfInt1;
    this.zzi.numBytesOfEncryptedData = paramArrayOfInt2;
    this.zzi.key = paramArrayOfByte1;
    this.zzi.iv = paramArrayOfByte2;
    this.zzi.mode = paramInt2;
    if (zzfn.zza >= 24)
    {
      paramArrayOfInt1 = this.zzj;
      Objects.requireNonNull(paramArrayOfInt1);
      zzhe.zza(paramArrayOfInt1, paramInt3, paramInt4);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */