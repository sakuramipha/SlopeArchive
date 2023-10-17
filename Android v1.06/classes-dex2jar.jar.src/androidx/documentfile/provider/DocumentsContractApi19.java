package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;

class DocumentsContractApi19
{
  private static final int FLAG_VIRTUAL_DOCUMENT = 512;
  private static final String TAG = "DocumentFile";
  
  public static boolean canRead(Context paramContext, Uri paramUri)
  {
    if (paramContext.checkCallingOrSelfUriPermission(paramUri, 1) != 0) {
      return false;
    }
    return !TextUtils.isEmpty(getRawType(paramContext, paramUri));
  }
  
  public static boolean canWrite(Context paramContext, Uri paramUri)
  {
    if (paramContext.checkCallingOrSelfUriPermission(paramUri, 2) != 0) {
      return false;
    }
    String str = getRawType(paramContext, paramUri);
    int i = queryForInt(paramContext, paramUri, "flags", 0);
    if (TextUtils.isEmpty(str)) {
      return false;
    }
    if ((i & 0x4) != 0) {
      return true;
    }
    if (("vnd.android.document/directory".equals(str)) && ((i & 0x8) != 0)) {
      return true;
    }
    return (!TextUtils.isEmpty(str)) && ((i & 0x2) != 0);
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
  
  /* Error */
  public static boolean exists(Context paramContext, Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 65	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 5
    //   6: iconst_0
    //   7: istore_3
    //   8: aconst_null
    //   9: astore 4
    //   11: aconst_null
    //   12: astore_0
    //   13: aload 5
    //   15: aload_1
    //   16: iconst_1
    //   17: anewarray 45	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: ldc 67
    //   24: aastore
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: invokevirtual 73	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore_1
    //   32: aload_1
    //   33: astore_0
    //   34: aload_1
    //   35: astore 4
    //   37: aload_1
    //   38: invokeinterface 79 1 0
    //   43: istore_2
    //   44: iload_2
    //   45: ifle +5 -> 50
    //   48: iconst_1
    //   49: istore_3
    //   50: aload_1
    //   51: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   54: iload_3
    //   55: ireturn
    //   56: astore_1
    //   57: goto +59 -> 116
    //   60: astore 5
    //   62: aload 4
    //   64: astore_0
    //   65: new 83	java/lang/StringBuilder
    //   68: astore_1
    //   69: aload 4
    //   71: astore_0
    //   72: aload_1
    //   73: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   76: aload 4
    //   78: astore_0
    //   79: aload_1
    //   80: ldc 86
    //   82: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload 4
    //   88: astore_0
    //   89: aload_1
    //   90: aload 5
    //   92: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload 4
    //   98: astore_0
    //   99: ldc 11
    //   101: aload_1
    //   102: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokestatic 103	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   108: pop
    //   109: aload 4
    //   111: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   114: iconst_0
    //   115: ireturn
    //   116: aload_0
    //   117: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   120: aload_1
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	paramContext	Context
    //   0	122	1	paramUri	Uri
    //   43	2	2	i	int
    //   7	48	3	bool	boolean
    //   9	101	4	localUri	Uri
    //   4	10	5	localContentResolver	android.content.ContentResolver
    //   60	31	5	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   13	32	56	finally
    //   37	44	56	finally
    //   65	69	56	finally
    //   72	76	56	finally
    //   79	86	56	finally
    //   89	96	56	finally
    //   99	109	56	finally
    //   13	32	60	java/lang/Exception
    //   37	44	60	java/lang/Exception
  }
  
  public static long getFlags(Context paramContext, Uri paramUri)
  {
    return queryForLong(paramContext, paramUri, "flags", 0L);
  }
  
  public static String getName(Context paramContext, Uri paramUri)
  {
    return queryForString(paramContext, paramUri, "_display_name", null);
  }
  
  private static String getRawType(Context paramContext, Uri paramUri)
  {
    return queryForString(paramContext, paramUri, "mime_type", null);
  }
  
  public static String getType(Context paramContext, Uri paramUri)
  {
    paramUri = getRawType(paramContext, paramUri);
    paramContext = paramUri;
    if ("vnd.android.document/directory".equals(paramUri)) {
      paramContext = null;
    }
    return paramContext;
  }
  
  public static boolean isDirectory(Context paramContext, Uri paramUri)
  {
    return "vnd.android.document/directory".equals(getRawType(paramContext, paramUri));
  }
  
  public static boolean isFile(Context paramContext, Uri paramUri)
  {
    paramContext = getRawType(paramContext, paramUri);
    return (!"vnd.android.document/directory".equals(paramContext)) && (!TextUtils.isEmpty(paramContext));
  }
  
  public static boolean isVirtual(Context paramContext, Uri paramUri)
  {
    boolean bool2 = DocumentsContract.isDocumentUri(paramContext, paramUri);
    boolean bool1 = false;
    if (!bool2) {
      return false;
    }
    if ((getFlags(paramContext, paramUri) & 0x200) != 0L) {
      bool1 = true;
    }
    return bool1;
  }
  
  public static long lastModified(Context paramContext, Uri paramUri)
  {
    return queryForLong(paramContext, paramUri, "last_modified", 0L);
  }
  
  public static long length(Context paramContext, Uri paramUri)
  {
    return queryForLong(paramContext, paramUri, "_size", 0L);
  }
  
  private static int queryForInt(Context paramContext, Uri paramUri, String paramString, int paramInt)
  {
    return (int)queryForLong(paramContext, paramUri, paramString, paramInt);
  }
  
  /* Error */
  private static long queryForLong(Context paramContext, Uri paramUri, String paramString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 65	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 8
    //   6: aconst_null
    //   7: astore 7
    //   9: aconst_null
    //   10: astore_0
    //   11: aload 8
    //   13: aload_1
    //   14: iconst_1
    //   15: anewarray 45	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: aload_2
    //   21: aastore
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: invokevirtual 73	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_1
    //   29: aload_1
    //   30: astore_0
    //   31: aload_1
    //   32: astore 7
    //   34: aload_1
    //   35: invokeinterface 141 1 0
    //   40: ifeq +39 -> 79
    //   43: aload_1
    //   44: astore_0
    //   45: aload_1
    //   46: astore 7
    //   48: aload_1
    //   49: iconst_0
    //   50: invokeinterface 145 2 0
    //   55: ifne +24 -> 79
    //   58: aload_1
    //   59: astore_0
    //   60: aload_1
    //   61: astore 7
    //   63: aload_1
    //   64: iconst_0
    //   65: invokeinterface 149 2 0
    //   70: lstore 5
    //   72: aload_1
    //   73: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   76: lload 5
    //   78: lreturn
    //   79: aload_1
    //   80: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   83: lload_3
    //   84: lreturn
    //   85: astore_1
    //   86: goto +57 -> 143
    //   89: astore_1
    //   90: aload 7
    //   92: astore_0
    //   93: new 83	java/lang/StringBuilder
    //   96: astore_2
    //   97: aload 7
    //   99: astore_0
    //   100: aload_2
    //   101: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   104: aload 7
    //   106: astore_0
    //   107: aload_2
    //   108: ldc 86
    //   110: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload 7
    //   116: astore_0
    //   117: aload_2
    //   118: aload_1
    //   119: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: aload 7
    //   125: astore_0
    //   126: ldc 11
    //   128: aload_2
    //   129: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokestatic 103	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   135: pop
    //   136: aload 7
    //   138: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   141: lload_3
    //   142: lreturn
    //   143: aload_0
    //   144: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   147: aload_1
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	paramContext	Context
    //   0	149	1	paramUri	Uri
    //   0	149	2	paramString	String
    //   0	149	3	paramLong	long
    //   70	7	5	l	long
    //   7	130	7	localUri	Uri
    //   4	8	8	localContentResolver	android.content.ContentResolver
    // Exception table:
    //   from	to	target	type
    //   11	29	85	finally
    //   34	43	85	finally
    //   48	58	85	finally
    //   63	72	85	finally
    //   93	97	85	finally
    //   100	104	85	finally
    //   107	114	85	finally
    //   117	123	85	finally
    //   126	136	85	finally
    //   11	29	89	java/lang/Exception
    //   34	43	89	java/lang/Exception
    //   48	58	89	java/lang/Exception
    //   63	72	89	java/lang/Exception
  }
  
  /* Error */
  private static String queryForString(Context paramContext, Uri paramUri, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 65	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 4
    //   9: aconst_null
    //   10: astore_0
    //   11: aload 5
    //   13: aload_1
    //   14: iconst_1
    //   15: anewarray 45	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: aload_2
    //   21: aastore
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: invokevirtual 73	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_1
    //   29: aload_1
    //   30: astore_0
    //   31: aload_1
    //   32: astore 4
    //   34: aload_1
    //   35: invokeinterface 141 1 0
    //   40: ifeq +37 -> 77
    //   43: aload_1
    //   44: astore_0
    //   45: aload_1
    //   46: astore 4
    //   48: aload_1
    //   49: iconst_0
    //   50: invokeinterface 145 2 0
    //   55: ifne +22 -> 77
    //   58: aload_1
    //   59: astore_0
    //   60: aload_1
    //   61: astore 4
    //   63: aload_1
    //   64: iconst_0
    //   65: invokeinterface 153 2 0
    //   70: astore_2
    //   71: aload_1
    //   72: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   75: aload_2
    //   76: areturn
    //   77: aload_1
    //   78: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   81: aload_3
    //   82: areturn
    //   83: astore_1
    //   84: goto +57 -> 141
    //   87: astore_2
    //   88: aload 4
    //   90: astore_0
    //   91: new 83	java/lang/StringBuilder
    //   94: astore_1
    //   95: aload 4
    //   97: astore_0
    //   98: aload_1
    //   99: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   102: aload 4
    //   104: astore_0
    //   105: aload_1
    //   106: ldc 86
    //   108: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload 4
    //   114: astore_0
    //   115: aload_1
    //   116: aload_2
    //   117: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: aload 4
    //   123: astore_0
    //   124: ldc 11
    //   126: aload_1
    //   127: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: invokestatic 103	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   133: pop
    //   134: aload 4
    //   136: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   139: aload_3
    //   140: areturn
    //   141: aload_0
    //   142: invokestatic 81	androidx/documentfile/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   145: aload_1
    //   146: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	paramContext	Context
    //   0	147	1	paramUri	Uri
    //   0	147	2	paramString1	String
    //   0	147	3	paramString2	String
    //   7	128	4	localUri	Uri
    //   4	8	5	localContentResolver	android.content.ContentResolver
    // Exception table:
    //   from	to	target	type
    //   11	29	83	finally
    //   34	43	83	finally
    //   48	58	83	finally
    //   63	71	83	finally
    //   91	95	83	finally
    //   98	102	83	finally
    //   105	112	83	finally
    //   115	121	83	finally
    //   124	134	83	finally
    //   11	29	87	java/lang/Exception
    //   34	43	87	java/lang/Exception
    //   48	58	87	java/lang/Exception
    //   63	71	87	java/lang/Exception
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\documentfile\provider\DocumentsContractApi19.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */