package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzt;

final class zzbqt
  implements DialogInterface.OnClickListener
{
  final zzbqv zzc;
  
  zzbqt(zzbqv paramzzbqv, String paramString1, String paramString2) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    DownloadManager localDownloadManager = (DownloadManager)zzbqv.zza(this.zzc).getSystemService("download");
    try
    {
      String str1 = this.zza;
      String str2 = this.zzb;
      paramDialogInterface = new android/app/DownloadManager$Request;
      paramDialogInterface.<init>(Uri.parse(str1));
      paramDialogInterface.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
      zzt.zzp();
      paramDialogInterface.allowScanningByMediaScanner();
      paramDialogInterface.setNotificationVisibility(1);
      localDownloadManager.enqueue(paramDialogInterface);
      return;
    }
    catch (IllegalStateException paramDialogInterface)
    {
      this.zzc.zzg("Could not store picture.");
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */