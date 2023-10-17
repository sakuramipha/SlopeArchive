package androidx.browser.trusted.sharing;

import android.os.Bundle;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ShareTarget
{
  public static final String ENCODING_TYPE_MULTIPART = "multipart/form-data";
  public static final String ENCODING_TYPE_URL_ENCODED = "application/x-www-form-urlencoded";
  public static final String KEY_ACTION = "androidx.browser.trusted.sharing.KEY_ACTION";
  public static final String KEY_ENCTYPE = "androidx.browser.trusted.sharing.KEY_ENCTYPE";
  public static final String KEY_METHOD = "androidx.browser.trusted.sharing.KEY_METHOD";
  public static final String KEY_PARAMS = "androidx.browser.trusted.sharing.KEY_PARAMS";
  public static final String METHOD_GET = "GET";
  public static final String METHOD_POST = "POST";
  public final String action;
  public final String encodingType;
  public final String method;
  public final Params params;
  
  public ShareTarget(String paramString1, String paramString2, String paramString3, Params paramParams)
  {
    this.action = paramString1;
    this.method = paramString2;
    this.encodingType = paramString3;
    this.params = paramParams;
  }
  
  public static ShareTarget fromBundle(Bundle paramBundle)
  {
    String str2 = paramBundle.getString("androidx.browser.trusted.sharing.KEY_ACTION");
    String str3 = paramBundle.getString("androidx.browser.trusted.sharing.KEY_METHOD");
    String str1 = paramBundle.getString("androidx.browser.trusted.sharing.KEY_ENCTYPE");
    paramBundle = Params.fromBundle(paramBundle.getBundle("androidx.browser.trusted.sharing.KEY_PARAMS"));
    if ((str2 != null) && (paramBundle != null)) {
      return new ShareTarget(str2, str3, str1, paramBundle);
    }
    return null;
  }
  
  public Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("androidx.browser.trusted.sharing.KEY_ACTION", this.action);
    localBundle.putString("androidx.browser.trusted.sharing.KEY_METHOD", this.method);
    localBundle.putString("androidx.browser.trusted.sharing.KEY_ENCTYPE", this.encodingType);
    localBundle.putBundle("androidx.browser.trusted.sharing.KEY_PARAMS", this.params.toBundle());
    return localBundle;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface EncodingType {}
  
  public static final class FileFormField
  {
    public static final String KEY_ACCEPTED_TYPES = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";
    public static final String KEY_NAME = "androidx.browser.trusted.sharing.KEY_FILE_NAME";
    public final List<String> acceptedTypes;
    public final String name;
    
    public FileFormField(String paramString, List<String> paramList)
    {
      this.name = paramString;
      this.acceptedTypes = Collections.unmodifiableList(paramList);
    }
    
    static FileFormField fromBundle(Bundle paramBundle)
    {
      Object localObject = null;
      if (paramBundle == null) {
        return null;
      }
      String str = paramBundle.getString("androidx.browser.trusted.sharing.KEY_FILE_NAME");
      ArrayList localArrayList = paramBundle.getStringArrayList("androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES");
      paramBundle = (Bundle)localObject;
      if (str != null) {
        if (localArrayList == null) {
          paramBundle = (Bundle)localObject;
        } else {
          paramBundle = new FileFormField(str, localArrayList);
        }
      }
      return paramBundle;
    }
    
    Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("androidx.browser.trusted.sharing.KEY_FILE_NAME", this.name);
      localBundle.putStringArrayList("androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES", new ArrayList(this.acceptedTypes));
      return localBundle;
    }
  }
  
  public static class Params
  {
    public static final String KEY_FILES = "androidx.browser.trusted.sharing.KEY_FILES";
    public static final String KEY_TEXT = "androidx.browser.trusted.sharing.KEY_TEXT";
    public static final String KEY_TITLE = "androidx.browser.trusted.sharing.KEY_TITLE";
    public final List<ShareTarget.FileFormField> files;
    public final String text;
    public final String title;
    
    public Params(String paramString1, String paramString2, List<ShareTarget.FileFormField> paramList)
    {
      this.title = paramString1;
      this.text = paramString2;
      this.files = paramList;
    }
    
    static Params fromBundle(Bundle paramBundle)
    {
      Object localObject1 = null;
      if (paramBundle == null) {
        return null;
      }
      Object localObject2 = paramBundle.getParcelableArrayList("androidx.browser.trusted.sharing.KEY_FILES");
      if (localObject2 != null)
      {
        ArrayList localArrayList = new ArrayList();
        localObject2 = ((List)localObject2).iterator();
        for (;;)
        {
          localObject1 = localArrayList;
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          localArrayList.add(ShareTarget.FileFormField.fromBundle((Bundle)((Iterator)localObject2).next()));
        }
      }
      return new Params(paramBundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), paramBundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), (List)localObject1);
    }
    
    Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.title);
      localBundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.text);
      if (this.files != null)
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = this.files.iterator();
        while (localIterator.hasNext()) {
          localArrayList.add(((ShareTarget.FileFormField)localIterator.next()).toBundle());
        }
        localBundle.putParcelableArrayList("androidx.browser.trusted.sharing.KEY_FILES", localArrayList);
      }
      return localBundle;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface RequestMethod {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\sharing\ShareTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */