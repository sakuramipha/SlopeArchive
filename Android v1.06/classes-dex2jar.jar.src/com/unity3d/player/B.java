package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class B
  extends Dialog
  implements View.OnClickListener, TextWatcher
{
  private Context a = null;
  private UnityPlayer b = null;
  private boolean c;
  public boolean d;
  
  public B(Context paramContext, UnityPlayer paramUnityPlayer, String paramString1, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, String paramString2, int paramInt2, boolean paramBoolean5, boolean paramBoolean6)
  {
    super(paramContext);
    this.a = paramContext;
    this.b = paramUnityPlayer;
    paramUnityPlayer = getWindow();
    this.d = paramBoolean6;
    paramUnityPlayer.requestFeature(1);
    paramContext = paramUnityPlayer.getAttributes();
    paramContext.gravity = 80;
    paramContext.x = 0;
    paramContext.y = 0;
    paramUnityPlayer.setAttributes(paramContext);
    paramUnityPlayer.setBackgroundDrawable(new ColorDrawable(0));
    paramContext = createSoftInputView();
    setContentView(paramContext);
    paramUnityPlayer.setLayout(-1, -2);
    paramUnityPlayer.clearFlags(2);
    paramUnityPlayer.clearFlags(134217728);
    paramUnityPlayer.clearFlags(67108864);
    if (!this.d)
    {
      paramUnityPlayer.addFlags(32);
      paramUnityPlayer.addFlags(262144);
    }
    paramUnityPlayer = (EditText)findViewById(A.-$$Nest$sfgetb());
    Button localButton = (Button)findViewById(A.-$$Nest$sfgeta());
    a(paramUnityPlayer, paramString1, paramInt1, paramBoolean1, paramBoolean2, paramBoolean3, paramString2, paramInt2);
    localButton.setOnClickListener(this);
    paramUnityPlayer.getCurrentTextColor();
    a(paramBoolean5);
    this.b.getViewTreeObserver().addOnGlobalLayoutListener(new x(this, paramContext));
    getWindow().setSoftInputMode(5);
    paramUnityPlayer.requestFocus();
  }
  
  private void a(EditText paramEditText, String paramString1, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, int paramInt2)
  {
    paramEditText.setBackgroundColor(-1);
    paramEditText.setImeOptions(6);
    paramEditText.setText(paramString1);
    paramEditText.setHint(paramString2);
    paramEditText.setHintTextColor(1627389952);
    if (paramBoolean1) {
      i = 32768;
    } else {
      i = 524288;
    }
    if (paramBoolean2) {
      j = 131072;
    } else {
      j = 0;
    }
    int k;
    if (paramBoolean3) {
      k = 128;
    } else {
      k = 0;
    }
    int j = i | j | k;
    int i = j;
    if (paramInt1 >= 0) {
      if (paramInt1 > 11)
      {
        i = j;
      }
      else
      {
        paramString1 = new int[12];
        String tmp112_111 = paramString1;
        tmp112_111[0] = 1;
        String tmp116_112 = tmp112_111;
        tmp116_112[1] = '䀁';
        String tmp122_116 = tmp116_112;
        tmp122_116[2] = '。';
        String tmp128_122 = tmp122_116;
        tmp128_122[3] = 17;
        String tmp133_128 = tmp128_122;
        tmp133_128[4] = 2;
        String tmp137_133 = tmp133_128;
        tmp137_133[5] = 3;
        String tmp141_137 = tmp137_133;
        tmp141_137[6] = '⁡';
        String tmp148_141 = tmp141_137;
        tmp148_141[7] = 33;
        String tmp154_148 = tmp148_141;
        tmp154_148[8] = 1;
        String tmp159_154 = tmp154_148;
        tmp159_154[9] = '䀡';
        String tmp166_159 = tmp159_154;
        tmp166_159[10] = 17;
        String tmp172_166 = tmp166_159;
        tmp172_166[11] = ' ';
        tmp172_166;
        if ((paramString1[paramInt1] & 0x2) != 0) {
          i = paramString1[paramInt1];
        } else {
          i = j | paramString1[paramInt1];
        }
      }
    }
    paramEditText.setInputType(i);
    paramEditText.setImeOptions(33554432);
    if (paramInt2 > 0) {
      paramEditText.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt2) });
    }
    paramEditText.addTextChangedListener(this);
    paramEditText.setSelection(paramEditText.getText().length());
    paramEditText.setClickable(true);
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    ((EditText)findViewById(A.-$$Nest$sfgetb())).setSelection(0, 0);
    this.b.reportSoftInputStr(paramString, 1, paramBoolean);
  }
  
  private String b()
  {
    EditText localEditText = (EditText)findViewById(A.-$$Nest$sfgetb());
    if (localEditText == null) {
      return null;
    }
    return localEditText.getText().toString();
  }
  
  public String a()
  {
    Object localObject = ((InputMethodManager)this.a.getSystemService("input_method")).getCurrentInputMethodSubtype();
    if (localObject == null) {
      return null;
    }
    String str1 = ((InputMethodSubtype)localObject).getLocale();
    if ((str1 != null) && (!str1.equals(""))) {
      return str1;
    }
    str1 = ((InputMethodSubtype)localObject).getMode();
    String str2 = ((InputMethodSubtype)localObject).getExtraValue();
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(str2);
    return ((StringBuilder)localObject).toString();
  }
  
  public void a(int paramInt)
  {
    EditText localEditText = (EditText)findViewById(A.-$$Nest$sfgetb());
    if (localEditText != null) {
      if (paramInt > 0) {
        localEditText.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
      } else {
        localEditText.setFilters(new InputFilter[0]);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    EditText localEditText = (EditText)findViewById(A.-$$Nest$sfgetb());
    if (localEditText != null)
    {
      int i = localEditText.getText().length();
      paramInt2 += paramInt1;
      if (i >= paramInt2) {
        localEditText.setSelection(paramInt1, paramInt2);
      }
    }
  }
  
  public void a(String paramString)
  {
    EditText localEditText = (EditText)findViewById(A.-$$Nest$sfgetb());
    if (localEditText != null)
    {
      localEditText.setText(paramString);
      localEditText.setSelection(paramString.length());
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
    Object localObject1 = (EditText)findViewById(A.-$$Nest$sfgetb());
    Button localButton = (Button)findViewById(A.-$$Nest$sfgeta());
    Object localObject2 = findViewById(A.-$$Nest$sfgetc());
    if (paramBoolean)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)((EditText)localObject1).getLayoutParams();
      localLayoutParams.height = 1;
      ((EditText)localObject1).setLayoutParams(localLayoutParams);
      localObject1 = (RelativeLayout.LayoutParams)localButton.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject1).height = 1;
      localButton.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      ((View)localObject2).setPadding(0, 0, 0, 0);
      ((View)localObject2).setVisibility(4);
    }
    else
    {
      ((View)localObject2).setVisibility(0);
      ((View)localObject2).setPadding(16, 16, 16, 16);
      localObject2 = (RelativeLayout.LayoutParams)((EditText)localObject1).getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject2).height = -2;
      ((EditText)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localObject1 = (RelativeLayout.LayoutParams)localButton.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject1).height = -2;
      localButton.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    this.b.reportSoftInputStr(paramEditable.toString(), 0, false);
    paramEditable = (EditText)findViewById(A.-$$Nest$sfgetb());
    int j = paramEditable.getSelectionStart();
    int i = paramEditable.getSelectionEnd();
    this.b.reportSoftInputSelection(j, i - j);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  protected View createSoftInputView()
  {
    RelativeLayout localRelativeLayout = new RelativeLayout(this.a);
    localRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    localRelativeLayout.setBackgroundColor(-1);
    localRelativeLayout.setId(A.-$$Nest$sfgetc());
    Object localObject2 = new y(this, this.a);
    Object localObject1 = new RelativeLayout.LayoutParams(-1, -2);
    ((RelativeLayout.LayoutParams)localObject1).addRule(15);
    int j = A.-$$Nest$sfgeta();
    ((RelativeLayout.LayoutParams)localObject1).addRule(0, j);
    ((EditText)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    int i = A.-$$Nest$sfgetb();
    ((EditText)localObject2).setId(i);
    localRelativeLayout.addView((View)localObject2);
    localObject1 = new Button(this.a);
    ((Button)localObject1).setText(this.a.getResources().getIdentifier("ok", "string", "android"));
    localObject2 = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject2).addRule(15);
    ((RelativeLayout.LayoutParams)localObject2).addRule(11);
    ((Button)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    ((Button)localObject1).setId(j);
    ((Button)localObject1).setBackgroundColor(0);
    localRelativeLayout.addView((View)localObject1);
    ((EditText)localRelativeLayout.findViewById(i)).setOnEditorActionListener(new z(this));
    localRelativeLayout.setPadding(16, 16, 16, 16);
    return localRelativeLayout;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((!this.d) && ((paramMotionEvent.getAction() == 4) || (this.c))) {
      return true;
    }
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void onBackPressed()
  {
    a(b(), true);
  }
  
  public void onClick(View paramView)
  {
    a(b(), false);
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\B.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */