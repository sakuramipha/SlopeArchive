package androidx.work;

public enum BackoffPolicy
{
  private static final BackoffPolicy[] $VALUES;
  
  static
  {
    BackoffPolicy localBackoffPolicy2 = new BackoffPolicy("EXPONENTIAL", 0);
    EXPONENTIAL = localBackoffPolicy2;
    BackoffPolicy localBackoffPolicy1 = new BackoffPolicy("LINEAR", 1);
    LINEAR = localBackoffPolicy1;
    $VALUES = new BackoffPolicy[] { localBackoffPolicy2, localBackoffPolicy1 };
  }
  
  private BackoffPolicy() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\BackoffPolicy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */