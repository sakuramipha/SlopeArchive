package androidx.work.impl.model;

public class Preference
{
  public String mKey;
  public Long mValue;
  
  public Preference(String paramString, long paramLong)
  {
    this.mKey = paramString;
    this.mValue = Long.valueOf(paramLong);
  }
  
  public Preference(String paramString, boolean paramBoolean)
  {
    this(paramString, l);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Preference)) {
      return false;
    }
    Object localObject = (Preference)paramObject;
    if (!this.mKey.equals(((Preference)localObject).mKey)) {
      return false;
    }
    paramObject = this.mValue;
    localObject = ((Preference)localObject).mValue;
    if (paramObject != null) {
      bool = ((Long)paramObject).equals(localObject);
    } else if (localObject != null) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int j = this.mKey.hashCode();
    Long localLong = this.mValue;
    int i;
    if (localLong != null) {
      i = localLong.hashCode();
    } else {
      i = 0;
    }
    return j * 31 + i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\Preference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */