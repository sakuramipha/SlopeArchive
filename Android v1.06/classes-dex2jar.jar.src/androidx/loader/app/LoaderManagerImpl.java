package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.content.Loader;
import androidx.loader.content.Loader.OnLoadCompleteListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl
  extends LoaderManager
{
  static boolean DEBUG = false;
  static final String TAG = "LoaderManager";
  private final LifecycleOwner mLifecycleOwner;
  private final LoaderViewModel mLoaderViewModel;
  
  LoaderManagerImpl(LifecycleOwner paramLifecycleOwner, ViewModelStore paramViewModelStore)
  {
    this.mLifecycleOwner = paramLifecycleOwner;
    this.mLoaderViewModel = LoaderViewModel.getInstance(paramViewModelStore);
  }
  
  private <D> Loader<D> createAndInstallLoader(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks, Loader<D> paramLoader)
  {
    try
    {
      this.mLoaderViewModel.startCreatingLoader();
      Loader localLoader = paramLoaderCallbacks.onCreateLoader(paramInt, paramBundle);
      if (localLoader != null)
      {
        if ((localLoader.getClass().isMemberClass()) && (!Modifier.isStatic(localLoader.getClass().getModifiers())))
        {
          paramBundle = new java/lang/IllegalArgumentException;
          paramLoaderCallbacks = new java/lang/StringBuilder;
          paramLoaderCallbacks.<init>();
          paramLoaderCallbacks.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
          paramLoaderCallbacks.append(localLoader);
          paramBundle.<init>(paramLoaderCallbacks.toString());
          throw paramBundle;
        }
        LoaderInfo localLoaderInfo = new androidx/loader/app/LoaderManagerImpl$LoaderInfo;
        localLoaderInfo.<init>(paramInt, paramBundle, localLoader, paramLoader);
        if (DEBUG)
        {
          paramBundle = new java/lang/StringBuilder;
          paramBundle.<init>();
          paramBundle.append("  Created new loader ");
          paramBundle.append(localLoaderInfo);
          Log.v("LoaderManager", paramBundle.toString());
        }
        this.mLoaderViewModel.putLoader(paramInt, localLoaderInfo);
        return localLoaderInfo.setCallback(this.mLifecycleOwner, paramLoaderCallbacks);
      }
      paramBundle = new java/lang/IllegalArgumentException;
      paramBundle.<init>("Object returned from onCreateLoader must not be null");
      throw paramBundle;
    }
    finally
    {
      this.mLoaderViewModel.finishCreatingLoader();
    }
  }
  
  public void destroyLoader(int paramInt)
  {
    if (!this.mLoaderViewModel.isCreatingLoader())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        if (DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("destroyLoader in ");
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(" of ");
          ((StringBuilder)localObject).append(paramInt);
          Log.v("LoaderManager", ((StringBuilder)localObject).toString());
        }
        Object localObject = this.mLoaderViewModel.getLoader(paramInt);
        if (localObject != null)
        {
          ((LoaderInfo)localObject).destroy(true);
          this.mLoaderViewModel.removeLoader(paramInt);
        }
        return;
      }
      throw new IllegalStateException("destroyLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  @Deprecated
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.mLoaderViewModel.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public <D> Loader<D> getLoader(int paramInt)
  {
    if (!this.mLoaderViewModel.isCreatingLoader())
    {
      Object localObject = this.mLoaderViewModel.getLoader(paramInt);
      if (localObject != null) {
        localObject = ((LoaderInfo)localObject).getLoader();
      } else {
        localObject = null;
      }
      return (Loader<D>)localObject;
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public boolean hasRunningLoaders()
  {
    return this.mLoaderViewModel.hasRunningLoaders();
  }
  
  public <D> Loader<D> initLoader(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
  {
    if (!this.mLoaderViewModel.isCreatingLoader())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        LoaderInfo localLoaderInfo = this.mLoaderViewModel.getLoader(paramInt);
        if (DEBUG)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("initLoader in ");
          localStringBuilder.append(this);
          localStringBuilder.append(": args=");
          localStringBuilder.append(paramBundle);
          Log.v("LoaderManager", localStringBuilder.toString());
        }
        if (localLoaderInfo == null) {
          return createAndInstallLoader(paramInt, paramBundle, paramLoaderCallbacks, null);
        }
        if (DEBUG)
        {
          paramBundle = new StringBuilder();
          paramBundle.append("  Re-using existing loader ");
          paramBundle.append(localLoaderInfo);
          Log.v("LoaderManager", paramBundle.toString());
        }
        return localLoaderInfo.setCallback(this.mLifecycleOwner, paramLoaderCallbacks);
      }
      throw new IllegalStateException("initLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public void markForRedelivery()
  {
    this.mLoaderViewModel.markForRedelivery();
  }
  
  public <D> Loader<D> restartLoader(int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
  {
    if (!this.mLoaderViewModel.isCreatingLoader())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        if (DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("restartLoader in ");
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(": args=");
          ((StringBuilder)localObject).append(paramBundle);
          Log.v("LoaderManager", ((StringBuilder)localObject).toString());
        }
        LoaderInfo localLoaderInfo = this.mLoaderViewModel.getLoader(paramInt);
        Object localObject = null;
        if (localLoaderInfo != null) {
          localObject = localLoaderInfo.destroy(false);
        }
        return createAndInstallLoader(paramInt, paramBundle, paramLoaderCallbacks, (Loader)localObject);
      }
      throw new IllegalStateException("restartLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    DebugUtils.buildShortClassTag(this.mLifecycleOwner, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  public static class LoaderInfo<D>
    extends MutableLiveData<D>
    implements Loader.OnLoadCompleteListener<D>
  {
    private final Bundle mArgs;
    private final int mId;
    private LifecycleOwner mLifecycleOwner;
    private final Loader<D> mLoader;
    private LoaderManagerImpl.LoaderObserver<D> mObserver;
    private Loader<D> mPriorLoader;
    
    LoaderInfo(int paramInt, Bundle paramBundle, Loader<D> paramLoader1, Loader<D> paramLoader2)
    {
      this.mId = paramInt;
      this.mArgs = paramBundle;
      this.mLoader = paramLoader1;
      this.mPriorLoader = paramLoader2;
      paramLoader1.registerListener(paramInt, this);
    }
    
    Loader<D> destroy(boolean paramBoolean)
    {
      if (LoaderManagerImpl.DEBUG)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("  Destroying: ");
        ((StringBuilder)localObject).append(this);
        Log.v("LoaderManager", ((StringBuilder)localObject).toString());
      }
      this.mLoader.cancelLoad();
      this.mLoader.abandon();
      Object localObject = this.mObserver;
      if (localObject != null)
      {
        removeObserver((Observer)localObject);
        if (paramBoolean) {
          ((LoaderManagerImpl.LoaderObserver)localObject).reset();
        }
      }
      this.mLoader.unregisterListener(this);
      if (((localObject != null) && (!((LoaderManagerImpl.LoaderObserver)localObject).hasDeliveredData())) || (paramBoolean))
      {
        this.mLoader.reset();
        return this.mPriorLoader;
      }
      return this.mLoader;
    }
    
    public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.mId);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.mArgs);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.mLoader);
      Loader localLoader = this.mLoader;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("  ");
      localLoader.dump(localStringBuilder.toString(), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      if (this.mObserver != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mCallbacks=");
        paramPrintWriter.println(this.mObserver);
        paramFileDescriptor = this.mObserver;
        paramArrayOfString = new StringBuilder();
        paramArrayOfString.append(paramString);
        paramArrayOfString.append("  ");
        paramFileDescriptor.dump(paramArrayOfString.toString(), paramPrintWriter);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mData=");
      paramPrintWriter.println(getLoader().dataToString(getValue()));
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.println(hasActiveObservers());
    }
    
    Loader<D> getLoader()
    {
      return this.mLoader;
    }
    
    boolean isCallbackWaitingForData()
    {
      boolean bool1 = hasActiveObservers();
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      LoaderManagerImpl.LoaderObserver localLoaderObserver = this.mObserver;
      bool1 = bool2;
      if (localLoaderObserver != null)
      {
        bool1 = bool2;
        if (!localLoaderObserver.hasDeliveredData()) {
          bool1 = true;
        }
      }
      return bool1;
    }
    
    void markForRedelivery()
    {
      LifecycleOwner localLifecycleOwner = this.mLifecycleOwner;
      LoaderManagerImpl.LoaderObserver localLoaderObserver = this.mObserver;
      if ((localLifecycleOwner != null) && (localLoaderObserver != null))
      {
        super.removeObserver(localLoaderObserver);
        observe(localLifecycleOwner, localLoaderObserver);
      }
    }
    
    protected void onActive()
    {
      if (LoaderManagerImpl.DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("  Starting: ");
        localStringBuilder.append(this);
        Log.v("LoaderManager", localStringBuilder.toString());
      }
      this.mLoader.startLoading();
    }
    
    protected void onInactive()
    {
      if (LoaderManagerImpl.DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("  Stopping: ");
        localStringBuilder.append(this);
        Log.v("LoaderManager", localStringBuilder.toString());
      }
      this.mLoader.stopLoading();
    }
    
    public void onLoadComplete(Loader<D> paramLoader, D paramD)
    {
      if (LoaderManagerImpl.DEBUG)
      {
        paramLoader = new StringBuilder();
        paramLoader.append("onLoadComplete: ");
        paramLoader.append(this);
        Log.v("LoaderManager", paramLoader.toString());
      }
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        setValue(paramD);
      }
      else
      {
        if (LoaderManagerImpl.DEBUG) {
          Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
        }
        postValue(paramD);
      }
    }
    
    public void removeObserver(Observer<? super D> paramObserver)
    {
      super.removeObserver(paramObserver);
      this.mLifecycleOwner = null;
      this.mObserver = null;
    }
    
    Loader<D> setCallback(LifecycleOwner paramLifecycleOwner, LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
    {
      paramLoaderCallbacks = new LoaderManagerImpl.LoaderObserver(this.mLoader, paramLoaderCallbacks);
      observe(paramLifecycleOwner, paramLoaderCallbacks);
      LoaderManagerImpl.LoaderObserver localLoaderObserver = this.mObserver;
      if (localLoaderObserver != null) {
        removeObserver(localLoaderObserver);
      }
      this.mLifecycleOwner = paramLifecycleOwner;
      this.mObserver = paramLoaderCallbacks;
      return this.mLoader;
    }
    
    public void setValue(D paramD)
    {
      super.setValue(paramD);
      paramD = this.mPriorLoader;
      if (paramD != null)
      {
        paramD.reset();
        this.mPriorLoader = null;
      }
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(64);
      localStringBuilder.append("LoaderInfo{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mId);
      localStringBuilder.append(" : ");
      DebugUtils.buildShortClassTag(this.mLoader, localStringBuilder);
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
    }
  }
  
  static class LoaderObserver<D>
    implements Observer<D>
  {
    private final LoaderManager.LoaderCallbacks<D> mCallback;
    private boolean mDeliveredData = false;
    private final Loader<D> mLoader;
    
    LoaderObserver(Loader<D> paramLoader, LoaderManager.LoaderCallbacks<D> paramLoaderCallbacks)
    {
      this.mLoader = paramLoader;
      this.mCallback = paramLoaderCallbacks;
    }
    
    public void dump(String paramString, PrintWriter paramPrintWriter)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mDeliveredData=");
      paramPrintWriter.println(this.mDeliveredData);
    }
    
    boolean hasDeliveredData()
    {
      return this.mDeliveredData;
    }
    
    public void onChanged(D paramD)
    {
      if (LoaderManagerImpl.DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("  onLoadFinished in ");
        localStringBuilder.append(this.mLoader);
        localStringBuilder.append(": ");
        localStringBuilder.append(this.mLoader.dataToString(paramD));
        Log.v("LoaderManager", localStringBuilder.toString());
      }
      this.mCallback.onLoadFinished(this.mLoader, paramD);
      this.mDeliveredData = true;
    }
    
    void reset()
    {
      if (this.mDeliveredData)
      {
        if (LoaderManagerImpl.DEBUG)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("  Resetting: ");
          localStringBuilder.append(this.mLoader);
          Log.v("LoaderManager", localStringBuilder.toString());
        }
        this.mCallback.onLoaderReset(this.mLoader);
      }
    }
    
    public String toString()
    {
      return this.mCallback.toString();
    }
  }
  
  static class LoaderViewModel
    extends ViewModel
  {
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory()
    {
      public <T extends ViewModel> T create(Class<T> paramAnonymousClass)
      {
        return new LoaderManagerImpl.LoaderViewModel();
      }
    };
    private boolean mCreatingLoader = false;
    private SparseArrayCompat<LoaderManagerImpl.LoaderInfo> mLoaders = new SparseArrayCompat();
    
    static LoaderViewModel getInstance(ViewModelStore paramViewModelStore)
    {
      return (LoaderViewModel)new ViewModelProvider(paramViewModelStore, FACTORY).get(LoaderViewModel.class);
    }
    
    public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      if (this.mLoaders.size() > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Loaders:");
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append("    ");
        String str = ((StringBuilder)localObject).toString();
        for (int i = 0; i < this.mLoaders.size(); i++)
        {
          localObject = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(this.mLoaders.keyAt(i));
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((LoaderManagerImpl.LoaderInfo)localObject).toString());
          ((LoaderManagerImpl.LoaderInfo)localObject).dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
    
    void finishCreatingLoader()
    {
      this.mCreatingLoader = false;
    }
    
    <D> LoaderManagerImpl.LoaderInfo<D> getLoader(int paramInt)
    {
      return (LoaderManagerImpl.LoaderInfo)this.mLoaders.get(paramInt);
    }
    
    boolean hasRunningLoaders()
    {
      int j = this.mLoaders.size();
      for (int i = 0; i < j; i++) {
        if (((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(i)).isCallbackWaitingForData()) {
          return true;
        }
      }
      return false;
    }
    
    boolean isCreatingLoader()
    {
      return this.mCreatingLoader;
    }
    
    void markForRedelivery()
    {
      int j = this.mLoaders.size();
      for (int i = 0; i < j; i++) {
        ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(i)).markForRedelivery();
      }
    }
    
    protected void onCleared()
    {
      super.onCleared();
      int j = this.mLoaders.size();
      for (int i = 0; i < j; i++) {
        ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(i)).destroy(true);
      }
      this.mLoaders.clear();
    }
    
    void putLoader(int paramInt, LoaderManagerImpl.LoaderInfo paramLoaderInfo)
    {
      this.mLoaders.put(paramInt, paramLoaderInfo);
    }
    
    void removeLoader(int paramInt)
    {
      this.mLoaders.remove(paramInt);
    }
    
    void startCreatingLoader()
    {
      this.mCreatingLoader = true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\loader\app\LoaderManagerImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */