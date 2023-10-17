package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

public final class zzamx
  extends zzgux
{
  private Date zza;
  private Date zzh;
  private long zzi;
  private long zzj;
  private double zzk = 1.0D;
  private float zzl = 1.0F;
  private zzgvh zzm = zzgvh.zza;
  private long zzn;
  
  public zzamx()
  {
    super("mvhd");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MovieHeaderBox[creationTime=");
    localStringBuilder.append(this.zza);
    localStringBuilder.append(";modificationTime=");
    localStringBuilder.append(this.zzh);
    localStringBuilder.append(";timescale=");
    localStringBuilder.append(this.zzi);
    localStringBuilder.append(";duration=");
    localStringBuilder.append(this.zzj);
    localStringBuilder.append(";rate=");
    localStringBuilder.append(this.zzk);
    localStringBuilder.append(";volume=");
    localStringBuilder.append(this.zzl);
    localStringBuilder.append(";matrix=");
    localStringBuilder.append(this.zzm);
    localStringBuilder.append(";nextTrackId=");
    localStringBuilder.append(this.zzn);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final long zzd()
  {
    return this.zzj;
  }
  
  public final long zze()
  {
    return this.zzi;
  }
  
  public final void zzf(ByteBuffer paramByteBuffer)
  {
    zzi(paramByteBuffer);
    if (zzh() == 1)
    {
      this.zza = zzgvc.zza(zzamt.zzf(paramByteBuffer));
      this.zzh = zzgvc.zza(zzamt.zzf(paramByteBuffer));
      this.zzi = zzamt.zze(paramByteBuffer);
      this.zzj = zzamt.zzf(paramByteBuffer);
    }
    else
    {
      this.zza = zzgvc.zza(zzamt.zze(paramByteBuffer));
      this.zzh = zzgvc.zza(zzamt.zze(paramByteBuffer));
      this.zzi = zzamt.zze(paramByteBuffer);
      this.zzj = zzamt.zze(paramByteBuffer);
    }
    this.zzk = zzamt.zzb(paramByteBuffer);
    byte[] arrayOfByte = new byte[2];
    paramByteBuffer.get(arrayOfByte);
    int i = arrayOfByte[0];
    this.zzl = ((short)(arrayOfByte[1] & 0xFF | (short)(0xFF00 & i << 8)) / 256.0F);
    zzamt.zzd(paramByteBuffer);
    zzamt.zze(paramByteBuffer);
    zzamt.zze(paramByteBuffer);
    double d3 = zzamt.zzb(paramByteBuffer);
    double d7 = zzamt.zzb(paramByteBuffer);
    double d8 = zzamt.zza(paramByteBuffer);
    double d6 = zzamt.zzb(paramByteBuffer);
    double d1 = zzamt.zzb(paramByteBuffer);
    double d4 = zzamt.zza(paramByteBuffer);
    double d5 = zzamt.zzb(paramByteBuffer);
    double d2 = zzamt.zzb(paramByteBuffer);
    this.zzm = new zzgvh(d3, d7, d6, d1, d8, d4, zzamt.zza(paramByteBuffer), d5, d2);
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    this.zzn = zzamt.zze(paramByteBuffer);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzamx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */