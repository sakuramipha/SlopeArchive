package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class InputConnectionCompat
{
  private static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
  private static final String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
  private static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
  private static final String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
  private static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
  private static final String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
  private static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
  private static final String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
  private static final String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
  private static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
  private static final String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
  private static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
  private static final String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
  private static final String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
  public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
  
  public static boolean commitContent(InputConnection paramInputConnection, EditorInfo paramEditorInfo, InputContentInfoCompat paramInputContentInfoCompat, int paramInt, Bundle paramBundle)
  {
    ClipDescription localClipDescription = paramInputContentInfoCompat.getDescription();
    Object localObject = EditorInfoCompat.getContentMimeTypes(paramEditorInfo);
    int k = localObject.length;
    int j = 0;
    for (int i = 0; i < k; i++) {
      if (localClipDescription.hasMimeType(localObject[i]))
      {
        i = 1;
        break label58;
      }
    }
    i = 0;
    label58:
    if (i == 0) {
      return false;
    }
    if (Build.VERSION.SDK_INT >= 25) {
      return paramInputConnection.commitContent((InputContentInfo)paramInputContentInfoCompat.unwrap(), paramInt, paramBundle);
    }
    k = EditorInfoCompat.getProtocol(paramEditorInfo);
    if (k != 2)
    {
      i = j;
      if (k != 3)
      {
        i = j;
        if (k != 4) {
          return false;
        }
      }
    }
    else
    {
      i = 1;
    }
    localObject = new Bundle();
    if (i != 0) {
      paramEditorInfo = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    } else {
      paramEditorInfo = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    }
    ((Bundle)localObject).putParcelable(paramEditorInfo, paramInputContentInfoCompat.getContentUri());
    if (i != 0) {
      paramEditorInfo = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    } else {
      paramEditorInfo = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    }
    ((Bundle)localObject).putParcelable(paramEditorInfo, paramInputContentInfoCompat.getDescription());
    if (i != 0) {
      paramEditorInfo = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    } else {
      paramEditorInfo = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    }
    ((Bundle)localObject).putParcelable(paramEditorInfo, paramInputContentInfoCompat.getLinkUri());
    if (i != 0) {
      paramEditorInfo = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    } else {
      paramEditorInfo = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    }
    ((Bundle)localObject).putInt(paramEditorInfo, paramInt);
    if (i != 0) {
      paramEditorInfo = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    } else {
      paramEditorInfo = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    }
    ((Bundle)localObject).putParcelable(paramEditorInfo, paramBundle);
    if (i != 0) {
      paramEditorInfo = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    } else {
      paramEditorInfo = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    }
    return paramInputConnection.performPrivateCommand(paramEditorInfo, (Bundle)localObject);
  }
  
  public static InputConnection createWrapper(InputConnection paramInputConnection, EditorInfo paramEditorInfo, final OnCommitContentListener paramOnCommitContentListener)
  {
    if (paramInputConnection != null)
    {
      if (paramEditorInfo != null)
      {
        if (paramOnCommitContentListener != null)
        {
          if (Build.VERSION.SDK_INT >= 25) {
            new InputConnectionWrapper(paramInputConnection, false)
            {
              public boolean commitContent(InputContentInfo paramAnonymousInputContentInfo, int paramAnonymousInt, Bundle paramAnonymousBundle)
              {
                if (paramOnCommitContentListener.onCommitContent(InputContentInfoCompat.wrap(paramAnonymousInputContentInfo), paramAnonymousInt, paramAnonymousBundle)) {
                  return true;
                }
                return super.commitContent(paramAnonymousInputContentInfo, paramAnonymousInt, paramAnonymousBundle);
              }
            };
          }
          if (EditorInfoCompat.getContentMimeTypes(paramEditorInfo).length == 0) {
            return paramInputConnection;
          }
          new InputConnectionWrapper(paramInputConnection, false)
          {
            public boolean performPrivateCommand(String paramAnonymousString, Bundle paramAnonymousBundle)
            {
              if (InputConnectionCompat.handlePerformPrivateCommand(paramAnonymousString, paramAnonymousBundle, paramOnCommitContentListener)) {
                return true;
              }
              return super.performPrivateCommand(paramAnonymousString, paramAnonymousBundle);
            }
          };
        }
        throw new IllegalArgumentException("onCommitContentListener must be non-null");
      }
      throw new IllegalArgumentException("editorInfo must be non-null");
    }
    throw new IllegalArgumentException("inputConnection must be non-null");
  }
  
  /* Error */
  static boolean handlePerformPrivateCommand(String paramString, Bundle paramBundle, OnCommitContentListener paramOnCommitContentListener)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_1
    //   4: ifnonnull +5 -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: ldc 15
    //   11: aload_0
    //   12: invokestatic 151	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   15: ifeq +8 -> 23
    //   18: iconst_0
    //   19: istore_3
    //   20: goto +14 -> 34
    //   23: ldc 36
    //   25: aload_0
    //   26: invokestatic 151	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   29: ifeq +216 -> 245
    //   32: iconst_1
    //   33: istore_3
    //   34: iload_3
    //   35: ifeq +9 -> 44
    //   38: ldc 51
    //   40: astore_0
    //   41: goto +6 -> 47
    //   44: ldc 54
    //   46: astore_0
    //   47: aload_1
    //   48: aload_0
    //   49: invokevirtual 155	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   52: checkcast 157	android/os/ResultReceiver
    //   55: astore 6
    //   57: iload_3
    //   58: ifeq +9 -> 67
    //   61: ldc 18
    //   63: astore_0
    //   64: goto +6 -> 70
    //   67: ldc 21
    //   69: astore_0
    //   70: aload_1
    //   71: aload_0
    //   72: invokevirtual 155	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   75: checkcast 159	android/net/Uri
    //   78: astore 7
    //   80: iload_3
    //   81: ifeq +9 -> 90
    //   84: ldc 24
    //   86: astore_0
    //   87: goto +6 -> 93
    //   90: ldc 27
    //   92: astore_0
    //   93: aload_1
    //   94: aload_0
    //   95: invokevirtual 155	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   98: checkcast 80	android/content/ClipDescription
    //   101: astore 8
    //   103: iload_3
    //   104: ifeq +9 -> 113
    //   107: ldc 39
    //   109: astore_0
    //   110: goto +6 -> 116
    //   113: ldc 42
    //   115: astore_0
    //   116: aload_1
    //   117: aload_0
    //   118: invokevirtual 155	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   121: checkcast 159	android/net/Uri
    //   124: astore 9
    //   126: iload_3
    //   127: ifeq +9 -> 136
    //   130: ldc 30
    //   132: astore_0
    //   133: goto +6 -> 139
    //   136: ldc 33
    //   138: astore_0
    //   139: aload_1
    //   140: aload_0
    //   141: invokevirtual 163	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   144: istore 5
    //   146: iload_3
    //   147: ifeq +9 -> 156
    //   150: ldc 45
    //   152: astore_0
    //   153: goto +6 -> 159
    //   156: ldc 48
    //   158: astore_0
    //   159: aload_1
    //   160: aload_0
    //   161: invokevirtual 155	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   164: checkcast 106	android/os/Bundle
    //   167: astore_1
    //   168: iload 4
    //   170: istore_3
    //   171: aload 7
    //   173: ifnull +36 -> 209
    //   176: iload 4
    //   178: istore_3
    //   179: aload 8
    //   181: ifnull +28 -> 209
    //   184: new 68	androidx/core/view/inputmethod/InputContentInfoCompat
    //   187: astore_0
    //   188: aload_0
    //   189: aload 7
    //   191: aload 8
    //   193: aload 9
    //   195: invokespecial 166	androidx/core/view/inputmethod/InputContentInfoCompat:<init>	(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    //   198: aload_2
    //   199: aload_0
    //   200: iload 5
    //   202: aload_1
    //   203: invokeinterface 170 4 0
    //   208: istore_3
    //   209: aload 6
    //   211: ifnull +10 -> 221
    //   214: aload 6
    //   216: iload_3
    //   217: aconst_null
    //   218: invokevirtual 174	android/os/ResultReceiver:send	(ILandroid/os/Bundle;)V
    //   221: iload_3
    //   222: ireturn
    //   223: astore_0
    //   224: aload 6
    //   226: astore_1
    //   227: goto +6 -> 233
    //   230: astore_0
    //   231: aconst_null
    //   232: astore_1
    //   233: aload_1
    //   234: ifnull +9 -> 243
    //   237: aload_1
    //   238: iconst_0
    //   239: aconst_null
    //   240: invokevirtual 174	android/os/ResultReceiver:send	(ILandroid/os/Bundle;)V
    //   243: aload_0
    //   244: athrow
    //   245: iconst_0
    //   246: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	paramString	String
    //   0	247	1	paramBundle	Bundle
    //   0	247	2	paramOnCommitContentListener	OnCommitContentListener
    //   19	203	3	i	int
    //   1	176	4	j	int
    //   144	57	5	k	int
    //   55	170	6	localResultReceiver	android.os.ResultReceiver
    //   78	112	7	localUri1	android.net.Uri
    //   101	91	8	localClipDescription	ClipDescription
    //   124	70	9	localUri2	android.net.Uri
    // Exception table:
    //   from	to	target	type
    //   70	80	223	finally
    //   93	103	223	finally
    //   116	126	223	finally
    //   139	146	223	finally
    //   159	168	223	finally
    //   184	209	223	finally
    //   47	57	230	finally
  }
  
  public static abstract interface OnCommitContentListener
  {
    public abstract boolean onCommitContent(InputContentInfoCompat paramInputContentInfoCompat, int paramInt, Bundle paramBundle);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\inputmethod\InputConnectionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */