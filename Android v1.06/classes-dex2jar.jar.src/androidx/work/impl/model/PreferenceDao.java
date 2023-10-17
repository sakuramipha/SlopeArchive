package androidx.work.impl.model;

import androidx.lifecycle.LiveData;

public abstract interface PreferenceDao
{
  public abstract Long getLongValue(String paramString);
  
  public abstract LiveData<Long> getObservableLongValue(String paramString);
  
  public abstract void insertPreference(Preference paramPreference);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\PreferenceDao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */