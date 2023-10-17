package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public class PathParser
{
  private static final String LOGTAG = "PathParser";
  
  private static void addNode(ArrayList<PathDataNode> paramArrayList, char paramChar, float[] paramArrayOfFloat)
  {
    paramArrayList.add(new PathDataNode(paramChar, paramArrayOfFloat));
  }
  
  public static boolean canMorph(PathDataNode[] paramArrayOfPathDataNode1, PathDataNode[] paramArrayOfPathDataNode2)
  {
    if ((paramArrayOfPathDataNode1 != null) && (paramArrayOfPathDataNode2 != null))
    {
      if (paramArrayOfPathDataNode1.length != paramArrayOfPathDataNode2.length) {
        return false;
      }
      int i = 0;
      while (i < paramArrayOfPathDataNode1.length) {
        if ((paramArrayOfPathDataNode1[i].mType == paramArrayOfPathDataNode2[i].mType) && (paramArrayOfPathDataNode1[i].mParams.length == paramArrayOfPathDataNode2[i].mParams.length)) {
          i++;
        } else {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  static float[] copyOfRange(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    if (paramInt1 <= paramInt2)
    {
      int i = paramArrayOfFloat.length;
      if ((paramInt1 >= 0) && (paramInt1 <= i))
      {
        paramInt2 -= paramInt1;
        i = Math.min(paramInt2, i - paramInt1);
        float[] arrayOfFloat = new float[paramInt2];
        System.arraycopy(paramArrayOfFloat, paramInt1, arrayOfFloat, 0, i);
        return arrayOfFloat;
      }
      throw new ArrayIndexOutOfBoundsException();
    }
    throw new IllegalArgumentException();
  }
  
  public static PathDataNode[] createNodesFromPathData(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int j = 1;
    int i = 0;
    while (j < paramString.length())
    {
      j = nextStart(paramString, j);
      String str = paramString.substring(i, j).trim();
      if (str.length() > 0)
      {
        float[] arrayOfFloat = getFloats(str);
        addNode(localArrayList, str.charAt(0), arrayOfFloat);
      }
      i = j;
      j++;
    }
    if ((j - i == 1) && (i < paramString.length())) {
      addNode(localArrayList, paramString.charAt(i), new float[0]);
    }
    return (PathDataNode[])localArrayList.toArray(new PathDataNode[localArrayList.size()]);
  }
  
  public static Path createPathFromPathData(String paramString)
  {
    Object localObject = new Path();
    PathDataNode[] arrayOfPathDataNode = createNodesFromPathData(paramString);
    if (arrayOfPathDataNode != null) {
      try
      {
        PathDataNode.nodesToPath(arrayOfPathDataNode, (Path)localObject);
        return (Path)localObject;
      }
      catch (RuntimeException localRuntimeException)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Error in parsing ");
        ((StringBuilder)localObject).append(paramString);
        throw new RuntimeException(((StringBuilder)localObject).toString(), localRuntimeException);
      }
    }
    return null;
  }
  
  public static PathDataNode[] deepCopyNodes(PathDataNode[] paramArrayOfPathDataNode)
  {
    if (paramArrayOfPathDataNode == null) {
      return null;
    }
    PathDataNode[] arrayOfPathDataNode = new PathDataNode[paramArrayOfPathDataNode.length];
    for (int i = 0; i < paramArrayOfPathDataNode.length; i++) {
      arrayOfPathDataNode[i] = new PathDataNode(paramArrayOfPathDataNode[i]);
    }
    return arrayOfPathDataNode;
  }
  
  private static void extract(String paramString, int paramInt, ExtractFloatResult paramExtractFloatResult)
  {
    paramExtractFloatResult.mEndWithNegOrDot = false;
    int k = paramInt;
    int i = 0;
    int m = 0;
    int j = 0;
    while (k < paramString.length())
    {
      int n = paramString.charAt(k);
      if (n != 32)
      {
        if ((n != 69) && (n != 101)) {}
        switch (n)
        {
        default: 
          break;
        case 46: 
          if (m == 0)
          {
            i = 0;
            m = 1;
            break label141;
          }
          paramExtractFloatResult.mEndWithNegOrDot = true;
          break;
        case 45: 
          if ((k != paramInt) && (i == 0))
          {
            paramExtractFloatResult.mEndWithNegOrDot = true;
          }
          else
          {
            i = 0;
            break label141;
            i = 1;
          }
          break;
        }
      }
      i = 0;
      j = 1;
      label141:
      if (j != 0) {
        break;
      }
      k++;
    }
    paramExtractFloatResult.mEndPosition = k;
  }
  
  private static float[] getFloats(String paramString)
  {
    if ((paramString.charAt(0) != 'z') && (paramString.charAt(0) != 'Z')) {
      try
      {
        localObject2 = new float[paramString.length()];
        Object localObject1 = new androidx/core/graphics/PathParser$ExtractFloatResult;
        ((ExtractFloatResult)localObject1).<init>();
        int n = paramString.length();
        int i = 1;
        int k = 0;
        while (i < n)
        {
          extract(paramString, i, (ExtractFloatResult)localObject1);
          int m = ((ExtractFloatResult)localObject1).mEndPosition;
          int j = k;
          if (i < m)
          {
            localObject2[k] = Float.parseFloat(paramString.substring(i, m));
            j = k + 1;
          }
          if (((ExtractFloatResult)localObject1).mEndWithNegOrDot)
          {
            i = m;
            k = j;
          }
          else
          {
            i = m + 1;
            k = j;
          }
        }
        localObject1 = copyOfRange((float[])localObject2, 0, k);
        return (float[])localObject1;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("error in parsing \"");
        ((StringBuilder)localObject2).append(paramString);
        ((StringBuilder)localObject2).append("\"");
        throw new RuntimeException(((StringBuilder)localObject2).toString(), localNumberFormatException);
      }
    }
    return new float[0];
  }
  
  public static boolean interpolatePathDataNodes(PathDataNode[] paramArrayOfPathDataNode1, PathDataNode[] paramArrayOfPathDataNode2, PathDataNode[] paramArrayOfPathDataNode3, float paramFloat)
  {
    if ((paramArrayOfPathDataNode1 != null) && (paramArrayOfPathDataNode2 != null) && (paramArrayOfPathDataNode3 != null))
    {
      if ((paramArrayOfPathDataNode1.length == paramArrayOfPathDataNode2.length) && (paramArrayOfPathDataNode2.length == paramArrayOfPathDataNode3.length))
      {
        boolean bool = canMorph(paramArrayOfPathDataNode2, paramArrayOfPathDataNode3);
        int i = 0;
        if (!bool) {
          return false;
        }
        while (i < paramArrayOfPathDataNode1.length)
        {
          paramArrayOfPathDataNode1[i].interpolatePathDataNode(paramArrayOfPathDataNode2[i], paramArrayOfPathDataNode3[i], paramFloat);
          i++;
        }
        return true;
      }
      throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }
    throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
  }
  
  private static int nextStart(String paramString, int paramInt)
  {
    while (paramInt < paramString.length())
    {
      int i = paramString.charAt(paramInt);
      if ((((i - 65) * (i - 90) <= 0) || ((i - 97) * (i - 122) <= 0)) && (i != 101) && (i != 69)) {
        return paramInt;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  public static void updateNodes(PathDataNode[] paramArrayOfPathDataNode1, PathDataNode[] paramArrayOfPathDataNode2)
  {
    for (int i = 0; i < paramArrayOfPathDataNode2.length; i++)
    {
      paramArrayOfPathDataNode1[i].mType = paramArrayOfPathDataNode2[i].mType;
      for (int j = 0; j < paramArrayOfPathDataNode2[i].mParams.length; j++) {
        paramArrayOfPathDataNode1[i].mParams[j] = paramArrayOfPathDataNode2[i].mParams[j];
      }
    }
  }
  
  private static class ExtractFloatResult
  {
    int mEndPosition;
    boolean mEndWithNegOrDot;
  }
  
  public static class PathDataNode
  {
    public float[] mParams;
    public char mType;
    
    PathDataNode(char paramChar, float[] paramArrayOfFloat)
    {
      this.mType = paramChar;
      this.mParams = paramArrayOfFloat;
    }
    
    PathDataNode(PathDataNode paramPathDataNode)
    {
      this.mType = paramPathDataNode.mType;
      paramPathDataNode = paramPathDataNode.mParams;
      this.mParams = PathParser.copyOfRange(paramPathDataNode, 0, paramPathDataNode.length);
    }
    
    private static void addCommand(Path paramPath, float[] paramArrayOfFloat1, char paramChar1, char paramChar2, float[] paramArrayOfFloat2)
    {
      float f8 = paramArrayOfFloat1[0];
      float f9 = paramArrayOfFloat1[1];
      float f7 = paramArrayOfFloat1[2];
      float f10 = paramArrayOfFloat1[3];
      float f6 = paramArrayOfFloat1[4];
      float f5 = paramArrayOfFloat1[5];
      float f2 = f8;
      float f1 = f9;
      float f3 = f7;
      float f4 = f10;
      char c1;
      switch (paramChar2)
      {
      default: 
        f4 = f10;
        f3 = f7;
        f1 = f9;
        f2 = f8;
      case 'L': 
      case 'M': 
      case 'T': 
      case 'l': 
      case 'm': 
      case 't': 
      case 'Z': 
      case 'z': 
        for (;;)
        {
          c1 = '\002';
          break;
          paramPath.close();
          paramPath.moveTo(f6, f5);
          f2 = f6;
          f3 = f2;
          f1 = f5;
          f4 = f1;
        }
      case 'Q': 
      case 'S': 
      case 'q': 
      case 's': 
        c1 = '\004';
        f2 = f8;
        f1 = f9;
        f3 = f7;
        f4 = f10;
        break;
      case 'H': 
      case 'V': 
      case 'h': 
      case 'v': 
        c1 = '\001';
        f2 = f8;
        f1 = f9;
        f3 = f7;
        f4 = f10;
        break;
      case 'C': 
      case 'c': 
        c1 = '\006';
        f2 = f8;
        f1 = f9;
        f3 = f7;
        f4 = f10;
        break;
      case 'A': 
      case 'a': 
        c1 = '\007';
        f4 = f10;
        f3 = f7;
        f1 = f9;
        f2 = f8;
      }
      f9 = f1;
      char c2 = '\000';
      int i = paramChar1;
      f7 = f5;
      f8 = f6;
      f1 = f2;
      f2 = f9;
      paramChar1 = c2;
      while (paramChar1 < paramArrayOfFloat2.length)
      {
        label1230:
        label1556:
        label1567:
        boolean bool1;
        boolean bool2;
        if (paramChar2 != 'A')
        {
          int j;
          int k;
          if (paramChar2 != 'C')
          {
            if (paramChar2 != 'H')
            {
              if (paramChar2 != 'Q')
              {
                if (paramChar2 != 'V')
                {
                  if (paramChar2 != 'a')
                  {
                    if (paramChar2 != 'c') {
                      if (paramChar2 != 'h') {
                        if (paramChar2 != 'q') {
                          if (paramChar2 != 'v') {
                            if (paramChar2 != 'L') {
                              if (paramChar2 != 'M') {
                                if (paramChar2 != 'S') {
                                  if (paramChar2 != 'T') {
                                    if (paramChar2 != 'l') {
                                      if (paramChar2 != 'm') {
                                        if (paramChar2 != 's') {
                                          if (paramChar2 != 't') {
                                            break label2101;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    for (;;)
                    {
                      if ((i != 113) && (i != 116) && (i != 81) && (i != 84))
                      {
                        f4 = 0.0F;
                        f3 = 0.0F;
                      }
                      else
                      {
                        f3 = f1 - f3;
                        f4 = f2 - f4;
                      }
                      i = paramChar1 + '\000';
                      f5 = paramArrayOfFloat2[i];
                      c2 = paramChar1 + '\001';
                      paramPath.rQuadTo(f3, f4, f5, paramArrayOfFloat2[c2]);
                      f5 = f1 + paramArrayOfFloat2[i];
                      f6 = f2 + paramArrayOfFloat2[c2];
                      f4 += f2;
                      f3 += f1;
                      f2 = f6;
                      f1 = f5;
                      continue;
                      if ((i != 99) && (i != 115) && (i != 67) && (i != 83))
                      {
                        f3 = 0.0F;
                        f4 = 0.0F;
                      }
                      else
                      {
                        f4 = f2 - f4;
                        f3 = f1 - f3;
                      }
                      j = paramChar1 + '\000';
                      f6 = paramArrayOfFloat2[j];
                      i = paramChar1 + '\001';
                      f5 = paramArrayOfFloat2[i];
                      k = paramChar1 + '\002';
                      f9 = paramArrayOfFloat2[k];
                      c2 = paramChar1 + '\003';
                      paramPath.rCubicTo(f3, f4, f6, f5, f9, paramArrayOfFloat2[c2]);
                      f6 = paramArrayOfFloat2[j] + f1;
                      f3 = paramArrayOfFloat2[i] + f2;
                      f4 = f1 + paramArrayOfFloat2[k];
                      f5 = paramArrayOfFloat2[c2];
                      f1 = f6;
                      break label1556;
                      i = paramChar1 + '\000';
                      f1 += paramArrayOfFloat2[i];
                      c2 = paramChar1 + '\001';
                      f2 += paramArrayOfFloat2[c2];
                      if (paramChar1 > 0)
                      {
                        paramPath.rLineTo(paramArrayOfFloat2[i], paramArrayOfFloat2[c2]);
                      }
                      else
                      {
                        paramPath.rMoveTo(paramArrayOfFloat2[i], paramArrayOfFloat2[c2]);
                        break label1230;
                        c2 = paramChar1 + '\000';
                        f5 = paramArrayOfFloat2[c2];
                        i = paramChar1 + '\001';
                        paramPath.rLineTo(f5, paramArrayOfFloat2[i]);
                        f1 += paramArrayOfFloat2[c2];
                        for (f5 = paramArrayOfFloat2[i];; f5 = paramArrayOfFloat2[i])
                        {
                          f2 += f5;
                          break;
                          if ((i != 113) && (i != 116) && (i != 81))
                          {
                            f6 = f2;
                            f5 = f1;
                            if (i != 84) {}
                          }
                          else
                          {
                            f5 = f1 * 2.0F - f3;
                            f6 = f2 * 2.0F - f4;
                          }
                          c2 = paramChar1 + '\000';
                          f1 = paramArrayOfFloat2[c2];
                          i = paramChar1 + '\001';
                          paramPath.quadTo(f5, f6, f1, paramArrayOfFloat2[i]);
                          f1 = paramArrayOfFloat2[c2];
                          f2 = paramArrayOfFloat2[i];
                          f4 = f6;
                          f3 = f5;
                          break;
                          if ((i != 99) && (i != 115) && (i != 67))
                          {
                            f6 = f2;
                            f5 = f1;
                            if (i != 83) {}
                          }
                          else
                          {
                            f5 = f1 * 2.0F - f3;
                            f6 = f2 * 2.0F - f4;
                          }
                          j = paramChar1 + '\000';
                          f2 = paramArrayOfFloat2[j];
                          k = paramChar1 + '\001';
                          f1 = paramArrayOfFloat2[k];
                          i = paramChar1 + '\002';
                          f3 = paramArrayOfFloat2[i];
                          c2 = paramChar1 + '\003';
                          paramPath.cubicTo(f5, f6, f2, f1, f3, paramArrayOfFloat2[c2]);
                          f1 = paramArrayOfFloat2[j];
                          f3 = paramArrayOfFloat2[k];
                          f5 = paramArrayOfFloat2[i];
                          f2 = paramArrayOfFloat2[c2];
                          break label1567;
                          i = paramChar1 + '\000';
                          f1 = paramArrayOfFloat2[i];
                          c2 = paramChar1 + '\001';
                          f2 = paramArrayOfFloat2[c2];
                          if (paramChar1 > 0)
                          {
                            paramPath.lineTo(paramArrayOfFloat2[i], paramArrayOfFloat2[c2]);
                            break;
                          }
                          paramPath.moveTo(paramArrayOfFloat2[i], paramArrayOfFloat2[c2]);
                          f7 = f2;
                          f8 = f1;
                          break;
                          i = paramChar1 + '\000';
                          f1 = paramArrayOfFloat2[i];
                          c2 = paramChar1 + '\001';
                          paramPath.lineTo(f1, paramArrayOfFloat2[c2]);
                          f1 = paramArrayOfFloat2[i];
                          f2 = paramArrayOfFloat2[c2];
                          break;
                          i = paramChar1 + '\000';
                          paramPath.rLineTo(0.0F, paramArrayOfFloat2[i]);
                        }
                        k = paramChar1 + '\000';
                        f3 = paramArrayOfFloat2[k];
                        c2 = paramChar1 + '\001';
                        f4 = paramArrayOfFloat2[c2];
                        j = paramChar1 + '\002';
                        f5 = paramArrayOfFloat2[j];
                        i = paramChar1 + '\003';
                        paramPath.rQuadTo(f3, f4, f5, paramArrayOfFloat2[i]);
                        f6 = paramArrayOfFloat2[k] + f1;
                        f3 = paramArrayOfFloat2[c2] + f2;
                        f4 = f1 + paramArrayOfFloat2[j];
                        f5 = paramArrayOfFloat2[i];
                        f1 = f6;
                        break label1556;
                        i = paramChar1 + '\000';
                        paramPath.rLineTo(paramArrayOfFloat2[i], 0.0F);
                        f1 += paramArrayOfFloat2[i];
                        continue;
                        f5 = paramArrayOfFloat2[(paramChar1 + '\000')];
                        f9 = paramArrayOfFloat2[(paramChar1 + '\001')];
                        j = paramChar1 + '\002';
                        f6 = paramArrayOfFloat2[j];
                        c2 = paramChar1 + '\003';
                        f4 = paramArrayOfFloat2[c2];
                        i = paramChar1 + '\004';
                        f3 = paramArrayOfFloat2[i];
                        k = paramChar1 + '\005';
                        paramPath.rCubicTo(f5, f9, f6, f4, f3, paramArrayOfFloat2[k]);
                        f6 = paramArrayOfFloat2[j] + f1;
                        f3 = paramArrayOfFloat2[c2] + f2;
                        f4 = f1 + paramArrayOfFloat2[i];
                        f5 = paramArrayOfFloat2[k];
                        f1 = f6;
                        f2 += f5;
                        f5 = f4;
                        f4 = f3;
                        f3 = f1;
                        f1 = f5;
                      }
                    }
                  }
                  c2 = paramChar1 + '\005';
                  f6 = paramArrayOfFloat2[c2];
                  i = paramChar1 + '\006';
                  f3 = paramArrayOfFloat2[i];
                  f4 = paramArrayOfFloat2[(paramChar1 + '\000')];
                  f5 = paramArrayOfFloat2[(paramChar1 + '\001')];
                  f9 = paramArrayOfFloat2[(paramChar1 + '\002')];
                  if (paramArrayOfFloat2[(paramChar1 + '\003')] != 0.0F) {
                    bool1 = true;
                  } else {
                    bool1 = false;
                  }
                  if (paramArrayOfFloat2[(paramChar1 + '\004')] != 0.0F) {
                    bool2 = true;
                  } else {
                    bool2 = false;
                  }
                  drawArc(paramPath, f1, f2, f6 + f1, f3 + f2, f4, f5, f9, bool1, bool2);
                  f1 += paramArrayOfFloat2[c2];
                  f2 += paramArrayOfFloat2[i];
                }
                else
                {
                  i = paramChar1 + '\000';
                  paramPath.lineTo(f1, paramArrayOfFloat2[i]);
                  f2 = paramArrayOfFloat2[i];
                  break label2101;
                }
              }
              else
              {
                c2 = paramChar1 + '\000';
                f3 = paramArrayOfFloat2[c2];
                j = paramChar1 + '\001';
                f2 = paramArrayOfFloat2[j];
                i = paramChar1 + '\002';
                f1 = paramArrayOfFloat2[i];
                k = paramChar1 + '\003';
                paramPath.quadTo(f3, f2, f1, paramArrayOfFloat2[k]);
                f3 = paramArrayOfFloat2[c2];
                f4 = paramArrayOfFloat2[j];
                f1 = paramArrayOfFloat2[i];
                f2 = paramArrayOfFloat2[k];
                break label2101;
              }
            }
            else
            {
              i = paramChar1 + '\000';
              paramPath.lineTo(paramArrayOfFloat2[i], f2);
              f1 = paramArrayOfFloat2[i];
              break label2101;
            }
          }
          else
          {
            f5 = paramArrayOfFloat2[(paramChar1 + '\000')];
            f1 = paramArrayOfFloat2[(paramChar1 + '\001')];
            c2 = paramChar1 + '\002';
            f3 = paramArrayOfFloat2[c2];
            k = paramChar1 + '\003';
            f2 = paramArrayOfFloat2[k];
            i = paramChar1 + '\004';
            f4 = paramArrayOfFloat2[i];
            j = paramChar1 + '\005';
            paramPath.cubicTo(f5, f1, f3, f2, f4, paramArrayOfFloat2[j]);
            f1 = paramArrayOfFloat2[i];
            f2 = paramArrayOfFloat2[j];
            f3 = paramArrayOfFloat2[c2];
            f4 = paramArrayOfFloat2[k];
            break label2101;
          }
        }
        else
        {
          c2 = paramChar1 + '\005';
          f3 = paramArrayOfFloat2[c2];
          i = paramChar1 + '\006';
          f4 = paramArrayOfFloat2[i];
          f5 = paramArrayOfFloat2[(paramChar1 + '\000')];
          f9 = paramArrayOfFloat2[(paramChar1 + '\001')];
          f6 = paramArrayOfFloat2[(paramChar1 + '\002')];
          if (paramArrayOfFloat2[(paramChar1 + '\003')] != 0.0F) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          if (paramArrayOfFloat2[(paramChar1 + '\004')] != 0.0F) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          drawArc(paramPath, f1, f2, f3, f4, f5, f9, f6, bool1, bool2);
          f1 = paramArrayOfFloat2[c2];
          f2 = paramArrayOfFloat2[i];
        }
        f4 = f2;
        f3 = f1;
        label2101:
        paramChar1 += c1;
        i = paramChar2;
      }
      paramArrayOfFloat1[0] = f1;
      paramArrayOfFloat1[1] = f2;
      paramArrayOfFloat1[2] = f3;
      paramArrayOfFloat1[3] = f4;
      paramArrayOfFloat1[4] = f8;
      paramArrayOfFloat1[5] = f7;
    }
    
    private static void arcToBezier(Path paramPath, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
    {
      int i = (int)Math.ceil(Math.abs(paramDouble9 * 4.0D / 3.141592653589793D));
      double d4 = Math.cos(paramDouble7);
      double d2 = Math.sin(paramDouble7);
      paramDouble7 = Math.cos(paramDouble8);
      double d1 = Math.sin(paramDouble8);
      double d3 = -paramDouble3;
      double d9 = d3 * d4;
      double d10 = paramDouble4 * d2;
      double d5 = d3 * d2;
      double d11 = paramDouble4 * d4;
      double d6 = paramDouble9 / i;
      paramDouble9 = d1 * d5 + paramDouble7 * d11;
      paramDouble7 = d9 * d1 - d10 * paramDouble7;
      int j = 0;
      d3 = paramDouble8;
      d1 = paramDouble6;
      paramDouble4 = d5;
      paramDouble6 = paramDouble5;
      paramDouble5 = d6;
      paramDouble8 = d4;
      while (j < i)
      {
        d6 = d3 + paramDouble5;
        double d12 = Math.sin(d6);
        double d7 = Math.cos(d6);
        double d8 = paramDouble1 + paramDouble3 * paramDouble8 * d7 - d10 * d12;
        d4 = paramDouble2 + paramDouble3 * d2 * d7 + d11 * d12;
        d5 = d9 * d12 - d10 * d7;
        d7 = d12 * paramDouble4 + d7 * d11;
        d3 = d6 - d3;
        d12 = Math.tan(d3 / 2.0D);
        d3 = Math.sin(d3) * (Math.sqrt(d12 * 3.0D * d12 + 4.0D) - 1.0D) / 3.0D;
        paramPath.rLineTo(0.0F, 0.0F);
        paramPath.cubicTo((float)(paramDouble6 + paramDouble7 * d3), (float)(d1 + paramDouble9 * d3), (float)(d8 - d3 * d5), (float)(d4 - d3 * d7), (float)d8, (float)d4);
        j++;
        paramDouble6 = d8;
        d3 = d6;
        paramDouble9 = d7;
        paramDouble7 = d5;
        d1 = d4;
      }
    }
    
    private static void drawArc(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2)
    {
      double d10 = Math.toRadians(paramFloat7);
      double d7 = Math.cos(d10);
      double d9 = Math.sin(d10);
      double d5 = paramFloat1;
      double d8 = paramFloat2;
      double d6 = paramFloat5;
      double d1 = (d5 * d7 + d8 * d9) / d6;
      double d2 = -paramFloat1;
      double d11 = paramFloat6;
      double d4 = (d2 * d9 + d8 * d7) / d11;
      double d3 = paramFloat3;
      d2 = paramFloat4;
      double d12 = (d3 * d7 + d2 * d9) / d6;
      double d13 = (-paramFloat3 * d9 + d2 * d7) / d11;
      double d14 = d1 - d12;
      double d15 = d4 - d13;
      d3 = (d1 + d12) / 2.0D;
      d2 = (d4 + d13) / 2.0D;
      double d16 = d14 * d14 + d15 * d15;
      if (d16 == 0.0D)
      {
        Log.w("PathParser", " Points are coincident");
        return;
      }
      double d17 = 1.0D / d16 - 0.25D;
      if (d17 < 0.0D)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Points are too far apart ");
        localStringBuilder.append(d16);
        Log.w("PathParser", localStringBuilder.toString());
        float f = (float)(Math.sqrt(d16) / 1.99999D);
        drawArc(paramPath, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5 * f, paramFloat6 * f, paramFloat7, paramBoolean1, paramBoolean2);
        return;
      }
      d16 = Math.sqrt(d17);
      d14 *= d16;
      d15 = d16 * d15;
      if (paramBoolean1 == paramBoolean2)
      {
        d3 -= d15;
        d2 += d14;
      }
      else
      {
        d3 += d15;
        d2 -= d14;
      }
      d14 = Math.atan2(d4 - d2, d1 - d3);
      d4 = Math.atan2(d13 - d2, d12 - d3) - d14;
      boolean bool = d4 < 0.0D;
      if (!bool) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      }
      d1 = d4;
      if (paramBoolean2 != paramBoolean1) {
        if (bool) {
          d1 = d4 - 6.283185307179586D;
        } else {
          d1 = d4 + 6.283185307179586D;
        }
      }
      d3 *= d6;
      d2 *= d11;
      arcToBezier(paramPath, d3 * d7 - d2 * d9, d3 * d9 + d2 * d7, d6, d11, d5, d8, d10, d14, d1);
    }
    
    public static void nodesToPath(PathDataNode[] paramArrayOfPathDataNode, Path paramPath)
    {
      float[] arrayOfFloat = new float[6];
      char c = 'm';
      for (int i = 0; i < paramArrayOfPathDataNode.length; i++)
      {
        addCommand(paramPath, arrayOfFloat, c, paramArrayOfPathDataNode[i].mType, paramArrayOfPathDataNode[i].mParams);
        c = paramArrayOfPathDataNode[i].mType;
      }
    }
    
    public void interpolatePathDataNode(PathDataNode paramPathDataNode1, PathDataNode paramPathDataNode2, float paramFloat)
    {
      this.mType = paramPathDataNode1.mType;
      for (int i = 0;; i++)
      {
        float[] arrayOfFloat = paramPathDataNode1.mParams;
        if (i >= arrayOfFloat.length) {
          break;
        }
        this.mParams[i] = (arrayOfFloat[i] * (1.0F - paramFloat) + paramPathDataNode2.mParams[i] * paramFloat);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\graphics\PathParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */