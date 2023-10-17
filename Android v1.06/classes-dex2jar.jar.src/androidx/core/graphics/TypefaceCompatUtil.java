package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Process;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TypefaceCompatUtil
{
  private static final String CACHE_FILE_PREFIX = ".font";
  private static final String TAG = "TypefaceCompatUtil";
  
  public static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
  
  public static ByteBuffer copyToDirectBuffer(Context paramContext, Resources paramResources, int paramInt)
  {
    paramContext = getTempFile(paramContext);
    if (paramContext == null) {
      return null;
    }
    try
    {
      boolean bool = copyToFile(paramContext, paramResources, paramInt);
      if (!bool) {
        return null;
      }
      paramResources = mmap(paramContext);
      return paramResources;
    }
    finally
    {
      paramContext.delete();
    }
  }
  
  /* Error */
  public static boolean copyToFile(File paramFile, Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: invokevirtual 51	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   5: astore_1
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 54	androidx/core/graphics/TypefaceCompatUtil:copyToFile	(Ljava/io/File;Ljava/io/InputStream;)Z
    //   11: istore_3
    //   12: aload_1
    //   13: invokestatic 56	androidx/core/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   16: iload_3
    //   17: ireturn
    //   18: astore_0
    //   19: goto +6 -> 25
    //   22: astore_0
    //   23: aconst_null
    //   24: astore_1
    //   25: aload_1
    //   26: invokestatic 56	androidx/core/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   29: aload_0
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	paramFile	File
    //   0	31	1	paramResources	Resources
    //   0	31	2	paramInt	int
    //   11	6	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	12	18	finally
    //   0	6	22	finally
  }
  
  /* Error */
  public static boolean copyToFile(File paramFile, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: invokestatic 62	android/os/StrictMode:allowThreadDiskWrites	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore 7
    //   5: aconst_null
    //   6: astore 5
    //   8: aconst_null
    //   9: astore 6
    //   11: aload 6
    //   13: astore_3
    //   14: new 64	java/io/FileOutputStream
    //   17: astore 4
    //   19: aload 6
    //   21: astore_3
    //   22: aload 4
    //   24: aload_0
    //   25: iconst_0
    //   26: invokespecial 67	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   29: sipush 1024
    //   32: newarray <illegal type>
    //   34: astore_0
    //   35: aload_1
    //   36: aload_0
    //   37: invokevirtual 73	java/io/InputStream:read	([B)I
    //   40: istore_2
    //   41: iload_2
    //   42: iconst_m1
    //   43: if_icmpeq +14 -> 57
    //   46: aload 4
    //   48: aload_0
    //   49: iconst_0
    //   50: iload_2
    //   51: invokevirtual 77	java/io/FileOutputStream:write	([BII)V
    //   54: goto -19 -> 35
    //   57: aload 4
    //   59: invokestatic 56	androidx/core/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   62: aload 7
    //   64: invokestatic 81	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   67: iconst_1
    //   68: ireturn
    //   69: astore_0
    //   70: aload 4
    //   72: astore_3
    //   73: goto +78 -> 151
    //   76: astore_1
    //   77: aload 4
    //   79: astore_0
    //   80: goto +11 -> 91
    //   83: astore_0
    //   84: goto +67 -> 151
    //   87: astore_1
    //   88: aload 5
    //   90: astore_0
    //   91: aload_0
    //   92: astore_3
    //   93: new 83	java/lang/StringBuilder
    //   96: astore 4
    //   98: aload_0
    //   99: astore_3
    //   100: aload 4
    //   102: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   105: aload_0
    //   106: astore_3
    //   107: aload 4
    //   109: ldc 86
    //   111: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: aload_0
    //   116: astore_3
    //   117: aload 4
    //   119: aload_1
    //   120: invokevirtual 94	java/io/IOException:getMessage	()Ljava/lang/String;
    //   123: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload_0
    //   128: astore_3
    //   129: ldc 11
    //   131: aload 4
    //   133: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: invokestatic 103	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   139: pop
    //   140: aload_0
    //   141: invokestatic 56	androidx/core/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   144: aload 7
    //   146: invokestatic 81	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   149: iconst_0
    //   150: ireturn
    //   151: aload_3
    //   152: invokestatic 56	androidx/core/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   155: aload 7
    //   157: invokestatic 81	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   160: aload_0
    //   161: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	paramFile	File
    //   0	162	1	paramInputStream	java.io.InputStream
    //   40	11	2	i	int
    //   13	139	3	localObject1	Object
    //   17	115	4	localObject2	Object
    //   6	83	5	localObject3	Object
    //   9	11	6	localObject4	Object
    //   3	153	7	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    // Exception table:
    //   from	to	target	type
    //   29	35	69	finally
    //   35	41	69	finally
    //   46	54	69	finally
    //   29	35	76	java/io/IOException
    //   35	41	76	java/io/IOException
    //   46	54	76	java/io/IOException
    //   14	19	83	finally
    //   22	29	83	finally
    //   93	98	83	finally
    //   100	105	83	finally
    //   107	115	83	finally
    //   117	127	83	finally
    //   129	140	83	finally
    //   14	19	87	java/io/IOException
    //   22	29	87	java/io/IOException
  }
  
  public static File getTempFile(Context paramContext)
  {
    paramContext = paramContext.getCacheDir();
    if (paramContext == null) {
      return null;
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(".font");
    ((StringBuilder)localObject1).append(Process.myPid());
    ((StringBuilder)localObject1).append("-");
    ((StringBuilder)localObject1).append(Process.myTid());
    ((StringBuilder)localObject1).append("-");
    localObject1 = ((StringBuilder)localObject1).toString();
    for (int i = 0; i < 100; i++)
    {
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(i);
      localObject2 = new File(paramContext, ((StringBuilder)localObject2).toString());
      try
      {
        boolean bool = ((File)localObject2).createNewFile();
        if (bool) {
          return (File)localObject2;
        }
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
    return null;
  }
  
  /* Error */
  public static ByteBuffer mmap(Context paramContext, CancellationSignal paramCancellationSignal, Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 134	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_0
    //   5: aload_0
    //   6: aload_2
    //   7: ldc -120
    //   9: aload_1
    //   10: invokevirtual 142	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   13: astore_0
    //   14: aload_0
    //   15: ifnonnull +13 -> 28
    //   18: aload_0
    //   19: ifnull +7 -> 26
    //   22: aload_0
    //   23: invokevirtual 145	android/os/ParcelFileDescriptor:close	()V
    //   26: aconst_null
    //   27: areturn
    //   28: new 147	java/io/FileInputStream
    //   31: astore_1
    //   32: aload_1
    //   33: aload_0
    //   34: invokevirtual 151	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   37: invokespecial 154	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   40: aload_1
    //   41: invokevirtual 158	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   44: astore_2
    //   45: aload_2
    //   46: invokevirtual 164	java/nio/channels/FileChannel:size	()J
    //   49: lstore_3
    //   50: aload_2
    //   51: getstatic 170	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   54: lconst_0
    //   55: lload_3
    //   56: invokevirtual 174	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   59: astore_2
    //   60: aload_1
    //   61: invokevirtual 175	java/io/FileInputStream:close	()V
    //   64: aload_0
    //   65: ifnull +7 -> 72
    //   68: aload_0
    //   69: invokevirtual 145	android/os/ParcelFileDescriptor:close	()V
    //   72: aload_2
    //   73: areturn
    //   74: astore_2
    //   75: aload_1
    //   76: invokevirtual 175	java/io/FileInputStream:close	()V
    //   79: goto +9 -> 88
    //   82: astore_1
    //   83: aload_2
    //   84: aload_1
    //   85: invokevirtual 181	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   88: aload_2
    //   89: athrow
    //   90: astore_1
    //   91: aload_0
    //   92: ifnull +16 -> 108
    //   95: aload_0
    //   96: invokevirtual 145	android/os/ParcelFileDescriptor:close	()V
    //   99: goto +9 -> 108
    //   102: astore_0
    //   103: aload_1
    //   104: aload_0
    //   105: invokevirtual 181	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   108: aload_1
    //   109: athrow
    //   110: astore_0
    //   111: aconst_null
    //   112: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	paramContext	Context
    //   0	113	1	paramCancellationSignal	CancellationSignal
    //   0	113	2	paramUri	Uri
    //   49	7	3	l	long
    // Exception table:
    //   from	to	target	type
    //   40	60	74	finally
    //   75	79	82	finally
    //   28	40	90	finally
    //   60	64	90	finally
    //   83	88	90	finally
    //   88	90	90	finally
    //   95	99	102	finally
    //   5	14	110	java/io/IOException
    //   22	26	110	java/io/IOException
    //   68	72	110	java/io/IOException
    //   103	108	110	java/io/IOException
    //   108	110	110	java/io/IOException
  }
  
  /* Error */
  private static ByteBuffer mmap(File paramFile)
  {
    // Byte code:
    //   0: new 147	java/io/FileInputStream
    //   3: astore_3
    //   4: aload_3
    //   5: aload_0
    //   6: invokespecial 184	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   9: aload_3
    //   10: invokevirtual 158	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   13: astore_0
    //   14: aload_0
    //   15: invokevirtual 164	java/nio/channels/FileChannel:size	()J
    //   18: lstore_1
    //   19: aload_0
    //   20: getstatic 170	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   23: lconst_0
    //   24: lload_1
    //   25: invokevirtual 174	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   28: astore_0
    //   29: aload_3
    //   30: invokevirtual 175	java/io/FileInputStream:close	()V
    //   33: aload_0
    //   34: areturn
    //   35: astore_0
    //   36: aload_3
    //   37: invokevirtual 175	java/io/FileInputStream:close	()V
    //   40: goto +9 -> 49
    //   43: astore_3
    //   44: aload_0
    //   45: aload_3
    //   46: invokevirtual 181	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   49: aload_0
    //   50: athrow
    //   51: astore_0
    //   52: aconst_null
    //   53: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	paramFile	File
    //   18	7	1	l	long
    //   3	34	3	localFileInputStream	java.io.FileInputStream
    //   43	3	3	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   9	29	35	finally
    //   36	40	43	finally
    //   0	9	51	java/io/IOException
    //   29	33	51	java/io/IOException
    //   44	49	51	java/io/IOException
    //   49	51	51	java/io/IOException
  }
  
  public static Map<Uri, ByteBuffer> readFontInfoIntoByteBuffer(Context paramContext, FontsContractCompat.FontInfo[] paramArrayOfFontInfo, CancellationSignal paramCancellationSignal)
  {
    HashMap localHashMap = new HashMap();
    int j = paramArrayOfFontInfo.length;
    for (int i = 0; i < j; i++)
    {
      Object localObject = paramArrayOfFontInfo[i];
      if (((FontsContractCompat.FontInfo)localObject).getResultCode() == 0)
      {
        localObject = ((FontsContractCompat.FontInfo)localObject).getUri();
        if (!localHashMap.containsKey(localObject)) {
          localHashMap.put(localObject, mmap(paramContext, paramCancellationSignal, (Uri)localObject));
        }
      }
    }
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\graphics\TypefaceCompatUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */