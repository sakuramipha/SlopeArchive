package com.google.android.gms.internal.ads;

import java.io.Closeable;

public abstract class zzfle
  implements Closeable
{
  public static zzflq zza()
  {
    return new zzflq();
  }
  
  public static zzflq zzb(int paramInt, zzflp paramzzflp)
  {
    return new zzflq(new zzflc(paramInt), zzfld.zza, paramzzflp);
  }
  
  public static zzflq zzc(zzfpp<Integer> paramzzfpp1, zzfpp<Integer> paramzzfpp2, zzflp paramzzflp)
  {
    return new zzflq(paramzzfpp1, paramzzfpp2, paramzzflp);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */