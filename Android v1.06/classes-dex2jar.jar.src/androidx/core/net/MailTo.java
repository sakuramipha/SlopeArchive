package androidx.core.net;

import android.net.Uri;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class MailTo
{
  private static final String BCC = "bcc";
  private static final String BODY = "body";
  private static final String CC = "cc";
  private static final String MAILTO = "mailto";
  public static final String MAILTO_SCHEME = "mailto:";
  private static final String SUBJECT = "subject";
  private static final String TO = "to";
  private HashMap<String, String> mHeaders = new HashMap();
  
  public static boolean isMailTo(Uri paramUri)
  {
    boolean bool;
    if ((paramUri != null) && ("mailto".equals(paramUri.getScheme()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isMailTo(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("mailto:"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static MailTo parse(Uri paramUri)
    throws ParseException
  {
    return parse(paramUri.toString());
  }
  
  public static MailTo parse(String paramString)
    throws ParseException
  {
    Preconditions.checkNotNull(paramString);
    if (isMailTo(paramString))
    {
      int i = paramString.indexOf('#');
      Object localObject = paramString;
      if (i != -1) {
        localObject = paramString.substring(0, i);
      }
      i = ((String)localObject).indexOf('?');
      if (i == -1)
      {
        paramString = Uri.decode(((String)localObject).substring(7));
        localObject = null;
      }
      else
      {
        paramString = Uri.decode(((String)localObject).substring(7, i));
        localObject = ((String)localObject).substring(i + 1);
      }
      MailTo localMailTo = new MailTo();
      if (localObject != null)
      {
        String[] arrayOfString = ((String)localObject).split("&");
        int j = arrayOfString.length;
        for (i = 0; i < j; i++)
        {
          localObject = arrayOfString[i].split("=", 2);
          if (localObject.length != 0)
          {
            str = Uri.decode(localObject[0]).toLowerCase(Locale.ROOT);
            if (localObject.length > 1) {
              localObject = Uri.decode(localObject[1]);
            } else {
              localObject = null;
            }
            localMailTo.mHeaders.put(str, localObject);
          }
        }
      }
      String str = localMailTo.getTo();
      localObject = paramString;
      if (str != null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(str);
        localObject = ((StringBuilder)localObject).toString();
      }
      localMailTo.mHeaders.put("to", localObject);
      return localMailTo;
    }
    throw new ParseException("Not a mailto scheme");
  }
  
  public String getBcc()
  {
    return (String)this.mHeaders.get("bcc");
  }
  
  public String getBody()
  {
    return (String)this.mHeaders.get("body");
  }
  
  public String getCc()
  {
    return (String)this.mHeaders.get("cc");
  }
  
  public Map<String, String> getHeaders()
  {
    return this.mHeaders;
  }
  
  public String getSubject()
  {
    return (String)this.mHeaders.get("subject");
  }
  
  public String getTo()
  {
    return (String)this.mHeaders.get("to");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("mailto:");
    localStringBuilder.append('?');
    Iterator localIterator = this.mHeaders.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append(Uri.encode((String)localEntry.getKey()));
      localStringBuilder.append('=');
      localStringBuilder.append(Uri.encode((String)localEntry.getValue()));
      localStringBuilder.append('&');
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\net\MailTo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */