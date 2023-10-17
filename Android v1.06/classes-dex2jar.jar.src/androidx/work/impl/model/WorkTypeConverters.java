package androidx.work.impl.model;

import android.os.Build.VERSION;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo.State;

public class WorkTypeConverters
{
  public static int backoffPolicyToInt(BackoffPolicy paramBackoffPolicy)
  {
    int i = 1.$SwitchMap$androidx$work$BackoffPolicy[paramBackoffPolicy.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        return 1;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not convert ");
      localStringBuilder.append(paramBackoffPolicy);
      localStringBuilder.append(" to int");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    return 0;
  }
  
  /* Error */
  public static androidx.work.ContentUriTriggers byteArrayToContentUriTriggers(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 64	androidx/work/ContentUriTriggers
    //   3: dup
    //   4: invokespecial 65	androidx/work/ContentUriTriggers:<init>	()V
    //   7: astore 5
    //   9: aload_0
    //   10: ifnonnull +6 -> 16
    //   13: aload 5
    //   15: areturn
    //   16: new 67	java/io/ByteArrayInputStream
    //   19: dup
    //   20: aload_0
    //   21: invokespecial 70	java/io/ByteArrayInputStream:<init>	([B)V
    //   24: astore 4
    //   26: new 72	java/io/ObjectInputStream
    //   29: astore_2
    //   30: aload_2
    //   31: aload 4
    //   33: invokespecial 75	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   36: aload_2
    //   37: astore_0
    //   38: aload_2
    //   39: invokevirtual 78	java/io/ObjectInputStream:readInt	()I
    //   42: istore_1
    //   43: iload_1
    //   44: ifle +27 -> 71
    //   47: aload_2
    //   48: astore_0
    //   49: aload 5
    //   51: aload_2
    //   52: invokevirtual 81	java/io/ObjectInputStream:readUTF	()Ljava/lang/String;
    //   55: invokestatic 87	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   58: aload_2
    //   59: invokevirtual 91	java/io/ObjectInputStream:readBoolean	()Z
    //   62: invokevirtual 95	androidx/work/ContentUriTriggers:add	(Landroid/net/Uri;Z)V
    //   65: iinc 1 -1
    //   68: goto -25 -> 43
    //   71: aload_2
    //   72: invokevirtual 98	java/io/ObjectInputStream:close	()V
    //   75: goto +8 -> 83
    //   78: astore_0
    //   79: aload_0
    //   80: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   83: aload 4
    //   85: invokevirtual 102	java/io/ByteArrayInputStream:close	()V
    //   88: goto +51 -> 139
    //   91: astore_3
    //   92: goto +12 -> 104
    //   95: astore_2
    //   96: aconst_null
    //   97: astore_0
    //   98: goto +45 -> 143
    //   101: astore_3
    //   102: aconst_null
    //   103: astore_2
    //   104: aload_2
    //   105: astore_0
    //   106: aload_3
    //   107: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   110: aload_2
    //   111: ifnull +15 -> 126
    //   114: aload_2
    //   115: invokevirtual 98	java/io/ObjectInputStream:close	()V
    //   118: goto +8 -> 126
    //   121: astore_0
    //   122: aload_0
    //   123: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   126: aload 4
    //   128: invokevirtual 102	java/io/ByteArrayInputStream:close	()V
    //   131: goto +8 -> 139
    //   134: astore_0
    //   135: aload_0
    //   136: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   139: aload 5
    //   141: areturn
    //   142: astore_2
    //   143: aload_0
    //   144: ifnull +15 -> 159
    //   147: aload_0
    //   148: invokevirtual 98	java/io/ObjectInputStream:close	()V
    //   151: goto +8 -> 159
    //   154: astore_0
    //   155: aload_0
    //   156: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   159: aload 4
    //   161: invokevirtual 102	java/io/ByteArrayInputStream:close	()V
    //   164: goto +8 -> 172
    //   167: astore_0
    //   168: aload_0
    //   169: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   172: aload_2
    //   173: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	paramArrayOfByte	byte[]
    //   42	24	1	i	int
    //   29	43	2	localObjectInputStream	java.io.ObjectInputStream
    //   95	1	2	localObject1	Object
    //   103	12	2	localObject2	Object
    //   142	31	2	localObject3	Object
    //   91	1	3	localIOException1	java.io.IOException
    //   101	6	3	localIOException2	java.io.IOException
    //   24	136	4	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   7	133	5	localContentUriTriggers	androidx.work.ContentUriTriggers
    // Exception table:
    //   from	to	target	type
    //   71	75	78	java/io/IOException
    //   38	43	91	java/io/IOException
    //   49	65	91	java/io/IOException
    //   26	36	95	finally
    //   26	36	101	java/io/IOException
    //   114	118	121	java/io/IOException
    //   83	88	134	java/io/IOException
    //   126	131	134	java/io/IOException
    //   38	43	142	finally
    //   49	65	142	finally
    //   106	110	142	finally
    //   147	151	154	java/io/IOException
    //   159	164	167	java/io/IOException
  }
  
  /* Error */
  public static byte[] contentUriTriggersToByteArray(androidx.work.ContentUriTriggers paramContentUriTriggers)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 107	androidx/work/ContentUriTriggers:size	()I
    //   4: istore_1
    //   5: aconst_null
    //   6: astore 4
    //   8: aconst_null
    //   9: astore 5
    //   11: iload_1
    //   12: ifne +5 -> 17
    //   15: aconst_null
    //   16: areturn
    //   17: new 109	java/io/ByteArrayOutputStream
    //   20: dup
    //   21: invokespecial 110	java/io/ByteArrayOutputStream:<init>	()V
    //   24: astore 6
    //   26: aload 5
    //   28: astore_2
    //   29: new 112	java/io/ObjectOutputStream
    //   32: astore_3
    //   33: aload 5
    //   35: astore_2
    //   36: aload_3
    //   37: aload 6
    //   39: invokespecial 115	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   42: aload_3
    //   43: aload_0
    //   44: invokevirtual 107	androidx/work/ContentUriTriggers:size	()I
    //   47: invokevirtual 119	java/io/ObjectOutputStream:writeInt	(I)V
    //   50: aload_0
    //   51: invokevirtual 123	androidx/work/ContentUriTriggers:getTriggers	()Ljava/util/Set;
    //   54: invokeinterface 129 1 0
    //   59: astore_0
    //   60: aload_0
    //   61: invokeinterface 134 1 0
    //   66: ifeq +35 -> 101
    //   69: aload_0
    //   70: invokeinterface 138 1 0
    //   75: checkcast 140	androidx/work/ContentUriTriggers$Trigger
    //   78: astore_2
    //   79: aload_3
    //   80: aload_2
    //   81: invokevirtual 144	androidx/work/ContentUriTriggers$Trigger:getUri	()Landroid/net/Uri;
    //   84: invokevirtual 145	android/net/Uri:toString	()Ljava/lang/String;
    //   87: invokevirtual 148	java/io/ObjectOutputStream:writeUTF	(Ljava/lang/String;)V
    //   90: aload_3
    //   91: aload_2
    //   92: invokevirtual 151	androidx/work/ContentUriTriggers$Trigger:shouldTriggerForDescendants	()Z
    //   95: invokevirtual 155	java/io/ObjectOutputStream:writeBoolean	(Z)V
    //   98: goto -38 -> 60
    //   101: aload_3
    //   102: invokevirtual 156	java/io/ObjectOutputStream:close	()V
    //   105: goto +8 -> 113
    //   108: astore_0
    //   109: aload_0
    //   110: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   113: aload 6
    //   115: invokevirtual 157	java/io/ByteArrayOutputStream:close	()V
    //   118: goto +60 -> 178
    //   121: astore_0
    //   122: aload_3
    //   123: astore_2
    //   124: goto +60 -> 184
    //   127: astore_2
    //   128: aload_3
    //   129: astore_0
    //   130: aload_2
    //   131: astore_3
    //   132: goto +11 -> 143
    //   135: astore_0
    //   136: goto +48 -> 184
    //   139: astore_3
    //   140: aload 4
    //   142: astore_0
    //   143: aload_0
    //   144: astore_2
    //   145: aload_3
    //   146: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   149: aload_0
    //   150: ifnull +15 -> 165
    //   153: aload_0
    //   154: invokevirtual 156	java/io/ObjectOutputStream:close	()V
    //   157: goto +8 -> 165
    //   160: astore_0
    //   161: aload_0
    //   162: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   165: aload 6
    //   167: invokevirtual 157	java/io/ByteArrayOutputStream:close	()V
    //   170: goto +8 -> 178
    //   173: astore_0
    //   174: aload_0
    //   175: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   178: aload 6
    //   180: invokevirtual 161	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   183: areturn
    //   184: aload_2
    //   185: ifnull +15 -> 200
    //   188: aload_2
    //   189: invokevirtual 156	java/io/ObjectOutputStream:close	()V
    //   192: goto +8 -> 200
    //   195: astore_2
    //   196: aload_2
    //   197: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   200: aload 6
    //   202: invokevirtual 157	java/io/ByteArrayOutputStream:close	()V
    //   205: goto +8 -> 213
    //   208: astore_2
    //   209: aload_2
    //   210: invokevirtual 101	java/io/IOException:printStackTrace	()V
    //   213: aload_0
    //   214: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	paramContentUriTriggers	androidx.work.ContentUriTriggers
    //   4	8	1	i	int
    //   28	96	2	localObject1	Object
    //   127	4	2	localIOException1	java.io.IOException
    //   144	45	2	localContentUriTriggers	androidx.work.ContentUriTriggers
    //   195	2	2	localIOException2	java.io.IOException
    //   208	2	2	localIOException3	java.io.IOException
    //   32	100	3	localObject2	Object
    //   139	7	3	localIOException4	java.io.IOException
    //   6	135	4	localObject3	Object
    //   9	25	5	localObject4	Object
    //   24	177	6	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   101	105	108	java/io/IOException
    //   42	60	121	finally
    //   60	98	121	finally
    //   42	60	127	java/io/IOException
    //   60	98	127	java/io/IOException
    //   29	33	135	finally
    //   36	42	135	finally
    //   145	149	135	finally
    //   29	33	139	java/io/IOException
    //   36	42	139	java/io/IOException
    //   153	157	160	java/io/IOException
    //   113	118	173	java/io/IOException
    //   165	170	173	java/io/IOException
    //   188	192	195	java/io/IOException
    //   200	205	208	java/io/IOException
  }
  
  public static BackoffPolicy intToBackoffPolicy(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt == 1) {
        return BackoffPolicy.LINEAR;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not convert ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" to BackoffPolicy");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    return BackoffPolicy.EXPONENTIAL;
  }
  
  public static NetworkType intToNetworkType(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if ((Build.VERSION.SDK_INT >= 30) && (paramInt == 5)) {
                return NetworkType.TEMPORARILY_UNMETERED;
              }
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Could not convert ");
              localStringBuilder.append(paramInt);
              localStringBuilder.append(" to NetworkType");
              throw new IllegalArgumentException(localStringBuilder.toString());
            }
            return NetworkType.METERED;
          }
          return NetworkType.NOT_ROAMING;
        }
        return NetworkType.UNMETERED;
      }
      return NetworkType.CONNECTED;
    }
    return NetworkType.NOT_REQUIRED;
  }
  
  public static OutOfQuotaPolicy intToOutOfQuotaPolicy(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt == 1) {
        return OutOfQuotaPolicy.DROP_WORK_REQUEST;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not convert ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" to OutOfQuotaPolicy");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
  }
  
  public static WorkInfo.State intToState(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if (paramInt == 5) {
                return WorkInfo.State.CANCELLED;
              }
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Could not convert ");
              localStringBuilder.append(paramInt);
              localStringBuilder.append(" to State");
              throw new IllegalArgumentException(localStringBuilder.toString());
            }
            return WorkInfo.State.BLOCKED;
          }
          return WorkInfo.State.FAILED;
        }
        return WorkInfo.State.SUCCEEDED;
      }
      return WorkInfo.State.RUNNING;
    }
    return WorkInfo.State.ENQUEUED;
  }
  
  public static int networkTypeToInt(NetworkType paramNetworkType)
  {
    int i = 1.$SwitchMap$androidx$work$NetworkType[paramNetworkType.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5)
            {
              if ((Build.VERSION.SDK_INT >= 30) && (paramNetworkType == NetworkType.TEMPORARILY_UNMETERED)) {
                return 5;
              }
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Could not convert ");
              localStringBuilder.append(paramNetworkType);
              localStringBuilder.append(" to int");
              throw new IllegalArgumentException(localStringBuilder.toString());
            }
            return 4;
          }
          return 3;
        }
        return 2;
      }
      return 1;
    }
    return 0;
  }
  
  public static int outOfQuotaPolicyToInt(OutOfQuotaPolicy paramOutOfQuotaPolicy)
  {
    int i = 1.$SwitchMap$androidx$work$OutOfQuotaPolicy[paramOutOfQuotaPolicy.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        return 1;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not convert ");
      localStringBuilder.append(paramOutOfQuotaPolicy);
      localStringBuilder.append(" to int");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    return 0;
  }
  
  public static int stateToInt(WorkInfo.State paramState)
  {
    switch (1.$SwitchMap$androidx$work$WorkInfo$State[paramState.ordinal()])
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not convert ");
      localStringBuilder.append(paramState);
      localStringBuilder.append(" to int");
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 6: 
      return 5;
    case 5: 
      return 4;
    case 4: 
      return 3;
    case 3: 
      return 2;
    case 2: 
      return 1;
    }
    return 0;
  }
  
  public static abstract interface BackoffPolicyIds
  {
    public static final int EXPONENTIAL = 0;
    public static final int LINEAR = 1;
  }
  
  public static abstract interface NetworkTypeIds
  {
    public static final int CONNECTED = 1;
    public static final int METERED = 4;
    public static final int NOT_REQUIRED = 0;
    public static final int NOT_ROAMING = 3;
    public static final int TEMPORARILY_UNMETERED = 5;
    public static final int UNMETERED = 2;
  }
  
  public static abstract interface OutOfPolicyIds
  {
    public static final int DROP_WORK_REQUEST = 1;
    public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;
  }
  
  public static abstract interface StateIds
  {
    public static final int BLOCKED = 4;
    public static final int CANCELLED = 5;
    public static final String COMPLETED_STATES = "(2, 3, 5)";
    public static final int ENQUEUED = 0;
    public static final int FAILED = 3;
    public static final int RUNNING = 1;
    public static final int SUCCEEDED = 2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\WorkTypeConverters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */