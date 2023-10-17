package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class z
  implements TextView.OnEditorActionListener
{
  final B a;
  
  z(B paramB) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 6)
    {
      paramTextView = this.a;
      B.-$$Nest$ma(paramTextView, B.-$$Nest$mb(paramTextView), false);
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */