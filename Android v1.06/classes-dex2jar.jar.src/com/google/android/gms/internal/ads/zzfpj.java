package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfpj
  implements Iterable
{
  final zzfpm zzb;
  
  zzfpj(zzfpm paramzzfpm, CharSequence paramCharSequence) {}
  
  public final Iterator iterator()
  {
    return zzfpm.zze(this.zzb, this.zza);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[');
    zzfoo.zzb(localStringBuilder, this, ", ");
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */