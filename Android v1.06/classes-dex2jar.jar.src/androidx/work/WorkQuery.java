package androidx.work;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class WorkQuery
{
  private final List<UUID> mIds;
  private final List<WorkInfo.State> mStates;
  private final List<String> mTags;
  private final List<String> mUniqueWorkNames;
  
  WorkQuery(Builder paramBuilder)
  {
    this.mIds = paramBuilder.mIds;
    this.mUniqueWorkNames = paramBuilder.mUniqueWorkNames;
    this.mTags = paramBuilder.mTags;
    this.mStates = paramBuilder.mStates;
  }
  
  public List<UUID> getIds()
  {
    return this.mIds;
  }
  
  public List<WorkInfo.State> getStates()
  {
    return this.mStates;
  }
  
  public List<String> getTags()
  {
    return this.mTags;
  }
  
  public List<String> getUniqueWorkNames()
  {
    return this.mUniqueWorkNames;
  }
  
  public static final class Builder
  {
    List<UUID> mIds = new ArrayList();
    List<WorkInfo.State> mStates = new ArrayList();
    List<String> mTags = new ArrayList();
    List<String> mUniqueWorkNames = new ArrayList();
    
    public static Builder fromIds(List<UUID> paramList)
    {
      Builder localBuilder = new Builder();
      localBuilder.addIds(paramList);
      return localBuilder;
    }
    
    public static Builder fromStates(List<WorkInfo.State> paramList)
    {
      Builder localBuilder = new Builder();
      localBuilder.addStates(paramList);
      return localBuilder;
    }
    
    public static Builder fromTags(List<String> paramList)
    {
      Builder localBuilder = new Builder();
      localBuilder.addTags(paramList);
      return localBuilder;
    }
    
    public static Builder fromUniqueWorkNames(List<String> paramList)
    {
      Builder localBuilder = new Builder();
      localBuilder.addUniqueWorkNames(paramList);
      return localBuilder;
    }
    
    public Builder addIds(List<UUID> paramList)
    {
      this.mIds.addAll(paramList);
      return this;
    }
    
    public Builder addStates(List<WorkInfo.State> paramList)
    {
      this.mStates.addAll(paramList);
      return this;
    }
    
    public Builder addTags(List<String> paramList)
    {
      this.mTags.addAll(paramList);
      return this;
    }
    
    public Builder addUniqueWorkNames(List<String> paramList)
    {
      this.mUniqueWorkNames.addAll(paramList);
      return this;
    }
    
    public WorkQuery build()
    {
      if ((this.mIds.isEmpty()) && (this.mUniqueWorkNames.isEmpty()) && (this.mTags.isEmpty()) && (this.mStates.isEmpty())) {
        throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
      }
      return new WorkQuery(this);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\WorkQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */