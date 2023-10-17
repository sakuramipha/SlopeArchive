package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

public abstract interface ProgressUpdater
{
  public abstract ListenableFuture<Void> updateProgress(Context paramContext, UUID paramUUID, Data paramData);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\ProgressUpdater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */