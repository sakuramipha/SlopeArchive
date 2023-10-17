package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.ImageView.ScaleType;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzezf;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfpm;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbx
{
  public static Point zza(MotionEvent paramMotionEvent, View paramView)
  {
    paramView = zzj(paramView);
    return new Point((int)paramMotionEvent.getRawX() - paramView[0], (int)paramMotionEvent.getRawY() - paramView[1]);
  }
  
  public static WindowManager.LayoutParams zzb()
  {
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
    zzbbc localzzbbc = zzbbk.zzhB;
    localLayoutParams.flags = ((Integer)zzba.zzc().zzb(localzzbbc)).intValue();
    localLayoutParams.type = 2;
    localLayoutParams.gravity = 8388659;
    return localLayoutParams;
  }
  
  public static JSONObject zzc(String paramString, Context paramContext, Point paramPoint1, Point paramPoint2)
  {
    JSONObject localJSONObject2 = null;
    Object localObject = null;
    try
    {
      JSONObject localJSONObject1 = new org/json/JSONObject;
      localJSONObject1.<init>();
      try
      {
        localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        try
        {
          int i = paramPoint2.x;
          localJSONObject2.put("x", zzay.zzb().zzb(paramContext, i));
          i = paramPoint2.y;
          localJSONObject2.put("y", zzay.zzb().zzb(paramContext, i));
          i = paramPoint1.x;
          localJSONObject2.put("start_x", zzay.zzb().zzb(paramContext, i));
          i = paramPoint1.y;
          localJSONObject2.put("start_y", zzay.zzb().zzb(paramContext, i));
          paramContext = localJSONObject2;
        }
        catch (JSONException paramContext)
        {
          zzbzt.zzh("Error occurred while putting signals into JSON object.", paramContext);
          paramContext = (Context)localObject;
        }
        localJSONObject1.put("click_point", paramContext);
        localJSONObject1.put("asset_id", paramString);
        paramString = localJSONObject1;
      }
      catch (Exception paramContext)
      {
        paramString = localJSONObject1;
      }
      zzbzt.zzh("Error occurred while grabbing click signals.", paramContext);
    }
    catch (Exception paramContext)
    {
      paramString = localJSONObject2;
    }
    return paramString;
  }
  
  public static JSONObject zzd(Context paramContext, Map paramMap1, Map paramMap2, View paramView, ImageView.ScaleType paramScaleType)
  {
    String str = "ad_view";
    Object localObject1 = "relative_to";
    JSONObject localJSONObject1 = new JSONObject();
    if ((paramMap1 != null) && (paramView != null))
    {
      int[] arrayOfInt = zzj(paramView);
      paramView = paramMap1.entrySet().iterator();
      paramMap1 = (Map)localObject1;
      while (paramView.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramView.next();
        View localView = (View)((WeakReference)localEntry.getValue()).get();
        if (localView != null)
        {
          Object localObject2 = zzj(localView);
          JSONObject localJSONObject2 = new JSONObject();
          localObject1 = new JSONObject();
          try
          {
            int i = localView.getMeasuredWidth();
            try
            {
              ((JSONObject)localObject1).put("width", zzay.zzb().zzb(paramContext, i));
              i = localView.getMeasuredHeight();
              ((JSONObject)localObject1).put("height", zzay.zzb().zzb(paramContext, i));
              int j = localObject2[0];
              i = arrayOfInt[0];
              ((JSONObject)localObject1).put("x", zzay.zzb().zzb(paramContext, j - i));
              j = localObject2[1];
              i = arrayOfInt[1];
              ((JSONObject)localObject1).put("y", zzay.zzb().zzb(paramContext, j - i));
              ((JSONObject)localObject1).put(paramMap1, str);
              localJSONObject2.put("frame", localObject1);
              localObject1 = new android/graphics/Rect;
              ((Rect)localObject1).<init>();
              if (localView.getLocalVisibleRect((Rect)localObject1))
              {
                localObject1 = zzk(paramContext, (Rect)localObject1);
              }
              else
              {
                localObject1 = new org/json/JSONObject;
                ((JSONObject)localObject1).<init>();
                ((JSONObject)localObject1).put("width", 0);
                ((JSONObject)localObject1).put("height", 0);
                i = localObject2[0];
                j = arrayOfInt[0];
                ((JSONObject)localObject1).put("x", zzay.zzb().zzb(paramContext, i - j));
                j = localObject2[1];
                i = arrayOfInt[1];
                ((JSONObject)localObject1).put("y", zzay.zzb().zzb(paramContext, j - i));
                ((JSONObject)localObject1).put(paramMap1, str);
              }
              localJSONObject2.put("visible_bounds", localObject1);
              if (((String)localEntry.getKey()).equals("3010"))
              {
                localObject1 = zzbbk.zzhv;
                if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
                  localJSONObject2.put("mediaview_graphics_matrix", localView.getMatrix().toShortString());
                }
                localObject1 = zzbbk.zzhw;
                if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
                {
                  localObject1 = localView.getLayoutParams();
                  localJSONObject2.put("view_width_layout_type", zzl(((ViewGroup.LayoutParams)localObject1).width) - 1);
                  localJSONObject2.put("view_height_layout_type", zzl(((ViewGroup.LayoutParams)localObject1).height) - 1);
                }
                localObject1 = zzbbk.zzhx;
                if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
                {
                  localObject2 = new java/util/ArrayList;
                  ((ArrayList)localObject2).<init>();
                  ((ArrayList)localObject2).add(Integer.valueOf(localView.getId()));
                  for (localObject1 = localView.getParent(); (localObject1 instanceof View); localObject1 = ((ViewParent)localObject1).getParent()) {
                    ((ArrayList)localObject2).add(Integer.valueOf(((View)localObject1).getId()));
                  }
                  localJSONObject2.put("view_path", TextUtils.join("/", (Iterable)localObject2));
                }
                localObject1 = zzbbk.zzhy;
                if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) && (paramScaleType != null)) {
                  localJSONObject2.put("mediaview_scale_type", paramScaleType.ordinal());
                }
              }
              if ((localView instanceof TextView))
              {
                localObject1 = (TextView)localView;
                localJSONObject2.put("text_color", ((TextView)localObject1).getCurrentTextColor());
                float f = ((TextView)localObject1).getTextSize();
                d = f;
              }
            }
            catch (JSONException localJSONException1)
            {
              for (;;)
              {
                try
                {
                  double d;
                  localJSONObject2.put("font_size", d);
                  localJSONObject2.put("text", ((TextView)localObject1).getText());
                  boolean bool;
                  if ((paramMap2 != null) && (paramMap2.containsKey(localEntry.getKey())) && (localView.isClickable())) {
                    bool = true;
                  } else {
                    bool = false;
                  }
                  localJSONObject2.put("is_clickable", bool);
                  localObject1 = (String)localEntry.getKey();
                }
                catch (JSONException localJSONException3)
                {
                  continue;
                }
                try
                {
                  localJSONObject1.put((String)localObject1, localJSONObject2);
                }
                catch (JSONException localJSONException4) {}
              }
              localJSONException1 = localJSONException1;
            }
            zzbzt.zzj("Unable to get asset views information");
          }
          catch (JSONException localJSONException2) {}
        }
      }
      return localJSONObject1;
    }
    return localJSONObject1;
  }
  
  public static JSONObject zze(Context paramContext, View paramView)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramView == null) {
      return localJSONObject;
    }
    try
    {
      zzt.zzp();
      localJSONObject.put("can_show_on_lock_screen", zzs.zzl(paramView));
      zzt.zzp();
      localJSONObject.put("is_keyguard_locked", zzs.zzz(paramContext));
    }
    catch (JSONException paramContext)
    {
      zzbzt.zzj("Unable to get lock screen information");
    }
    return localJSONObject;
  }
  
  public static JSONObject zzf(View paramView)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramView == null) {
      return localJSONObject;
    }
    try
    {
      Object localObject = zzbbk.zzhu;
      boolean bool3 = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
      boolean bool1 = false;
      boolean bool2 = false;
      if (bool3)
      {
        zzt.zzp();
        for (paramView = paramView.getParent(); (paramView != null) && (!(paramView instanceof ScrollView)); paramView = paramView.getParent()) {}
        if (paramView == null) {
          bool1 = bool2;
        } else {
          bool1 = true;
        }
        localJSONObject.put("contained_in_scroll_view", bool1);
      }
      else
      {
        zzt.zzp();
        for (localObject = paramView.getParent(); (localObject != null) && (!(localObject instanceof AdapterView)); localObject = ((ViewParent)localObject).getParent()) {}
        int i;
        if (localObject == null) {
          i = -1;
        } else {
          i = ((AdapterView)localObject).getPositionForView(paramView);
        }
        if (i != -1) {
          bool1 = true;
        }
        localJSONObject.put("contained_in_scroll_view", bool1);
      }
    }
    catch (Exception paramView)
    {
      for (;;) {}
    }
    return localJSONObject;
  }
  
  public static JSONObject zzg(Context paramContext, View paramView)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramView == null) {
      return localJSONObject;
    }
    int i;
    try
    {
      int[] arrayOfInt1 = zzj(paramView);
      int[] arrayOfInt2 = new int[2];
      arrayOfInt2[0] = paramView.getMeasuredWidth();
      arrayOfInt2[1] = paramView.getMeasuredHeight();
      for (Object localObject = paramView.getParent(); (localObject instanceof ViewGroup); localObject = ((ViewParent)localObject).getParent())
      {
        ViewGroup localViewGroup = (ViewGroup)localObject;
        arrayOfInt2[0] = Math.min(localViewGroup.getMeasuredWidth(), arrayOfInt2[0]);
        arrayOfInt2[1] = Math.min(localViewGroup.getMeasuredHeight(), arrayOfInt2[1]);
      }
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      i = paramView.getMeasuredWidth();
      ((JSONObject)localObject).put("width", zzay.zzb().zzb(paramContext, i));
      i = paramView.getMeasuredHeight();
      ((JSONObject)localObject).put("height", zzay.zzb().zzb(paramContext, i));
      i = arrayOfInt1[0];
      ((JSONObject)localObject).put("x", zzay.zzb().zzb(paramContext, i));
      i = arrayOfInt1[1];
      ((JSONObject)localObject).put("y", zzay.zzb().zzb(paramContext, i));
      i = arrayOfInt2[0];
      ((JSONObject)localObject).put("maximum_visible_width", zzay.zzb().zzb(paramContext, i));
      i = arrayOfInt2[1];
      ((JSONObject)localObject).put("maximum_visible_height", zzay.zzb().zzb(paramContext, i));
      ((JSONObject)localObject).put("relative_to", "window");
      localJSONObject.put("frame", localObject);
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      if (paramView.getGlobalVisibleRect((Rect)localObject))
      {
        paramContext = zzk(paramContext, (Rect)localObject);
      }
      else
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>();
        ((JSONObject)localObject).put("width", 0);
        ((JSONObject)localObject).put("height", 0);
        i = arrayOfInt1[0];
        ((JSONObject)localObject).put("x", zzay.zzb().zzb(paramContext, i));
        i = arrayOfInt1[1];
        ((JSONObject)localObject).put("y", zzay.zzb().zzb(paramContext, i));
        ((JSONObject)localObject).put("relative_to", "window");
        paramContext = (Context)localObject;
      }
      localJSONObject.put("visible_bounds", paramContext);
    }
    catch (Exception paramContext)
    {
      zzbzt.zzj("Unable to get native ad view bounding box");
    }
    paramContext = zzbbk.zzfW;
    if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue())
    {
      paramContext = paramView.getParent();
      if (paramContext == null) {}
    }
    try
    {
      try
      {
        paramContext = (String)paramContext.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(paramContext, new Object[0]);
      }
      catch (InvocationTargetException paramContext) {}catch (IllegalAccessException paramContext) {}catch (SecurityException paramContext) {}
      zzbzt.zzh("Cannot access method getTemplateTypeName: ", paramContext);
    }
    catch (NoSuchMethodException paramContext)
    {
      for (;;) {}
    }
    paramContext = "";
    try
    {
      i = paramContext.hashCode();
      if (i != -2066603854)
      {
        if ((i == 2019754500) && (paramContext.equals("medium_template")))
        {
          i = 1;
          break label504;
        }
      }
      else if (paramContext.equals("small_template"))
      {
        i = 0;
        break label504;
      }
      i = -1;
      label504:
      if (i != 0)
      {
        if (i != 1) {
          localJSONObject.put("native_template_type", 0);
        } else {
          localJSONObject.put("native_template_type", 2);
        }
      }
      else {
        localJSONObject.put("native_template_type", 1);
      }
    }
    catch (JSONException paramContext)
    {
      zzbzt.zzh("Could not log native template signal to JSON", paramContext);
    }
    paramContext = zzbbk.zzhw;
    if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue()) {
      try
      {
        paramContext = paramView.getLayoutParams();
        localJSONObject.put("view_width_layout_type", zzl(paramContext.width) - 1);
        localJSONObject.put("view_height_layout_type", zzl(paramContext.height) - 1);
      }
      catch (Exception paramContext)
      {
        zze.zza("Unable to get native ad view layout types");
      }
    }
    return localJSONObject;
  }
  
  public static boolean zzh(Context paramContext, zzezf paramzzezf)
  {
    if (!paramzzezf.zzO) {
      return false;
    }
    paramzzezf = zzbbk.zzhz;
    if (((Boolean)zzba.zzc().zzb(paramzzezf)).booleanValue())
    {
      paramContext = zzbbk.zzhC;
      return ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
    }
    paramzzezf = zzbbk.zzhA;
    paramzzezf = (String)zzba.zzc().zzb(paramzzezf);
    if ((!paramzzezf.isEmpty()) && (paramContext != null))
    {
      paramContext = paramContext.getPackageName();
      paramzzezf = zzfpm.zzc(zzfok.zzc(';')).zzd(paramzzezf).iterator();
      while (paramzzezf.hasNext()) {
        if (((String)paramzzezf.next()).equals(paramContext)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean zzi(int paramInt)
  {
    zzbbc localzzbbc = zzbbk.zzde;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      localzzbbc = zzbbk.zzdf;
      if ((!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (paramInt > 15299999)) {
        return false;
      }
    }
    return true;
  }
  
  public static int[] zzj(View paramView)
  {
    int[] arrayOfInt = new int[2];
    if (paramView != null) {
      paramView.getLocationOnScreen(arrayOfInt);
    }
    return arrayOfInt;
  }
  
  private static JSONObject zzk(Context paramContext, Rect paramRect)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    int i = paramRect.right;
    int j = paramRect.left;
    localJSONObject.put("width", zzay.zzb().zzb(paramContext, i - j));
    j = paramRect.bottom;
    i = paramRect.top;
    localJSONObject.put("height", zzay.zzb().zzb(paramContext, j - i));
    i = paramRect.left;
    localJSONObject.put("x", zzay.zzb().zzb(paramContext, i));
    i = paramRect.top;
    localJSONObject.put("y", zzay.zzb().zzb(paramContext, i));
    localJSONObject.put("relative_to", "self");
    return localJSONObject;
  }
  
  private static int zzl(int paramInt)
  {
    if (paramInt != -2)
    {
      if (paramInt != -1) {
        return 2;
      }
      return 3;
    }
    return 4;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */