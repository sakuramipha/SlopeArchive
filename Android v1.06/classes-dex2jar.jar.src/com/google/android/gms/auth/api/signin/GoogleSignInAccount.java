package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
  public static Clock zaa = DefaultClock.getInstance();
  final int zab;
  List<Scope> zac;
  private String zad;
  private String zae;
  private String zaf;
  private String zag;
  private Uri zah;
  private String zai;
  private long zaj;
  private String zak;
  private String zal;
  private String zam;
  private Set<Scope> zan = new HashSet();
  
  GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List<Scope> paramList, String paramString7, String paramString8)
  {
    this.zab = paramInt;
    this.zad = paramString1;
    this.zae = paramString2;
    this.zaf = paramString3;
    this.zag = paramString4;
    this.zah = paramUri;
    this.zai = paramString5;
    this.zaj = paramLong;
    this.zak = paramString6;
    this.zac = paramList;
    this.zal = paramString7;
    this.zam = paramString8;
  }
  
  public static GoogleSignInAccount createDefault()
  {
    return zae(new Account("<<default account>>", "com.google"), new HashSet());
  }
  
  public static GoogleSignInAccount fromAccount(Account paramAccount)
  {
    return zae(paramAccount, new ArraySet());
  }
  
  public static GoogleSignInAccount zaa(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri, Long paramLong, String paramString7, Set<Scope> paramSet)
  {
    return new GoogleSignInAccount(3, paramString1, paramString2, paramString3, paramString4, paramUri, null, paramLong.longValue(), Preconditions.checkNotEmpty(paramString7), new ArrayList((Collection)Preconditions.checkNotNull(paramSet)), paramString5, paramString6);
  }
  
  public static GoogleSignInAccount zab(String paramString)
    throws JSONException
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Object localObject2 = null;
    if (bool) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    paramString = localJSONObject.optString("photoUrl");
    if (!TextUtils.isEmpty(paramString)) {
      paramString = Uri.parse(paramString);
    } else {
      paramString = null;
    }
    long l = Long.parseLong(localJSONObject.getString("expirationTime"));
    HashSet localHashSet = new HashSet();
    Object localObject1 = localJSONObject.getJSONArray("grantedScopes");
    int j = ((JSONArray)localObject1).length();
    for (int i = 0; i < j; i++) {
      localHashSet.add(new Scope(((JSONArray)localObject1).getString(i)));
    }
    String str5 = localJSONObject.optString("id");
    if (localJSONObject.has("tokenId")) {
      localObject1 = localJSONObject.optString("tokenId");
    } else {
      localObject1 = null;
    }
    String str1;
    if (localJSONObject.has("email")) {
      str1 = localJSONObject.optString("email");
    } else {
      str1 = null;
    }
    String str2;
    if (localJSONObject.has("displayName")) {
      str2 = localJSONObject.optString("displayName");
    } else {
      str2 = null;
    }
    String str3;
    if (localJSONObject.has("givenName")) {
      str3 = localJSONObject.optString("givenName");
    } else {
      str3 = null;
    }
    String str4;
    if (localJSONObject.has("familyName")) {
      str4 = localJSONObject.optString("familyName");
    } else {
      str4 = null;
    }
    localObject1 = zaa(str5, (String)localObject1, str1, str2, str3, str4, paramString, Long.valueOf(l), localJSONObject.getString("obfuscatedIdentifier"), localHashSet);
    paramString = (String)localObject2;
    if (localJSONObject.has("serverAuthCode")) {
      paramString = localJSONObject.optString("serverAuthCode");
    }
    ((GoogleSignInAccount)localObject1).zai = paramString;
    return (GoogleSignInAccount)localObject1;
  }
  
  private static GoogleSignInAccount zae(Account paramAccount, Set<Scope> paramSet)
  {
    return zaa(null, null, paramAccount.name, null, null, null, null, Long.valueOf(0L), paramAccount.name, paramSet);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof GoogleSignInAccount)) {
      return false;
    }
    paramObject = (GoogleSignInAccount)paramObject;
    return (((GoogleSignInAccount)paramObject).zak.equals(this.zak)) && (((GoogleSignInAccount)paramObject).getRequestedScopes().equals(getRequestedScopes()));
  }
  
  public Account getAccount()
  {
    String str = this.zaf;
    if (str == null) {
      return null;
    }
    return new Account(str, "com.google");
  }
  
  public String getDisplayName()
  {
    return this.zag;
  }
  
  public String getEmail()
  {
    return this.zaf;
  }
  
  public String getFamilyName()
  {
    return this.zam;
  }
  
  public String getGivenName()
  {
    return this.zal;
  }
  
  public Set<Scope> getGrantedScopes()
  {
    return new HashSet(this.zac);
  }
  
  public String getId()
  {
    return this.zad;
  }
  
  public String getIdToken()
  {
    return this.zae;
  }
  
  public Uri getPhotoUrl()
  {
    return this.zah;
  }
  
  public Set<Scope> getRequestedScopes()
  {
    HashSet localHashSet = new HashSet(this.zac);
    localHashSet.addAll(this.zan);
    return localHashSet;
  }
  
  public String getServerAuthCode()
  {
    return this.zai;
  }
  
  public int hashCode()
  {
    return (this.zak.hashCode() + 527) * 31 + getRequestedScopes().hashCode();
  }
  
  public boolean isExpired()
  {
    return zaa.currentTimeMillis() / 1000L >= this.zaj - 300L;
  }
  
  public GoogleSignInAccount requestExtraScopes(Scope... paramVarArgs)
  {
    if (paramVarArgs != null) {
      Collections.addAll(this.zan, paramVarArgs);
    }
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zab);
    SafeParcelWriter.writeString(paramParcel, 2, getId(), false);
    SafeParcelWriter.writeString(paramParcel, 3, getIdToken(), false);
    SafeParcelWriter.writeString(paramParcel, 4, getEmail(), false);
    SafeParcelWriter.writeString(paramParcel, 5, getDisplayName(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, getPhotoUrl(), paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 7, getServerAuthCode(), false);
    SafeParcelWriter.writeLong(paramParcel, 8, this.zaj);
    SafeParcelWriter.writeString(paramParcel, 9, this.zak, false);
    SafeParcelWriter.writeTypedList(paramParcel, 10, this.zac, false);
    SafeParcelWriter.writeString(paramParcel, 11, getGivenName(), false);
    SafeParcelWriter.writeString(paramParcel, 12, getFamilyName(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final String zac()
  {
    return this.zak;
  }
  
  public final String zad()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (getId() != null) {
        localJSONObject.put("id", getId());
      }
      if (getIdToken() != null) {
        localJSONObject.put("tokenId", getIdToken());
      }
      if (getEmail() != null) {
        localJSONObject.put("email", getEmail());
      }
      if (getDisplayName() != null) {
        localJSONObject.put("displayName", getDisplayName());
      }
      if (getGivenName() != null) {
        localJSONObject.put("givenName", getGivenName());
      }
      if (getFamilyName() != null) {
        localJSONObject.put("familyName", getFamilyName());
      }
      Object localObject1 = getPhotoUrl();
      if (localObject1 != null) {
        localJSONObject.put("photoUrl", ((Uri)localObject1).toString());
      }
      localObject1 = getServerAuthCode();
      if (localObject1 != null) {
        localJSONObject.put("serverAuthCode", getServerAuthCode());
      }
      localJSONObject.put("expirationTime", this.zaj);
      localJSONObject.put("obfuscatedIdentifier", this.zak);
      localObject1 = new org/json/JSONArray;
      ((JSONArray)localObject1).<init>();
      Object localObject2 = this.zac;
      localObject2 = (Scope[])((List)localObject2).toArray(new Scope[((List)localObject2).size()]);
      Arrays.sort((Object[])localObject2, zaa.zaa);
      int j = localObject2.length;
      for (int i = 0; i < j; i++) {
        ((JSONArray)localObject1).put(localObject2[i].getScopeUri());
      }
      localJSONObject.put("grantedScopes", localObject1);
      localJSONObject.remove("serverAuthCode");
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\GoogleSignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */