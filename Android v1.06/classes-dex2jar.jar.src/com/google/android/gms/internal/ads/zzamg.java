package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class zzamg
{
  private final int zza;
  private final List zzb;
  private final int zzc;
  private final InputStream zzd;
  
  public zzamg(int paramInt1, List paramList, int paramInt2, InputStream paramInputStream)
  {
    this.zza = paramInt1;
    this.zzb = paramList;
    this.zzc = paramInt2;
    this.zzd = paramInputStream;
  }
  
  public final int zza()
  {
    return this.zzc;
  }
  
  public final int zzb()
  {
    return this.zza;
  }
  
  public final InputStream zzc()
  {
    InputStream localInputStream = this.zzd;
    if (localInputStream != null) {
      return localInputStream;
    }
    return null;
  }
  
  public final List zzd()
  {
    return Collections.unmodifiableList(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzamg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */