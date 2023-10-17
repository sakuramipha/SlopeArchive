package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.ListenableWorker.Result;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DiagnosticsWorker
  extends Worker
{
  private static final String TAG = Logger.tagWithPrefix("DiagnosticsWrkr");
  
  public DiagnosticsWorker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
  }
  
  private static String workSpecRow(WorkSpec paramWorkSpec, String paramString1, Integer paramInteger, String paramString2)
  {
    return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[] { paramWorkSpec.id, paramWorkSpec.workerClassName, paramInteger, paramWorkSpec.state.name(), paramString1, paramString2 });
  }
  
  private static String workSpecRows(WorkNameDao paramWorkNameDao, WorkTagDao paramWorkTagDao, SystemIdInfoDao paramSystemIdInfoDao, List<WorkSpec> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject1;
    if (Build.VERSION.SDK_INT >= 23) {
      localObject1 = "Job Id";
    } else {
      localObject1 = "Alarm Id";
    }
    localStringBuilder.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[] { localObject1 }));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (WorkSpec)localIterator.next();
      paramList = null;
      Object localObject2 = paramSystemIdInfoDao.getSystemIdInfo(((WorkSpec)localObject1).id);
      if (localObject2 != null) {
        paramList = Integer.valueOf(((SystemIdInfo)localObject2).systemId);
      }
      localObject2 = paramWorkNameDao.getNamesForWorkSpecId(((WorkSpec)localObject1).id);
      List localList = paramWorkTagDao.getTagsForWorkSpecId(((WorkSpec)localObject1).id);
      localStringBuilder.append(workSpecRow((WorkSpec)localObject1, TextUtils.join(",", (Iterable)localObject2), paramList, TextUtils.join(",", localList)));
    }
    return localStringBuilder.toString();
  }
  
  public ListenableWorker.Result doWork()
  {
    Object localObject1 = WorkManagerImpl.getInstance(getApplicationContext()).getWorkDatabase();
    Object localObject2 = ((WorkDatabase)localObject1).workSpecDao();
    WorkNameDao localWorkNameDao = ((WorkDatabase)localObject1).workNameDao();
    WorkTagDao localWorkTagDao = ((WorkDatabase)localObject1).workTagDao();
    localObject1 = ((WorkDatabase)localObject1).systemIdInfoDao();
    Object localObject4 = ((WorkSpecDao)localObject2).getRecentlyCompletedWork(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
    Object localObject3 = ((WorkSpecDao)localObject2).getRunningWork();
    localObject2 = ((WorkSpecDao)localObject2).getAllEligibleWorkSpecsForScheduling(200);
    String str;
    if ((localObject4 != null) && (!((List)localObject4).isEmpty()))
    {
      Logger localLogger = Logger.get();
      str = TAG;
      localLogger.info(str, "Recently completed work:\n\n", new Throwable[0]);
      Logger.get().info(str, workSpecRows(localWorkNameDao, localWorkTagDao, (SystemIdInfoDao)localObject1, (List)localObject4), new Throwable[0]);
    }
    if ((localObject3 != null) && (!((List)localObject3).isEmpty()))
    {
      localObject4 = Logger.get();
      str = TAG;
      ((Logger)localObject4).info(str, "Running work:\n\n", new Throwable[0]);
      Logger.get().info(str, workSpecRows(localWorkNameDao, localWorkTagDao, (SystemIdInfoDao)localObject1, (List)localObject3), new Throwable[0]);
    }
    if ((localObject2 != null) && (!((List)localObject2).isEmpty()))
    {
      localObject3 = Logger.get();
      localObject4 = TAG;
      ((Logger)localObject3).info((String)localObject4, "Enqueued work:\n\n", new Throwable[0]);
      Logger.get().info((String)localObject4, workSpecRows(localWorkNameDao, localWorkTagDao, (SystemIdInfoDao)localObject1, (List)localObject2), new Throwable[0]);
    }
    return ListenableWorker.Result.success();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\workers\DiagnosticsWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */