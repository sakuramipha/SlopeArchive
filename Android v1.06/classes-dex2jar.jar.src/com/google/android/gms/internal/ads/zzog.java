package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat.Builder;
import android.media.AudioTrack;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

final class zzog
{
  private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();
  
  public static int zza(int paramInt1, int paramInt2)
  {
    for (int i = 8; i > 0; i--) {
      if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(paramInt1).setSampleRate(paramInt2).setChannelMask(zzfn.zzf(i)).build(), zza)) {
        return i;
      }
    }
    return 0;
  }
  
  public static int[] zzb()
  {
    Object localObject2 = new zzfro();
    Object localObject1 = zzoh.zzb().zzh().zze();
    while (((Iterator)localObject1).hasNext())
    {
      i = ((Integer)((Iterator)localObject1).next()).intValue();
      if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), zza)) {
        ((zzfro)localObject2).zzf(Integer.valueOf(i));
      }
    }
    ((zzfro)localObject2).zzf(Integer.valueOf(2));
    localObject2 = ((zzfro)localObject2).zzi().toArray();
    int j = localObject2.length;
    localObject1 = new int[j];
    for (int i = 0; i < j; i++)
    {
      Object localObject3 = localObject2[i];
      Objects.requireNonNull(localObject3);
      localObject1[i] = ((Number)localObject3).intValue();
    }
    return (int[])localObject1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */