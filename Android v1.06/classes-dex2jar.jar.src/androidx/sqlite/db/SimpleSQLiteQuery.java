package androidx.sqlite.db;

public final class SimpleSQLiteQuery
  implements SupportSQLiteQuery
{
  private final Object[] mBindArgs;
  private final String mQuery;
  
  public SimpleSQLiteQuery(String paramString)
  {
    this(paramString, null);
  }
  
  public SimpleSQLiteQuery(String paramString, Object[] paramArrayOfObject)
  {
    this.mQuery = paramString;
    this.mBindArgs = paramArrayOfObject;
  }
  
  private static void bind(SupportSQLiteProgram paramSupportSQLiteProgram, int paramInt, Object paramObject)
  {
    if (paramObject == null)
    {
      paramSupportSQLiteProgram.bindNull(paramInt);
    }
    else if ((paramObject instanceof byte[]))
    {
      paramSupportSQLiteProgram.bindBlob(paramInt, (byte[])paramObject);
    }
    else if ((paramObject instanceof Float))
    {
      paramSupportSQLiteProgram.bindDouble(paramInt, ((Float)paramObject).floatValue());
    }
    else if ((paramObject instanceof Double))
    {
      paramSupportSQLiteProgram.bindDouble(paramInt, ((Double)paramObject).doubleValue());
    }
    else if ((paramObject instanceof Long))
    {
      paramSupportSQLiteProgram.bindLong(paramInt, ((Long)paramObject).longValue());
    }
    else if ((paramObject instanceof Integer))
    {
      paramSupportSQLiteProgram.bindLong(paramInt, ((Integer)paramObject).intValue());
    }
    else if ((paramObject instanceof Short))
    {
      paramSupportSQLiteProgram.bindLong(paramInt, ((Short)paramObject).shortValue());
    }
    else if ((paramObject instanceof Byte))
    {
      paramSupportSQLiteProgram.bindLong(paramInt, ((Byte)paramObject).byteValue());
    }
    else if ((paramObject instanceof String))
    {
      paramSupportSQLiteProgram.bindString(paramInt, (String)paramObject);
    }
    else
    {
      if (!(paramObject instanceof Boolean)) {
        break label237;
      }
      long l;
      if (((Boolean)paramObject).booleanValue()) {
        l = 1L;
      } else {
        l = 0L;
      }
      paramSupportSQLiteProgram.bindLong(paramInt, l);
    }
    return;
    label237:
    paramSupportSQLiteProgram = new StringBuilder();
    paramSupportSQLiteProgram.append("Cannot bind ");
    paramSupportSQLiteProgram.append(paramObject);
    paramSupportSQLiteProgram.append(" at index ");
    paramSupportSQLiteProgram.append(paramInt);
    paramSupportSQLiteProgram.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
    throw new IllegalArgumentException(paramSupportSQLiteProgram.toString());
  }
  
  public static void bind(SupportSQLiteProgram paramSupportSQLiteProgram, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return;
    }
    int j = paramArrayOfObject.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramArrayOfObject[i];
      i++;
      bind(paramSupportSQLiteProgram, i, localObject);
    }
  }
  
  public void bindTo(SupportSQLiteProgram paramSupportSQLiteProgram)
  {
    bind(paramSupportSQLiteProgram, this.mBindArgs);
  }
  
  public int getArgCount()
  {
    Object[] arrayOfObject = this.mBindArgs;
    int i;
    if (arrayOfObject == null) {
      i = 0;
    } else {
      i = arrayOfObject.length;
    }
    return i;
  }
  
  public String getSql()
  {
    return this.mQuery;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\sqlite\db\SimpleSQLiteQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */