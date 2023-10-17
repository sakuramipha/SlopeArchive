package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Iterator;

final class zzgpj
  extends InputStream
{
  private Iterator zza;
  private ByteBuffer zzb;
  private int zzc;
  private int zzd;
  private int zze;
  private boolean zzf;
  private byte[] zzg;
  private int zzh;
  private long zzi;
  
  zzgpj(Iterable paramIterable)
  {
    this.zza = paramIterable.iterator();
    this.zzc = 0;
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      paramIterable = (ByteBuffer)localIterator.next();
      this.zzc += 1;
    }
    this.zzd = -1;
    if (!zzb())
    {
      this.zzb = zzgpg.zze;
      this.zzd = 0;
      this.zze = 0;
      this.zzi = 0L;
    }
  }
  
  private final void zza(int paramInt)
  {
    paramInt = this.zze + paramInt;
    this.zze = paramInt;
    if (paramInt == this.zzb.limit()) {
      zzb();
    }
  }
  
  private final boolean zzb()
  {
    this.zzd += 1;
    if (!this.zza.hasNext()) {
      return false;
    }
    ByteBuffer localByteBuffer = (ByteBuffer)this.zza.next();
    this.zzb = localByteBuffer;
    this.zze = localByteBuffer.position();
    if (this.zzb.hasArray())
    {
      this.zzf = true;
      this.zzg = this.zzb.array();
      this.zzh = this.zzb.arrayOffset();
    }
    else
    {
      this.zzf = false;
      this.zzi = zzgsa.zze(this.zzb);
      this.zzg = null;
    }
    return true;
  }
  
  public final int read()
    throws IOException
  {
    if (this.zzd == this.zzc) {
      return -1;
    }
    if (this.zzf)
    {
      i = this.zzg[(this.zze + this.zzh)];
      zza(1);
      return i & 0xFF;
    }
    int i = zzgsa.zza(this.zze + this.zzi);
    zza(1);
    return i & 0xFF;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (this.zzd == this.zzc) {
      return -1;
    }
    int i = this.zzb.limit();
    int k = this.zze;
    int j = i - k;
    i = paramInt2;
    if (paramInt2 > j) {
      i = j;
    }
    if (this.zzf)
    {
      System.arraycopy(this.zzg, k + this.zzh, paramArrayOfByte, paramInt1, i);
      zza(i);
    }
    else
    {
      paramInt2 = this.zzb.position();
      this.zzb.position(this.zze);
      this.zzb.get(paramArrayOfByte, paramInt1, i);
      this.zzb.position(paramInt2);
      zza(i);
    }
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */