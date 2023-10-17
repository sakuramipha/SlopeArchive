package com.google.android.gms.internal.ads;

import java.util.HashSet;

public final class zzbr
{
  private static final HashSet zza = new HashSet();
  private static String zzb = "media3.common";
  
  public static String zza()
  {
    try
    {
      String str = zzb;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void zzb(String paramString)
  {
    try
    {
      if (zza.add(paramString))
      {
        String str = zzb;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append(str);
        localStringBuilder.append(", ");
        localStringBuilder.append(paramString);
        zzb = localStringBuilder.toString();
        return;
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */