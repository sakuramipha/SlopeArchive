package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.Nullable;

public final class zzfxw
{
  @Nullable
  private final Object zza;
  @Nullable
  private final Object zzb;
  private final byte[] zzc;
  private final zzgla zzd;
  private final int zze;
  private final String zzf;
  private final zzfxb zzg;
  private final int zzh;
  
  zzfxw(@Nullable Object paramObject1, @Nullable Object paramObject2, byte[] paramArrayOfByte, int paramInt1, zzgla paramzzgla, int paramInt2, String paramString, zzfxb paramzzfxb)
  {
    this.zza = paramObject1;
    this.zzb = paramObject2;
    this.zzc = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
    this.zzh = paramInt1;
    this.zzd = paramzzgla;
    this.zze = paramInt2;
    this.zzf = paramString;
    this.zzg = paramzzfxb;
  }
  
  public final int zza()
  {
    return this.zze;
  }
  
  public final zzfxb zzb()
  {
    return this.zzg;
  }
  
  public final zzgla zzc()
  {
    return this.zzd;
  }
  
  @Nullable
  public final Object zzd()
  {
    return this.zza;
  }
  
  @Nullable
  public final Object zze()
  {
    return this.zzb;
  }
  
  public final String zzf()
  {
    return this.zzf;
  }
  
  @Nullable
  public final byte[] zzg()
  {
    byte[] arrayOfByte = this.zzc;
    if (arrayOfByte == null) {
      return null;
    }
    return Arrays.copyOf(arrayOfByte, arrayOfByte.length);
  }
  
  public final int zzh()
  {
    return this.zzh;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfxw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */