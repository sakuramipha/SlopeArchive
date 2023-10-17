package com.google.android.gms.tasks;

public final class DuplicateTaskCompletionException
  extends IllegalStateException
{
  private DuplicateTaskCompletionException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public static IllegalStateException of(Task<?> paramTask)
  {
    if (!paramTask.isComplete()) {
      return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
    }
    Exception localException = paramTask.getException();
    if (localException != null)
    {
      paramTask = "failure";
    }
    else if (paramTask.isSuccessful())
    {
      paramTask = String.valueOf(paramTask.getResult());
      String.valueOf(paramTask).length();
      paramTask = "result ".concat(String.valueOf(paramTask));
    }
    else if (paramTask.isCanceled())
    {
      paramTask = "cancellation";
    }
    else
    {
      paramTask = "unknown issue";
    }
    if (paramTask.length() != 0) {
      paramTask = "Complete with: ".concat(paramTask);
    } else {
      paramTask = new String("Complete with: ");
    }
    return new DuplicateTaskCompletionException(paramTask, localException);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\DuplicateTaskCompletionException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */