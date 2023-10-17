package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

class y
  extends EditText
{
  final B a;
  
  y(B paramB, Context paramContext)
  {
    super(paramContext);
  }
  
  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      paramKeyEvent = this.a;
      B.-$$Nest$ma(paramKeyEvent, B.-$$Nest$mb(paramKeyEvent), true);
      return true;
    }
    if (paramInt == 84) {
      return true;
    }
    if ((paramInt == 66) && (paramKeyEvent.getAction() == 0) && ((getInputType() & 0x20000) == 0))
    {
      paramKeyEvent = this.a;
      B.-$$Nest$ma(paramKeyEvent, B.-$$Nest$mb(paramKeyEvent), false);
      return true;
    }
    return super.onKeyPreIme(paramInt, paramKeyEvent);
  }
  
  protected void onSelectionChanged(int paramInt1, int paramInt2)
  {
    B.-$$Nest$fgetb(this.a).reportSoftInputSelection(paramInt1, paramInt2 - paramInt1);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean) {
      ((InputMethodManager)B.-$$Nest$fgeta(this.a).getSystemService("input_method")).showSoftInput(this, 0);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */