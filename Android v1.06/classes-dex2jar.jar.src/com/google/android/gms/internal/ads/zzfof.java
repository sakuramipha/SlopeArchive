package com.google.android.gms.internal.ads;

public final class zzfof
{
  public static String zza(String paramString)
  {
    int j = paramString.length();
    for (int i = 0; i < j; i++) {
      if (zze(paramString.charAt(i)))
      {
        paramString = paramString.toCharArray();
        while (i < j)
        {
          char c = paramString[i];
          if (zze(c)) {
            paramString[i] = ((char)(c ^ 0x20));
          }
          i++;
        }
        return String.valueOf(paramString);
      }
    }
    return paramString;
  }
  
  public static String zzb(String paramString)
  {
    int j = paramString.length();
    for (int i = 0; i < j; i++) {
      if (zzd(paramString.charAt(i)))
      {
        paramString = paramString.toCharArray();
        while (i < j)
        {
          char c = paramString[i];
          if (zzd(c)) {
            paramString[i] = ((char)(c ^ 0x20));
          }
          i++;
        }
        return String.valueOf(paramString);
      }
    }
    return paramString;
  }
  
  public static boolean zzc(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    int j = paramCharSequence1.length();
    if (paramCharSequence1 == paramCharSequence2) {
      return true;
    }
    if (j == paramCharSequence2.length())
    {
      int i = 0;
      while (i < j)
      {
        char c1 = paramCharSequence1.charAt(i);
        char c2 = paramCharSequence2.charAt(i);
        if (c1 != c2)
        {
          int k = zzf(c1);
          if ((k >= 26) || (k != zzf(c2))) {}
        }
        else
        {
          i++;
          continue;
        }
        return false;
      }
      return true;
    }
    return false;
  }
  
  public static boolean zzd(char paramChar)
  {
    return (paramChar >= 'a') && (paramChar <= 'z');
  }
  
  public static boolean zze(char paramChar)
  {
    return (paramChar >= 'A') && (paramChar <= 'Z');
  }
  
  private static int zzf(char paramChar)
  {
    return (char)((paramChar | 0x20) - 'a');
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */