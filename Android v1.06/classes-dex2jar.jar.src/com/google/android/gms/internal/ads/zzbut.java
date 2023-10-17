package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

public final class zzbut
  extends zzbuv
{
  private final String zza;
  private final int zzb;
  
  public zzbut(String paramString, int paramInt)
  {
    this.zza = paramString;
    this.zzb = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof zzbut)))
    {
      paramObject = (zzbut)paramObject;
      if ((Objects.equal(this.zza, ((zzbut)paramObject).zza)) && (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(((zzbut)paramObject).zzb)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int zzb()
  {
    return this.zzb;
  }
  
  public final String zzc()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */