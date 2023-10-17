package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzftv
  implements FilenameFilter
{
  private final Pattern zza;
  
  public zzftv(Pattern paramPattern)
  {
    Objects.requireNonNull(paramPattern);
    this.zza = paramPattern;
  }
  
  public final boolean accept(File paramFile, String paramString)
  {
    return this.zza.matcher(paramString).matches();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */