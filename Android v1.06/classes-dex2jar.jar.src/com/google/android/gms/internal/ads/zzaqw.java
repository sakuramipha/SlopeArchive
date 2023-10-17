package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzaqw
{
  private static Cipher zza;
  private static final Object zzb = new Object();
  private static final Object zzc = new Object();
  
  public zzaqw(SecureRandom paramSecureRandom) {}
  
  private static final Cipher zzc()
    throws NoSuchAlgorithmException, NoSuchPaddingException
  {
    synchronized (zzc)
    {
      if (zza == null) {
        zza = Cipher.getInstance("AES/CBC/PKCS5Padding");
      }
      Cipher localCipher = zza;
      return localCipher;
    }
  }
  
  /* Error */
  public final String zza(byte[] arg1, byte[] paramArrayOfByte2)
    throws zzaqv
  {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: istore_3
    //   3: new 47	javax/crypto/spec/SecretKeySpec
    //   6: astore 4
    //   8: aload 4
    //   10: aload_1
    //   11: ldc 49
    //   13: invokespecial 52	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   16: getstatic 16	com/google/android/gms/internal/ads/zzaqw:zzb	Ljava/lang/Object;
    //   19: astore_1
    //   20: aload_1
    //   21: monitorenter
    //   22: invokestatic 54	com/google/android/gms/internal/ads/zzaqw:zzc	()Ljavax/crypto/Cipher;
    //   25: iconst_1
    //   26: aload 4
    //   28: aconst_null
    //   29: invokevirtual 58	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/SecureRandom;)V
    //   32: invokestatic 54	com/google/android/gms/internal/ads/zzaqw:zzc	()Ljavax/crypto/Cipher;
    //   35: aload_2
    //   36: invokevirtual 62	javax/crypto/Cipher:doFinal	([B)[B
    //   39: astore 4
    //   41: invokestatic 54	com/google/android/gms/internal/ads/zzaqw:zzc	()Ljavax/crypto/Cipher;
    //   44: invokevirtual 66	javax/crypto/Cipher:getIV	()[B
    //   47: astore_2
    //   48: aload_1
    //   49: monitorexit
    //   50: aload 4
    //   52: arraylength
    //   53: aload_2
    //   54: arraylength
    //   55: iadd
    //   56: istore_3
    //   57: iload_3
    //   58: invokestatic 72	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   61: astore_1
    //   62: aload_1
    //   63: aload_2
    //   64: invokevirtual 76	java/nio/ByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   67: aload 4
    //   69: invokevirtual 76	java/nio/ByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   72: pop
    //   73: aload_1
    //   74: invokevirtual 80	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   77: pop
    //   78: iload_3
    //   79: newarray <illegal type>
    //   81: astore_2
    //   82: aload_1
    //   83: aload_2
    //   84: invokevirtual 83	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   87: pop
    //   88: aload_2
    //   89: iconst_0
    //   90: invokestatic 88	com/google/android/gms/internal/ads/zzapb:zza	([BZ)Ljava/lang/String;
    //   93: astore_1
    //   94: aload_1
    //   95: areturn
    //   96: astore_2
    //   97: aload_1
    //   98: monitorexit
    //   99: aload_2
    //   100: athrow
    //   101: astore_1
    //   102: new 39	com/google/android/gms/internal/ads/zzaqv
    //   105: dup
    //   106: aload_0
    //   107: aload_1
    //   108: invokespecial 91	com/google/android/gms/internal/ads/zzaqv:<init>	(Lcom/google/android/gms/internal/ads/zzaqw;Ljava/lang/Throwable;)V
    //   111: athrow
    //   112: astore_1
    //   113: new 39	com/google/android/gms/internal/ads/zzaqv
    //   116: dup
    //   117: aload_0
    //   118: aload_1
    //   119: invokespecial 91	com/google/android/gms/internal/ads/zzaqv:<init>	(Lcom/google/android/gms/internal/ads/zzaqw;Ljava/lang/Throwable;)V
    //   122: athrow
    //   123: astore_1
    //   124: new 39	com/google/android/gms/internal/ads/zzaqv
    //   127: dup
    //   128: aload_0
    //   129: aload_1
    //   130: invokespecial 91	com/google/android/gms/internal/ads/zzaqv:<init>	(Lcom/google/android/gms/internal/ads/zzaqw;Ljava/lang/Throwable;)V
    //   133: athrow
    //   134: astore_1
    //   135: new 39	com/google/android/gms/internal/ads/zzaqv
    //   138: dup
    //   139: aload_0
    //   140: aload_1
    //   141: invokespecial 91	com/google/android/gms/internal/ads/zzaqv:<init>	(Lcom/google/android/gms/internal/ads/zzaqw;Ljava/lang/Throwable;)V
    //   144: athrow
    //   145: astore_1
    //   146: new 39	com/google/android/gms/internal/ads/zzaqv
    //   149: dup
    //   150: aload_0
    //   151: aload_1
    //   152: invokespecial 91	com/google/android/gms/internal/ads/zzaqv:<init>	(Lcom/google/android/gms/internal/ads/zzaqw;Ljava/lang/Throwable;)V
    //   155: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	this	zzaqw
    //   0	156	2	paramArrayOfByte2	byte[]
    //   2	77	3	i	int
    //   6	62	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   22	50	96	finally
    //   97	99	96	finally
    //   3	22	101	javax/crypto/BadPaddingException
    //   50	94	101	javax/crypto/BadPaddingException
    //   99	101	101	javax/crypto/BadPaddingException
    //   3	22	112	javax/crypto/NoSuchPaddingException
    //   50	94	112	javax/crypto/NoSuchPaddingException
    //   99	101	112	javax/crypto/NoSuchPaddingException
    //   3	22	123	javax/crypto/IllegalBlockSizeException
    //   50	94	123	javax/crypto/IllegalBlockSizeException
    //   99	101	123	javax/crypto/IllegalBlockSizeException
    //   3	22	134	java/security/InvalidKeyException
    //   50	94	134	java/security/InvalidKeyException
    //   99	101	134	java/security/InvalidKeyException
    //   3	22	145	java/security/NoSuchAlgorithmException
    //   50	94	145	java/security/NoSuchAlgorithmException
    //   99	101	145	java/security/NoSuchAlgorithmException
  }
  
  public final byte[] zzb(byte[] arg1, String paramString)
    throws zzaqv
  {
    int i = ???.length;
    try
    {
      paramString = zzapb.zzb(paramString, false);
      i = paramString.length;
      if (i > 16)
      {
        Object localObject = ByteBuffer.allocate(i);
        ((ByteBuffer)localObject).put(paramString);
        ((ByteBuffer)localObject).flip();
        paramString = new byte[16];
        byte[] arrayOfByte = new byte[i - 16];
        ((ByteBuffer)localObject).get(paramString);
        ((ByteBuffer)localObject).get(arrayOfByte);
        localObject = new javax/crypto/spec/SecretKeySpec;
        ((SecretKeySpec)localObject).<init>(???, "AES");
        synchronized (zzb)
        {
          Cipher localCipher = zzc();
          IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
          localIvParameterSpec.<init>(paramString);
          localCipher.init(2, (Key)localObject, localIvParameterSpec);
          paramString = zzc().doFinal(arrayOfByte);
          return paramString;
        }
      }
      ??? = new com/google/android/gms/internal/ads/zzaqv;
      ???.<init>(this);
      throw ???;
    }
    catch (IllegalArgumentException ???)
    {
      throw new zzaqv(this, ???);
    }
    catch (InvalidAlgorithmParameterException ???)
    {
      throw new zzaqv(this, ???);
    }
    catch (BadPaddingException ???)
    {
      throw new zzaqv(this, ???);
    }
    catch (NoSuchPaddingException ???)
    {
      throw new zzaqv(this, ???);
    }
    catch (IllegalBlockSizeException ???)
    {
      throw new zzaqv(this, ???);
    }
    catch (InvalidKeyException ???)
    {
      throw new zzaqv(this, ???);
    }
    catch (NoSuchAlgorithmException ???)
    {
      throw new zzaqv(this, ???);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaqw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */