package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgc
{
  public static final int zzj = 0;
  public final Uri zza;
  public final int zzb;
  public final byte[] zzc;
  public final Map zzd;
  @Deprecated
  public final long zze;
  public final long zzf;
  public final long zzg;
  public final String zzh;
  public final int zzi;
  
  static
  {
    zzbr.zzb("media3.datasource");
  }
  
  public zzgc(Uri paramUri)
  {
    this(paramUri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
  }
  
  private zzgc(Uri paramUri, long paramLong1, int paramInt1, byte[] paramArrayOfByte, Map paramMap, long paramLong2, long paramLong3, String paramString, int paramInt2, Object paramObject)
  {
    long l = paramLong1 + paramLong2;
    boolean bool2 = false;
    if (l >= 0L) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzdy.zzd(bool1);
    if (paramLong2 >= 0L) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzdy.zzd(bool1);
    paramLong1 = -1L;
    if (paramLong3 <= 0L)
    {
      if (paramLong3 != -1L)
      {
        paramLong1 = paramLong3;
        bool1 = bool2;
        break label94;
      }
    }
    else {
      paramLong1 = paramLong3;
    }
    boolean bool1 = true;
    label94:
    zzdy.zzd(bool1);
    this.zza = paramUri;
    this.zzb = 1;
    this.zzc = null;
    this.zzd = Collections.unmodifiableMap(new HashMap(paramMap));
    this.zzf = paramLong2;
    this.zze = l;
    this.zzg = paramLong1;
    this.zzh = null;
    this.zzi = paramInt2;
  }
  
  @Deprecated
  public zzgc(Uri paramUri, byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    this(paramUri, paramLong1 - paramLong2, 1, null, Collections.emptyMap(), paramLong2, paramLong3, null, paramInt, null);
  }
  
  public final String toString()
  {
    String str = String.valueOf(this.zza);
    long l1 = this.zzf;
    long l2 = this.zzg;
    int i = this.zzi;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataSpec[");
    localStringBuilder.append("GET");
    localStringBuilder.append(" ");
    localStringBuilder.append(str);
    localStringBuilder.append(", ");
    localStringBuilder.append(l1);
    localStringBuilder.append(", ");
    localStringBuilder.append(l2);
    localStringBuilder.append(", null, ");
    localStringBuilder.append(i);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final boolean zza(int paramInt)
  {
    return (this.zzi & paramInt) == paramInt;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */