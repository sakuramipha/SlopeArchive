package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zzamb
{
  long zza;
  final String zzb;
  final String zzc;
  final long zzd;
  final long zze;
  final long zzf;
  final long zzg;
  final List zzh;
  
  zzamb(String paramString, zzakr paramzzakr)
  {
    this(paramString, str, l2, l4, l1, l3, paramzzakr);
  }
  
  private zzamb(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List paramList)
  {
    this.zzb = paramString1;
    paramString1 = paramString2;
    if (true == "".equals(paramString2)) {
      paramString1 = null;
    }
    this.zzc = paramString1;
    this.zzd = paramLong1;
    this.zze = paramLong2;
    this.zzf = paramLong3;
    this.zzg = paramLong4;
    this.zzh = paramList;
  }
  
  static zzamb zza(zzamc paramzzamc)
    throws IOException
  {
    if (zzame.zze(paramzzamc) == 538247942)
    {
      String str2 = zzame.zzh(paramzzamc);
      String str1 = zzame.zzh(paramzzamc);
      long l4 = zzame.zzf(paramzzamc);
      long l1 = zzame.zzf(paramzzamc);
      long l2 = zzame.zzf(paramzzamc);
      long l3 = zzame.zzf(paramzzamc);
      int j = zzame.zze(paramzzamc);
      if (j >= 0)
      {
        Object localObject;
        if (j == 0) {
          localObject = Collections.emptyList();
        } else {
          localObject = new ArrayList();
        }
        for (int i = 0; i < j; i++) {
          ((List)localObject).add(new zzala(zzame.zzh(paramzzamc).intern(), zzame.zzh(paramzzamc).intern()));
        }
        return new zzamb(str2, str1, l4, l1, l2, l3, (List)localObject);
      }
      paramzzamc = new StringBuilder();
      paramzzamc.append("readHeaderList size=");
      paramzzamc.append(j);
      throw new IOException(paramzzamc.toString());
    }
    throw new IOException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzamb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */