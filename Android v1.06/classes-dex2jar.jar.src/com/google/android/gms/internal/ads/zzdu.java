package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

public final class zzdu
  implements zzdr
{
  private int zzb;
  private float zzc = 1.0F;
  private float zzd = 1.0F;
  private zzdp zze = zzdp.zza;
  private zzdp zzf;
  private zzdp zzg;
  private zzdp zzh;
  private boolean zzi;
  private zzdt zzj;
  private ByteBuffer zzk;
  private ShortBuffer zzl;
  private ByteBuffer zzm;
  private long zzn;
  private long zzo;
  private boolean zzp;
  
  public zzdu()
  {
    Object localObject = zzdp.zza;
    this.zzf = ((zzdp)localObject);
    this.zzg = ((zzdp)localObject);
    this.zzh = ((zzdp)localObject);
    localObject = zza;
    this.zzk = ((ByteBuffer)localObject);
    this.zzl = ((ByteBuffer)localObject).asShortBuffer();
    this.zzm = zza;
    this.zzb = -1;
  }
  
  public final zzdp zza(zzdp paramzzdp)
    throws zzdq
  {
    if (paramzzdp.zzd == 2)
    {
      int j = this.zzb;
      int i = j;
      if (j == -1) {
        i = paramzzdp.zzb;
      }
      this.zze = paramzzdp;
      paramzzdp = new zzdp(i, paramzzdp.zzc, 2);
      this.zzf = paramzzdp;
      this.zzi = true;
      return paramzzdp;
    }
    throw new zzdq("Unhandled input format:", paramzzdp);
  }
  
  public final ByteBuffer zzb()
  {
    Object localObject = this.zzj;
    if (localObject != null)
    {
      int i = ((zzdt)localObject).zza();
      if (i > 0)
      {
        if (this.zzk.capacity() < i)
        {
          ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
          this.zzk = localByteBuffer;
          this.zzl = localByteBuffer.asShortBuffer();
        }
        else
        {
          this.zzk.clear();
          this.zzl.clear();
        }
        ((zzdt)localObject).zzd(this.zzl);
        this.zzo += i;
        this.zzk.limit(i);
        this.zzm = this.zzk;
      }
    }
    localObject = this.zzm;
    this.zzm = zza;
    return (ByteBuffer)localObject;
  }
  
  public final void zzc()
  {
    if (zzg())
    {
      Object localObject = this.zze;
      this.zzg = ((zzdp)localObject);
      this.zzh = this.zzf;
      if (this.zzi)
      {
        this.zzj = new zzdt(((zzdp)localObject).zzb, ((zzdp)localObject).zzc, this.zzc, this.zzd, this.zzh.zzb);
      }
      else
      {
        localObject = this.zzj;
        if (localObject != null) {
          ((zzdt)localObject).zzc();
        }
      }
    }
    this.zzm = zza;
    this.zzn = 0L;
    this.zzo = 0L;
    this.zzp = false;
  }
  
  public final void zzd()
  {
    zzdt localzzdt = this.zzj;
    if (localzzdt != null) {
      localzzdt.zze();
    }
    this.zzp = true;
  }
  
  public final void zze(ByteBuffer paramByteBuffer)
  {
    if (!paramByteBuffer.hasRemaining()) {
      return;
    }
    zzdt localzzdt = this.zzj;
    Objects.requireNonNull(localzzdt);
    ShortBuffer localShortBuffer = paramByteBuffer.asShortBuffer();
    int i = paramByteBuffer.remaining();
    this.zzn += i;
    localzzdt.zzf(localShortBuffer);
    paramByteBuffer.position(paramByteBuffer.position() + i);
  }
  
  public final void zzf()
  {
    this.zzc = 1.0F;
    this.zzd = 1.0F;
    this.zze = zzdp.zza;
    Object localObject = zzdp.zza;
    this.zzf = ((zzdp)localObject);
    this.zzg = ((zzdp)localObject);
    this.zzh = ((zzdp)localObject);
    localObject = zza;
    this.zzk = ((ByteBuffer)localObject);
    this.zzl = ((ByteBuffer)localObject).asShortBuffer();
    this.zzm = zza;
    this.zzb = -1;
    this.zzi = false;
    this.zzj = null;
    this.zzn = 0L;
    this.zzo = 0L;
    this.zzp = false;
  }
  
  public final boolean zzg()
  {
    int i = this.zzf.zzb;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i != -1) {
      if ((Math.abs(this.zzc - 1.0F) < 1.0E-4F) && (Math.abs(this.zzd - 1.0F) < 1.0E-4F))
      {
        if (this.zzf.zzb == this.zze.zzb) {
          bool1 = bool2;
        } else {
          return true;
        }
      }
      else {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean zzh()
  {
    boolean bool2 = this.zzp;
    boolean bool1 = true;
    if (bool2)
    {
      zzdt localzzdt = this.zzj;
      if (localzzdt == null) {
        return bool1;
      }
      if (localzzdt.zza() == 0) {
        return true;
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public final long zzi(long paramLong)
  {
    long l1 = this.zzo;
    if (l1 >= 1024L)
    {
      long l2 = this.zzn;
      zzdt localzzdt = this.zzj;
      Objects.requireNonNull(localzzdt);
      l2 -= localzzdt.zzb();
      int i = this.zzh.zzb;
      int j = this.zzg.zzb;
      if (i == j) {
        paramLong = zzfn.zzp(paramLong, l2, l1);
      } else {
        paramLong = zzfn.zzp(paramLong, l2 * i, l1 * j);
      }
      return paramLong;
    }
    return (this.zzc * paramLong);
  }
  
  public final void zzj(float paramFloat)
  {
    if (this.zzd != paramFloat)
    {
      this.zzd = paramFloat;
      this.zzi = true;
    }
  }
  
  public final void zzk(float paramFloat)
  {
    if (this.zzc != paramFloat)
    {
      this.zzc = paramFloat;
      this.zzi = true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */