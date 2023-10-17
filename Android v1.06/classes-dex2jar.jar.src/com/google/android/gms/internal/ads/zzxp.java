package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class zzxp
  implements zzxl, zzgz
{
  public static final zzfrr zza;
  public static final zzfrr zzb;
  public static final zzfrr zzc;
  public static final zzfrr zzd;
  public static final zzfrr zze;
  public static final zzfrr zzf;
  private static zzxp zzg;
  private final zzfru zzh;
  private final zzxj zzi;
  private final zzye zzj;
  private final zzdz zzk;
  private final boolean zzl;
  private int zzm;
  private long zzn;
  private long zzo;
  private int zzp;
  private long zzq;
  private long zzr;
  private long zzs;
  private long zzt;
  
  static
  {
    Long localLong1 = Long.valueOf(2300000L);
    zza = zzfrr.zzp(Long.valueOf(4400000L), Long.valueOf(3200000L), localLong1, Long.valueOf(1600000L), Long.valueOf(810000L));
    Long localLong4 = Long.valueOf(1400000L);
    Long localLong2 = Long.valueOf(990000L);
    zzb = zzfrr.zzp(localLong4, localLong2, Long.valueOf(730000L), Long.valueOf(510000L), Long.valueOf(230000L));
    Long localLong3 = Long.valueOf(1000000L);
    zzc = zzfrr.zzp(Long.valueOf(2100000L), localLong4, localLong3, Long.valueOf(890000L), Long.valueOf(640000L));
    Long localLong5 = Long.valueOf(1700000L);
    zzd = zzfrr.zzp(Long.valueOf(2600000L), localLong5, Long.valueOf(1300000L), localLong3, Long.valueOf(700000L));
    zze = zzfrr.zzp(Long.valueOf(5700000L), Long.valueOf(3700000L), localLong1, localLong5, localLong2);
    zzf = zzfrr.zzp(Long.valueOf(2800000L), Long.valueOf(1800000L), localLong4, Long.valueOf(1100000L), Long.valueOf(870000L));
  }
  
  public static zzxp zzg(Context paramContext)
  {
    try
    {
      if (zzg == null)
      {
        if (paramContext == null) {}
        for (Context localContext = null;; localContext = paramContext.getApplicationContext()) {
          break;
        }
        int i = zzfn.zza;
        if (paramContext != null)
        {
          paramContext = (TelephonyManager)paramContext.getSystemService("phone");
          if (paramContext != null)
          {
            paramContext = paramContext.getNetworkCountryIso();
            if (!TextUtils.isEmpty(paramContext))
            {
              paramContext = zzfof.zzb(paramContext);
              break label78;
            }
          }
        }
        paramContext = zzfof.zzb(Locale.getDefault().getCountry());
        label78:
        Object localObject2 = zzm(paramContext);
        paramContext = new java/util/HashMap;
        paramContext.<init>(8);
        paramContext.put(Integer.valueOf(0), Long.valueOf(1000000L));
        Object localObject1 = zza;
        paramContext.put(Integer.valueOf(2), (Long)((zzfrr)localObject1).get(localObject2[0]));
        paramContext.put(Integer.valueOf(3), (Long)zzb.get(localObject2[1]));
        paramContext.put(Integer.valueOf(4), (Long)zzc.get(localObject2[2]));
        paramContext.put(Integer.valueOf(5), (Long)zzd.get(localObject2[3]));
        paramContext.put(Integer.valueOf(10), (Long)zze.get(localObject2[4]));
        paramContext.put(Integer.valueOf(9), (Long)zzf.get(localObject2[5]));
        paramContext.put(Integer.valueOf(7), (Long)((zzfrr)localObject1).get(localObject2[0]));
        localObject1 = zzdz.zza;
        localObject2 = new com/google/android/gms/internal/ads/zzxp;
        ((zzxp)localObject2).<init>(localContext, paramContext, 2000, (zzdz)localObject1, true, null);
        zzg = (zzxp)localObject2;
      }
      paramContext = zzg;
      return paramContext;
    }
    finally {}
  }
  
  private final long zzi(int paramInt)
  {
    Object localObject2 = (Long)this.zzh.get(Integer.valueOf(paramInt));
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = (Long)this.zzh.get(Integer.valueOf(0));
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = Long.valueOf(1000000L);
    }
    return ((Long)localObject2).longValue();
  }
  
  private final void zzj(int paramInt, long paramLong1, long paramLong2)
  {
    if (paramInt == 0)
    {
      if (paramLong1 == 0L) {
        if (paramLong2 != this.zzt) {
          paramLong1 = 0L;
        } else {
          return;
        }
      }
      paramInt = 0;
    }
    this.zzt = paramLong2;
    this.zzi.zzb(paramInt, paramLong1, paramLong2);
  }
  
  private final void zzk(int paramInt)
  {
    try
    {
      int i = this.zzp;
      if (i != 0)
      {
        boolean bool = this.zzl;
        if (!bool) {
          return;
        }
      }
      if (i == paramInt) {
        return;
      }
      this.zzp = paramInt;
      if ((paramInt != 1) && (paramInt != 0) && (paramInt != 8))
      {
        this.zzs = zzi(paramInt);
        long l = SystemClock.elapsedRealtime();
        if (this.zzm > 0) {
          paramInt = (int)(l - this.zzn);
        } else {
          paramInt = 0;
        }
        zzj(paramInt, this.zzo, this.zzs);
        this.zzn = l;
        this.zzo = 0L;
        this.zzr = 0L;
        this.zzq = 0L;
        this.zzj.zzc();
        return;
      }
      return;
    }
    finally {}
  }
  
  private static boolean zzl(zzgc paramzzgc, boolean paramBoolean)
  {
    return (paramBoolean) && (!paramzzgc.zza(8));
  }
  
  private static int[] zzm(String paramString)
  {
    int i = paramString.hashCode();
    if (i != 2091)
    {
      if (i != 2092)
      {
        if (i != 2102)
        {
          if (i != 2103)
          {
            if (i != 2111)
            {
              if (i != 2112)
              {
                if (i != 2135)
                {
                  if (i != 2136)
                  {
                    switch (i)
                    {
                    default: 
                      switch (i)
                      {
                      default: 
                        switch (i)
                        {
                        default: 
                          switch (i)
                          {
                          default: 
                            switch (i)
                            {
                            default: 
                              switch (i)
                              {
                              default: 
                                break;
                              case 2150: 
                                if (!paramString.equals("CI")) {
                                  break label9329;
                                }
                                break;
                              case 2149: 
                                if (!paramString.equals("CH")) {
                                  break label9329;
                                }
                                return new int[] { 0, 0, 0, 0, 0, 3 };
                              case 2148: 
                                if (!paramString.equals("CG")) {
                                  break label9329;
                                }
                                break;
                              case 2147: 
                                if (!paramString.equals("CF")) {
                                  break label9329;
                                }
                              }
                              break;
                            case 2130: 
                              if (!paramString.equals("BT")) {
                                break label9329;
                              }
                              break;
                            case 2129: 
                              if (!paramString.equals("BS")) {
                                break label9329;
                              }
                              break;
                            case 2128: 
                              if (!paramString.equals("BR")) {
                                break label9329;
                              }
                              return new int[] { 1, 1, 2, 1, 1, 0 };
                            case 2127: 
                              if (!paramString.equals("BQ")) {
                                break label9329;
                              }
                            }
                            break;
                          case 2125: 
                            if (!paramString.equals("BO")) {
                              break label9329;
                            }
                            return new int[] { 1, 2, 3, 2, 2, 2 };
                          case 2124: 
                            if (!paramString.equals("BN")) {
                              break label9329;
                            }
                            return new int[] { 3, 2, 0, 1, 2, 2 };
                          case 2123: 
                            if (!paramString.equals("BM")) {
                              break label9329;
                            }
                            break;
                          case 2122: 
                            if (!paramString.equals("BL")) {
                              break label9329;
                            }
                          }
                          break;
                        case 2100: 
                          if (!paramString.equals("AU")) {
                            break label9329;
                          }
                          return new int[] { 0, 2, 1, 1, 3, 0 };
                        case 2099: 
                          if (!paramString.equals("AT")) {
                            break label9329;
                          }
                          return new int[] { 1, 2, 1, 4, 1, 4 };
                        case 2098: 
                          if (!paramString.equals("AS")) {
                            break label9329;
                          }
                          return new int[] { 2, 2, 3, 3, 2, 2 };
                        }
                      case 2877: 
                        if (!paramString.equals("ZW")) {
                          break label9329;
                        }
                        break;
                      case 2867: 
                        if (!paramString.equals("ZM")) {
                          break label9329;
                        }
                        return new int[] { 4, 4, 4, 3, 3, 2 };
                      case 2855: 
                        if (!paramString.equals("ZA")) {
                          break label9329;
                        }
                        return new int[] { 2, 3, 2, 1, 2, 2 };
                      case 2843: 
                        if (!paramString.equals("YT")) {
                          break label9329;
                        }
                        return new int[] { 2, 3, 3, 4, 2, 2 };
                      case 2828: 
                        if (!paramString.equals("YE")) {
                          break label9329;
                        }
                        break;
                      case 2803: 
                        if (!paramString.equals("XK")) {
                          break label9329;
                        }
                        return new int[] { 1, 2, 1, 1, 2, 2 };
                      case 2780: 
                        if (!paramString.equals("WS")) {
                          break label9329;
                        }
                        break;
                      case 2767: 
                        if (!paramString.equals("WF")) {
                          break label9329;
                        }
                        break;
                      case 2751: 
                        if (!paramString.equals("VU")) {
                          break label9329;
                        }
                        return new int[] { 4, 3, 3, 1, 2, 2 };
                      case 2744: 
                        if (!paramString.equals("VN")) {
                          break label9329;
                        }
                        return new int[] { 0, 0, 1, 2, 2, 1 };
                      case 2739: 
                        if (!paramString.equals("VI")) {
                          break label9329;
                        }
                        return new int[] { 0, 2, 1, 2, 2, 2 };
                      case 2737: 
                        if (!paramString.equals("VG")) {
                          break label9329;
                        }
                        return new int[] { 2, 2, 0, 1, 2, 2 };
                      case 2735: 
                        if (!paramString.equals("VE")) {
                          break label9329;
                        }
                        break;
                      case 2733: 
                        if (!paramString.equals("VC")) {
                          break label9329;
                        }
                        break;
                      case 2731: 
                        if (!paramString.equals("VA")) {
                          break label9329;
                        }
                        break;
                      case 2725: 
                        if (!paramString.equals("UZ")) {
                          break label9329;
                        }
                        return new int[] { 2, 2, 3, 4, 3, 2 };
                      case 2724: 
                        if (!paramString.equals("UY")) {
                          break label9329;
                        }
                        break;
                      case 2718: 
                        if (!paramString.equals("US")) {
                          break label9329;
                        }
                        return new int[] { 1, 1, 4, 1, 3, 1 };
                      case 2706: 
                        if (!paramString.equals("UG")) {
                          break label9329;
                        }
                        break;
                      case 2700: 
                        if (!paramString.equals("UA")) {
                          break label9329;
                        }
                        return new int[] { 0, 1, 1, 2, 4, 2 };
                      case 2694: 
                        if (!paramString.equals("TZ")) {
                          break label9329;
                        }
                        break;
                      case 2691: 
                        if (!paramString.equals("TW")) {
                          break label9329;
                        }
                        return new int[] { 0, 2, 0, 0, 0, 0 };
                      case 2690: 
                        if (!paramString.equals("TV")) {
                          break label9329;
                        }
                        break;
                      case 2688: 
                        if (!paramString.equals("TT")) {
                          break label9329;
                        }
                        return new int[] { 1, 4, 0, 0, 2, 2 };
                      case 2686: 
                        if (!paramString.equals("TR")) {
                          break label9329;
                        }
                        return new int[] { 1, 0, 0, 1, 3, 2 };
                      case 2683: 
                        if (!paramString.equals("TO")) {
                          break label9329;
                        }
                        break;
                      case 2682: 
                        if (!paramString.equals("TN")) {
                          break label9329;
                        }
                        return new int[] { 2, 1, 1, 1, 2, 2 };
                      case 2681: 
                        if (!paramString.equals("TM")) {
                          break label9329;
                        }
                        break;
                      case 2680: 
                        if (!paramString.equals("TL")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 4, 4, 2, 2 };
                      case 2679: 
                        if (!paramString.equals("TK")) {
                          break label9329;
                        }
                        break;
                      case 2678: 
                        if (!paramString.equals("TJ")) {
                          break label9329;
                        }
                        break;
                      case 2676: 
                        if (!paramString.equals("TH")) {
                          break label9329;
                        }
                        return new int[] { 0, 1, 2, 1, 2, 2 };
                      case 2675: 
                        if (!paramString.equals("TG")) {
                          break label9329;
                        }
                        break;
                      case 2672: 
                        if (!paramString.equals("TD")) {
                          break label9329;
                        }
                        break;
                      case 2671: 
                        if (!paramString.equals("TC")) {
                          break label9329;
                        }
                        return new int[] { 2, 2, 1, 3, 2, 2 };
                      case 2663: 
                        if (!paramString.equals("SZ")) {
                          break label9329;
                        }
                        return new int[] { 4, 4, 3, 4, 2, 2 };
                      case 2662: 
                        if (!paramString.equals("SY")) {
                          break label9329;
                        }
                        break;
                      case 2661: 
                        if (!paramString.equals("SX")) {
                          break label9329;
                        }
                        break;
                      case 2659: 
                        if (!paramString.equals("SV")) {
                          break label9329;
                        }
                        break;
                      case 2657: 
                        if (!paramString.equals("ST")) {
                          break label9329;
                        }
                        return new int[] { 2, 2, 1, 2, 2, 2 };
                      case 2656: 
                        if (!paramString.equals("SS")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 2, 3, 2, 2 };
                      case 2655: 
                        if (!paramString.equals("SR")) {
                          break label9329;
                        }
                        return new int[] { 2, 4, 3, 0, 2, 2 };
                      case 2652: 
                        if (!paramString.equals("SO")) {
                          break label9329;
                        }
                        return new int[] { 3, 2, 2, 4, 4, 2 };
                      case 2651: 
                        if (!paramString.equals("SN")) {
                          break label9329;
                        }
                        break;
                      case 2650: 
                        if (!paramString.equals("SM")) {
                          break label9329;
                        }
                        break;
                      case 2649: 
                        if (!paramString.equals("SL")) {
                          break label9329;
                        }
                        break;
                      case 2648: 
                        if (!paramString.equals("SK")) {
                          break label9329;
                        }
                        return new int[] { 1, 1, 1, 1, 3, 2 };
                      case 2647: 
                        if (!paramString.equals("SJ")) {
                          break label9329;
                        }
                        break;
                      case 2646: 
                        if (!paramString.equals("SI")) {
                          break label9329;
                        }
                        break;
                      case 2645: 
                        if (!paramString.equals("SH")) {
                          break label9329;
                        }
                        break;
                      case 2644: 
                        if (!paramString.equals("SG")) {
                          break label9329;
                        }
                        return new int[] { 2, 3, 3, 3, 3, 3 };
                      case 2642: 
                        if (!paramString.equals("SE")) {
                          break label9329;
                        }
                        return new int[] { 0, 1, 1, 1, 0, 2 };
                      case 2641: 
                        if (!paramString.equals("SD")) {
                          break label9329;
                        }
                        return new int[] { 4, 3, 4, 2, 2, 2 };
                      case 2640: 
                        if (!paramString.equals("SC")) {
                          break label9329;
                        }
                        return new int[] { 4, 3, 1, 1, 2, 2 };
                      case 2639: 
                        if (!paramString.equals("SB")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 4, 2, 2, 2 };
                      case 2638: 
                        if (!paramString.equals("SA")) {
                          break label9329;
                        }
                        break;
                      case 2629: 
                        if (!paramString.equals("RW")) {
                          break label9329;
                        }
                        return new int[] { 3, 3, 1, 0, 2, 2 };
                      case 2627: 
                        if (!paramString.equals("RU")) {
                          break label9329;
                        }
                        return new int[] { 1, 0, 0, 0, 3, 3 };
                      case 2625: 
                        if (!paramString.equals("RS")) {
                          break label9329;
                        }
                        return new int[] { 2, 0, 0, 0, 2, 2 };
                      case 2621: 
                        if (!paramString.equals("RO")) {
                          break label9329;
                        }
                        return new int[] { 0, 0, 1, 2, 1, 2 };
                      case 2611: 
                        if (!paramString.equals("RE")) {
                          break label9329;
                        }
                        return new int[] { 1, 2, 2, 3, 1, 2 };
                      case 2576: 
                        if (!paramString.equals("QA")) {
                          break label9329;
                        }
                        return new int[] { 1, 4, 4, 4, 4, 2 };
                      case 2569: 
                        if (!paramString.equals("PY")) {
                          break label9329;
                        }
                        break;
                      case 2567: 
                        if (!paramString.equals("PW")) {
                          break label9329;
                        }
                        return new int[] { 2, 2, 4, 2, 2, 2 };
                      case 2564: 
                        if (!paramString.equals("PT")) {
                          break label9329;
                        }
                        return new int[] { 1, 0, 0, 0, 1, 2 };
                      case 2563: 
                        if (!paramString.equals("PS")) {
                          break label9329;
                        }
                        return new int[] { 3, 4, 1, 4, 2, 2 };
                      case 2562: 
                        if (!paramString.equals("PR")) {
                          break label9329;
                        }
                        return new int[] { 2, 0, 2, 0, 2, 1 };
                      case 2557: 
                        if (!paramString.equals("PM")) {
                          break label9329;
                        }
                        break;
                      case 2556: 
                        if (!paramString.equals("PL")) {
                          break label9329;
                        }
                        return new int[] { 2, 1, 2, 2, 4, 2 };
                      case 2555: 
                        if (!paramString.equals("PK")) {
                          break label9329;
                        }
                        break;
                      case 2552: 
                        if (!paramString.equals("PH")) {
                          break label9329;
                        }
                        return new int[] { 2, 1, 3, 2, 2, 0 };
                      case 2551: 
                        if (!paramString.equals("PG")) {
                          break label9329;
                        }
                        break;
                      case 2550: 
                        if (!paramString.equals("PF")) {
                          break label9329;
                        }
                        return new int[] { 2, 3, 3, 1, 2, 2 };
                      case 2549: 
                        if (!paramString.equals("PE")) {
                          break label9329;
                        }
                        return new int[] { 1, 2, 4, 4, 3, 2 };
                      case 2545: 
                        if (!paramString.equals("PA")) {
                          break label9329;
                        }
                        return new int[] { 2, 3, 3, 3, 2, 2 };
                      case 2526: 
                        if (!paramString.equals("OM")) {
                          break label9329;
                        }
                        return new int[] { 2, 3, 1, 3, 4, 2 };
                      case 2508: 
                        if (!paramString.equals("NZ")) {
                          break label9329;
                        }
                        return new int[] { 1, 0, 2, 2, 4, 2 };
                      case 2503: 
                        if (!paramString.equals("NU")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 2, 1, 2, 2 };
                      case 2500: 
                        if (!paramString.equals("NR")) {
                          break label9329;
                        }
                        return new int[] { 4, 0, 3, 2, 2, 2 };
                      case 2498: 
                        if (!paramString.equals("NP")) {
                          break label9329;
                        }
                        return new int[] { 2, 1, 4, 3, 2, 2 };
                      case 2497: 
                        if (!paramString.equals("NO")) {
                          break label9329;
                        }
                        return new int[] { 0, 1, 2, 1, 1, 2 };
                      case 2494: 
                        if (!paramString.equals("NL")) {
                          break label9329;
                        }
                        return new int[] { 0, 2, 3, 3, 0, 4 };
                      case 2491: 
                        if (!paramString.equals("NI")) {
                          break label9329;
                        }
                        return new int[] { 2, 3, 4, 3, 2, 2 };
                      case 2489: 
                        if (!paramString.equals("NG")) {
                          break label9329;
                        }
                        return new int[] { 3, 4, 2, 1, 2, 2 };
                      case 2487: 
                        if (!paramString.equals("NE")) {
                          break label9329;
                        }
                        break;
                      case 2485: 
                        if (!paramString.equals("NC")) {
                          break label9329;
                        }
                        return new int[] { 3, 2, 3, 4, 2, 2 };
                      case 2483: 
                        if (!paramString.equals("NA")) {
                          break label9329;
                        }
                        return new int[] { 3, 4, 3, 2, 2, 2 };
                      case 2477: 
                        if (!paramString.equals("MZ")) {
                          break label9329;
                        }
                        return new int[] { 3, 1, 2, 1, 2, 2 };
                      case 2476: 
                        if (!paramString.equals("MY")) {
                          break label9329;
                        }
                        return new int[] { 1, 0, 4, 1, 2, 2 };
                      case 2475: 
                        if (!paramString.equals("MX")) {
                          break label9329;
                        }
                        return new int[] { 3, 4, 4, 4, 2, 2 };
                      case 2474: 
                        if (!paramString.equals("MW")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 3, 3, 2, 2 };
                      case 2473: 
                        if (!paramString.equals("MV")) {
                          break label9329;
                        }
                        return new int[] { 3, 4, 1, 3, 3, 2 };
                      case 2472: 
                        if (!paramString.equals("MU")) {
                          break label9329;
                        }
                        return new int[] { 3, 1, 1, 2, 2, 2 };
                      case 2471: 
                        if (!paramString.equals("MT")) {
                          break label9329;
                        }
                        break;
                      case 2470: 
                        if (!paramString.equals("MS")) {
                          break label9329;
                        }
                        break;
                      case 2469: 
                        if (!paramString.equals("MR")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 3, 4, 2, 2 };
                      case 2468: 
                        if (!paramString.equals("MQ")) {
                          break label9329;
                        }
                        break;
                      case 2467: 
                        if (!paramString.equals("MP")) {
                          break label9329;
                        }
                        break;
                      case 2466: 
                        if (!paramString.equals("MO")) {
                          break label9329;
                        }
                        return new int[] { 0, 2, 4, 4, 4, 2 };
                      case 2465: 
                        if (!paramString.equals("MN")) {
                          break label9329;
                        }
                        return new int[] { 2, 0, 1, 2, 2, 2 };
                      case 2464: 
                        if (!paramString.equals("MM")) {
                          break label9329;
                        }
                        return new int[] { 2, 2, 2, 3, 4, 2 };
                      case 2463: 
                        if (!paramString.equals("ML")) {
                          break label9329;
                        }
                        return new int[] { 3, 4, 2, 2, 2, 2 };
                      case 2462: 
                        if (!paramString.equals("MK")) {
                          break label9329;
                        }
                        return new int[] { 2, 0, 0, 1, 3, 2 };
                      case 2459: 
                        if (!paramString.equals("MH")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 1, 3, 2, 2 };
                      case 2458: 
                        if (!paramString.equals("MG")) {
                          break label9329;
                        }
                        break;
                      case 2457: 
                        if (!paramString.equals("MF")) {
                          break label9329;
                        }
                        return new int[] { 1, 2, 2, 2, 2, 2 };
                      case 2456: 
                        if (!paramString.equals("ME")) {
                          break label9329;
                        }
                        return new int[] { 2, 0, 0, 1, 1, 2 };
                      case 2455: 
                        if (!paramString.equals("MD")) {
                          break label9329;
                        }
                        return new int[] { 1, 0, 0, 0, 2, 2 };
                      case 2454: 
                        if (!paramString.equals("MC")) {
                          break label9329;
                        }
                        return new int[] { 0, 2, 2, 0, 2, 2 };
                      case 2452: 
                        if (!paramString.equals("MA")) {
                          break label9329;
                        }
                        return new int[] { 3, 3, 2, 1, 2, 2 };
                      case 2445: 
                        if (!paramString.equals("LY")) {
                          break label9329;
                        }
                        return new int[] { 3, 2, 4, 3, 2, 2 };
                      case 2442: 
                        if (!paramString.equals("LV")) {
                          break label9329;
                        }
                        break;
                      case 2441: 
                        if (!paramString.equals("LU")) {
                          break label9329;
                        }
                        return new int[] { 1, 1, 4, 2, 0, 2 };
                      case 2440: 
                        if (!paramString.equals("LT")) {
                          break label9329;
                        }
                        break;
                      case 2439: 
                        if (!paramString.equals("LS")) {
                          break label9329;
                        }
                        return new int[] { 3, 3, 3, 2, 2, 2 };
                      case 2438: 
                        if (!paramString.equals("LR")) {
                          break label9329;
                        }
                        return new int[] { 3, 4, 3, 4, 2, 2 };
                      case 2431: 
                        if (!paramString.equals("LK")) {
                          break label9329;
                        }
                        return new int[] { 3, 2, 3, 4, 4, 2 };
                      case 2429: 
                        if (!paramString.equals("LI")) {
                          break label9329;
                        }
                        break;
                      case 2423: 
                        if (!paramString.equals("LC")) {
                          break label9329;
                        }
                        break;
                      case 2422: 
                        if (!paramString.equals("LB")) {
                          break label9329;
                        }
                        return new int[] { 3, 2, 1, 2, 2, 2 };
                      case 2421: 
                        if (!paramString.equals("LA")) {
                          break label9329;
                        }
                        return new int[] { 1, 2, 1, 3, 2, 2 };
                      case 2415: 
                        if (!paramString.equals("KZ")) {
                          break label9329;
                        }
                        break;
                      case 2414: 
                        if (!paramString.equals("KY")) {
                          break label9329;
                        }
                        break;
                      case 2412: 
                        if (!paramString.equals("KW")) {
                          break label9329;
                        }
                        return new int[] { 1, 0, 1, 0, 0, 2 };
                      case 2407: 
                        if (!paramString.equals("KR")) {
                          break label9329;
                        }
                        return new int[] { 0, 2, 2, 4, 4, 4 };
                      case 2403: 
                        if (!paramString.equals("KN")) {
                          break label9329;
                        }
                        break;
                      case 2402: 
                        if (!paramString.equals("KM")) {
                          break label9329;
                        }
                        break;
                      case 2398: 
                        if (!paramString.equals("KI")) {
                          break label9329;
                        }
                        break;
                      case 2397: 
                        if (!paramString.equals("KH")) {
                          break label9329;
                        }
                        return new int[] { 1, 0, 4, 2, 2, 2 };
                      case 2396: 
                        if (!paramString.equals("KG")) {
                          break label9329;
                        }
                        return new int[] { 2, 1, 1, 2, 2, 2 };
                      case 2394: 
                        if (!paramString.equals("KE")) {
                          break label9329;
                        }
                        return new int[] { 3, 2, 2, 1, 2, 2 };
                      case 2374: 
                        if (!paramString.equals("JP")) {
                          break label9329;
                        }
                        return new int[] { 0, 3, 3, 3, 4, 4 };
                      case 2373: 
                        if (!paramString.equals("JO")) {
                          break label9329;
                        }
                        return new int[] { 2, 0, 1, 1, 2, 2 };
                      case 2371: 
                        if (!paramString.equals("JM")) {
                          break label9329;
                        }
                        return new int[] { 2, 4, 2, 1, 2, 2 };
                      case 2363: 
                        if (!paramString.equals("JE")) {
                          break label9329;
                        }
                        break;
                      case 2347: 
                        if (!paramString.equals("IT")) {
                          break label9329;
                        }
                        return new int[] { 0, 0, 1, 1, 1, 2 };
                      case 2346: 
                        if (!paramString.equals("IS")) {
                          break label9329;
                        }
                        return new int[] { 0, 0, 1, 0, 0, 2 };
                      case 2345: 
                        if (!paramString.equals("IR")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 3, 3, 4, 2 };
                      case 2344: 
                        if (!paramString.equals("IQ")) {
                          break label9329;
                        }
                        return new int[] { 3, 2, 2, 2, 2, 2 };
                      case 2342: 
                        if (!paramString.equals("IO")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 2, 4, 2, 2 };
                      case 2341: 
                        if (!paramString.equals("IN")) {
                          break label9329;
                        }
                        return new int[] { 1, 1, 2, 1, 2, 1 };
                      case 2340: 
                        if (!paramString.equals("IM")) {
                          break label9329;
                        }
                        return new int[] { 0, 2, 0, 1, 2, 2 };
                      case 2339: 
                        if (!paramString.equals("IL")) {
                          break label9329;
                        }
                        return new int[] { 1, 2, 2, 3, 4, 2 };
                      case 2332: 
                        if (!paramString.equals("IE")) {
                          break label9329;
                        }
                        break;
                      case 2331: 
                        if (!paramString.equals("ID")) {
                          break label9329;
                        }
                        return new int[] { 3, 1, 1, 2, 3, 2 };
                      case 2317: 
                        if (!paramString.equals("HU")) {
                          break label9329;
                        }
                        break;
                      case 2316: 
                        if (!paramString.equals("HT")) {
                          break label9329;
                        }
                        break;
                      case 2314: 
                        if (!paramString.equals("HR")) {
                          break label9329;
                        }
                        break;
                      case 2310: 
                        if (!paramString.equals("HN")) {
                          break label9329;
                        }
                        return new int[] { 3, 3, 2, 2, 2, 2 };
                      case 2307: 
                        if (!paramString.equals("HK")) {
                          break label9329;
                        }
                        return new int[] { 0, 1, 1, 3, 2, 0 };
                      case 2290: 
                        if (!paramString.equals("GY")) {
                          break label9329;
                        }
                        return new int[] { 3, 0, 1, 1, 2, 2 };
                      case 2288: 
                        if (!paramString.equals("GW")) {
                          break label9329;
                        }
                        return new int[] { 4, 4, 2, 2, 2, 2 };
                      case 2286: 
                        if (!paramString.equals("GU")) {
                          break label9329;
                        }
                        break;
                      case 2285: 
                        if (!paramString.equals("GT")) {
                          break label9329;
                        }
                        return new int[] { 2, 2, 2, 1, 1, 2 };
                      case 2283: 
                        if (!paramString.equals("GR")) {
                          break label9329;
                        }
                        break;
                      case 2282: 
                        if (!paramString.equals("GQ")) {
                          break label9329;
                        }
                        return new int[] { 4, 4, 3, 3, 2, 2 };
                      case 2281: 
                        if (!paramString.equals("GP")) {
                          break label9329;
                        }
                        return new int[] { 3, 1, 1, 3, 2, 2 };
                      case 2279: 
                        if (!paramString.equals("GN")) {
                          break label9329;
                        }
                        return new int[] { 4, 4, 4, 2, 2, 2 };
                      case 2278: 
                        if (!paramString.equals("GM")) {
                          break label9329;
                        }
                        return new int[] { 4, 3, 2, 4, 2, 2 };
                      case 2277: 
                        if (!paramString.equals("GL")) {
                          break label9329;
                        }
                        return new int[] { 2, 2, 2, 4, 2, 2 };
                      case 2274: 
                        if (!paramString.equals("GI")) {
                          break label9329;
                        }
                        return new int[] { 1, 2, 0, 1, 2, 2 };
                      case 2273: 
                        if (!paramString.equals("GH")) {
                          break label9329;
                        }
                        return new int[] { 3, 3, 3, 3, 2, 2 };
                      case 2272: 
                        if (!paramString.equals("GG")) {
                          break label9329;
                        }
                        return new int[] { 0, 2, 1, 0, 2, 2 };
                      case 2271: 
                        if (!paramString.equals("GF")) {
                          break label9329;
                        }
                        return new int[] { 3, 2, 3, 3, 2, 2 };
                      case 2270: 
                        if (!paramString.equals("GE")) {
                          break label9329;
                        }
                        return new int[] { 1, 0, 0, 2, 2, 2 };
                      case 2269: 
                        if (!paramString.equals("GD")) {
                          break label9329;
                        }
                        return new int[] { 1, 2, 0, 0, 2, 2 };
                      case 2267: 
                        if (!paramString.equals("GB")) {
                          break label9329;
                        }
                        return new int[] { 0, 1, 1, 2, 1, 2 };
                      case 2266: 
                        if (!paramString.equals("GA")) {
                          break label9329;
                        }
                        return new int[] { 3, 4, 1, 0, 2, 2 };
                      case 2252: 
                        if (!paramString.equals("FR")) {
                          break label9329;
                        }
                        return new int[] { 1, 1, 2, 1, 1, 2 };
                      case 2249: 
                        if (!paramString.equals("FO")) {
                          break label9329;
                        }
                        break;
                      case 2247: 
                        if (!paramString.equals("FM")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 3, 0, 2, 2 };
                      case 2244: 
                        if (!paramString.equals("FJ")) {
                          break label9329;
                        }
                        return new int[] { 3, 1, 2, 3, 2, 2 };
                      case 2243: 
                        if (!paramString.equals("FI")) {
                          break label9329;
                        }
                        return new int[] { 0, 0, 0, 2, 0, 2 };
                      case 2223: 
                        if (!paramString.equals("ET")) {
                          break label9329;
                        }
                        return new int[] { 4, 4, 3, 2, 2, 2 };
                      case 2222: 
                        if (!paramString.equals("ES")) {
                          break label9329;
                        }
                        break;
                      case 2221: 
                        if (!paramString.equals("ER")) {
                          break label9329;
                        }
                        break;
                      case 2210: 
                        if (!paramString.equals("EG")) {
                          break label9329;
                        }
                        return new int[] { 3, 4, 3, 3, 2, 2 };
                      case 2208: 
                        if (!paramString.equals("EE")) {
                          break label9329;
                        }
                        break;
                      case 2206: 
                        if (!paramString.equals("EC")) {
                          break label9329;
                        }
                        return new int[] { 1, 3, 2, 1, 2, 2 };
                      case 2198: 
                        if (!paramString.equals("DZ")) {
                          break label9329;
                        }
                        break;
                      case 2187: 
                        if (!paramString.equals("DO")) {
                          break label9329;
                        }
                        return new int[] { 3, 4, 4, 4, 4, 2 };
                      case 2185: 
                        if (!paramString.equals("DM")) {
                          break label9329;
                        }
                        break;
                      case 2183: 
                        if (!paramString.equals("DK")) {
                          break label9329;
                        }
                        return new int[] { 0, 0, 0, 0, 0, 2 };
                      case 2182: 
                        if (!paramString.equals("DJ")) {
                          break label9329;
                        }
                        return new int[] { 4, 3, 4, 4, 2, 2 };
                      case 2177: 
                        if (!paramString.equals("DE")) {
                          break label9329;
                        }
                        return new int[] { 0, 1, 3, 2, 2, 2 };
                      case 2167: 
                        if (!paramString.equals("CZ")) {
                          break label9329;
                        }
                        return new int[] { 0, 0, 2, 0, 1, 2 };
                      case 2166: 
                        if (!paramString.equals("CY")) {
                          break label9329;
                        }
                        return new int[] { 1, 0, 0, 0, 0, 2 };
                      case 2165: 
                        if (!paramString.equals("CX")) {
                          break label9329;
                        }
                        break;
                      case 2164: 
                        if (!paramString.equals("CW")) {
                          break label9329;
                        }
                        break;
                      case 2163: 
                        if (!paramString.equals("CV")) {
                          break label9329;
                        }
                        return new int[] { 2, 3, 0, 1, 2, 2 };
                      case 2162: 
                        if (!paramString.equals("CU")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 4, 3, 2, 2 };
                      case 2159: 
                        if (!paramString.equals("CR")) {
                          break label9329;
                        }
                        return new int[] { 2, 4, 4, 4, 2, 2 };
                      case 2156: 
                        if (!paramString.equals("CO")) {
                          break label9329;
                        }
                        return new int[] { 2, 3, 4, 2, 2, 2 };
                      case 2155: 
                        if (!paramString.equals("CN")) {
                          break label9329;
                        }
                        return new int[] { 2, 0, 4, 3, 3, 1 };
                      case 2154: 
                        if (!paramString.equals("CM")) {
                          break label9329;
                        }
                        return new int[] { 4, 3, 3, 4, 2, 2 };
                      case 2153: 
                        if (!paramString.equals("CL")) {
                          break label9329;
                        }
                        return new int[] { 1, 1, 2, 1, 3, 2 };
                      case 2152: 
                        if (!paramString.equals("CK")) {
                          break label9329;
                        }
                        break;
                      case 2145: 
                        if (!paramString.equals("CD")) {
                          break label9329;
                        }
                        return new int[] { 4, 3, 3, 2, 2, 2 };
                      case 2142: 
                        if (!paramString.equals("CA")) {
                          break label9329;
                        }
                        return new int[] { 0, 2, 3, 3, 3, 3 };
                      case 2133: 
                        if (!paramString.equals("BW")) {
                          break label9329;
                        }
                        return new int[] { 3, 2, 1, 0, 2, 2 };
                      case 2120: 
                        if (!paramString.equals("BJ")) {
                          break label9329;
                        }
                        return new int[] { 4, 4, 2, 3, 2, 2 };
                      case 2119: 
                        if (!paramString.equals("BI")) {
                          break label9329;
                        }
                        return new int[] { 4, 4, 4, 4, 2, 2 };
                      case 2118: 
                        if (!paramString.equals("BH")) {
                          break label9329;
                        }
                        return new int[] { 1, 3, 1, 4, 4, 2 };
                      case 2117: 
                        if (!paramString.equals("BG")) {
                          break label9329;
                        }
                        return new int[] { 0, 0, 0, 0, 1, 2 };
                      case 2116: 
                        if (!paramString.equals("BF")) {
                          break label9329;
                        }
                        break;
                      case 2115: 
                        if (!paramString.equals("BE")) {
                          break label9329;
                        }
                        return new int[] { 0, 1, 4, 4, 3, 2 };
                      case 2114: 
                        if (!paramString.equals("BD")) {
                          break label9329;
                        }
                        return new int[] { 2, 1, 2, 2, 2, 2 };
                      case 2105: 
                        if (!paramString.equals("AZ")) {
                          break label9329;
                        }
                        return new int[] { 3, 3, 4, 4, 2, 2 };
                      case 2096: 
                        if (!paramString.equals("AQ")) {
                          break label9329;
                        }
                        return new int[] { 4, 2, 2, 2, 2, 2 };
                      case 2094: 
                        if (!paramString.equals("AO")) {
                          break label9329;
                        }
                        return new int[] { 4, 4, 4, 3, 2, 2 };
                      }
                      if (!paramString.equals("AI")) {
                        break label9329;
                      }
                      break;
                    case 2086: 
                      if (!paramString.equals("AG")) {
                        break label9329;
                      }
                      return new int[] { 2, 4, 3, 4, 2, 2 };
                    case 2085: 
                      if (!paramString.equals("AF")) {
                        break label9329;
                      }
                      return new int[] { 4, 3, 3, 3, 2, 2 };
                    case 2084: 
                      if (!paramString.equals("AE")) {
                        break label9329;
                      }
                      return new int[] { 1, 4, 3, 4, 4, 2 };
                    }
                    if (paramString.equals("AD")) {
                      return new int[] { 2, 2, 0, 0, 2, 2 };
                    }
                  }
                  else if (paramString.equals("BZ"))
                  {
                    return new int[] { 2, 2, 2, 1, 2, 2 };
                  }
                }
                else if (paramString.equals("BY")) {
                  return new int[] { 1, 1, 2, 3, 2, 2 };
                }
              }
              else if (paramString.equals("BB")) {
                return new int[] { 0, 2, 0, 0, 2, 2 };
              }
            }
            else if (paramString.equals("BA")) {
              return new int[] { 1, 1, 1, 1, 2, 2 };
            }
          }
          else if (paramString.equals("AX")) {
            return new int[] { 0, 2, 2, 2, 2, 2 };
          }
        }
        else if (paramString.equals("AW")) {
          return new int[] { 1, 2, 4, 4, 2, 2 };
        }
      }
      else if (paramString.equals("AM")) {
        return new int[] { 2, 3, 2, 3, 2, 2 };
      }
    }
    else if (paramString.equals("AL")) {
      return new int[] { 1, 1, 1, 3, 2, 2 };
    }
    label9329:
    return new int[] { 2, 2, 2, 2, 2, 2 };
  }
  
  public final void zza(zzfx paramzzfx, zzgc paramzzgc, boolean paramBoolean, int paramInt)
  {
    try
    {
      paramBoolean = zzl(paramzzgc, paramBoolean);
      if (!paramBoolean) {
        return;
      }
      this.zzo += paramInt;
      return;
    }
    finally {}
  }
  
  public final void zzb(zzfx paramzzfx, zzgc paramzzgc, boolean paramBoolean)
  {
    try
    {
      paramBoolean = zzl(paramzzgc, paramBoolean);
      if (!paramBoolean) {
        return;
      }
      if (this.zzm > 0) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      zzdy.zzf(paramBoolean);
      long l1 = SystemClock.elapsedRealtime();
      long l3 = this.zzn;
      long l2 = this.zzq;
      int i = (int)(l1 - l3);
      this.zzq = (l2 + i);
      l2 = this.zzr;
      l3 = this.zzo;
      this.zzr = (l2 + l3);
      if (i > 0)
      {
        float f = (float)l3;
        this.zzj.zzb((int)Math.sqrt(l3), f * 8000.0F / i);
        if ((this.zzq >= 2000L) || (this.zzr >= 524288L)) {
          this.zzs = (this.zzj.zza(0.5F));
        }
        zzj(i, this.zzo, this.zzs);
        this.zzn = l1;
        this.zzo = 0L;
      }
      this.zzm -= 1;
      return;
    }
    finally {}
  }
  
  public final void zzc(zzfx paramzzfx, zzgc paramzzgc, boolean paramBoolean) {}
  
  public final void zzd(zzfx paramzzfx, zzgc paramzzgc, boolean paramBoolean)
  {
    try
    {
      paramBoolean = zzl(paramzzgc, paramBoolean);
      if (!paramBoolean) {
        return;
      }
      if (this.zzm == 0) {
        this.zzn = SystemClock.elapsedRealtime();
      }
      this.zzm += 1;
      return;
    }
    finally {}
  }
  
  public final void zze(Handler paramHandler, zzxk paramzzxk)
  {
    Objects.requireNonNull(paramzzxk);
    this.zzi.zza(paramHandler, paramzzxk);
  }
  
  public final void zzf(zzxk paramzzxk)
  {
    this.zzi.zzc(paramzzxk);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzxp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */