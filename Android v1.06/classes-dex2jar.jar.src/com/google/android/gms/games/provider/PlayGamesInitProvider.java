package com.google.android.gms.games.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.games_v2.zzbr;
import com.google.android.gms.internal.games_v2.zzez;

public class PlayGamesInitProvider
  extends ContentProvider
{
  public final void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    Preconditions.checkNotNull(paramProviderInfo, "PlayGamesSdkInitProvider ProviderInfo cannot be null.");
    if (!"com.google.android.gms.games.playgamesinitprovider".equals(paramProviderInfo.authority))
    {
      super.attachInfo(paramContext, paramProviderInfo);
      return;
    }
    throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public final String getType(Uri paramUri)
  {
    return null;
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public final boolean onCreate()
  {
    Context localContext = getContext();
    if (localContext == null)
    {
      zzez.zzg("GamesInitProvider", "No Context available. Please manually invoke PlayGamesSdk.initialize().");
      return false;
    }
    zzbr.zzc(localContext);
    return false;
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\provider\PlayGamesInitProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */