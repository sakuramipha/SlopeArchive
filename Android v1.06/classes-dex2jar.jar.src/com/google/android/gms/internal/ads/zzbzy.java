package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class zzbzy
  implements zzbzl
{
  private final String zza;
  
  public zzbzy()
  {
    this.zza = null;
  }
  
  public zzbzy(String paramString)
  {
    this.zza = paramString;
  }
  
  public boolean zza(String paramString)
  {
    boolean bool7 = false;
    boolean bool1 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool3 = bool7;
    boolean bool4 = bool1;
    boolean bool2 = bool5;
    try
    {
      if (ClientLibraryUtils.isPackageSide())
      {
        bool3 = bool7;
        bool4 = bool1;
        bool2 = bool5;
        TrafficStats.setThreadStatsTag(263);
      }
      bool3 = bool7;
      bool4 = bool1;
      bool2 = bool5;
      Object localObject1 = new java/lang/StringBuilder;
      bool3 = bool7;
      bool4 = bool1;
      bool2 = bool5;
      ((StringBuilder)localObject1).<init>();
      bool3 = bool7;
      bool4 = bool1;
      bool2 = bool5;
      ((StringBuilder)localObject1).append("Pinging URL: ");
      bool3 = bool7;
      bool4 = bool1;
      bool2 = bool5;
      ((StringBuilder)localObject1).append(paramString);
      bool3 = bool7;
      bool4 = bool1;
      bool2 = bool5;
      zzbzt.zze(((StringBuilder)localObject1).toString());
      bool3 = bool7;
      bool4 = bool1;
      bool2 = bool5;
      localObject1 = new java/net/URL;
      bool3 = bool7;
      bool4 = bool1;
      bool2 = bool5;
      ((URL)localObject1).<init>(paramString);
      bool3 = bool7;
      bool4 = bool1;
      bool2 = bool5;
      localObject1 = (HttpURLConnection)((URL)localObject1).openConnection();
      Object localObject2;
      int i;
      str = localIndexOutOfBoundsException.getMessage();
    }
    catch (RuntimeException localRuntimeException)
    {
      localRuntimeException = localRuntimeException;
      bool2 = bool3;
    }
    catch (IOException localIOException)
    {
      bool2 = bool4;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}finally
    {
      break label572;
    }
    String str;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Error while pinging URL: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(". ");
    localStringBuilder.append(str);
    zzbzt.zzj(localStringBuilder.toString());
    if (ClientLibraryUtils.isPackageSide())
    {
      TrafficStats.clearThreadStatsTag();
      return bool2;
      str = localStringBuilder.getMessage();
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Error while parsing ping URL: ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(". ");
      localStringBuilder.append(str);
      zzbzt.zzj(localStringBuilder.toString());
      if (ClientLibraryUtils.isPackageSide()) {}
    }
    else
    {
      return bool2;
    }
    TrafficStats.clearThreadStatsTag();
    return bool2;
    label572:
    if (ClientLibraryUtils.isPackageSide()) {
      TrafficStats.clearThreadStatsTag();
    }
    throw paramString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */