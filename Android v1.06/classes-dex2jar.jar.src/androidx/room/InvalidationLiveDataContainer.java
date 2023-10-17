package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

class InvalidationLiveDataContainer
{
  private final RoomDatabase mDatabase;
  final Set<LiveData> mLiveDataSet = Collections.newSetFromMap(new IdentityHashMap());
  
  InvalidationLiveDataContainer(RoomDatabase paramRoomDatabase)
  {
    this.mDatabase = paramRoomDatabase;
  }
  
  <T> LiveData<T> create(String[] paramArrayOfString, boolean paramBoolean, Callable<T> paramCallable)
  {
    return new RoomTrackingLiveData(this.mDatabase, this, paramBoolean, paramCallable, paramArrayOfString);
  }
  
  void onActive(LiveData paramLiveData)
  {
    this.mLiveDataSet.add(paramLiveData);
  }
  
  void onInactive(LiveData paramLiveData)
  {
    this.mLiveDataSet.remove(paramLiveData);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\InvalidationLiveDataContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */