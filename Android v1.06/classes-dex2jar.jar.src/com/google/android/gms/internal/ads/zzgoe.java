package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

final class zzgoe
{
  private final zzgod zza;
  
  private zzgoe(zzgod paramzzgod)
  {
    byte[] arrayOfByte = zzgpg.zzd;
    this.zza = paramzzgod;
    paramzzgod.zze = this;
  }
  
  public static zzgoe zza(zzgod paramzzgod)
  {
    zzgoe localzzgoe = paramzzgod.zze;
    if (localzzgoe != null) {
      return localzzgoe;
    }
    return new zzgoe(paramzzgod);
  }
  
  public final void zzA(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzr(paramInt1, paramInt2 >> 31 ^ paramInt2 + paramInt2);
  }
  
  public final void zzB(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    zzgod localzzgod;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        int k = ((Integer)paramList.get(paramInt)).intValue();
        i += zzgod.zzA(k >> 31 ^ k + k);
        paramInt++;
      }
      this.zza.zzs(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++)
      {
        localzzgod = this.zza;
        i = ((Integer)paramList.get(paramInt)).intValue();
        localzzgod.zzs(i >> 31 ^ i + i);
      }
    }
    while (i < paramList.size())
    {
      localzzgod = this.zza;
      j = ((Integer)paramList.get(i)).intValue();
      localzzgod.zzr(paramInt, j >> 31 ^ j + j);
      i++;
    }
  }
  
  public final void zzC(int paramInt, long paramLong)
    throws IOException
  {
    this.zza.zzt(paramInt, paramLong >> 63 ^ paramLong + paramLong);
  }
  
  public final void zzD(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    long l;
    zzgod localzzgod;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        l = ((Long)paramList.get(i)).longValue();
        paramInt += zzgod.zzB(l >> 63 ^ l + l);
        i++;
      }
      this.zza.zzs(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++)
      {
        localzzgod = this.zza;
        l = ((Long)paramList.get(paramInt)).longValue();
        localzzgod.zzu(l >> 63 ^ l + l);
      }
    }
    while (i < paramList.size())
    {
      localzzgod = this.zza;
      l = ((Long)paramList.get(i)).longValue();
      localzzgod.zzt(paramInt, l >> 63 ^ l + l);
      i++;
    }
  }
  
  @Deprecated
  public final void zzE(int paramInt)
    throws IOException
  {
    this.zza.zzq(paramInt, 3);
  }
  
  public final void zzF(int paramInt, String paramString)
    throws IOException
  {
    this.zza.zzo(paramInt, paramString);
  }
  
  public final void zzG(int paramInt, List paramList)
    throws IOException
  {
    boolean bool = paramList instanceof zzgpo;
    int i = 0;
    int j = 0;
    if (bool)
    {
      zzgpo localzzgpo = (zzgpo)paramList;
      for (i = j; i < paramList.size(); i++)
      {
        Object localObject = localzzgpo.zzf(i);
        if ((localObject instanceof String)) {
          this.zza.zzo(paramInt, (String)localObject);
        } else {
          this.zza.zzL(paramInt, (zzgno)localObject);
        }
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzo(paramInt, (String)paramList.get(i));
      i++;
    }
  }
  
  public final void zzH(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzr(paramInt1, paramInt2);
  }
  
  public final void zzI(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzgod.zzA(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.zza.zzs(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzs(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzr(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzJ(int paramInt, long paramLong)
    throws IOException
  {
    this.zza.zzt(paramInt, paramLong);
  }
  
  public final void zzK(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzgod.zzB(((Long)paramList.get(i)).longValue());
        i++;
      }
      this.zza.zzs(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzu(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzt(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzb(int paramInt, boolean paramBoolean)
    throws IOException
  {
    this.zza.zzK(paramInt, paramBoolean);
  }
  
  public final void zzc(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        ((Boolean)paramList.get(paramInt)).booleanValue();
        i++;
        paramInt++;
      }
      this.zza.zzs(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzJ(((Boolean)paramList.get(paramInt)).booleanValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzK(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    }
  }
  
  public final void zzd(int paramInt, zzgno paramzzgno)
    throws IOException
  {
    this.zza.zzL(paramInt, paramzzgno);
  }
  
  public final void zze(int paramInt, List paramList)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      this.zza.zzL(paramInt, (zzgno)paramList.get(i));
    }
  }
  
  public final void zzf(int paramInt, double paramDouble)
    throws IOException
  {
    this.zza.zzj(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void zzg(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        ((Double)paramList.get(paramInt)).doubleValue();
        i += 8;
        paramInt++;
      }
      this.zza.zzs(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzk(Double.doubleToRawLongBits(((Double)paramList.get(paramInt)).doubleValue()));
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzj(paramInt, Double.doubleToRawLongBits(((Double)paramList.get(i)).doubleValue()));
      i++;
    }
  }
  
  @Deprecated
  public final void zzh(int paramInt)
    throws IOException
  {
    this.zza.zzq(paramInt, 4);
  }
  
  public final void zzi(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzl(paramInt1, paramInt2);
  }
  
  public final void zzj(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzgod.zzx(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.zza.zzs(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzm(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzl(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzk(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzh(paramInt1, paramInt2);
  }
  
  public final void zzl(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        ((Integer)paramList.get(i)).intValue();
        paramInt += 4;
        i++;
      }
      this.zza.zzs(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzi(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzh(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzm(int paramInt, long paramLong)
    throws IOException
  {
    this.zza.zzj(paramInt, paramLong);
  }
  
  public final void zzn(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        ((Long)paramList.get(paramInt)).longValue();
        i += 8;
        paramInt++;
      }
      this.zza.zzs(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzk(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzj(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzo(int paramInt, float paramFloat)
    throws IOException
  {
    this.zza.zzh(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public final void zzp(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        ((Float)paramList.get(paramInt)).floatValue();
        i += 4;
        paramInt++;
      }
      this.zza.zzs(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzi(Float.floatToRawIntBits(((Float)paramList.get(paramInt)).floatValue()));
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzh(paramInt, Float.floatToRawIntBits(((Float)paramList.get(i)).floatValue()));
      i++;
    }
  }
  
  public final void zzq(int paramInt, Object paramObject, zzgqz paramzzgqz)
    throws IOException
  {
    zzgod localzzgod = this.zza;
    paramObject = (zzgqg)paramObject;
    localzzgod.zzq(paramInt, 3);
    paramzzgqz.zzm(paramObject, localzzgod.zze);
    localzzgod.zzq(paramInt, 4);
  }
  
  public final void zzr(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzl(paramInt1, paramInt2);
  }
  
  public final void zzs(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += zzgod.zzx(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.zza.zzs(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzm(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzl(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzt(int paramInt, long paramLong)
    throws IOException
  {
    this.zza.zzt(paramInt, paramLong);
  }
  
  public final void zzu(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += zzgod.zzB(((Long)paramList.get(i)).longValue());
        i++;
      }
      this.zza.zzs(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzu(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzt(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void zzv(int paramInt, Object paramObject, zzgqz paramzzgqz)
    throws IOException
  {
    this.zza.zzn(paramInt, (zzgqg)paramObject, paramzzgqz);
  }
  
  public final void zzw(int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza.zzh(paramInt1, paramInt2);
  }
  
  public final void zzx(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        ((Integer)paramList.get(i)).intValue();
        paramInt += 4;
        i++;
      }
      this.zza.zzs(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzi(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzh(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void zzy(int paramInt, long paramLong)
    throws IOException
  {
    this.zza.zzj(paramInt, paramLong);
  }
  
  public final void zzz(int paramInt, List paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.zza.zzq(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        ((Long)paramList.get(paramInt)).longValue();
        i += 8;
        paramInt++;
      }
      this.zza.zzs(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.zza.zzk(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      this.zza.zzj(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */