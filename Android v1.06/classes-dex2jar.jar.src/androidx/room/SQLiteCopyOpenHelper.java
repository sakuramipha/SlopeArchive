package androidx.room;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

class SQLiteCopyOpenHelper
  implements SupportSQLiteOpenHelper
{
  private final Context mContext;
  private final String mCopyFromAssetPath;
  private final File mCopyFromFile;
  private DatabaseConfiguration mDatabaseConfiguration;
  private final int mDatabaseVersion;
  private final SupportSQLiteOpenHelper mDelegate;
  private boolean mVerified;
  
  SQLiteCopyOpenHelper(Context paramContext, String paramString, File paramFile, int paramInt, SupportSQLiteOpenHelper paramSupportSQLiteOpenHelper)
  {
    this.mContext = paramContext;
    this.mCopyFromAssetPath = paramString;
    this.mCopyFromFile = paramFile;
    this.mDatabaseVersion = paramInt;
    this.mDelegate = paramSupportSQLiteOpenHelper;
  }
  
  private void copyDatabaseFile(File paramFile)
    throws IOException
  {
    if (this.mCopyFromAssetPath != null)
    {
      localObject = Channels.newChannel(this.mContext.getAssets().open(this.mCopyFromAssetPath));
    }
    else
    {
      if (this.mCopyFromFile == null) {
        break label214;
      }
      localObject = new FileInputStream(this.mCopyFromFile).getChannel();
    }
    File localFile = File.createTempFile("room-copy-helper", ".tmp", this.mContext.getCacheDir());
    localFile.deleteOnExit();
    FileUtil.copy((ReadableByteChannel)localObject, new FileOutputStream(localFile).getChannel());
    Object localObject = paramFile.getParentFile();
    if ((localObject != null) && (!((File)localObject).exists()) && (!((File)localObject).mkdirs()))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to create directories for ");
      ((StringBuilder)localObject).append(paramFile.getAbsolutePath());
      throw new IOException(((StringBuilder)localObject).toString());
    }
    if (localFile.renameTo(paramFile)) {
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Failed to move intermediate file (");
    ((StringBuilder)localObject).append(localFile.getAbsolutePath());
    ((StringBuilder)localObject).append(") to destination (");
    ((StringBuilder)localObject).append(paramFile.getAbsolutePath());
    ((StringBuilder)localObject).append(").");
    throw new IOException(((StringBuilder)localObject).toString());
    label214:
    throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
  }
  
  /* Error */
  private void verifyDatabaseFile()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 142	androidx/room/SQLiteCopyOpenHelper:getDatabaseName	()Ljava/lang/String;
    //   4: astore 5
    //   6: aload_0
    //   7: getfield 27	androidx/room/SQLiteCopyOpenHelper:mContext	Landroid/content/Context;
    //   10: aload 5
    //   12: invokevirtual 146	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   15: astore 6
    //   17: aload_0
    //   18: getfield 148	androidx/room/SQLiteCopyOpenHelper:mDatabaseConfiguration	Landroidx/room/DatabaseConfiguration;
    //   21: astore 4
    //   23: aload 4
    //   25: ifnull +19 -> 44
    //   28: aload 4
    //   30: getfield 153	androidx/room/DatabaseConfiguration:multiInstanceInvalidation	Z
    //   33: ifeq +6 -> 39
    //   36: goto +8 -> 44
    //   39: iconst_0
    //   40: istore_3
    //   41: goto +5 -> 46
    //   44: iconst_1
    //   45: istore_3
    //   46: new 155	androidx/room/util/CopyLock
    //   49: dup
    //   50: aload 5
    //   52: aload_0
    //   53: getfield 27	androidx/room/SQLiteCopyOpenHelper:mContext	Landroid/content/Context;
    //   56: invokevirtual 158	android/content/Context:getFilesDir	()Ljava/io/File;
    //   59: iload_3
    //   60: invokespecial 161	androidx/room/util/CopyLock:<init>	(Ljava/lang/String;Ljava/io/File;Z)V
    //   63: astore 4
    //   65: aload 4
    //   67: invokevirtual 164	androidx/room/util/CopyLock:lock	()V
    //   70: aload 6
    //   72: invokevirtual 100	java/io/File:exists	()Z
    //   75: istore_3
    //   76: iload_3
    //   77: ifne +34 -> 111
    //   80: aload_0
    //   81: aload 6
    //   83: invokespecial 166	androidx/room/SQLiteCopyOpenHelper:copyDatabaseFile	(Ljava/io/File;)V
    //   86: aload 4
    //   88: invokevirtual 169	androidx/room/util/CopyLock:unlock	()V
    //   91: return
    //   92: astore 5
    //   94: new 171	java/lang/RuntimeException
    //   97: astore 6
    //   99: aload 6
    //   101: ldc -83
    //   103: aload 5
    //   105: invokespecial 176	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   108: aload 6
    //   110: athrow
    //   111: aload_0
    //   112: getfield 148	androidx/room/SQLiteCopyOpenHelper:mDatabaseConfiguration	Landroidx/room/DatabaseConfiguration;
    //   115: astore 7
    //   117: aload 7
    //   119: ifnonnull +9 -> 128
    //   122: aload 4
    //   124: invokevirtual 169	androidx/room/util/CopyLock:unlock	()V
    //   127: return
    //   128: aload 6
    //   130: invokestatic 182	androidx/room/util/DBUtil:readVersion	(Ljava/io/File;)I
    //   133: istore_1
    //   134: aload_0
    //   135: getfield 33	androidx/room/SQLiteCopyOpenHelper:mDatabaseVersion	I
    //   138: istore_2
    //   139: iload_1
    //   140: iload_2
    //   141: if_icmpne +9 -> 150
    //   144: aload 4
    //   146: invokevirtual 169	androidx/room/util/CopyLock:unlock	()V
    //   149: return
    //   150: aload_0
    //   151: getfield 148	androidx/room/SQLiteCopyOpenHelper:mDatabaseConfiguration	Landroidx/room/DatabaseConfiguration;
    //   154: iload_1
    //   155: iload_2
    //   156: invokevirtual 186	androidx/room/DatabaseConfiguration:isMigrationRequired	(II)Z
    //   159: istore_3
    //   160: iload_3
    //   161: ifeq +9 -> 170
    //   164: aload 4
    //   166: invokevirtual 169	androidx/room/util/CopyLock:unlock	()V
    //   169: return
    //   170: aload_0
    //   171: getfield 27	androidx/room/SQLiteCopyOpenHelper:mContext	Landroid/content/Context;
    //   174: aload 5
    //   176: invokevirtual 190	android/content/Context:deleteDatabase	(Ljava/lang/String;)Z
    //   179: istore_3
    //   180: iload_3
    //   181: ifeq +27 -> 208
    //   184: aload_0
    //   185: aload 6
    //   187: invokespecial 166	androidx/room/SQLiteCopyOpenHelper:copyDatabaseFile	(Ljava/io/File;)V
    //   190: goto +63 -> 253
    //   193: astore 5
    //   195: ldc -64
    //   197: ldc -83
    //   199: aload 5
    //   201: invokestatic 198	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   204: pop
    //   205: goto +48 -> 253
    //   208: new 105	java/lang/StringBuilder
    //   211: astore 6
    //   213: aload 6
    //   215: invokespecial 106	java/lang/StringBuilder:<init>	()V
    //   218: aload 6
    //   220: ldc -56
    //   222: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload 6
    //   228: aload 5
    //   230: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: aload 6
    //   236: ldc -54
    //   238: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: pop
    //   242: ldc -64
    //   244: aload 6
    //   246: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: invokestatic 205	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   252: pop
    //   253: aload 4
    //   255: invokevirtual 169	androidx/room/util/CopyLock:unlock	()V
    //   258: return
    //   259: astore 5
    //   261: ldc -64
    //   263: ldc -49
    //   265: aload 5
    //   267: invokestatic 198	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   270: pop
    //   271: aload 4
    //   273: invokevirtual 169	androidx/room/util/CopyLock:unlock	()V
    //   276: return
    //   277: astore 5
    //   279: aload 4
    //   281: invokevirtual 169	androidx/room/util/CopyLock:unlock	()V
    //   284: aload 5
    //   286: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	287	0	this	SQLiteCopyOpenHelper
    //   133	22	1	i	int
    //   138	18	2	j	int
    //   40	141	3	bool	boolean
    //   21	259	4	localObject1	Object
    //   4	47	5	str	String
    //   92	83	5	localIOException1	IOException
    //   193	36	5	localIOException2	IOException
    //   259	7	5	localIOException3	IOException
    //   277	8	5	localObject2	Object
    //   15	230	6	localObject3	Object
    //   115	3	7	localDatabaseConfiguration	DatabaseConfiguration
    // Exception table:
    //   from	to	target	type
    //   80	86	92	java/io/IOException
    //   184	190	193	java/io/IOException
    //   128	134	259	java/io/IOException
    //   65	76	277	finally
    //   80	86	277	finally
    //   94	111	277	finally
    //   111	117	277	finally
    //   128	134	277	finally
    //   134	139	277	finally
    //   150	160	277	finally
    //   170	180	277	finally
    //   184	190	277	finally
    //   195	205	277	finally
    //   208	253	277	finally
    //   261	271	277	finally
  }
  
  public void close()
  {
    try
    {
      this.mDelegate.close();
      this.mVerified = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String getDatabaseName()
  {
    return this.mDelegate.getDatabaseName();
  }
  
  public SupportSQLiteDatabase getReadableDatabase()
  {
    try
    {
      if (!this.mVerified)
      {
        verifyDatabaseFile();
        this.mVerified = true;
      }
      SupportSQLiteDatabase localSupportSQLiteDatabase = this.mDelegate.getReadableDatabase();
      return localSupportSQLiteDatabase;
    }
    finally {}
  }
  
  public SupportSQLiteDatabase getWritableDatabase()
  {
    try
    {
      if (!this.mVerified)
      {
        verifyDatabaseFile();
        this.mVerified = true;
      }
      SupportSQLiteDatabase localSupportSQLiteDatabase = this.mDelegate.getWritableDatabase();
      return localSupportSQLiteDatabase;
    }
    finally {}
  }
  
  void setDatabaseConfiguration(DatabaseConfiguration paramDatabaseConfiguration)
  {
    this.mDatabaseConfiguration = paramDatabaseConfiguration;
  }
  
  public void setWriteAheadLoggingEnabled(boolean paramBoolean)
  {
    this.mDelegate.setWriteAheadLoggingEnabled(paramBoolean);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\SQLiteCopyOpenHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */