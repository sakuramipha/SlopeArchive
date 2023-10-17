package androidx.sqlite.db;

public abstract interface SupportSQLiteQuery
{
  public abstract void bindTo(SupportSQLiteProgram paramSupportSQLiteProgram);
  
  public abstract int getArgCount();
  
  public abstract String getSql();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\sqlite\db\SupportSQLiteQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */