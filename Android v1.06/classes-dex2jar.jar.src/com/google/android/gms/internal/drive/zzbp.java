package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;

final class zzbp
  implements DriveFile.DownloadProgressListener
{
  private final ListenerHolder<DriveFile.DownloadProgressListener> zzfa;
  
  public zzbp(ListenerHolder<DriveFile.DownloadProgressListener> paramListenerHolder)
  {
    this.zzfa = paramListenerHolder;
  }
  
  public final void onProgress(long paramLong1, long paramLong2)
  {
    this.zzfa.notifyListener(new zzbq(this, paramLong1, paramLong2));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */