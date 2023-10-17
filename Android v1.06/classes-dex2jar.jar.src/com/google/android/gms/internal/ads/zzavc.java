package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

public final class zzavc
{
  private final int zza;
  private final zzauz zzb = new zzave();
  
  public zzavc(int paramInt)
  {
    this.zza = paramInt;
  }
  
  public final String zza(ArrayList paramArrayList)
  {
    Object localObject1 = new StringBuilder();
    int j = paramArrayList.size();
    for (int i = 0; i < j; i++)
    {
      ((StringBuilder)localObject1).append(((String)paramArrayList.get(i)).toLowerCase(Locale.US));
      ((StringBuilder)localObject1).append('\n');
    }
    localObject1 = ((StringBuilder)localObject1).toString().split("\n");
    if (localObject1.length == 0)
    {
      paramArrayList = "";
    }
    else
    {
      paramArrayList = new zzavb();
      PriorityQueue localPriorityQueue = new PriorityQueue(this.zza, new zzava(this));
      Object localObject2;
      for (i = 0; i < localObject1.length; i++)
      {
        localObject2 = zzavd.zzb(localObject1[i], false);
        if (localObject2.length != 0) {
          zzavh.zzc((String[])localObject2, this.zza, 6, localPriorityQueue);
        }
      }
      localObject1 = localPriorityQueue.iterator();
      for (;;)
      {
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (zzavg)((Iterator)localObject1).next();
          try
          {
            localObject2 = this.zzb.zzb(((zzavg)localObject2).zzb);
            paramArrayList.zzb.write((byte[])localObject2);
          }
          catch (IOException localIOException)
          {
            zzbzt.zzh("Error while writing hash to byteStream", localIOException);
          }
        }
      }
      paramArrayList = paramArrayList.toString();
    }
    return paramArrayList;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */