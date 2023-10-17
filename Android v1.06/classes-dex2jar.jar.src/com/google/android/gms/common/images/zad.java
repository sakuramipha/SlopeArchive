package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

final class zad
{
  public final Uri zaa;
  
  public zad(Uri paramUri)
  {
    this.zaa = paramUri;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zad)) {
      return false;
    }
    return Objects.equal(((zad)paramObject).zaa, this.zaa);
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zaa });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\images\zad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */