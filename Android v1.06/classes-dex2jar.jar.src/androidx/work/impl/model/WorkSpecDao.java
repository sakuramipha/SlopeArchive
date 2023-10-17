package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.work.Data;
import androidx.work.WorkInfo.State;
import java.util.List;

public abstract interface WorkSpecDao
{
  public abstract void delete(String paramString);
  
  public abstract List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int paramInt);
  
  public abstract List<String> getAllUnfinishedWork();
  
  public abstract List<String> getAllWorkSpecIds();
  
  public abstract LiveData<List<String>> getAllWorkSpecIdsLiveData();
  
  public abstract List<WorkSpec> getEligibleWorkForScheduling(int paramInt);
  
  public abstract List<Data> getInputsFromPrerequisites(String paramString);
  
  public abstract List<WorkSpec> getRecentlyCompletedWork(long paramLong);
  
  public abstract List<WorkSpec> getRunningWork();
  
  public abstract LiveData<Long> getScheduleRequestedAtLiveData(String paramString);
  
  public abstract List<WorkSpec> getScheduledWork();
  
  public abstract WorkInfo.State getState(String paramString);
  
  public abstract List<String> getUnfinishedWorkWithName(String paramString);
  
  public abstract List<String> getUnfinishedWorkWithTag(String paramString);
  
  public abstract WorkSpec getWorkSpec(String paramString);
  
  public abstract List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String paramString);
  
  public abstract WorkSpec[] getWorkSpecs(List<String> paramList);
  
  public abstract WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String paramString);
  
  public abstract List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> paramList);
  
  public abstract List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String paramString);
  
  public abstract List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String paramString);
  
  public abstract LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> paramList);
  
  public abstract LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String paramString);
  
  public abstract LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String paramString);
  
  public abstract boolean hasUnfinishedWork();
  
  public abstract int incrementWorkSpecRunAttemptCount(String paramString);
  
  public abstract void insertWorkSpec(WorkSpec paramWorkSpec);
  
  public abstract int markWorkSpecScheduled(String paramString, long paramLong);
  
  public abstract void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
  
  public abstract int resetScheduledState();
  
  public abstract int resetWorkSpecRunAttemptCount(String paramString);
  
  public abstract void setOutput(String paramString, Data paramData);
  
  public abstract void setPeriodStartTime(String paramString, long paramLong);
  
  public abstract int setState(WorkInfo.State paramState, String... paramVarArgs);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\WorkSpecDao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */