package com.google.android.gms.common.images;

public final class Size
{
  private final int zaa;
  private final int zab;
  
  public Size(int paramInt1, int paramInt2)
  {
    this.zaa = paramInt1;
    this.zab = paramInt2;
  }
  
  public static Size parseSize(String paramString)
    throws NumberFormatException
  {
    if (paramString != null)
    {
      int j = paramString.indexOf('*');
      int i = j;
      if (j < 0) {
        i = paramString.indexOf('x');
      }
      if (i >= 0) {
        try
        {
          Size localSize = new Size(Integer.parseInt(paramString.substring(0, i)), Integer.parseInt(paramString.substring(i + 1)));
          return localSize;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          throw zaa(paramString);
        }
      }
      throw zaa(paramString);
    }
    throw new IllegalArgumentException("string must not be null");
  }
  
  private static NumberFormatException zaa(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString.length() + 16);
    localStringBuilder.append("Invalid Size: \"");
    localStringBuilder.append(paramString);
    localStringBuilder.append("\"");
    throw new NumberFormatException(localStringBuilder.toString());
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof Size))
    {
      paramObject = (Size)paramObject;
      if ((this.zaa == ((Size)paramObject).zaa) && (this.zab == ((Size)paramObject).zab)) {
        return true;
      }
    }
    return false;
  }
  
  public int getHeight()
  {
    return this.zab;
  }
  
  public int getWidth()
  {
    return this.zaa;
  }
  
  public int hashCode()
  {
    int j = this.zab;
    int i = this.zaa;
    return j ^ (i >>> 16 | i << 16);
  }
  
  public String toString()
  {
    int j = this.zaa;
    int i = this.zab;
    StringBuilder localStringBuilder = new StringBuilder(23);
    localStringBuilder.append(j);
    localStringBuilder.append("x");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\images\Size.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */