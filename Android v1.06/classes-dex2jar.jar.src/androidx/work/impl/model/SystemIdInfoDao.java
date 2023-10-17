package androidx.work.impl.model;

import java.util.List;

public abstract interface SystemIdInfoDao
{
  public abstract SystemIdInfo getSystemIdInfo(String paramString);
  
  public abstract List<String> getWorkSpecIds();
  
  public abstract void insertSystemIdInfo(SystemIdInfo paramSystemIdInfo);
  
  public abstract void removeSystemIdInfo(String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\SystemIdInfoDao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */