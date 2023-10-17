package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

public final class zzk
{
  private String zzji;
  
  private zzk(String paramString)
  {
    this.zzji = paramString.toLowerCase(Locale.US);
  }
  
  public static zzk zzg(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    Preconditions.checkArgument(bool);
    if (paramString == null) {
      return null;
    }
    return new zzk(paramString);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      paramObject = (zzk)paramObject;
      return this.zzji.equals(((zzk)paramObject).zzji);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zzji.hashCode();
  }
  
  public final boolean isFolder()
  {
    return this.zzji.equals("application/vnd.google-apps.folder");
  }
  
  public final String toString()
  {
    return this.zzji;
  }
  
  public final boolean zzbh()
  {
    return this.zzji.startsWith("application/vnd.google-apps");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\internal\zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */