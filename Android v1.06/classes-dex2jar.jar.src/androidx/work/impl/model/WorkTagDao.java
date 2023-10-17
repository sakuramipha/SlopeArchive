package androidx.work.impl.model;

import java.util.List;

public abstract interface WorkTagDao
{
  public abstract List<String> getTagsForWorkSpecId(String paramString);
  
  public abstract List<String> getWorkSpecIdsWithTag(String paramString);
  
  public abstract void insert(WorkTag paramWorkTag);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\WorkTagDao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */