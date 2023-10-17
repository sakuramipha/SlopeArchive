package com.google.android.gms.tasks;

public class NativeOnCompleteListener
  implements OnCompleteListener<Object>
{
  private final long zza;
  
  public NativeOnCompleteListener(long paramLong)
  {
    this.zza = paramLong;
  }
  
  public static void createAndAddCallback(Task<Object> paramTask, long paramLong)
  {
    paramTask.addOnCompleteListener(new NativeOnCompleteListener(paramLong));
  }
  
  public native void nativeOnComplete(long paramLong, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, String paramString);
  
  public void onComplete(Task<Object> paramTask)
  {
    Object localObject;
    String str;
    if (paramTask.isSuccessful())
    {
      localObject = paramTask.getResult();
      str = null;
    }
    else
    {
      if (!paramTask.isCanceled())
      {
        localObject = paramTask.getException();
        if (localObject != null)
        {
          str = ((Exception)localObject).getMessage();
          localObject = null;
          break label47;
        }
      }
      localObject = null;
      str = null;
    }
    label47:
    nativeOnComplete(this.zza, localObject, paramTask.isSuccessful(), paramTask.isCanceled(), str);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\NativeOnCompleteListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */