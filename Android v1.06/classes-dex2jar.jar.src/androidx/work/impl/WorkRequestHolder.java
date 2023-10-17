package androidx.work.impl;

import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import java.util.Set;
import java.util.UUID;

public class WorkRequestHolder
  extends WorkRequest
{
  public WorkRequestHolder(UUID paramUUID, WorkSpec paramWorkSpec, Set<String> paramSet)
  {
    super(paramUUID, paramWorkSpec, paramSet);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\WorkRequestHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */