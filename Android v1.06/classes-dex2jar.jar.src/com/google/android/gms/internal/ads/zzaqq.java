package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

public final class zzaqq
{
  private static final String[] zza = { "/aclk", "/pcs/click", "/dbm/clk" };
  private final String zzb = "ad.doubleclick.net";
  private final String[] zzc = { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  private final zzaqm zzd;
  
  @Deprecated
  public zzaqq(zzaqm paramzzaqm)
  {
    this.zzd = paramzzaqm;
  }
  
  private final Uri zzg(Uri paramUri, String paramString)
    throws zzaqr
  {
    Objects.requireNonNull(paramUri);
    try
    {
      boolean bool = paramUri.getHost().equals(this.zzb);
      if (bool)
      {
        if (!paramUri.toString().contains("dc_ms="))
        {
          str1 = paramUri.toString();
          i = str1.indexOf(";adurl");
          if (i != -1)
          {
            paramUri = new java/lang/StringBuilder;
            i++;
            paramUri.<init>(str1.substring(0, i));
            paramUri.append("dc_ms");
            paramUri.append("=");
            paramUri.append(paramString);
            paramUri.append(";");
            paramUri.append(str1.substring(i));
            paramUri = Uri.parse(paramUri.toString());
          }
          else
          {
            String str2 = paramUri.getEncodedPath();
            i = str1.indexOf(str2);
            paramUri = new java/lang/StringBuilder;
            paramUri.<init>(str1.substring(0, str2.length() + i));
            paramUri.append(";");
            paramUri.append("dc_ms");
            paramUri.append("=");
            paramUri.append(paramString);
            paramUri.append(";");
            paramUri.append(str1.substring(i + str2.length()));
            paramUri = Uri.parse(paramUri.toString());
          }
          return paramUri;
        }
        paramUri = new com/google/android/gms/internal/ads/zzaqr;
        paramUri.<init>("Parameter already exists: dc_ms");
        throw paramUri;
      }
    }
    catch (UnsupportedOperationException paramUri)
    {
      String str1;
      int i;
      int j;
      throw new zzaqr("Provided Uri is not in a valid state");
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;) {}
    }
    if (paramUri.getQueryParameter("ms") == null)
    {
      str1 = paramUri.toString();
      j = str1.indexOf("&adurl");
      i = j;
      if (j == -1) {
        i = str1.indexOf("?adurl");
      }
      if (i != -1)
      {
        paramUri = new java/lang/StringBuilder;
        i++;
        paramUri.<init>(str1.substring(0, i));
        paramUri.append("ms");
        paramUri.append("=");
        paramUri.append(paramString);
        paramUri.append("&");
        paramUri.append(str1.substring(i));
        paramUri = Uri.parse(paramUri.toString());
      }
      else
      {
        paramUri = paramUri.buildUpon().appendQueryParameter("ms", paramString).build();
      }
      return paramUri;
    }
    paramUri = new com/google/android/gms/internal/ads/zzaqr;
    paramUri.<init>("Query parameter already exists: ms");
    throw paramUri;
  }
  
  @Deprecated
  public final Uri zza(Uri paramUri, Context paramContext, View paramView, Activity paramActivity)
    throws zzaqr
  {
    try
    {
      paramUri = zzg(paramUri, this.zzd.zzf(paramContext, paramUri.getQueryParameter("ai"), paramView, paramActivity));
      return paramUri;
    }
    catch (UnsupportedOperationException paramUri)
    {
      throw new zzaqr("Provided Uri is not in a valid state");
    }
  }
  
  @Deprecated
  public final Uri zzb(Uri paramUri, Context paramContext)
    throws zzaqr
  {
    return zzg(paramUri, this.zzd.zzg(paramContext));
  }
  
  @Deprecated
  public final zzaqm zzc()
  {
    return this.zzd;
  }
  
  @Deprecated
  public final void zzd(MotionEvent paramMotionEvent)
  {
    this.zzd.zzk(paramMotionEvent);
  }
  
  public final boolean zze(Uri paramUri)
  {
    if (zzf(paramUri))
    {
      String[] arrayOfString = zza;
      for (int i = 0; i < 3; i++)
      {
        String str = arrayOfString[i];
        if (paramUri.getPath().endsWith(str)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean zzf(Uri paramUri)
  {
    Objects.requireNonNull(paramUri);
    try
    {
      String str = paramUri.getHost();
      paramUri = this.zzc;
      for (int i = 0; i < 3; i++)
      {
        boolean bool = str.endsWith(paramUri[i]);
        if (bool) {
          return true;
        }
      }
    }
    catch (NullPointerException paramUri)
    {
      for (;;) {}
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */