package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzajr
{
  public final int zza;
  public final String zzb;
  public final List zzc;
  public final byte[] zzd;
  
  public zzajr(int paramInt, String paramString, List paramList, byte[] paramArrayOfByte)
  {
    this.zza = paramInt;
    this.zzb = paramString;
    if (paramList == null) {
      paramString = Collections.emptyList();
    } else {
      paramString = Collections.unmodifiableList(paramList);
    }
    this.zzc = paramString;
    this.zzd = paramArrayOfByte;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */