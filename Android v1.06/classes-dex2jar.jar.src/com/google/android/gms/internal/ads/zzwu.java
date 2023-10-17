package com.google.android.gms.internal.ads;

final class zzwu
  extends zzwr
{
  private final boolean zze;
  private final zzwj zzf;
  private final boolean zzg;
  private final boolean zzh;
  private final int zzi;
  private final int zzj;
  private final int zzk;
  private final int zzl;
  private final boolean zzm;
  private final int zzn;
  private final boolean zzo;
  private final boolean zzp;
  private final int zzq;
  
  public zzwu(int paramInt1, zzcz paramzzcz, int paramInt2, zzwj paramzzwj, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    super(paramInt1, paramzzcz, paramInt2);
    this.zzf = paramzzwj;
    boolean bool = paramzzwj.zzI;
    int i = 1;
    if (true != bool) {
      paramInt4 = 16;
    } else {
      paramInt4 = 24;
    }
    bool = paramzzwj.zzH;
    float f;
    if (paramBoolean)
    {
      paramzzcz = this.zzd;
      if (paramzzcz.zzr != -1) {
        paramInt1 = paramzzwj.zzd;
      }
      if (paramzzcz.zzs != -1) {
        paramInt1 = paramzzwj.zze;
      }
      f = paramzzcz.zzt;
      if (f != -1.0F)
      {
        paramInt1 = paramzzwj.zzf;
        if (f > 2.1474836E9F) {}
      }
      else
      {
        if (paramzzcz.zzi != -1) {
          paramInt1 = paramzzwj.zzg;
        }
        bool = true;
        break label136;
      }
    }
    bool = false;
    label136:
    this.zze = bool;
    if (paramBoolean)
    {
      paramzzcz = this.zzd;
      paramInt1 = paramzzcz.zzr;
      if (paramInt1 != -1)
      {
        paramInt2 = paramzzwj.zzh;
        if (paramInt1 < 0) {}
      }
      else
      {
        paramInt1 = paramzzcz.zzs;
        if (paramInt1 != -1)
        {
          paramInt2 = paramzzwj.zzi;
          if (paramInt1 < 0) {}
        }
        else
        {
          f = paramzzcz.zzt;
          if (f != -1.0F)
          {
            paramInt1 = paramzzwj.zzj;
            if (f < 0.0F) {}
          }
          else
          {
            paramInt2 = paramzzcz.zzi;
            if (paramInt2 != -1)
            {
              paramInt1 = paramzzwj.zzk;
              if (paramInt2 < 0) {}
            }
            else
            {
              paramBoolean = true;
              break label248;
            }
          }
        }
      }
    }
    paramBoolean = false;
    label248:
    this.zzg = paramBoolean;
    this.zzh = zzwv.zzm(paramInt3, false);
    paramzzcz = this.zzd;
    this.zzi = paramzzcz.zzi;
    this.zzj = paramzzcz.zza();
    paramInt1 = this.zzd.zzf;
    paramInt1 = paramzzwj.zzp;
    this.zzl = Integer.bitCount(0);
    paramInt1 = this.zzd.zzf;
    this.zzm = true;
    for (paramInt1 = 0; paramInt1 < paramzzwj.zzo.size(); paramInt1++)
    {
      paramzzcz = this.zzd.zzm;
      if ((paramzzcz != null) && (paramzzcz.equals(paramzzwj.zzo.get(paramInt1)))) {
        break label374;
      }
    }
    paramInt1 = Integer.MAX_VALUE;
    label374:
    this.zzk = paramInt1;
    if ((paramInt3 & 0x180) == 128) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    this.zzo = paramBoolean;
    if ((paramInt3 & 0x40) == 64) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    this.zzp = paramBoolean;
    paramzzcz = this.zzd;
    paramzzwj = paramzzcz.zzm;
    paramInt2 = 4;
    if (paramzzwj == null) {}
    do
    {
      paramInt2 = 0;
      break label632;
      switch (paramzzwj.hashCode())
      {
      default: 
        break;
      case 1599127257: 
        if (paramzzwj.equals("video/x-vnd.on2.vp9")) {
          paramInt1 = 3;
        }
        break;
      case 1331836730: 
        if (paramzzwj.equals("video/avc")) {
          paramInt1 = 4;
        }
        break;
      case -1662541442: 
        if (paramzzwj.equals("video/hevc")) {
          paramInt1 = 2;
        }
        break;
      case -1662735862: 
        if (paramzzwj.equals("video/av01")) {
          paramInt1 = 1;
        }
        break;
      case -1851077871: 
        if (paramzzwj.equals("video/dolby-vision")) {
          paramInt1 = 0;
        }
        break;
      }
      paramInt1 = -1;
      if (paramInt1 == 0) {
        break label630;
      }
      if (paramInt1 == 1) {
        break label632;
      }
      if (paramInt1 == 2) {
        break label625;
      }
      if (paramInt1 == 3) {
        break;
      }
    } while (paramInt1 != 4);
    paramInt2 = 1;
    break label632;
    paramInt2 = 2;
    break label632;
    label625:
    paramInt2 = 3;
    break label632;
    label630:
    paramInt2 = 5;
    label632:
    this.zzq = paramInt2;
    paramInt1 = paramzzcz.zzf;
    paramzzwj = this.zzf;
    if (!zzwv.zzm(paramInt3, paramzzwj.zzQ)) {}
    do
    {
      paramInt1 = 0;
      break;
      paramBoolean = this.zze;
    } while ((!paramBoolean) && (!paramzzwj.zzG));
    paramInt1 = i;
    if (zzwv.zzm(paramInt3, false))
    {
      paramInt1 = i;
      if (this.zzg)
      {
        paramInt1 = i;
        if (paramBoolean)
        {
          paramInt1 = i;
          if (paramzzcz.zzi != -1)
          {
            paramBoolean = paramzzwj.zzA;
            paramBoolean = paramzzwj.zzz;
            paramInt1 = i;
            if ((paramInt4 & paramInt3) != 0) {
              paramInt1 = 2;
            }
          }
        }
      }
    }
    this.zzn = paramInt1;
  }
  
  public final int zzb()
  {
    return this.zzn;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzwu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */