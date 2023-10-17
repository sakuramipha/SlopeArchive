package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class zzdo
{
  private final zzfrr zza;
  private final List zzb;
  private ByteBuffer[] zzc;
  private zzdp zzd;
  private zzdp zze;
  private boolean zzf;
  
  public zzdo(zzfrr paramzzfrr)
  {
    this.zza = paramzzfrr;
    this.zzb = new ArrayList();
    this.zzc = new ByteBuffer[0];
    this.zzd = zzdp.zza;
    this.zze = zzdp.zza;
    this.zzf = false;
  }
  
  private final int zzi()
  {
    return this.zzc.length - 1;
  }
  
  private final void zzj(ByteBuffer paramByteBuffer)
  {
    int j;
    do
    {
      int i = 0;
      int k;
      for (j = 0; i <= zzi(); j = k)
      {
        k = j;
        if (!this.zzc[i].hasRemaining())
        {
          zzdr localzzdr = (zzdr)this.zzb.get(i);
          if (localzzdr.zzh())
          {
            k = j;
            if (!this.zzc[i].hasRemaining())
            {
              k = j;
              if (i < zzi())
              {
                ((zzdr)this.zzb.get(i + 1)).zzd();
                k = j;
              }
            }
          }
          else
          {
            ByteBuffer localByteBuffer;
            if (i > 0) {
              localByteBuffer = this.zzc[(i - 1)];
            } else if (paramByteBuffer.hasRemaining()) {
              localByteBuffer = paramByteBuffer;
            } else {
              localByteBuffer = zzdr.zza;
            }
            long l2 = localByteBuffer.remaining();
            localzzdr.zze(localByteBuffer);
            this.zzc[i] = localzzdr.zzb();
            long l1 = localByteBuffer.remaining();
            int m = 1;
            k = m;
            if (l2 - l1 <= 0L) {
              if (this.zzc[i].hasRemaining()) {
                k = m;
              } else {
                k = 0;
              }
            }
            k = j | k;
          }
        }
        i++;
      }
    } while (j != 0);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzdo)) {
      return false;
    }
    paramObject = (zzdo)paramObject;
    if (this.zza.size() == ((zzdo)paramObject).zza.size())
    {
      for (int i = 0; i < this.zza.size(); i++) {
        if (this.zza.get(i) != ((zzdo)paramObject).zza.get(i)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public final zzdp zza(zzdp paramzzdp)
    throws zzdq
  {
    if (!paramzzdp.equals(zzdp.zza))
    {
      for (int i = 0; i < this.zza.size(); i++)
      {
        zzdr localzzdr = (zzdr)this.zza.get(i);
        zzdp localzzdp = localzzdr.zza(paramzzdp);
        if (localzzdr.zzg())
        {
          zzdy.zzf(localzzdp.equals(zzdp.zza) ^ true);
          paramzzdp = localzzdp;
        }
      }
      this.zze = paramzzdp;
      return paramzzdp;
    }
    throw new zzdq("Unhandled input format:", paramzzdp);
  }
  
  public final ByteBuffer zzb()
  {
    if (!zzh()) {
      return zzdr.zza;
    }
    ByteBuffer localByteBuffer = this.zzc[zzi()];
    if (!localByteBuffer.hasRemaining()) {
      zzj(zzdr.zza);
    }
    return localByteBuffer;
  }
  
  public final void zzc()
  {
    this.zzb.clear();
    this.zzd = this.zze;
    int j = 0;
    this.zzf = false;
    for (int i = 0; i < this.zza.size(); i++)
    {
      zzdr localzzdr = (zzdr)this.zza.get(i);
      localzzdr.zzc();
      if (localzzdr.zzg()) {
        this.zzb.add(localzzdr);
      }
    }
    this.zzc = new ByteBuffer[this.zzb.size()];
    for (i = j; i <= zzi(); i++) {
      this.zzc[i] = ((zzdr)this.zzb.get(i)).zzb();
    }
  }
  
  public final void zzd()
  {
    if ((zzh()) && (!this.zzf))
    {
      this.zzf = true;
      ((zzdr)this.zzb.get(0)).zzd();
    }
  }
  
  public final void zze(ByteBuffer paramByteBuffer)
  {
    if ((zzh()) && (!this.zzf)) {
      zzj(paramByteBuffer);
    }
  }
  
  public final void zzf()
  {
    for (int i = 0; i < this.zza.size(); i++)
    {
      zzdr localzzdr = (zzdr)this.zza.get(i);
      localzzdr.zzc();
      localzzdr.zzf();
    }
    this.zzc = new ByteBuffer[0];
    this.zzd = zzdp.zza;
    this.zze = zzdp.zza;
    this.zzf = false;
  }
  
  public final boolean zzg()
  {
    return (this.zzf) && (((zzdr)this.zzb.get(zzi())).zzh()) && (!this.zzc[zzi()].hasRemaining());
  }
  
  public final boolean zzh()
  {
    return !this.zzb.isEmpty();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */