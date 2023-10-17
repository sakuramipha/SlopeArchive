package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomPropertyKey
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<CustomPropertyKey> CREATOR = new zzc();
  public static final int PRIVATE = 1;
  public static final int PUBLIC = 0;
  private static final Pattern zzja = Pattern.compile("[\\w.!@$%^&*()/-]+");
  private final int visibility;
  private final String zziz;
  
  public CustomPropertyKey(String paramString, int paramInt)
  {
    Preconditions.checkNotNull(paramString, "key");
    Preconditions.checkArgument(zzja.matcher(paramString).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramInt != 0) {
      if (paramInt == 1) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    Preconditions.checkArgument(bool1, "visibility must be either PUBLIC or PRIVATE");
    this.zziz = paramString;
    this.visibility = paramInt;
  }
  
  public static CustomPropertyKey fromJson(JSONObject paramJSONObject)
    throws JSONException
  {
    return new CustomPropertyKey(paramJSONObject.getString("key"), paramJSONObject.getInt("visibility"));
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      paramObject = (CustomPropertyKey)paramObject;
      if ((((CustomPropertyKey)paramObject).getKey().equals(this.zziz)) && (((CustomPropertyKey)paramObject).getVisibility() == this.visibility)) {
        return true;
      }
    }
    return false;
  }
  
  public String getKey()
  {
    return this.zziz;
  }
  
  public int getVisibility()
  {
    return this.visibility;
  }
  
  public int hashCode()
  {
    String str = this.zziz;
    int i = this.visibility;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    return localStringBuilder.toString().hashCode();
  }
  
  public JSONObject toJson()
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("key", getKey());
    localJSONObject.put("visibility", getVisibility());
    return localJSONObject;
  }
  
  public String toString()
  {
    String str = this.zziz;
    int i = this.visibility;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 31);
    localStringBuilder.append("CustomPropertyKey(");
    localStringBuilder.append(str);
    localStringBuilder.append(",");
    localStringBuilder.append(i);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zziz, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.visibility);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\CustomPropertyKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */