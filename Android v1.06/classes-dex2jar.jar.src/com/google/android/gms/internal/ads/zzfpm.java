package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class zzfpm
{
  private final zzfok zza;
  private final zzfpl zzb;
  
  private zzfpm(zzfpl paramzzfpl)
  {
    this.zzb = paramzzfpl;
    this.zza = localzzfoj;
  }
  
  public static zzfpm zzb(int paramInt)
  {
    return new zzfpm(new zzfpi(4000));
  }
  
  public static zzfpm zzc(zzfok paramzzfok)
  {
    return new zzfpm(new zzfpg(paramzzfok));
  }
  
  private final Iterator zzg(CharSequence paramCharSequence)
  {
    return this.zzb.zza(this, paramCharSequence);
  }
  
  public final Iterable zzd(CharSequence paramCharSequence)
  {
    Objects.requireNonNull(paramCharSequence);
    return new zzfpj(this, paramCharSequence);
  }
  
  public final List zzf(CharSequence paramCharSequence)
  {
    paramCharSequence = zzg(paramCharSequence);
    ArrayList localArrayList = new ArrayList();
    while (paramCharSequence.hasNext()) {
      localArrayList.add((String)paramCharSequence.next());
    }
    return Collections.unmodifiableList(localArrayList);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */