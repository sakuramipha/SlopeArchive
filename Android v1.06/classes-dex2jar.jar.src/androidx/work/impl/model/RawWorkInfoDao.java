package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.List;

public abstract interface RawWorkInfoDao
{
  public abstract List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery paramSupportSQLiteQuery);
  
  public abstract LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(SupportSQLiteQuery paramSupportSQLiteQuery);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\RawWorkInfoDao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */