package androidx.core.os;

import android.os.Parcel;

public final class ParcelCompat
{
  public static boolean readBoolean(Parcel paramParcel)
  {
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void writeBoolean(Parcel paramParcel, boolean paramBoolean)
  {
    paramParcel.writeInt(paramBoolean);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\os\ParcelCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */