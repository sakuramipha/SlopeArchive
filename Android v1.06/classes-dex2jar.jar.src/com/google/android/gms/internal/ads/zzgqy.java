package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzgqy
  extends zzgno
{
  static final int[] zza = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE };
  private final int zzc;
  private final zzgno zzd;
  private final zzgno zze;
  private final int zzf;
  private final int zzg;
  
  private zzgqy(zzgno paramzzgno1, zzgno paramzzgno2)
  {
    this.zzd = paramzzgno1;
    this.zze = paramzzgno2;
    int i = paramzzgno1.zzd();
    this.zzf = i;
    this.zzc = (i + paramzzgno2.zzd());
    this.zzg = (Math.max(paramzzgno1.zzf(), paramzzgno2.zzf()) + 1);
  }
  
  static zzgno zzC(zzgno paramzzgno1, zzgno paramzzgno2)
  {
    if (paramzzgno2.zzd() == 0) {
      return paramzzgno1;
    }
    if (paramzzgno1.zzd() == 0) {
      return paramzzgno2;
    }
    int i = paramzzgno1.zzd() + paramzzgno2.zzd();
    if (i < 128) {
      return zzD(paramzzgno1, paramzzgno2);
    }
    if ((paramzzgno1 instanceof zzgqy))
    {
      zzgqy localzzgqy = (zzgqy)paramzzgno1;
      if (localzzgqy.zze.zzd() + paramzzgno2.zzd() < 128)
      {
        paramzzgno1 = zzD(localzzgqy.zze, paramzzgno2);
        return new zzgqy(localzzgqy.zzd, paramzzgno1);
      }
      if ((localzzgqy.zzd.zzf() > localzzgqy.zze.zzf()) && (localzzgqy.zzg > paramzzgno2.zzf()))
      {
        paramzzgno1 = new zzgqy(localzzgqy.zze, paramzzgno2);
        return new zzgqy(localzzgqy.zzd, paramzzgno1);
      }
    }
    if (i >= zzc(Math.max(paramzzgno1.zzf(), paramzzgno2.zzf()) + 1)) {
      return new zzgqy(paramzzgno1, paramzzgno2);
    }
    return zzgqu.zza(new zzgqu(null), paramzzgno1, paramzzgno2);
  }
  
  private static zzgno zzD(zzgno paramzzgno1, zzgno paramzzgno2)
  {
    int j = paramzzgno1.zzd();
    int i = paramzzgno2.zzd();
    byte[] arrayOfByte = new byte[j + i];
    paramzzgno1.zzz(arrayOfByte, 0, 0, j);
    paramzzgno2.zzz(arrayOfByte, 0, j, i);
    return new zzgnk(arrayOfByte);
  }
  
  static int zzc(int paramInt)
  {
    int[] arrayOfInt = zza;
    int i = arrayOfInt.length;
    if (paramInt >= 47) {
      return Integer.MAX_VALUE;
    }
    return arrayOfInt[paramInt];
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzgno)) {
      return false;
    }
    paramObject = (zzgno)paramObject;
    if (this.zzc != ((zzgno)paramObject).zzd()) {
      return false;
    }
    if (this.zzc == 0) {
      return true;
    }
    int i = zzr();
    int j = ((zzgno)paramObject).zzr();
    if ((i != 0) && (j != 0) && (i != j)) {
      return false;
    }
    zzgqw localzzgqw1 = new zzgqw(this, null);
    zzgnj localzzgnj = localzzgqw1.zza();
    zzgqw localzzgqw2 = new zzgqw((zzgno)paramObject, null);
    paramObject = localzzgqw2.zza();
    j = 0;
    i = 0;
    int k = 0;
    for (;;)
    {
      int i1 = localzzgnj.zzd() - j;
      int m = ((zzgnj)paramObject).zzd() - i;
      int n = Math.min(i1, m);
      boolean bool1;
      if (j == 0) {
        bool1 = localzzgnj.zzg((zzgno)paramObject, i, n);
      } else {
        bool1 = ((zzgnj)paramObject).zzg(localzzgnj, j, n);
      }
      if (!bool1)
      {
        bool1 = false;
      }
      else
      {
        k += n;
        int i2 = this.zzc;
        if (k < i2) {
          break label224;
        }
        if (k != i2) {
          break label216;
        }
        bool1 = bool2;
      }
      return bool1;
      label216:
      throw new IllegalStateException();
      label224:
      if (n == i1)
      {
        localzzgnj = localzzgqw1.zza();
        j = 0;
      }
      else
      {
        j += n;
      }
      if (n == m)
      {
        paramObject = localzzgqw2.zza();
        i = 0;
      }
      else
      {
        i += n;
      }
    }
  }
  
  public final byte zza(int paramInt)
  {
    zzy(paramInt, this.zzc);
    return zzb(paramInt);
  }
  
  final byte zzb(int paramInt)
  {
    int i = this.zzf;
    if (paramInt < i) {
      return this.zzd.zzb(paramInt);
    }
    return this.zze.zzb(paramInt - i);
  }
  
  public final int zzd()
  {
    return this.zzc;
  }
  
  protected final void zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = this.zzf;
    if (paramInt1 + paramInt3 <= i)
    {
      this.zzd.zze(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
      return;
    }
    if (paramInt1 >= i)
    {
      this.zze.zze(paramArrayOfByte, paramInt1 - i, paramInt2, paramInt3);
      return;
    }
    zzgno localzzgno = this.zzd;
    i -= paramInt1;
    localzzgno.zze(paramArrayOfByte, paramInt1, paramInt2, i);
    this.zze.zze(paramArrayOfByte, 0, paramInt2 + i, paramInt3 - i);
  }
  
  protected final int zzf()
  {
    return this.zzg;
  }
  
  protected final boolean zzh()
  {
    return this.zzc >= zzc(this.zzg);
  }
  
  protected final int zzi(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = this.zzf;
    if (paramInt2 + paramInt3 <= i) {
      return this.zzd.zzi(paramInt1, paramInt2, paramInt3);
    }
    if (paramInt2 >= i) {
      return this.zze.zzi(paramInt1, paramInt2 - i, paramInt3);
    }
    zzgno localzzgno = this.zzd;
    i -= paramInt2;
    paramInt1 = localzzgno.zzi(paramInt1, paramInt2, i);
    return this.zze.zzi(paramInt1, 0, paramInt3 - i);
  }
  
  protected final int zzj(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = this.zzf;
    if (paramInt2 + paramInt3 <= i) {
      return this.zzd.zzj(paramInt1, paramInt2, paramInt3);
    }
    if (paramInt2 >= i) {
      return this.zze.zzj(paramInt1, paramInt2 - i, paramInt3);
    }
    zzgno localzzgno = this.zzd;
    i -= paramInt2;
    paramInt1 = localzzgno.zzj(paramInt1, paramInt2, i);
    return this.zze.zzj(paramInt1, 0, paramInt3 - i);
  }
  
  public final zzgno zzk(int paramInt1, int paramInt2)
  {
    int i = zzq(paramInt1, paramInt2, this.zzc);
    if (i == 0) {
      return zzgno.zzb;
    }
    if (i == this.zzc) {
      return this;
    }
    i = this.zzf;
    if (paramInt2 <= i) {
      return this.zzd.zzk(paramInt1, paramInt2);
    }
    if (paramInt1 >= i) {
      return this.zze.zzk(paramInt1 - i, paramInt2 - i);
    }
    zzgno localzzgno = this.zzd;
    return new zzgqy(localzzgno.zzk(paramInt1, localzzgno.zzd()), this.zze.zzk(0, paramInt2 - this.zzf));
  }
  
  public final zzgnw zzl()
  {
    Object localObject1 = new ArrayList();
    Object localObject2 = new zzgqw(this, null);
    while (((zzgqw)localObject2).hasNext()) {
      ((List)localObject1).add(((zzgqw)localObject2).zza().zzn());
    }
    int i = zzgnw.zzd;
    Iterator localIterator = ((Iterable)localObject1).iterator();
    i = 0;
    int j = 0;
    while (localIterator.hasNext())
    {
      localObject2 = (ByteBuffer)localIterator.next();
      j += ((ByteBuffer)localObject2).remaining();
      if (((ByteBuffer)localObject2).hasArray()) {
        i |= 0x1;
      } else if (((ByteBuffer)localObject2).isDirect()) {
        i |= 0x2;
      } else {
        i |= 0x4;
      }
    }
    if (i == 2) {
      localObject1 = new zzgns((Iterable)localObject1, j, true, null);
    } else {
      localObject1 = zzgnw.zzH(new zzgpj((Iterable)localObject1), 4096);
    }
    return (zzgnw)localObject1;
  }
  
  protected final String zzm(Charset paramCharset)
  {
    return new String(zzA(), paramCharset);
  }
  
  public final ByteBuffer zzn()
  {
    throw null;
  }
  
  final void zzo(zzgnd paramzzgnd)
    throws IOException
  {
    this.zzd.zzo(paramzzgnd);
    this.zze.zzo(paramzzgnd);
  }
  
  public final boolean zzp()
  {
    int i = this.zzd.zzj(0, 0, this.zzf);
    zzgno localzzgno = this.zze;
    return localzzgno.zzj(i, 0, localzzgno.zzd()) == 0;
  }
  
  public final zzgni zzs()
  {
    return new zzgqs(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */