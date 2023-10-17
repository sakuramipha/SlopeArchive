package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.File;

public final class zzfkj
{
  public static File zza(File paramFile, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramFile.exists()) && (!paramFile.isDirectory())) {
      paramFile.delete();
    }
    if (!paramFile.exists()) {
      paramFile.mkdirs();
    }
    return paramFile;
  }
  
  public static File zzb(String paramString1, String paramString2, File paramFile)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2))) {
      return new File(zzc(paramString1, paramFile), paramString2);
    }
    return null;
  }
  
  public static File zzc(String paramString, File paramFile)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    paramString = new File(paramFile, paramString);
    zza(paramString, false);
    return paramString;
  }
  
  public static boolean zzd(File paramFile)
  {
    if (!paramFile.exists()) {
      return true;
    }
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null)
    {
      int j = 0;
      int i = 1;
      for (;;)
      {
        k = i;
        if (j >= arrayOfFile.length) {
          break;
        }
        File localFile = arrayOfFile[j];
        if ((localFile != null) && (zzd(localFile)) && (i != 0)) {
          i = 1;
        } else {
          i = 0;
        }
        j++;
      }
    }
    int k = 1;
    return (paramFile.delete()) && (k != 0);
  }
  
  /* Error */
  public static boolean zze(File paramFile, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: new 54	java/io/FileOutputStream
    //   8: astore_2
    //   9: aload_2
    //   10: aload_0
    //   11: invokespecial 57	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   14: aload_2
    //   15: aload_1
    //   16: invokevirtual 61	java/io/FileOutputStream:write	([B)V
    //   19: aload_2
    //   20: invokevirtual 65	java/io/FileOutputStream:flush	()V
    //   23: aload_2
    //   24: invokestatic 71	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   27: iconst_1
    //   28: ireturn
    //   29: astore_0
    //   30: aload_2
    //   31: astore_1
    //   32: goto +10 -> 42
    //   35: astore_0
    //   36: goto +12 -> 48
    //   39: astore_0
    //   40: aload_3
    //   41: astore_1
    //   42: aload_1
    //   43: invokestatic 71	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   46: aload_0
    //   47: athrow
    //   48: aload_2
    //   49: invokestatic 71	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   52: iconst_0
    //   53: ireturn
    //   54: astore_0
    //   55: aload 4
    //   57: astore_2
    //   58: goto -10 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	paramFile	File
    //   0	61	1	paramArrayOfByte	byte[]
    //   8	50	2	localObject1	Object
    //   4	37	3	localObject2	Object
    //   1	55	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   14	23	29	finally
    //   14	23	35	java/io/IOException
    //   5	14	39	finally
    //   5	14	54	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */