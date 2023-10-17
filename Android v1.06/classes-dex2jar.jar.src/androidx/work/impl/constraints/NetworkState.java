package androidx.work.impl.constraints;

public class NetworkState
{
  private boolean mIsConnected;
  private boolean mIsMetered;
  private boolean mIsNotRoaming;
  private boolean mIsValidated;
  
  public NetworkState(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.mIsConnected = paramBoolean1;
    this.mIsValidated = paramBoolean2;
    this.mIsMetered = paramBoolean3;
    this.mIsNotRoaming = paramBoolean4;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof NetworkState)) {
      return false;
    }
    paramObject = (NetworkState)paramObject;
    if ((this.mIsConnected != ((NetworkState)paramObject).mIsConnected) || (this.mIsValidated != ((NetworkState)paramObject).mIsValidated) || (this.mIsMetered != ((NetworkState)paramObject).mIsMetered) || (this.mIsNotRoaming != ((NetworkState)paramObject).mIsNotRoaming)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    boolean bool1 = this.mIsConnected;
    boolean bool2 = bool1;
    if (this.mIsValidated) {
      j = bool1 + true;
    }
    bool1 = j;
    int i;
    if (this.mIsMetered) {
      i = j + 256;
    }
    int j = i;
    if (this.mIsNotRoaming) {
      j = i + 4096;
    }
    return j;
  }
  
  public boolean isConnected()
  {
    return this.mIsConnected;
  }
  
  public boolean isMetered()
  {
    return this.mIsMetered;
  }
  
  public boolean isNotRoaming()
  {
    return this.mIsNotRoaming;
  }
  
  public boolean isValidated()
  {
    return this.mIsValidated;
  }
  
  public String toString()
  {
    return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[] { Boolean.valueOf(this.mIsConnected), Boolean.valueOf(this.mIsValidated), Boolean.valueOf(this.mIsMetered), Boolean.valueOf(this.mIsNotRoaming) });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\NetworkState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */