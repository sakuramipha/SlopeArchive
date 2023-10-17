package com.google.android.gms.internal.ads;

import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public final class zzdie
  implements GestureDetector.OnGestureListener
{
  private final zzdgx zza;
  private final zzdhy zzb;
  
  zzdie(zzdgx paramzzdgx, zzdhy paramzzdhy)
  {
    this.zza = paramzzdgx;
    this.zzb = paramzzdhy;
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    try
    {
      zzdgx localzzdgx = this.zza;
      if (localzzdgx == null) {
        return false;
      }
      float f1 = Math.abs(paramFloat1);
      float f2 = Math.abs(paramFloat2);
      int i = -1;
      if (f1 > f2)
      {
        if (paramFloat1 > 0.0F)
        {
          j = (int)((paramMotionEvent2.getX() - paramMotionEvent1.getX()) / paramFloat1 * 1000.0F);
          i = 1;
          break label165;
        }
        if (paramFloat1 < 0.0F)
        {
          j = (int)((paramMotionEvent2.getX() - paramMotionEvent1.getX()) / paramFloat1 * 1000.0F);
          i = 2;
          break label165;
        }
      }
      else
      {
        if (paramFloat2 > 0.0F)
        {
          j = (int)((paramMotionEvent2.getY() - paramMotionEvent1.getY()) / paramFloat2 * 1000.0F);
          i = 8;
          break label165;
        }
        if (paramFloat2 < 0.0F)
        {
          j = (int)((paramMotionEvent2.getY() - paramMotionEvent1.getY()) / paramFloat2 * 1000.0F);
          i = 4;
          break label165;
        }
      }
      int j = 0;
      label165:
      int k = this.zza.zza();
      if (i != k) {
        return false;
      }
      this.zza.zzD(this.zzb.zzr(), j);
      return false;
    }
    finally {}
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent) {}
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public final void onShowPress(MotionEvent paramMotionEvent) {}
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */