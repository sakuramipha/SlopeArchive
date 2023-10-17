package com.google.android.gms.internal.drive;

public final class zzfd
  extends zzkk<zzfd, zza>
  implements zzls
{
  private static volatile zzmb<zzfd> zzhk;
  private static final zzfd zzhq;
  private int zzhd;
  private long zzhg = -1L;
  private byte zzhi = 2;
  private long zzhn = -1L;
  
  static
  {
    zzfd localzzfd = new zzfd();
    zzhq = localzzfd;
    zzkk.zza(zzfd.class, localzzfd);
  }
  
  private final void zza(long paramLong)
  {
    this.zzhd |= 0x2;
    this.zzhg = paramLong;
  }
  
  public static zza zzap()
  {
    return (zza)zzhq.zzcw();
  }
  
  private final void zzf(long paramLong)
  {
    this.zzhd |= 0x1;
    this.zzhn = paramLong;
  }
  
  protected final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    paramObject2 = zzfe.zzhl;
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
            ((zzkk.zzb)paramObject1).<init>(zzhq);
            zzhk = (zzmb)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzhq;
    case 3: 
      return zza(zzhq, "\001\002\000\001\001\002\002\000\000\002\001Ԑ\000\002Ԑ\001", new Object[] { "zzhd", "zzhn", "zzhg" });
    case 2: 
      return new zza(null);
    }
    return new zzfd();
  }
  
  public static final class zza
    extends zzkk.zza<zzfd, zza>
    implements zzls
  {
    private zza()
    {
      super();
    }
    
    public final zza zzi(long paramLong)
    {
      zzdb();
      zzfd.zza((zzfd)this.zzru, paramLong);
      return this;
    }
    
    public final zza zzj(long paramLong)
    {
      zzdb();
      zzfd.zzb((zzfd)this.zzru, paramLong);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */