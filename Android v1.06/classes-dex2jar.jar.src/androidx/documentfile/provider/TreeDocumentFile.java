package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

class TreeDocumentFile
  extends DocumentFile
{
  private Context mContext;
  private Uri mUri;
  
  TreeDocumentFile(DocumentFile paramDocumentFile, Context paramContext, Uri paramUri)
  {
    super(paramDocumentFile);
    this.mContext = paramContext;
    this.mUri = paramUri;
  }
  
  private static void closeQuietly(AutoCloseable paramAutoCloseable)
  {
    if (paramAutoCloseable != null) {}
    try
    {
      try
      {
        paramAutoCloseable.close();
      }
      catch (RuntimeException paramAutoCloseable)
      {
        throw paramAutoCloseable;
      }
      return;
    }
    catch (Exception paramAutoCloseable)
    {
      for (;;) {}
    }
  }
  
  private static Uri createFile(Context paramContext, Uri paramUri, String paramString1, String paramString2)
  {
    try
    {
      paramContext = DocumentsContract.createDocument(paramContext.getContentResolver(), paramUri, paramString1, paramString2);
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public boolean canRead()
  {
    return DocumentsContractApi19.canRead(this.mContext, this.mUri);
  }
  
  public boolean canWrite()
  {
    return DocumentsContractApi19.canWrite(this.mContext, this.mUri);
  }
  
  public DocumentFile createDirectory(String paramString)
  {
    paramString = createFile(this.mContext, this.mUri, "vnd.android.document/directory", paramString);
    if (paramString != null) {
      paramString = new TreeDocumentFile(this, this.mContext, paramString);
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  public DocumentFile createFile(String paramString1, String paramString2)
  {
    paramString1 = createFile(this.mContext, this.mUri, paramString1, paramString2);
    if (paramString1 != null) {
      paramString1 = new TreeDocumentFile(this, this.mContext, paramString1);
    } else {
      paramString1 = null;
    }
    return paramString1;
  }
  
  public boolean delete()
  {
    try
    {
      boolean bool = DocumentsContract.deleteDocument(this.mContext.getContentResolver(), this.mUri);
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public boolean exists()
  {
    return DocumentsContractApi19.exists(this.mContext, this.mUri);
  }
  
  public String getName()
  {
    return DocumentsContractApi19.getName(this.mContext, this.mUri);
  }
  
  public String getType()
  {
    return DocumentsContractApi19.getType(this.mContext, this.mUri);
  }
  
  public Uri getUri()
  {
    return this.mUri;
  }
  
  public boolean isDirectory()
  {
    return DocumentsContractApi19.isDirectory(this.mContext, this.mUri);
  }
  
  public boolean isFile()
  {
    return DocumentsContractApi19.isFile(this.mContext, this.mUri);
  }
  
  public boolean isVirtual()
  {
    return DocumentsContractApi19.isVirtual(this.mContext, this.mUri);
  }
  
  public long lastModified()
  {
    return DocumentsContractApi19.lastModified(this.mContext, this.mUri);
  }
  
  public long length()
  {
    return DocumentsContractApi19.length(this.mContext, this.mUri);
  }
  
  /* Error */
  public DocumentFile[] listFiles()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	androidx/documentfile/provider/TreeDocumentFile:mContext	Landroid/content/Context;
    //   4: invokevirtual 38	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   7: astore 4
    //   9: aload_0
    //   10: getfield 17	androidx/documentfile/provider/TreeDocumentFile:mUri	Landroid/net/Uri;
    //   13: astore_2
    //   14: aload_2
    //   15: aload_2
    //   16: invokestatic 104	android/provider/DocumentsContract:getDocumentId	(Landroid/net/Uri;)Ljava/lang/String;
    //   19: invokestatic 108	android/provider/DocumentsContract:buildChildDocumentsUriUsingTree	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   22: astore 5
    //   24: new 110	java/util/ArrayList
    //   27: dup
    //   28: invokespecial 112	java/util/ArrayList:<init>	()V
    //   31: astore 6
    //   33: iconst_0
    //   34: istore_1
    //   35: aconst_null
    //   36: astore_2
    //   37: aconst_null
    //   38: astore_3
    //   39: aload 4
    //   41: aload 5
    //   43: iconst_1
    //   44: anewarray 114	java/lang/String
    //   47: dup
    //   48: iconst_0
    //   49: ldc 116
    //   51: aastore
    //   52: aconst_null
    //   53: aconst_null
    //   54: aconst_null
    //   55: invokevirtual 122	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   58: astore 4
    //   60: aload 4
    //   62: astore 5
    //   64: aload 4
    //   66: astore_3
    //   67: aload 4
    //   69: astore_2
    //   70: aload 4
    //   72: invokeinterface 127 1 0
    //   77: ifeq +43 -> 120
    //   80: aload 4
    //   82: astore_3
    //   83: aload 4
    //   85: astore_2
    //   86: aload 4
    //   88: iconst_0
    //   89: invokeinterface 131 2 0
    //   94: astore 5
    //   96: aload 4
    //   98: astore_3
    //   99: aload 4
    //   101: astore_2
    //   102: aload 6
    //   104: aload_0
    //   105: getfield 17	androidx/documentfile/provider/TreeDocumentFile:mUri	Landroid/net/Uri;
    //   108: aload 5
    //   110: invokestatic 134	android/provider/DocumentsContract:buildDocumentUriUsingTree	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   113: invokevirtual 138	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   116: pop
    //   117: goto -57 -> 60
    //   120: aload 5
    //   122: invokestatic 140	androidx/documentfile/provider/TreeDocumentFile:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   125: goto +62 -> 187
    //   128: astore_2
    //   129: goto +113 -> 242
    //   132: astore 4
    //   134: aload_2
    //   135: astore_3
    //   136: new 142	java/lang/StringBuilder
    //   139: astore 5
    //   141: aload_2
    //   142: astore_3
    //   143: aload 5
    //   145: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   148: aload_2
    //   149: astore_3
    //   150: aload 5
    //   152: ldc -111
    //   154: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload_2
    //   159: astore_3
    //   160: aload 5
    //   162: aload 4
    //   164: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload_2
    //   169: astore_3
    //   170: ldc -102
    //   172: aload 5
    //   174: invokevirtual 157	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: invokestatic 163	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   180: pop
    //   181: aload_2
    //   182: astore 5
    //   184: goto -64 -> 120
    //   187: aload 6
    //   189: aload 6
    //   191: invokevirtual 167	java/util/ArrayList:size	()I
    //   194: anewarray 169	android/net/Uri
    //   197: invokevirtual 173	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   200: checkcast 175	[Landroid/net/Uri;
    //   203: astore_3
    //   204: aload_3
    //   205: arraylength
    //   206: anewarray 4	androidx/documentfile/provider/DocumentFile
    //   209: astore_2
    //   210: iload_1
    //   211: aload_3
    //   212: arraylength
    //   213: if_icmpge +27 -> 240
    //   216: aload_2
    //   217: iload_1
    //   218: new 2	androidx/documentfile/provider/TreeDocumentFile
    //   221: dup
    //   222: aload_0
    //   223: aload_0
    //   224: getfield 15	androidx/documentfile/provider/TreeDocumentFile:mContext	Landroid/content/Context;
    //   227: aload_3
    //   228: iload_1
    //   229: aaload
    //   230: invokespecial 62	androidx/documentfile/provider/TreeDocumentFile:<init>	(Landroidx/documentfile/provider/DocumentFile;Landroid/content/Context;Landroid/net/Uri;)V
    //   233: aastore
    //   234: iinc 1 1
    //   237: goto -27 -> 210
    //   240: aload_2
    //   241: areturn
    //   242: aload_3
    //   243: invokestatic 140	androidx/documentfile/provider/TreeDocumentFile:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   246: aload_2
    //   247: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	TreeDocumentFile
    //   34	201	1	i	int
    //   13	89	2	localObject1	Object
    //   128	54	2	localObject2	Object
    //   209	38	2	arrayOfDocumentFile	DocumentFile[]
    //   38	205	3	localObject3	Object
    //   7	93	4	localObject4	Object
    //   132	31	4	localException	Exception
    //   22	161	5	localObject5	Object
    //   31	159	6	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   39	60	128	finally
    //   70	80	128	finally
    //   86	96	128	finally
    //   102	117	128	finally
    //   136	141	128	finally
    //   143	148	128	finally
    //   150	158	128	finally
    //   160	168	128	finally
    //   170	181	128	finally
    //   39	60	132	java/lang/Exception
    //   70	80	132	java/lang/Exception
    //   86	96	132	java/lang/Exception
    //   102	117	132	java/lang/Exception
  }
  
  public boolean renameTo(String paramString)
  {
    try
    {
      paramString = DocumentsContract.renameDocument(this.mContext.getContentResolver(), this.mUri, paramString);
      if (paramString != null)
      {
        this.mUri = paramString;
        return true;
      }
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\documentfile\provider\TreeDocumentFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */