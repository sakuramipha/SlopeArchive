package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public final class ClientSettings
{
  @Nullable
  private final Account zaa;
  private final Set<Scope> zab;
  private final Set<Scope> zac;
  private final Map<Api<?>, zab> zad;
  private final int zae;
  @Nullable
  private final View zaf;
  private final String zag;
  private final String zah;
  private final SignInOptions zai;
  private Integer zaj;
  
  public ClientSettings(Account paramAccount, Set<Scope> paramSet, Map<Api<?>, zab> paramMap, int paramInt, @Nullable View paramView, String paramString1, String paramString2, @Nullable SignInOptions paramSignInOptions)
  {
    this(paramAccount, paramSet, paramMap, paramInt, paramView, paramString1, paramString2, paramSignInOptions, false);
  }
  
  public ClientSettings(@Nullable Account paramAccount, Set<Scope> paramSet, Map<Api<?>, zab> paramMap, int paramInt, @Nullable View paramView, String paramString1, String paramString2, @Nullable SignInOptions paramSignInOptions, boolean paramBoolean)
  {
    this.zaa = paramAccount;
    if (paramSet == null) {
      paramAccount = Collections.emptySet();
    } else {
      paramAccount = Collections.unmodifiableSet(paramSet);
    }
    this.zab = paramAccount;
    paramSet = paramMap;
    if (paramMap == null) {
      paramSet = Collections.emptyMap();
    }
    this.zad = paramSet;
    this.zaf = paramView;
    this.zae = paramInt;
    this.zag = paramString1;
    this.zah = paramString2;
    paramMap = paramSignInOptions;
    if (paramSignInOptions == null) {
      paramMap = SignInOptions.zaa;
    }
    this.zai = paramMap;
    paramAccount = new HashSet(paramAccount);
    paramSet = paramSet.values().iterator();
    while (paramSet.hasNext()) {
      paramAccount.addAll(((zab)paramSet.next()).zaa);
    }
    this.zac = Collections.unmodifiableSet(paramAccount);
  }
  
  public static ClientSettings createDefault(Context paramContext)
  {
    return new GoogleApiClient.Builder(paramContext).zaa();
  }
  
  public Account getAccount()
  {
    return this.zaa;
  }
  
  @Deprecated
  public String getAccountName()
  {
    Account localAccount = this.zaa;
    if (localAccount != null) {
      return localAccount.name;
    }
    return null;
  }
  
  public Account getAccountOrDefault()
  {
    Account localAccount = this.zaa;
    if (localAccount != null) {
      return localAccount;
    }
    return new Account("<<default account>>", "com.google");
  }
  
  public Set<Scope> getAllRequestedScopes()
  {
    return this.zac;
  }
  
  public Set<Scope> getApplicableScopes(Api<?> paramApi)
  {
    paramApi = (zab)this.zad.get(paramApi);
    if ((paramApi != null) && (!paramApi.zaa.isEmpty()))
    {
      HashSet localHashSet = new HashSet(this.zab);
      localHashSet.addAll(paramApi.zaa);
      return localHashSet;
    }
    return this.zab;
  }
  
  public int getGravityForPopups()
  {
    return this.zae;
  }
  
  public String getRealClientPackageName()
  {
    return this.zag;
  }
  
  public Set<Scope> getRequiredScopes()
  {
    return this.zab;
  }
  
  public View getViewForPopups()
  {
    return this.zaf;
  }
  
  public final SignInOptions zaa()
  {
    return this.zai;
  }
  
  public final Integer zab()
  {
    return this.zaj;
  }
  
  public final String zac()
  {
    return this.zah;
  }
  
  public final Map<Api<?>, zab> zad()
  {
    return this.zad;
  }
  
  public final void zae(Integer paramInteger)
  {
    this.zaj = paramInteger;
  }
  
  public static final class Builder
  {
    @Nullable
    private Account zaa;
    private ArraySet<Scope> zab;
    private String zac;
    private String zad;
    private SignInOptions zae = SignInOptions.zaa;
    
    public ClientSettings build()
    {
      return new ClientSettings(this.zaa, this.zab, null, 0, null, this.zac, this.zad, this.zae, false);
    }
    
    public Builder setRealClientPackageName(String paramString)
    {
      this.zac = paramString;
      return this;
    }
    
    public final Builder zaa(Collection<Scope> paramCollection)
    {
      if (this.zab == null) {
        this.zab = new ArraySet();
      }
      this.zab.addAll(paramCollection);
      return this;
    }
    
    public final Builder zab(@Nullable Account paramAccount)
    {
      this.zaa = paramAccount;
      return this;
    }
    
    public final Builder zac(String paramString)
    {
      this.zad = paramString;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\ClientSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */