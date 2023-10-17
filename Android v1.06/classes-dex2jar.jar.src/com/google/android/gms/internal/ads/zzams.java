package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

public final class zzams
  extends zzguz
  implements Closeable
{
  private static final zzgvg zza = zzgvg.zzb(zzams.class);
  
  public zzams(zzgva paramzzgva, zzamr paramzzamr)
    throws IOException
  {
    zzf(paramzzgva, paramzzgva.zzc(), paramzzamr);
  }
  
  public final void close()
    throws IOException
  {}
  
  public final String toString()
  {
    String str = this.zzd.toString();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
    localStringBuilder.append("model(");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */