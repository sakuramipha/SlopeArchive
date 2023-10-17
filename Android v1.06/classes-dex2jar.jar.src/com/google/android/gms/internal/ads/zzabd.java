package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzabd
{
  private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
  public int zza = -1;
  public int zzb = -1;
  
  private final boolean zzc(String paramString)
  {
    Matcher localMatcher = zzc.matcher(paramString);
    if (localMatcher.find()) {}
    try
    {
      paramString = localMatcher.group(1);
      int i = zzfn.zza;
      int j = Integer.parseInt(paramString, 16);
      i = Integer.parseInt(localMatcher.group(2), 16);
      if ((j > 0) || (i > 0))
      {
        this.zza = j;
        this.zzb = i;
        return true;
      }
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final boolean zza()
  {
    return (this.zza != -1) && (this.zzb != -1);
  }
  
  public final boolean zzb(zzca paramzzca)
  {
    for (int i = 0; i < paramzzca.zza(); i++)
    {
      Object localObject = paramzzca.zzb(i);
      if ((localObject instanceof zzady))
      {
        localObject = (zzady)localObject;
        if (("iTunSMPB".equals(((zzady)localObject).zzb)) && (zzc(((zzady)localObject).zzc))) {
          return true;
        }
      }
      else if ((localObject instanceof zzaeh))
      {
        localObject = (zzaeh)localObject;
        if (("com.apple.iTunes".equals(((zzaeh)localObject).zza)) && ("iTunSMPB".equals(((zzaeh)localObject).zzb)) && (zzc(((zzaeh)localObject).zzc))) {
          return true;
        }
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */