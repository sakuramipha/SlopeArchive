package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class zzcey
  implements DialogInterface.OnClickListener
{
  final JsPromptResult zza;
  
  zzcey(JsPromptResult paramJsPromptResult, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.zza.confirm(this.zzb.getText().toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */