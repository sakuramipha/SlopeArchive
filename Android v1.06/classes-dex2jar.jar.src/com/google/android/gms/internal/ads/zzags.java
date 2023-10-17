package com.google.android.gms.internal.ads;

final class zzags
{
  static final String[] zza = { "Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient" };
  public static final int zzb = 0;
  
  public static zzbz zza(zzfd paramzzfd)
  {
    n = paramzzfd.zzc() + paramzzfd.zze();
    i = paramzzfd.zze();
    j = i >> 24 & 0xFF;
    localObject4 = null;
    Object localObject6 = null;
    Object localObject1 = null;
    Object localObject5 = null;
    if ((j == 169) || (j == 253) || (i == 1735291493)) {}
    try
    {
      i = zzb(paramzzfd);
      if ((i > 0) && (i <= 192)) {
        localObject1 = zza[(i - 1)];
      } else {
        localObject1 = null;
      }
      if (localObject1 != null)
      {
        localObject1 = new zzaen("TCON", null, zzfrr.zzm(localObject1));
      }
      else
      {
        zzer.zze("MetadataUtil", "Failed to parse standard genre code");
        localObject1 = localObject5;
      }
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    finally
    {
      break label1309;
      if ((j == 7233901) || (j == 7631467)) {
        break label1290;
      }
      if ((j == 6516589) || (j == 7828084)) {
        break label1271;
      }
      if (j != 6578553) {
        break label1063;
      }
      localObject3 = zze(i, "TDRC", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject3;
      if (j != 4280916) {
        break label1089;
      }
      localObject3 = zze(i, "TPE1", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject3;
      if (j != 7630703) {
        break label1115;
      }
      localObject3 = zze(i, "TSSE", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject3;
      if (j != 6384738) {
        break label1141;
      }
      localObject3 = zze(i, "TALB", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject3;
      if (j != 7108978) {
        break label1167;
      }
      localObject3 = zze(i, "USLT", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject3;
      if (j != 6776174) {
        break label1193;
      }
      localObject3 = zze(i, "TCON", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject3;
      if (j != 6779504) {
        break label1219;
      }
      localObject3 = zze(i, "TIT1", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject3;
      localObject3 = zzagc.zzf(i);
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      ((StringBuilder)localObject4).append("Skipped unknown metadata entry: ");
      ((StringBuilder)localObject4).append((String)localObject3);
      zzer.zza("MetadataUtil", ((StringBuilder)localObject4).toString());
      paramzzfd.zzF(n);
      return null;
      localObject3 = zze(i, "TCOM", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject3;
      localObject3 = zze(i, "TIT2", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject3;
      paramzzfd.zzF(n);
    }
    if (i == 1684632427)
    {
      localObject1 = zzd(1684632427, "TPOS", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1953655662)
    {
      localObject1 = zzd(1953655662, "TRCK", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1953329263)
    {
      localObject1 = zzc(1953329263, "TBPM", paramzzfd, true, false);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1668311404)
    {
      localObject1 = zzc(1668311404, "TCMP", paramzzfd, true, true);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1668249202)
    {
      j = paramzzfd.zze();
      if (paramzzfd.zze() == 1684108385)
      {
        i = paramzzfd.zze() & 0xFFFFFF;
        if (i == 13)
        {
          localObject1 = "image/jpeg";
        }
        else if (i == 14)
        {
          localObject1 = "image/png";
          i = 14;
        }
        else
        {
          localObject1 = null;
        }
        if (localObject1 == null)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Unrecognized cover art flags: ");
          ((StringBuilder)localObject1).append(i);
          zzer.zze("MetadataUtil", ((StringBuilder)localObject1).toString());
          localObject1 = localObject4;
        }
        else
        {
          paramzzfd.zzG(4);
          i = j - 16;
          localObject4 = new byte[i];
          paramzzfd.zzB((byte[])localObject4, 0, i);
          localObject1 = new zzadq((String)localObject1, null, 3, (byte[])localObject4);
        }
      }
      else
      {
        zzer.zze("MetadataUtil", "Failed to parse cover art attribute");
        localObject1 = localObject4;
      }
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1631670868)
    {
      localObject1 = zze(1631670868, "TPE2", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1936682605)
    {
      localObject1 = zze(1936682605, "TSOT", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1936679276)
    {
      localObject1 = zze(1936679276, "TSO2", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1936679282)
    {
      localObject1 = zze(1936679282, "TSOA", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1936679265)
    {
      localObject1 = zze(1936679265, "TSOP", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1936679791)
    {
      localObject1 = zze(1936679791, "TSOC", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1920233063)
    {
      localObject1 = zzc(1920233063, "ITUNESADVISORY", paramzzfd, false, false);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1885823344)
    {
      localObject1 = zzc(1885823344, "ITUNESGAPLESS", paramzzfd, false, true);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1936683886)
    {
      localObject1 = zze(1936683886, "TVSHOWSORT", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 1953919848)
    {
      localObject1 = zze(1953919848, "TVSHOW", paramzzfd);
      paramzzfd.zzF(n);
      return (zzbz)localObject1;
    }
    if (i == 757935405)
    {
      localObject4 = null;
      localObject1 = null;
      i = -1;
      j = -1;
      while (paramzzfd.zzc() < n)
      {
        int m = paramzzfd.zzc();
        int k = paramzzfd.zze();
        int i1 = paramzzfd.zze();
        paramzzfd.zzG(4);
        if (i1 == 1835360622)
        {
          localObject4 = paramzzfd.zzw(k - 12);
        }
        else if (i1 == 1851878757)
        {
          localObject1 = paramzzfd.zzw(k - 12);
        }
        else
        {
          if (i1 == 1684108385) {
            j = k;
          }
          if (i1 == 1684108385) {
            i = m;
          }
          paramzzfd.zzG(k - 12);
        }
      }
      localObject5 = localObject6;
      if (localObject4 != null)
      {
        localObject5 = localObject6;
        if (localObject1 != null) {
          if (i == -1)
          {
            localObject5 = localObject6;
          }
          else
          {
            paramzzfd.zzF(i);
            paramzzfd.zzG(16);
            localObject5 = new zzaeh((String)localObject4, (String)localObject1, paramzzfd.zzw(j - 16));
          }
        }
      }
      paramzzfd.zzF(n);
      return (zzbz)localObject5;
      j = i & 0xFFFFFF;
      if (j == 6516084)
      {
        j = paramzzfd.zze();
        if (paramzzfd.zze() == 1684108385)
        {
          paramzzfd.zzG(8);
          localObject1 = paramzzfd.zzw(j - 16);
          localObject1 = new zzady("und", (String)localObject1, (String)localObject1);
        }
        else
        {
          zzer.zze("MetadataUtil", "Failed to parse comment attribute: ".concat(zzagc.zzf(i)));
        }
        paramzzfd.zzF(n);
        return (zzbz)localObject1;
      }
    }
  }
  
  private static int zzb(zzfd paramzzfd)
  {
    paramzzfd.zzG(4);
    if (paramzzfd.zze() == 1684108385)
    {
      paramzzfd.zzG(8);
      return paramzzfd.zzk();
    }
    zzer.zze("MetadataUtil", "Failed to parse uint8 attribute value");
    return -1;
  }
  
  private static zzaef zzc(int paramInt, String paramString, zzfd paramzzfd, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = zzb(paramzzfd);
    int i = j;
    if (paramBoolean2) {
      i = Math.min(1, j);
    }
    if (i >= 0)
    {
      if (paramBoolean1) {
        paramString = new zzaen(paramString, null, zzfrr.zzm(Integer.toString(i)));
      } else {
        paramString = new zzady("und", paramString, Integer.toString(i));
      }
      return paramString;
    }
    zzer.zze("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzagc.zzf(paramInt)));
    return null;
  }
  
  private static zzaen zzd(int paramInt, String paramString, zzfd paramzzfd)
  {
    int i = paramzzfd.zze();
    if ((paramzzfd.zze() == 1684108385) && (i >= 22))
    {
      paramzzfd.zzG(10);
      i = paramzzfd.zzo();
      if (i > 0)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append(i);
        localObject = ((StringBuilder)localObject).toString();
        paramInt = paramzzfd.zzo();
        paramzzfd = (zzfd)localObject;
        if (paramInt > 0)
        {
          paramzzfd = new StringBuilder();
          paramzzfd.append((String)localObject);
          paramzzfd.append("/");
          paramzzfd.append(paramInt);
          paramzzfd = paramzzfd.toString();
        }
        return new zzaen(paramString, null, zzfrr.zzm(paramzzfd));
      }
    }
    zzer.zze("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzagc.zzf(paramInt)));
    return null;
  }
  
  private static zzaen zze(int paramInt, String paramString, zzfd paramzzfd)
  {
    int i = paramzzfd.zze();
    if (paramzzfd.zze() == 1684108385)
    {
      paramzzfd.zzG(8);
      return new zzaen(paramString, null, zzfrr.zzm(paramzzfd.zzw(i - 16)));
    }
    zzer.zze("MetadataUtil", "Failed to parse text attribute: ".concat(zzagc.zzf(paramInt)));
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzags.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */