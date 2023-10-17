package androidx.room.util;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FtsTableInfo
{
  private static final String[] FTS_OPTIONS = { "tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress=" };
  public final Set<String> columns;
  public final String name;
  public final Set<String> options;
  
  public FtsTableInfo(String paramString1, Set<String> paramSet, String paramString2)
  {
    this.name = paramString1;
    this.columns = paramSet;
    this.options = parseOptions(paramString2);
  }
  
  public FtsTableInfo(String paramString, Set<String> paramSet1, Set<String> paramSet2)
  {
    this.name = paramString;
    this.columns = paramSet1;
    this.options = paramSet2;
  }
  
  static Set<String> parseOptions(String paramString)
  {
    if (paramString.isEmpty()) {
      return new HashSet();
    }
    paramString = paramString.substring(paramString.indexOf('(') + 1, paramString.lastIndexOf(')'));
    Object localObject1 = new ArrayList();
    Object localObject2 = new ArrayDeque();
    int k = -1;
    int i = 0;
    int j;
    while (i < paramString.length())
    {
      char c = paramString.charAt(i);
      if ((c != '"') && (c != '\'')) {
        if (c != ',')
        {
          if (c != '[')
          {
            if (c != ']')
            {
              if (c != '`')
              {
                j = k;
                break label267;
              }
            }
            else
            {
              j = k;
              if (((ArrayDeque)localObject2).isEmpty()) {
                break label267;
              }
              j = k;
              if (((Character)((ArrayDeque)localObject2).peek()).charValue() != '[') {
                break label267;
              }
              ((ArrayDeque)localObject2).pop();
              j = k;
              break label267;
            }
          }
          else
          {
            j = k;
            if (!((ArrayDeque)localObject2).isEmpty()) {
              break label267;
            }
            ((ArrayDeque)localObject2).push(Character.valueOf(c));
            j = k;
            break label267;
          }
        }
        else
        {
          j = k;
          if (!((ArrayDeque)localObject2).isEmpty()) {
            break label267;
          }
          ((List)localObject1).add(paramString.substring(k + 1, i).trim());
          j = i;
          break label267;
        }
      }
      if (((ArrayDeque)localObject2).isEmpty())
      {
        ((ArrayDeque)localObject2).push(Character.valueOf(c));
        j = k;
      }
      else
      {
        j = k;
        if (((Character)((ArrayDeque)localObject2).peek()).charValue() == c)
        {
          ((ArrayDeque)localObject2).pop();
          j = k;
        }
      }
      label267:
      i++;
      k = j;
    }
    ((List)localObject1).add(paramString.substring(k + 1).trim());
    paramString = new HashSet();
    localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Iterator)localObject2).next();
      String[] arrayOfString = FTS_OPTIONS;
      j = arrayOfString.length;
      for (i = 0; i < j; i++) {
        if (((String)localObject1).startsWith(arrayOfString[i])) {
          paramString.add(localObject1);
        }
      }
    }
    return paramString;
  }
  
  public static FtsTableInfo read(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    return new FtsTableInfo(paramString, readColumns(paramSupportSQLiteDatabase, paramString), readOptions(paramSupportSQLiteDatabase, paramString));
  }
  
  private static Set<String> readColumns(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PRAGMA table_info(`");
    localStringBuilder.append(paramString);
    localStringBuilder.append("`)");
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query(localStringBuilder.toString());
    paramString = new HashSet();
    try
    {
      if (paramSupportSQLiteDatabase.getColumnCount() > 0)
      {
        int i = paramSupportSQLiteDatabase.getColumnIndex("name");
        while (paramSupportSQLiteDatabase.moveToNext()) {
          paramString.add(paramSupportSQLiteDatabase.getString(i));
        }
      }
      return paramString;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  private static Set<String> readOptions(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT * FROM sqlite_master WHERE `name` = '");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    paramString = paramSupportSQLiteDatabase.query(localStringBuilder.toString());
    try
    {
      if (paramString.moveToFirst()) {
        paramSupportSQLiteDatabase = paramString.getString(paramString.getColumnIndexOrThrow("sql"));
      } else {
        paramSupportSQLiteDatabase = "";
      }
      return parseOptions(paramSupportSQLiteDatabase);
    }
    finally
    {
      paramString.close();
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (FtsTableInfo)paramObject;
      Object localObject = this.name;
      if (localObject != null ? !((String)localObject).equals(((FtsTableInfo)paramObject).name) : ((FtsTableInfo)paramObject).name != null) {
        return false;
      }
      localObject = this.columns;
      if (localObject != null ? !((Set)localObject).equals(((FtsTableInfo)paramObject).columns) : ((FtsTableInfo)paramObject).columns != null) {
        return false;
      }
      localObject = this.options;
      paramObject = ((FtsTableInfo)paramObject).options;
      if (localObject != null) {
        bool = ((Set)localObject).equals(paramObject);
      } else if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    Object localObject = this.name;
    int k = 0;
    int i;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    } else {
      i = 0;
    }
    localObject = this.columns;
    int j;
    if (localObject != null) {
      j = ((Set)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.options;
    if (localObject != null) {
      k = ((Set)localObject).hashCode();
    }
    return (i * 31 + j) * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FtsTableInfo{name='");
    localStringBuilder.append(this.name);
    localStringBuilder.append('\'');
    localStringBuilder.append(", columns=");
    localStringBuilder.append(this.columns);
    localStringBuilder.append(", options=");
    localStringBuilder.append(this.options);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\roo\\util\FtsTableInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */