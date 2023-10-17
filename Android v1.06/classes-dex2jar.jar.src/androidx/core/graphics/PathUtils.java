package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class PathUtils
{
  public static Collection<PathSegment> flatten(Path paramPath)
  {
    return flatten(paramPath, 0.5F);
  }
  
  public static Collection<PathSegment> flatten(Path paramPath, float paramFloat)
  {
    float[] arrayOfFloat = paramPath.approximate(paramFloat);
    int j = arrayOfFloat.length / 3;
    paramPath = new ArrayList(j);
    for (int i = 1; i < j; i++)
    {
      int m = i * 3;
      int k = (i - 1) * 3;
      paramFloat = arrayOfFloat[m];
      float f2 = arrayOfFloat[(m + 1)];
      float f3 = arrayOfFloat[(m + 2)];
      float f4 = arrayOfFloat[k];
      float f1 = arrayOfFloat[(k + 1)];
      float f5 = arrayOfFloat[(k + 2)];
      if ((paramFloat != f4) && ((f2 != f1) || (f3 != f5))) {
        paramPath.add(new PathSegment(new PointF(f1, f5), f4, new PointF(f2, f3), paramFloat));
      }
    }
    return paramPath;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\graphics\PathUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */