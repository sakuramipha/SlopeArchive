package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import javax.annotation.Nullable;

public final class zzfme
{
  public static final int zza;
  public static final ClipData zzb = ClipData.newIntent("", new Intent());
  
  static
  {
    int i;
    if (Build.VERSION.SDK_INT > 22) {
      i = 67108864;
    } else {
      i = 0;
    }
    zza = i;
  }
  
  @Nullable
  public static PendingIntent zza(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramInt2 & 0x58) == 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzfoz.zzf(bool1, "Cannot set any dangerous parts of intent to be mutable.");
    if (((paramInt2 & 0x1) != 0) && (!zzb(0, 3))) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    zzfoz.zzf(bool1, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
    if (((paramInt2 & 0x2) != 0) && (!zzb(0, 5))) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    zzfoz.zzf(bool1, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
    if (((paramInt2 & 0x4) != 0) && (!zzb(0, 9))) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    zzfoz.zzf(bool1, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
    if (((paramInt2 & 0x80) != 0) && (!zzb(0, 17))) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    zzfoz.zzf(bool1, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
    if (paramIntent.getComponent() != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzfoz.zzf(bool1, "Must set component on Intent.");
    if (zzb(0, 1))
    {
      zzfoz.zzf(zzb(paramInt2, 67108864) ^ true, "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
    }
    else
    {
      bool1 = bool2;
      if (Build.VERSION.SDK_INT >= 23) {
        if (zzb(paramInt2, 67108864)) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      zzfoz.zzf(bool1, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
    }
    paramIntent = new Intent(paramIntent);
    if ((Build.VERSION.SDK_INT < 23) || (!zzb(paramInt2, 67108864)))
    {
      if (paramIntent.getPackage() == null) {
        paramIntent.setPackage(paramIntent.getComponent().getPackageName());
      }
      if ((!zzb(0, 3)) && (paramIntent.getAction() == null)) {
        paramIntent.setAction("");
      }
      if ((!zzb(0, 9)) && (paramIntent.getCategories() == null)) {
        paramIntent.addCategory("");
      }
      if ((!zzb(0, 5)) && (paramIntent.getData() == null)) {
        paramIntent.setDataAndType(Uri.EMPTY, "*/*");
      }
      if ((!zzb(0, 17)) && (paramIntent.getClipData() == null)) {
        paramIntent.setClipData(zzb);
      }
    }
    return PendingIntent.getService(paramContext, 0, paramIntent, paramInt2);
  }
  
  private static boolean zzb(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) == paramInt2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfme.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */