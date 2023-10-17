package com.google.android.gms.internal.ads;

final class zzacx
  extends zzacw
{
  private final zzfd zzb = new zzfd(zzew.zza);
  private final zzfd zzc = new zzfd(4);
  private int zzd;
  private boolean zze;
  private boolean zzf;
  private int zzg;
  
  public zzacx(zzabr paramzzabr)
  {
    super(paramzzabr);
  }
  
  protected final boolean zza(zzfd paramzzfd)
    throws zzacv
  {
    int j = paramzzfd.zzk();
    int i = j >> 4;
    j &= 0xF;
    if (j == 7)
    {
      this.zzg = i;
      return i != 5;
    }
    paramzzfd = new StringBuilder();
    paramzzfd.append("Video format not supported: ");
    paramzzfd.append(j);
    throw new zzacv(paramzzfd.toString());
  }
  
  protected final boolean zzb(zzfd paramzzfd, long paramLong)
    throws zzce
  {
    int i = paramzzfd.zzk();
    long l = paramzzfd.zzf();
    Object localObject;
    if (i == 0)
    {
      if (!this.zze)
      {
        localObject = new zzfd(new byte[paramzzfd.zza()]);
        paramzzfd.zzB(((zzfd)localObject).zzH(), 0, paramzzfd.zza());
        paramzzfd = zzzt.zza((zzfd)localObject);
        this.zzd = paramzzfd.zzb;
        localObject = new zzak();
        ((zzak)localObject).zzS("video/avc");
        ((zzak)localObject).zzx(paramzzfd.zzi);
        ((zzak)localObject).zzX(paramzzfd.zzc);
        ((zzak)localObject).zzF(paramzzfd.zzd);
        ((zzak)localObject).zzP(paramzzfd.zzh);
        ((zzak)localObject).zzI(paramzzfd.zza);
        paramzzfd = ((zzak)localObject).zzY();
        this.zza.zzk(paramzzfd);
        this.zze = true;
        return false;
      }
    }
    else if ((i == 1) && (this.zze))
    {
      if (this.zzg == 1) {
        i = 1;
      } else {
        i = 0;
      }
      if ((!this.zzf) && (i == 0)) {
        return false;
      }
      localObject = this.zzc.zzH();
      localObject[0] = 0;
      localObject[1] = 0;
      localObject[2] = 0;
      int k = this.zzd;
      int m;
      for (int j = 0; paramzzfd.zza() > 0; j = j + 4 + m)
      {
        paramzzfd.zzB(this.zzc.zzH(), 4 - k, this.zzd);
        this.zzc.zzF(0);
        m = this.zzc.zzn();
        this.zzb.zzF(0);
        this.zza.zzq(this.zzb, 4);
        this.zza.zzq(paramzzfd, m);
      }
      this.zza.zzs(paramLong + l * 1000L, i, j, 0, null);
      this.zzf = true;
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzacx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */