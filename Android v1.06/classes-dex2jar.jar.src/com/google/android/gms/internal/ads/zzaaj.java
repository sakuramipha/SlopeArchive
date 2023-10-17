package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzaaj
  implements zzaav
{
  private static final int[] zza = { 5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14 };
  private static final zzaai zzc = new zzaai(zzaaf.zza);
  private static final zzaai zzd = new zzaai(zzaag.zza);
  private zzfrr zze;
  
  private final void zzb(int paramInt, List paramList)
  {
    zzaao localzzaao;
    switch (paramInt)
    {
    case 13: 
    default: 
      break;
    case 16: 
      paramList.add(new zzace());
      return;
    case 15: 
      localzzaao = zzd.zza(new Object[0]);
      if (localzzaao != null)
      {
        paramList.add(localzzaao);
        return;
      }
      break;
    case 14: 
      paramList.add(new zzacy());
      return;
    case 12: 
      paramList.add(new zzakb());
      return;
    case 11: 
      if (this.zze == null) {
        this.zze = zzfrr.zzl();
      }
      paramList.add(new zzajp(1, new zzfl(0L), new zzaie(0, this.zze), 112800));
      return;
    case 10: 
      paramList.add(new zzajf());
      return;
    case 9: 
      paramList.add(new zzahk());
      return;
    case 8: 
      paramList.add(new zzagr(0, null));
      paramList.add(new zzagw(0));
      return;
    case 7: 
      paramList.add(new zzafv(0));
      return;
    case 6: 
      paramList.add(new zzafn(0));
      return;
    case 5: 
      paramList.add(new zzact());
      return;
    case 4: 
      localzzaao = zzc.zza(new Object[] { Integer.valueOf(0) });
      if (localzzaao != null)
      {
        paramList.add(localzzaao);
        return;
      }
      paramList.add(new zzacq(0));
      return;
    case 3: 
      paramList.add(new zzabz(0));
      return;
    case 2: 
      paramList.add(new zzaic(0));
      return;
    case 1: 
      paramList.add(new zzahz());
      return;
    case 0: 
      paramList.add(new zzahw());
    }
  }
  
  public final zzaao[] zza(Uri paramUri, Map paramMap)
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(16);
      List localList = (List)paramMap.get("Content-Type");
      Object localObject = null;
      paramMap = (Map)localObject;
      if (localList != null) {
        if (localList.isEmpty()) {
          paramMap = (Map)localObject;
        } else {
          paramMap = (String)localList.get(0);
        }
      }
      int k = 2;
      if (paramMap == null) {}
      for (;;)
      {
        j = -1;
        break;
        i = zzcd.zza;
        i = paramMap.hashCode();
        if (i != -1007807498)
        {
          if (i != -586683234)
          {
            if ((i == 187090231) && (paramMap.equals("audio/mp3")))
            {
              i = 1;
              break label153;
            }
          }
          else if (paramMap.equals("audio/x-wav"))
          {
            i = 2;
            break label153;
          }
        }
        else if (paramMap.equals("audio/x-flac"))
        {
          i = 0;
          break label153;
        }
        i = -1;
        label153:
        if (i != 0)
        {
          if (i != 1)
          {
            if (i == 2) {
              paramMap = "audio/wav";
            }
          }
          else {
            paramMap = "audio/mpeg";
          }
        }
        else {
          paramMap = "audio/flac";
        }
        switch (paramMap.hashCode())
        {
        default: 
          break;
        case 2039520277: 
          if (paramMap.equals("video/x-matroska")) {
            i = 10;
          }
          break;
        case 1505118770: 
          if (paramMap.equals("audio/webm")) {
            i = 13;
          }
          break;
        case 1504831518: 
          if (paramMap.equals("audio/mpeg")) {
            i = 15;
          }
          break;
        case 1504824762: 
          if (paramMap.equals("audio/midi")) {
            i = 9;
          }
          break;
        case 1504619009: 
          if (paramMap.equals("audio/flac")) {
            i = 7;
          }
          break;
        case 1504578661: 
          if (paramMap.equals("audio/eac3")) {
            i = 1;
          }
          break;
        case 1503095341: 
          if (paramMap.equals("audio/3gpp")) {
            i = 5;
          }
          break;
        case 1331848029: 
          if (paramMap.equals("video/mp4")) {
            i = 16;
          }
          break;
        case 187099443: 
          if (paramMap.equals("audio/wav")) {
            i = 22;
          }
          break;
        case 187091926: 
          if (paramMap.equals("audio/ogg")) {
            i = 19;
          }
          break;
        case 187090232: 
          if (paramMap.equals("audio/mp4")) {
            i = 17;
          }
          break;
        case 187078669: 
          if (paramMap.equals("audio/amr")) {
            i = 4;
          }
          break;
        case 187078297: 
          if (paramMap.equals("audio/ac4")) {
            i = 3;
          }
          break;
        case 187078296: 
          if (paramMap.equals("audio/ac3")) {
            i = 0;
          }
          break;
        case 13915911: 
          if (paramMap.equals("video/x-flv")) {
            i = 8;
          }
          break;
        case -43467528: 
          if (paramMap.equals("application/webm")) {
            i = 14;
          }
          break;
        case -387023398: 
          if (paramMap.equals("audio/x-matroska")) {
            i = 11;
          }
          break;
        case -1004728940: 
          if (paramMap.equals("text/vtt")) {
            i = 23;
          }
          break;
        case -1079884372: 
          if (paramMap.equals("video/x-msvideo")) {
            i = 25;
          }
          break;
        case -1248337486: 
          if (paramMap.equals("application/mp4")) {
            i = 18;
          }
          break;
        case -1487394660: 
          if (paramMap.equals("image/jpeg")) {
            i = 24;
          }
          break;
        case -1606874997: 
          if (paramMap.equals("audio/amr-wb")) {
            i = 6;
          }
          break;
        case -1662095187: 
          if (paramMap.equals("video/webm")) {
            i = 12;
          }
          break;
        case -1662384007: 
          if (paramMap.equals("video/mp2t")) {
            i = 21;
          }
          break;
        case -1662384011: 
          if (paramMap.equals("video/mp2p")) {
            i = 20;
          }
          break;
        case -2123537834: 
          if (paramMap.equals("audio/eac3-joc")) {
            i = 2;
          }
          break;
        }
        i = -1;
        switch (i)
        {
        }
      }
      int j = 16;
      break label1023;
      j = 14;
      break label1023;
      j = 13;
      break label1023;
      j = 12;
      break label1023;
      j = 11;
      break label1023;
      j = 10;
      break label1023;
      j = 9;
      break label1023;
      j = 8;
      break label1023;
      j = 7;
      break label1023;
      j = 6;
      break label1023;
      j = 15;
      break label1023;
      j = 5;
      break label1023;
      j = 4;
      break label1023;
      j = 3;
      break label1023;
      j = 1;
      break label1023;
      j = 0;
      label1023:
      if (j != -1) {
        zzb(j, localArrayList);
      }
      paramUri = paramUri.getLastPathSegment();
      if (paramUri == null) {}
      do
      {
        i = -1;
        break label1534;
        if ((paramUri.endsWith(".ac3")) || (paramUri.endsWith(".ec3"))) {
          break label1532;
        }
        if (paramUri.endsWith(".ac4"))
        {
          i = 1;
          break label1534;
        }
        i = k;
        if (paramUri.endsWith(".adts")) {
          break label1534;
        }
        if (paramUri.endsWith(".aac"))
        {
          i = k;
          break label1534;
        }
        if (paramUri.endsWith(".amr"))
        {
          i = 3;
          break label1534;
        }
        if (paramUri.endsWith(".flac"))
        {
          i = 4;
          break label1534;
        }
        if (paramUri.endsWith(".flv"))
        {
          i = 5;
          break label1534;
        }
        if ((paramUri.endsWith(".mid")) || (paramUri.endsWith(".midi")) || (paramUri.endsWith(".smf"))) {
          break label1526;
        }
        if ((paramUri.startsWith(".mk", paramUri.length() - 4)) || (paramUri.endsWith(".webm"))) {
          break label1520;
        }
        if (paramUri.endsWith(".mp3"))
        {
          i = 7;
          break label1534;
        }
        if ((paramUri.endsWith(".mp4")) || (paramUri.startsWith(".m4", paramUri.length() - 4)) || (paramUri.startsWith(".mp4", paramUri.length() - 5)) || (paramUri.startsWith(".cmf", paramUri.length() - 5))) {
          break label1514;
        }
        if ((paramUri.startsWith(".og", paramUri.length() - 4)) || (paramUri.endsWith(".opus"))) {
          break label1508;
        }
        if ((paramUri.endsWith(".ps")) || (paramUri.endsWith(".mpeg")) || (paramUri.endsWith(".mpg")) || (paramUri.endsWith(".m2p"))) {
          break label1502;
        }
        if ((paramUri.endsWith(".ts")) || (paramUri.startsWith(".ts", paramUri.length() - 4))) {
          break label1496;
        }
        if ((paramUri.endsWith(".wav")) || (paramUri.endsWith(".wave"))) {
          break label1490;
        }
        if ((paramUri.endsWith(".vtt")) || (paramUri.endsWith(".webvtt"))) {
          break label1484;
        }
        if ((paramUri.endsWith(".jpg")) || (paramUri.endsWith(".jpeg"))) {
          break;
        }
      } while (!paramUri.endsWith(".avi"));
      int i = 16;
      break label1534;
      i = 14;
      break label1534;
      label1484:
      i = 13;
      break label1534;
      label1490:
      i = 12;
      break label1534;
      label1496:
      i = 11;
      break label1534;
      label1502:
      i = 10;
      break label1534;
      label1508:
      i = 9;
      break label1534;
      label1514:
      i = 8;
      break label1534;
      label1520:
      i = 6;
      break label1534;
      label1526:
      i = 15;
      break label1534;
      label1532:
      i = 0;
      label1534:
      if ((i != -1) && (i != j)) {
        zzb(i, localArrayList);
      }
      paramUri = zza;
      for (k = 0; k < 16; k++)
      {
        int m = paramUri[k];
        if ((m != j) && (m != i)) {
          zzb(m, localArrayList);
        }
      }
      paramUri = (zzaao[])localArrayList.toArray(new zzaao[localArrayList.size()]);
      return paramUri;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */