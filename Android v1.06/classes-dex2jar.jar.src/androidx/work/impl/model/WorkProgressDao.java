package androidx.work.impl.model;

import androidx.work.Data;
import java.util.List;

public abstract interface WorkProgressDao
{
  public abstract void delete(String paramString);
  
  public abstract void deleteAll();
  
  public abstract Data getProgressForWorkSpecId(String paramString);
  
  public abstract List<Data> getProgressForWorkSpecIds(List<String> paramList);
  
  public abstract void insert(WorkProgress paramWorkProgress);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\WorkProgressDao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */