package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zap;
import java.util.concurrent.ExecutorService;

public final class zaco
{
  private static final ExecutorService zaa = zap.zaa().zaa(new NumberedThreadFactory("GAC_Transform"), 1);
  
  public static ExecutorService zaa()
  {
    return zaa;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */