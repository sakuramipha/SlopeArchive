package com.google.android.gms.internal.common;

final class zzl
  extends zzk
{
  private final char zza;
  
  zzl(char paramChar)
  {
    this.zza = paramChar;
  }
  
  public final String toString()
  {
    int j = this.zza;
    Object localObject = new char[6];
    Object tmp11_10 = localObject;
    tmp11_10[0] = 92;
    Object tmp16_11 = tmp11_10;
    tmp16_11[1] = 117;
    Object tmp21_16 = tmp16_11;
    tmp21_16[2] = 0;
    Object tmp26_21 = tmp21_16;
    tmp26_21[3] = 0;
    Object tmp31_26 = tmp26_21;
    tmp31_26[4] = 0;
    Object tmp36_31 = tmp31_26;
    tmp36_31[5] = 0;
    tmp36_31;
    for (int i = 0; i < 4; i++)
    {
      localObject[(5 - i)] = "0123456789ABCDEF".charAt(j & 0xF);
      j >>= 4;
    }
    localObject = String.copyValueOf((char[])localObject);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 18);
    localStringBuilder.append("CharMatcher.is('");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("')");
    return localStringBuilder.toString();
  }
  
  public final boolean zza(char paramChar)
  {
    return paramChar == this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */