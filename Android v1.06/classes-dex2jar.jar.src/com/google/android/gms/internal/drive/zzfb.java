package com.google.android.gms.internal.drive;

import java.util.Objects;

public final class zzfb
  extends zzkk<zzfb, zza>
  implements zzls
{
  private static volatile zzmb<zzfb> zzhk;
  private static final zzfb zzhp;
  private int zzhd;
  private int zzhe = 1;
  private long zzhg = -1L;
  private byte zzhi = 2;
  private String zzhm = "";
  private long zzhn = -1L;
  private int zzho = -1;
  
  static
  {
    zzfb localzzfb = new zzfb();
    zzhp = localzzfb;
    zzkk.zza(zzfb.class, localzzfb);
  }
  
  public static zzfb zza(byte[] paramArrayOfByte, zzjx paramzzjx)
    throws zzkq
  {
    return (zzfb)zzkk.zza(zzhp, paramArrayOfByte, paramzzjx);
  }
  
  private final void zza(long paramLong)
  {
    this.zzhd |= 0x8;
    this.zzhg = paramLong;
  }
  
  public static zza zzan()
  {
    return (zza)zzhp.zzcw();
  }
  
  private final void zzd(String paramString)
  {
    Objects.requireNonNull(paramString);
    this.zzhd |= 0x2;
    this.zzhm = paramString;
  }
  
  private final void zzf(long paramLong)
  {
    this.zzhd |= 0x4;
    this.zzhn = paramLong;
  }
  
  private final void zzj(int paramInt)
  {
    this.zzhd |= 0x1;
    this.zzhe = paramInt;
  }
  
  private final void zzl(int paramInt)
  {
    this.zzhd |= 0x10;
    this.zzho = paramInt;
  }
  
  public final String getResourceId()
  {
    return this.zzhm;
  }
  
  public final int getResourceType()
  {
    return this.zzho;
  }
  
  protected final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    paramObject2 = zzfc.zzhl;
    int i = 1;
    switch (paramObject2[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      paramInt = i;
      if (paramObject1 == null) {
        paramInt = 0;
      }
      this.zzhi = ((byte)paramInt);
      return null;
    case 6: 
      return Byte.valueOf(this.zzhi);
    case 5: 
      paramObject2 = zzhk;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        try
        {
          paramObject2 = zzhk;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new com/google/android/gms/internal/drive/zzkk$zzb;
            ((zzkk.zzb)paramObject1).<init>(zzhp);
            zzhk = (zzmb)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzhp;
    case 3: 
      return zza(zzhp, "\001\005\000\001\001\005\005\000\000\004\001Ԅ\000\002Ԉ\001\003Ԑ\002\004Ԑ\003\005\004\004", new Object[] { "zzhd", "zzhe", "zzhm", "zzhn", "zzhg", "zzho" });
    case 2: 
      return new zza(null);
    }
    return new zzfb();
  }
  
  public final long zzal()
  {
    return this.zzhn;
  }
  
  public final long zzam()
  {
    return this.zzhg;
  }
  
  public static final class zza
    extends zzkk.zza<zzfb, zza>
    implements zzls
  {
    private zza()
    {
      super();
    }
    
    public final zza zze(String paramString)
    {
      zzdb();
      zzfb.zza((zzfb)this.zzru, paramString);
      return this;
    }
    
    public final zza zzg(long paramLong)
    {
      zzdb();
      zzfb.zza((zzfb)this.zzru, paramLong);
      return this;
    }
    
    public final zza zzh(long paramLong)
    {
      zzdb();
      zzfb.zzb((zzfb)this.zzru, paramLong);
      return this;
    }
    
    public final zza zzm(int paramInt)
    {
      zzdb();
      zzfb.zza((zzfb)this.zzru, 1);
      return this;
    }
    
    public final zza zzn(int paramInt)
    {
      zzdb();
      zzfb.zzb((zzfb)this.zzru, paramInt);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */