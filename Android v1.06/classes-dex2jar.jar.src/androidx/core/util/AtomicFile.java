package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AtomicFile
{
  private static final String LOG_TAG = "AtomicFile";
  private final File mBaseName;
  private final File mLegacyBackupName;
  private final File mNewName;
  
  public AtomicFile(File paramFile)
  {
    this.mBaseName = paramFile;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramFile.getPath());
    localStringBuilder.append(".new");
    this.mNewName = new File(localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramFile.getPath());
    localStringBuilder.append(".bak");
    this.mLegacyBackupName = new File(localStringBuilder.toString());
  }
  
  private static void rename(File paramFile1, File paramFile2)
  {
    StringBuilder localStringBuilder;
    if ((paramFile2.isDirectory()) && (!paramFile2.delete()))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to delete file which is a directory ");
      localStringBuilder.append(paramFile2);
      Log.e("AtomicFile", localStringBuilder.toString());
    }
    if (!paramFile1.renameTo(paramFile2))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to rename ");
      localStringBuilder.append(paramFile1);
      localStringBuilder.append(" to ");
      localStringBuilder.append(paramFile2);
      Log.e("AtomicFile", localStringBuilder.toString());
    }
  }
  
  private static boolean sync(FileOutputStream paramFileOutputStream)
  {
    try
    {
      paramFileOutputStream.getFD().sync();
      return true;
    }
    catch (IOException paramFileOutputStream) {}
    return false;
  }
  
  public void delete()
  {
    this.mBaseName.delete();
    this.mNewName.delete();
    this.mLegacyBackupName.delete();
  }
  
  public void failWrite(FileOutputStream paramFileOutputStream)
  {
    if (paramFileOutputStream == null) {
      return;
    }
    if (!sync(paramFileOutputStream)) {
      Log.e("AtomicFile", "Failed to sync file output stream");
    }
    try
    {
      paramFileOutputStream.close();
    }
    catch (IOException paramFileOutputStream)
    {
      Log.e("AtomicFile", "Failed to close file output stream", paramFileOutputStream);
    }
    if (!this.mNewName.delete())
    {
      paramFileOutputStream = new StringBuilder();
      paramFileOutputStream.append("Failed to delete new file ");
      paramFileOutputStream.append(this.mNewName);
      Log.e("AtomicFile", paramFileOutputStream.toString());
    }
  }
  
  public void finishWrite(FileOutputStream paramFileOutputStream)
  {
    if (paramFileOutputStream == null) {
      return;
    }
    if (!sync(paramFileOutputStream)) {
      Log.e("AtomicFile", "Failed to sync file output stream");
    }
    try
    {
      paramFileOutputStream.close();
    }
    catch (IOException paramFileOutputStream)
    {
      Log.e("AtomicFile", "Failed to close file output stream", paramFileOutputStream);
    }
    rename(this.mNewName, this.mBaseName);
  }
  
  public File getBaseFile()
  {
    return this.mBaseName;
  }
  
  public FileInputStream openRead()
    throws FileNotFoundException
  {
    if (this.mLegacyBackupName.exists()) {
      rename(this.mLegacyBackupName, this.mBaseName);
    }
    if ((this.mNewName.exists()) && (this.mBaseName.exists()) && (!this.mNewName.delete()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to delete outdated new file ");
      localStringBuilder.append(this.mNewName);
      Log.e("AtomicFile", localStringBuilder.toString());
    }
    return new FileInputStream(this.mBaseName);
  }
  
  /* Error */
  public byte[] readFully()
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 128	androidx/core/util/AtomicFile:openRead	()Ljava/io/FileInputStream;
    //   4: astore 6
    //   6: aload 6
    //   8: invokevirtual 132	java/io/FileInputStream:available	()I
    //   11: newarray <illegal type>
    //   13: astore 4
    //   15: iconst_0
    //   16: istore_1
    //   17: aload 6
    //   19: aload 4
    //   21: iload_1
    //   22: aload 4
    //   24: arraylength
    //   25: iload_1
    //   26: isub
    //   27: invokevirtual 136	java/io/FileInputStream:read	([BII)I
    //   30: istore_2
    //   31: iload_2
    //   32: ifgt +11 -> 43
    //   35: aload 6
    //   37: invokevirtual 137	java/io/FileInputStream:close	()V
    //   40: aload 4
    //   42: areturn
    //   43: iload_1
    //   44: iload_2
    //   45: iadd
    //   46: istore_2
    //   47: aload 6
    //   49: invokevirtual 132	java/io/FileInputStream:available	()I
    //   52: istore_3
    //   53: iload_2
    //   54: istore_1
    //   55: iload_3
    //   56: aload 4
    //   58: arraylength
    //   59: iload_2
    //   60: isub
    //   61: if_icmple -44 -> 17
    //   64: iload_3
    //   65: iload_2
    //   66: iadd
    //   67: newarray <illegal type>
    //   69: astore 5
    //   71: aload 4
    //   73: iconst_0
    //   74: aload 5
    //   76: iconst_0
    //   77: iload_2
    //   78: invokestatic 143	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   81: aload 5
    //   83: astore 4
    //   85: iload_2
    //   86: istore_1
    //   87: goto -70 -> 17
    //   90: astore 4
    //   92: aload 6
    //   94: invokevirtual 137	java/io/FileInputStream:close	()V
    //   97: aload 4
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	AtomicFile
    //   16	71	1	i	int
    //   30	56	2	j	int
    //   52	15	3	k	int
    //   13	71	4	localObject1	Object
    //   90	8	4	localObject2	Object
    //   69	13	5	arrayOfByte	byte[]
    //   4	89	6	localFileInputStream	FileInputStream
    // Exception table:
    //   from	to	target	type
    //   6	15	90	finally
    //   17	31	90	finally
    //   47	53	90	finally
    //   55	81	90	finally
  }
  
  public FileOutputStream startWrite()
    throws IOException
  {
    if (this.mLegacyBackupName.exists()) {
      rename(this.mLegacyBackupName, this.mBaseName);
    }
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(this.mNewName);
      return localFileOutputStream;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      if (this.mNewName.getParentFile().mkdirs()) {
        try
        {
          localObject = new FileOutputStream(this.mNewName);
          return (FileOutputStream)localObject;
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Failed to create new file ");
          ((StringBuilder)localObject).append(this.mNewName);
          throw new IOException(((StringBuilder)localObject).toString(), localFileNotFoundException2);
        }
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to create directory for ");
      ((StringBuilder)localObject).append(this.mNewName);
      throw new IOException(((StringBuilder)localObject).toString());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\cor\\util\AtomicFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */