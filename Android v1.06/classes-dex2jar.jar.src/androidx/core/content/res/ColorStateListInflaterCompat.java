package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.R.attr;
import androidx.core.R.styleable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ColorStateListInflaterCompat
{
  private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal();
  
  public static ColorStateList createFromXml(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2) {
      return createFromXmlInner(paramResources, paramXmlPullParser, localAttributeSet, paramTheme);
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  public static ColorStateList createFromXmlInner(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    String str = paramXmlPullParser.getName();
    if (str.equals("selector")) {
      return inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlPullParser.getPositionDescription());
    paramResources.append(": invalid color state list tag ");
    paramResources.append(str);
    throw new XmlPullParserException(paramResources.toString());
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
  
  public static ColorStateList inflate(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    try
    {
      paramResources = createFromXml(paramResources, paramResources.getXml(paramInt), paramTheme);
      return paramResources;
    }
    catch (Exception paramResources)
    {
      Log.e("CSLCompat", "Failed to inflate ColorStateList.", paramResources);
    }
    return null;
  }
  
  private static ColorStateList inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    int i2 = paramXmlPullParser.getDepth() + 1;
    Object localObject1 = new int[20][];
    Object localObject2 = new int[20];
    int i;
    for (int j = 0;; j = i)
    {
      int k = paramXmlPullParser.next();
      if (k == 1) {
        break;
      }
      int m = paramXmlPullParser.getDepth();
      if ((m < i2) && (k == 3)) {
        break;
      }
      Object localObject5 = localObject2;
      Object localObject3 = localObject1;
      i = j;
      Object localObject4;
      if (k == 2)
      {
        localObject5 = localObject2;
        localObject3 = localObject1;
        i = j;
        if (m <= i2) {
          if (!paramXmlPullParser.getName().equals("item"))
          {
            localObject5 = localObject2;
            localObject3 = localObject1;
            i = j;
          }
          else
          {
            localObject5 = obtainAttributes(paramResources, paramTheme, paramAttributeSet, R.styleable.ColorStateListItem);
            i = ((TypedArray)localObject5).getResourceId(R.styleable.ColorStateListItem_android_color, -1);
            if ((i != -1) && (!isColorInt(paramResources, i))) {
              try
              {
                i = createFromXml(paramResources, paramResources.getXml(i), paramTheme).getDefaultColor();
              }
              catch (Exception localException)
              {
                i = ((TypedArray)localObject5).getColor(R.styleable.ColorStateListItem_android_color, -65281);
              }
            } else {
              i = ((TypedArray)localObject5).getColor(R.styleable.ColorStateListItem_android_color, -65281);
            }
            float f = 1.0F;
            if (((TypedArray)localObject5).hasValue(R.styleable.ColorStateListItem_android_alpha)) {
              f = ((TypedArray)localObject5).getFloat(R.styleable.ColorStateListItem_android_alpha, 1.0F);
            } else if (((TypedArray)localObject5).hasValue(R.styleable.ColorStateListItem_alpha)) {
              f = ((TypedArray)localObject5).getFloat(R.styleable.ColorStateListItem_alpha, 1.0F);
            }
            ((TypedArray)localObject5).recycle();
            int i3 = paramAttributeSet.getAttributeCount();
            localObject4 = new int[i3];
            k = 0;
            int n;
            for (m = 0; k < i3; m = n)
            {
              int i1 = paramAttributeSet.getAttributeNameResource(k);
              n = m;
              if (i1 != 16843173)
              {
                n = m;
                if (i1 != 16843551)
                {
                  n = m;
                  if (i1 != R.attr.alpha)
                  {
                    if (paramAttributeSet.getAttributeBooleanValue(k, false)) {
                      n = i1;
                    } else {
                      n = -i1;
                    }
                    localObject4[m] = n;
                    n = m + 1;
                  }
                }
              }
              k++;
            }
            localObject4 = StateSet.trimStateSet((int[])localObject4, m);
            localObject5 = GrowingArrayUtils.append((int[])localObject2, j, modulateColorAlpha(i, f));
            localObject4 = (int[][])GrowingArrayUtils.append((Object[])localObject1, j, localObject4);
            i = j + 1;
          }
        }
      }
      localObject2 = localObject5;
      localObject1 = localObject4;
    }
    paramResources = new int[j];
    paramXmlPullParser = new int[j][];
    System.arraycopy(localObject2, 0, paramResources, 0, j);
    System.arraycopy(localObject1, 0, paramXmlPullParser, 0, j);
    return new ColorStateList(paramXmlPullParser, paramResources);
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
  
  private static int modulateColorAlpha(int paramInt, float paramFloat)
  {
    return paramInt & 0xFFFFFF | Math.round(Color.alpha(paramInt) * paramFloat) << 24;
  }
  
  private static TypedArray obtainAttributes(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      paramResources = paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    } else {
      paramResources = paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
    }
    return paramResources;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\content\res\ColorStateListInflaterCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */