package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzjr
  extends zzjb
{
  private static final Logger logger = Logger.getLogger(zzjr.class.getName());
  private static final boolean zzog = zznd.zzfd();
  zzjt zzoh;
  
  public static int zza(int paramInt, zzkx paramzzkx)
  {
    paramInt = zzab(paramInt);
    int i = paramzzkx.zzcx();
    return paramInt + (zzad(i) + i);
  }
  
  public static int zza(zzkx paramzzkx)
  {
    int i = paramzzkx.zzcx();
    return zzad(i) + i;
  }
  
  static int zza(zzlq paramzzlq, zzmf paramzzmf)
  {
    paramzzlq = (zzit)paramzzlq;
    int j = paramzzlq.zzbm();
    int i = j;
    if (j == -1)
    {
      i = paramzzmf.zzn(paramzzlq);
      paramzzlq.zzo(i);
    }
    return zzad(i) + i;
  }
  
  public static int zzab(int paramInt)
  {
    return zzad(paramInt << 3);
  }
  
  public static int zzac(int paramInt)
  {
    if (paramInt >= 0) {
      return zzad(paramInt);
    }
    return 10;
  }
  
  public static int zzad(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((paramInt & 0xF0000000) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int zzae(int paramInt)
  {
    return zzad(zzai(paramInt));
  }
  
  public static int zzaf(int paramInt)
  {
    return 4;
  }
  
  public static int zzag(int paramInt)
  {
    return 4;
  }
  
  public static int zzah(int paramInt)
  {
    return zzac(paramInt);
  }
  
  private static int zzai(int paramInt)
  {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  @Deprecated
  public static int zzaj(int paramInt)
  {
    return zzad(paramInt);
  }
  
  public static int zzb(double paramDouble)
  {
    return 8;
  }
  
  public static int zzb(float paramFloat)
  {
    return 4;
  }
  
  public static int zzb(int paramInt, double paramDouble)
  {
    return zzab(paramInt) + 8;
  }
  
  public static int zzb(int paramInt, float paramFloat)
  {
    return zzab(paramInt) + 4;
  }
  
  public static int zzb(int paramInt, zzkx paramzzkx)
  {
    return (zzab(1) << 1) + zzh(2, paramInt) + zza(3, paramzzkx);
  }
  
  public static int zzb(int paramInt, zzlq paramzzlq)
  {
    return (zzab(1) << 1) + zzh(2, paramInt) + (zzab(3) + zzc(paramzzlq));
  }
  
  static int zzb(int paramInt, zzlq paramzzlq, zzmf paramzzmf)
  {
    return zzab(paramInt) + zza(paramzzlq, paramzzmf);
  }
  
  public static int zzb(int paramInt, String paramString)
  {
    return zzab(paramInt) + zzm(paramString);
  }
  
  public static int zzb(zzjc paramzzjc)
  {
    int i = paramzzjc.size();
    return zzad(i) + i;
  }
  
  public static zzjr zzb(byte[] paramArrayOfByte)
  {
    return new zza(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int zzc(int paramInt, zzjc paramzzjc)
  {
    int i = zzab(paramInt);
    paramInt = paramzzjc.size();
    return i + (zzad(paramInt) + paramInt);
  }
  
  @Deprecated
  static int zzc(int paramInt, zzlq paramzzlq, zzmf paramzzmf)
  {
    int j = zzab(paramInt);
    paramzzlq = (zzit)paramzzlq;
    int i = paramzzlq.zzbm();
    paramInt = i;
    if (i == -1)
    {
      paramInt = paramzzmf.zzn(paramzzlq);
      paramzzlq.zzo(paramInt);
    }
    return (j << 1) + paramInt;
  }
  
  public static int zzc(int paramInt, boolean paramBoolean)
  {
    return zzab(paramInt) + 1;
  }
  
  public static int zzc(zzlq paramzzlq)
  {
    int i = paramzzlq.zzcx();
    return zzad(i) + i;
  }
  
  public static int zzc(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return zzad(i) + i;
  }
  
  public static int zzd(int paramInt, long paramLong)
  {
    return zzab(paramInt) + zzp(paramLong);
  }
  
  public static int zzd(int paramInt, zzjc paramzzjc)
  {
    return (zzab(1) << 1) + zzh(2, paramInt) + zzc(3, paramzzjc);
  }
  
  @Deprecated
  public static int zzd(zzlq paramzzlq)
  {
    return paramzzlq.zzcx();
  }
  
  public static int zzd(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int zze(int paramInt, long paramLong)
  {
    return zzab(paramInt) + zzp(paramLong);
  }
  
  public static int zzf(int paramInt, long paramLong)
  {
    return zzab(paramInt) + zzp(zzt(paramLong));
  }
  
  public static int zzg(int paramInt1, int paramInt2)
  {
    return zzab(paramInt1) + zzac(paramInt2);
  }
  
  public static int zzg(int paramInt, long paramLong)
  {
    return zzab(paramInt) + 8;
  }
  
  public static int zzh(int paramInt1, int paramInt2)
  {
    return zzab(paramInt1) + zzad(paramInt2);
  }
  
  public static int zzh(int paramInt, long paramLong)
  {
    return zzab(paramInt) + 8;
  }
  
  public static int zzi(int paramInt1, int paramInt2)
  {
    return zzab(paramInt1) + zzad(zzai(paramInt2));
  }
  
  public static int zzj(int paramInt1, int paramInt2)
  {
    return zzab(paramInt1) + 4;
  }
  
  public static int zzk(int paramInt1, int paramInt2)
  {
    return zzab(paramInt1) + 4;
  }
  
  public static int zzl(int paramInt1, int paramInt2)
  {
    return zzab(paramInt1) + zzac(paramInt2);
  }
  
  public static int zzm(String paramString)
  {
    int i;
    try
    {
      i = zznf.zza(paramString);
    }
    catch (zznj localzznj)
    {
      i = paramString.getBytes(zzkm.UTF_8).length;
    }
    return zzad(i) + i;
  }
  
  public static int zzo(long paramLong)
  {
    return zzp(paramLong);
  }
  
  public static int zzp(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if (paramLong < 0L) {
      return 10;
    }
    if ((0xFFFFFFF800000000 & paramLong) != 0L)
    {
      j = 6;
      paramLong >>>= 28;
    }
    else
    {
      j = 2;
    }
    int i = j;
    long l = paramLong;
    if ((0xFFFFFFFFFFE00000 & paramLong) != 0L)
    {
      i = j + 2;
      l = paramLong >>> 14;
    }
    int j = i;
    if ((l & 0xFFFFFFFFFFFFC000) != 0L) {
      j = i + 1;
    }
    return j;
  }
  
  public static int zzq(long paramLong)
  {
    return zzp(zzt(paramLong));
  }
  
  public static int zzr(long paramLong)
  {
    return 8;
  }
  
  public static int zzs(long paramLong)
  {
    return 8;
  }
  
  private static long zzt(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  public final void zza(double paramDouble)
    throws IOException
  {
    zzn(Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void zza(float paramFloat)
    throws IOException
  {
    zzaa(Float.floatToRawIntBits(paramFloat));
  }
  
  public final void zza(int paramInt, double paramDouble)
    throws IOException
  {
    zzc(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void zza(int paramInt, float paramFloat)
    throws IOException
  {
    zzf(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void zza(int paramInt, long paramLong)
    throws IOException;
  
  public abstract void zza(int paramInt, zzjc paramzzjc)
    throws IOException;
  
  public abstract void zza(int paramInt, zzlq paramzzlq)
    throws IOException;
  
  abstract void zza(int paramInt, zzlq paramzzlq, zzmf paramzzmf)
    throws IOException;
  
  public abstract void zza(int paramInt, String paramString)
    throws IOException;
  
  public abstract void zza(zzjc paramzzjc)
    throws IOException;
  
  final void zza(String paramString, zznj paramzznj)
    throws IOException
  {
    logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramzznj);
    paramString = paramString.getBytes(zzkm.UTF_8);
    try
    {
      zzy(paramString.length);
      zza(paramString, 0, paramString.length);
      return;
    }
    catch (zzb paramString)
    {
      throw paramString;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new zzb(paramString);
    }
  }
  
  public abstract void zzaa(int paramInt)
    throws IOException;
  
  public abstract void zzb(int paramInt1, int paramInt2)
    throws IOException;
  
  public final void zzb(int paramInt, long paramLong)
    throws IOException
  {
    zza(paramInt, zzt(paramLong));
  }
  
  public abstract void zzb(int paramInt, zzjc paramzzjc)
    throws IOException;
  
  public abstract void zzb(int paramInt, boolean paramBoolean)
    throws IOException;
  
  public abstract void zzb(zzlq paramzzlq)
    throws IOException;
  
  public abstract void zzc(byte paramByte)
    throws IOException;
  
  public abstract void zzc(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzc(int paramInt, long paramLong)
    throws IOException;
  
  public final void zzc(boolean paramBoolean)
    throws IOException
  {
    zzc((byte)paramBoolean);
  }
  
  public abstract int zzca();
  
  public final void zzcb()
  {
    if (zzca() == 0) {
      return;
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public abstract void zzd(int paramInt1, int paramInt2)
    throws IOException;
  
  abstract void zzd(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;
  
  public final void zze(int paramInt1, int paramInt2)
    throws IOException
  {
    zzd(paramInt1, zzai(paramInt2));
  }
  
  public abstract void zzf(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzl(long paramLong)
    throws IOException;
  
  public abstract void zzl(String paramString)
    throws IOException;
  
  public final void zzm(long paramLong)
    throws IOException
  {
    zzl(zzt(paramLong));
  }
  
  public abstract void zzn(long paramLong)
    throws IOException;
  
  public abstract void zzx(int paramInt)
    throws IOException;
  
  public abstract void zzy(int paramInt)
    throws IOException;
  
  public final void zzz(int paramInt)
    throws IOException
  {
    zzy(zzai(paramInt));
  }
  
  static final class zza
    extends zzjr
  {
    private final byte[] buffer;
    private final int limit;
    private final int offset;
    private int position;
    
    zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      super();
      Objects.requireNonNull(paramArrayOfByte, "buffer");
      paramInt1 = paramArrayOfByte.length;
      int i = paramInt2 + 0;
      if ((paramInt2 | 0x0 | paramInt1 - i) >= 0)
      {
        this.buffer = paramArrayOfByte;
        this.offset = 0;
        this.position = 0;
        this.limit = i;
        return;
      }
      throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(0), Integer.valueOf(paramInt2) }));
    }
    
    private final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      try
      {
        System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, this.position, paramInt2);
        this.position += paramInt2;
        return;
      }
      catch (IndexOutOfBoundsException paramArrayOfByte)
      {
        throw new zzjr.zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(paramInt2) }), paramArrayOfByte);
      }
    }
    
    public final void zza(int paramInt, long paramLong)
      throws IOException
    {
      zzb(paramInt, 0);
      zzl(paramLong);
    }
    
    public final void zza(int paramInt, zzjc paramzzjc)
      throws IOException
    {
      zzb(paramInt, 2);
      zza(paramzzjc);
    }
    
    public final void zza(int paramInt, zzlq paramzzlq)
      throws IOException
    {
      zzb(1, 3);
      zzd(2, paramInt);
      zzb(3, 2);
      zzb(paramzzlq);
      zzb(1, 4);
    }
    
    final void zza(int paramInt, zzlq paramzzlq, zzmf paramzzmf)
      throws IOException
    {
      zzb(paramInt, 2);
      zzit localzzit = (zzit)paramzzlq;
      int i = localzzit.zzbm();
      paramInt = i;
      if (i == -1)
      {
        paramInt = paramzzmf.zzn(localzzit);
        localzzit.zzo(paramInt);
      }
      zzy(paramInt);
      paramzzmf.zza(paramzzlq, this.zzoh);
    }
    
    public final void zza(int paramInt, String paramString)
      throws IOException
    {
      zzb(paramInt, 2);
      zzl(paramString);
    }
    
    public final void zza(zzjc paramzzjc)
      throws IOException
    {
      zzy(paramzzjc.size());
      paramzzjc.zza(this);
    }
    
    public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      write(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public final void zzaa(int paramInt)
      throws IOException
    {
      try
      {
        byte[] arrayOfByte = this.buffer;
        int i = this.position;
        int j = i + 1;
        this.position = j;
        arrayOfByte[i] = ((byte)paramInt);
        i = j + 1;
        this.position = i;
        arrayOfByte[j] = ((byte)(paramInt >> 8));
        j = i + 1;
        this.position = j;
        arrayOfByte[i] = ((byte)(paramInt >> 16));
        this.position = (j + 1);
        arrayOfByte[j] = ((byte)(paramInt >>> 24));
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new zzjr.zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
    
    public final void zzb(int paramInt1, int paramInt2)
      throws IOException
    {
      zzy(paramInt1 << 3 | paramInt2);
    }
    
    public final void zzb(int paramInt, zzjc paramzzjc)
      throws IOException
    {
      zzb(1, 3);
      zzd(2, paramInt);
      zza(3, paramzzjc);
      zzb(1, 4);
    }
    
    public final void zzb(int paramInt, boolean paramBoolean)
      throws IOException
    {
      zzb(paramInt, 0);
      zzc((byte)paramBoolean);
    }
    
    public final void zzb(zzlq paramzzlq)
      throws IOException
    {
      zzy(paramzzlq.zzcx());
      paramzzlq.zzb(this);
    }
    
    public final void zzc(byte paramByte)
      throws IOException
    {
      try
      {
        byte[] arrayOfByte = this.buffer;
        int i = this.position;
        this.position = (i + 1);
        arrayOfByte[i] = paramByte;
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new zzjr.zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
    
    public final void zzc(int paramInt1, int paramInt2)
      throws IOException
    {
      zzb(paramInt1, 0);
      zzx(paramInt2);
    }
    
    public final void zzc(int paramInt, long paramLong)
      throws IOException
    {
      zzb(paramInt, 1);
      zzn(paramLong);
    }
    
    public final int zzca()
    {
      return this.limit - this.position;
    }
    
    public final void zzd(int paramInt1, int paramInt2)
      throws IOException
    {
      zzb(paramInt1, 0);
      zzy(paramInt2);
    }
    
    public final void zzd(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      zzy(paramInt2);
      write(paramArrayOfByte, 0, paramInt2);
    }
    
    public final void zzf(int paramInt1, int paramInt2)
      throws IOException
    {
      zzb(paramInt1, 5);
      zzaa(paramInt2);
    }
    
    public final void zzl(long paramLong)
      throws IOException
    {
      long l = paramLong;
      byte[] arrayOfByte;
      int i;
      if (zzjr.zzcc())
      {
        l = paramLong;
        if (zzca() >= 10) {
          for (;;)
          {
            if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
            {
              arrayOfByte = this.buffer;
              i = this.position;
              this.position = (i + 1);
              zznd.zza(arrayOfByte, i, (byte)(int)paramLong);
              return;
            }
            arrayOfByte = this.buffer;
            i = this.position;
            this.position = (i + 1);
            zznd.zza(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
            paramLong >>>= 7;
          }
        }
      }
      for (;;)
      {
        if ((l & 0xFFFFFFFFFFFFFF80) == 0L) {}
        try
        {
          arrayOfByte = this.buffer;
          i = this.position;
          this.position = (i + 1);
          arrayOfByte[i] = ((byte)(int)l);
          return;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          throw new zzjr.zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1) }), localIndexOutOfBoundsException);
        }
        arrayOfByte = this.buffer;
        i = this.position;
        this.position = (i + 1);
        arrayOfByte[i] = ((byte)((int)l & 0x7F | 0x80));
        l >>>= 7;
      }
    }
    
    public final void zzl(String paramString)
      throws IOException
    {
      int i = this.position;
      try
      {
        int k = zzad(paramString.length() * 3);
        int j = zzad(paramString.length());
        if (j == k)
        {
          k = i + j;
          this.position = k;
          k = zznf.zza(paramString, this.buffer, k, zzca());
          this.position = i;
          zzy(k - i - j);
          this.position = k;
          return;
        }
        zzy(zznf.zza(paramString));
        this.position = zznf.zza(paramString, this.buffer, this.position, zzca());
        return;
      }
      catch (IndexOutOfBoundsException paramString)
      {
        throw new zzjr.zzb(paramString);
      }
      catch (zznj localzznj)
      {
        this.position = i;
        zza(paramString, localzznj);
      }
    }
    
    public final void zzn(long paramLong)
      throws IOException
    {
      try
      {
        byte[] arrayOfByte = this.buffer;
        int j = this.position;
        int i = j + 1;
        this.position = i;
        arrayOfByte[j] = ((byte)(int)paramLong);
        j = i + 1;
        this.position = j;
        arrayOfByte[i] = ((byte)(int)(paramLong >> 8));
        i = j + 1;
        this.position = i;
        arrayOfByte[j] = ((byte)(int)(paramLong >> 16));
        int k = i + 1;
        this.position = k;
        arrayOfByte[i] = ((byte)(int)(paramLong >> 24));
        j = k + 1;
        this.position = j;
        arrayOfByte[k] = ((byte)(int)(paramLong >> 32));
        i = j + 1;
        this.position = i;
        arrayOfByte[j] = ((byte)(int)(paramLong >> 40));
        j = i + 1;
        this.position = j;
        arrayOfByte[i] = ((byte)(int)(paramLong >> 48));
        this.position = (j + 1);
        arrayOfByte[j] = ((byte)(int)(paramLong >> 56));
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new zzjr.zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
    
    public final void zzx(int paramInt)
      throws IOException
    {
      if (paramInt >= 0)
      {
        zzy(paramInt);
        return;
      }
      zzl(paramInt);
    }
    
    public final void zzy(int paramInt)
      throws IOException
    {
      int i = paramInt;
      byte[] arrayOfByte;
      if (zzjr.zzcc())
      {
        i = paramInt;
        if (!zzix.zzbr())
        {
          i = paramInt;
          if (zzca() >= 5)
          {
            if ((paramInt & 0xFFFFFF80) == 0)
            {
              arrayOfByte = this.buffer;
              i = this.position;
              this.position = (i + 1);
              zznd.zza(arrayOfByte, i, (byte)paramInt);
              return;
            }
            arrayOfByte = this.buffer;
            i = this.position;
            this.position = (i + 1);
            zznd.zza(arrayOfByte, i, (byte)(paramInt | 0x80));
            paramInt >>>= 7;
            if ((paramInt & 0xFFFFFF80) == 0)
            {
              arrayOfByte = this.buffer;
              i = this.position;
              this.position = (i + 1);
              zznd.zza(arrayOfByte, i, (byte)paramInt);
              return;
            }
            arrayOfByte = this.buffer;
            i = this.position;
            this.position = (i + 1);
            zznd.zza(arrayOfByte, i, (byte)(paramInt | 0x80));
            paramInt >>>= 7;
            if ((paramInt & 0xFFFFFF80) == 0)
            {
              arrayOfByte = this.buffer;
              i = this.position;
              this.position = (i + 1);
              zznd.zza(arrayOfByte, i, (byte)paramInt);
              return;
            }
            arrayOfByte = this.buffer;
            i = this.position;
            this.position = (i + 1);
            zznd.zza(arrayOfByte, i, (byte)(paramInt | 0x80));
            paramInt >>>= 7;
            if ((paramInt & 0xFFFFFF80) == 0)
            {
              arrayOfByte = this.buffer;
              i = this.position;
              this.position = (i + 1);
              zznd.zza(arrayOfByte, i, (byte)paramInt);
              return;
            }
            arrayOfByte = this.buffer;
            i = this.position;
            this.position = (i + 1);
            zznd.zza(arrayOfByte, i, (byte)(paramInt | 0x80));
            arrayOfByte = this.buffer;
            i = this.position;
            this.position = (i + 1);
            zznd.zza(arrayOfByte, i, (byte)(paramInt >>> 7));
            return;
          }
        }
      }
      for (;;)
      {
        if ((i & 0xFFFFFF80) == 0) {}
        try
        {
          arrayOfByte = this.buffer;
          paramInt = this.position;
          this.position = (paramInt + 1);
          arrayOfByte[paramInt] = ((byte)i);
          return;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          throw new zzjr.zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1) }), localIndexOutOfBoundsException);
        }
        arrayOfByte = this.buffer;
        paramInt = this.position;
        this.position = (paramInt + 1);
        arrayOfByte[paramInt] = ((byte)(i & 0x7F | 0x80));
        i >>>= 7;
      }
    }
  }
  
  public static final class zzb
    extends IOException
  {
    zzb()
    {
      super();
    }
    
    zzb(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
    
    zzb(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */