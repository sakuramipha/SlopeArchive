package androidx.documentfile.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class RawDocumentFile
  extends DocumentFile
{
  private File mFile;
  
  RawDocumentFile(DocumentFile paramDocumentFile, File paramFile)
  {
    super(paramDocumentFile);
    this.mFile = paramFile;
  }
  
  private static boolean deleteContents(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    boolean bool2 = true;
    boolean bool1 = true;
    if (arrayOfFile != null)
    {
      int j = arrayOfFile.length;
      for (int i = 0;; i++)
      {
        bool2 = bool1;
        if (i >= j) {
          break;
        }
        File localFile = arrayOfFile[i];
        bool2 = bool1;
        if (localFile.isDirectory()) {
          bool2 = bool1 & deleteContents(localFile);
        }
        bool1 = bool2;
        if (!localFile.delete())
        {
          paramFile = new StringBuilder();
          paramFile.append("Failed to delete ");
          paramFile.append(localFile);
          Log.w("DocumentFile", paramFile.toString());
          bool1 = false;
        }
      }
    }
    return bool2;
  }
  
  private static String getTypeForName(String paramString)
  {
    int i = paramString.lastIndexOf('.');
    if (i >= 0)
    {
      paramString = paramString.substring(i + 1).toLowerCase();
      paramString = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
      if (paramString != null) {
        return paramString;
      }
    }
    return "application/octet-stream";
  }
  
  public boolean canRead()
  {
    return this.mFile.canRead();
  }
  
  public boolean canWrite()
  {
    return this.mFile.canWrite();
  }
  
  public DocumentFile createDirectory(String paramString)
  {
    paramString = new File(this.mFile, paramString);
    if ((!paramString.isDirectory()) && (!paramString.mkdir())) {
      return null;
    }
    return new RawDocumentFile(this, paramString);
  }
  
  public DocumentFile createFile(String paramString1, String paramString2)
  {
    String str = MimeTypeMap.getSingleton().getExtensionFromMimeType(paramString1);
    paramString1 = paramString2;
    if (str != null)
    {
      paramString1 = new StringBuilder();
      paramString1.append(paramString2);
      paramString1.append(".");
      paramString1.append(str);
      paramString1 = paramString1.toString();
    }
    paramString1 = new File(this.mFile, paramString1);
    try
    {
      paramString1.createNewFile();
      paramString1 = new RawDocumentFile(this, paramString1);
      return paramString1;
    }
    catch (IOException paramString2)
    {
      paramString1 = new StringBuilder();
      paramString1.append("Failed to createFile: ");
      paramString1.append(paramString2);
      Log.w("DocumentFile", paramString1.toString());
    }
    return null;
  }
  
  public boolean delete()
  {
    deleteContents(this.mFile);
    return this.mFile.delete();
  }
  
  public boolean exists()
  {
    return this.mFile.exists();
  }
  
  public String getName()
  {
    return this.mFile.getName();
  }
  
  public String getType()
  {
    if (this.mFile.isDirectory()) {
      return null;
    }
    return getTypeForName(this.mFile.getName());
  }
  
  public Uri getUri()
  {
    return Uri.fromFile(this.mFile);
  }
  
  public boolean isDirectory()
  {
    return this.mFile.isDirectory();
  }
  
  public boolean isFile()
  {
    return this.mFile.isFile();
  }
  
  public boolean isVirtual()
  {
    return false;
  }
  
  public long lastModified()
  {
    return this.mFile.lastModified();
  }
  
  public long length()
  {
    return this.mFile.length();
  }
  
  public DocumentFile[] listFiles()
  {
    ArrayList localArrayList = new ArrayList();
    File[] arrayOfFile = this.mFile.listFiles();
    if (arrayOfFile != null)
    {
      int j = arrayOfFile.length;
      for (int i = 0; i < j; i++) {
        localArrayList.add(new RawDocumentFile(this, arrayOfFile[i]));
      }
    }
    return (DocumentFile[])localArrayList.toArray(new DocumentFile[localArrayList.size()]);
  }
  
  public boolean renameTo(String paramString)
  {
    paramString = new File(this.mFile.getParentFile(), paramString);
    if (this.mFile.renameTo(paramString))
    {
      this.mFile = paramString;
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\documentfile\provider\RawDocumentFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */