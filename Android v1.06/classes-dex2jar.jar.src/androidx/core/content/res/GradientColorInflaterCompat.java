package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.R.styleable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class GradientColorInflaterCompat
{
  private static final int TILE_MODE_CLAMP = 0;
  private static final int TILE_MODE_MIRROR = 2;
  private static final int TILE_MODE_REPEAT = 1;
  
  private static ColorStops checkColors(ColorStops paramColorStops, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if (paramColorStops != null) {
      return paramColorStops;
    }
    if (paramBoolean) {
      return new ColorStops(paramInt1, paramInt3, paramInt2);
    }
    return new ColorStops(paramInt1, paramInt2);
  }
  
  static Shader createFromXml(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
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
  
  static Shader createFromXmlInner(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws IOException, XmlPullParserException
  {
    Object localObject = paramXmlPullParser.getName();
    if (((String)localObject).equals("gradient"))
    {
      localObject = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, R.styleable.GradientColor);
      float f3 = TypedArrayUtils.getNamedFloat((TypedArray)localObject, paramXmlPullParser, "startX", R.styleable.GradientColor_android_startX, 0.0F);
      float f5 = TypedArrayUtils.getNamedFloat((TypedArray)localObject, paramXmlPullParser, "startY", R.styleable.GradientColor_android_startY, 0.0F);
      float f4 = TypedArrayUtils.getNamedFloat((TypedArray)localObject, paramXmlPullParser, "endX", R.styleable.GradientColor_android_endX, 0.0F);
      float f7 = TypedArrayUtils.getNamedFloat((TypedArray)localObject, paramXmlPullParser, "endY", R.styleable.GradientColor_android_endY, 0.0F);
      float f1 = TypedArrayUtils.getNamedFloat((TypedArray)localObject, paramXmlPullParser, "centerX", R.styleable.GradientColor_android_centerX, 0.0F);
      float f6 = TypedArrayUtils.getNamedFloat((TypedArray)localObject, paramXmlPullParser, "centerY", R.styleable.GradientColor_android_centerY, 0.0F);
      int i = TypedArrayUtils.getNamedInt((TypedArray)localObject, paramXmlPullParser, "type", R.styleable.GradientColor_android_type, 0);
      int n = TypedArrayUtils.getNamedColor((TypedArray)localObject, paramXmlPullParser, "startColor", R.styleable.GradientColor_android_startColor, 0);
      boolean bool = TypedArrayUtils.hasAttribute(paramXmlPullParser, "centerColor");
      int m = TypedArrayUtils.getNamedColor((TypedArray)localObject, paramXmlPullParser, "centerColor", R.styleable.GradientColor_android_centerColor, 0);
      int k = TypedArrayUtils.getNamedColor((TypedArray)localObject, paramXmlPullParser, "endColor", R.styleable.GradientColor_android_endColor, 0);
      int j = TypedArrayUtils.getNamedInt((TypedArray)localObject, paramXmlPullParser, "tileMode", R.styleable.GradientColor_android_tileMode, 0);
      float f2 = TypedArrayUtils.getNamedFloat((TypedArray)localObject, paramXmlPullParser, "gradientRadius", R.styleable.GradientColor_android_gradientRadius, 0.0F);
      ((TypedArray)localObject).recycle();
      paramResources = checkColors(inflateChildElements(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme), n, k, bool, m);
      if (i != 1)
      {
        if (i != 2) {
          return new LinearGradient(f3, f5, f4, f7, paramResources.mColors, paramResources.mOffsets, parseTileMode(j));
        }
        return new SweepGradient(f1, f6, paramResources.mColors, paramResources.mOffsets);
      }
      if (f2 > 0.0F) {
        return new RadialGradient(f1, f6, f2, paramResources.mColors, paramResources.mOffsets, parseTileMode(j));
      }
      throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlPullParser.getPositionDescription());
    paramResources.append(": invalid gradient color tag ");
    paramResources.append((String)localObject);
    throw new XmlPullParserException(paramResources.toString());
  }
  
  private static ColorStops inflateChildElements(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    int i = paramXmlPullParser.getDepth() + 1;
    ArrayList localArrayList1 = new ArrayList(20);
    ArrayList localArrayList2 = new ArrayList(20);
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (j == 1) {
        break label236;
      }
      int k = paramXmlPullParser.getDepth();
      if ((k < i) && (j == 3)) {
        break label236;
      }
      if ((j == 2) && (k <= i) && (paramXmlPullParser.getName().equals("item")))
      {
        TypedArray localTypedArray = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, R.styleable.GradientColorItem);
        boolean bool1 = localTypedArray.hasValue(R.styleable.GradientColorItem_android_color);
        boolean bool2 = localTypedArray.hasValue(R.styleable.GradientColorItem_android_offset);
        if ((!bool1) || (!bool2)) {
          break;
        }
        j = localTypedArray.getColor(R.styleable.GradientColorItem_android_color, 0);
        float f = localTypedArray.getFloat(R.styleable.GradientColorItem_android_offset, 0.0F);
        localTypedArray.recycle();
        localArrayList2.add(Integer.valueOf(j));
        localArrayList1.add(Float.valueOf(f));
      }
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlPullParser.getPositionDescription());
    paramResources.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    throw new XmlPullParserException(paramResources.toString());
    label236:
    if (localArrayList2.size() > 0) {
      return new ColorStops(localArrayList2, localArrayList1);
    }
    return null;
  }
  
  private static Shader.TileMode parseTileMode(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2) {
        return Shader.TileMode.CLAMP;
      }
      return Shader.TileMode.MIRROR;
    }
    return Shader.TileMode.REPEAT;
  }
  
  static final class ColorStops
  {
    final int[] mColors;
    final float[] mOffsets;
    
    ColorStops(int paramInt1, int paramInt2)
    {
      this.mColors = new int[] { paramInt1, paramInt2 };
      this.mOffsets = new float[] { 0.0F, 1.0F };
    }
    
    ColorStops(int paramInt1, int paramInt2, int paramInt3)
    {
      this.mColors = new int[] { paramInt1, paramInt2, paramInt3 };
      this.mOffsets = new float[] { 0.0F, 0.5F, 1.0F };
    }
    
    ColorStops(List<Integer> paramList, List<Float> paramList1)
    {
      int j = paramList.size();
      this.mColors = new int[j];
      this.mOffsets = new float[j];
      for (int i = 0; i < j; i++)
      {
        this.mColors[i] = ((Integer)paramList.get(i)).intValue();
        this.mOffsets[i] = ((Float)paramList1.get(i)).floatValue();
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\content\res\GradientColorInflaterCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */