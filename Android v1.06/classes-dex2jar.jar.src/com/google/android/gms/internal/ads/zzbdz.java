package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

public final class zzbdz
  extends zzbeh
{
  static final int zza;
  static final int zzb;
  private static final int zzc;
  private final String zzd;
  private final List zze = new ArrayList();
  private final List zzf = new ArrayList();
  private final int zzg;
  private final int zzh;
  private final int zzi;
  private final int zzj;
  private final int zzk;
  
  static
  {
    int i = Color.rgb(12, 174, 206);
    zzc = i;
    zza = Color.rgb(204, 204, 204);
    zzb = i;
  }
  
  public zzbdz(String paramString, List paramList, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.zzd = paramString;
    for (int i = 0; i < paramList.size(); i++)
    {
      paramString = (zzbec)paramList.get(i);
      this.zze.add(paramString);
      this.zzf.add(paramString);
    }
    if (paramInteger1 != null) {
      i = paramInteger1.intValue();
    } else {
      i = zza;
    }
    this.zzg = i;
    if (paramInteger2 != null) {
      i = paramInteger2.intValue();
    } else {
      i = zzb;
    }
    this.zzh = i;
    if (paramInteger3 != null) {
      i = paramInteger3.intValue();
    } else {
      i = 12;
    }
    this.zzi = i;
    this.zzj = paramInt1;
    this.zzk = paramInt2;
  }
  
  public final int zzb()
  {
    return this.zzj;
  }
  
  public final int zzc()
  {
    return this.zzk;
  }
  
  public final int zzd()
  {
    return this.zzg;
  }
  
  public final int zze()
  {
    return this.zzh;
  }
  
  public final int zzf()
  {
    return this.zzi;
  }
  
  public final String zzg()
  {
    return this.zzd;
  }
  
  public final List zzh()
  {
    return this.zzf;
  }
  
  public final List zzi()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbdz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */