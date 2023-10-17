package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

public final class zzfaz
{
  public static ParcelFileDescriptor zza(InputStream paramInputStream)
    throws IOException
  {
    Object localObject = ParcelFileDescriptor.createPipe();
    ParcelFileDescriptor localParcelFileDescriptor = localObject[0];
    localObject = localObject[1];
    zzcag.zza.execute(new zzfay(paramInputStream, (ParcelFileDescriptor)localObject));
    return localParcelFileDescriptor;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */