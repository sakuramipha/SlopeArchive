package androidx.work;

public enum ExistingWorkPolicy
{
  private static final ExistingWorkPolicy[] $VALUES;
  
  static
  {
    ExistingWorkPolicy localExistingWorkPolicy3 = new ExistingWorkPolicy("REPLACE", 0);
    REPLACE = localExistingWorkPolicy3;
    ExistingWorkPolicy localExistingWorkPolicy2 = new ExistingWorkPolicy("KEEP", 1);
    KEEP = localExistingWorkPolicy2;
    ExistingWorkPolicy localExistingWorkPolicy4 = new ExistingWorkPolicy("APPEND", 2);
    APPEND = localExistingWorkPolicy4;
    ExistingWorkPolicy localExistingWorkPolicy1 = new ExistingWorkPolicy("APPEND_OR_REPLACE", 3);
    APPEND_OR_REPLACE = localExistingWorkPolicy1;
    $VALUES = new ExistingWorkPolicy[] { localExistingWorkPolicy3, localExistingWorkPolicy2, localExistingWorkPolicy4, localExistingWorkPolicy1 };
  }
  
  private ExistingWorkPolicy() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\ExistingWorkPolicy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */