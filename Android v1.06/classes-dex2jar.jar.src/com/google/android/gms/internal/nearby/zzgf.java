package com.google.android.gms.internal.nearby;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.Payload.File;
import com.google.android.gms.nearby.connection.Payload.Stream;
import java.io.File;
import java.io.FileNotFoundException;

public final class zzgf
{
  private static File zza;
  
  static Payload zza(Context paramContext, zzgd paramzzgd)
  {
    long l = paramzzgd.zza();
    int i = paramzzgd.zzb();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          Log.w("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", new Object[] { Long.valueOf(paramzzgd.zza()), Integer.valueOf(paramzzgd.zzb()) }));
          return null;
        }
        paramContext = paramzzgd.zzd();
        zzhz.zza(paramContext, "Data ParcelFileDescriptor cannot be null for type STREAM");
        return Payload.zzc(Payload.Stream.zzb(paramContext), l);
      }
      String str = paramzzgd.zze();
      Uri localUri = paramzzgd.zzh();
      if ((str != null) && (localUri != null)) {
        try
        {
          ParcelFileDescriptor localParcelFileDescriptor = paramContext.getContentResolver().openFileDescriptor(localUri, "r");
          if (localParcelFileDescriptor == null)
          {
            Log.w("NearbyConnections", String.format("Failed to get ParcelFileDescriptor for %s", new Object[] { localUri }));
            return null;
          }
          paramContext = new java/io/File;
          paramContext.<init>(str);
          paramContext = Payload.zzb(Payload.File.zza(paramContext, localParcelFileDescriptor, paramzzgd.zzf(), localUri), l);
          return paramContext;
        }
        catch (FileNotFoundException paramContext)
        {
          Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", new Object[] { localUri, str }), paramContext);
          return null;
        }
      }
      paramContext = paramzzgd.zzd();
      zzhz.zza(paramContext, "Data ParcelFileDescriptor cannot be null for type FILE");
      return Payload.zzb(Payload.File.zzb(paramContext), l);
    }
    paramContext = paramzzgd.zzi();
    if (paramContext != null) {
      paramContext = paramContext.zza();
    } else {
      paramContext = paramzzgd.zzc();
    }
    return Payload.zza((byte[])zzhz.zza(paramContext, "Payload bytes cannot be null if type is BYTES."), l);
  }
  
  public static void zzb(File paramFile)
  {
    if (paramFile == null)
    {
      Log.e("NearbyConnections", "Cannot set null temp directory");
      return;
    }
    zza = paramFile;
  }
  
  static File zzc()
  {
    return zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */