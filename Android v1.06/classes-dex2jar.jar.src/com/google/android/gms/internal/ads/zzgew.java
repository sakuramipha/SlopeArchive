package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

public final class zzgew
{
  public static final Charset zza = Charset.forName("UTF-8");
  
  public static final zzgmu zza(String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length()];
    int i = 0;
    while (i < paramString.length())
    {
      char c = paramString.charAt(i);
      if ((c >= '!') && (c <= '~'))
      {
        arrayOfByte[i] = ((byte)c);
        i++;
      }
      else
      {
        paramString = new StringBuilder();
        paramString.append("Not a printable ASCII character: ");
        paramString.append(c);
        throw new zzgev(paramString.toString());
      }
    }
    return zzgmu.zzb(arrayOfByte);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */