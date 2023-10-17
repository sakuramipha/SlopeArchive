package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R.string;

public class StringResourceValueReader
{
  private final Resources zza;
  private final String zzb;
  
  public StringResourceValueReader(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    paramContext = paramContext.getResources();
    this.zza = paramContext;
    this.zzb = paramContext.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
  }
  
  public String getString(String paramString)
  {
    int i = this.zza.getIdentifier(paramString, "string", this.zzb);
    if (i == 0) {
      return null;
    }
    return this.zza.getString(i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\StringResourceValueReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */