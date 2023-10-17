package com.google.android.gms.common.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

public final class zaz
  extends RemoteCreator<zam>
{
  private static final zaz zaa = new zaz();
  
  private zaz()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }
  
  public static View zaa(Context paramContext, int paramInt1, int paramInt2)
    throws RemoteCreator.RemoteCreatorException
  {
    zaz localzaz = zaa;
    try
    {
      zax localzax = new com/google/android/gms/common/internal/zax;
      localzax.<init>(1, paramInt1, paramInt2, null);
      localObject = ObjectWrapper.wrap(paramContext);
      paramContext = (View)ObjectWrapper.unwrap(((zam)localzaz.getRemoteCreatorInstance(paramContext)).zae((IObjectWrapper)localObject, localzax));
      return paramContext;
    }
    catch (Exception paramContext)
    {
      Object localObject = new StringBuilder(64);
      ((StringBuilder)localObject).append("Could not get button with size ");
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append(" and color ");
      ((StringBuilder)localObject).append(paramInt2);
      throw new RemoteCreator.RemoteCreatorException(((StringBuilder)localObject).toString(), paramContext);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */