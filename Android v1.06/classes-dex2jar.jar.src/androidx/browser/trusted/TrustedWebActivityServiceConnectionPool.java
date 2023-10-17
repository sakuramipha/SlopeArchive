package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class TrustedWebActivityServiceConnectionPool
{
  private static final String TAG = "TWAConnectionPool";
  private final Map<Uri, ConnectionHolder> mConnections = new HashMap();
  private final Context mContext;
  
  private TrustedWebActivityServiceConnectionPool(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
  }
  
  public static TrustedWebActivityServiceConnectionPool create(Context paramContext)
  {
    return new TrustedWebActivityServiceConnectionPool(paramContext);
  }
  
  private Intent createServiceIntent(Context paramContext, Uri paramUri, Set<Token> paramSet, boolean paramBoolean)
  {
    if ((paramSet != null) && (paramSet.size() != 0))
    {
      Object localObject = new Intent();
      ((Intent)localObject).setData(paramUri);
      ((Intent)localObject).setAction("android.intent.action.VIEW");
      Iterator localIterator1 = paramContext.getPackageManager().queryIntentActivities((Intent)localObject, 65536).iterator();
      localObject = null;
      for (;;)
      {
        if (!localIterator1.hasNext()) {
          break label136;
        }
        String str = ((ResolveInfo)localIterator1.next()).activityInfo.packageName;
        Iterator localIterator2 = paramSet.iterator();
        if (localIterator2.hasNext())
        {
          if (!((Token)localIterator2.next()).matches(str, paramContext.getPackageManager())) {
            break;
          }
          localObject = str;
        }
      }
      label136:
      if (localObject == null)
      {
        if (paramBoolean)
        {
          paramContext = new StringBuilder();
          paramContext.append("No TWA candidates for ");
          paramContext.append(paramUri);
          paramContext.append(" have been registered.");
          Log.w("TWAConnectionPool", paramContext.toString());
        }
        return null;
      }
      paramSet = new Intent();
      paramSet.setPackage((String)localObject);
      paramSet.setAction("android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE");
      paramContext = paramContext.getPackageManager().resolveService(paramSet, 131072);
      if (paramContext == null)
      {
        if (paramBoolean)
        {
          paramContext = new StringBuilder();
          paramContext.append("Could not find TWAService for ");
          paramContext.append((String)localObject);
          Log.w("TWAConnectionPool", paramContext.toString());
        }
        return null;
      }
      if (paramBoolean)
      {
        paramSet = new StringBuilder();
        paramSet.append("Found ");
        paramSet.append(paramContext.serviceInfo.name);
        paramSet.append(" to handle request for ");
        paramSet.append(paramUri);
        Log.i("TWAConnectionPool", paramSet.toString());
      }
      paramUri = new Intent();
      paramUri.setComponent(new ComponentName((String)localObject, paramContext.serviceInfo.name));
      return paramUri;
    }
    return null;
  }
  
  public ListenableFuture<TrustedWebActivityServiceConnection> connect(Uri paramUri, Set<Token> paramSet, Executor paramExecutor)
  {
    ConnectionHolder localConnectionHolder = (ConnectionHolder)this.mConnections.get(paramUri);
    if (localConnectionHolder != null) {
      return localConnectionHolder.getServiceWrapper();
    }
    paramSet = createServiceIntent(this.mContext, paramUri, paramSet, true);
    if (paramSet == null) {
      return FutureUtils.immediateFailedFuture(new IllegalArgumentException("No service exists for scope"));
    }
    localConnectionHolder = new ConnectionHolder(new TrustedWebActivityServiceConnectionPool..ExternalSyntheticLambda0(this, paramUri));
    this.mConnections.put(paramUri, localConnectionHolder);
    new BindToServiceAsyncTask(this.mContext, paramSet, localConnectionHolder).executeOnExecutor(paramExecutor, new Void[0]);
    return localConnectionHolder.getServiceWrapper();
  }
  
  public boolean serviceExistsForScope(Uri paramUri, Set<Token> paramSet)
  {
    Object localObject = this.mConnections.get(paramUri);
    boolean bool = true;
    if (localObject != null) {
      return true;
    }
    if (createServiceIntent(this.mContext, paramUri, paramSet, false) == null) {
      bool = false;
    }
    return bool;
  }
  
  void unbindAllConnections()
  {
    Iterator localIterator = this.mConnections.values().iterator();
    while (localIterator.hasNext())
    {
      ConnectionHolder localConnectionHolder = (ConnectionHolder)localIterator.next();
      this.mContext.unbindService(localConnectionHolder);
    }
    this.mConnections.clear();
  }
  
  static class BindToServiceAsyncTask
    extends AsyncTask<Void, Void, Exception>
  {
    private final Context mAppContext;
    private final ConnectionHolder mConnection;
    private final Intent mIntent;
    
    BindToServiceAsyncTask(Context paramContext, Intent paramIntent, ConnectionHolder paramConnectionHolder)
    {
      this.mAppContext = paramContext.getApplicationContext();
      this.mIntent = paramIntent;
      this.mConnection = paramConnectionHolder;
    }
    
    protected Exception doInBackground(Void... paramVarArgs)
    {
      try
      {
        if (this.mAppContext.bindService(this.mIntent, this.mConnection, 4097)) {
          return null;
        }
        this.mAppContext.unbindService(this.mConnection);
        paramVarArgs = new IllegalStateException("Could not bind to the service");
        return paramVarArgs;
      }
      catch (SecurityException paramVarArgs)
      {
        Log.w("TWAConnectionPool", "SecurityException while binding.", paramVarArgs);
      }
      return paramVarArgs;
    }
    
    protected void onPostExecute(Exception paramException)
    {
      if (paramException != null) {
        this.mConnection.cancel(paramException);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\TrustedWebActivityServiceConnectionPool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */