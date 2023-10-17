package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zza
  extends Thread
{
  zza(AdvertisingIdClient paramAdvertisingIdClient, Map paramMap) {}
  
  public final void run()
  {
    Map localMap = this.zza;
    Uri.Builder localBuilder = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localBuilder.appendQueryParameter(str, (String)localMap.get(str));
    }
    zzc.zza(localBuilder.build().toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\identifier\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */