package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.content.FileProvider;
import androidx.core.util.AtomicFile;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@Deprecated
public final class BrowserServiceFileProvider
  extends FileProvider
{
  private static final String AUTHORITY_SUFFIX = ".image_provider";
  private static final String CLIP_DATA_LABEL = "image_provider_uris";
  private static final String CONTENT_SCHEME = "content";
  private static final String FILE_EXTENSION = ".png";
  private static final String FILE_SUB_DIR = "image_provider";
  private static final String FILE_SUB_DIR_NAME = "image_provider_images/";
  private static final String LAST_CLEANUP_TIME_KEY = "last_cleanup_time";
  private static final String TAG = "BrowserServiceFP";
  static Object sFileCleanupLock = new Object();
  
  private static Uri generateUri(Context paramContext, String paramString)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("image_provider_images/");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(".png");
    String str = ((StringBuilder)localObject).toString();
    localObject = new Uri.Builder().scheme("content");
    paramString = new StringBuilder();
    paramString.append(paramContext.getPackageName());
    paramString.append(".image_provider");
    return ((Uri.Builder)localObject).authority(paramString.toString()).path(str).build();
  }
  
  public static void grantReadPermission(Intent paramIntent, List<Uri> paramList, Context paramContext)
  {
    if ((paramList != null) && (paramList.size() != 0))
    {
      paramContext = paramContext.getContentResolver();
      int i = 1;
      paramIntent.addFlags(1);
      paramContext = ClipData.newUri(paramContext, "image_provider_uris", (Uri)paramList.get(0));
      while (i < paramList.size())
      {
        paramContext.addItem(new ClipData.Item((Uri)paramList.get(i)));
        i++;
      }
      paramIntent.setClipData(paramContext);
    }
  }
  
  public static ListenableFuture<Bitmap> loadBitmap(ContentResolver paramContentResolver, final Uri paramUri)
  {
    final ResolvableFuture localResolvableFuture = ResolvableFuture.create();
    AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable()
    {
      public void run()
      {
        try
        {
          Object localObject2 = BrowserServiceFileProvider.this.openFileDescriptor(paramUri, "r");
          if (localObject2 == null)
          {
            localObject1 = localResolvableFuture;
            localObject2 = new java/io/FileNotFoundException;
            ((FileNotFoundException)localObject2).<init>();
            ((ResolvableFuture)localObject1).setException((Throwable)localObject2);
            return;
          }
          Object localObject1 = BitmapFactory.decodeFileDescriptor(((ParcelFileDescriptor)localObject2).getFileDescriptor());
          ((ParcelFileDescriptor)localObject2).close();
          if (localObject1 == null)
          {
            localObject2 = localResolvableFuture;
            localObject1 = new java/io/IOException;
            ((IOException)localObject1).<init>("File could not be decoded.");
            ((ResolvableFuture)localObject2).setException((Throwable)localObject1);
            return;
          }
          localResolvableFuture.set(localObject1);
        }
        catch (IOException localIOException)
        {
          localResolvableFuture.setException(localIOException);
        }
      }
    });
    return localResolvableFuture;
  }
  
  public static ResolvableFuture<Uri> saveBitmap(Context paramContext, Bitmap paramBitmap, String paramString, int paramInt)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("_");
    ((StringBuilder)localObject).append(Integer.toString(paramInt));
    String str = ((StringBuilder)localObject).toString();
    localObject = generateUri(paramContext, str);
    paramString = ResolvableFuture.create();
    new FileSaveTask(paramContext, str, paramBitmap, (Uri)localObject, paramString).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    return paramString;
  }
  
  private static class FileCleanupTask
    extends AsyncTask<Void, Void, Void>
  {
    private static final long CLEANUP_REQUIRED_TIME_SPAN = TimeUnit.DAYS.toMillis(7L);
    private static final long DELETION_FAILED_REATTEMPT_DURATION = TimeUnit.DAYS.toMillis(1L);
    private static final long IMAGE_RETENTION_DURATION = TimeUnit.DAYS.toMillis(7L);
    private final Context mAppContext;
    
    FileCleanupTask(Context paramContext)
    {
      this.mAppContext = paramContext.getApplicationContext();
    }
    
    private static boolean isImageFile(File paramFile)
    {
      return paramFile.getName().endsWith("..png");
    }
    
    private static boolean shouldCleanUp(SharedPreferences paramSharedPreferences)
    {
      long l = paramSharedPreferences.getLong("last_cleanup_time", System.currentTimeMillis());
      boolean bool;
      if (System.currentTimeMillis() > l + CLEANUP_REQUIRED_TIME_SPAN) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    protected Void doInBackground(Void... arg1)
    {
      Object localObject1 = this.mAppContext;
      ??? = new StringBuilder();
      ???.append(this.mAppContext.getPackageName());
      ???.append(".image_provider");
      localObject1 = ((Context)localObject1).getSharedPreferences(???.toString(), 0);
      if (!shouldCleanUp((SharedPreferences)localObject1)) {
        return null;
      }
      synchronized (BrowserServiceFileProvider.sFileCleanupLock)
      {
        Object localObject3 = new java/io/File;
        ((File)localObject3).<init>(this.mAppContext.getFilesDir(), "image_provider");
        if (!((File)localObject3).exists()) {
          return null;
        }
        File[] arrayOfFile = ((File)localObject3).listFiles();
        long l1 = System.currentTimeMillis();
        long l2 = IMAGE_RETENTION_DURATION;
        int m = arrayOfFile.length;
        int k = 1;
        int i = 0;
        while (i < m)
        {
          File localFile = arrayOfFile[i];
          int j;
          if (!isImageFile(localFile))
          {
            j = k;
          }
          else
          {
            j = k;
            if (localFile.lastModified() < l1 - l2)
            {
              j = k;
              if (!localFile.delete())
              {
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                ((StringBuilder)localObject3).append("Fail to delete image: ");
                ((StringBuilder)localObject3).append(localFile.getAbsoluteFile());
                Log.e("BrowserServiceFP", ((StringBuilder)localObject3).toString());
                j = 0;
              }
            }
          }
          i++;
          k = j;
        }
        if (k != 0) {
          l1 = System.currentTimeMillis();
        } else {
          l1 = System.currentTimeMillis() - CLEANUP_REQUIRED_TIME_SPAN + DELETION_FAILED_REATTEMPT_DURATION;
        }
        localObject1 = ((SharedPreferences)localObject1).edit();
        ((SharedPreferences.Editor)localObject1).putLong("last_cleanup_time", l1);
        ((SharedPreferences.Editor)localObject1).apply();
        return null;
      }
    }
  }
  
  private static class FileSaveTask
    extends AsyncTask<String, Void, Void>
  {
    private final Context mAppContext;
    private final Bitmap mBitmap;
    private final Uri mFileUri;
    private final String mFilename;
    private final ResolvableFuture<Uri> mResultFuture;
    
    FileSaveTask(Context paramContext, String paramString, Bitmap paramBitmap, Uri paramUri, ResolvableFuture<Uri> paramResolvableFuture)
    {
      this.mAppContext = paramContext.getApplicationContext();
      this.mFilename = paramString;
      this.mBitmap = paramBitmap;
      this.mFileUri = paramUri;
      this.mResultFuture = paramResolvableFuture;
    }
    
    private void saveFileBlocking(File paramFile)
    {
      FileOutputStream localFileOutputStream;
      if (Build.VERSION.SDK_INT >= 22)
      {
        AtomicFile localAtomicFile = new AtomicFile(paramFile);
        try
        {
          localFileOutputStream = localAtomicFile.startWrite();
          try
          {
            this.mBitmap.compress(Bitmap.CompressFormat.PNG, 100, localFileOutputStream);
            localFileOutputStream.close();
            localAtomicFile.finishWrite(localFileOutputStream);
            this.mResultFuture.set(this.mFileUri);
          }
          catch (IOException paramFile) {}
          localAtomicFile.failWrite(localFileOutputStream);
        }
        catch (IOException paramFile)
        {
          localFileOutputStream = null;
        }
        this.mResultFuture.setException(paramFile);
      }
      else
      {
        try
        {
          localFileOutputStream = new java/io/FileOutputStream;
          localFileOutputStream.<init>(paramFile);
          this.mBitmap.compress(Bitmap.CompressFormat.PNG, 100, localFileOutputStream);
          localFileOutputStream.close();
          this.mResultFuture.set(this.mFileUri);
        }
        catch (IOException paramFile)
        {
          this.mResultFuture.setException(paramFile);
        }
      }
    }
    
    private void saveFileIfNeededBlocking()
    {
      Object localObject4 = new File(this.mAppContext.getFilesDir(), "image_provider");
      synchronized (BrowserServiceFileProvider.sFileCleanupLock)
      {
        if ((!((File)localObject4).exists()) && (!((File)localObject4).mkdir()))
        {
          localObject4 = this.mResultFuture;
          localObject2 = new java/io/IOException;
          ((IOException)localObject2).<init>("Could not create file directory.");
          ((ResolvableFuture)localObject4).setException((Throwable)localObject2);
          return;
        }
        File localFile = new java/io/File;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append(this.mFilename);
        ((StringBuilder)localObject2).append(".png");
        localFile.<init>((File)localObject4, ((StringBuilder)localObject2).toString());
        if (localFile.exists()) {
          this.mResultFuture.set(this.mFileUri);
        } else {
          saveFileBlocking(localFile);
        }
        localFile.setLastModified(System.currentTimeMillis());
        return;
      }
    }
    
    protected Void doInBackground(String... paramVarArgs)
    {
      saveFileIfNeededBlocking();
      return null;
    }
    
    protected void onPostExecute(Void paramVoid)
    {
      new BrowserServiceFileProvider.FileCleanupTask(this.mAppContext).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\browseractions\BrowserServiceFileProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */