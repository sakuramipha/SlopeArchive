package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzgrc
  extends zzgrm
{
  zzgrc(int paramInt)
  {
    super(paramInt, null);
  }
  
  public final void zza()
  {
    if (!zzj())
    {
      for (int i = 0; i < zzb(); i++)
      {
        localObject = zzg(i);
        if (((zzgom)((Map.Entry)localObject).getKey()).zzc()) {
          ((Map.Entry)localObject).setValue(Collections.unmodifiableList((List)((Map.Entry)localObject).getValue()));
        }
      }
      Object localObject = zzc().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        if (((zzgom)localEntry.getKey()).zzc()) {
          localEntry.setValue(Collections.unmodifiableList((List)localEntry.getValue()));
        }
      }
    }
    super.zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgrc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */