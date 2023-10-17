package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

public class zzbi
{
  public final Uri zza;
  public final String zzb;
  public final zzbc zzc;
  public final zzas zzd;
  public final List zze;
  public final String zzf;
  public final zzfrr zzg;
  @Deprecated
  public final List zzh;
  public final Object zzi;
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzbi)) {
      return false;
    }
    paramObject = (zzbi)paramObject;
    if (this.zza.equals(((zzbi)paramObject).zza))
    {
      Object localObject = ((zzbi)paramObject).zzb;
      if (zzfn.zzB(null, null))
      {
        localObject = ((zzbi)paramObject).zzc;
        if (zzfn.zzB(null, null))
        {
          localObject = ((zzbi)paramObject).zzd;
          if ((zzfn.zzB(null, null)) && (this.zze.equals(((zzbi)paramObject).zze)))
          {
            localObject = ((zzbi)paramObject).zzf;
            if ((zzfn.zzB(null, null)) && (this.zzg.equals(((zzbi)paramObject).zzg)))
            {
              paramObject = ((zzbi)paramObject).zzi;
              if (zzfn.zzB(null, null)) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((this.zza.hashCode() * 923521 + this.zze.hashCode()) * 961 + this.zzg.hashCode()) * 31;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */