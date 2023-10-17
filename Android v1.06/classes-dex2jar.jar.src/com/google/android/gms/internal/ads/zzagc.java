package com.google.android.gms.internal.ads;

class zzagc
{
  public final int zzd;
  
  public zzagc(int paramInt)
  {
    this.zzd = paramInt;
  }
  
  public static int zze(int paramInt)
  {
    return paramInt >> 24 & 0xFF;
  }
  
  public static String zzf(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((char)(paramInt >> 24 & 0xFF));
    localStringBuilder.append((char)(paramInt >> 16 & 0xFF));
    localStringBuilder.append((char)(paramInt >> 8 & 0xFF));
    localStringBuilder.append((char)(paramInt & 0xFF));
    return localStringBuilder.toString();
  }
  
  public String toString()
  {
    return zzf(this.zzd);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzagc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */