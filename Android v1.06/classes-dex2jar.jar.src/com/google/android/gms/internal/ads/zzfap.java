package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class zzfap
{
  private final Pattern zza;
  
  public zzfap()
  {
    Pattern localPattern;
    try
    {
      Object localObject = zzbbk.zzgE;
      localObject = Pattern.compile((String)zzba.zzc().zzb((zzbbc)localObject));
    }
    catch (PatternSyntaxException localPatternSyntaxException)
    {
      localPattern = null;
    }
    this.zza = localPattern;
  }
  
  public final String zza(String paramString)
  {
    Pattern localPattern = this.zza;
    if ((localPattern != null) && (paramString != null))
    {
      paramString = localPattern.matcher(paramString);
      if (paramString.find()) {
        return paramString.group();
      }
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */