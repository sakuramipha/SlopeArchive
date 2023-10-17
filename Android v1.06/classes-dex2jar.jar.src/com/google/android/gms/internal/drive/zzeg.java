package com.google.android.gms.internal.drive;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.CompletionListener;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.zzb;
import com.google.android.gms.drive.events.zzd;
import com.google.android.gms.drive.events.zzi;
import com.google.android.gms.drive.events.zzk;
import com.google.android.gms.drive.events.zzl;
import com.google.android.gms.drive.events.zzo;
import com.google.android.gms.drive.events.zzq;
import com.google.android.gms.drive.events.zzr;

final class zzeg
  extends zzir
{
  private final Context zzgw;
  
  private zzeg(Looper paramLooper, Context paramContext)
  {
    super(paramLooper);
    this.zzgw = paramContext;
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what != 1)
    {
      zzee.zzai().efmt("EventCallback", "Don't know how to handle this event in context %s", new Object[] { this.zzgw });
      return;
    }
    Object localObject = (Pair)paramMessage.obj;
    paramMessage = (zzi)((Pair)localObject).first;
    localObject = (DriveEvent)((Pair)localObject).second;
    int i = ((DriveEvent)localObject).getType();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 8)
            {
              zzee.zzai().wfmt("EventCallback", "Unexpected event: %s", new Object[] { localObject });
              return;
            }
            localObject = new zze(((zzr)localObject).zzac());
            ((zzl)paramMessage).zza((zzk)localObject);
            return;
          }
          ((zzd)paramMessage).zza((zzb)localObject);
          return;
        }
        paramMessage = (zzq)paramMessage;
        zzo localzzo = (zzo)localObject;
        localObject = localzzo.zzz();
        if (localObject != null) {
          paramMessage.zza(new zzeh(new MetadataBuffer((DataHolder)localObject)));
        }
        if (localzzo.zzaa()) {
          paramMessage.zzc(localzzo.zzab());
        }
        return;
      }
      ((CompletionListener)paramMessage).onCompletion((CompletionEvent)localObject);
      return;
    }
    ((ChangeListener)paramMessage).onChange((ChangeEvent)localObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzeg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */