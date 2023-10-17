package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import androidx.core.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdsj
{
  private final Context zza;
  private final ApplicationInfo zzb;
  private final int zzc;
  private final int zzd;
  private String zze = "";
  
  public zzdsj(Context paramContext)
  {
    this.zza = paramContext;
    this.zzb = paramContext.getApplicationInfo();
    paramContext = zzbbk.zziE;
    this.zzc = ((Integer)zzba.zzc().zzb(paramContext)).intValue();
    paramContext = zzbbk.zziF;
    this.zzd = ((Integer)zzba.zzc().zzb(paramContext)).intValue();
  }
  
  public final JSONObject zza()
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("name", Wrappers.packageManager(this.zza).getApplicationLabel(this.zzb.packageName));
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException1) {}
    localJSONObject.put("packageName", this.zzb.packageName);
    zzt.zzp();
    localJSONObject.put("adMobAppId", zzs.zzn(this.zza));
    if (this.zze.isEmpty())
    {
      Object localObject;
      try
      {
        Drawable localDrawable = (Drawable)Wrappers.packageManager(this.zza).getApplicationLabelAndIcon(this.zzb.packageName).second;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2)
      {
        localObject = null;
      }
      if (localObject == null)
      {
        localObject = "";
      }
      else
      {
        ((Drawable)localObject).setBounds(0, 0, this.zzc, this.zzd);
        Bitmap localBitmap = Bitmap.createBitmap(this.zzc, this.zzd, Bitmap.Config.ARGB_8888);
        ((Drawable)localObject).draw(new Canvas(localBitmap));
        localObject = new ByteArrayOutputStream();
        localBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
        localObject = Base64.encodeToString(((ByteArrayOutputStream)localObject).toByteArray(), 2);
      }
      this.zze = ((String)localObject);
    }
    if (!this.zze.isEmpty())
    {
      localJSONObject.put("icon", this.zze);
      localJSONObject.put("iconWidthPx", this.zzc);
      localJSONObject.put("iconHeightPx", this.zzd);
    }
    return localJSONObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdsj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */