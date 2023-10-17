package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

public class zzo
  extends DataBufferRef
{
  public zzo(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  protected final int zzp(String paramString, int paramInt)
  {
    if ((hasColumn(paramString)) && (!hasNull(paramString))) {
      return getInteger(paramString);
    }
    return paramInt;
  }
  
  protected final String zzq(String paramString1, String paramString2)
  {
    if ((hasColumn(paramString1)) && (!hasNull(paramString1))) {
      return getString(paramString1);
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */