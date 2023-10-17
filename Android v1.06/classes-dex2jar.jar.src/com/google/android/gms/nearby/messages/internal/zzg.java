package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.Preconditions;

public final class zzg
  extends zzc
{
  public zzg(String paramString1, String paramString2)
  {
    super(paramString1);
  }
  
  public zzg(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  private static byte[] zze(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (i != 10) {
      if (i == 16) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    Preconditions.checkArgument(bool1, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
    return paramArrayOfByte;
  }
  
  public final String toString()
  {
    String str = zzd();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 26);
    localStringBuilder.append("EddystoneUidPrefix{bytes=");
    localStringBuilder.append(str);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */