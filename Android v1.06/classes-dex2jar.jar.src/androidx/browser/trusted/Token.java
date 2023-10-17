package androidx.browser.trusted;

import android.content.pm.PackageManager;
import android.util.Log;
import java.io.IOException;

public final class Token
{
  private static final String TAG = "Token";
  private final TokenContents mContents;
  
  private Token(TokenContents paramTokenContents)
  {
    this.mContents = paramTokenContents;
  }
  
  public static Token create(String paramString, PackageManager paramPackageManager)
  {
    paramPackageManager = PackageIdentityUtils.getFingerprintsForPackage(paramString, paramPackageManager);
    if (paramPackageManager == null) {
      return null;
    }
    try
    {
      paramString = new Token(TokenContents.create(paramString, paramPackageManager));
      return paramString;
    }
    catch (IOException paramString)
    {
      Log.e("Token", "Exception when creating token.", paramString);
    }
    return null;
  }
  
  public static Token deserialize(byte[] paramArrayOfByte)
  {
    return new Token(TokenContents.deserialize(paramArrayOfByte));
  }
  
  public boolean matches(String paramString, PackageManager paramPackageManager)
  {
    return PackageIdentityUtils.packageMatchesToken(paramString, paramPackageManager, this.mContents);
  }
  
  public byte[] serialize()
  {
    return this.mContents.serialize();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\Token.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */