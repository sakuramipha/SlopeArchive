package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class zzacu
  extends zzacw
{
  private long zzb = -9223372036854775807L;
  private long[] zzc = new long[0];
  private long[] zzd = new long[0];
  
  public zzacu()
  {
    super(new zzaan());
  }
  
  private static Double zzg(zzfd paramzzfd)
  {
    return Double.valueOf(Double.longBitsToDouble(paramzzfd.zzr()));
  }
  
  private static Object zzh(zzfd paramzzfd, int paramInt)
  {
    if (paramInt != 0)
    {
      boolean bool = false;
      int i = 0;
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          Object localObject2;
          if (paramInt != 3)
          {
            if (paramInt != 8)
            {
              if (paramInt != 10)
              {
                if (paramInt != 11) {
                  return null;
                }
                localObject1 = new Date(zzg(paramzzfd).doubleValue());
                paramzzfd.zzG(2);
                return localObject1;
              }
              int j = paramzzfd.zzn();
              localObject1 = new ArrayList(j);
              for (paramInt = i; paramInt < j; paramInt++)
              {
                localObject2 = zzh(paramzzfd, paramzzfd.zzk());
                if (localObject2 != null) {
                  ((ArrayList)localObject1).add(localObject2);
                }
              }
              return localObject1;
            }
            return zzj(paramzzfd);
          }
          Object localObject1 = new HashMap();
          for (;;)
          {
            localObject2 = zzi(paramzzfd);
            paramInt = paramzzfd.zzk();
            if (paramInt == 9) {
              return localObject1;
            }
            Object localObject3 = zzh(paramzzfd, paramInt);
            if (localObject3 != null) {
              ((HashMap)localObject1).put(localObject2, localObject3);
            }
          }
        }
        return zzi(paramzzfd);
      }
      if (paramzzfd.zzk() == 1) {
        bool = true;
      }
      return Boolean.valueOf(bool);
    }
    return zzg(paramzzfd);
  }
  
  private static String zzi(zzfd paramzzfd)
  {
    int i = paramzzfd.zzo();
    int j = paramzzfd.zzc();
    paramzzfd.zzG(i);
    return new String(paramzzfd.zzH(), j, i);
  }
  
  private static HashMap zzj(zzfd paramzzfd)
  {
    int j = paramzzfd.zzn();
    HashMap localHashMap = new HashMap(j);
    for (int i = 0; i < j; i++)
    {
      String str = zzi(paramzzfd);
      Object localObject = zzh(paramzzfd, paramzzfd.zzk());
      if (localObject != null) {
        localHashMap.put(str, localObject);
      }
    }
    return localHashMap;
  }
  
  protected final boolean zza(zzfd paramzzfd)
  {
    return true;
  }
  
  protected final boolean zzb(zzfd paramzzfd, long paramLong)
  {
    if (paramzzfd.zzk() != 2) {
      return false;
    }
    if (!"onMetaData".equals(zzi(paramzzfd))) {
      return false;
    }
    if (paramzzfd.zza() != 0)
    {
      if (paramzzfd.zzk() != 8) {
        return false;
      }
      paramzzfd = zzj(paramzzfd);
      Object localObject1 = paramzzfd.get("duration");
      if ((localObject1 instanceof Double))
      {
        double d = ((Double)localObject1).doubleValue();
        if (d > 0.0D) {
          this.zzb = ((d * 1000000.0D));
        }
      }
      paramzzfd = paramzzfd.get("keyframes");
      if ((paramzzfd instanceof Map))
      {
        localObject1 = (Map)paramzzfd;
        paramzzfd = ((Map)localObject1).get("filepositions");
        localObject1 = ((Map)localObject1).get("times");
        if (((paramzzfd instanceof List)) && ((localObject1 instanceof List)))
        {
          paramzzfd = (List)paramzzfd;
          List localList = (List)localObject1;
          int j = localList.size();
          this.zzc = new long[j];
          this.zzd = new long[j];
          int i = 0;
          while (i < j)
          {
            Object localObject2 = paramzzfd.get(i);
            localObject1 = localList.get(i);
            if (((localObject1 instanceof Double)) && ((localObject2 instanceof Double)))
            {
              this.zzc[i] = ((((Double)localObject1).doubleValue() * 1000000.0D));
              this.zzd[i] = ((Double)localObject2).longValue();
              i++;
            }
            else
            {
              this.zzc = new long[0];
              this.zzd = new long[0];
            }
          }
        }
      }
    }
    return false;
  }
  
  public final long zzc()
  {
    return this.zzb;
  }
  
  public final long[] zzd()
  {
    return this.zzd;
  }
  
  public final long[] zze()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzacu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */