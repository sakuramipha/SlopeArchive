package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class WorkInfo
{
  private UUID mId;
  private Data mOutputData;
  private Data mProgress;
  private int mRunAttemptCount;
  private State mState;
  private Set<String> mTags;
  
  public WorkInfo(UUID paramUUID, State paramState, Data paramData1, List<String> paramList, Data paramData2, int paramInt)
  {
    this.mId = paramUUID;
    this.mState = paramState;
    this.mOutputData = paramData1;
    this.mTags = new HashSet(paramList);
    this.mProgress = paramData2;
    this.mRunAttemptCount = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (WorkInfo)paramObject;
      if (this.mRunAttemptCount != ((WorkInfo)paramObject).mRunAttemptCount) {
        return false;
      }
      if (!this.mId.equals(((WorkInfo)paramObject).mId)) {
        return false;
      }
      if (this.mState != ((WorkInfo)paramObject).mState) {
        return false;
      }
      if (!this.mOutputData.equals(((WorkInfo)paramObject).mOutputData)) {
        return false;
      }
      if (!this.mTags.equals(((WorkInfo)paramObject).mTags)) {
        return false;
      }
      return this.mProgress.equals(((WorkInfo)paramObject).mProgress);
    }
    return false;
  }
  
  public UUID getId()
  {
    return this.mId;
  }
  
  public Data getOutputData()
  {
    return this.mOutputData;
  }
  
  public Data getProgress()
  {
    return this.mProgress;
  }
  
  public int getRunAttemptCount()
  {
    return this.mRunAttemptCount;
  }
  
  public State getState()
  {
    return this.mState;
  }
  
  public Set<String> getTags()
  {
    return this.mTags;
  }
  
  public int hashCode()
  {
    return ((((this.mId.hashCode() * 31 + this.mState.hashCode()) * 31 + this.mOutputData.hashCode()) * 31 + this.mTags.hashCode()) * 31 + this.mProgress.hashCode()) * 31 + this.mRunAttemptCount;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("WorkInfo{mId='");
    localStringBuilder.append(this.mId);
    localStringBuilder.append('\'');
    localStringBuilder.append(", mState=");
    localStringBuilder.append(this.mState);
    localStringBuilder.append(", mOutputData=");
    localStringBuilder.append(this.mOutputData);
    localStringBuilder.append(", mTags=");
    localStringBuilder.append(this.mTags);
    localStringBuilder.append(", mProgress=");
    localStringBuilder.append(this.mProgress);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static enum State
  {
    private static final State[] $VALUES;
    
    static
    {
      State localState4 = new State("ENQUEUED", 0);
      ENQUEUED = localState4;
      State localState1 = new State("RUNNING", 1);
      RUNNING = localState1;
      State localState3 = new State("SUCCEEDED", 2);
      SUCCEEDED = localState3;
      State localState5 = new State("FAILED", 3);
      FAILED = localState5;
      State localState2 = new State("BLOCKED", 4);
      BLOCKED = localState2;
      State localState6 = new State("CANCELLED", 5);
      CANCELLED = localState6;
      $VALUES = new State[] { localState4, localState1, localState3, localState5, localState2, localState6 };
    }
    
    private State() {}
    
    public boolean isFinished()
    {
      boolean bool;
      if ((this != SUCCEEDED) && (this != FAILED) && (this != CANCELLED)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\WorkInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */