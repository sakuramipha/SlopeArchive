package androidx.core.os;

import android.os.Build.VERSION;
import android.os.LocaleList;
import java.util.Locale;

public final class LocaleListCompat
{
  private static final LocaleListCompat sEmptyLocaleList = create(new Locale[0]);
  private LocaleListInterface mImpl;
  
  private LocaleListCompat(LocaleListInterface paramLocaleListInterface)
  {
    this.mImpl = paramLocaleListInterface;
  }
  
  public static LocaleListCompat create(Locale... paramVarArgs)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return wrap(new LocaleList(paramVarArgs));
    }
    return new LocaleListCompat(new LocaleListCompatWrapper(paramVarArgs));
  }
  
  static Locale forLanguageTagCompat(String paramString)
  {
    if (paramString.contains("-"))
    {
      localObject = paramString.split("-", -1);
      if (localObject.length > 2) {
        return new Locale(localObject[0], localObject[1], localObject[2]);
      }
      if (localObject.length > 1) {
        return new Locale(localObject[0], localObject[1]);
      }
      if (localObject.length == 1) {
        return new Locale(localObject[0]);
      }
    }
    else
    {
      if (!paramString.contains("_")) {
        break label194;
      }
      localObject = paramString.split("_", -1);
      if (localObject.length > 2) {
        return new Locale(localObject[0], localObject[1], localObject[2]);
      }
      if (localObject.length > 1) {
        return new Locale(localObject[0], localObject[1]);
      }
      if (localObject.length == 1) {
        return new Locale(localObject[0]);
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Can not parse language tag: [");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("]");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    label194:
    return new Locale(paramString);
  }
  
  public static LocaleListCompat forLanguageTags(String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty()))
    {
      String[] arrayOfString = paramString.split(",", -1);
      int j = arrayOfString.length;
      Locale[] arrayOfLocale = new Locale[j];
      for (int i = 0; i < j; i++)
      {
        if (Build.VERSION.SDK_INT >= 21) {
          paramString = Locale.forLanguageTag(arrayOfString[i]);
        } else {
          paramString = forLanguageTagCompat(arrayOfString[i]);
        }
        arrayOfLocale[i] = paramString;
      }
      return create(arrayOfLocale);
    }
    return getEmptyLocaleList();
  }
  
  public static LocaleListCompat getAdjustedDefault()
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return wrap(LocaleList.getAdjustedDefault());
    }
    return create(new Locale[] { Locale.getDefault() });
  }
  
  public static LocaleListCompat getDefault()
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return wrap(LocaleList.getDefault());
    }
    return create(new Locale[] { Locale.getDefault() });
  }
  
  public static LocaleListCompat getEmptyLocaleList()
  {
    return sEmptyLocaleList;
  }
  
  public static LocaleListCompat wrap(LocaleList paramLocaleList)
  {
    return new LocaleListCompat(new LocaleListPlatformWrapper(paramLocaleList));
  }
  
  @Deprecated
  public static LocaleListCompat wrap(Object paramObject)
  {
    return wrap((LocaleList)paramObject);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof LocaleListCompat)) && (this.mImpl.equals(((LocaleListCompat)paramObject).mImpl))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Locale get(int paramInt)
  {
    return this.mImpl.get(paramInt);
  }
  
  public Locale getFirstMatch(String[] paramArrayOfString)
  {
    return this.mImpl.getFirstMatch(paramArrayOfString);
  }
  
  public int hashCode()
  {
    return this.mImpl.hashCode();
  }
  
  public int indexOf(Locale paramLocale)
  {
    return this.mImpl.indexOf(paramLocale);
  }
  
  public boolean isEmpty()
  {
    return this.mImpl.isEmpty();
  }
  
  public int size()
  {
    return this.mImpl.size();
  }
  
  public String toLanguageTags()
  {
    return this.mImpl.toLanguageTags();
  }
  
  public String toString()
  {
    return this.mImpl.toString();
  }
  
  public Object unwrap()
  {
    return this.mImpl.getLocaleList();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\os\LocaleListCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */