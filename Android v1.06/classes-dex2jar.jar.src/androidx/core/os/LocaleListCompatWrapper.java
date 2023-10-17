package androidx.core.os;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

final class LocaleListCompatWrapper
  implements LocaleListInterface
{
  private static final Locale EN_LATN = LocaleListCompat.forLanguageTagCompat("en-Latn");
  private static final Locale LOCALE_AR_XB;
  private static final Locale LOCALE_EN_XA;
  private static final Locale[] sEmptyList = new Locale[0];
  private final Locale[] mList;
  private final String mStringRepresentation;
  
  static
  {
    LOCALE_EN_XA = new Locale("en", "XA");
    LOCALE_AR_XB = new Locale("ar", "XB");
  }
  
  LocaleListCompatWrapper(Locale... paramVarArgs)
  {
    if (paramVarArgs.length == 0)
    {
      this.mList = sEmptyList;
      this.mStringRepresentation = "";
    }
    else
    {
      ArrayList localArrayList = new ArrayList();
      HashSet localHashSet = new HashSet();
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      while (i < paramVarArgs.length)
      {
        Locale localLocale = paramVarArgs[i];
        if (localLocale != null)
        {
          if (!localHashSet.contains(localLocale))
          {
            localLocale = (Locale)localLocale.clone();
            localArrayList.add(localLocale);
            toLanguageTag(localStringBuilder, localLocale);
            if (i < paramVarArgs.length - 1) {
              localStringBuilder.append(',');
            }
            localHashSet.add(localLocale);
          }
          i++;
        }
        else
        {
          paramVarArgs = new StringBuilder();
          paramVarArgs.append("list[");
          paramVarArgs.append(i);
          paramVarArgs.append("] is null");
          throw new NullPointerException(paramVarArgs.toString());
        }
      }
      this.mList = ((Locale[])localArrayList.toArray(new Locale[localArrayList.size()]));
      this.mStringRepresentation = localStringBuilder.toString();
    }
  }
  
  private Locale computeFirstMatch(Collection<String> paramCollection, boolean paramBoolean)
  {
    int i = computeFirstMatchIndex(paramCollection, paramBoolean);
    if (i == -1) {
      paramCollection = null;
    } else {
      paramCollection = this.mList[i];
    }
    return paramCollection;
  }
  
  private int computeFirstMatchIndex(Collection<String> paramCollection, boolean paramBoolean)
  {
    Locale[] arrayOfLocale = this.mList;
    if (arrayOfLocale.length == 1) {
      return 0;
    }
    if (arrayOfLocale.length == 0) {
      return -1;
    }
    int i;
    if (paramBoolean)
    {
      i = findFirstMatchIndex(EN_LATN);
      if (i == 0) {
        return 0;
      }
      if (i < Integer.MAX_VALUE) {}
    }
    else
    {
      i = Integer.MAX_VALUE;
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      int j = findFirstMatchIndex(LocaleListCompat.forLanguageTagCompat((String)paramCollection.next()));
      if (j == 0) {
        return 0;
      }
      if (j < i) {
        i = j;
      }
    }
    if (i == Integer.MAX_VALUE) {
      return 0;
    }
    return i;
  }
  
  private int findFirstMatchIndex(Locale paramLocale)
  {
    for (int i = 0;; i++)
    {
      Locale[] arrayOfLocale = this.mList;
      if (i >= arrayOfLocale.length) {
        break;
      }
      if (matchScore(paramLocale, arrayOfLocale[i]) > 0) {
        return i;
      }
    }
    return Integer.MAX_VALUE;
  }
  
  private static String getLikelyScript(Locale paramLocale)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramLocale = paramLocale.getScript();
      if (!paramLocale.isEmpty()) {
        return paramLocale;
      }
    }
    return "";
  }
  
  private static boolean isPseudoLocale(Locale paramLocale)
  {
    boolean bool;
    if ((!LOCALE_EN_XA.equals(paramLocale)) && (!LOCALE_AR_XB.equals(paramLocale))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static int matchScore(Locale paramLocale1, Locale paramLocale2)
  {
    boolean bool = paramLocale1.equals(paramLocale2);
    int j = 1;
    if (bool) {
      return 1;
    }
    if (!paramLocale1.getLanguage().equals(paramLocale2.getLanguage())) {
      return 0;
    }
    if ((!isPseudoLocale(paramLocale1)) && (!isPseudoLocale(paramLocale2)))
    {
      String str = getLikelyScript(paramLocale1);
      if (str.isEmpty())
      {
        paramLocale1 = paramLocale1.getCountry();
        int i = j;
        if (!paramLocale1.isEmpty()) {
          if (paramLocale1.equals(paramLocale2.getCountry())) {
            i = j;
          } else {
            i = 0;
          }
        }
        return i;
      }
      return str.equals(getLikelyScript(paramLocale2));
    }
    return 0;
  }
  
  static void toLanguageTag(StringBuilder paramStringBuilder, Locale paramLocale)
  {
    paramStringBuilder.append(paramLocale.getLanguage());
    String str = paramLocale.getCountry();
    if ((str != null) && (!str.isEmpty()))
    {
      paramStringBuilder.append('-');
      paramStringBuilder.append(paramLocale.getCountry());
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof LocaleListCompatWrapper)) {
      return false;
    }
    Locale[] arrayOfLocale = ((LocaleListCompatWrapper)paramObject).mList;
    if (this.mList.length != arrayOfLocale.length) {
      return false;
    }
    for (int i = 0;; i++)
    {
      paramObject = this.mList;
      if (i >= paramObject.length) {
        break;
      }
      if (!paramObject[i].equals(arrayOfLocale[i])) {
        return false;
      }
    }
    return true;
  }
  
  public Locale get(int paramInt)
  {
    if (paramInt >= 0)
    {
      localObject = this.mList;
      if (paramInt < localObject.length) {
        return localObject[paramInt];
      }
    }
    Object localObject = null;
    return (Locale)localObject;
  }
  
  public Locale getFirstMatch(String[] paramArrayOfString)
  {
    return computeFirstMatch(Arrays.asList(paramArrayOfString), false);
  }
  
  public Object getLocaleList()
  {
    return null;
  }
  
  public int hashCode()
  {
    int j = 1;
    for (int i = 0;; i++)
    {
      Locale[] arrayOfLocale = this.mList;
      if (i >= arrayOfLocale.length) {
        break;
      }
      j = j * 31 + arrayOfLocale[i].hashCode();
    }
    return j;
  }
  
  public int indexOf(Locale paramLocale)
  {
    for (int i = 0;; i++)
    {
      Locale[] arrayOfLocale = this.mList;
      if (i >= arrayOfLocale.length) {
        break;
      }
      if (arrayOfLocale[i].equals(paramLocale)) {
        return i;
      }
    }
    return -1;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (this.mList.length == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int size()
  {
    return this.mList.length;
  }
  
  public String toLanguageTags()
  {
    return this.mStringRepresentation;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    for (int i = 0;; i++)
    {
      Locale[] arrayOfLocale = this.mList;
      if (i >= arrayOfLocale.length) {
        break;
      }
      localStringBuilder.append(arrayOfLocale[i]);
      if (i < this.mList.length - 1) {
        localStringBuilder.append(',');
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\os\LocaleListCompatWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */