package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.FontsContractCompat.FontInfo;
import androidx.core.provider.FontsContractCompat.FontRequestCallback;

public class TypefaceCompat
{
  private static final LruCache<String, Typeface> sTypefaceCache = new LruCache(16);
  private static final TypefaceCompatBaseImpl sTypefaceCompatImpl;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 29) {
      sTypefaceCompatImpl = new TypefaceCompatApi29Impl();
    } else if (Build.VERSION.SDK_INT >= 28) {
      sTypefaceCompatImpl = new TypefaceCompatApi28Impl();
    } else if (Build.VERSION.SDK_INT >= 26) {
      sTypefaceCompatImpl = new TypefaceCompatApi26Impl();
    } else if ((Build.VERSION.SDK_INT >= 24) && (TypefaceCompatApi24Impl.isUsable())) {
      sTypefaceCompatImpl = new TypefaceCompatApi24Impl();
    } else if (Build.VERSION.SDK_INT >= 21) {
      sTypefaceCompatImpl = new TypefaceCompatApi21Impl();
    } else {
      sTypefaceCompatImpl = new TypefaceCompatBaseImpl();
    }
  }
  
  public static void clearCache()
  {
    sTypefaceCache.evictAll();
  }
  
  public static Typeface create(Context paramContext, Typeface paramTypeface, int paramInt)
  {
    if (paramContext != null)
    {
      if (Build.VERSION.SDK_INT < 21)
      {
        paramContext = getBestFontFromFamily(paramContext, paramTypeface, paramInt);
        if (paramContext != null) {
          return paramContext;
        }
      }
      return Typeface.create(paramTypeface, paramInt);
    }
    throw new IllegalArgumentException("Context cannot be null");
  }
  
  public static Typeface createFromFontInfo(Context paramContext, CancellationSignal paramCancellationSignal, FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    return sTypefaceCompatImpl.createFromFontInfo(paramContext, paramCancellationSignal, paramArrayOfFontInfo, paramInt);
  }
  
  public static Typeface createFromResourcesFamilyXml(Context paramContext, FontResourcesParserCompat.FamilyResourceEntry paramFamilyResourceEntry, Resources paramResources, int paramInt1, int paramInt2, ResourcesCompat.FontCallback paramFontCallback, Handler paramHandler, boolean paramBoolean)
  {
    if ((paramFamilyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry))
    {
      paramFamilyResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry)paramFamilyResourceEntry;
      Typeface localTypeface = getSystemFontFamily(paramFamilyResourceEntry.getSystemFontFamilyName());
      if (localTypeface != null)
      {
        if (paramFontCallback != null) {
          paramFontCallback.callbackSuccessAsync(localTypeface, paramHandler);
        }
        return localTypeface;
      }
      boolean bool;
      if (paramBoolean ? paramFamilyResourceEntry.getFetchStrategy() == 0 : paramFontCallback == null) {
        bool = true;
      } else {
        bool = false;
      }
      int i;
      if (paramBoolean) {
        i = paramFamilyResourceEntry.getTimeout();
      } else {
        i = -1;
      }
      paramHandler = ResourcesCompat.FontCallback.getHandler(paramHandler);
      paramFontCallback = new ResourcesCallbackAdapter(paramFontCallback);
      paramContext = FontsContractCompat.requestFont(paramContext, paramFamilyResourceEntry.getRequest(), paramInt2, bool, i, paramHandler, paramFontCallback);
    }
    else
    {
      paramFamilyResourceEntry = sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(paramContext, (FontResourcesParserCompat.FontFamilyFilesResourceEntry)paramFamilyResourceEntry, paramResources, paramInt2);
      paramContext = paramFamilyResourceEntry;
      if (paramFontCallback != null) {
        if (paramFamilyResourceEntry != null)
        {
          paramFontCallback.callbackSuccessAsync(paramFamilyResourceEntry, paramHandler);
          paramContext = paramFamilyResourceEntry;
        }
        else
        {
          paramFontCallback.callbackFailAsync(-3, paramHandler);
          paramContext = paramFamilyResourceEntry;
        }
      }
    }
    if (paramContext != null) {
      sTypefaceCache.put(createResourceUid(paramResources, paramInt1, paramInt2), paramContext);
    }
    return paramContext;
  }
  
  public static Typeface createFromResourcesFontFile(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    paramContext = sTypefaceCompatImpl.createFromResourcesFontFile(paramContext, paramResources, paramInt1, paramString, paramInt2);
    if (paramContext != null)
    {
      paramResources = createResourceUid(paramResources, paramInt1, paramInt2);
      sTypefaceCache.put(paramResources, paramContext);
    }
    return paramContext;
  }
  
  private static String createResourceUid(Resources paramResources, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramResources.getResourcePackageName(paramInt1));
    localStringBuilder.append("-");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append("-");
    localStringBuilder.append(paramInt2);
    return localStringBuilder.toString();
  }
  
  public static Typeface findFromCache(Resources paramResources, int paramInt1, int paramInt2)
  {
    return (Typeface)sTypefaceCache.get(createResourceUid(paramResources, paramInt1, paramInt2));
  }
  
  private static Typeface getBestFontFromFamily(Context paramContext, Typeface paramTypeface, int paramInt)
  {
    TypefaceCompatBaseImpl localTypefaceCompatBaseImpl = sTypefaceCompatImpl;
    paramTypeface = localTypefaceCompatBaseImpl.getFontFamily(paramTypeface);
    if (paramTypeface == null) {
      return null;
    }
    return localTypefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(paramContext, paramTypeface, paramContext.getResources(), paramInt);
  }
  
  private static Typeface getSystemFontFamily(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramString != null) {
      if (paramString.isEmpty())
      {
        localObject1 = localObject2;
      }
      else
      {
        paramString = Typeface.create(paramString, 0);
        Typeface localTypeface = Typeface.create(Typeface.DEFAULT, 0);
        localObject1 = localObject2;
        if (paramString != null)
        {
          localObject1 = localObject2;
          if (!paramString.equals(localTypeface)) {
            localObject1 = paramString;
          }
        }
      }
    }
    return (Typeface)localObject1;
  }
  
  public static class ResourcesCallbackAdapter
    extends FontsContractCompat.FontRequestCallback
  {
    private ResourcesCompat.FontCallback mFontCallback;
    
    public ResourcesCallbackAdapter(ResourcesCompat.FontCallback paramFontCallback)
    {
      this.mFontCallback = paramFontCallback;
    }
    
    public void onTypefaceRequestFailed(int paramInt)
    {
      ResourcesCompat.FontCallback localFontCallback = this.mFontCallback;
      if (localFontCallback != null) {
        localFontCallback.onFontRetrievalFailed(paramInt);
      }
    }
    
    public void onTypefaceRetrieved(Typeface paramTypeface)
    {
      ResourcesCompat.FontCallback localFontCallback = this.mFontCallback;
      if (localFontCallback != null) {
        localFontCallback.onFontRetrieved(paramTypeface);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\graphics\TypefaceCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */