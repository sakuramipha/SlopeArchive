package com.google.android.gms.internal.ads;

import java.util.Collections;

final class zzacr
  extends zzacw
{
  private static final int[] zzb = { 5512, 11025, 22050, 44100 };
  private boolean zzc;
  private boolean zzd;
  private int zze;
  
  public zzacr(zzabr paramzzabr)
  {
    super(paramzzabr);
  }
  
  protected final boolean zza(zzfd paramzzfd)
    throws zzacv
  {
    if (!this.zzc)
    {
      int j = paramzzfd.zzk();
      int i = j >> 4;
      this.zze = i;
      if (i == 2)
      {
        i = zzb[(j >> 2 & 0x3)];
        paramzzfd = new zzak();
        paramzzfd.zzS("audio/mpeg");
        paramzzfd.zzw(1);
        paramzzfd.zzT(i);
        paramzzfd = paramzzfd.zzY();
        this.zza.zzk(paramzzfd);
        this.zzd = true;
      }
      else if ((i != 7) && (i != 8))
      {
        if (i != 10)
        {
          paramzzfd = new StringBuilder();
          paramzzfd.append("Audio format not supported: ");
          paramzzfd.append(i);
          throw new zzacv(paramzzfd.toString());
        }
      }
      else
      {
        zzak localzzak = new zzak();
        if (i == 7) {
          paramzzfd = "audio/g711-alaw";
        } else {
          paramzzfd = "audio/g711-mlaw";
        }
        localzzak.zzS(paramzzfd);
        localzzak.zzw(1);
        localzzak.zzT(8000);
        paramzzfd = localzzak.zzY();
        this.zza.zzk(paramzzfd);
        this.zzd = true;
      }
      this.zzc = true;
    }
    else
    {
      paramzzfd.zzG(1);
    }
    return true;
  }
  
  protected final boolean zzb(zzfd paramzzfd, long paramLong)
    throws zzce
  {
    if (this.zze == 2)
    {
      i = paramzzfd.zza();
      this.zza.zzq(paramzzfd, i);
      this.zza.zzs(paramLong, 1, i, 0, null);
      return true;
    }
    int i = paramzzfd.zzk();
    if ((i == 0) && (!this.zzd))
    {
      i = paramzzfd.zza();
      byte[] arrayOfByte = new byte[i];
      paramzzfd.zzB(arrayOfByte, 0, i);
      zzzl localzzzl = zzzm.zza(arrayOfByte);
      paramzzfd = new zzak();
      paramzzfd.zzS("audio/mp4a-latm");
      paramzzfd.zzx(localzzzl.zzc);
      paramzzfd.zzw(localzzzl.zzb);
      paramzzfd.zzT(localzzzl.zza);
      paramzzfd.zzI(Collections.singletonList(arrayOfByte));
      paramzzfd = paramzzfd.zzY();
      this.zza.zzk(paramzzfd);
      this.zzd = true;
      return false;
    }
    if ((this.zze == 10) && (i != 1)) {
      return false;
    }
    i = paramzzfd.zza();
    this.zza.zzq(paramzzfd, i);
    this.zza.zzs(paramLong, 1, i, 0, null);
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzacr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */