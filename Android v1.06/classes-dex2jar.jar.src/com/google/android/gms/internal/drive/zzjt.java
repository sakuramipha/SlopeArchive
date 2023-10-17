package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzjt
  implements zzns
{
  private final zzjr zznx;
  
  private zzjt(zzjr paramzzjr)
  {
    paramzzjr = (zzjr)zzkm.zza(paramzzjr, "output");
    this.zznx = paramzzjr;
    paramzzjr.zzoh = this;
  }
  
  public static zzjt zza(zzjr paramzzjr)
  {
    if (paramzzjr.zzoh != null) {
      return paramzzjr.zzoh;
    }
    return new zzjt(paramzzjr);
  }
  
  public final void zza(int paramInt, double paramDouble)
    throws IOException
  {
    this.zznx.zza(paramInt, paramDouble);
  }
  
  public final void zza(int paramInt, float paramFloat)
    throws IOException
  {
    this.zznx.zza(paramInt, paramFloat);
  }
  
  public final void zza(int paramInt, long paramLong)
    throws IOException
  {
    this.zznx.zza(paramInt, paramLong);
  }
  
  public final void zza(int paramInt, zzjc paramzzjc)
    throws IOException
  {
    this.zznx.zza(paramInt, paramzzjc);
  }
  
  public final <K, V> void zza(int paramInt, zzlj<K, V> paramzzlj, Map<K, V> paramMap)
    throws IOException
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      this.zznx.zzb(paramInt, 2);
      this.zznx.zzy(zzli.zza(paramzzlj, localEntry.getKey(), localEntry.getValue()));
      zzli.zza(this.zznx, paramzzlj, localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public final void zza(int paramInt, Object paramObject)
    throws IOException
  {
    if ((paramObject instanceof zzjc))
    {
      this.zznx.zzb(paramInt, (zzjc)paramObject);
      return;
    }
    this.zznx.zza(paramInt, (zzlq)paramObject);
  }
  
  public final void zza(int paramInt, Object paramObject, zzmf paramzzmf)
    throws IOException
  {
    this.zznx.zza(paramInt, (zzlq)paramObject, paramzzmf);
  }
  
  public final void zza(int paramInt, String paramString)
    throws IOException
  {
    this.zznx.zza(paramInt, paramString);
  }
  
  public final void zza(int paramInt, List<String> paramList)
    throws IOException
  {
    boolean bool = paramList instanceof zzkz;
    int i = 0;
    int j = 0;
    if (bool)
    {
      zzkz localzzkz = (zzkz)paramList;
      for (i = j; i < paramList.size(); i++)
      {
        Object localObject = localzzkz.zzao(i);
        if ((localObject instanceof String)) {
          this.zznx.zza(paramInt, (String)localObject);
        } else {
          this.zznx.zza(paramInt, (zzjc)localObject);
        }
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zza(paramInt, (String)paramList.get(i));
      i++;
    }
  }
  
  public final void zza(int paramInt, List<?> paramList, zzmf paramzzmf)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      zza(paramInt, paramList.get(i), paramzzmf);
    }
  }
  
  public final void zza(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzjr.zzac(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.zznx.zzy(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzx(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zzc(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzak(int paramInt)
    throws IOException
  {
    this.zznx.zzb(paramInt, 3);
  }
  
  public final void zzal(int paramInt)
    throws IOException
  {
    this.zznx.zzb(paramInt, 4);
  }
  
  public final void zzb(int paramInt, long paramLong)
    throws IOException
  {
    this.zznx.zzb(paramInt, paramLong);
  }
  
  public final void zzb(int paramInt, Object paramObject, zzmf paramzzmf)
    throws IOException
  {
    zzjr localzzjr = this.zznx;
    paramObject = (zzlq)paramObject;
    localzzjr.zzb(paramInt, 3);
    paramzzmf.zza(paramObject, localzzjr.zzoh);
    localzzjr.zzb(paramInt, 4);
  }
  
  public final void zzb(int paramInt, List<zzjc> paramList)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      this.zznx.zza(paramInt, (zzjc)paramList.get(i));
    }
  }
  
  public final void zzb(int paramInt, List<?> paramList, zzmf paramzzmf)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      zzb(paramInt, paramList.get(i), paramzzmf);
    }
  }
  
  public final void zzb(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += zzjr.zzaf(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.zznx.zzy(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzaa(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zzf(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzb(int paramInt, boolean paramBoolean)
    throws IOException
  {
    this.zznx.zzb(paramInt, paramBoolean);
  }
  
  public final void zzc(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zznx.zzc(paramInt1, paramInt2);
  }
  
  public final void zzc(int paramInt, long paramLong)
    throws IOException
  {
    this.zznx.zzc(paramInt, paramLong);
  }
  
  public final void zzc(int paramInt, List<Long> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzjr.zzo(((Long)paramList.get(i)).longValue());
        i++;
      }
      this.zznx.zzy(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzl(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zza(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final int zzcd()
  {
    return zzkk.zze.zzsi;
  }
  
  public final void zzd(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zznx.zzd(paramInt1, paramInt2);
  }
  
  public final void zzd(int paramInt, List<Long> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += zzjr.zzp(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.zznx.zzy(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzl(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zza(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zze(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zznx.zze(paramInt1, paramInt2);
  }
  
  public final void zze(int paramInt, List<Long> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzjr.zzr(((Long)paramList.get(i)).longValue());
        i++;
      }
      this.zznx.zzy(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzn(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zzc(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzf(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zznx.zzf(paramInt1, paramInt2);
  }
  
  public final void zzf(int paramInt, List<Float> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzjr.zzb(((Float)paramList.get(i)).floatValue());
        i++;
      }
      this.zznx.zzy(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zza(((Float)paramList.get(paramInt)).floatValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zza(paramInt, ((Float)paramList.get(i)).floatValue());
      i++;
    }
  }
  
  public final void zzg(int paramInt, List<Double> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzjr.zzb(((Double)paramList.get(i)).doubleValue());
        i++;
      }
      this.zznx.zzy(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zza(((Double)paramList.get(paramInt)).doubleValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zza(paramInt, ((Double)paramList.get(i)).doubleValue());
      i++;
    }
  }
  
  public final void zzh(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += zzjr.zzah(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.zznx.zzy(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzx(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zzc(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzi(int paramInt, long paramLong)
    throws IOException
  {
    this.zznx.zza(paramInt, paramLong);
  }
  
  public final void zzi(int paramInt, List<Boolean> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzjr.zzd(((Boolean)paramList.get(i)).booleanValue());
        i++;
      }
      this.zznx.zzy(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzc(((Boolean)paramList.get(paramInt)).booleanValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zzb(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    }
  }
  
  public final void zzj(int paramInt, long paramLong)
    throws IOException
  {
    this.zznx.zzc(paramInt, paramLong);
  }
  
  public final void zzj(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzjr.zzad(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.zznx.zzy(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzy(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zzd(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzk(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += zzjr.zzag(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.zznx.zzy(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzaa(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zzf(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzl(int paramInt, List<Long> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += zzjr.zzs(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.zznx.zzy(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzn(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zzc(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzm(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zznx.zzf(paramInt1, paramInt2);
  }
  
  public final void zzm(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzjr.zzae(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.zznx.zzy(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzz(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zze(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzn(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zznx.zzc(paramInt1, paramInt2);
  }
  
  public final void zzn(int paramInt, List<Long> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zznx.zzb(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += zzjr.zzq(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.zznx.zzy(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zznx.zzm(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.zznx.zzb(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */