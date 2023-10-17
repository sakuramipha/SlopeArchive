package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

final class zzfrj
{
  static int zza(int paramInt)
  {
    return (int)(Integer.rotateLeft((int)(paramInt * -862048943L), 15) * 461845907L);
  }
  
  static int zzb(@CheckForNull Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    }
    return zza(i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */