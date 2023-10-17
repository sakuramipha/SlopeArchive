package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class zzaga
  extends zzagc
{
  public final long zza;
  public final List zzb;
  public final List zzc;
  
  public zzaga(int paramInt, long paramLong)
  {
    super(paramInt);
    this.zza = paramLong;
    this.zzb = new ArrayList();
    this.zzc = new ArrayList();
  }
  
  public final String toString()
  {
    String str1 = zzf(this.zzd);
    String str3 = Arrays.toString(this.zzb.toArray());
    String str2 = Arrays.toString(this.zzc.toArray());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append(" leaves: ");
    localStringBuilder.append(str3);
    localStringBuilder.append(" containers: ");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public final zzaga zza(int paramInt)
  {
    int j = this.zzc.size();
    for (int i = 0; i < j; i++)
    {
      zzaga localzzaga = (zzaga)this.zzc.get(i);
      if (localzzaga.zzd == paramInt) {
        return localzzaga;
      }
    }
    return null;
  }
  
  public final zzagb zzb(int paramInt)
  {
    int j = this.zzb.size();
    for (int i = 0; i < j; i++)
    {
      zzagb localzzagb = (zzagb)this.zzb.get(i);
      if (localzzagb.zzd == paramInt) {
        return localzzagb;
      }
    }
    return null;
  }
  
  public final void zzc(zzaga paramzzaga)
  {
    this.zzc.add(paramzzaga);
  }
  
  public final void zzd(zzagb paramzzagb)
  {
    this.zzb.add(paramzzagb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */