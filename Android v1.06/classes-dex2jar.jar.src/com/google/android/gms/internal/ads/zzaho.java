package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

final class zzaho
  extends zzahs
{
  private static final byte[] zza = { 79, 112, 117, 115, 72, 101, 97, 100 };
  private static final byte[] zzb = { 79, 112, 117, 115, 84, 97, 103, 115 };
  private boolean zzc;
  
  public static boolean zzd(zzfd paramzzfd)
  {
    return zzk(paramzzfd, zza);
  }
  
  private static boolean zzk(zzfd paramzzfd, byte[] paramArrayOfByte)
  {
    if (paramzzfd.zza() < 8) {
      return false;
    }
    int i = paramzzfd.zzc();
    byte[] arrayOfByte = new byte[8];
    paramzzfd.zzB(arrayOfByte, 0, 8);
    paramzzfd.zzF(i);
    return Arrays.equals(arrayOfByte, paramArrayOfByte);
  }
  
  protected final long zza(zzfd paramzzfd)
  {
    return zzg(zzabj.zzc(paramzzfd.zzH()));
  }
  
  protected final void zzb(boolean paramBoolean)
  {
    super.zzb(paramBoolean);
    if (paramBoolean) {
      this.zzc = false;
    }
  }
  
  @EnsuresNonNullIf(expression={"#3.format"}, result=false)
  protected final boolean zzc(zzfd paramzzfd, long paramLong, zzahp paramzzahp)
    throws zzce
  {
    Object localObject;
    if (zzk(paramzzfd, zza))
    {
      paramzzfd = Arrays.copyOf(paramzzfd.zzH(), paramzzfd.zzd());
      int i = paramzzfd[9];
      localObject = zzabj.zzd(paramzzfd);
      if (paramzzahp.zza != null) {
        return true;
      }
      paramzzfd = new zzak();
      paramzzfd.zzS("audio/opus");
      paramzzfd.zzw(i & 0xFF);
      paramzzfd.zzT(48000);
      paramzzfd.zzI((List)localObject);
      paramzzahp.zza = paramzzfd.zzY();
      return true;
    }
    if (zzk(paramzzfd, zzb))
    {
      zzdy.zzb(paramzzahp.zza);
      if (this.zzc) {
        return true;
      }
      this.zzc = true;
      paramzzfd.zzG(8);
      localObject = zzabx.zzb(zzfrr.zzk(zzabx.zzc(paramzzfd, false, false).zzb));
      if (localObject == null) {
        return true;
      }
      paramzzfd = paramzzahp.zza.zzb();
      paramzzfd.zzM(((zzca)localObject).zzd(paramzzahp.zza.zzk));
      paramzzahp.zza = paramzzfd.zzY();
      return true;
    }
    zzdy.zzb(paramzzahp.zza);
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */