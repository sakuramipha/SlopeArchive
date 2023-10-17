package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzaie
  implements zzajs
{
  private final List zza;
  
  public zzaie()
  {
    this(0);
  }
  
  public zzaie(int paramInt)
  {
    this.zza = localzzfrr;
  }
  
  public zzaie(int paramInt, List paramList)
  {
    this.zza = paramList;
  }
  
  private final zzaji zzb(zzajr paramzzajr)
  {
    return new zzaji(zzd(paramzzajr));
  }
  
  private final zzajw zzc(zzajr paramzzajr)
  {
    return new zzajw(zzd(paramzzajr));
  }
  
  private final List zzd(zzajr paramzzajr)
  {
    zzfd localzzfd = new zzfd(paramzzajr.zzd);
    paramzzajr = this.zza;
    while (localzzfd.zza() > 0)
    {
      int i = localzzfd.zzk();
      int m = localzzfd.zzk();
      int n = localzzfd.zzc();
      if (i == 134)
      {
        ArrayList localArrayList = new ArrayList();
        int i1 = localzzfd.zzk();
        for (i = 0;; i++)
        {
          paramzzajr = localArrayList;
          if (i >= (i1 & 0x1F)) {
            break;
          }
          String str = localzzfd.zzx(3, zzfol.zzc);
          int k = localzzfd.zzk();
          int j;
          if ((k & 0x80) != 0) {
            j = 1;
          } else {
            j = 0;
          }
          if (j != 0)
          {
            k &= 0x3F;
            paramzzajr = "application/cea-708";
          }
          else
          {
            paramzzajr = "application/cea-608";
            k = 1;
          }
          int i2 = (byte)localzzfd.zzk();
          localzzfd.zzG(1);
          Object localObject;
          if (j != 0)
          {
            j = zzea.zza;
            if ((i2 & 0x40) != 0)
            {
              localObject = new byte[1];
              localObject[0] = 1;
            }
            else
            {
              localObject = new byte[1];
              localObject[0] = 0;
            }
            localObject = Collections.singletonList(localObject);
          }
          else
          {
            localObject = null;
          }
          zzak localzzak = new zzak();
          localzzak.zzS(paramzzajr);
          localzzak.zzK(str);
          localzzak.zzu(k);
          localzzak.zzI((List)localObject);
          localArrayList.add(localzzak.zzY());
        }
      }
      localzzfd.zzF(n + m);
    }
    return paramzzajr;
  }
  
  public final zzaju zza(int paramInt, zzajr paramzzajr)
  {
    if (paramInt != 2) {
      if ((paramInt != 3) && (paramInt != 4))
      {
        if (paramInt != 21)
        {
          if (paramInt != 27)
          {
            if (paramInt != 36)
            {
              if (paramInt != 89)
              {
                if (paramInt != 138)
                {
                  if (paramInt != 172)
                  {
                    if (paramInt != 257)
                    {
                      if (paramInt != 128)
                      {
                        if (paramInt != 129) {
                          if (paramInt != 134)
                          {
                            if (paramInt != 135)
                            {
                              switch (paramInt)
                              {
                              default: 
                                return null;
                              case 17: 
                                return new zzaiy(new zzaiu(paramzzajr.zzb));
                              case 16: 
                                return new zzaiy(new zzaim(zzc(paramzzajr)));
                              }
                              return new zzaiy(new zzaid(false, paramzzajr.zzb));
                            }
                          }
                          else {
                            return new zzajh(new zzaix("application/x-scte35"));
                          }
                        }
                        return new zzaiy(new zzahx(paramzzajr.zzb));
                      }
                    }
                    else {
                      return new zzajh(new zzaix("application/vnd.dvb.ait"));
                    }
                  }
                  else {
                    return new zzaiy(new zzaia(paramzzajr.zzb));
                  }
                }
                else {
                  return new zzaiy(new zzaif(paramzzajr.zzb));
                }
              }
              else {
                return new zzaiy(new zzaig(paramzzajr.zzc));
              }
            }
            else {
              return new zzaiy(new zzais(zzb(paramzzajr)));
            }
          }
          else {
            return new zzaiy(new zzaiq(zzb(paramzzajr), false, false));
          }
        }
        else {
          return new zzaiy(new zzait());
        }
      }
      else {
        return new zzaiy(new zzaiv(paramzzajr.zzb));
      }
    }
    return new zzaiy(new zzaij(zzc(paramzzajr)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */