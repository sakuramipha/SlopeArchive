package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;

public final class zzfci
{
  private final zzfbm zza;
  private final zzfcg zzb;
  private final zzfbi zzc;
  private final ArrayDeque zzd;
  private zzfco zze;
  private int zzf = 1;
  
  public zzfci(zzfbm paramzzfbm, zzfbi paramzzfbi, zzfcg paramzzfcg)
  {
    this.zza = paramzzfbm;
    this.zzc = paramzzfbi;
    this.zzb = paramzzfcg;
    this.zzd = new ArrayDeque();
    paramzzfbi.zzb(new zzfcd(this));
  }
  
  private final void zzh()
  {
    try
    {
      Object localObject1 = zzbbk.zzga;
      if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) && (!zzt.zzo().zzh().zzh().zzh()))
      {
        this.zzd.clear();
        return;
      }
      if (zzi())
      {
        while (!this.zzd.isEmpty())
        {
          localObject1 = (zzfch)this.zzd.pollFirst();
          if ((localObject1 == null) || ((((zzfch)localObject1).zza() != null) && (this.zza.zze(((zzfch)localObject1).zza()))))
          {
            zzfco localzzfco = new com/google/android/gms/internal/ads/zzfco;
            localzzfco.<init>(this.zza, this.zzb, (zzfch)localObject1);
            this.zze = localzzfco;
            zzfce localzzfce = new com/google/android/gms/internal/ads/zzfce;
            localzzfce.<init>(this, (zzfch)localObject1);
            localzzfco.zzd(localzzfce);
            return;
          }
        }
        return;
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  private final boolean zzi()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 49	com/google/android/gms/internal/ads/zzfci:zze	Lcom/google/android/gms/internal/ads/zzfco;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	zzfci
    //   12	7	1	bool	boolean
    //   6	2	2	localzzfco	zzfco
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final zzfwb zza(zzfch paramzzfch)
  {
    try
    {
      this.zzf = 2;
      boolean bool = zzi();
      if (bool) {
        return null;
      }
      paramzzfch = this.zze.zza(paramzzfch);
      return paramzzfch;
    }
    finally {}
  }
  
  public final void zze(zzfch paramzzfch)
  {
    try
    {
      this.zzd.add(paramzzfch);
      return;
    }
    finally
    {
      paramzzfch = finally;
      throw paramzzfch;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */