package androidx.room.util;

public class SneakyThrow
{
  public static void reThrow(Exception paramException)
  {
    sneakyThrow(paramException);
  }
  
  private static <E extends Throwable> void sneakyThrow(Throwable paramThrowable)
    throws Throwable
  {
    throw paramThrowable;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\roo\\util\SneakyThrow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */