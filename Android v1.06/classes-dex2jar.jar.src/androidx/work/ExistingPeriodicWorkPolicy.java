package androidx.work;

public enum ExistingPeriodicWorkPolicy
{
  private static final ExistingPeriodicWorkPolicy[] $VALUES;
  
  static
  {
    ExistingPeriodicWorkPolicy localExistingPeriodicWorkPolicy1 = new ExistingPeriodicWorkPolicy("REPLACE", 0);
    REPLACE = localExistingPeriodicWorkPolicy1;
    ExistingPeriodicWorkPolicy localExistingPeriodicWorkPolicy2 = new ExistingPeriodicWorkPolicy("KEEP", 1);
    KEEP = localExistingPeriodicWorkPolicy2;
    $VALUES = new ExistingPeriodicWorkPolicy[] { localExistingPeriodicWorkPolicy1, localExistingPeriodicWorkPolicy2 };
  }
  
  private ExistingPeriodicWorkPolicy() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\ExistingPeriodicWorkPolicy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */