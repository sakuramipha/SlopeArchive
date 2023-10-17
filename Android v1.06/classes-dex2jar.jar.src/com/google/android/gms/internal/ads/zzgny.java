package com.google.android.gms.internal.ads;

abstract class zzgny
  extends zzgod
{
  final byte[] zza;
  final int zzb;
  int zzc;
  int zzd;
  
  zzgny(int paramInt)
  {
    super(null);
    if (paramInt >= 0)
    {
      byte[] arrayOfByte = new byte[Math.max(paramInt, 20)];
      this.zza = arrayOfByte;
      this.zzb = arrayOfByte.length;
      return;
    }
    throw new IllegalArgumentException("bufferSize must be >= 0");
  }
  
  public final int zzb()
  {
    throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
  }
  
  final void zzc(byte paramByte)
  {
    byte[] arrayOfByte = this.zza;
    int i = this.zzc;
    this.zzc = (i + 1);
    arrayOfByte[i] = paramByte;
    this.zzd += 1;
  }
  
  final void zzd(int paramInt)
  {
    byte[] arrayOfByte = this.zza;
    int j = this.zzc;
    int i = j + 1;
    this.zzc = i;
    arrayOfByte[j] = ((byte)(paramInt & 0xFF));
    j = i + 1;
    this.zzc = j;
    arrayOfByte[i] = ((byte)(paramInt >> 8 & 0xFF));
    i = j + 1;
    this.zzc = i;
    arrayOfByte[j] = ((byte)(paramInt >> 16 & 0xFF));
    this.zzc = (i + 1);
    arrayOfByte[i] = ((byte)(paramInt >> 24 & 0xFF));
    this.zzd += 4;
  }
  
  final void zze(long paramLong)
  {
    byte[] arrayOfByte = this.zza;
    int j = this.zzc;
    int i = j + 1;
    this.zzc = i;
    arrayOfByte[j] = ((byte)(int)(paramLong & 0xFF));
    j = i + 1;
    this.zzc = j;
    arrayOfByte[i] = ((byte)(int)(paramLong >> 8 & 0xFF));
    i = j + 1;
    this.zzc = i;
    arrayOfByte[j] = ((byte)(int)(paramLong >> 16 & 0xFF));
    j = i + 1;
    this.zzc = j;
    arrayOfByte[i] = ((byte)(int)(0xFF & paramLong >> 24));
    i = j + 1;
    this.zzc = i;
    arrayOfByte[j] = ((byte)((int)(paramLong >> 32) & 0xFF));
    j = i + 1;
    this.zzc = j;
    arrayOfByte[i] = ((byte)((int)(paramLong >> 40) & 0xFF));
    i = j + 1;
    this.zzc = i;
    arrayOfByte[j] = ((byte)((int)(paramLong >> 48) & 0xFF));
    this.zzc = (i + 1);
    arrayOfByte[i] = ((byte)((int)(paramLong >> 56) & 0xFF));
    this.zzd += 8;
  }
  
  final void zzf(int paramInt)
  {
    int i = paramInt;
    byte[] arrayOfByte;
    if (zzgod.zzF())
    {
      long l1 = this.zzc;
      for (;;)
      {
        if ((paramInt & 0xFFFFFF80) == 0)
        {
          arrayOfByte = this.zza;
          i = this.zzc;
          this.zzc = (i + 1);
          zzgsa.zzq(arrayOfByte, i, (byte)paramInt);
          long l2 = this.zzc;
          this.zzd += (int)(l2 - l1);
          return;
        }
        arrayOfByte = this.zza;
        i = this.zzc;
        this.zzc = (i + 1);
        zzgsa.zzq(arrayOfByte, i, (byte)(paramInt & 0x7F | 0x80));
        paramInt >>>= 7;
      }
    }
    for (;;)
    {
      if ((i & 0xFFFFFF80) == 0)
      {
        arrayOfByte = this.zza;
        paramInt = this.zzc;
        this.zzc = (paramInt + 1);
        arrayOfByte[paramInt] = ((byte)i);
        this.zzd += 1;
        return;
      }
      arrayOfByte = this.zza;
      paramInt = this.zzc;
      this.zzc = (paramInt + 1);
      arrayOfByte[paramInt] = ((byte)(i & 0x7F | 0x80));
      this.zzd += 1;
      i >>>= 7;
    }
  }
  
  final void zzg(long paramLong)
  {
    long l = paramLong;
    byte[] arrayOfByte;
    int i;
    if (zzgod.zzF())
    {
      l = this.zzc;
      for (;;)
      {
        if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
        {
          arrayOfByte = this.zza;
          i = this.zzc;
          this.zzc = (i + 1);
          zzgsa.zzq(arrayOfByte, i, (byte)(int)paramLong);
          paramLong = this.zzc;
          this.zzd += (int)(paramLong - l);
          return;
        }
        arrayOfByte = this.zza;
        i = this.zzc;
        this.zzc = (i + 1);
        zzgsa.zzq(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
        paramLong >>>= 7;
      }
    }
    for (;;)
    {
      if ((l & 0xFFFFFFFFFFFFFF80) == 0L)
      {
        arrayOfByte = this.zza;
        i = this.zzc;
        this.zzc = (i + 1);
        arrayOfByte[i] = ((byte)(int)l);
        this.zzd += 1;
        return;
      }
      arrayOfByte = this.zza;
      i = this.zzc;
      this.zzc = (i + 1);
      arrayOfByte[i] = ((byte)((int)l & 0x7F | 0x80));
      this.zzd += 1;
      l >>>= 7;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */