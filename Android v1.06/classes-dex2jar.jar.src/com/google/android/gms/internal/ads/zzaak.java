package com.google.android.gms.internal.ads;

public final class zzaak
{
  public final String zza;
  
  private zzaak(int paramInt1, int paramInt2, String paramString)
  {
    this.zza = paramString;
  }
  
  public static zzaak zza(zzfd paramzzfd)
  {
    paramzzfd.zzG(2);
    int j = paramzzfd.zzk();
    int i = j >> 1;
    int k = paramzzfd.zzk();
    if ((i != 4) && (i != 5) && (i != 7))
    {
      if (i == 8) {
        paramzzfd = "hev1";
      } else if (i == 9) {
        paramzzfd = "avc3";
      } else {
        return null;
      }
    }
    else {
      paramzzfd = "dvhe";
    }
    j = k >> 3 | (j & 0x1) << 5;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramzzfd);
    paramzzfd = ".0";
    localStringBuilder.append(".0");
    localStringBuilder.append(i);
    if (j >= 10) {
      paramzzfd = ".";
    }
    localStringBuilder.append(paramzzfd);
    localStringBuilder.append(j);
    return new zzaak(i, j, localStringBuilder.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */