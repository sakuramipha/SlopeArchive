package com.google.android.gms.internal.drive;

public final class zzez
  extends zzkk<zzez, zza>
  implements zzls
{
  private static final zzez zzhj;
  private static volatile zzmb<zzez> zzhk;
  private int zzhd;
  private int zzhe = 1;
  private long zzhf = -1L;
  private long zzhg = -1L;
  private long zzhh = -1L;
  private byte zzhi = 2;
  
  static
  {
    zzez localzzez = new zzez();
    zzhj = localzzez;
    zzkk.zza(zzez.class, localzzez);
  }
  
  private final void setSequenceNumber(long paramLong)
  {
    this.zzhd |= 0x2;
    this.zzhf = paramLong;
  }
  
  private final void zza(long paramLong)
  {
    this.zzhd |= 0x4;
    this.zzhg = paramLong;
  }
  
  public static zza zzaj()
  {
    return (zza)zzhj.zzcw();
  }
  
  private final void zzb(long paramLong)
  {
    this.zzhd |= 0x8;
    this.zzhh = paramLong;
  }
  
  private final void zzj(int paramInt)
  {
    this.zzhd |= 0x1;
    this.zzhe = paramInt;
  }
  
  protected final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    paramObject2 = zzfa.zzhl;
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
            ((zzkk.zzb)paramObject1).<init>(zzhj);
            zzhk = (zzmb)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzhj;
    case 3: 
      return zza(zzhj, "\001\004\000\001\001\004\004\000\000\004\001Ԅ\000\002Ԑ\001\003Ԑ\002\004Ԑ\003", new Object[] { "zzhd", "zzhe", "zzhf", "zzhg", "zzhh" });
    case 2: 
      return new zza(null);
    }
    return new zzez();
  }
  
  public static final class zza
    extends zzkk.zza<zzez, zza>
    implements zzls
  {
    private zza()
    {
      super();
    }
    
    public final zza zzc(long paramLong)
    {
      zzdb();
      zzez.zza((zzez)this.zzru, paramLong);
      return this;
    }
    
    public final zza zzd(long paramLong)
    {
      zzdb();
      zzez.zzb((zzez)this.zzru, paramLong);
      return this;
    }
    
    public final zza zze(long paramLong)
    {
      zzdb();
      zzez.zzc((zzez)this.zzru, paramLong);
      return this;
    }
    
    public final zza zzk(int paramInt)
    {
      zzdb();
      zzez.zza((zzez)this.zzru, 1);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */