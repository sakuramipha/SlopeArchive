package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer
{
  public static RemoteActionCompat read(VersionedParcel paramVersionedParcel)
  {
    RemoteActionCompat localRemoteActionCompat = new RemoteActionCompat();
    localRemoteActionCompat.mIcon = ((IconCompat)paramVersionedParcel.readVersionedParcelable(localRemoteActionCompat.mIcon, 1));
    localRemoteActionCompat.mTitle = paramVersionedParcel.readCharSequence(localRemoteActionCompat.mTitle, 2);
    localRemoteActionCompat.mContentDescription = paramVersionedParcel.readCharSequence(localRemoteActionCompat.mContentDescription, 3);
    localRemoteActionCompat.mActionIntent = ((PendingIntent)paramVersionedParcel.readParcelable(localRemoteActionCompat.mActionIntent, 4));
    localRemoteActionCompat.mEnabled = paramVersionedParcel.readBoolean(localRemoteActionCompat.mEnabled, 5);
    localRemoteActionCompat.mShouldShowIcon = paramVersionedParcel.readBoolean(localRemoteActionCompat.mShouldShowIcon, 6);
    return localRemoteActionCompat;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, VersionedParcel paramVersionedParcel)
  {
    paramVersionedParcel.setSerializationFlags(false, false);
    paramVersionedParcel.writeVersionedParcelable(paramRemoteActionCompat.mIcon, 1);
    paramVersionedParcel.writeCharSequence(paramRemoteActionCompat.mTitle, 2);
    paramVersionedParcel.writeCharSequence(paramRemoteActionCompat.mContentDescription, 3);
    paramVersionedParcel.writeParcelable(paramRemoteActionCompat.mActionIntent, 4);
    paramVersionedParcel.writeBoolean(paramRemoteActionCompat.mEnabled, 5);
    paramVersionedParcel.writeBoolean(paramRemoteActionCompat.mShouldShowIcon, 6);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\app\RemoteActionCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */