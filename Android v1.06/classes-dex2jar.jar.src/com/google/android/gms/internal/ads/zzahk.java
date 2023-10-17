package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public final class zzahk
  implements zzaao
{
  public static final zzaav zza = zzahj.zza;
  private zzaar zzb;
  private zzahs zzc;
  private boolean zzd;
  
  @EnsuresNonNullIf(expression={"streamReader"}, result=true)
  private final boolean zze(zzaap paramzzaap)
    throws IOException
  {
    Object localObject = new zzahm();
    if ((((zzahm)localObject).zzb(paramzzaap, true)) && ((((zzahm)localObject).zza & 0x2) == 2))
    {
      int i = Math.min(((zzahm)localObject).zze, 8);
      localObject = new zzfd(i);
      byte[] arrayOfByte = ((zzfd)localObject).zzH();
      ((zzaae)paramzzaap).zzm(arrayOfByte, 0, i, false);
      ((zzfd)localObject).zzF(0);
      if ((((zzfd)localObject).zza() >= 5) && (((zzfd)localObject).zzk() == 127) && (((zzfd)localObject).zzs() == 1179402563L))
      {
        this.zzc = new zzahi();
      }
      else
      {
        ((zzfd)localObject).zzF(0);
        try
        {
          boolean bool = zzabx.zzd(1, (zzfd)localObject, true);
          if (bool) {
            this.zzc = new zzahu();
          }
        }
        catch (zzce paramzzaap)
        {
          ((zzfd)localObject).zzF(0);
          if (!zzaho.zzd((zzfd)localObject)) {
            break label185;
          }
        }
        this.zzc = new zzaho();
      }
      return true;
    }
    label185:
    return false;
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    zzdy.zzb(this.zzb);
    if (this.zzc == null) {
      if (zze(paramzzaap)) {
        paramzzaap.zzj();
      } else {
        throw zzce.zza("Failed to determine bitstream type", null);
      }
    }
    if (!this.zzd)
    {
      zzabr localzzabr = this.zzb.zzv(0, 1);
      this.zzb.zzC();
      this.zzc.zzh(this.zzb, localzzabr);
      this.zzd = true;
    }
    return this.zzc.zze(paramzzaap, paramzzabk);
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzb = paramzzaar;
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    zzahs localzzahs = this.zzc;
    if (localzzahs != null) {
      localzzahs.zzj(paramLong1, paramLong2);
    }
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    try
    {
      boolean bool = zze(paramzzaap);
      return bool;
    }
    catch (zzce paramzzaap) {}
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */