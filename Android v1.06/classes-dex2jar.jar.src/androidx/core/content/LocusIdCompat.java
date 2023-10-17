package androidx.core.content;

import android.content.LocusId;
import android.os.Build.VERSION;
import androidx.core.util.Preconditions;

public final class LocusIdCompat
{
  private final String mId;
  private final LocusId mWrapped;
  
  public LocusIdCompat(String paramString)
  {
    this.mId = ((String)Preconditions.checkStringNotEmpty(paramString, "id cannot be empty"));
    if (Build.VERSION.SDK_INT >= 29) {
      this.mWrapped = Api29Impl.create(paramString);
    } else {
      this.mWrapped = null;
    }
  }
  
  private String getSanitizedId()
  {
    int i = this.mId.length();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(i);
    localStringBuilder.append("_chars");
    return localStringBuilder.toString();
  }
  
  public static LocusIdCompat toLocusIdCompat(LocusId paramLocusId)
  {
    Preconditions.checkNotNull(paramLocusId, "locusId cannot be null");
    return new LocusIdCompat((String)Preconditions.checkStringNotEmpty(Api29Impl.getId(paramLocusId), "id cannot be empty"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (getClass() != paramObject.getClass()) {
      return false;
    }
    paramObject = (LocusIdCompat)paramObject;
    String str = this.mId;
    if (str == null)
    {
      if (((LocusIdCompat)paramObject).mId != null) {
        bool = false;
      }
      return bool;
    }
    return str.equals(((LocusIdCompat)paramObject).mId);
  }
  
  public String getId()
  {
    return this.mId;
  }
  
  public int hashCode()
  {
    String str = this.mId;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    return 31 + i;
  }
  
  public LocusId toLocusId()
  {
    return this.mWrapped;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LocusIdCompat[");
    localStringBuilder.append(getSanitizedId());
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  private static class Api29Impl
  {
    static LocusId create(String paramString)
    {
      return new LocusId(paramString);
    }
    
    static String getId(LocusId paramLocusId)
    {
      return paramLocusId.getId();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\content\LocusIdCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */