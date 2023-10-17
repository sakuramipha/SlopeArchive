package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

public final class zzgmu
{
  private final byte[] zza;
  
  private zzgmu(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    this.zza = arrayOfByte;
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramInt2);
  }
  
  public static zzgmu zzb(byte[] paramArrayOfByte)
  {
    Objects.requireNonNull(paramArrayOfByte, "data must be non-null");
    return new zzgmu(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzgmu)) {
      return false;
    }
    return Arrays.equals(((zzgmu)paramObject).zza, this.zza);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.zza);
  }
  
  public final String toString()
  {
    String str = zzgmj.zza(this.zza);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Bytes(");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    return this.zza.length;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgmu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */