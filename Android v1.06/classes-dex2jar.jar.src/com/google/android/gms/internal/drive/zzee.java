package com.google.android.gms.internal.drive;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.zzi;
import java.util.ArrayList;
import java.util.List;

public final class zzee
  extends zzet
{
  private static final GmsLogger zzbz = new GmsLogger("EventCallback", "");
  private final int zzda = 1;
  private final zzi zzgt;
  private final zzeg zzgu;
  private final List<Integer> zzgv = new ArrayList();
  
  public zzee(Looper paramLooper, Context paramContext, int paramInt, zzi paramzzi)
  {
    this.zzgt = paramzzi;
    this.zzgu = new zzeg(paramLooper, paramContext, null);
  }
  
  public final void zzc(zzfp paramzzfp)
    throws RemoteException
  {
    DriveEvent localDriveEvent = paramzzfp.zzat();
    boolean bool;
    if (this.zzda == localDriveEvent.getType()) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool);
    Preconditions.checkState(this.zzgv.contains(Integer.valueOf(localDriveEvent.getType())));
    paramzzfp = this.zzgu;
    paramzzfp.sendMessage(paramzzfp.obtainMessage(1, new Pair(this.zzgt, localDriveEvent)));
  }
  
  public final void zzf(int paramInt)
  {
    this.zzgv.add(Integer.valueOf(1));
  }
  
  public final boolean zzg(int paramInt)
  {
    return this.zzgv.contains(Integer.valueOf(1));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */