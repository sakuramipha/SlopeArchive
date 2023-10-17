package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzauo
{
  int zza;
  private final Object zzb = new Object();
  private final List zzc = new LinkedList();
  
  public final zzaun zza(boolean paramBoolean)
  {
    synchronized (this.zzb)
    {
      boolean bool = this.zzc.isEmpty();
      Object localObject1 = null;
      if (bool)
      {
        zzbzt.zze("Queue empty");
        return null;
      }
      int i = this.zzc.size();
      int m = 0;
      if (i >= 2)
      {
        Iterator localIterator = this.zzc.iterator();
        int j = Integer.MIN_VALUE;
        i = 0;
        while (localIterator.hasNext())
        {
          zzaun localzzaun = (zzaun)localIterator.next();
          int n = localzzaun.zzb();
          if (n > j) {
            m = i;
          }
          int k;
          if (n > j) {
            k = n;
          } else {
            k = j;
          }
          if (n > j) {
            localObject1 = localzzaun;
          }
          i++;
          j = k;
        }
        this.zzc.remove(m);
        return (zzaun)localObject1;
      }
      localObject1 = (zzaun)this.zzc.get(0);
      if (paramBoolean) {
        this.zzc.remove(0);
      } else {
        ((zzaun)localObject1).zzi();
      }
      return (zzaun)localObject1;
    }
  }
  
  public final void zzb(zzaun paramzzaun)
  {
    synchronized (this.zzb)
    {
      if (this.zzc.size() >= 10)
      {
        i = this.zzc.size();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Queue is full, current size = ");
        localStringBuilder.append(i);
        zzbzt.zze(localStringBuilder.toString());
        this.zzc.remove(0);
      }
      int i = this.zza;
      this.zza = (i + 1);
      paramzzaun.zzj(i);
      paramzzaun.zzn();
      this.zzc.add(paramzzaun);
      return;
    }
  }
  
  public final boolean zzc(zzaun paramzzaun)
  {
    synchronized (this.zzb)
    {
      Iterator localIterator = this.zzc.iterator();
      while (localIterator.hasNext())
      {
        zzaun localzzaun = (zzaun)localIterator.next();
        if (!zzt.zzo().zzh().zzM())
        {
          if ((!paramzzaun.equals(localzzaun)) && (localzzaun.zzd().equals(paramzzaun.zzd())))
          {
            localIterator.remove();
            return true;
          }
        }
        else if ((!zzt.zzo().zzh().zzN()) && (!paramzzaun.equals(localzzaun)) && (localzzaun.zzf().equals(paramzzaun.zzf())))
        {
          localIterator.remove();
          return true;
        }
      }
      return false;
    }
  }
  
  public final boolean zzd(zzaun paramzzaun)
  {
    synchronized (this.zzb)
    {
      return this.zzc.contains(paramzzaun);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzauo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */