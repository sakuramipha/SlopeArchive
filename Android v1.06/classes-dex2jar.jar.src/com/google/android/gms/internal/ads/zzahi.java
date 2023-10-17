package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

final class zzahi
  extends zzahs
{
  private zzabb zza;
  private zzahh zzb;
  
  private static boolean zzd(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] == -1;
  }
  
  protected final long zza(zzfd paramzzfd)
  {
    if (zzd(paramzzfd.zzH()))
    {
      int j = (paramzzfd.zzH()[2] & 0xFF) >> 4;
      int i = j;
      if (j != 6)
      {
        i = j;
        if (j == 7) {
          i = 7;
        }
      }
      else
      {
        paramzzfd.zzG(4);
        paramzzfd.zzu();
      }
      i = zzaax.zza(paramzzfd, i);
      paramzzfd.zzF(0);
      return i;
    }
    return -1L;
  }
  
  protected final void zzb(boolean paramBoolean)
  {
    super.zzb(paramBoolean);
    if (paramBoolean)
    {
      this.zza = null;
      this.zzb = null;
    }
  }
  
  @EnsuresNonNullIf(expression={"#3.format"}, result=false)
  protected final boolean zzc(zzfd paramzzfd, long paramLong, zzahp paramzzahp)
  {
    byte[] arrayOfByte = paramzzfd.zzH();
    zzabb localzzabb = this.zza;
    if (localzzabb == null)
    {
      localzzabb = new zzabb(arrayOfByte, 17);
      this.zza = localzzabb;
      paramzzahp.zza = localzzabb.zzc(Arrays.copyOfRange(arrayOfByte, 9, paramzzfd.zzd()), null);
      return true;
    }
    if ((arrayOfByte[0] & 0x7F) == 3)
    {
      paramzzfd = zzaay.zzb(paramzzfd);
      paramzzahp = localzzabb.zzf(paramzzfd);
      this.zza = paramzzahp;
      this.zzb = new zzahh(paramzzahp, paramzzfd);
      return true;
    }
    if (zzd(arrayOfByte))
    {
      paramzzfd = this.zzb;
      if (paramzzfd != null)
      {
        paramzzfd.zza(paramLong);
        paramzzahp.zzb = this.zzb;
      }
      Objects.requireNonNull(paramzzahp.zza);
      return false;
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */