package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class Storage
{
  private static final Lock zaa = new ReentrantLock();
  private static Storage zab;
  private final Lock zac = new ReentrantLock();
  private final SharedPreferences zad;
  
  Storage(Context paramContext)
  {
    this.zad = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }
  
  public static Storage getInstance(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    Lock localLock = zaa;
    localLock.lock();
    try
    {
      if (zab == null)
      {
        Storage localStorage = new com/google/android/gms/auth/api/signin/internal/Storage;
        localStorage.<init>(paramContext.getApplicationContext());
        zab = localStorage;
      }
      paramContext = zab;
      localLock.unlock();
      return paramContext;
    }
    finally
    {
      zaa.unlock();
    }
  }
  
  private static final String zae(String paramString1, String paramString2)
  {
    int i = String.valueOf(paramString2).length();
    StringBuilder localStringBuilder = new StringBuilder(paramString1.length() + 1 + i);
    localStringBuilder.append(paramString1);
    localStringBuilder.append(":");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  public void clear()
  {
    this.zac.lock();
    try
    {
      this.zad.edit().clear().apply();
      return;
    }
    finally
    {
      this.zac.unlock();
    }
  }
  
  public GoogleSignInAccount getSavedDefaultGoogleSignInAccount()
  {
    Object localObject1 = zaa("defaultGoogleSignInAccount");
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject3 = null;
    String str;
    if (bool)
    {
      localObject1 = localObject3;
    }
    else
    {
      str = zaa(zae("googleSignInAccount", (String)localObject1));
      localObject1 = localObject3;
      if (str == null) {}
    }
    try
    {
      localObject1 = GoogleSignInAccount.zab(str);
      return (GoogleSignInAccount)localObject1;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2 = localObject3;
      }
    }
  }
  
  public GoogleSignInOptions getSavedDefaultGoogleSignInOptions()
  {
    Object localObject1 = zaa("defaultGoogleSignInAccount");
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject3 = null;
    String str;
    if (bool)
    {
      localObject1 = localObject3;
    }
    else
    {
      str = zaa(zae("googleSignInOptions", (String)localObject1));
      localObject1 = localObject3;
      if (str == null) {}
    }
    try
    {
      localObject1 = GoogleSignInOptions.zab(str);
      return (GoogleSignInOptions)localObject1;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2 = localObject3;
      }
    }
  }
  
  public String getSavedRefreshToken()
  {
    return zaa("refreshToken");
  }
  
  public void saveDefaultGoogleSignInAccount(GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptions paramGoogleSignInOptions)
  {
    Preconditions.checkNotNull(paramGoogleSignInAccount);
    Preconditions.checkNotNull(paramGoogleSignInOptions);
    zad("defaultGoogleSignInAccount", paramGoogleSignInAccount.zac());
    Preconditions.checkNotNull(paramGoogleSignInAccount);
    Preconditions.checkNotNull(paramGoogleSignInOptions);
    String str = paramGoogleSignInAccount.zac();
    zad(zae("googleSignInAccount", str), paramGoogleSignInAccount.zad());
    zad(zae("googleSignInOptions", str), paramGoogleSignInOptions.zaf());
  }
  
  protected final String zaa(String paramString)
  {
    this.zac.lock();
    try
    {
      paramString = this.zad.getString(paramString, null);
      return paramString;
    }
    finally
    {
      this.zac.unlock();
    }
  }
  
  protected final void zab(String paramString)
  {
    this.zac.lock();
    try
    {
      this.zad.edit().remove(paramString).apply();
      return;
    }
    finally
    {
      this.zac.unlock();
    }
  }
  
  public final void zac()
  {
    String str = zaa("defaultGoogleSignInAccount");
    zab("defaultGoogleSignInAccount");
    if (TextUtils.isEmpty(str)) {
      return;
    }
    zab(zae("googleSignInAccount", str));
    zab(zae("googleSignInOptions", str));
  }
  
  protected final void zad(String paramString1, String paramString2)
  {
    this.zac.lock();
    try
    {
      this.zad.edit().putString(paramString1, paramString2).apply();
      return;
    }
    finally
    {
      this.zac.unlock();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\Storage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */