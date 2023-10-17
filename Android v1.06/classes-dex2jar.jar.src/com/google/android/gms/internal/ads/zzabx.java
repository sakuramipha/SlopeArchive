package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

public final class zzabx
{
  public static int zza(int paramInt)
  {
    int j = 0;
    int i = paramInt;
    for (paramInt = j; i > 0; paramInt++) {
      i >>>= 1;
    }
    return paramInt;
  }
  
  public static zzca zzb(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      Object localObject2 = (String)paramList.get(i);
      int j = zzfn.zza;
      Object localObject1 = ((String)localObject2).split("=", 2);
      if (localObject1.length != 2) {
        zzer.zze("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(localObject2)));
      } else if (localObject1[0].equals("METADATA_BLOCK_PICTURE")) {
        try
        {
          localObject1 = Base64.decode(localObject1[1], 0);
          localObject2 = new com/google/android/gms/internal/ads/zzfd;
          ((zzfd)localObject2).<init>((byte[])localObject1);
          localArrayList.add(zzadk.zzb((zzfd)localObject2));
        }
        catch (RuntimeException localRuntimeException)
        {
          zzer.zzf("VorbisUtil", "Failed to parse vorbis picture", localRuntimeException);
        }
      } else {
        localArrayList.add(new zzafd(localRuntimeException[0], localRuntimeException[1]));
      }
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    return new zzca(localArrayList);
  }
  
  public static zzabu zzc(zzfd paramzzfd, boolean paramBoolean1, boolean paramBoolean2)
    throws zzce
  {
    int j = 0;
    if (paramBoolean1) {
      zzd(3, paramzzfd, false);
    }
    String str2 = paramzzfd.zzx((int)paramzzfd.zzq(), zzfol.zzc);
    int i = str2.length();
    long l = paramzzfd.zzq();
    String[] arrayOfString = new String[(int)l];
    i += 15;
    while (j < l)
    {
      String str1 = paramzzfd.zzx((int)paramzzfd.zzq(), zzfol.zzc);
      arrayOfString[j] = str1;
      i = i + 4 + str1.length();
      j++;
    }
    if ((paramBoolean2) && ((paramzzfd.zzk() & 0x1) == 0)) {
      throw zzce.zza("framing bit expected to be set", null);
    }
    return new zzabu(str2, arrayOfString, i + 1);
  }
  
  public static boolean zzd(int paramInt, zzfd paramzzfd, boolean paramBoolean)
    throws zzce
  {
    if (paramzzfd.zza() < 7)
    {
      if (paramBoolean) {
        return false;
      }
      paramInt = paramzzfd.zza();
      paramzzfd = new StringBuilder();
      paramzzfd.append("too short header: ");
      paramzzfd.append(paramInt);
      throw zzce.zza(paramzzfd.toString(), null);
    }
    if (paramzzfd.zzk() != paramInt)
    {
      if (paramBoolean) {
        return false;
      }
      throw zzce.zza("expected header type ".concat(String.valueOf(Integer.toHexString(paramInt))), null);
    }
    if ((paramzzfd.zzk() == 118) && (paramzzfd.zzk() == 111) && (paramzzfd.zzk() == 114) && (paramzzfd.zzk() == 98) && (paramzzfd.zzk() == 105) && (paramzzfd.zzk() == 115)) {
      return true;
    }
    if (paramBoolean) {
      return false;
    }
    throw zzce.zza("expected characters 'vorbis'", null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */