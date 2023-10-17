package androidx.core.util;

public class DebugUtils
{
  public static void buildShortClassTag(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null)
    {
      paramStringBuilder.append("null");
    }
    else
    {
      String str2 = paramObject.getClass().getSimpleName();
      String str1;
      if (str2 != null)
      {
        str1 = str2;
        if (str2.length() > 0) {}
      }
      else
      {
        str2 = paramObject.getClass().getName();
        int i = str2.lastIndexOf('.');
        str1 = str2;
        if (i > 0) {
          str1 = str2.substring(i + 1);
        }
      }
      paramStringBuilder.append(str1);
      paramStringBuilder.append('{');
      paramStringBuilder.append(Integer.toHexString(System.identityHashCode(paramObject)));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\cor\\util\DebugUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */