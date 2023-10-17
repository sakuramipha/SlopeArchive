package com.google.android.gms.internal.ads;

import android.util.Log;

public final class zzgvb
  extends zzgvg
{
  final String zza;
  
  public zzgvb(String paramString)
  {
    this.zza = paramString;
  }
  
  public final void zza(String paramString)
  {
    String str = this.zza;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(paramString).length());
    localStringBuilder.append(str);
    localStringBuilder.append(":");
    localStringBuilder.append(paramString);
    Log.d("isoparser", localStringBuilder.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */