package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PackageInfoCompat
{
  private static boolean byteArrayContains(byte[][] paramArrayOfByte, byte[] paramArrayOfByte1)
  {
    int j = paramArrayOfByte.length;
    for (int i = 0; i < j; i++) {
      if (Arrays.equals(paramArrayOfByte1, paramArrayOfByte[i])) {
        return true;
      }
    }
    return false;
  }
  
  private static byte[] computeSHA256Digest(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = MessageDigest.getInstance("SHA256").digest(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      throw new RuntimeException("Device doesn't support SHA256 cert checking", paramArrayOfByte);
    }
  }
  
  public static long getLongVersionCode(PackageInfo paramPackageInfo)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramPackageInfo.getLongVersionCode();
    }
    return paramPackageInfo.versionCode;
  }
  
  public static List<Signature> getSignatures(PackageManager paramPackageManager, String paramString)
    throws PackageManager.NameNotFoundException
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramPackageManager = paramPackageManager.getPackageInfo(paramString, 134217728).signingInfo;
      if (Api28Impl.hasMultipleSigners(paramPackageManager)) {
        paramPackageManager = Api28Impl.getApkContentsSigners(paramPackageManager);
      } else {
        paramPackageManager = Api28Impl.getSigningCertificateHistory(paramPackageManager);
      }
    }
    else
    {
      paramPackageManager = paramPackageManager.getPackageInfo(paramString, 64).signatures;
    }
    if (paramPackageManager == null) {
      return Collections.emptyList();
    }
    return Arrays.asList(paramPackageManager);
  }
  
  public static boolean hasSignatures(PackageManager paramPackageManager, String paramString, Map<byte[], Integer> paramMap, boolean paramBoolean)
    throws PackageManager.NameNotFoundException
  {
    if (paramMap.isEmpty()) {
      return false;
    }
    Object localObject1 = paramMap.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    int i;
    while (localIterator.hasNext())
    {
      localObject2 = (byte[])localIterator.next();
      if (localObject2 != null)
      {
        localObject2 = (Integer)paramMap.get(localObject2);
        if (localObject2 != null)
        {
          i = ((Integer)localObject2).intValue();
          if ((i != 0) && (i != 1))
          {
            paramPackageManager = new StringBuilder();
            paramPackageManager.append("Unsupported certificate type ");
            paramPackageManager.append(localObject2);
            paramPackageManager.append(" when verifying ");
            paramPackageManager.append(paramString);
            throw new IllegalArgumentException(paramPackageManager.toString());
          }
        }
        else
        {
          paramPackageManager = new StringBuilder();
          paramPackageManager.append("Type must be specified for cert when verifying ");
          paramPackageManager.append(paramString);
          throw new IllegalArgumentException(paramPackageManager.toString());
        }
      }
      else
      {
        paramPackageManager = new StringBuilder();
        paramPackageManager.append("Cert byte array cannot be null when verifying ");
        paramPackageManager.append(paramString);
        throw new IllegalArgumentException(paramPackageManager.toString());
      }
    }
    Object localObject2 = getSignatures(paramPackageManager, paramString);
    if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 28))
    {
      localObject2 = ((Set)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (byte[])((Iterator)localObject2).next();
        if (!Api28Impl.hasSigningCertificate(paramPackageManager, paramString, (byte[])localObject1, ((Integer)paramMap.get(localObject1)).intValue())) {
          return false;
        }
      }
      return true;
    }
    if ((((List)localObject2).size() != 0) && (paramMap.size() <= ((List)localObject2).size()) && ((!paramBoolean) || (paramMap.size() == ((List)localObject2).size())))
    {
      paramBoolean = paramMap.containsValue(Integer.valueOf(1));
      paramPackageManager = null;
      if (paramBoolean)
      {
        paramString = new byte[((List)localObject2).size()][];
        for (i = 0;; i++)
        {
          paramPackageManager = paramString;
          if (i >= ((List)localObject2).size()) {
            break;
          }
          paramString[i] = computeSHA256Digest(((Signature)((List)localObject2).get(i)).toByteArray());
        }
      }
      paramString = ((Set)localObject1).iterator();
      if (paramString.hasNext())
      {
        paramString = (byte[])paramString.next();
        paramMap = (Integer)paramMap.get(paramString);
        i = paramMap.intValue();
        if (i != 0)
        {
          if (i == 1)
          {
            if (!byteArrayContains(paramPackageManager, paramString)) {
              return false;
            }
          }
          else
          {
            paramPackageManager = new StringBuilder();
            paramPackageManager.append("Unsupported certificate type ");
            paramPackageManager.append(paramMap);
            throw new IllegalArgumentException(paramPackageManager.toString());
          }
        }
        else if (!((List)localObject2).contains(new Signature(paramString))) {
          return false;
        }
        return true;
      }
    }
    return false;
  }
  
  private static class Api28Impl
  {
    static Signature[] getApkContentsSigners(SigningInfo paramSigningInfo)
    {
      return paramSigningInfo.getApkContentsSigners();
    }
    
    static Signature[] getSigningCertificateHistory(SigningInfo paramSigningInfo)
    {
      return paramSigningInfo.getSigningCertificateHistory();
    }
    
    static boolean hasMultipleSigners(SigningInfo paramSigningInfo)
    {
      return paramSigningInfo.hasMultipleSigners();
    }
    
    static boolean hasSigningCertificate(PackageManager paramPackageManager, String paramString, byte[] paramArrayOfByte, int paramInt)
    {
      return paramPackageManager.hasSigningCertificate(paramString, paramArrayOfByte, paramInt);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\content\pm\PackageInfoCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */