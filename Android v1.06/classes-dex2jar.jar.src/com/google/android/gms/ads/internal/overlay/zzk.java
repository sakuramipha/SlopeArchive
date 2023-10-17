package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzflv;

final class zzk
  extends zzb
{
  final zzl zza;
  
  public final void zza()
  {
    Bitmap localBitmap1 = zzt.zzu().zza(Integer.valueOf(this.zza.zzc.zzo.zzf));
    if (localBitmap1 != null)
    {
      zzt.zzp();
      Object localObject1 = this.zza;
      Activity localActivity = ((zzl)localObject1).zzb;
      localObject1 = ((zzl)localObject1).zzc.zzo;
      boolean bool = ((zzj)localObject1).zzd;
      float f = ((zzj)localObject1).zze;
      BitmapDrawable localBitmapDrawable;
      if ((bool) && (f > 0.0F) && (f <= 25.0F)) {
        try
        {
          Object localObject3 = Bitmap.createScaledBitmap(localBitmap1, localBitmap1.getWidth(), localBitmap1.getHeight(), false);
          Bitmap localBitmap2 = Bitmap.createBitmap((Bitmap)localObject3);
          Object localObject2 = RenderScript.create(localActivity);
          localObject1 = ScriptIntrinsicBlur.create((RenderScript)localObject2, Element.U8_4((RenderScript)localObject2));
          localObject3 = Allocation.createFromBitmap((RenderScript)localObject2, (Bitmap)localObject3);
          localObject2 = Allocation.createFromBitmap((RenderScript)localObject2, localBitmap2);
          ((ScriptIntrinsicBlur)localObject1).setRadius(f);
          ((ScriptIntrinsicBlur)localObject1).setInput((Allocation)localObject3);
          ((ScriptIntrinsicBlur)localObject1).forEach((Allocation)localObject2);
          ((Allocation)localObject2).copyTo(localBitmap2);
          localObject1 = new android/graphics/drawable/BitmapDrawable;
          ((BitmapDrawable)localObject1).<init>(localActivity.getResources(), localBitmap2);
        }
        catch (RuntimeException localRuntimeException)
        {
          localBitmapDrawable = new BitmapDrawable(localActivity.getResources(), localBitmap1);
        }
      } else {
        localBitmapDrawable = new BitmapDrawable(localActivity.getResources(), localBitmap1);
      }
      zzs.zza.post(new zzi(this, localBitmapDrawable));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */