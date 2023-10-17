package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.util.Preconditions;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;

public class FontsContractCompat
{
  @Deprecated
  public static final String PARCEL_FONT_RESULTS = "font_results";
  @Deprecated
  static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;
  @Deprecated
  static final int RESULT_CODE_WRONG_CERTIFICATES = -2;
  
  public static Typeface buildTypeface(Context paramContext, CancellationSignal paramCancellationSignal, FontInfo[] paramArrayOfFontInfo)
  {
    return TypefaceCompat.createFromFontInfo(paramContext, paramCancellationSignal, paramArrayOfFontInfo, 0);
  }
  
  public static FontFamilyResult fetchFonts(Context paramContext, CancellationSignal paramCancellationSignal, FontRequest paramFontRequest)
    throws PackageManager.NameNotFoundException
  {
    return FontProvider.getFontFamilyResult(paramContext, paramFontRequest, paramCancellationSignal);
  }
  
  @Deprecated
  public static Typeface getFontSync(Context paramContext, FontRequest paramFontRequest, ResourcesCompat.FontCallback paramFontCallback, Handler paramHandler, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    paramFontCallback = new TypefaceCompat.ResourcesCallbackAdapter(paramFontCallback);
    return requestFont(paramContext, paramFontRequest, paramInt2, paramBoolean, paramInt1, ResourcesCompat.FontCallback.getHandler(paramHandler), paramFontCallback);
  }
  
  @Deprecated
  public static ProviderInfo getProvider(PackageManager paramPackageManager, FontRequest paramFontRequest, Resources paramResources)
    throws PackageManager.NameNotFoundException
  {
    return FontProvider.getProvider(paramPackageManager, paramFontRequest, paramResources);
  }
  
  @Deprecated
  public static Map<Uri, ByteBuffer> prepareFontData(Context paramContext, FontInfo[] paramArrayOfFontInfo, CancellationSignal paramCancellationSignal)
  {
    return TypefaceCompatUtil.readFontInfoIntoByteBuffer(paramContext, paramArrayOfFontInfo, paramCancellationSignal);
  }
  
  public static Typeface requestFont(Context paramContext, FontRequest paramFontRequest, int paramInt1, boolean paramBoolean, int paramInt2, Handler paramHandler, FontRequestCallback paramFontRequestCallback)
  {
    paramHandler = new CallbackWithHandler(paramFontRequestCallback, paramHandler);
    if (paramBoolean) {
      return FontRequestWorker.requestFontSync(paramContext, paramFontRequest, paramHandler, paramInt1, paramInt2);
    }
    return FontRequestWorker.requestFontAsync(paramContext, paramFontRequest, paramInt1, null, paramHandler);
  }
  
  public static void requestFont(Context paramContext, FontRequest paramFontRequest, FontRequestCallback paramFontRequestCallback, Handler paramHandler)
  {
    paramFontRequestCallback = new CallbackWithHandler(paramFontRequestCallback);
    paramHandler = RequestExecutor.createHandlerExecutor(paramHandler);
    FontRequestWorker.requestFontAsync(paramContext.getApplicationContext(), paramFontRequest, 0, paramHandler, paramFontRequestCallback);
  }
  
  @Deprecated
  public static void resetCache() {}
  
  public static void resetTypefaceCache() {}
  
  public static final class Columns
    implements BaseColumns
  {
    public static final String FILE_ID = "file_id";
    public static final String ITALIC = "font_italic";
    public static final String RESULT_CODE = "result_code";
    public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
    public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
    public static final int RESULT_CODE_MALFORMED_QUERY = 3;
    public static final int RESULT_CODE_OK = 0;
    public static final String TTC_INDEX = "font_ttc_index";
    public static final String VARIATION_SETTINGS = "font_variation_settings";
    public static final String WEIGHT = "font_weight";
  }
  
  public static class FontFamilyResult
  {
    public static final int STATUS_OK = 0;
    public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
    public static final int STATUS_WRONG_CERTIFICATES = 1;
    private final FontsContractCompat.FontInfo[] mFonts;
    private final int mStatusCode;
    
    @Deprecated
    public FontFamilyResult(int paramInt, FontsContractCompat.FontInfo[] paramArrayOfFontInfo)
    {
      this.mStatusCode = paramInt;
      this.mFonts = paramArrayOfFontInfo;
    }
    
    static FontFamilyResult create(int paramInt, FontsContractCompat.FontInfo[] paramArrayOfFontInfo)
    {
      return new FontFamilyResult(paramInt, paramArrayOfFontInfo);
    }
    
    public FontsContractCompat.FontInfo[] getFonts()
    {
      return this.mFonts;
    }
    
    public int getStatusCode()
    {
      return this.mStatusCode;
    }
  }
  
  public static class FontInfo
  {
    private final boolean mItalic;
    private final int mResultCode;
    private final int mTtcIndex;
    private final Uri mUri;
    private final int mWeight;
    
    @Deprecated
    public FontInfo(Uri paramUri, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      this.mUri = ((Uri)Preconditions.checkNotNull(paramUri));
      this.mTtcIndex = paramInt1;
      this.mWeight = paramInt2;
      this.mItalic = paramBoolean;
      this.mResultCode = paramInt3;
    }
    
    static FontInfo create(Uri paramUri, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      return new FontInfo(paramUri, paramInt1, paramInt2, paramBoolean, paramInt3);
    }
    
    public int getResultCode()
    {
      return this.mResultCode;
    }
    
    public int getTtcIndex()
    {
      return this.mTtcIndex;
    }
    
    public Uri getUri()
    {
      return this.mUri;
    }
    
    public int getWeight()
    {
      return this.mWeight;
    }
    
    public boolean isItalic()
    {
      return this.mItalic;
    }
  }
  
  public static class FontRequestCallback
  {
    public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
    public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
    public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
    public static final int FAIL_REASON_MALFORMED_QUERY = 3;
    public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
    public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
    public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
    @Deprecated
    public static final int RESULT_OK = 0;
    static final int RESULT_SUCCESS = 0;
    
    public void onTypefaceRequestFailed(int paramInt) {}
    
    public void onTypefaceRetrieved(Typeface paramTypeface) {}
    
    @Retention(RetentionPolicy.SOURCE)
    public static @interface FontRequestFailReason {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\provider\FontsContractCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */