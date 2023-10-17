package com.unity3d.player;

public class L
  implements Runnable
{
  private M a;
  private boolean b;
  
  public L(M paramM1, M paramM2)
  {
    this.a = paramM2;
    this.b = false;
  }
  
  public void run()
  {
    try
    {
      Thread.sleep(5000L);
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
    }
    if (!this.b)
    {
      int i = M.y;
      this.a.cancelOnPrepare();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\L.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */