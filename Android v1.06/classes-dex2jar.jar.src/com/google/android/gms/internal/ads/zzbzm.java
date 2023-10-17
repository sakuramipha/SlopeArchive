package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbzm
{
  public static final Handler zza = new zzflv(Looper.getMainLooper());
  private static final String zzb = AdView.class.getName();
  private static final String zzc = InterstitialAd.class.getName();
  private static final String zzd = AdManagerAdView.class.getName();
  private static final String zze = AdManagerInterstitialAd.class.getName();
  private static final String zzf = SearchAdView.class.getName();
  private static final String zzg = AdLoader.class.getName();
  private float zzh = -1.0F;
  
  private final JSONArray zzA(Collection paramCollection)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      zzB(localJSONArray, paramCollection.next());
    }
    return localJSONArray;
  }
  
  private final void zzB(JSONArray paramJSONArray, Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONArray.put(zzh((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONArray.put(zzi((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      paramJSONArray.put(zzA((Collection)paramObject));
      return;
    }
    if ((paramObject instanceof Object[]))
    {
      paramJSONArray.put(zzg((Object[])paramObject));
      return;
    }
    paramJSONArray.put(paramObject);
  }
  
  private final void zzC(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException
  {
    zzbbc localzzbbc = zzbbk.zzt;
    String str = paramString;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      str = String.valueOf(paramString);
    }
    if ((paramObject instanceof Bundle))
    {
      paramJSONObject.put(str, zzh((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONObject.put(str, zzi((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      paramJSONObject.put(String.valueOf(str), zzA((Collection)paramObject));
      return;
    }
    if ((paramObject instanceof Object[]))
    {
      paramJSONObject.put(str, zzA(Arrays.asList((Object[])paramObject)));
      return;
    }
    boolean bool = paramObject instanceof int[];
    int m = 0;
    int j = 0;
    int i = 0;
    int k = 0;
    if (bool)
    {
      paramObject = (int[])paramObject;
      if (paramObject == null)
      {
        paramString = new Integer[0];
      }
      else
      {
        j = paramObject.length;
        paramString = new Integer[j];
        for (i = k; i < j; i++) {
          paramString[i] = Integer.valueOf(paramObject[i]);
        }
      }
      paramJSONObject.put(str, zzg(paramString));
      return;
    }
    if ((paramObject instanceof double[]))
    {
      paramObject = (double[])paramObject;
      if (paramObject == null)
      {
        paramString = new Double[0];
      }
      else
      {
        j = paramObject.length;
        paramString = new Double[j];
        for (i = m; i < j; i++) {
          paramString[i] = Double.valueOf(paramObject[i]);
        }
      }
      paramJSONObject.put(str, zzg(paramString));
      return;
    }
    if ((paramObject instanceof long[]))
    {
      paramObject = (long[])paramObject;
      if (paramObject == null)
      {
        paramString = new Long[0];
      }
      else
      {
        k = paramObject.length;
        paramString = new Long[k];
        for (i = j; i < k; i++) {
          paramString[i] = Long.valueOf(paramObject[i]);
        }
      }
      paramJSONObject.put(str, zzg(paramString));
      return;
    }
    if ((paramObject instanceof boolean[]))
    {
      paramObject = (boolean[])paramObject;
      if (paramObject == null)
      {
        paramString = new Boolean[0];
      }
      else
      {
        j = paramObject.length;
        paramString = new Boolean[j];
        while (i < j)
        {
          paramString[i] = Boolean.valueOf(paramObject[i]);
          i++;
        }
      }
      paramJSONObject.put(str, zzg(paramString));
      return;
    }
    paramJSONObject.put(str, paramObject);
  }
  
  private static final void zzD(ViewGroup paramViewGroup, zzq paramzzq, String paramString, int paramInt1, int paramInt2)
  {
    if (paramViewGroup.getChildCount() != 0) {
      return;
    }
    Context localContext = paramViewGroup.getContext();
    TextView localTextView = new TextView(localContext);
    localTextView.setGravity(17);
    localTextView.setText(paramString);
    localTextView.setTextColor(paramInt1);
    localTextView.setBackgroundColor(paramInt2);
    paramString = new FrameLayout(localContext);
    paramString.setBackgroundColor(paramInt1);
    paramInt1 = zzx(localContext, 3);
    paramString.addView(localTextView, new FrameLayout.LayoutParams(paramzzq.zzf - paramInt1, paramzzq.zzc - paramInt1, 17));
    paramViewGroup.addView(paramString, paramzzq.zzf, paramzzq.zzc);
  }
  
  public static int zza(Context paramContext, int paramInt)
  {
    if (paramContext == null) {
      return -1;
    }
    Object localObject = paramContext;
    if (paramContext.getApplicationContext() != null) {
      localObject = paramContext.getApplicationContext();
    }
    localObject = ((Context)localObject).getResources();
    if (localObject == null) {
      return -1;
    }
    paramContext = ((Resources)localObject).getDisplayMetrics();
    if (paramContext == null) {
      return -1;
    }
    localObject = ((Resources)localObject).getConfiguration();
    if (localObject == null) {
      return -1;
    }
    int j = ((Configuration)localObject).orientation;
    int i = paramInt;
    if (paramInt == 0) {
      i = j;
    }
    if (i == j) {
      return Math.round(paramContext.heightPixels / paramContext.density);
    }
    return Math.round(paramContext.widthPixels / paramContext.density);
  }
  
  public static AdSize zzc(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = zza(paramContext, paramInt3);
    if (paramInt2 == -1) {
      return AdSize.INVALID;
    }
    paramInt3 = Math.min(90, Math.round(paramInt2 * 0.15F));
    if (paramInt1 > 655) {
      paramInt2 = Math.round(paramInt1 / 728.0F * 90.0F);
    } else if (paramInt1 > 632) {
      paramInt2 = 81;
    } else if (paramInt1 > 526) {
      paramInt2 = Math.round(paramInt1 / 468.0F * 60.0F);
    } else if (paramInt1 > 432) {
      paramInt2 = 68;
    } else {
      paramInt2 = Math.round(paramInt1 / 320.0F * 50.0F);
    }
    return new AdSize(paramInt1, Math.max(Math.min(paramInt2, paramInt3), 50));
  }
  
  public static String zzd()
  {
    Object localObject1 = UUID.randomUUID();
    byte[] arrayOfByte1 = BigInteger.valueOf(((UUID)localObject1).getLeastSignificantBits()).toByteArray();
    byte[] arrayOfByte2 = BigInteger.valueOf(((UUID)localObject1).getMostSignificantBits()).toByteArray();
    localObject1 = new BigInteger(1, arrayOfByte1).toString();
    int i = 0;
    while (i < 2) {
      try
      {
        Object localObject3 = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject3).update(arrayOfByte1);
        ((MessageDigest)localObject3).update(arrayOfByte2);
        Object localObject2 = new byte[8];
        System.arraycopy(((MessageDigest)localObject3).digest(), 0, localObject2, 0, 8);
        localObject3 = new java/math/BigInteger;
        ((BigInteger)localObject3).<init>(1, (byte[])localObject2);
        localObject2 = ((BigInteger)localObject3).toString();
        localObject1 = localObject2;
        i++;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
    }
    return (String)localObject1;
  }
  
  public static String zze(String paramString)
  {
    return zzz(paramString, "MD5");
  }
  
  public static String zzf(String paramString)
  {
    return zzz(paramString, "SHA-256");
  }
  
  public static boolean zzo(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return paramString.startsWith((String)zzbdm.zzd.zze());
  }
  
  public static final int zzp(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return (int)TypedValue.applyDimension(1, paramInt, paramDisplayMetrics);
  }
  
  public static final String zzq(StackTraceElement[] paramArrayOfStackTraceElement, String paramString)
  {
    int j;
    Object localObject2;
    Object localObject1;
    for (int i = 0;; i = j)
    {
      j = i + 1;
      if (j >= paramArrayOfStackTraceElement.length) {
        break;
      }
      localObject2 = paramArrayOfStackTraceElement[i];
      localObject1 = ((StackTraceElement)localObject2).getClassName();
      if (("loadAd".equalsIgnoreCase(((StackTraceElement)localObject2).getMethodName())) && ((zzb.equalsIgnoreCase((String)localObject1)) || (zzc.equalsIgnoreCase((String)localObject1)) || (zzd.equalsIgnoreCase((String)localObject1)) || (zze.equalsIgnoreCase((String)localObject1)) || (zzf.equalsIgnoreCase((String)localObject1)) || (zzg.equalsIgnoreCase((String)localObject1))))
      {
        paramArrayOfStackTraceElement = paramArrayOfStackTraceElement[j].getClassName();
        break label121;
      }
    }
    paramArrayOfStackTraceElement = null;
    label121:
    if (paramString != null)
    {
      localObject1 = new StringTokenizer(paramString, ".");
      localObject2 = new StringBuilder();
      if (((StringTokenizer)localObject1).hasMoreElements())
      {
        ((StringBuilder)localObject2).append(((StringTokenizer)localObject1).nextToken());
        for (i = 2; (i > 0) && (((StringTokenizer)localObject1).hasMoreElements()); i--)
        {
          ((StringBuilder)localObject2).append(".");
          ((StringBuilder)localObject2).append(((StringTokenizer)localObject1).nextToken());
        }
        paramString = ((StringBuilder)localObject2).toString();
      }
      if ((paramArrayOfStackTraceElement != null) && (!paramArrayOfStackTraceElement.contains(paramString))) {
        return paramArrayOfStackTraceElement;
      }
    }
    return null;
  }
  
  public static final boolean zzr()
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return (Build.FINGERPRINT.contains("generic")) || (Build.FINGERPRINT.contains("emulator"));
    }
    return Build.DEVICE.startsWith("generic");
  }
  
  public static final boolean zzs(Context paramContext, int paramInt)
  {
    return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(paramContext, paramInt) == 0;
  }
  
  public static final boolean zzt(Context paramContext)
  {
    int i = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(paramContext, 12451000);
    return (i == 0) || (i == 2);
  }
  
  public static final boolean zzu()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  public static final int zzv(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return Math.round(paramInt / paramDisplayMetrics.density);
  }
  
  public static final void zzw(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean, zzbzl paramzzbzl)
  {
    Context localContext = paramContext.getApplicationContext();
    paramString2 = localContext;
    if (localContext == null) {
      paramString2 = paramContext;
    }
    paramBundle.putString("os", Build.VERSION.RELEASE);
    paramBundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
    paramBundle.putString("appid", paramString2.getPackageName());
    paramString2 = paramString1;
    if (paramString1 == null)
    {
      int i = GoogleApiAvailabilityLight.getInstance().getApkVersion(paramContext);
      paramContext = new StringBuilder();
      paramContext.append(i);
      paramContext.append(".231700000");
      paramString2 = paramContext.toString();
    }
    paramBundle.putString("js", paramString2);
    paramString2 = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
    paramContext = paramBundle.keySet().iterator();
    while (paramContext.hasNext())
    {
      paramString1 = (String)paramContext.next();
      paramString2.appendQueryParameter(paramString1, paramBundle.getString(paramString1));
    }
    paramzzbzl.zza(paramString2.toString());
  }
  
  public static final int zzx(Context paramContext, int paramInt)
  {
    return zzp(paramContext.getResources().getDisplayMetrics(), paramInt);
  }
  
  public static final String zzy(Context paramContext)
  {
    paramContext = paramContext.getContentResolver();
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = Settings.Secure.getString(paramContext, "android_id");
    }
    if ((paramContext == null) || (zzr())) {
      paramContext = "emulator";
    }
    return zzz(paramContext, "MD5");
  }
  
  private static String zzz(String paramString1, String paramString2)
  {
    int i = 0;
    while (i < 2) {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance(paramString2);
        localMessageDigest.update(paramString1.getBytes());
        Object localObject = Locale.US;
        BigInteger localBigInteger = new java/math/BigInteger;
        localBigInteger.<init>(1, localMessageDigest.digest());
        localObject = String.format((Locale)localObject, "%032X", new Object[] { localBigInteger });
        return (String)localObject;
      }
      catch (ArithmeticException paramString1)
      {
        return null;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i++;
      }
    }
    return null;
  }
  
  public final int zzb(Context paramContext, int paramInt)
  {
    if (this.zzh < 0.0F) {
      try
      {
        if (this.zzh < 0.0F)
        {
          paramContext = (WindowManager)paramContext.getSystemService("window");
          if (paramContext == null) {
            return 0;
          }
          paramContext = paramContext.getDefaultDisplay();
          DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
          localDisplayMetrics.<init>();
          paramContext.getMetrics(localDisplayMetrics);
          this.zzh = localDisplayMetrics.density;
        }
      }
      finally {}
    }
    return Math.round(paramInt / this.zzh);
  }
  
  final JSONArray zzg(Object[] paramArrayOfObject)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    int j = paramArrayOfObject.length;
    for (int i = 0; i < j; i++) {
      zzB(localJSONArray, paramArrayOfObject[i]);
    }
    return localJSONArray;
  }
  
  public final JSONObject zzh(Bundle paramBundle)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      zzC(localJSONObject, str, paramBundle.get(str));
    }
    return localJSONObject;
  }
  
  public final JSONObject zzi(Map paramMap)
    throws JSONException
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        zzC(localJSONObject, str, paramMap.get(str));
      }
      return localJSONObject;
    }
    catch (ClassCastException paramMap)
    {
      throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(paramMap.getMessage())));
    }
  }
  
  public final JSONObject zzj(Bundle paramBundle, JSONObject paramJSONObject)
  {
    Object localObject = null;
    paramJSONObject = (JSONObject)localObject;
    if (paramBundle != null) {
      try
      {
        paramJSONObject = zzh(paramBundle);
      }
      catch (JSONException paramBundle)
      {
        zzbzt.zzh("Error converting Bundle to JSON", paramBundle);
        paramJSONObject = (JSONObject)localObject;
      }
    }
    return paramJSONObject;
  }
  
  public final void zzk(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
    throws JSONException
  {
    Iterator localIterator = paramJSONObject2.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramJSONObject2.get(str);
      try
      {
        Object localObject2 = paramJSONObject1.get(str);
        if ((JSONObject.class.isInstance(localObject2)) && (JSONObject.class.isInstance(localObject1))) {
          zzk((JSONObject)localObject2, (JSONObject)localObject1);
        }
      }
      catch (JSONException localJSONException)
      {
        paramJSONObject1.put(str, localObject1);
      }
    }
  }
  
  public final void zzl(ViewGroup paramViewGroup, zzq paramzzq, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      zzbzt.zzj(paramString2);
    }
    zzD(paramViewGroup, paramzzq, paramString1, -65536, -16777216);
  }
  
  public final void zzm(ViewGroup paramViewGroup, zzq paramzzq, String paramString)
  {
    zzD(paramViewGroup, paramzzq, "Ads by Google", -16777216, -1);
  }
  
  public final void zzn(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    zzw(paramContext, paramString1, "gmob-apps", paramBundle, true, new zzbzj(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */