package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class zzguv
  implements zzamu
{
  private static final zzgvg zza = zzgvg.zzb(zzguv.class);
  protected final String zzb;
  boolean zzc;
  boolean zzd;
  long zze;
  long zzf = -1L;
  zzgva zzg;
  private zzamv zzh;
  private ByteBuffer zzi;
  private ByteBuffer zzj = null;
  
  protected zzguv(String paramString)
  {
    this.zzb = paramString;
    this.zzd = true;
    this.zzc = true;
  }
  
  private final void zzd()
  {
    try
    {
      boolean bool = this.zzd;
      if (!bool) {
        try
        {
          localObject2 = zza;
          String str = this.zzb;
          if (str.length() != 0) {
            str = "mem mapping ".concat(str);
          } else {
            str = new String("mem mapping ");
          }
          ((zzgvg)localObject2).zza(str);
          this.zzi = this.zzg.zzd(this.zze, this.zzf);
          this.zzd = true;
          return;
        }
        catch (IOException localIOException)
        {
          Object localObject2 = new java/lang/RuntimeException;
          ((RuntimeException)localObject2).<init>(localIOException);
          throw ((Throwable)localObject2);
        }
      }
      return;
    }
    finally {}
  }
  
  public final String zza()
  {
    return this.zzb;
  }
  
  public final void zzb(zzgva paramzzgva, ByteBuffer paramByteBuffer, long paramLong, zzamr paramzzamr)
    throws IOException
  {
    this.zze = paramzzgva.zzb();
    paramByteBuffer.remaining();
    this.zzf = paramLong;
    this.zzg = paramzzgva;
    paramzzgva.zze(paramzzgva.zzb() + paramLong);
    this.zzd = false;
    this.zzc = false;
    zzg();
  }
  
  public final void zzc(zzamv paramzzamv)
  {
    this.zzh = paramzzamv;
  }
  
  protected abstract void zzf(ByteBuffer paramByteBuffer);
  
  public final void zzg()
  {
    try
    {
      zzd();
      zzgvg localzzgvg = zza;
      Object localObject1 = this.zzb;
      if (((String)localObject1).length() != 0) {
        localObject1 = "parsing details of ".concat((String)localObject1);
      } else {
        localObject1 = new String("parsing details of ");
      }
      localzzgvg.zza((String)localObject1);
      localObject1 = this.zzi;
      if (localObject1 != null)
      {
        this.zzc = true;
        ((ByteBuffer)localObject1).rewind();
        zzf((ByteBuffer)localObject1);
        if (((ByteBuffer)localObject1).remaining() > 0) {
          this.zzj = ((ByteBuffer)localObject1).slice();
        }
        this.zzi = null;
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzguv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */