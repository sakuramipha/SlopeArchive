package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzet
{
  public static void zza(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    if (paramInt != -1) {
      paramMediaFormat.setInteger(paramString, paramInt);
    }
  }
  
  public static void zzb(MediaFormat paramMediaFormat, List paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("csd-");
      localStringBuilder.append(i);
      paramMediaFormat.setByteBuffer(localStringBuilder.toString(), ByteBuffer.wrap((byte[])paramList.get(i)));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */