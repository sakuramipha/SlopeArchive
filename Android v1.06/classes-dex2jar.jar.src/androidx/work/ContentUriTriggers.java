package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

public final class ContentUriTriggers
{
  private final Set<Trigger> mTriggers = new HashSet();
  
  public void add(Uri paramUri, boolean paramBoolean)
  {
    paramUri = new Trigger(paramUri, paramBoolean);
    this.mTriggers.add(paramUri);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (ContentUriTriggers)paramObject;
      return this.mTriggers.equals(((ContentUriTriggers)paramObject).mTriggers);
    }
    return false;
  }
  
  public Set<Trigger> getTriggers()
  {
    return this.mTriggers;
  }
  
  public int hashCode()
  {
    return this.mTriggers.hashCode();
  }
  
  public int size()
  {
    return this.mTriggers.size();
  }
  
  public static final class Trigger
  {
    private final boolean mTriggerForDescendants;
    private final Uri mUri;
    
    Trigger(Uri paramUri, boolean paramBoolean)
    {
      this.mUri = paramUri;
      this.mTriggerForDescendants = paramBoolean;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (getClass() == paramObject.getClass()))
      {
        paramObject = (Trigger)paramObject;
        if ((this.mTriggerForDescendants != ((Trigger)paramObject).mTriggerForDescendants) || (!this.mUri.equals(((Trigger)paramObject).mUri))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public Uri getUri()
    {
      return this.mUri;
    }
    
    public int hashCode()
    {
      return this.mUri.hashCode() * 31 + this.mTriggerForDescendants;
    }
    
    public boolean shouldTriggerForDescendants()
    {
      return this.mTriggerForDescendants;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\ContentUriTriggers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */