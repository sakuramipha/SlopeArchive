package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class zzaqp
  extends zzaqo
{
  protected zzaqp(Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext, paramString, paramBoolean);
  }
  
  public static zzaqp zzt(String paramString, Context paramContext, boolean paramBoolean)
  {
    zzr(paramContext, false);
    return new zzaqp(paramContext, paramString, false);
  }
  
  @Deprecated
  public static zzaqp zzu(String paramString, Context paramContext, boolean paramBoolean, int paramInt)
  {
    zzr(paramContext, paramBoolean);
    return new zzaqp(paramContext, paramString, paramBoolean);
  }
  
  protected final List zzp(zzarr paramzzarr, Context paramContext, zzano paramzzano, zzanh paramzzanh)
  {
    if ((paramzzarr.zzk() != null) && (this.zzu))
    {
      int i = paramzzarr.zza();
      paramzzanh = new ArrayList();
      paramzzanh.addAll(super.zzp(paramzzarr, paramContext, paramzzano, null));
      paramzzanh.add(new zzasj(paramzzarr, "IWc1kTmZyjEaYg+Bhy1Ic+NBj3x1Dc7qjnIeXSV6/dJrA8kzK2iK01R5H/P8KgRH", "tqyxGM79wOlAPNBhvtAr5QJDQ+dGmpZ4a1UkwVDI/lw=", paramzzano, i, 24));
      return paramzzanh;
    }
    return super.zzp(paramzzarr, paramContext, paramzzano, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */