package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer
{
  public static IconCompat read(VersionedParcel paramVersionedParcel)
  {
    IconCompat localIconCompat = new IconCompat();
    localIconCompat.mType = paramVersionedParcel.readInt(localIconCompat.mType, 1);
    localIconCompat.mData = paramVersionedParcel.readByteArray(localIconCompat.mData, 2);
    localIconCompat.mParcelable = paramVersionedParcel.readParcelable(localIconCompat.mParcelable, 3);
    localIconCompat.mInt1 = paramVersionedParcel.readInt(localIconCompat.mInt1, 4);
    localIconCompat.mInt2 = paramVersionedParcel.readInt(localIconCompat.mInt2, 5);
    localIconCompat.mTintList = ((ColorStateList)paramVersionedParcel.readParcelable(localIconCompat.mTintList, 6));
    localIconCompat.mTintModeStr = paramVersionedParcel.readString(localIconCompat.mTintModeStr, 7);
    localIconCompat.mString1 = paramVersionedParcel.readString(localIconCompat.mString1, 8);
    localIconCompat.onPostParceling();
    return localIconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, VersionedParcel paramVersionedParcel)
  {
    paramVersionedParcel.setSerializationFlags(true, true);
    paramIconCompat.onPreParceling(paramVersionedParcel.isStream());
    if (-1 != paramIconCompat.mType) {
      paramVersionedParcel.writeInt(paramIconCompat.mType, 1);
    }
    if (paramIconCompat.mData != null) {
      paramVersionedParcel.writeByteArray(paramIconCompat.mData, 2);
    }
    if (paramIconCompat.mParcelable != null) {
      paramVersionedParcel.writeParcelable(paramIconCompat.mParcelable, 3);
    }
    if (paramIconCompat.mInt1 != 0) {
      paramVersionedParcel.writeInt(paramIconCompat.mInt1, 4);
    }
    if (paramIconCompat.mInt2 != 0) {
      paramVersionedParcel.writeInt(paramIconCompat.mInt2, 5);
    }
    if (paramIconCompat.mTintList != null) {
      paramVersionedParcel.writeParcelable(paramIconCompat.mTintList, 6);
    }
    if (paramIconCompat.mTintModeStr != null) {
      paramVersionedParcel.writeString(paramIconCompat.mTintModeStr, 7);
    }
    if (paramIconCompat.mString1 != null) {
      paramVersionedParcel.writeString(paramIconCompat.mString1, 8);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\graphics\drawable\IconCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */