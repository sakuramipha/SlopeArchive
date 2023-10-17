package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

class FontRequestWorker
{
  private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = RequestExecutor.createDefaultExecutor("fonts-androidx", 10, 10000);
  static final Object LOCK = new Object();
  static final SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> PENDING_REPLIES = new SimpleArrayMap();
  static final LruCache<String, Typeface> sTypefaceCache = new LruCache(16);
  
  private static String createCacheId(FontRequest paramFontRequest, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramFontRequest.getId());
    localStringBuilder.append("-");
    localStringBuilder.append(paramInt);
    return localStringBuilder.toString();
  }
  
  private static int getFontFamilyResultStatus(FontsContractCompat.FontFamilyResult paramFontFamilyResult)
  {
    int j = paramFontFamilyResult.getStatusCode();
    int k = -3;
    int i = 1;
    if (j != 0)
    {
      if (paramFontFamilyResult.getStatusCode() != 1) {
        return -3;
      }
      return -2;
    }
    paramFontFamilyResult = paramFontFamilyResult.getFonts();
    j = i;
    if (paramFontFamilyResult != null) {
      if (paramFontFamilyResult.length == 0)
      {
        j = i;
      }
      else
      {
        int n = paramFontFamilyResult.length;
        int m = 0;
        for (i = 0;; i++)
        {
          j = m;
          if (i >= n) {
            break;
          }
          j = paramFontFamilyResult[i].getResultCode();
          if (j != 0)
          {
            if (j < 0) {
              i = k;
            } else {
              i = j;
            }
            return i;
          }
        }
      }
    }
    return j;
  }
  
  static TypefaceResult getFontSync(String paramString, Context paramContext, FontRequest paramFontRequest, int paramInt)
  {
    LruCache localLruCache = sTypefaceCache;
    Typeface localTypeface = (Typeface)localLruCache.get(paramString);
    if (localTypeface != null) {
      return new TypefaceResult(localTypeface);
    }
    try
    {
      paramFontRequest = FontProvider.getFontFamilyResult(paramContext, paramFontRequest, null);
      int i = getFontFamilyResultStatus(paramFontRequest);
      if (i != 0) {
        return new TypefaceResult(i);
      }
      paramContext = TypefaceCompat.createFromFontInfo(paramContext, null, paramFontRequest.getFonts(), paramInt);
      if (paramContext != null)
      {
        localLruCache.put(paramString, paramContext);
        return new TypefaceResult(paramContext);
      }
      return new TypefaceResult(-3);
    }
    catch (PackageManager.NameNotFoundException paramString) {}
    return new TypefaceResult(-1);
  }
  
  static Typeface requestFontAsync(final Context paramContext, final FontRequest paramFontRequest, final int paramInt, Executor paramExecutor, CallbackWithHandler arg4)
  {
    String str = createCacheId(paramFontRequest, paramInt);
    Object localObject = (Typeface)sTypefaceCache.get(str);
    if (localObject != null)
    {
      ???.onTypefaceResult(new TypefaceResult((Typeface)localObject));
      return (Typeface)localObject;
    }
    localObject = new Consumer()
    {
      public void accept(FontRequestWorker.TypefaceResult paramAnonymousTypefaceResult)
      {
        FontRequestWorker.this.onTypefaceResult(paramAnonymousTypefaceResult);
      }
    };
    synchronized (LOCK)
    {
      SimpleArrayMap localSimpleArrayMap = PENDING_REPLIES;
      ArrayList localArrayList = (ArrayList)localSimpleArrayMap.get(str);
      if (localArrayList != null)
      {
        localArrayList.add(localObject);
        return null;
      }
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localArrayList.add(localObject);
      localSimpleArrayMap.put(str, localArrayList);
      paramFontRequest = new Callable()
      {
        public FontRequestWorker.TypefaceResult call()
        {
          return FontRequestWorker.getFontSync(FontRequestWorker.this, paramContext, paramFontRequest, paramInt);
        }
      };
      paramContext = paramExecutor;
      if (paramExecutor == null) {
        paramContext = DEFAULT_EXECUTOR_SERVICE;
      }
      RequestExecutor.execute(paramContext, paramFontRequest, new Consumer()
      {
        public void accept(FontRequestWorker.TypefaceResult paramAnonymousTypefaceResult)
        {
          synchronized (FontRequestWorker.LOCK)
          {
            ArrayList localArrayList = (ArrayList)FontRequestWorker.PENDING_REPLIES.get(FontRequestWorker.this);
            if (localArrayList == null) {
              return;
            }
            FontRequestWorker.PENDING_REPLIES.remove(FontRequestWorker.this);
            for (int i = 0; i < localArrayList.size(); i++) {
              ((Consumer)localArrayList.get(i)).accept(paramAnonymousTypefaceResult);
            }
            return;
          }
        }
      });
      return null;
    }
  }
  
  static Typeface requestFontSync(final Context paramContext, final FontRequest paramFontRequest, CallbackWithHandler paramCallbackWithHandler, final int paramInt1, int paramInt2)
  {
    String str = createCacheId(paramFontRequest, paramInt1);
    Typeface localTypeface = (Typeface)sTypefaceCache.get(str);
    if (localTypeface != null)
    {
      paramCallbackWithHandler.onTypefaceResult(new TypefaceResult(localTypeface));
      return localTypeface;
    }
    if (paramInt2 == -1)
    {
      paramContext = getFontSync(str, paramContext, paramFontRequest, paramInt1);
      paramCallbackWithHandler.onTypefaceResult(paramContext);
      return paramContext.mTypeface;
    }
    paramContext = new Callable()
    {
      public FontRequestWorker.TypefaceResult call()
      {
        return FontRequestWorker.getFontSync(FontRequestWorker.this, paramContext, paramFontRequest, paramInt1);
      }
    };
    try
    {
      paramContext = (TypefaceResult)RequestExecutor.submit(DEFAULT_EXECUTOR_SERVICE, paramContext, paramInt2);
      paramCallbackWithHandler.onTypefaceResult(paramContext);
      paramContext = paramContext.mTypeface;
      return paramContext;
    }
    catch (InterruptedException paramContext)
    {
      paramCallbackWithHandler.onTypefaceResult(new TypefaceResult(-3));
    }
    return null;
  }
  
  static void resetTypefaceCache()
  {
    sTypefaceCache.evictAll();
  }
  
  static final class TypefaceResult
  {
    final int mResult;
    final Typeface mTypeface;
    
    TypefaceResult(int paramInt)
    {
      this.mTypeface = null;
      this.mResult = paramInt;
    }
    
    TypefaceResult(Typeface paramTypeface)
    {
      this.mTypeface = paramTypeface;
      this.mResult = 0;
    }
    
    boolean isSuccess()
    {
      boolean bool;
      if (this.mResult == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\provider\FontRequestWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */