package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

public final class ResourcesCompat
{
  public static final int ID_NULL = 0;
  private static final String TAG = "ResourcesCompat";
  private static final Object sColorStateCacheLock = new Object();
  private static final WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> sColorStateCaches;
  private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal();
  
  static
  {
    sColorStateCaches = new WeakHashMap(0);
  }
  
  private static void addColorStateListToCache(ColorStateListCacheKey paramColorStateListCacheKey, int paramInt, ColorStateList paramColorStateList)
  {
    synchronized (sColorStateCacheLock)
    {
      WeakHashMap localWeakHashMap = sColorStateCaches;
      Object localObject2 = (SparseArray)localWeakHashMap.get(paramColorStateListCacheKey);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new android/util/SparseArray;
        ((SparseArray)localObject1).<init>();
        localWeakHashMap.put(paramColorStateListCacheKey, localObject1);
      }
      localObject2 = new androidx/core/content/res/ResourcesCompat$ColorStateListCacheEntry;
      ((ColorStateListCacheEntry)localObject2).<init>(paramColorStateList, paramColorStateListCacheKey.mResources.getConfiguration());
      ((SparseArray)localObject1).append(paramInt, localObject2);
      return;
    }
  }
  
  private static ColorStateList getCachedColorStateList(ColorStateListCacheKey paramColorStateListCacheKey, int paramInt)
  {
    synchronized (sColorStateCacheLock)
    {
      SparseArray localSparseArray = (SparseArray)sColorStateCaches.get(paramColorStateListCacheKey);
      if ((localSparseArray != null) && (localSparseArray.size() > 0))
      {
        ColorStateListCacheEntry localColorStateListCacheEntry = (ColorStateListCacheEntry)localSparseArray.get(paramInt);
        if (localColorStateListCacheEntry != null)
        {
          if (localColorStateListCacheEntry.mConfiguration.equals(paramColorStateListCacheKey.mResources.getConfiguration()))
          {
            paramColorStateListCacheKey = localColorStateListCacheEntry.mValue;
            return paramColorStateListCacheKey;
          }
          localSparseArray.remove(paramInt);
        }
      }
      return null;
    }
  }
  
  public static Typeface getCachedFont(Context paramContext, int paramInt)
    throws Resources.NotFoundException
  {
    if (paramContext.isRestricted()) {
      return null;
    }
    return loadFont(paramContext, paramInt, new TypedValue(), 0, null, null, false, true);
  }
  
  public static int getColor(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    throws Resources.NotFoundException
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramResources.getColor(paramInt, paramTheme);
    }
    return paramResources.getColor(paramInt);
  }
  
  public static ColorStateList getColorStateList(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    throws Resources.NotFoundException
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramResources.getColorStateList(paramInt, paramTheme);
    }
    ColorStateListCacheKey localColorStateListCacheKey = new ColorStateListCacheKey(paramResources, paramTheme);
    ColorStateList localColorStateList = getCachedColorStateList(localColorStateListCacheKey, paramInt);
    if (localColorStateList != null) {
      return localColorStateList;
    }
    paramTheme = inflateColorStateList(paramResources, paramInt, paramTheme);
    if (paramTheme != null)
    {
      addColorStateListToCache(localColorStateListCacheKey, paramInt, paramTheme);
      return paramTheme;
    }
    return paramResources.getColorStateList(paramInt);
  }
  
  public static Drawable getDrawable(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    throws Resources.NotFoundException
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramResources.getDrawable(paramInt, paramTheme);
    }
    return paramResources.getDrawable(paramInt);
  }
  
  public static Drawable getDrawableForDensity(Resources paramResources, int paramInt1, int paramInt2, Resources.Theme paramTheme)
    throws Resources.NotFoundException
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramResources.getDrawableForDensity(paramInt1, paramInt2, paramTheme);
    }
    if (Build.VERSION.SDK_INT >= 15) {
      return paramResources.getDrawableForDensity(paramInt1, paramInt2);
    }
    return paramResources.getDrawable(paramInt1);
  }
  
  public static float getFloat(Resources paramResources, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return ImplApi29.getFloat(paramResources, paramInt);
    }
    TypedValue localTypedValue = getTypedValue();
    paramResources.getValue(paramInt, localTypedValue, true);
    if (localTypedValue.type == 4) {
      return localTypedValue.getFloat();
    }
    paramResources = new StringBuilder();
    paramResources.append("Resource ID #0x");
    paramResources.append(Integer.toHexString(paramInt));
    paramResources.append(" type #0x");
    paramResources.append(Integer.toHexString(localTypedValue.type));
    paramResources.append(" is not valid");
    throw new Resources.NotFoundException(paramResources.toString());
  }
  
  public static Typeface getFont(Context paramContext, int paramInt)
    throws Resources.NotFoundException
  {
    if (paramContext.isRestricted()) {
      return null;
    }
    return loadFont(paramContext, paramInt, new TypedValue(), 0, null, null, false, false);
  }
  
  public static Typeface getFont(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, FontCallback paramFontCallback)
    throws Resources.NotFoundException
  {
    if (paramContext.isRestricted()) {
      return null;
    }
    return loadFont(paramContext, paramInt1, paramTypedValue, paramInt2, paramFontCallback, null, true, false);
  }
  
  public static void getFont(Context paramContext, int paramInt, FontCallback paramFontCallback, Handler paramHandler)
    throws Resources.NotFoundException
  {
    Preconditions.checkNotNull(paramFontCallback);
    if (paramContext.isRestricted())
    {
      paramFontCallback.callbackFailAsync(-4, paramHandler);
      return;
    }
    loadFont(paramContext, paramInt, new TypedValue(), 0, paramFontCallback, paramHandler, false, false);
  }
  
  private static TypedValue getTypedValue()
  {
    ThreadLocal localThreadLocal = sTempTypedValue;
    TypedValue localTypedValue2 = (TypedValue)localThreadLocal.get();
    TypedValue localTypedValue1 = localTypedValue2;
    if (localTypedValue2 == null)
    {
      localTypedValue1 = new TypedValue();
      localThreadLocal.set(localTypedValue1);
    }
    return localTypedValue1;
  }
  
  private static ColorStateList inflateColorStateList(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    if (isColorInt(paramResources, paramInt)) {
      return null;
    }
    XmlResourceParser localXmlResourceParser = paramResources.getXml(paramInt);
    try
    {
      paramResources = ColorStateListInflaterCompat.createFromXml(paramResources, localXmlResourceParser, paramTheme);
      return paramResources;
    }
    catch (Exception paramResources)
    {
      Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", paramResources);
    }
    return null;
  }
  
  private static boolean isColorInt(Resources paramResources, int paramInt)
  {
    TypedValue localTypedValue = getTypedValue();
    boolean bool = true;
    paramResources.getValue(paramInt, localTypedValue, true);
    if ((localTypedValue.type < 28) || (localTypedValue.type > 31)) {
      bool = false;
    }
    return bool;
  }
  
  private static Typeface loadFont(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, FontCallback paramFontCallback, Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2)
  {
    Resources localResources = paramContext.getResources();
    localResources.getValue(paramInt1, paramTypedValue, true);
    paramContext = loadFont(paramContext, localResources, paramTypedValue, paramInt1, paramInt2, paramFontCallback, paramHandler, paramBoolean1, paramBoolean2);
    if ((paramContext == null) && (paramFontCallback == null) && (!paramBoolean2))
    {
      paramContext = new StringBuilder();
      paramContext.append("Font resource ID #0x");
      paramContext.append(Integer.toHexString(paramInt1));
      paramContext.append(" could not be retrieved.");
      throw new Resources.NotFoundException(paramContext.toString());
    }
    return paramContext;
  }
  
  private static Typeface loadFont(Context paramContext, Resources paramResources, TypedValue paramTypedValue, int paramInt1, int paramInt2, FontCallback paramFontCallback, Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramTypedValue.string != null)
    {
      paramTypedValue = paramTypedValue.string.toString();
      if (!paramTypedValue.startsWith("res/"))
      {
        if (paramFontCallback != null) {
          paramFontCallback.callbackFailAsync(-3, paramHandler);
        }
        return null;
      }
      Object localObject = TypefaceCompat.findFromCache(paramResources, paramInt1, paramInt2);
      if (localObject != null)
      {
        if (paramFontCallback != null) {
          paramFontCallback.callbackSuccessAsync((Typeface)localObject, paramHandler);
        }
        return (Typeface)localObject;
      }
      if (paramBoolean2) {
        return null;
      }
      try
      {
        if (paramTypedValue.toLowerCase().endsWith(".xml"))
        {
          localObject = FontResourcesParserCompat.parse(paramResources.getXml(paramInt1), paramResources);
          if (localObject == null)
          {
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (paramFontCallback != null) {
              paramFontCallback.callbackFailAsync(-3, paramHandler);
            }
            return null;
          }
          return TypefaceCompat.createFromResourcesFamilyXml(paramContext, (FontResourcesParserCompat.FamilyResourceEntry)localObject, paramResources, paramInt1, paramInt2, paramFontCallback, paramHandler, paramBoolean1);
        }
        paramContext = TypefaceCompat.createFromResourcesFontFile(paramContext, paramResources, paramInt1, paramTypedValue, paramInt2);
        if (paramFontCallback != null) {
          if (paramContext != null) {
            paramFontCallback.callbackSuccessAsync(paramContext, paramHandler);
          } else {
            paramFontCallback.callbackFailAsync(-3, paramHandler);
          }
        }
        return paramContext;
      }
      catch (IOException paramContext)
      {
        paramResources = new StringBuilder();
        paramResources.append("Failed to read xml resource ");
        paramResources.append(paramTypedValue);
        Log.e("ResourcesCompat", paramResources.toString(), paramContext);
      }
      catch (XmlPullParserException paramResources)
      {
        paramContext = new StringBuilder();
        paramContext.append("Failed to parse xml resource ");
        paramContext.append(paramTypedValue);
        Log.e("ResourcesCompat", paramContext.toString(), paramResources);
      }
      if (paramFontCallback != null) {
        paramFontCallback.callbackFailAsync(-3, paramHandler);
      }
      return null;
    }
    paramContext = new StringBuilder();
    paramContext.append("Resource \"");
    paramContext.append(paramResources.getResourceName(paramInt1));
    paramContext.append("\" (");
    paramContext.append(Integer.toHexString(paramInt1));
    paramContext.append(") is not a Font: ");
    paramContext.append(paramTypedValue);
    throw new Resources.NotFoundException(paramContext.toString());
  }
  
  private static class ColorStateListCacheEntry
  {
    final Configuration mConfiguration;
    final ColorStateList mValue;
    
    ColorStateListCacheEntry(ColorStateList paramColorStateList, Configuration paramConfiguration)
    {
      this.mValue = paramColorStateList;
      this.mConfiguration = paramConfiguration;
    }
  }
  
  private static final class ColorStateListCacheKey
  {
    final Resources mResources;
    final Resources.Theme mTheme;
    
    ColorStateListCacheKey(Resources paramResources, Resources.Theme paramTheme)
    {
      this.mResources = paramResources;
      this.mTheme = paramTheme;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (getClass() == paramObject.getClass()))
      {
        paramObject = (ColorStateListCacheKey)paramObject;
        if ((!this.mResources.equals(((ColorStateListCacheKey)paramObject).mResources)) || (!ObjectsCompat.equals(this.mTheme, ((ColorStateListCacheKey)paramObject).mTheme))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      return ObjectsCompat.hash(new Object[] { this.mResources, this.mTheme });
    }
  }
  
  public static abstract class FontCallback
  {
    public static Handler getHandler(Handler paramHandler)
    {
      Handler localHandler = paramHandler;
      if (paramHandler == null) {
        localHandler = new Handler(Looper.getMainLooper());
      }
      return localHandler;
    }
    
    public final void callbackFailAsync(final int paramInt, Handler paramHandler)
    {
      getHandler(paramHandler).post(new Runnable()
      {
        public void run()
        {
          ResourcesCompat.FontCallback.this.onFontRetrievalFailed(paramInt);
        }
      });
    }
    
    public final void callbackSuccessAsync(final Typeface paramTypeface, Handler paramHandler)
    {
      getHandler(paramHandler).post(new Runnable()
      {
        public void run()
        {
          ResourcesCompat.FontCallback.this.onFontRetrieved(paramTypeface);
        }
      });
    }
    
    public abstract void onFontRetrievalFailed(int paramInt);
    
    public abstract void onFontRetrieved(Typeface paramTypeface);
  }
  
  static class ImplApi29
  {
    static float getFloat(Resources paramResources, int paramInt)
    {
      return paramResources.getFloat(paramInt);
    }
  }
  
  public static final class ThemeCompat
  {
    public static void rebase(Resources.Theme paramTheme)
    {
      if (Build.VERSION.SDK_INT >= 29) {
        ImplApi29.rebase(paramTheme);
      } else if (Build.VERSION.SDK_INT >= 23) {
        ImplApi23.rebase(paramTheme);
      }
    }
    
    static class ImplApi23
    {
      private static Method sRebaseMethod;
      private static boolean sRebaseMethodFetched;
      private static final Object sRebaseMethodLock = new Object();
      
      static void rebase(Resources.Theme paramTheme)
      {
        synchronized (sRebaseMethodLock)
        {
          boolean bool = sRebaseMethodFetched;
          if (!bool)
          {
            try
            {
              Method localMethod1 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
              sRebaseMethod = localMethod1;
              localMethod1.setAccessible(true);
            }
            catch (NoSuchMethodException localNoSuchMethodException)
            {
              Log.i("ResourcesCompat", "Failed to retrieve rebase() method", localNoSuchMethodException);
            }
            sRebaseMethodFetched = true;
          }
          Method localMethod2 = sRebaseMethod;
          if (localMethod2 != null)
          {
            try
            {
              localMethod2.invoke(paramTheme, new Object[0]);
            }
            catch (InvocationTargetException paramTheme) {}catch (IllegalAccessException paramTheme) {}
            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", paramTheme);
            sRebaseMethod = null;
          }
          return;
        }
      }
    }
    
    static class ImplApi29
    {
      static void rebase(Resources.Theme paramTheme)
      {
        paramTheme.rebase();
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\content\res\ResourcesCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */