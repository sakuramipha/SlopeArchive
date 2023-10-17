package com.google.android.gms.internal.ads;

import java.util.List;

final class zzaci
  implements zzaca
{
  public final zzfrr zza;
  private final int zzb;
  
  private zzaci(int paramInt, zzfrr paramzzfrr)
  {
    this.zzb = paramInt;
    this.zza = paramzzfrr;
  }
  
  public static zzaci zzc(int paramInt, zzfd paramzzfd)
  {
    zzfro localzzfro = new zzfro();
    int k = paramzzfd.zzd();
    int j;
    for (int i = -2; paramzzfd.zza() > 8; i = j)
    {
      j = paramzzfd.zzg();
      int m = paramzzfd.zzg();
      m = paramzzfd.zzc() + m;
      paramzzfd.zzE(m);
      Object localObject2 = null;
      Object localObject1;
      if (j == 1414744396) {
        localObject1 = zzc(paramzzfd.zzg(), paramzzfd);
      } else {
        switch (j)
        {
        default: 
          localObject1 = localObject2;
          break;
        case 1852994675: 
          localObject1 = zzack.zzb(paramzzfd);
          break;
        case 1752331379: 
          localObject1 = zzacg.zzb(paramzzfd);
          break;
        case 1751742049: 
          localObject1 = zzacf.zzb(paramzzfd);
          break;
        case 1718776947: 
          int i1;
          int n;
          if (i == 2)
          {
            paramzzfd.zzG(4);
            i1 = paramzzfd.zzg();
            n = paramzzfd.zzg();
            paramzzfd.zzG(4);
            j = paramzzfd.zzg();
            switch (j)
            {
            default: 
              localObject1 = null;
              break;
            case 1196444237: 
            case 1735420525: 
              localObject1 = "video/mjpeg";
              break;
            case 859066445: 
              localObject1 = "video/mp43";
              break;
            case 842289229: 
              localObject1 = "video/mp42";
              break;
            case 826496577: 
            case 828601953: 
            case 875967048: 
              localObject1 = "video/avc";
              break;
            case 808802372: 
            case 877677894: 
            case 1145656883: 
            case 1145656920: 
            case 1482049860: 
            case 1684633208: 
            case 2021026148: 
              localObject1 = "video/mp4v-es";
            }
            if (localObject1 == null)
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Ignoring track with unsupported compression ");
              ((StringBuilder)localObject1).append(j);
              zzer.zze("StreamFormatChunk", ((StringBuilder)localObject1).toString());
              localObject1 = localObject2;
            }
            else
            {
              localObject2 = new zzak();
              ((zzak)localObject2).zzX(i1);
              ((zzak)localObject2).zzF(n);
              ((zzak)localObject2).zzS((String)localObject1);
              localObject1 = new zzacj(((zzak)localObject2).zzY());
            }
          }
          else if (i == 1)
          {
            j = paramzzfd.zzi();
            if (j != 1)
            {
              if (j != 85)
              {
                if (j != 255)
                {
                  if (j != 8192)
                  {
                    if (j != 8193) {
                      localObject1 = null;
                    } else {
                      localObject1 = "audio/vnd.dts";
                    }
                  }
                  else {
                    localObject1 = "audio/ac3";
                  }
                }
                else {
                  localObject1 = "audio/mp4a-latm";
                }
              }
              else {
                localObject1 = "audio/mpeg";
              }
            }
            else {
              localObject1 = "audio/raw";
            }
            if (localObject1 == null)
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Ignoring track with unsupported format tag ");
              ((StringBuilder)localObject1).append(j);
              zzer.zze("StreamFormatChunk", ((StringBuilder)localObject1).toString());
              localObject1 = localObject2;
            }
            else
            {
              j = paramzzfd.zzi();
              i1 = paramzzfd.zzg();
              paramzzfd.zzG(6);
              int i2 = zzfn.zzj(paramzzfd.zzo());
              n = paramzzfd.zzi();
              localObject2 = new byte[n];
              paramzzfd.zzB((byte[])localObject2, 0, n);
              zzak localzzak = new zzak();
              localzzak.zzS((String)localObject1);
              localzzak.zzw(j);
              localzzak.zzT(i1);
              if (("audio/raw".equals(localObject1)) && (i2 != 0)) {
                localzzak.zzN(i2);
              }
              if (("audio/mp4a-latm".equals(localObject1)) && (n > 0)) {
                localzzak.zzI(zzfrr.zzm(localObject2));
              }
              localObject1 = new zzacj(localzzak.zzY());
            }
          }
          else
          {
            zzer.zze("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfn.zzx(i)));
            localObject1 = localObject2;
          }
          break;
        }
      }
      j = i;
      if (localObject1 != null)
      {
        if (((zzaca)localObject1).zza() == 1752331379)
        {
          i = ((zzacg)localObject1).zza;
          if (i != 1935960438)
          {
            if (i != 1935963489)
            {
              if (i != 1937012852)
              {
                zzer.zze("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
                i = -1;
              }
              else
              {
                i = 3;
              }
            }
            else {
              i = 1;
            }
          }
          else {
            i = 2;
          }
        }
        localzzfro.zzf(localObject1);
        j = i;
      }
      paramzzfd.zzF(m);
      paramzzfd.zzE(k);
    }
    return new zzaci(paramInt, localzzfro.zzi());
  }
  
  public final int zza()
  {
    return this.zzb;
  }
  
  public final zzaca zzb(Class paramClass)
  {
    zzfrr localzzfrr = this.zza;
    int j = localzzfrr.size();
    int i = 0;
    while (i < j)
    {
      zzaca localzzaca = (zzaca)localzzfrr.get(i);
      Class localClass = localzzaca.getClass();
      i++;
      if (localClass == paramClass) {
        return localzzaca;
      }
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */