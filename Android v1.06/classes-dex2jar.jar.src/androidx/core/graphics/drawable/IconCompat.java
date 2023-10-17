package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

public class IconCompat
  extends CustomVersionedParcelable
{
  private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25F;
  private static final int AMBIENT_SHADOW_ALPHA = 30;
  private static final float BLUR_FACTOR = 0.010416667F;
  static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
  private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667F;
  static final String EXTRA_INT1 = "int1";
  static final String EXTRA_INT2 = "int2";
  static final String EXTRA_OBJ = "obj";
  static final String EXTRA_STRING1 = "string1";
  static final String EXTRA_TINT_LIST = "tint_list";
  static final String EXTRA_TINT_MODE = "tint_mode";
  static final String EXTRA_TYPE = "type";
  private static final float ICON_DIAMETER_FACTOR = 0.9166667F;
  private static final int KEY_SHADOW_ALPHA = 61;
  private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334F;
  private static final String TAG = "IconCompat";
  public static final int TYPE_ADAPTIVE_BITMAP = 5;
  public static final int TYPE_BITMAP = 1;
  public static final int TYPE_DATA = 3;
  public static final int TYPE_RESOURCE = 2;
  public static final int TYPE_UNKNOWN = -1;
  public static final int TYPE_URI = 4;
  public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
  public byte[] mData = null;
  public int mInt1 = 0;
  public int mInt2 = 0;
  Object mObj1;
  public Parcelable mParcelable = null;
  public String mString1;
  public ColorStateList mTintList = null;
  PorterDuff.Mode mTintMode = DEFAULT_TINT_MODE;
  public String mTintModeStr = null;
  public int mType = -1;
  
  public IconCompat() {}
  
  private IconCompat(int paramInt)
  {
    this.mType = paramInt;
  }
  
  public static IconCompat createFromBundle(Bundle paramBundle)
  {
    int i = paramBundle.getInt("type");
    IconCompat localIconCompat = new IconCompat(i);
    localIconCompat.mInt1 = paramBundle.getInt("int1");
    localIconCompat.mInt2 = paramBundle.getInt("int2");
    localIconCompat.mString1 = paramBundle.getString("string1");
    if (paramBundle.containsKey("tint_list")) {
      localIconCompat.mTintList = ((ColorStateList)paramBundle.getParcelable("tint_list"));
    }
    if (paramBundle.containsKey("tint_mode")) {
      localIconCompat.mTintMode = PorterDuff.Mode.valueOf(paramBundle.getString("tint_mode"));
    }
    switch (i)
    {
    case 0: 
    default: 
      paramBundle = new StringBuilder();
      paramBundle.append("Unknown type ");
      paramBundle.append(i);
      Log.w("IconCompat", paramBundle.toString());
      return null;
    case 3: 
      localIconCompat.mObj1 = paramBundle.getByteArray("obj");
      break;
    case 2: 
    case 4: 
    case 6: 
      localIconCompat.mObj1 = paramBundle.getString("obj");
      break;
    case -1: 
    case 1: 
    case 5: 
      localIconCompat.mObj1 = paramBundle.getParcelable("obj");
    }
    return localIconCompat;
  }
  
  public static IconCompat createFromIcon(Context paramContext, Icon paramIcon)
  {
    Preconditions.checkNotNull(paramIcon);
    int i = getType(paramIcon);
    if (i != 2)
    {
      if (i != 4)
      {
        if (i != 6)
        {
          paramContext = new IconCompat(-1);
          paramContext.mObj1 = paramIcon;
          return paramContext;
        }
        return createWithAdaptiveBitmapContentUri(getUri(paramIcon));
      }
      return createWithContentUri(getUri(paramIcon));
    }
    String str = getResPackage(paramIcon);
    try
    {
      paramContext = createWithResource(getResources(paramContext, str), str, getResId(paramIcon));
      return paramContext;
    }
    catch (Resources.NotFoundException paramContext)
    {
      throw new IllegalArgumentException("Icon resource cannot be found");
    }
  }
  
  public static IconCompat createFromIcon(Icon paramIcon)
  {
    Preconditions.checkNotNull(paramIcon);
    int i = getType(paramIcon);
    if (i != 2)
    {
      if (i != 4)
      {
        if (i != 6)
        {
          IconCompat localIconCompat = new IconCompat(-1);
          localIconCompat.mObj1 = paramIcon;
          return localIconCompat;
        }
        return createWithAdaptiveBitmapContentUri(getUri(paramIcon));
      }
      return createWithContentUri(getUri(paramIcon));
    }
    return createWithResource(null, getResPackage(paramIcon), getResId(paramIcon));
  }
  
  public static IconCompat createFromIconOrNullIfZeroResId(Icon paramIcon)
  {
    if ((getType(paramIcon) == 2) && (getResId(paramIcon) == 0)) {
      return null;
    }
    return createFromIcon(paramIcon);
  }
  
  static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap paramBitmap, boolean paramBoolean)
  {
    int i = (int)(Math.min(paramBitmap.getWidth(), paramBitmap.getHeight()) * 0.6666667F);
    Bitmap localBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(3);
    float f3 = i;
    float f1 = 0.5F * f3;
    float f4 = 0.9166667F * f1;
    if (paramBoolean)
    {
      float f2 = 0.010416667F * f3;
      localPaint.setColor(0);
      localPaint.setShadowLayer(f2, 0.0F, f3 * 0.020833334F, 1023410176);
      localCanvas.drawCircle(f1, f1, f4, localPaint);
      localPaint.setShadowLayer(f2, 0.0F, 0.0F, 503316480);
      localCanvas.drawCircle(f1, f1, f4, localPaint);
      localPaint.clearShadowLayer();
    }
    localPaint.setColor(-16777216);
    BitmapShader localBitmapShader = new BitmapShader(paramBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    Matrix localMatrix = new Matrix();
    localMatrix.setTranslate(-(paramBitmap.getWidth() - i) / 2, -(paramBitmap.getHeight() - i) / 2);
    localBitmapShader.setLocalMatrix(localMatrix);
    localPaint.setShader(localBitmapShader);
    localCanvas.drawCircle(f1, f1, f4, localPaint);
    localCanvas.setBitmap(null);
    return localBitmap;
  }
  
  public static IconCompat createWithAdaptiveBitmap(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      IconCompat localIconCompat = new IconCompat(5);
      localIconCompat.mObj1 = paramBitmap;
      return localIconCompat;
    }
    throw new IllegalArgumentException("Bitmap must not be null.");
  }
  
  public static IconCompat createWithAdaptiveBitmapContentUri(Uri paramUri)
  {
    if (paramUri != null) {
      return createWithAdaptiveBitmapContentUri(paramUri.toString());
    }
    throw new IllegalArgumentException("Uri must not be null.");
  }
  
  public static IconCompat createWithAdaptiveBitmapContentUri(String paramString)
  {
    if (paramString != null)
    {
      IconCompat localIconCompat = new IconCompat(6);
      localIconCompat.mObj1 = paramString;
      return localIconCompat;
    }
    throw new IllegalArgumentException("Uri must not be null.");
  }
  
  public static IconCompat createWithBitmap(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      IconCompat localIconCompat = new IconCompat(1);
      localIconCompat.mObj1 = paramBitmap;
      return localIconCompat;
    }
    throw new IllegalArgumentException("Bitmap must not be null.");
  }
  
  public static IconCompat createWithContentUri(Uri paramUri)
  {
    if (paramUri != null) {
      return createWithContentUri(paramUri.toString());
    }
    throw new IllegalArgumentException("Uri must not be null.");
  }
  
  public static IconCompat createWithContentUri(String paramString)
  {
    if (paramString != null)
    {
      IconCompat localIconCompat = new IconCompat(4);
      localIconCompat.mObj1 = paramString;
      return localIconCompat;
    }
    throw new IllegalArgumentException("Uri must not be null.");
  }
  
  public static IconCompat createWithData(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null)
    {
      IconCompat localIconCompat = new IconCompat(3);
      localIconCompat.mObj1 = paramArrayOfByte;
      localIconCompat.mInt1 = paramInt1;
      localIconCompat.mInt2 = paramInt2;
      return localIconCompat;
    }
    throw new IllegalArgumentException("Data must not be null.");
  }
  
  public static IconCompat createWithResource(Context paramContext, int paramInt)
  {
    if (paramContext != null) {
      return createWithResource(paramContext.getResources(), paramContext.getPackageName(), paramInt);
    }
    throw new IllegalArgumentException("Context must not be null.");
  }
  
  public static IconCompat createWithResource(Resources paramResources, String paramString, int paramInt)
  {
    if (paramString != null)
    {
      if (paramInt != 0)
      {
        IconCompat localIconCompat = new IconCompat(2);
        localIconCompat.mInt1 = paramInt;
        if (paramResources != null) {
          try
          {
            localIconCompat.mObj1 = paramResources.getResourceName(paramInt);
          }
          catch (Resources.NotFoundException paramResources)
          {
            throw new IllegalArgumentException("Icon resource cannot be found");
          }
        } else {
          localIconCompat.mObj1 = paramString;
        }
        localIconCompat.mString1 = paramString;
        return localIconCompat;
      }
      throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }
    throw new IllegalArgumentException("Package must not be null.");
  }
  
  private static int getResId(Icon paramIcon)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramIcon.getResId();
    }
    try
    {
      int i = ((Integer)paramIcon.getClass().getMethod("getResId", new Class[0]).invoke(paramIcon, new Object[0])).intValue();
      return i;
    }
    catch (NoSuchMethodException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon resource", paramIcon);
      return 0;
    }
    catch (InvocationTargetException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon resource", paramIcon);
      return 0;
    }
    catch (IllegalAccessException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon resource", paramIcon);
    }
    return 0;
  }
  
  private static String getResPackage(Icon paramIcon)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramIcon.getResPackage();
    }
    try
    {
      paramIcon = (String)paramIcon.getClass().getMethod("getResPackage", new Class[0]).invoke(paramIcon, new Object[0]);
      return paramIcon;
    }
    catch (NoSuchMethodException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon package", paramIcon);
      return null;
    }
    catch (InvocationTargetException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon package", paramIcon);
      return null;
    }
    catch (IllegalAccessException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon package", paramIcon);
    }
    return null;
  }
  
  private static Resources getResources(Context paramContext, String paramString)
  {
    if ("android".equals(paramString)) {
      return Resources.getSystem();
    }
    paramContext = paramContext.getPackageManager();
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo(paramString, 8192);
      if (localApplicationInfo != null)
      {
        paramContext = paramContext.getResourcesForApplication(localApplicationInfo);
        return paramContext;
      }
      return null;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[] { paramString }), paramContext);
    }
    return null;
  }
  
  private static int getType(Icon paramIcon)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramIcon.getType();
    }
    try
    {
      int i = ((Integer)paramIcon.getClass().getMethod("getType", new Class[0]).invoke(paramIcon, new Object[0])).intValue();
      return i;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("Unable to get icon type ");
      localStringBuilder2.append(paramIcon);
      Log.e("IconCompat", localStringBuilder2.toString(), localNoSuchMethodException);
      return -1;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("Unable to get icon type ");
      localStringBuilder1.append(paramIcon);
      Log.e("IconCompat", localStringBuilder1.toString(), localInvocationTargetException);
      return -1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("Unable to get icon type ");
      localStringBuilder1.append(paramIcon);
      Log.e("IconCompat", localStringBuilder1.toString(), localIllegalAccessException);
    }
    return -1;
  }
  
  private static Uri getUri(Icon paramIcon)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramIcon.getUri();
    }
    try
    {
      paramIcon = (Uri)paramIcon.getClass().getMethod("getUri", new Class[0]).invoke(paramIcon, new Object[0]);
      return paramIcon;
    }
    catch (NoSuchMethodException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon uri", paramIcon);
      return null;
    }
    catch (InvocationTargetException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon uri", paramIcon);
      return null;
    }
    catch (IllegalAccessException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon uri", paramIcon);
    }
    return null;
  }
  
  private Drawable loadDrawableInner(Context paramContext)
  {
    Object localObject;
    switch (this.mType)
    {
    default: 
      break;
    case 6: 
      localObject = getUriInputStream(paramContext);
      if (localObject != null)
      {
        if (Build.VERSION.SDK_INT >= 26) {
          return new AdaptiveIconDrawable(null, new BitmapDrawable(paramContext.getResources(), BitmapFactory.decodeStream((InputStream)localObject)));
        }
        return new BitmapDrawable(paramContext.getResources(), createLegacyIconFromAdaptiveIcon(BitmapFactory.decodeStream((InputStream)localObject), false));
      }
      break;
    case 5: 
      return new BitmapDrawable(paramContext.getResources(), createLegacyIconFromAdaptiveIcon((Bitmap)this.mObj1, false));
    case 4: 
      localObject = getUriInputStream(paramContext);
      if (localObject != null) {
        return new BitmapDrawable(paramContext.getResources(), BitmapFactory.decodeStream((InputStream)localObject));
      }
      break;
    case 3: 
      return new BitmapDrawable(paramContext.getResources(), BitmapFactory.decodeByteArray((byte[])this.mObj1, this.mInt1, this.mInt2));
    case 2: 
      String str = getResPackage();
      localObject = str;
      if (TextUtils.isEmpty(str)) {
        localObject = paramContext.getPackageName();
      }
      localObject = getResources(paramContext, (String)localObject);
      try
      {
        paramContext = ResourcesCompat.getDrawable((Resources)localObject, this.mInt1, paramContext.getTheme());
        return paramContext;
      }
      catch (RuntimeException paramContext)
      {
        Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[] { Integer.valueOf(this.mInt1), this.mObj1 }), paramContext);
      }
    case 1: 
      return new BitmapDrawable(paramContext.getResources(), (Bitmap)this.mObj1);
    }
    return null;
  }
  
  private static String typeToString(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 6: 
      return "URI_MASKABLE";
    case 5: 
      return "BITMAP_MASKABLE";
    case 4: 
      return "URI";
    case 3: 
      return "DATA";
    case 2: 
      return "RESOURCE";
    }
    return "BITMAP";
  }
  
  public void addToShortcutIntent(Intent paramIntent, Drawable paramDrawable, Context paramContext)
  {
    checkResource(paramContext);
    int i = this.mType;
    Object localObject;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 5) {
          paramContext = createLegacyIconFromAdaptiveIcon((Bitmap)this.mObj1, true);
        } else {
          throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
      }
      else {
        try
        {
          paramContext = paramContext.createPackageContext(getResPackage(), 0);
          if (paramDrawable == null)
          {
            paramIntent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(paramContext, this.mInt1));
            return;
          }
          localObject = ContextCompat.getDrawable(paramContext, this.mInt1);
          if ((((Drawable)localObject).getIntrinsicWidth() > 0) && (((Drawable)localObject).getIntrinsicHeight() > 0))
          {
            paramContext = Bitmap.createBitmap(((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
          }
          else
          {
            i = ((ActivityManager)paramContext.getSystemService("activity")).getLauncherLargeIconSize();
            paramContext = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
          }
          ((Drawable)localObject).setBounds(0, 0, paramContext.getWidth(), paramContext.getHeight());
          Canvas localCanvas = new android/graphics/Canvas;
          localCanvas.<init>(paramContext);
          ((Drawable)localObject).draw(localCanvas);
        }
        catch (PackageManager.NameNotFoundException paramDrawable)
        {
          paramIntent = new StringBuilder();
          paramIntent.append("Can't find package ");
          paramIntent.append(this.mObj1);
          throw new IllegalArgumentException(paramIntent.toString(), paramDrawable);
        }
      }
    }
    else
    {
      localObject = (Bitmap)this.mObj1;
      paramContext = (Context)localObject;
      if (paramDrawable != null) {
        paramContext = ((Bitmap)localObject).copy(((Bitmap)localObject).getConfig(), true);
      }
    }
    if (paramDrawable != null)
    {
      i = paramContext.getWidth();
      int j = paramContext.getHeight();
      paramDrawable.setBounds(i / 2, j / 2, i, j);
      paramDrawable.draw(new Canvas(paramContext));
    }
    paramIntent.putExtra("android.intent.extra.shortcut.ICON", paramContext);
  }
  
  public void checkResource(Context paramContext)
  {
    if (this.mType == 2)
    {
      Object localObject = this.mObj1;
      if (localObject != null)
      {
        localObject = (String)localObject;
        if (!((String)localObject).contains(":")) {
          return;
        }
        String str1 = localObject.split(":", -1)[1];
        String str2 = str1.split("/", -1)[0];
        String str4 = str1.split("/", -1)[1];
        String str3 = localObject.split(":", -1)[0];
        if ("0_resource_name_obfuscated".equals(str4))
        {
          Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
          return;
        }
        str1 = getResPackage();
        int i = getResources(paramContext, str1).getIdentifier(str4, str2, str3);
        if (this.mInt1 != i)
        {
          paramContext = new StringBuilder();
          paramContext.append("Id has changed for ");
          paramContext.append(str1);
          paramContext.append(" ");
          paramContext.append((String)localObject);
          Log.i("IconCompat", paramContext.toString());
          this.mInt1 = i;
        }
      }
    }
  }
  
  public Bitmap getBitmap()
  {
    if ((this.mType == -1) && (Build.VERSION.SDK_INT >= 23))
    {
      localObject = this.mObj1;
      if ((localObject instanceof Bitmap)) {
        return (Bitmap)localObject;
      }
      return null;
    }
    int i = this.mType;
    if (i == 1) {
      return (Bitmap)this.mObj1;
    }
    if (i == 5) {
      return createLegacyIconFromAdaptiveIcon((Bitmap)this.mObj1, true);
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("called getBitmap() on ");
    ((StringBuilder)localObject).append(this);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public int getResId()
  {
    if ((this.mType == -1) && (Build.VERSION.SDK_INT >= 23)) {
      return getResId((Icon)this.mObj1);
    }
    if (this.mType == 2) {
      return this.mInt1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("called getResId() on ");
    localStringBuilder.append(this);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public String getResPackage()
  {
    if ((this.mType == -1) && (Build.VERSION.SDK_INT >= 23)) {
      return getResPackage((Icon)this.mObj1);
    }
    if (this.mType == 2)
    {
      if (TextUtils.isEmpty(this.mString1)) {
        return ((String)this.mObj1).split(":", -1)[0];
      }
      return this.mString1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("called getResPackage() on ");
    localStringBuilder.append(this);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public int getType()
  {
    if ((this.mType == -1) && (Build.VERSION.SDK_INT >= 23)) {
      return getType((Icon)this.mObj1);
    }
    return this.mType;
  }
  
  public Uri getUri()
  {
    if ((this.mType == -1) && (Build.VERSION.SDK_INT >= 23)) {
      return getUri((Icon)this.mObj1);
    }
    int i = this.mType;
    if ((i != 4) && (i != 6))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("called getUri() on ");
      localStringBuilder.append(this);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    return Uri.parse((String)this.mObj1);
  }
  
  public InputStream getUriInputStream(Context paramContext)
  {
    Uri localUri = getUri();
    Object localObject = localUri.getScheme();
    if ((!"content".equals(localObject)) && (!"file".equals(localObject))) {
      try
      {
        paramContext = new java/io/File;
        paramContext.<init>((String)this.mObj1);
        paramContext = new FileInputStream(paramContext);
        return paramContext;
      }
      catch (FileNotFoundException paramContext)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unable to load image from path: ");
        ((StringBuilder)localObject).append(localUri);
        Log.w("IconCompat", ((StringBuilder)localObject).toString(), paramContext);
      }
    } else {
      try
      {
        paramContext = paramContext.getContentResolver().openInputStream(localUri);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unable to load image from URI: ");
        ((StringBuilder)localObject).append(localUri);
        Log.w("IconCompat", ((StringBuilder)localObject).toString(), paramContext);
      }
    }
    return null;
  }
  
  public Drawable loadDrawable(Context paramContext)
  {
    checkResource(paramContext);
    if (Build.VERSION.SDK_INT >= 23) {
      return toIcon(paramContext).loadDrawable(paramContext);
    }
    paramContext = loadDrawableInner(paramContext);
    if ((paramContext != null) && ((this.mTintList != null) || (this.mTintMode != DEFAULT_TINT_MODE)))
    {
      paramContext.mutate();
      DrawableCompat.setTintList(paramContext, this.mTintList);
      DrawableCompat.setTintMode(paramContext, this.mTintMode);
    }
    return paramContext;
  }
  
  public void onPostParceling()
  {
    this.mTintMode = PorterDuff.Mode.valueOf(this.mTintModeStr);
    Object localObject;
    switch (this.mType)
    {
    case 0: 
    default: 
      break;
    case 3: 
      this.mObj1 = this.mData;
      break;
    case 2: 
    case 4: 
    case 6: 
      String str = new String(this.mData, Charset.forName("UTF-16"));
      this.mObj1 = str;
      if ((this.mType == 2) && (this.mString1 == null))
      {
        localObject = (String)str;
        this.mString1 = str.split(":", -1)[0];
      }
      break;
    case 1: 
    case 5: 
      localObject = this.mParcelable;
      if (localObject != null)
      {
        this.mObj1 = localObject;
      }
      else
      {
        localObject = this.mData;
        this.mObj1 = localObject;
        this.mType = 3;
        this.mInt1 = 0;
        this.mInt2 = localObject.length;
      }
      break;
    case -1: 
      localObject = this.mParcelable;
      if (localObject != null) {
        this.mObj1 = localObject;
      } else {
        throw new IllegalArgumentException("Invalid icon");
      }
      break;
    }
  }
  
  public void onPreParceling(boolean paramBoolean)
  {
    this.mTintModeStr = this.mTintMode.name();
    switch (this.mType)
    {
    case 0: 
    default: 
      break;
    case 4: 
    case 6: 
      this.mData = this.mObj1.toString().getBytes(Charset.forName("UTF-16"));
      break;
    case 3: 
      this.mData = ((byte[])this.mObj1);
      break;
    case 2: 
      this.mData = ((String)this.mObj1).getBytes(Charset.forName("UTF-16"));
      break;
    case 1: 
    case 5: 
      if (paramBoolean)
      {
        Bitmap localBitmap = (Bitmap)this.mObj1;
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localBitmap.compress(Bitmap.CompressFormat.PNG, 90, localByteArrayOutputStream);
        this.mData = localByteArrayOutputStream.toByteArray();
      }
      else
      {
        this.mParcelable = ((Parcelable)this.mObj1);
      }
      break;
    case -1: 
      if (!paramBoolean) {
        this.mParcelable = ((Parcelable)this.mObj1);
      } else {
        throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
      }
      break;
    }
  }
  
  public IconCompat setTint(int paramInt)
  {
    return setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public IconCompat setTintList(ColorStateList paramColorStateList)
  {
    this.mTintList = paramColorStateList;
    return this;
  }
  
  public IconCompat setTintMode(PorterDuff.Mode paramMode)
  {
    this.mTintMode = paramMode;
    return this;
  }
  
  public Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    switch (this.mType)
    {
    case 0: 
    default: 
      throw new IllegalArgumentException("Invalid icon");
    case 3: 
      localBundle.putByteArray("obj", (byte[])this.mObj1);
      break;
    case 2: 
    case 4: 
    case 6: 
      localBundle.putString("obj", (String)this.mObj1);
      break;
    case 1: 
    case 5: 
      localBundle.putParcelable("obj", (Bitmap)this.mObj1);
      break;
    case -1: 
      localBundle.putParcelable("obj", (Parcelable)this.mObj1);
    }
    localBundle.putInt("type", this.mType);
    localBundle.putInt("int1", this.mInt1);
    localBundle.putInt("int2", this.mInt2);
    localBundle.putString("string1", this.mString1);
    Object localObject = this.mTintList;
    if (localObject != null) {
      localBundle.putParcelable("tint_list", (Parcelable)localObject);
    }
    localObject = this.mTintMode;
    if (localObject != DEFAULT_TINT_MODE) {
      localBundle.putString("tint_mode", ((PorterDuff.Mode)localObject).name());
    }
    return localBundle;
  }
  
  @Deprecated
  public Icon toIcon()
  {
    return toIcon(null);
  }
  
  public Icon toIcon(Context paramContext)
  {
    switch (this.mType)
    {
    case 0: 
    default: 
      throw new IllegalArgumentException("Unknown type");
    case 6: 
      if (Build.VERSION.SDK_INT >= 30)
      {
        paramContext = Icon.createWithAdaptiveBitmapContentUri(getUri());
      }
      else if (paramContext != null)
      {
        paramContext = getUriInputStream(paramContext);
        if (paramContext != null)
        {
          if (Build.VERSION.SDK_INT >= 26) {
            paramContext = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(paramContext));
          } else {
            paramContext = Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon(BitmapFactory.decodeStream(paramContext), false));
          }
        }
        else
        {
          paramContext = new StringBuilder();
          paramContext.append("Cannot load adaptive icon from uri: ");
          paramContext.append(getUri());
          throw new IllegalStateException(paramContext.toString());
        }
      }
      else
      {
        paramContext = new StringBuilder();
        paramContext.append("Context is required to resolve the file uri of the icon: ");
        paramContext.append(getUri());
        throw new IllegalArgumentException(paramContext.toString());
      }
    case 5: 
      if (Build.VERSION.SDK_INT >= 26) {
        paramContext = Icon.createWithAdaptiveBitmap((Bitmap)this.mObj1);
      } else {
        paramContext = Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon((Bitmap)this.mObj1, false));
      }
      break;
    case 4: 
      paramContext = Icon.createWithContentUri((String)this.mObj1);
      break;
    case 3: 
      paramContext = Icon.createWithData((byte[])this.mObj1, this.mInt1, this.mInt2);
      break;
    case 2: 
      paramContext = Icon.createWithResource(getResPackage(), this.mInt1);
      break;
    case 1: 
      paramContext = Icon.createWithBitmap((Bitmap)this.mObj1);
      Object localObject = this.mTintList;
      if (localObject != null) {
        paramContext.setTintList((ColorStateList)localObject);
      }
      localObject = this.mTintMode;
      if (localObject != DEFAULT_TINT_MODE) {
        paramContext.setTintMode((PorterDuff.Mode)localObject);
      }
      return paramContext;
    }
    return (Icon)this.mObj1;
  }
  
  public String toString()
  {
    if (this.mType == -1) {
      return String.valueOf(this.mObj1);
    }
    StringBuilder localStringBuilder = new StringBuilder("Icon(typ=");
    localStringBuilder.append(typeToString(this.mType));
    switch (this.mType)
    {
    default: 
      break;
    case 4: 
    case 6: 
      localStringBuilder.append(" uri=");
      localStringBuilder.append(this.mObj1);
      break;
    case 3: 
      localStringBuilder.append(" len=");
      localStringBuilder.append(this.mInt1);
      if (this.mInt2 != 0)
      {
        localStringBuilder.append(" off=");
        localStringBuilder.append(this.mInt2);
      }
      break;
    case 2: 
      localStringBuilder.append(" pkg=");
      localStringBuilder.append(this.mString1);
      localStringBuilder.append(" id=");
      localStringBuilder.append(String.format("0x%08x", new Object[] { Integer.valueOf(getResId()) }));
      break;
    case 1: 
    case 5: 
      localStringBuilder.append(" size=");
      localStringBuilder.append(((Bitmap)this.mObj1).getWidth());
      localStringBuilder.append("x");
      localStringBuilder.append(((Bitmap)this.mObj1).getHeight());
    }
    if (this.mTintList != null)
    {
      localStringBuilder.append(" tint=");
      localStringBuilder.append(this.mTintList);
    }
    if (this.mTintMode != DEFAULT_TINT_MODE)
    {
      localStringBuilder.append(" mode=");
      localStringBuilder.append(this.mTintMode);
    }
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface IconType {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\graphics\drawable\IconCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */