package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzako
{
  /* Error */
  public static X509Certificate[][] zza(String paramString)
    throws zzakl, SecurityException, IOException
  {
    // Byte code:
    //   0: new 14	java/io/RandomAccessFile
    //   3: dup
    //   4: aload_0
    //   5: ldc 16
    //   7: invokespecial 20	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   10: astore_0
    //   11: aload_0
    //   12: invokestatic 26	com/google/android/gms/internal/ads/zzakp:zzc	(Ljava/io/RandomAccessFile;)Landroid/util/Pair;
    //   15: astore 16
    //   17: aload 16
    //   19: ifnull +1225 -> 1244
    //   22: aload 16
    //   24: getfield 32	android/util/Pair:first	Ljava/lang/Object;
    //   27: checkcast 34	java/nio/ByteBuffer
    //   30: astore 15
    //   32: aload 16
    //   34: getfield 37	android/util/Pair:second	Ljava/lang/Object;
    //   37: checkcast 39	java/lang/Long
    //   40: invokevirtual 43	java/lang/Long:longValue	()J
    //   43: lstore 5
    //   45: ldc2_w 44
    //   48: lload 5
    //   50: ladd
    //   51: lstore 7
    //   53: lload 7
    //   55: lconst_0
    //   56: lcmp
    //   57: ifge +6 -> 63
    //   60: goto +18 -> 78
    //   63: aload_0
    //   64: lload 7
    //   66: invokevirtual 49	java/io/RandomAccessFile:seek	(J)V
    //   69: aload_0
    //   70: invokevirtual 53	java/io/RandomAccessFile:readInt	()I
    //   73: ldc 54
    //   75: if_icmpeq +1154 -> 1229
    //   78: aload 15
    //   80: invokestatic 57	com/google/android/gms/internal/ads/zzakp:zza	(Ljava/nio/ByteBuffer;)J
    //   83: lstore 7
    //   85: lload 7
    //   87: lload 5
    //   89: lcmp
    //   90: ifge +1079 -> 1169
    //   93: aload 15
    //   95: invokestatic 60	com/google/android/gms/internal/ads/zzakp:zzb	(Ljava/nio/ByteBuffer;)J
    //   98: lload 7
    //   100: ladd
    //   101: lload 5
    //   103: lcmp
    //   104: ifne +1050 -> 1154
    //   107: lload 7
    //   109: ldc2_w 61
    //   112: lcmp
    //   113: iflt +997 -> 1110
    //   116: bipush 24
    //   118: invokestatic 66	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   121: astore 16
    //   123: aload 16
    //   125: getstatic 72	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   128: invokevirtual 76	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   131: pop
    //   132: aload_0
    //   133: lload 7
    //   135: aload 16
    //   137: invokevirtual 79	java/nio/ByteBuffer:capacity	()I
    //   140: i2l
    //   141: lsub
    //   142: invokevirtual 49	java/io/RandomAccessFile:seek	(J)V
    //   145: aload_0
    //   146: aload 16
    //   148: invokevirtual 83	java/nio/ByteBuffer:array	()[B
    //   151: aload 16
    //   153: invokevirtual 86	java/nio/ByteBuffer:arrayOffset	()I
    //   156: aload 16
    //   158: invokevirtual 79	java/nio/ByteBuffer:capacity	()I
    //   161: invokevirtual 90	java/io/RandomAccessFile:readFully	([BII)V
    //   164: aload 16
    //   166: bipush 8
    //   168: invokevirtual 94	java/nio/ByteBuffer:getLong	(I)J
    //   171: ldc2_w 95
    //   174: lcmp
    //   175: ifne +920 -> 1095
    //   178: aload 16
    //   180: bipush 16
    //   182: invokevirtual 94	java/nio/ByteBuffer:getLong	(I)J
    //   185: ldc2_w 97
    //   188: lcmp
    //   189: ifne +906 -> 1095
    //   192: iconst_0
    //   193: istore_1
    //   194: aload 16
    //   196: iconst_0
    //   197: invokevirtual 94	java/nio/ByteBuffer:getLong	(I)J
    //   200: lstore 11
    //   202: lload 11
    //   204: aload 16
    //   206: invokevirtual 79	java/nio/ByteBuffer:capacity	()I
    //   209: i2l
    //   210: lcmp
    //   211: iflt +840 -> 1051
    //   214: lload 11
    //   216: ldc2_w 99
    //   219: lcmp
    //   220: ifgt +831 -> 1051
    //   223: ldc2_w 101
    //   226: lload 11
    //   228: ladd
    //   229: l2i
    //   230: istore_2
    //   231: lload 7
    //   233: iload_2
    //   234: i2l
    //   235: lsub
    //   236: lstore 13
    //   238: lload 13
    //   240: lconst_0
    //   241: lcmp
    //   242: iflt +765 -> 1007
    //   245: iload_2
    //   246: invokestatic 66	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   249: astore 16
    //   251: aload 16
    //   253: getstatic 72	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   256: invokevirtual 76	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   259: pop
    //   260: aload_0
    //   261: lload 13
    //   263: invokevirtual 49	java/io/RandomAccessFile:seek	(J)V
    //   266: aload_0
    //   267: aload 16
    //   269: invokevirtual 83	java/nio/ByteBuffer:array	()[B
    //   272: aload 16
    //   274: invokevirtual 86	java/nio/ByteBuffer:arrayOffset	()I
    //   277: aload 16
    //   279: invokevirtual 79	java/nio/ByteBuffer:capacity	()I
    //   282: invokevirtual 90	java/io/RandomAccessFile:readFully	([BII)V
    //   285: aload 16
    //   287: iconst_0
    //   288: invokevirtual 94	java/nio/ByteBuffer:getLong	(I)J
    //   291: lstore 9
    //   293: lload 9
    //   295: lload 11
    //   297: lcmp
    //   298: ifne +649 -> 947
    //   301: aload 16
    //   303: lload 13
    //   305: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   308: invokestatic 110	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   311: astore 17
    //   313: aload 17
    //   315: getfield 32	android/util/Pair:first	Ljava/lang/Object;
    //   318: checkcast 34	java/nio/ByteBuffer
    //   321: astore 16
    //   323: aload 17
    //   325: getfield 37	android/util/Pair:second	Ljava/lang/Object;
    //   328: checkcast 39	java/lang/Long
    //   331: invokevirtual 43	java/lang/Long:longValue	()J
    //   334: lstore 9
    //   336: aload 16
    //   338: invokevirtual 113	java/nio/ByteBuffer:order	()Ljava/nio/ByteOrder;
    //   341: getstatic 72	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   344: if_acmpne +588 -> 932
    //   347: aload 16
    //   349: invokevirtual 79	java/nio/ByteBuffer:capacity	()I
    //   352: bipush 24
    //   354: isub
    //   355: istore_2
    //   356: iload_2
    //   357: bipush 8
    //   359: if_icmplt +514 -> 873
    //   362: aload 16
    //   364: invokevirtual 79	java/nio/ByteBuffer:capacity	()I
    //   367: istore_3
    //   368: iload_2
    //   369: aload 16
    //   371: invokevirtual 79	java/nio/ByteBuffer:capacity	()I
    //   374: if_icmpgt +441 -> 815
    //   377: aload 16
    //   379: invokevirtual 116	java/nio/ByteBuffer:limit	()I
    //   382: istore 4
    //   384: aload 16
    //   386: invokevirtual 119	java/nio/ByteBuffer:position	()I
    //   389: istore_3
    //   390: aload 16
    //   392: iconst_0
    //   393: invokevirtual 122	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   396: pop
    //   397: aload 16
    //   399: iload_2
    //   400: invokevirtual 124	java/nio/ByteBuffer:limit	(I)Ljava/nio/Buffer;
    //   403: pop
    //   404: aload 16
    //   406: bipush 8
    //   408: invokevirtual 122	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   411: pop
    //   412: aload 16
    //   414: invokevirtual 128	java/nio/ByteBuffer:slice	()Ljava/nio/ByteBuffer;
    //   417: astore 17
    //   419: aload 17
    //   421: aload 16
    //   423: invokevirtual 113	java/nio/ByteBuffer:order	()Ljava/nio/ByteOrder;
    //   426: invokevirtual 76	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   429: pop
    //   430: aload 16
    //   432: iconst_0
    //   433: invokevirtual 122	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   436: pop
    //   437: aload 16
    //   439: iload 4
    //   441: invokevirtual 124	java/nio/ByteBuffer:limit	(I)Ljava/nio/Buffer;
    //   444: pop
    //   445: aload 16
    //   447: iload_3
    //   448: invokevirtual 122	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   451: pop
    //   452: aload 17
    //   454: invokevirtual 132	java/nio/ByteBuffer:hasRemaining	()Z
    //   457: ifeq +316 -> 773
    //   460: iinc 1 1
    //   463: aload 17
    //   465: invokevirtual 135	java/nio/ByteBuffer:remaining	()I
    //   468: bipush 8
    //   470: if_icmplt +260 -> 730
    //   473: aload 17
    //   475: invokevirtual 137	java/nio/ByteBuffer:getLong	()J
    //   478: lstore 11
    //   480: lload 11
    //   482: ldc2_w 138
    //   485: lcmp
    //   486: iflt +185 -> 671
    //   489: lload 11
    //   491: ldc2_w 140
    //   494: lcmp
    //   495: ifgt +176 -> 671
    //   498: aload 17
    //   500: invokevirtual 119	java/nio/ByteBuffer:position	()I
    //   503: istore_3
    //   504: lload 11
    //   506: l2i
    //   507: istore_2
    //   508: iload_2
    //   509: aload 17
    //   511: invokevirtual 135	java/nio/ByteBuffer:remaining	()I
    //   514: if_icmpgt +78 -> 592
    //   517: aload 17
    //   519: invokevirtual 144	java/nio/ByteBuffer:getInt	()I
    //   522: ldc -111
    //   524: if_icmpne +56 -> 580
    //   527: aload 17
    //   529: iload_2
    //   530: iconst_4
    //   531: isub
    //   532: invokestatic 149	com/google/android/gms/internal/ads/zzako:zze	(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;
    //   535: astore 17
    //   537: new 151	com/google/android/gms/internal/ads/zzakk
    //   540: astore 16
    //   542: aload 16
    //   544: aload 17
    //   546: lload 9
    //   548: lload 7
    //   550: lload 5
    //   552: aload 15
    //   554: aconst_null
    //   555: invokespecial 154	com/google/android/gms/internal/ads/zzakk:<init>	(Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;Lcom/google/android/gms/internal/ads/zzakj;)V
    //   558: aload_0
    //   559: invokevirtual 158	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   562: aload 16
    //   564: invokestatic 162	com/google/android/gms/internal/ads/zzako:zzl	(Ljava/nio/channels/FileChannel;Lcom/google/android/gms/internal/ads/zzakk;)[[Ljava/security/cert/X509Certificate;
    //   567: astore 15
    //   569: aload_0
    //   570: invokevirtual 166	java/io/RandomAccessFile:close	()V
    //   573: aload_0
    //   574: invokevirtual 166	java/io/RandomAccessFile:close	()V
    //   577: aload 15
    //   579: areturn
    //   580: aload 17
    //   582: iload_3
    //   583: iload_2
    //   584: iadd
    //   585: invokevirtual 122	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   588: pop
    //   589: goto -137 -> 452
    //   592: new 8	com/google/android/gms/internal/ads/zzakl
    //   595: astore 15
    //   597: aload 17
    //   599: invokevirtual 135	java/nio/ByteBuffer:remaining	()I
    //   602: istore_3
    //   603: new 168	java/lang/StringBuilder
    //   606: astore 16
    //   608: aload 16
    //   610: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   613: aload 16
    //   615: ldc -84
    //   617: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   620: pop
    //   621: aload 16
    //   623: iload_1
    //   624: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   627: pop
    //   628: aload 16
    //   630: ldc -75
    //   632: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: pop
    //   636: aload 16
    //   638: iload_2
    //   639: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   642: pop
    //   643: aload 16
    //   645: ldc -73
    //   647: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   650: pop
    //   651: aload 16
    //   653: iload_3
    //   654: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   657: pop
    //   658: aload 15
    //   660: aload 16
    //   662: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   665: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   668: aload 15
    //   670: athrow
    //   671: new 8	com/google/android/gms/internal/ads/zzakl
    //   674: astore 16
    //   676: new 168	java/lang/StringBuilder
    //   679: astore 15
    //   681: aload 15
    //   683: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   686: aload 15
    //   688: ldc -84
    //   690: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   693: pop
    //   694: aload 15
    //   696: iload_1
    //   697: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   700: pop
    //   701: aload 15
    //   703: ldc -75
    //   705: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   708: pop
    //   709: aload 15
    //   711: lload 11
    //   713: invokevirtual 193	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   716: pop
    //   717: aload 16
    //   719: aload 15
    //   721: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   724: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   727: aload 16
    //   729: athrow
    //   730: new 8	com/google/android/gms/internal/ads/zzakl
    //   733: astore 16
    //   735: new 168	java/lang/StringBuilder
    //   738: astore 15
    //   740: aload 15
    //   742: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   745: aload 15
    //   747: ldc -61
    //   749: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   752: pop
    //   753: aload 15
    //   755: iload_1
    //   756: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   759: pop
    //   760: aload 16
    //   762: aload 15
    //   764: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   767: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   770: aload 16
    //   772: athrow
    //   773: new 8	com/google/android/gms/internal/ads/zzakl
    //   776: astore 15
    //   778: aload 15
    //   780: ldc -59
    //   782: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   785: aload 15
    //   787: athrow
    //   788: astore 15
    //   790: aload 16
    //   792: iconst_0
    //   793: invokevirtual 122	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   796: pop
    //   797: aload 16
    //   799: iload 4
    //   801: invokevirtual 124	java/nio/ByteBuffer:limit	(I)Ljava/nio/Buffer;
    //   804: pop
    //   805: aload 16
    //   807: iload_3
    //   808: invokevirtual 122	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   811: pop
    //   812: aload 15
    //   814: athrow
    //   815: new 199	java/lang/IllegalArgumentException
    //   818: astore 15
    //   820: new 168	java/lang/StringBuilder
    //   823: astore 16
    //   825: aload 16
    //   827: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   830: aload 16
    //   832: ldc -55
    //   834: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   837: pop
    //   838: aload 16
    //   840: iload_2
    //   841: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   844: pop
    //   845: aload 16
    //   847: ldc -53
    //   849: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   852: pop
    //   853: aload 16
    //   855: iload_3
    //   856: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   859: pop
    //   860: aload 15
    //   862: aload 16
    //   864: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   867: invokespecial 204	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   870: aload 15
    //   872: athrow
    //   873: new 199	java/lang/IllegalArgumentException
    //   876: astore 15
    //   878: new 168	java/lang/StringBuilder
    //   881: astore 16
    //   883: aload 16
    //   885: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   888: aload 16
    //   890: ldc -50
    //   892: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   895: pop
    //   896: aload 16
    //   898: iload_2
    //   899: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   902: pop
    //   903: aload 16
    //   905: ldc -48
    //   907: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   910: pop
    //   911: aload 16
    //   913: bipush 8
    //   915: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   918: pop
    //   919: aload 15
    //   921: aload 16
    //   923: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   926: invokespecial 204	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   929: aload 15
    //   931: athrow
    //   932: new 199	java/lang/IllegalArgumentException
    //   935: astore 15
    //   937: aload 15
    //   939: ldc -46
    //   941: invokespecial 204	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   944: aload 15
    //   946: athrow
    //   947: new 8	com/google/android/gms/internal/ads/zzakl
    //   950: astore 16
    //   952: new 168	java/lang/StringBuilder
    //   955: astore 15
    //   957: aload 15
    //   959: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   962: aload 15
    //   964: ldc -44
    //   966: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   969: pop
    //   970: aload 15
    //   972: lload 9
    //   974: invokevirtual 193	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   977: pop
    //   978: aload 15
    //   980: ldc -42
    //   982: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   985: pop
    //   986: aload 15
    //   988: lload 11
    //   990: invokevirtual 193	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   993: pop
    //   994: aload 16
    //   996: aload 15
    //   998: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1001: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   1004: aload 16
    //   1006: athrow
    //   1007: new 8	com/google/android/gms/internal/ads/zzakl
    //   1010: astore 16
    //   1012: new 168	java/lang/StringBuilder
    //   1015: astore 15
    //   1017: aload 15
    //   1019: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   1022: aload 15
    //   1024: ldc -40
    //   1026: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1029: pop
    //   1030: aload 15
    //   1032: lload 13
    //   1034: invokevirtual 193	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1037: pop
    //   1038: aload 16
    //   1040: aload 15
    //   1042: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1045: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   1048: aload 16
    //   1050: athrow
    //   1051: new 8	com/google/android/gms/internal/ads/zzakl
    //   1054: astore 16
    //   1056: new 168	java/lang/StringBuilder
    //   1059: astore 15
    //   1061: aload 15
    //   1063: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   1066: aload 15
    //   1068: ldc -38
    //   1070: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1073: pop
    //   1074: aload 15
    //   1076: lload 11
    //   1078: invokevirtual 193	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1081: pop
    //   1082: aload 16
    //   1084: aload 15
    //   1086: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1089: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   1092: aload 16
    //   1094: athrow
    //   1095: new 8	com/google/android/gms/internal/ads/zzakl
    //   1098: astore 15
    //   1100: aload 15
    //   1102: ldc -36
    //   1104: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   1107: aload 15
    //   1109: athrow
    //   1110: new 8	com/google/android/gms/internal/ads/zzakl
    //   1113: astore 16
    //   1115: new 168	java/lang/StringBuilder
    //   1118: astore 15
    //   1120: aload 15
    //   1122: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   1125: aload 15
    //   1127: ldc -34
    //   1129: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1132: pop
    //   1133: aload 15
    //   1135: lload 7
    //   1137: invokevirtual 193	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1140: pop
    //   1141: aload 16
    //   1143: aload 15
    //   1145: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1148: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   1151: aload 16
    //   1153: athrow
    //   1154: new 8	com/google/android/gms/internal/ads/zzakl
    //   1157: astore 15
    //   1159: aload 15
    //   1161: ldc -32
    //   1163: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   1166: aload 15
    //   1168: athrow
    //   1169: new 8	com/google/android/gms/internal/ads/zzakl
    //   1172: astore 16
    //   1174: new 168	java/lang/StringBuilder
    //   1177: astore 15
    //   1179: aload 15
    //   1181: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   1184: aload 15
    //   1186: ldc -30
    //   1188: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1191: pop
    //   1192: aload 15
    //   1194: lload 7
    //   1196: invokevirtual 193	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1199: pop
    //   1200: aload 15
    //   1202: ldc -28
    //   1204: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1207: pop
    //   1208: aload 15
    //   1210: lload 5
    //   1212: invokevirtual 193	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1215: pop
    //   1216: aload 16
    //   1218: aload 15
    //   1220: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1223: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   1226: aload 16
    //   1228: athrow
    //   1229: new 8	com/google/android/gms/internal/ads/zzakl
    //   1232: astore 15
    //   1234: aload 15
    //   1236: ldc -26
    //   1238: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   1241: aload 15
    //   1243: athrow
    //   1244: new 8	com/google/android/gms/internal/ads/zzakl
    //   1247: astore 15
    //   1249: aload_0
    //   1250: invokevirtual 233	java/io/RandomAccessFile:length	()J
    //   1253: lstore 5
    //   1255: new 168	java/lang/StringBuilder
    //   1258: astore 16
    //   1260: aload 16
    //   1262: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   1265: aload 16
    //   1267: ldc -21
    //   1269: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1272: pop
    //   1273: aload 16
    //   1275: lload 5
    //   1277: invokevirtual 193	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1280: pop
    //   1281: aload 16
    //   1283: ldc -19
    //   1285: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1288: pop
    //   1289: aload 15
    //   1291: aload 16
    //   1293: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1296: invokespecial 190	com/google/android/gms/internal/ads/zzakl:<init>	(Ljava/lang/String;)V
    //   1299: aload 15
    //   1301: athrow
    //   1302: astore 15
    //   1304: aload_0
    //   1305: invokevirtual 166	java/io/RandomAccessFile:close	()V
    //   1308: aload 15
    //   1310: athrow
    //   1311: astore_0
    //   1312: goto -735 -> 577
    //   1315: astore_0
    //   1316: goto -8 -> 1308
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1319	0	paramString	String
    //   193	563	1	i	int
    //   230	669	2	j	int
    //   367	489	3	k	int
    //   382	418	4	m	int
    //   43	1233	5	l1	long
    //   51	1144	7	l2	long
    //   291	682	9	l3	long
    //   200	877	11	l4	long
    //   236	797	13	l5	long
    //   30	756	15	localObject1	Object
    //   788	25	15	localObject2	Object
    //   818	482	15	localObject3	Object
    //   1302	7	15	localObject4	Object
    //   15	1277	16	localObject5	Object
    //   311	287	17	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   390	430	788	finally
    //   11	17	1302	finally
    //   22	45	1302	finally
    //   63	78	1302	finally
    //   78	85	1302	finally
    //   93	107	1302	finally
    //   116	192	1302	finally
    //   194	214	1302	finally
    //   245	293	1302	finally
    //   301	356	1302	finally
    //   362	390	1302	finally
    //   430	452	1302	finally
    //   452	460	1302	finally
    //   463	480	1302	finally
    //   498	504	1302	finally
    //   508	573	1302	finally
    //   580	589	1302	finally
    //   592	671	1302	finally
    //   671	730	1302	finally
    //   730	773	1302	finally
    //   773	788	1302	finally
    //   790	815	1302	finally
    //   815	873	1302	finally
    //   873	932	1302	finally
    //   932	947	1302	finally
    //   947	1007	1302	finally
    //   1007	1051	1302	finally
    //   1051	1095	1302	finally
    //   1095	1110	1302	finally
    //   1110	1154	1302	finally
    //   1154	1169	1302	finally
    //   1169	1229	1302	finally
    //   1229	1244	1302	finally
    //   1244	1302	1302	finally
    //   573	577	1311	java/io/IOException
    //   1304	1308	1315	java/io/IOException
  }
  
  private static int zzb(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt == 2) {
        return 64;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown content digest algorthm: ");
      localStringBuilder.append(paramInt);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    return 32;
  }
  
  private static int zzc(int paramInt)
  {
    if (paramInt != 513) {
      if (paramInt != 514)
      {
        if (paramInt == 769) {}
      }
      else {
        switch (paramInt)
        {
        default: 
          throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(paramInt))));
        case 258: 
        case 260: 
          return 2;
        }
      }
    }
    return 1;
  }
  
  private static String zzd(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt == 2) {
        return "SHA-512";
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown content digest algorthm: ");
      localStringBuilder.append(paramInt);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    return "SHA-256";
  }
  
  private static ByteBuffer zze(ByteBuffer paramByteBuffer, int paramInt)
    throws BufferUnderflowException
  {
    int j = paramByteBuffer.limit();
    int i = paramByteBuffer.position();
    paramInt += i;
    if ((paramInt >= i) && (paramInt <= j))
    {
      paramByteBuffer.limit(paramInt);
      try
      {
        ByteBuffer localByteBuffer = paramByteBuffer.slice();
        localByteBuffer.order(paramByteBuffer.order());
        paramByteBuffer.position(paramInt);
        return localByteBuffer;
      }
      finally
      {
        paramByteBuffer.limit(j);
      }
    }
    throw new BufferUnderflowException();
  }
  
  private static ByteBuffer zzf(ByteBuffer paramByteBuffer)
    throws IOException
  {
    if (paramByteBuffer.remaining() >= 4)
    {
      i = paramByteBuffer.getInt();
      if (i >= 0)
      {
        if (i <= paramByteBuffer.remaining()) {
          return zze(paramByteBuffer, i);
        }
        int j = paramByteBuffer.remaining();
        paramByteBuffer = new StringBuilder();
        paramByteBuffer.append("Length-prefixed field longer than remaining buffer. Field length: ");
        paramByteBuffer.append(i);
        paramByteBuffer.append(", remaining: ");
        paramByteBuffer.append(j);
        throw new IOException(paramByteBuffer.toString());
      }
      throw new IllegalArgumentException("Negative length");
    }
    int i = paramByteBuffer.remaining();
    paramByteBuffer = new StringBuilder();
    paramByteBuffer.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
    paramByteBuffer.append(i);
    throw new IOException(paramByteBuffer.toString());
  }
  
  private static void zzg(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    paramArrayOfByte[1] = ((byte)(paramInt1 & 0xFF));
    paramArrayOfByte[2] = ((byte)(paramInt1 >>> 8 & 0xFF));
    paramArrayOfByte[3] = ((byte)(paramInt1 >>> 16 & 0xFF));
    paramArrayOfByte[4] = ((byte)(paramInt1 >> 24));
  }
  
  private static void zzh(Map paramMap, FileChannel paramFileChannel, long paramLong1, long paramLong2, long paramLong3, ByteBuffer paramByteBuffer)
    throws SecurityException
  {
    if (!paramMap.isEmpty())
    {
      zzaki localzzaki = new zzaki(paramFileChannel, 0L, paramLong1);
      paramFileChannel = new zzaki(paramFileChannel, paramLong2, paramLong3 - paramLong2);
      paramByteBuffer = paramByteBuffer.duplicate();
      paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      zzakp.zzd(paramByteBuffer, paramLong1);
      zzakg localzzakg = new zzakg(paramByteBuffer);
      int k = paramMap.size();
      paramByteBuffer = new int[k];
      Iterator localIterator = paramMap.keySet().iterator();
      int j = 0;
      for (int i = 0; localIterator.hasNext(); i++) {
        paramByteBuffer[i] = ((Integer)localIterator.next()).intValue();
      }
      try
      {
        paramFileChannel = zzk(paramByteBuffer, new zzakh[] { localzzaki, paramFileChannel, localzzakg });
        i = j;
        while (i < k)
        {
          j = paramByteBuffer[i];
          if (MessageDigest.isEqual((byte[])paramMap.get(Integer.valueOf(j)), paramFileChannel[i])) {
            i++;
          } else {
            throw new SecurityException(zzd(j).concat(" digest of contents did not verify"));
          }
        }
        return;
      }
      catch (DigestException paramMap)
      {
        throw new SecurityException("Failed to compute digest(s) of contents", paramMap);
      }
    }
    throw new SecurityException("No digests provided");
  }
  
  private static byte[] zzi(ByteBuffer paramByteBuffer)
    throws IOException
  {
    int i = paramByteBuffer.getInt();
    if (i >= 0)
    {
      if (i <= paramByteBuffer.remaining())
      {
        byte[] arrayOfByte = new byte[i];
        paramByteBuffer.get(arrayOfByte);
        return arrayOfByte;
      }
      int j = paramByteBuffer.remaining();
      paramByteBuffer = new StringBuilder();
      paramByteBuffer.append("Underflow while reading length-prefixed value. Length: ");
      paramByteBuffer.append(i);
      paramByteBuffer.append(", available: ");
      paramByteBuffer.append(j);
      throw new IOException(paramByteBuffer.toString());
    }
    throw new IOException("Negative length");
  }
  
  private static X509Certificate[] zzj(ByteBuffer paramByteBuffer, Map paramMap, CertificateFactory paramCertificateFactory)
    throws SecurityException, IOException
  {
    ByteBuffer localByteBuffer2 = zzf(paramByteBuffer);
    Object localObject1 = zzf(paramByteBuffer);
    byte[] arrayOfByte = zzi(paramByteBuffer);
    ArrayList localArrayList = new ArrayList();
    ByteBuffer localByteBuffer1 = null;
    Object localObject2 = null;
    int i = -1;
    int j = 0;
    int k;
    int m;
    for (;;)
    {
      if (!((ByteBuffer)localObject1).hasRemaining()) {
        break label262;
      }
      k = j + 1;
      try
      {
        paramByteBuffer = zzf((ByteBuffer)localObject1);
        if (paramByteBuffer.remaining() >= 8)
        {
          m = paramByteBuffer.getInt();
          localArrayList.add(Integer.valueOf(m));
          if ((m != 513) && (m != 514) && (m != 769)) {}
          switch (m)
          {
          default: 
            j = k;
            break;
          case 257: 
          case 258: 
          case 259: 
          case 260: 
            if (i != -1)
            {
              int n = zzc(m);
              int i1 = zzc(i);
              j = k;
              if (n == 1) {
                continue;
              }
              if (i1 != 1)
              {
                j = k;
                continue;
              }
            }
            localObject2 = zzi(paramByteBuffer);
            i = m;
            j = k;
            break;
          }
        }
        else
        {
          paramByteBuffer = new java/lang/SecurityException;
          paramByteBuffer.<init>("Signature record too short");
          throw paramByteBuffer;
        }
      }
      catch (BufferUnderflowException paramByteBuffer) {}catch (IOException paramByteBuffer) {}
    }
    paramMap = new StringBuilder();
    paramMap.append("Failed to parse signature record #");
    paramMap.append(k);
    throw new SecurityException(paramMap.toString(), paramByteBuffer);
    label262:
    if (i == -1)
    {
      if (j == 0) {
        throw new SecurityException("No signatures found");
      }
      throw new SecurityException("No supported signatures found");
    }
    if ((i != 513) && (i != 514))
    {
      if (i != 769)
      {
        switch (i)
        {
        default: 
          throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
        localObject1 = "RSA";
      }
      else
      {
        localObject1 = "DSA";
      }
    }
    else {
      localObject1 = "EC";
    }
    if (i != 513)
    {
      if (i != 514)
      {
        if (i != 769) {
          switch (i)
          {
          default: 
            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
          case 260: 
            paramByteBuffer = Pair.create("SHA512withRSA", null);
            break;
          case 259: 
            paramByteBuffer = Pair.create("SHA256withRSA", null);
            break;
          case 258: 
            paramByteBuffer = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
            break;
          case 257: 
            paramByteBuffer = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
            break;
          }
        } else {
          paramByteBuffer = Pair.create("SHA256withDSA", null);
        }
      }
      else {
        paramByteBuffer = Pair.create("SHA512withECDSA", null);
      }
    }
    else {
      paramByteBuffer = Pair.create("SHA256withECDSA", null);
    }
    String str = (String)paramByteBuffer.first;
    paramByteBuffer = (AlgorithmParameterSpec)paramByteBuffer.second;
    try
    {
      localObject1 = KeyFactory.getInstance((String)localObject1);
      Object localObject3 = new java/security/spec/X509EncodedKeySpec;
      ((X509EncodedKeySpec)localObject3).<init>(arrayOfByte);
      localObject3 = ((KeyFactory)localObject1).generatePublic((KeySpec)localObject3);
      localObject1 = Signature.getInstance(str);
      ((Signature)localObject1).initVerify((PublicKey)localObject3);
      if (paramByteBuffer != null) {
        ((Signature)localObject1).setParameter(paramByteBuffer);
      }
      ((Signature)localObject1).update(localByteBuffer2);
      boolean bool = ((Signature)localObject1).verify((byte[])localObject2);
      if (bool)
      {
        localByteBuffer2.clear();
        localObject2 = zzf(localByteBuffer2);
        localObject1 = new ArrayList();
        j = 0;
        paramByteBuffer = localByteBuffer1;
        for (;;)
        {
          if (!((ByteBuffer)localObject2).hasRemaining()) {
            break label821;
          }
          k = j + 1;
          try
          {
            localByteBuffer1 = zzf((ByteBuffer)localObject2);
            if (localByteBuffer1.remaining() >= 8)
            {
              m = localByteBuffer1.getInt();
              ((List)localObject1).add(Integer.valueOf(m));
              j = k;
              if (m == i)
              {
                paramByteBuffer = zzi(localByteBuffer1);
                j = k;
              }
            }
            else
            {
              paramByteBuffer = new java/io/IOException;
              paramByteBuffer.<init>("Record too short");
              throw paramByteBuffer;
            }
          }
          catch (BufferUnderflowException paramByteBuffer) {}catch (IOException paramByteBuffer) {}
        }
        paramMap = new StringBuilder();
        paramMap.append("Failed to parse digest record #");
        paramMap.append(k);
        throw new IOException(paramMap.toString(), paramByteBuffer);
        label821:
        if (localArrayList.equals(localObject1))
        {
          i = zzc(i);
          paramMap = (byte[])paramMap.put(Integer.valueOf(i), paramByteBuffer);
          if ((paramMap != null) && (!MessageDigest.isEqual(paramMap, paramByteBuffer))) {
            throw new SecurityException(zzd(i).concat(" contents digest does not match the digest specified by a preceding signer"));
          }
          paramMap = zzf(localByteBuffer2);
          localObject1 = new ArrayList();
          i = 0;
          while (paramMap.hasRemaining())
          {
            i++;
            paramByteBuffer = zzi(paramMap);
            try
            {
              localObject2 = new java/io/ByteArrayInputStream;
              ((ByteArrayInputStream)localObject2).<init>(paramByteBuffer);
              localObject2 = (X509Certificate)paramCertificateFactory.generateCertificate((InputStream)localObject2);
              ((List)localObject1).add(new zzakm((X509Certificate)localObject2, paramByteBuffer));
            }
            catch (CertificateException paramByteBuffer)
            {
              paramMap = new StringBuilder();
              paramMap.append("Failed to decode certificate #");
              paramMap.append(i);
              throw new SecurityException(paramMap.toString(), paramByteBuffer);
            }
          }
          if (!((List)localObject1).isEmpty())
          {
            if (Arrays.equals(arrayOfByte, ((X509Certificate)((List)localObject1).get(0)).getPublicKey().getEncoded())) {
              return (X509Certificate[])((List)localObject1).toArray(new X509Certificate[((List)localObject1).size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
          }
          throw new SecurityException("No certificates listed");
        }
        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
      }
      throw new SecurityException(String.valueOf(str).concat(" signature did not verify"));
    }
    catch (SignatureException paramByteBuffer) {}catch (InvalidAlgorithmParameterException paramByteBuffer) {}catch (InvalidKeyException paramByteBuffer) {}catch (InvalidKeySpecException paramByteBuffer) {}catch (NoSuchAlgorithmException paramByteBuffer) {}
    paramMap = new StringBuilder();
    paramMap.append("Failed to verify ");
    paramMap.append(str);
    paramMap.append(" signature");
    throw new SecurityException(paramMap.toString(), paramByteBuffer);
  }
  
  private static byte[][] zzk(int[] paramArrayOfInt, zzakh[] paramArrayOfzzakh)
    throws DigestException
  {
    int j = 0;
    long l1 = 0L;
    for (int i = 0; i < 3; i++) {
      l1 += (paramArrayOfzzakh[i].zza() + 1048575L) / 1048576L;
    }
    if (l1 < 2097151L)
    {
      byte[][] arrayOfByte = new byte[paramArrayOfInt.length][];
      int m;
      for (i = 0;; i++)
      {
        m = paramArrayOfInt.length;
        if (i >= m) {
          break;
        }
        k = (int)l1;
        localObject1 = new byte[zzb(paramArrayOfInt[i]) * k + 5];
        localObject1[0] = 90;
        zzg(k, (byte[])localObject1, 1);
        arrayOfByte[i] = localObject1;
      }
      byte[] arrayOfByte1 = new byte[5];
      arrayOfByte1[0] = -91;
      Object localObject1 = new MessageDigest[m];
      i = 0;
      while (i < paramArrayOfInt.length)
      {
        localObject2 = zzd(paramArrayOfInt[i]);
        try
        {
          localObject1[i] = MessageDigest.getInstance((String)localObject2);
          i++;
        }
        catch (NoSuchAlgorithmException paramArrayOfInt)
        {
          throw new RuntimeException(((String)localObject2).concat(" digest not supported"), paramArrayOfInt);
        }
      }
      i = 0;
      int k = 0;
      while (i < 3)
      {
        localObject2 = paramArrayOfzzakh[i];
        long l2 = ((zzakh)localObject2).zza();
        l1 = 0L;
        while (l2 > 0L)
        {
          int i1 = (int)Math.min(l2, 1048576L);
          zzg(i1, arrayOfByte1, 1);
          for (int n = 0; n < m; n++) {
            localObject1[n].update(arrayOfByte1);
          }
          try
          {
            ((zzakh)localObject2).zzb((MessageDigest[])localObject1, l1, i1);
            n = 0;
            while (n < paramArrayOfInt.length)
            {
              int i2 = paramArrayOfInt[n];
              byte[] arrayOfByte2 = arrayOfByte[n];
              int i3 = zzb(i2);
              Object localObject3 = localObject1[n];
              i2 = ((MessageDigest)localObject3).digest(arrayOfByte2, k * i3 + 5, i3);
              if (i2 == i3)
              {
                n++;
              }
              else
              {
                paramArrayOfInt = ((MessageDigest)localObject3).getAlgorithm();
                paramArrayOfzzakh = new StringBuilder();
                paramArrayOfzzakh.append("Unexpected output size of ");
                paramArrayOfzzakh.append(paramArrayOfInt);
                paramArrayOfzzakh.append(" digest: ");
                paramArrayOfzzakh.append(i2);
                throw new RuntimeException(paramArrayOfzzakh.toString());
              }
            }
            long l3 = i1;
            l2 -= l3;
            k++;
            l1 += l3;
          }
          catch (IOException paramArrayOfInt)
          {
            paramArrayOfzzakh = new StringBuilder();
            paramArrayOfzzakh.append("Failed to digest chunk #");
            paramArrayOfzzakh.append(k);
            paramArrayOfzzakh.append(" of section #");
            paramArrayOfzzakh.append(j);
            throw new DigestException(paramArrayOfzzakh.toString(), paramArrayOfInt);
          }
        }
        j++;
        i++;
      }
      Object localObject2 = new byte[paramArrayOfInt.length][];
      i = 0;
      while (i < paramArrayOfInt.length)
      {
        j = paramArrayOfInt[i];
        arrayOfByte1 = arrayOfByte[i];
        paramArrayOfzzakh = zzd(j);
        try
        {
          localObject1 = MessageDigest.getInstance(paramArrayOfzzakh);
          localObject2[i] = ((MessageDigest)localObject1).digest(arrayOfByte1);
          i++;
        }
        catch (NoSuchAlgorithmException paramArrayOfInt)
        {
          throw new RuntimeException(paramArrayOfzzakh.concat(" digest not supported"), paramArrayOfInt);
        }
      }
      return (byte[][])localObject2;
    }
    paramArrayOfInt = new StringBuilder();
    paramArrayOfInt.append("Too many chunks: ");
    paramArrayOfInt.append(l1);
    throw new DigestException(paramArrayOfInt.toString());
  }
  
  /* Error */
  private static X509Certificate[][] zzl(FileChannel paramFileChannel, zzakk paramzzakk)
    throws SecurityException
  {
    // Byte code:
    //   0: new 609	java/util/HashMap
    //   3: dup
    //   4: invokespecial 610	java/util/HashMap:<init>	()V
    //   7: astore 4
    //   9: new 391	java/util/ArrayList
    //   12: dup
    //   13: invokespecial 392	java/util/ArrayList:<init>	()V
    //   16: astore 5
    //   18: ldc_w 612
    //   21: invokestatic 615	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   24: astore_3
    //   25: aload_1
    //   26: invokestatic 618	com/google/android/gms/internal/ads/zzakk:zze	(Lcom/google/android/gms/internal/ads/zzakk;)Ljava/nio/ByteBuffer;
    //   29: invokestatic 387	com/google/android/gms/internal/ads/zzako:zzf	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   32: astore 6
    //   34: iconst_0
    //   35: istore_2
    //   36: aload 6
    //   38: invokevirtual 132	java/nio/ByteBuffer:hasRemaining	()Z
    //   41: ifeq +80 -> 121
    //   44: iinc 2 1
    //   47: aload 5
    //   49: aload 6
    //   51: invokestatic 387	com/google/android/gms/internal/ads/zzako:zzf	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   54: aload 4
    //   56: aload_3
    //   57: invokestatic 620	com/google/android/gms/internal/ads/zzako:zzj	(Ljava/nio/ByteBuffer;Ljava/util/Map;Ljava/security/cert/CertificateFactory;)[Ljava/security/cert/X509Certificate;
    //   60: invokeinterface 398 2 0
    //   65: pop
    //   66: goto -30 -> 36
    //   69: astore_0
    //   70: goto +8 -> 78
    //   73: astore_0
    //   74: goto +4 -> 78
    //   77: astore_0
    //   78: new 168	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   85: astore_1
    //   86: aload_1
    //   87: ldc_w 622
    //   90: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload_1
    //   95: iload_2
    //   96: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload_1
    //   101: ldc_w 624
    //   104: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: new 10	java/lang/SecurityException
    //   111: dup
    //   112: aload_1
    //   113: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: aload_0
    //   117: invokespecial 362	java/lang/SecurityException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   120: athrow
    //   121: iload_2
    //   122: ifle +67 -> 189
    //   125: aload 4
    //   127: invokeinterface 288 1 0
    //   132: ifne +46 -> 178
    //   135: aload 4
    //   137: aload_0
    //   138: aload_1
    //   139: invokestatic 627	com/google/android/gms/internal/ads/zzakk:zza	(Lcom/google/android/gms/internal/ads/zzakk;)J
    //   142: aload_1
    //   143: invokestatic 629	com/google/android/gms/internal/ads/zzakk:zzb	(Lcom/google/android/gms/internal/ads/zzakk;)J
    //   146: aload_1
    //   147: invokestatic 631	com/google/android/gms/internal/ads/zzakk:zzc	(Lcom/google/android/gms/internal/ads/zzakk;)J
    //   150: aload_1
    //   151: invokestatic 633	com/google/android/gms/internal/ads/zzakk:zzd	(Lcom/google/android/gms/internal/ads/zzakk;)Ljava/nio/ByteBuffer;
    //   154: invokestatic 635	com/google/android/gms/internal/ads/zzako:zzh	(Ljava/util/Map;Ljava/nio/channels/FileChannel;JJJLjava/nio/ByteBuffer;)V
    //   157: aload 5
    //   159: aload 5
    //   161: invokeinterface 535 1 0
    //   166: anewarray 541	[Ljava/security/cert/X509Certificate;
    //   169: invokeinterface 539 2 0
    //   174: checkcast 637	[[Ljava/security/cert/X509Certificate;
    //   177: areturn
    //   178: new 10	java/lang/SecurityException
    //   181: dup
    //   182: ldc_w 639
    //   185: invokespecial 357	java/lang/SecurityException:<init>	(Ljava/lang/String;)V
    //   188: athrow
    //   189: new 10	java/lang/SecurityException
    //   192: dup
    //   193: ldc_w 641
    //   196: invokespecial 357	java/lang/SecurityException:<init>	(Ljava/lang/String;)V
    //   199: athrow
    //   200: astore_0
    //   201: new 10	java/lang/SecurityException
    //   204: dup
    //   205: ldc_w 643
    //   208: aload_0
    //   209: invokespecial 362	java/lang/SecurityException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   212: athrow
    //   213: astore_0
    //   214: new 570	java/lang/RuntimeException
    //   217: dup
    //   218: ldc_w 645
    //   221: aload_0
    //   222: invokespecial 573	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   225: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	226	0	paramFileChannel	FileChannel
    //   0	226	1	paramzzakk	zzakk
    //   35	87	2	i	int
    //   24	33	3	localCertificateFactory	CertificateFactory
    //   7	129	4	localHashMap	java.util.HashMap
    //   16	144	5	localArrayList	ArrayList
    //   32	18	6	localByteBuffer	ByteBuffer
    // Exception table:
    //   from	to	target	type
    //   47	66	69	java/lang/SecurityException
    //   47	66	73	java/nio/BufferUnderflowException
    //   47	66	77	java/io/IOException
    //   25	34	200	java/io/IOException
    //   18	25	213	java/security/cert/CertificateException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzako.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */