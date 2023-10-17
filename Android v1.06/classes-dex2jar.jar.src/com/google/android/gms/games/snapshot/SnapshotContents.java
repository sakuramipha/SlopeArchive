package com.google.android.gms.games.snapshot;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import java.io.IOException;

public abstract interface SnapshotContents
  extends Parcelable
{
  public abstract ParcelFileDescriptor getParcelFileDescriptor();
  
  public abstract boolean isClosed();
  
  public abstract boolean modifyBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
  
  public abstract byte[] readFully()
    throws IOException;
  
  public abstract boolean writeBytes(byte[] paramArrayOfByte);
  
  public abstract Contents zza();
  
  public abstract void zzb();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\snapshot\SnapshotContents.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */