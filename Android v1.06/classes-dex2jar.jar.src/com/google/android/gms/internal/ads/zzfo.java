package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class zzfo
{
  public static String zza(XmlPullParser paramXmlPullParser, String paramString)
  {
    int j = paramXmlPullParser.getAttributeCount();
    for (int i = 0; i < j; i++) {
      if (paramXmlPullParser.getAttributeName(i).equals(paramString)) {
        return paramXmlPullParser.getAttributeValue(i);
      }
    }
    return null;
  }
  
  public static boolean zzb(XmlPullParser paramXmlPullParser, String paramString)
    throws XmlPullParserException
  {
    return (paramXmlPullParser.getEventType() == 3) && (paramXmlPullParser.getName().equals(paramString));
  }
  
  public static boolean zzc(XmlPullParser paramXmlPullParser, String paramString)
    throws XmlPullParserException
  {
    return (paramXmlPullParser.getEventType() == 2) && (paramXmlPullParser.getName().equals(paramString));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */