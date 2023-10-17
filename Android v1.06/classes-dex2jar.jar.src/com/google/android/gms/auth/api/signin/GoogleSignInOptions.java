package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions
  extends AbstractSafeParcelable
  implements Api.ApiOptions.Optional, ReflectedParcelable
{
  public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new zae();
  public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
  public static final GoogleSignInOptions DEFAULT_SIGN_IN;
  public static final Scope zaa = new Scope("profile");
  public static final Scope zab = new Scope("email");
  public static final Scope zac = new Scope("openid");
  public static final Scope zad;
  public static final Scope zae;
  private static Comparator<Scope> zag = new zac();
  final int zaf;
  private final ArrayList<Scope> zah;
  private Account zai;
  private boolean zaj;
  private final boolean zak;
  private final boolean zal;
  private String zam;
  private String zan;
  private ArrayList<GoogleSignInOptionsExtensionParcelable> zao;
  private String zap;
  private Map<Integer, GoogleSignInOptionsExtensionParcelable> zaq;
  
  static
  {
    Scope localScope = new Scope("https://www.googleapis.com/auth/games_lite");
    zad = localScope;
    zae = new Scope("https://www.googleapis.com/auth/games");
    Builder localBuilder = new Builder();
    localBuilder.requestId();
    localBuilder.requestProfile();
    DEFAULT_SIGN_IN = localBuilder.build();
    localBuilder = new Builder();
    localBuilder.requestScopes(localScope, new Scope[0]);
    DEFAULT_GAMES_SIGN_IN = localBuilder.build();
  }
  
  GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, ArrayList<GoogleSignInOptionsExtensionParcelable> paramArrayList1, String paramString3)
  {
    this(paramInt, paramArrayList, paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2, zam(paramArrayList1), paramString3);
  }
  
  private GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, Map<Integer, GoogleSignInOptionsExtensionParcelable> paramMap, String paramString3)
  {
    this.zaf = paramInt;
    this.zah = paramArrayList;
    this.zai = paramAccount;
    this.zaj = paramBoolean1;
    this.zak = paramBoolean2;
    this.zal = paramBoolean3;
    this.zam = paramString1;
    this.zan = paramString2;
    this.zao = new ArrayList(paramMap.values());
    this.zaq = paramMap;
    this.zap = paramString3;
  }
  
  public static GoogleSignInOptions zab(String paramString)
    throws JSONException
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    String str = null;
    if (bool1) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    Object localObject = new HashSet();
    paramString = localJSONObject.getJSONArray("scopes");
    int j = paramString.length();
    for (int i = 0; i < j; i++) {
      ((Set)localObject).add(new Scope(paramString.getString(i)));
    }
    if (localJSONObject.has("accountName")) {
      paramString = localJSONObject.optString("accountName");
    } else {
      paramString = null;
    }
    if (!TextUtils.isEmpty(paramString)) {
      paramString = new Account(paramString, "com.google");
    } else {
      paramString = null;
    }
    ArrayList localArrayList = new ArrayList((Collection)localObject);
    bool1 = localJSONObject.getBoolean("idTokenRequested");
    boolean bool3 = localJSONObject.getBoolean("serverAuthRequested");
    boolean bool2 = localJSONObject.getBoolean("forceCodeForRefreshToken");
    if (localJSONObject.has("serverClientId")) {
      localObject = localJSONObject.optString("serverClientId");
    } else {
      localObject = null;
    }
    if (localJSONObject.has("hostedDomain")) {
      str = localJSONObject.optString("hostedDomain");
    }
    return new GoogleSignInOptions(3, localArrayList, paramString, bool1, bool3, bool2, (String)localObject, str, new HashMap(), null);
  }
  
  private static Map<Integer, GoogleSignInOptionsExtensionParcelable> zam(List<GoogleSignInOptionsExtensionParcelable> paramList)
  {
    HashMap localHashMap = new HashMap();
    if (paramList == null) {
      return localHashMap;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      GoogleSignInOptionsExtensionParcelable localGoogleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable)paramList.next();
      localHashMap.put(Integer.valueOf(localGoogleSignInOptionsExtensionParcelable.getType()), localGoogleSignInOptionsExtensionParcelable);
    }
    return localHashMap;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    try
    {
      paramObject = (GoogleSignInOptions)paramObject;
      if ((this.zao.size() <= 0) && (((GoogleSignInOptions)paramObject).zao.size() <= 0) && (this.zah.size() == ((GoogleSignInOptions)paramObject).getScopes().size()) && (this.zah.containsAll(((GoogleSignInOptions)paramObject).getScopes())))
      {
        Account localAccount = this.zai;
        if ((localAccount == null ? ((GoogleSignInOptions)paramObject).getAccount() == null : localAccount.equals(((GoogleSignInOptions)paramObject).getAccount())) && (TextUtils.isEmpty(this.zam) ? TextUtils.isEmpty(((GoogleSignInOptions)paramObject).getServerClientId()) : this.zam.equals(((GoogleSignInOptions)paramObject).getServerClientId())) && (this.zal == ((GoogleSignInOptions)paramObject).isForceCodeForRefreshToken()) && (this.zaj == ((GoogleSignInOptions)paramObject).isIdTokenRequested()) && (this.zak == ((GoogleSignInOptions)paramObject).isServerAuthCodeRequested()))
        {
          boolean bool = TextUtils.equals(this.zap, ((GoogleSignInOptions)paramObject).getLogSessionId());
          if (bool) {
            return true;
          }
        }
      }
    }
    catch (ClassCastException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  public Account getAccount()
  {
    return this.zai;
  }
  
  public ArrayList<GoogleSignInOptionsExtensionParcelable> getExtensions()
  {
    return this.zao;
  }
  
  public String getLogSessionId()
  {
    return this.zap;
  }
  
  public Scope[] getScopeArray()
  {
    ArrayList localArrayList = this.zah;
    return (Scope[])localArrayList.toArray(new Scope[localArrayList.size()]);
  }
  
  public ArrayList<Scope> getScopes()
  {
    return new ArrayList(this.zah);
  }
  
  public String getServerClientId()
  {
    return this.zam;
  }
  
  public int hashCode()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.zah;
    int j = ((List)localObject).size();
    for (int i = 0; i < j; i++) {
      localArrayList.add(((Scope)((List)localObject).get(i)).getScopeUri());
    }
    Collections.sort(localArrayList);
    localObject = new HashAccumulator();
    ((HashAccumulator)localObject).addObject(localArrayList);
    ((HashAccumulator)localObject).addObject(this.zai);
    ((HashAccumulator)localObject).addObject(this.zam);
    ((HashAccumulator)localObject).zaa(this.zal);
    ((HashAccumulator)localObject).zaa(this.zaj);
    ((HashAccumulator)localObject).zaa(this.zak);
    ((HashAccumulator)localObject).addObject(this.zap);
    return ((HashAccumulator)localObject).hash();
  }
  
  public boolean isForceCodeForRefreshToken()
  {
    return this.zal;
  }
  
  public boolean isIdTokenRequested()
  {
    return this.zaj;
  }
  
  public boolean isServerAuthCodeRequested()
  {
    return this.zak;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaf);
    SafeParcelWriter.writeTypedList(paramParcel, 2, getScopes(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, getAccount(), paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 4, isIdTokenRequested());
    SafeParcelWriter.writeBoolean(paramParcel, 5, isServerAuthCodeRequested());
    SafeParcelWriter.writeBoolean(paramParcel, 6, isForceCodeForRefreshToken());
    SafeParcelWriter.writeString(paramParcel, 7, getServerClientId(), false);
    SafeParcelWriter.writeString(paramParcel, 8, this.zan, false);
    SafeParcelWriter.writeTypedList(paramParcel, 9, getExtensions(), false);
    SafeParcelWriter.writeString(paramParcel, 10, getLogSessionId(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final String zaf()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      Object localObject = new org/json/JSONArray;
      ((JSONArray)localObject).<init>();
      Collections.sort(this.zah, zag);
      Iterator localIterator = this.zah.iterator();
      while (localIterator.hasNext()) {
        ((JSONArray)localObject).put(((Scope)localIterator.next()).getScopeUri());
      }
      localJSONObject.put("scopes", localObject);
      localObject = this.zai;
      if (localObject != null) {
        localJSONObject.put("accountName", ((Account)localObject).name);
      }
      localJSONObject.put("idTokenRequested", this.zaj);
      localJSONObject.put("forceCodeForRefreshToken", this.zal);
      localJSONObject.put("serverAuthRequested", this.zak);
      if (!TextUtils.isEmpty(this.zam)) {
        localJSONObject.put("serverClientId", this.zam);
      }
      if (!TextUtils.isEmpty(this.zan)) {
        localJSONObject.put("hostedDomain", this.zan);
      }
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
  }
  
  public static final class Builder
  {
    private Set<Scope> zaa = new HashSet();
    private boolean zab;
    private boolean zac;
    private boolean zad;
    private String zae;
    private Account zaf;
    private String zag;
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> zah = new HashMap();
    private String zai;
    
    public Builder() {}
    
    public Builder(GoogleSignInOptions paramGoogleSignInOptions)
    {
      Preconditions.checkNotNull(paramGoogleSignInOptions);
      this.zaa = new HashSet(GoogleSignInOptions.zah(paramGoogleSignInOptions));
      this.zab = GoogleSignInOptions.zal(paramGoogleSignInOptions);
      this.zac = GoogleSignInOptions.zaj(paramGoogleSignInOptions);
      this.zad = GoogleSignInOptions.zak(paramGoogleSignInOptions);
      this.zae = GoogleSignInOptions.zae(paramGoogleSignInOptions);
      this.zaf = GoogleSignInOptions.zaa(paramGoogleSignInOptions);
      this.zag = GoogleSignInOptions.zac(paramGoogleSignInOptions);
      this.zah = GoogleSignInOptions.zai(GoogleSignInOptions.zag(paramGoogleSignInOptions));
      this.zai = GoogleSignInOptions.zad(paramGoogleSignInOptions);
    }
    
    private final String zaa(String paramString)
    {
      Preconditions.checkNotEmpty(paramString);
      String str = this.zae;
      boolean bool2 = true;
      boolean bool1 = bool2;
      if (str != null) {
        if (str.equals(paramString)) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      Preconditions.checkArgument(bool1, "two different server client ids provided");
      return paramString;
    }
    
    public Builder addExtension(GoogleSignInOptionsExtension paramGoogleSignInOptionsExtension)
    {
      if (!this.zah.containsKey(Integer.valueOf(paramGoogleSignInOptionsExtension.getExtensionType())))
      {
        List localList = paramGoogleSignInOptionsExtension.getImpliedScopes();
        if (localList != null) {
          this.zaa.addAll(localList);
        }
        this.zah.put(Integer.valueOf(paramGoogleSignInOptionsExtension.getExtensionType()), new GoogleSignInOptionsExtensionParcelable(paramGoogleSignInOptionsExtension));
        return this;
      }
      throw new IllegalStateException("Only one extension per type may be added");
    }
    
    public GoogleSignInOptions build()
    {
      if ((this.zaa.contains(GoogleSignInOptions.zae)) && (this.zaa.contains(GoogleSignInOptions.zad))) {
        this.zaa.remove(GoogleSignInOptions.zad);
      }
      if ((this.zad) && ((this.zaf == null) || (!this.zaa.isEmpty()))) {
        requestId();
      }
      return new GoogleSignInOptions(3, new ArrayList(this.zaa), this.zaf, this.zad, this.zab, this.zac, this.zae, this.zag, this.zah, this.zai, null);
    }
    
    public Builder requestEmail()
    {
      this.zaa.add(GoogleSignInOptions.zab);
      return this;
    }
    
    public Builder requestId()
    {
      this.zaa.add(GoogleSignInOptions.zac);
      return this;
    }
    
    public Builder requestIdToken(String paramString)
    {
      this.zad = true;
      zaa(paramString);
      this.zae = paramString;
      return this;
    }
    
    public Builder requestProfile()
    {
      this.zaa.add(GoogleSignInOptions.zaa);
      return this;
    }
    
    public Builder requestScopes(Scope paramScope, Scope... paramVarArgs)
    {
      this.zaa.add(paramScope);
      this.zaa.addAll(Arrays.asList(paramVarArgs));
      return this;
    }
    
    public Builder requestServerAuthCode(String paramString)
    {
      requestServerAuthCode(paramString, false);
      return this;
    }
    
    public Builder requestServerAuthCode(String paramString, boolean paramBoolean)
    {
      this.zab = true;
      zaa(paramString);
      this.zae = paramString;
      this.zac = paramBoolean;
      return this;
    }
    
    public Builder setAccountName(String paramString)
    {
      this.zaf = new Account(Preconditions.checkNotEmpty(paramString), "com.google");
      return this;
    }
    
    public Builder setHostedDomain(String paramString)
    {
      this.zag = Preconditions.checkNotEmpty(paramString);
      return this;
    }
    
    public Builder setLogSessionId(String paramString)
    {
      this.zai = paramString;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\GoogleSignInOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */