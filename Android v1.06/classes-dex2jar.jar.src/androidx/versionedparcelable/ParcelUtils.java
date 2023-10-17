package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParcelUtils
{
  private static final String INNER_BUNDLE_KEY = "a";
  
  public static <T extends VersionedParcelable> T fromInputStream(InputStream paramInputStream)
  {
    return new VersionedParcelStream(paramInputStream, null).readVersionedParcelable();
  }
  
  public static <T extends VersionedParcelable> T fromParcelable(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof ParcelImpl)) {
      return ((ParcelImpl)paramParcelable).getVersionedParcel();
    }
    throw new IllegalArgumentException("Invalid parcel");
  }
  
  public static <T extends VersionedParcelable> T getVersionedParcelable(Bundle paramBundle, String paramString)
  {
    try
    {
      paramBundle = (Bundle)paramBundle.getParcelable(paramString);
      if (paramBundle == null) {
        return null;
      }
      paramBundle.setClassLoader(ParcelUtils.class.getClassLoader());
      paramBundle = fromParcelable(paramBundle.getParcelable("a"));
      return paramBundle;
    }
    catch (RuntimeException paramBundle) {}
    return null;
  }
  
  public static <T extends VersionedParcelable> List<T> getVersionedParcelableList(Bundle paramBundle, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      paramBundle = (Bundle)paramBundle.getParcelable(paramString);
      paramBundle.setClassLoader(ParcelUtils.class.getClassLoader());
      paramBundle = paramBundle.getParcelableArrayList("a").iterator();
      while (paramBundle.hasNext()) {
        localArrayList.add(fromParcelable((Parcelable)paramBundle.next()));
      }
      return localArrayList;
    }
    catch (RuntimeException paramBundle) {}
    return null;
  }
  
  public static void putVersionedParcelable(Bundle paramBundle, String paramString, VersionedParcelable paramVersionedParcelable)
  {
    if (paramVersionedParcelable == null) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("a", toParcelable(paramVersionedParcelable));
    paramBundle.putParcelable(paramString, localBundle);
  }
  
  public static void putVersionedParcelableList(Bundle paramBundle, String paramString, List<? extends VersionedParcelable> paramList)
  {
    Bundle localBundle = new Bundle();
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(toParcelable((VersionedParcelable)paramList.next()));
    }
    localBundle.putParcelableArrayList("a", localArrayList);
    paramBundle.putParcelable(paramString, localBundle);
  }
  
  public static void toOutputStream(VersionedParcelable paramVersionedParcelable, OutputStream paramOutputStream)
  {
    paramOutputStream = new VersionedParcelStream(null, paramOutputStream);
    paramOutputStream.writeVersionedParcelable(paramVersionedParcelable);
    paramOutputStream.closeField();
  }
  
  public static Parcelable toParcelable(VersionedParcelable paramVersionedParcelable)
  {
    return new ParcelImpl(paramVersionedParcelable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\versionedparcelable\ParcelUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */