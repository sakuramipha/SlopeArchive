package androidx.work.impl.foreground;

import androidx.work.ForegroundInfo;

public abstract interface ForegroundProcessor
{
  public abstract void startForeground(String paramString, ForegroundInfo paramForegroundInfo);
  
  public abstract void stopForeground(String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\foreground\ForegroundProcessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */