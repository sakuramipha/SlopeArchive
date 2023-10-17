package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

final class zzade
{
  private static final String[] zza = { "Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo" };
  private static final String[] zzb = { "Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs" };
  private static final String[] zzc = { "Camera:MicroVideoOffset", "GCamera:MicroVideoOffset" };
  
  public static zzada zza(String paramString)
    throws IOException
  {
    Object localObject2 = null;
    try
    {
      XmlPullParser localXmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
      Object localObject1 = new java/io/StringReader;
      ((StringReader)localObject1).<init>(paramString);
      localXmlPullParser.setInput((Reader)localObject1);
      localXmlPullParser.next();
      if (zzfo.zzc(localXmlPullParser, "x:xmpmeta"))
      {
        localObject1 = zzfrr.zzl();
        long l2 = -9223372036854775807L;
        localXmlPullParser.next();
        long l1;
        String[] arrayOfString;
        int j;
        if (!zzfo.zzc(localXmlPullParser, "rdf:Description"))
        {
          if (zzfo.zzc(localXmlPullParser, "Container:Directory"))
          {
            paramString = zzb(localXmlPullParser, "Container", "Item");
            l1 = l2;
          }
          else
          {
            paramString = (String)localObject1;
            l1 = l2;
            if (zzfo.zzc(localXmlPullParser, "GContainer:Directory"))
            {
              paramString = zzb(localXmlPullParser, "GContainer", "GContainerItem");
              l1 = l2;
            }
          }
        }
        else
        {
          arrayOfString = zza;
          j = 0;
        }
        for (int i = 0;; i++)
        {
          paramString = (String)localObject2;
          if (i >= 4) {
            break label370;
          }
          localObject1 = zzfo.zza(localXmlPullParser, arrayOfString[i]);
          if (localObject1 != null)
          {
            paramString = (String)localObject2;
            if (Integer.parseInt((String)localObject1) != 1) {
              break label370;
            }
            localObject1 = zzb;
            for (i = 0; i < 4; i++)
            {
              paramString = zzfo.zza(localXmlPullParser, localObject1[i]);
              if (paramString != null)
              {
                l2 = Long.parseLong(paramString);
                l1 = l2;
                if (l2 != -1L) {
                  break label237;
                }
                break;
              }
            }
            l1 = -9223372036854775807L;
            label237:
            localObject1 = zzc;
            for (i = j; i < 2; i++)
            {
              paramString = zzfo.zza(localXmlPullParser, localObject1[i]);
              if (paramString != null)
              {
                l2 = Long.parseLong(paramString);
                localObject1 = new com/google/android/gms/internal/ads/zzacz;
                ((zzacz)localObject1).<init>("image/jpeg", "Primary", 0L, 0L);
                paramString = new com/google/android/gms/internal/ads/zzacz;
                paramString.<init>("video/mp4", "MotionPhoto", l2, 0L);
                paramString = zzfrr.zzn(localObject1, paramString);
                break label320;
              }
            }
            paramString = zzfrr.zzl();
            label320:
            localObject1 = paramString;
            l2 = l1;
            if (!zzfo.zzb(localXmlPullParser, "x:xmpmeta")) {
              break;
            }
            if (paramString.isEmpty())
            {
              paramString = (String)localObject2;
              break label370;
            }
            paramString = new zzada(l1, paramString);
            break label370;
          }
        }
        label370:
        return paramString;
      }
      throw zzce.zza("Couldn't find xmp metadata", null);
    }
    catch (XmlPullParserException|zzce|NumberFormatException paramString)
    {
      zzer.zze("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
    }
    return null;
  }
  
  private static zzfrr zzb(XmlPullParser paramXmlPullParser, String paramString1, String paramString2)
    throws XmlPullParserException, IOException
  {
    zzfro localzzfro = new zzfro();
    do
    {
      String str1 = paramString1.concat(":Item");
      paramXmlPullParser.next();
      if (zzfo.zzc(paramXmlPullParser, str1))
      {
        String str2 = paramString2.concat(":Mime");
        String str3 = paramString2.concat(":Semantic");
        String str4 = paramString2.concat(":Length");
        str1 = paramString2.concat(":Padding");
        str2 = zzfo.zza(paramXmlPullParser, str2);
        str3 = zzfo.zza(paramXmlPullParser, str3);
        str4 = zzfo.zza(paramXmlPullParser, str4);
        str1 = zzfo.zza(paramXmlPullParser, str1);
        if ((str2 != null) && (str3 != null))
        {
          long l1;
          if (str4 != null) {
            l1 = Long.parseLong(str4);
          } else {
            l1 = 0L;
          }
          long l2;
          if (str1 != null) {
            l2 = Long.parseLong(str1);
          } else {
            l2 = 0L;
          }
          localzzfro.zzf(new zzacz(str2, str3, l1, l2));
        }
        else
        {
          return zzfrr.zzl();
        }
      }
    } while (!zzfo.zzb(paramXmlPullParser, paramString1.concat(":Directory")));
    return localzzfro.zzi();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */