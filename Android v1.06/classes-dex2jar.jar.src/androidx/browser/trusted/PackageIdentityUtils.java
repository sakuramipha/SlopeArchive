package androidx.browser.trusted;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

class PackageIdentityUtils
{
  private static final String TAG = "PackageIdentity";
  
  static byte[] getCertificateSHA256Fingerprint(Signature paramSignature)
  {
    try
    {
      paramSignature = MessageDigest.getInstance("SHA256").digest(paramSignature.toByteArray());
      return paramSignature;
    }
    catch (NoSuchAlgorithmException paramSignature) {}
    return null;
  }
  
  static List<byte[]> getFingerprintsForPackage(String paramString, PackageManager paramPackageManager)
  {
    try
    {
      paramString = getImpl().getFingerprintsForPackage(paramString, paramPackageManager);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      Log.e("PackageIdentity", "Could not get fingerprint for package.", paramString);
    }
    return null;
  }
  
  private static SignaturesCompat getImpl()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return new Api28Implementation();
    }
    return new Pre28Implementation();
  }
  
  static boolean packageMatchesToken(String paramString, PackageManager paramPackageManager, TokenContents paramTokenContents)
  {
    try
    {
      boolean bool = getImpl().packageMatchesToken(paramString, paramPackageManager, paramTokenContents);
      return bool;
    }
    catch (PackageManager.NameNotFoundException paramString) {}catch (IOException paramString) {}
    Log.e("PackageIdentity", "Could not check if package matches token.", paramString);
    return false;
  }
  
  static class Api28Implementation
    implements PackageIdentityUtils.SignaturesCompat
  {
    public List<byte[]> getFingerprintsForPackage(String paramString, PackageManager paramPackageManager)
      throws PackageManager.NameNotFoundException
    {
      paramPackageManager = paramPackageManager.getPackageInfo(paramString, 134217728);
      paramString = new ArrayList();
      paramPackageManager = paramPackageManager.signingInfo;
      boolean bool = paramPackageManager.hasMultipleSigners();
      int i = 0;
      if (bool)
      {
        paramPackageManager = paramPackageManager.getApkContentsSigners();
        int j = paramPackageManager.length;
        while (i < j)
        {
          paramString.add(PackageIdentityUtils.getCertificateSHA256Fingerprint(paramPackageManager[i]));
          i++;
        }
      }
      paramString.add(PackageIdentityUtils.getCertificateSHA256Fingerprint(paramPackageManager.getSigningCertificateHistory()[0]));
      return paramString;
    }
    
    public boolean packageMatchesToken(String paramString, PackageManager paramPackageManager, TokenContents paramTokenContents)
      throws PackageManager.NameNotFoundException, IOException
    {
      if (!paramTokenContents.getPackageName().equals(paramString)) {
        return false;
      }
      List localList = getFingerprintsForPackage(paramString, paramPackageManager);
      if (localList == null) {
        return false;
      }
      if (localList.size() == 1) {
        return paramPackageManager.hasSigningCertificate(paramString, paramTokenContents.getFingerprint(0), 1);
      }
      return paramTokenContents.equals(TokenContents.create(paramString, localList));
    }
  }
  
  static class Pre28Implementation
    implements PackageIdentityUtils.SignaturesCompat
  {
    public List<byte[]> getFingerprintsForPackage(String paramString, PackageManager paramPackageManager)
      throws PackageManager.NameNotFoundException
    {
      paramPackageManager = paramPackageManager.getPackageInfo(paramString, 64);
      paramString = new ArrayList(paramPackageManager.signatures.length);
      paramPackageManager = paramPackageManager.signatures;
      int j = paramPackageManager.length;
      for (int i = 0; i < j; i++)
      {
        byte[] arrayOfByte = PackageIdentityUtils.getCertificateSHA256Fingerprint(paramPackageManager[i]);
        if (arrayOfByte == null) {
          return null;
        }
        paramString.add(arrayOfByte);
      }
      return paramString;
    }
    
    public boolean packageMatchesToken(String paramString, PackageManager paramPackageManager, TokenContents paramTokenContents)
      throws IOException, PackageManager.NameNotFoundException
    {
      if (!paramString.equals(paramTokenContents.getPackageName())) {
        return false;
      }
      paramPackageManager = getFingerprintsForPackage(paramString, paramPackageManager);
      if (paramPackageManager == null) {
        return false;
      }
      return paramTokenContents.equals(TokenContents.create(paramString, paramPackageManager));
    }
  }
  
  static abstract interface SignaturesCompat
  {
    public abstract List<byte[]> getFingerprintsForPackage(String paramString, PackageManager paramPackageManager)
      throws PackageManager.NameNotFoundException;
    
    public abstract boolean packageMatchesToken(String paramString, PackageManager paramPackageManager, TokenContents paramTokenContents)
      throws IOException, PackageManager.NameNotFoundException;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\PackageIdentityUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */