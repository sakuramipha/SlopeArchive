package com.google.android.gms.common.util;

import javax.annotation.Nullable;

public class ProcessUtils
{
  @Nullable
  private static String zza;
  private static int zzb;
  
  /* Error */
  public static String getMyProcessName()
  {
    // Byte code:
    //   0: getstatic 21	com/google/android/gms/common/util/ProcessUtils:zza	Ljava/lang/String;
    //   3: ifnonnull +163 -> 166
    //   6: getstatic 23	com/google/android/gms/common/util/ProcessUtils:zzb	I
    //   9: istore_1
    //   10: iload_1
    //   11: istore_0
    //   12: iload_1
    //   13: ifne +11 -> 24
    //   16: invokestatic 29	android/os/Process:myPid	()I
    //   19: istore_0
    //   20: iload_0
    //   21: putstatic 23	com/google/android/gms/common/util/ProcessUtils:zzb	I
    //   24: aconst_null
    //   25: astore_2
    //   26: aconst_null
    //   27: astore_3
    //   28: aconst_null
    //   29: astore 4
    //   31: iload_0
    //   32: ifgt +8 -> 40
    //   35: aload_3
    //   36: astore_2
    //   37: goto +125 -> 162
    //   40: new 31	java/lang/StringBuilder
    //   43: astore_3
    //   44: aload_3
    //   45: bipush 25
    //   47: invokespecial 34	java/lang/StringBuilder:<init>	(I)V
    //   50: aload_3
    //   51: ldc 36
    //   53: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: aload_3
    //   58: iload_0
    //   59: invokevirtual 43	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload_3
    //   64: ldc 45
    //   66: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload_3
    //   71: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: astore 6
    //   76: invokestatic 54	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   79: astore 5
    //   81: new 56	java/io/BufferedReader
    //   84: astore_3
    //   85: new 58	java/io/FileReader
    //   88: astore 7
    //   90: aload 7
    //   92: aload 6
    //   94: invokespecial 61	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   97: aload_3
    //   98: aload 7
    //   100: invokespecial 64	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   103: aload 5
    //   105: invokestatic 68	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   108: aload_3
    //   109: invokevirtual 71	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   112: astore 4
    //   114: aload 4
    //   116: invokestatic 77	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   119: pop
    //   120: aload 4
    //   122: invokevirtual 82	java/lang/String:trim	()Ljava/lang/String;
    //   125: astore 4
    //   127: aload 4
    //   129: astore_2
    //   130: goto +28 -> 158
    //   133: astore_2
    //   134: goto +15 -> 149
    //   137: astore_3
    //   138: aload 5
    //   140: invokestatic 68	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   143: aload_3
    //   144: athrow
    //   145: astore_2
    //   146: aload 4
    //   148: astore_3
    //   149: aload_3
    //   150: invokestatic 88	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   153: aload_2
    //   154: athrow
    //   155: astore_3
    //   156: aconst_null
    //   157: astore_3
    //   158: aload_3
    //   159: invokestatic 88	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   162: aload_2
    //   163: putstatic 21	com/google/android/gms/common/util/ProcessUtils:zza	Ljava/lang/String;
    //   166: getstatic 21	com/google/android/gms/common/util/ProcessUtils:zza	Ljava/lang/String;
    //   169: areturn
    //   170: astore 4
    //   172: goto -14 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   11	48	0	i	int
    //   9	4	1	j	int
    //   25	105	2	localObject1	Object
    //   133	1	2	localObject2	Object
    //   145	18	2	str1	String
    //   27	82	3	localObject3	Object
    //   137	7	3	localObject4	Object
    //   148	2	3	localObject5	Object
    //   155	1	3	localIOException1	java.io.IOException
    //   157	2	3	localCloseable	java.io.Closeable
    //   29	118	4	str2	String
    //   170	1	4	localIOException2	java.io.IOException
    //   79	60	5	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    //   74	19	6	str3	String
    //   88	11	7	localFileReader	java.io.FileReader
    // Exception table:
    //   from	to	target	type
    //   108	127	133	finally
    //   81	103	137	finally
    //   40	81	145	finally
    //   103	108	145	finally
    //   138	145	145	finally
    //   40	81	155	java/io/IOException
    //   103	108	155	java/io/IOException
    //   138	145	155	java/io/IOException
    //   108	127	170	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\ProcessUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */