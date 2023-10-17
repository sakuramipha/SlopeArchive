package androidx.work.impl.utils;

import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo.State;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class RawQueries
{
  private static void bindings(StringBuilder paramStringBuilder, int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    paramStringBuilder.append("?");
    for (int i = 1; i < paramInt; i++)
    {
      paramStringBuilder.append(",");
      paramStringBuilder.append("?");
    }
  }
  
  public static SupportSQLiteQuery workQueryToRawQuery(WorkQuery paramWorkQuery)
  {
    ArrayList localArrayList = new ArrayList();
    StringBuilder localStringBuilder = new StringBuilder("SELECT * FROM workspec");
    Object localObject2 = paramWorkQuery.getStates();
    boolean bool = ((List)localObject2).isEmpty();
    String str = " AND";
    Object localObject1 = " WHERE";
    if (!bool)
    {
      localObject1 = new ArrayList(((List)localObject2).size());
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((List)localObject1).add(Integer.valueOf(WorkTypeConverters.stateToInt((WorkInfo.State)((Iterator)localObject2).next())));
      }
      localStringBuilder.append(" WHERE");
      localStringBuilder.append(" state IN (");
      bindings(localStringBuilder, ((List)localObject1).size());
      localStringBuilder.append(")");
      localArrayList.addAll((Collection)localObject1);
      localObject1 = " AND";
    }
    List localList = paramWorkQuery.getIds();
    localObject2 = localObject1;
    if (!localList.isEmpty())
    {
      localObject2 = new ArrayList(localList.size());
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        ((List)localObject2).add(((UUID)localIterator.next()).toString());
      }
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(" id IN (");
      bindings(localStringBuilder, localList.size());
      localStringBuilder.append(")");
      localArrayList.addAll((Collection)localObject2);
      localObject2 = " AND";
    }
    localObject1 = paramWorkQuery.getTags();
    if (!((List)localObject1).isEmpty())
    {
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
      bindings(localStringBuilder, ((List)localObject1).size());
      localStringBuilder.append("))");
      localArrayList.addAll((Collection)localObject1);
      localObject1 = str;
    }
    else
    {
      localObject1 = localObject2;
    }
    paramWorkQuery = paramWorkQuery.getUniqueWorkNames();
    if (!paramWorkQuery.isEmpty())
    {
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
      bindings(localStringBuilder, paramWorkQuery.size());
      localStringBuilder.append("))");
      localArrayList.addAll(paramWorkQuery);
    }
    localStringBuilder.append(";");
    return new SimpleSQLiteQuery(localStringBuilder.toString(), localArrayList.toArray());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\RawQueries.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */