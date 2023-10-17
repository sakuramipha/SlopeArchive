package androidx.core.view;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class ContentInfoCompat
{
  public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
  public static final int SOURCE_APP = 0;
  public static final int SOURCE_CLIPBOARD = 1;
  public static final int SOURCE_DRAG_AND_DROP = 3;
  public static final int SOURCE_INPUT_METHOD = 2;
  final ClipData mClip;
  final Bundle mExtras;
  final int mFlags;
  final Uri mLinkUri;
  final int mSource;
  
  ContentInfoCompat(Builder paramBuilder)
  {
    this.mClip = ((ClipData)Preconditions.checkNotNull(paramBuilder.mClip));
    this.mSource = Preconditions.checkArgumentInRange(paramBuilder.mSource, 0, 3, "source");
    this.mFlags = Preconditions.checkFlagsArgument(paramBuilder.mFlags, 1);
    this.mLinkUri = paramBuilder.mLinkUri;
    this.mExtras = paramBuilder.mExtras;
  }
  
  private static ClipData buildClipData(ClipDescription paramClipDescription, List<ClipData.Item> paramList)
  {
    paramClipDescription = new ClipData(new ClipDescription(paramClipDescription), (ClipData.Item)paramList.get(0));
    for (int i = 1; i < paramList.size(); i++) {
      paramClipDescription.addItem((ClipData.Item)paramList.get(i));
    }
    return paramClipDescription;
  }
  
  static String flagsToString(int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      return "FLAG_CONVERT_TO_PLAIN_TEXT";
    }
    return String.valueOf(paramInt);
  }
  
  static String sourceToString(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3) {
            return String.valueOf(paramInt);
          }
          return "SOURCE_DRAG_AND_DROP";
        }
        return "SOURCE_INPUT_METHOD";
      }
      return "SOURCE_CLIPBOARD";
    }
    return "SOURCE_APP";
  }
  
  public ClipData getClip()
  {
    return this.mClip;
  }
  
  public Bundle getExtras()
  {
    return this.mExtras;
  }
  
  public int getFlags()
  {
    return this.mFlags;
  }
  
  public Uri getLinkUri()
  {
    return this.mLinkUri;
  }
  
  public int getSource()
  {
    return this.mSource;
  }
  
  public Pair<ContentInfoCompat, ContentInfoCompat> partition(Predicate<ClipData.Item> paramPredicate)
  {
    int j = this.mClip.getItemCount();
    int i = 0;
    Object localObject = null;
    if (j == 1)
    {
      boolean bool = paramPredicate.test(this.mClip.getItemAt(0));
      if (bool) {
        paramPredicate = this;
      } else {
        paramPredicate = null;
      }
      if (!bool) {
        localObject = this;
      }
      return Pair.create(paramPredicate, localObject);
    }
    localObject = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    while (i < this.mClip.getItemCount())
    {
      ClipData.Item localItem = this.mClip.getItemAt(i);
      if (paramPredicate.test(localItem)) {
        ((ArrayList)localObject).add(localItem);
      } else {
        localArrayList.add(localItem);
      }
      i++;
    }
    if (((ArrayList)localObject).isEmpty()) {
      return Pair.create(null, this);
    }
    if (localArrayList.isEmpty()) {
      return Pair.create(this, null);
    }
    return Pair.create(new Builder(this).setClip(buildClipData(this.mClip.getDescription(), (List)localObject)).build(), new Builder(this).setClip(buildClipData(this.mClip.getDescription(), localArrayList)).build());
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ContentInfoCompat{clip=");
    localStringBuilder.append(this.mClip.getDescription());
    localStringBuilder.append(", source=");
    localStringBuilder.append(sourceToString(this.mSource));
    localStringBuilder.append(", flags=");
    localStringBuilder.append(flagsToString(this.mFlags));
    Object localObject = this.mLinkUri;
    String str = "";
    if (localObject == null)
    {
      localObject = "";
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", hasLinkUri(");
      ((StringBuilder)localObject).append(this.mLinkUri.toString().length());
      ((StringBuilder)localObject).append(")");
      localObject = ((StringBuilder)localObject).toString();
    }
    localStringBuilder.append((String)localObject);
    if (this.mExtras == null) {
      localObject = str;
    } else {
      localObject = ", hasExtras";
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
  {
    ClipData mClip;
    Bundle mExtras;
    int mFlags;
    Uri mLinkUri;
    int mSource;
    
    public Builder(ClipData paramClipData, int paramInt)
    {
      this.mClip = paramClipData;
      this.mSource = paramInt;
    }
    
    public Builder(ContentInfoCompat paramContentInfoCompat)
    {
      this.mClip = paramContentInfoCompat.mClip;
      this.mSource = paramContentInfoCompat.mSource;
      this.mFlags = paramContentInfoCompat.mFlags;
      this.mLinkUri = paramContentInfoCompat.mLinkUri;
      this.mExtras = paramContentInfoCompat.mExtras;
    }
    
    public ContentInfoCompat build()
    {
      return new ContentInfoCompat(this);
    }
    
    public Builder setClip(ClipData paramClipData)
    {
      this.mClip = paramClipData;
      return this;
    }
    
    public Builder setExtras(Bundle paramBundle)
    {
      this.mExtras = paramBundle;
      return this;
    }
    
    public Builder setFlags(int paramInt)
    {
      this.mFlags = paramInt;
      return this;
    }
    
    public Builder setLinkUri(Uri paramUri)
    {
      this.mLinkUri = paramUri;
      return this;
    }
    
    public Builder setSource(int paramInt)
    {
      this.mSource = paramInt;
      return this;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Flags {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Source {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\ContentInfoCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */