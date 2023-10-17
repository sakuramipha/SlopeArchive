package com.unity3d.player.a;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.player.IPermissionRequestCallbacks;
import com.unity3d.player.UnityPermissions.ModalWaitForPermissionResponse;

public class d
  extends Fragment
{
  private final IPermissionRequestCallbacks a;
  private final Activity b;
  private final Looper c;
  
  public d(Activity paramActivity, IPermissionRequestCallbacks paramIPermissionRequestCallbacks)
  {
    this.a = paramIPermissionRequestCallbacks;
    this.b = paramActivity;
    this.c = Looper.myLooper();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestPermissions(getArguments().getStringArray("PermissionNames"), 96489);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (paramInt != 96489) {
      return;
    }
    int j = paramArrayOfString.length;
    paramInt = 0;
    int i = 0;
    if (j == 0)
    {
      if ((this.a != null) && (this.b != null) && (this.c != null))
      {
        paramArrayOfInt = getArguments().getStringArray("PermissionNames");
        if ((this.a instanceof UnityPermissions.ModalWaitForPermissionResponse))
        {
          j = paramArrayOfInt.length;
          for (paramInt = i; paramInt < j; paramInt++)
          {
            paramArrayOfString = paramArrayOfInt[paramInt];
            this.a.onPermissionDenied(paramArrayOfString);
          }
        }
        new Handler(this.c).post(new b(this, paramArrayOfInt));
      }
    }
    else {
      while ((paramInt < paramArrayOfString.length) && (paramInt < paramArrayOfInt.length))
      {
        i = paramArrayOfInt[paramInt];
        Object localObject = this.a;
        if ((localObject != null) && (this.b != null) && (this.c != null)) {
          if ((localObject instanceof UnityPermissions.ModalWaitForPermissionResponse))
          {
            ((IPermissionRequestCallbacks)localObject).onPermissionGranted(paramArrayOfString[paramInt]);
          }
          else
          {
            if (paramArrayOfString[paramInt] == null) {
              localObject = "<null>";
            } else {
              localObject = paramArrayOfString[paramInt];
            }
            new Handler(this.c).post(new c(this, this.a, (String)localObject, paramArrayOfInt[paramInt], this.b.shouldShowRequestPermissionRationale((String)localObject)));
          }
        }
        paramInt++;
      }
    }
    paramArrayOfString = getActivity().getFragmentManager().beginTransaction();
    paramArrayOfString.remove(this);
    paramArrayOfString.commit();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */