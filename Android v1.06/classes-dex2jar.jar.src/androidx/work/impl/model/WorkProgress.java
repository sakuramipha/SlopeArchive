package androidx.work.impl.model;

import androidx.work.Data;

public class WorkProgress
{
  public final Data mProgress;
  public final String mWorkSpecId;
  
  public WorkProgress(String paramString, Data paramData)
  {
    this.mWorkSpecId = paramString;
    this.mProgress = paramData;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\WorkProgress.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */