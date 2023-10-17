package androidx.core.net;

import android.net.Uri;

public final class UriCompat
{
  public static String toSafeString(Uri paramUri)
  {
    String str2 = paramUri.getScheme();
    String str1 = paramUri.getSchemeSpecificPart();
    Object localObject = str1;
    if (str2 != null) {
      if ((!str2.equalsIgnoreCase("tel")) && (!str2.equalsIgnoreCase("sip")) && (!str2.equalsIgnoreCase("sms")) && (!str2.equalsIgnoreCase("smsto")) && (!str2.equalsIgnoreCase("mailto")) && (!str2.equalsIgnoreCase("nfc")))
      {
        if ((!str2.equalsIgnoreCase("http")) && (!str2.equalsIgnoreCase("https")) && (!str2.equalsIgnoreCase("ftp")))
        {
          localObject = str1;
          if (!str2.equalsIgnoreCase("rtsp")) {}
        }
        else
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("//");
          localObject = paramUri.getHost();
          str1 = "";
          if (localObject != null) {
            localObject = paramUri.getHost();
          } else {
            localObject = "";
          }
          localStringBuilder.append((String)localObject);
          localObject = str1;
          if (paramUri.getPort() != -1)
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append(":");
            ((StringBuilder)localObject).append(paramUri.getPort());
            localObject = ((StringBuilder)localObject).toString();
          }
          localStringBuilder.append((String)localObject);
          localStringBuilder.append("/...");
          localObject = localStringBuilder.toString();
        }
      }
      else
      {
        paramUri = new StringBuilder(64);
        paramUri.append(str2);
        paramUri.append(':');
        if (str1 != null) {
          for (int i = 0; i < str1.length(); i++)
          {
            char c = str1.charAt(i);
            if ((c != '-') && (c != '@') && (c != '.')) {
              paramUri.append('x');
            } else {
              paramUri.append(c);
            }
          }
        }
        return paramUri.toString();
      }
    }
    paramUri = new StringBuilder(64);
    if (str2 != null)
    {
      paramUri.append(str2);
      paramUri.append(':');
    }
    if (localObject != null) {
      paramUri.append((String)localObject);
    }
    return paramUri.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\net\UriCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */