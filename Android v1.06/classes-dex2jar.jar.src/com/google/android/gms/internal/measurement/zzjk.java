package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

final class zzjk
  implements zznd
{
  private final zzjj zza;
  
  private zzjk(zzjj paramzzjj)
  {
    zzkk.zzf(paramzzjj, "output");
    this.zza = paramzzjj;
    paramzzjj.zza = this;
  }
  
  public static zzjk zza(zzjj paramzzjj)
  {
    zzjk localzzjk = paramzzjj.zza;
    if (localzzjk != null) {
      return localzzjk;
    }
    return new zzjk(paramzzjj);
  }
  
  public final void zzA(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzp(paramInt1, paramInt2 >> 31 ^ paramInt2 + paramInt2);
  }
  
  public final void zzB(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    zzjj localzzjj;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        int k = ((Integer)paramList.get(paramInt)).intValue();
        i += zzjj.zzA(k >> 31 ^ k + k);
        paramInt++;
      }
      this.zza.zzq(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++)
      {
        localzzjj = this.zza;
        i = ((Integer)paramList.get(paramInt)).intValue();
        localzzjj.zzq(i >> 31 ^ i + i);
      }
    }
    while (i < paramList.size())
    {
      localzzjj = this.zza;
      j = ((Integer)paramList.get(i)).intValue();
      localzzjj.zzp(paramInt, j >> 31 ^ j + j);
      i++;
    }
  }
  
  public final void zzC(int paramInt, long paramLong)
    throws IOException
  {
    this.zza.zzr(paramInt, paramLong >> 63 ^ paramLong + paramLong);
  }
  
  public final void zzD(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    long l;
    zzjj localzzjj;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        l = ((Long)paramList.get(paramInt)).longValue();
        i += zzjj.zzB(l >> 63 ^ l + l);
        paramInt++;
      }
      this.zza.zzq(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++)
      {
        localzzjj = this.zza;
        l = ((Long)paramList.get(paramInt)).longValue();
        localzzjj.zzs(l >> 63 ^ l + l);
      }
    }
    while (i < paramList.size())
    {
      localzzjj = this.zza;
      l = ((Long)paramList.get(i)).longValue();
      localzzjj.zzr(paramInt, l >> 63 ^ l + l);
      i++;
    }
  }
  
  @Deprecated
  public final void zzE(int paramInt)
    throws IOException
  {
    this.zza.zzo(paramInt, 3);
  }
  
  public final void zzF(int paramInt, String paramString)
    throws IOException
  {
    this.zza.zzm(paramInt, paramString);
  }
  
  public final void zzG(int paramInt, List paramList)
    throws IOException
  {
    boolean bool = paramList instanceof zzkr;
    int i = 0;
    int j = 0;
    if (bool)
    {
      zzkr localzzkr = (zzkr)paramList;
      for (i = j; i < paramList.size(); i++)
      {
        Object localObject = localzzkr.zzf(i);
        if ((localObject instanceof String)) {
          this.zza.zzm(paramInt, (String)localObject);
        } else {
          this.zza.zze(paramInt, (zzjb)localObject);
        }
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzm(paramInt, (String)paramList.get(i));
      i++;
    }
  }
  
  public final void zzH(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzp(paramInt1, paramInt2);
  }
  
  public final void zzI(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += zzjj.zzA(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.zza.zzq(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzq(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzp(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzJ(int paramInt, long paramLong)
    throws IOException
  {
    this.zza.zzr(paramInt, paramLong);
  }
  
  public final void zzK(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzjj.zzB(((Long)paramList.get(i)).longValue());
        i++;
      }
      this.zza.zzq(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzs(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzr(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzb(int paramInt, boolean paramBoolean)
    throws IOException
  {
    this.zza.zzd(paramInt, paramBoolean);
  }
  
  public final void zzc(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        ((Boolean)paramList.get(paramInt)).booleanValue();
        i++;
        paramInt++;
      }
      this.zza.zzq(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzb(((Boolean)paramList.get(paramInt)).booleanValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzd(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    }
  }
  
  public final void zzd(int paramInt, zzjb paramzzjb)
    throws IOException
  {
    this.zza.zze(paramInt, paramzzjb);
  }
  
  public final void zze(int paramInt, List paramList)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      this.zza.zze(paramInt, (zzjb)paramList.get(i));
    }
  }
  
  public final void zzf(int paramInt, double paramDouble)
    throws IOException
  {
    this.zza.zzh(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void zzg(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        ((Double)paramList.get(i)).doubleValue();
        paramInt += 8;
        i++;
      }
      this.zza.zzq(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzi(Double.doubleToRawLongBits(((Double)paramList.get(paramInt)).doubleValue()));
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzh(paramInt, Double.doubleToRawLongBits(((Double)paramList.get(i)).doubleValue()));
      i++;
    }
  }
  
  @Deprecated
  public final void zzh(int paramInt)
    throws IOException
  {
    this.zza.zzo(paramInt, 4);
  }
  
  public final void zzi(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzj(paramInt1, paramInt2);
  }
  
  public final void zzj(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzjj.zzv(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.zza.zzq(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzk(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzj(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzk(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzf(paramInt1, paramInt2);
  }
  
  public final void zzl(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        ((Integer)paramList.get(paramInt)).intValue();
        i += 4;
        paramInt++;
      }
      this.zza.zzq(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzg(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzf(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzm(int paramInt, long paramLong)
    throws IOException
  {
    this.zza.zzh(paramInt, paramLong);
  }
  
  public final void zzn(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        ((Long)paramList.get(i)).longValue();
        paramInt += 8;
        i++;
      }
      this.zza.zzq(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzi(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzh(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzo(int paramInt, float paramFloat)
    throws IOException
  {
    this.zza.zzf(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public final void zzp(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        ((Float)paramList.get(i)).floatValue();
        paramInt += 4;
        i++;
      }
      this.zza.zzq(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzg(Float.floatToRawIntBits(((Float)paramList.get(paramInt)).floatValue()));
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzf(paramInt, Float.floatToRawIntBits(((Float)paramList.get(i)).floatValue()));
      i++;
    }
  }
  
  public final void zzq(int paramInt, Object paramObject, zzlu paramzzlu)
    throws IOException
  {
    zzjj localzzjj = this.zza;
    paramObject = (zzlj)paramObject;
    localzzjj.zzo(paramInt, 3);
    paramzzlu.zzi(paramObject, localzzjj.zza);
    localzzjj.zzo(paramInt, 4);
  }
  
  public final void zzr(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzj(paramInt1, paramInt2);
  }
  
  public final void zzs(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += zzjj.zzv(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.zza.zzq(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzk(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzj(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzt(int paramInt, long paramLong)
    throws IOException
  {
    this.zza.zzr(paramInt, paramLong);
  }
  
  public final void zzu(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += zzjj.zzB(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.zza.zzq(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzs(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzr(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzv(int paramInt, Object paramObject, zzlu paramzzlu)
    throws IOException
  {
    Object localObject = this.zza;
    paramObject = (zzlj)paramObject;
    zzjg localzzjg = (zzjg)localObject;
    localzzjg.zzq(paramInt << 3 | 0x2);
    localObject = (zzil)paramObject;
    int i = ((zzil)localObject).zzbu();
    paramInt = i;
    if (i == -1)
    {
      paramInt = paramzzlu.zza(localObject);
      ((zzil)localObject).zzbx(paramInt);
    }
    localzzjg.zzq(paramInt);
    paramzzlu.zzi(paramObject, localzzjg.zza);
  }
  
  public final void zzw(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzf(paramInt1, paramInt2);
  }
  
  public final void zzx(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        ((Integer)paramList.get(paramInt)).intValue();
        i += 4;
        paramInt++;
      }
      this.zza.zzq(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzg(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzf(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzy(int paramInt, long paramLong)
    throws IOException
  {
    this.zza.zzh(paramInt, paramLong);
  }
  
  public final void zzz(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzo(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        ((Long)paramList.get(i)).longValue();
        paramInt += 8;
        i++;
      }
      this.zza.zzq(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzi(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzh(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */