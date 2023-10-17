package com.google.android.gms.tasks;

public abstract interface Continuation<TResult, TContinuationResult>
{
  public abstract TContinuationResult then(Task<TResult> paramTask)
    throws Exception;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\Continuation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */