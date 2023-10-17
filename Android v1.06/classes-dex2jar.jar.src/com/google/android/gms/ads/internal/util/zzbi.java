package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzamm;
import com.google.android.gms.internal.ads.zzbzs;
import java.util.Collections;
import java.util.Map;

final class zzbi
  extends zzamm
{
  zzbi(zzbo paramzzbo, int paramInt, String paramString, zzaln paramzzaln, zzalm paramzzalm, byte[] paramArrayOfByte, Map paramMap, zzbzs paramzzbzs)
  {
    super(paramInt, paramString, paramzzaln, paramzzalm);
  }
  
  public final Map zzl()
    throws zzakq
  {
    Map localMap2 = this.zzb;
    Map localMap1 = localMap2;
    if (localMap2 == null) {
      localMap1 = Collections.emptyMap();
    }
    return localMap1;
  }
  
  public final byte[] zzx()
    throws zzakq
  {
    byte[] arrayOfByte2 = this.zza;
    byte[] arrayOfByte1 = arrayOfByte2;
    if (arrayOfByte2 == null) {
      arrayOfByte1 = null;
    }
    return arrayOfByte1;
  }
  
  protected final void zzz(String paramString)
  {
    this.zzc.zzg(paramString);
    super.zzz(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */