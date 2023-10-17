package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

final class zzahl
{
  private final zzahm zza = new zzahm();
  private final zzfd zzb = new zzfd(new byte[65025], 0);
  private int zzc = -1;
  private int zzd;
  private boolean zze;
  
  private final int zzf(int paramInt)
  {
    int i = 0;
    this.zzd = 0;
    int k;
    int j;
    do
    {
      int m = this.zzd;
      k = paramInt + m;
      Object localObject = this.zza;
      j = i;
      if (k >= ((zzahm)localObject).zzc) {
        break;
      }
      localObject = ((zzahm)localObject).zzf;
      this.zzd = (m + 1);
      k = localObject[k];
      j = i + k;
      i = j;
    } while (k == 255);
    return j;
  }
  
  public final zzfd zza()
  {
    return this.zzb;
  }
  
  public final zzahm zzb()
  {
    return this.zza;
  }
  
  public final void zzc()
  {
    this.zza.zza();
    this.zzb.zzC(0);
    this.zzc = -1;
    this.zze = false;
  }
  
  public final void zzd()
  {
    zzfd localzzfd = this.zzb;
    if (localzzfd.zzH().length == 65025) {
      return;
    }
    localzzfd.zzD(Arrays.copyOf(localzzfd.zzH(), Math.max(65025, localzzfd.zzd())), this.zzb.zzd());
  }
  
  public final boolean zze(zzaap paramzzaap)
    throws IOException
  {
    if (this.zze)
    {
      this.zze = false;
      this.zzb.zzC(0);
    }
    for (;;)
    {
      boolean bool2 = this.zze;
      boolean bool1 = true;
      if (bool2) {
        break;
      }
      int j = this.zzc;
      int i = j;
      Object localObject;
      if (j < 0) {
        if ((this.zza.zzc(paramzzaap, -1L)) && (this.zza.zzb(paramzzaap, true)))
        {
          localObject = this.zza;
          j = ((zzahm)localObject).zzd;
          if (((((zzahm)localObject).zza & 0x1) == 1) && (this.zzb.zzd() == 0))
          {
            j += zzf(0);
            i = this.zzd;
          }
          else
          {
            i = 0;
          }
          if (!zzaas.zze(paramzzaap, j)) {
            return false;
          }
          this.zzc = i;
        }
        else
        {
          return false;
        }
      }
      i = zzf(i);
      j = this.zzc + this.zzd;
      if (i > 0)
      {
        localObject = this.zzb;
        ((zzfd)localObject).zzz(((zzfd)localObject).zzd() + i);
        localObject = this.zzb;
        if (!zzaas.zzd(paramzzaap, ((zzfd)localObject).zzH(), ((zzfd)localObject).zzd(), i)) {
          return false;
        }
        localObject = this.zzb;
        ((zzfd)localObject).zzE(((zzfd)localObject).zzd() + i);
        if (this.zza.zzf[(j - 1)] == 255) {
          bool1 = false;
        }
        this.zze = bool1;
      }
      i = j;
      if (j == this.zza.zzc) {
        i = -1;
      }
      this.zzc = i;
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */