package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.zzh;
import com.google.android.gms.internal.games_v2.zzez;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public final class SnapshotContentsEntity
  extends zzh
  implements SnapshotContents
{
  public static final Parcelable.Creator<SnapshotContentsEntity> CREATOR = new zza();
  private static final Object zza = new Object();
  private Contents zzb;
  
  public SnapshotContentsEntity(Contents paramContents)
  {
    this.zzb = paramContents;
  }
  
  private final boolean zzc(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Preconditions.checkState(isClosed() ^ true, "Must provide a previously opened SnapshotContents");
    synchronized (zza)
    {
      Object localObject3 = this.zzb.getParcelFileDescriptor();
      Object localObject2 = new java/io/FileOutputStream;
      ((FileOutputStream)localObject2).<init>(((ParcelFileDescriptor)localObject3).getFileDescriptor());
      localObject3 = new java/io/BufferedOutputStream;
      ((BufferedOutputStream)localObject3).<init>((OutputStream)localObject2);
      try
      {
        localObject2 = ((FileOutputStream)localObject2).getChannel();
        ((FileChannel)localObject2).position(paramInt1);
        ((OutputStream)localObject3).write(paramArrayOfByte, paramInt2, paramInt3);
        if (paramBoolean) {
          ((FileChannel)localObject2).truncate(paramArrayOfByte.length);
        }
        ((OutputStream)localObject3).flush();
        return true;
      }
      catch (IOException paramArrayOfByte)
      {
        zzez.zze("SnapshotContentsEntity", "Failed to write snapshot data", paramArrayOfByte);
        return false;
      }
    }
  }
  
  public final ParcelFileDescriptor getParcelFileDescriptor()
  {
    Preconditions.checkState(isClosed() ^ true, "Cannot mutate closed contents!");
    return this.zzb.getParcelFileDescriptor();
  }
  
  public final boolean isClosed()
  {
    return this.zzb == null;
  }
  
  public final boolean modifyBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    return zzc(paramInt1, paramArrayOfByte, paramInt2, paramArrayOfByte.length, false);
  }
  
  public final byte[] readFully()
    throws IOException
  {
    Preconditions.checkState(isClosed() ^ true, "Must provide a previously opened Snapshot");
    synchronized (zza)
    {
      Object localObject3 = this.zzb.getParcelFileDescriptor();
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      localFileInputStream.<init>(((ParcelFileDescriptor)localObject3).getFileDescriptor());
      localObject3 = new java/io/BufferedInputStream;
      ((BufferedInputStream)localObject3).<init>(localFileInputStream);
      try
      {
        localFileInputStream.getChannel().position(0L);
        localObject3 = IOUtils.readInputStreamFully((InputStream)localObject3, false);
        localFileInputStream.getChannel().position(0L);
        return (byte[])localObject3;
      }
      catch (IOException localIOException)
      {
        zzez.zzh("SnapshotContentsEntity", "Failed to read snapshot data", localIOException);
        throw localIOException;
      }
    }
  }
  
  public final boolean writeBytes(byte[] paramArrayOfByte)
  {
    return zzc(0, paramArrayOfByte, 0, paramArrayOfByte.length, true);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zzb, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final Contents zza()
  {
    return this.zzb;
  }
  
  public final void zzb()
  {
    this.zzb = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\snapshot\SnapshotContentsEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */