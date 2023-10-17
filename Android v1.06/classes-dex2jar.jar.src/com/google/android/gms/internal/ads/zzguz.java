package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class zzguz
  implements Iterator, Closeable, zzamv
{
  private static final zzamu zza = new zzguy("eof ");
  private static final zzgvg zzb = zzgvg.zzb(zzguz.class);
  protected zzamr zzc;
  protected zzgva zzd;
  zzamu zze = null;
  long zzf = 0L;
  long zzg = 0L;
  private final List zzh = new ArrayList();
  
  public void close()
    throws IOException
  {}
  
  public final boolean hasNext()
  {
    zzamu localzzamu = this.zze;
    if (localzzamu == zza) {
      return false;
    }
    if (localzzamu != null) {
      return true;
    }
    try
    {
      this.zze = zzd();
      return true;
    }
    catch (NoSuchElementException localNoSuchElementException)
    {
      this.zze = zza;
    }
    return false;
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append("[");
    for (int i = 0; i < this.zzh.size(); i++)
    {
      if (i > 0) {
        localStringBuilder.append(";");
      }
      localStringBuilder.append(((zzamu)this.zzh.get(i)).toString());
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final zzamu zzd()
  {
    Object localObject1 = this.zze;
    if ((localObject1 != null) && (localObject1 != zza))
    {
      this.zze = null;
      return (zzamu)localObject1;
    }
    localObject1 = this.zzd;
    if ((localObject1 != null) && (this.zzf < this.zzg)) {
      try
      {
        try
        {
          this.zzd.zze(this.zzf);
          zzamu localzzamu = this.zzc.zzb(this.zzd, this);
          this.zzf = this.zzd.zzb();
          return localzzamu;
        }
        finally {}
        this.zze = zza;
      }
      catch (IOException localIOException)
      {
        throw new NoSuchElementException();
      }
      catch (EOFException localEOFException)
      {
        throw new NoSuchElementException();
      }
    }
    throw new NoSuchElementException();
  }
  
  public final List zze()
  {
    if ((this.zzd != null) && (this.zze != zza)) {
      return new zzgvf(this.zzh, this);
    }
    return this.zzh;
  }
  
  public final void zzf(zzgva paramzzgva, long paramLong, zzamr paramzzamr)
    throws IOException
  {
    this.zzd = paramzzgva;
    this.zzf = paramzzgva.zzb();
    paramzzgva.zze(paramzzgva.zzb() + paramLong);
    this.zzg = paramzzgva.zzb();
    this.zzc = paramzzamr;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzguz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */