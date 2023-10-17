package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class AccountPicker
{
  @Deprecated
  public static Intent newChooseAccountIntent(Account paramAccount, ArrayList<Account> paramArrayList, String[] paramArrayOfString1, boolean paramBoolean, String paramString1, String paramString2, String[] paramArrayOfString2, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
    localIntent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
    localIntent.setPackage("com.google.android.gms");
    localIntent.putExtra("allowableAccounts", paramArrayList);
    localIntent.putExtra("allowableAccountTypes", paramArrayOfString1);
    localIntent.putExtra("addAccountOptions", paramBundle);
    localIntent.putExtra("selectedAccount", paramAccount);
    localIntent.putExtra("alwaysPromptForAccount", paramBoolean);
    localIntent.putExtra("descriptionTextOverride", paramString1);
    localIntent.putExtra("authTokenType", paramString2);
    localIntent.putExtra("addAccountRequiredFeatures", paramArrayOfString2);
    localIntent.putExtra("setGmsCoreAccount", false);
    localIntent.putExtra("overrideTheme", 0);
    localIntent.putExtra("overrideCustomTheme", 0);
    localIntent.putExtra("hostedDomainFilter", null);
    return localIntent;
  }
  
  public static Intent newChooseAccountIntent(AccountChooserOptions paramAccountChooserOptions)
  {
    Intent localIntent = new Intent();
    AccountChooserOptions.zzD(paramAccountChooserOptions);
    AccountChooserOptions.zze(paramAccountChooserOptions);
    Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
    AccountChooserOptions.zzd(paramAccountChooserOptions);
    Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
    AccountChooserOptions.zzB(paramAccountChooserOptions);
    Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
    AccountChooserOptions.zzD(paramAccountChooserOptions);
    localIntent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
    localIntent.setPackage("com.google.android.gms");
    localIntent.putExtra("allowableAccounts", AccountChooserOptions.zzi(paramAccountChooserOptions));
    if (AccountChooserOptions.zzh(paramAccountChooserOptions) != null) {
      localIntent.putExtra("allowableAccountTypes", (String[])AccountChooserOptions.zzh(paramAccountChooserOptions).toArray(new String[0]));
    }
    localIntent.putExtra("addAccountOptions", AccountChooserOptions.zzc(paramAccountChooserOptions));
    localIntent.putExtra("selectedAccount", AccountChooserOptions.zzb(paramAccountChooserOptions));
    AccountChooserOptions.zzB(paramAccountChooserOptions);
    localIntent.putExtra("selectedAccountIsNotClickable", false);
    localIntent.putExtra("alwaysPromptForAccount", AccountChooserOptions.zzy(paramAccountChooserOptions));
    localIntent.putExtra("descriptionTextOverride", AccountChooserOptions.zzg(paramAccountChooserOptions));
    AccountChooserOptions.zzC(paramAccountChooserOptions);
    localIntent.putExtra("setGmsCoreAccount", false);
    AccountChooserOptions.zzf(paramAccountChooserOptions);
    localIntent.putExtra("realClientPackage", null);
    AccountChooserOptions.zza(paramAccountChooserOptions);
    localIntent.putExtra("overrideTheme", 0);
    AccountChooserOptions.zzD(paramAccountChooserOptions);
    localIntent.putExtra("overrideCustomTheme", 0);
    AccountChooserOptions.zze(paramAccountChooserOptions);
    localIntent.putExtra("hostedDomainFilter", null);
    Bundle localBundle = new Bundle();
    AccountChooserOptions.zzD(paramAccountChooserOptions);
    AccountChooserOptions.zzd(paramAccountChooserOptions);
    AccountChooserOptions.zzz(paramAccountChooserOptions);
    AccountChooserOptions.zzA(paramAccountChooserOptions);
    if (!localBundle.isEmpty()) {
      localIntent.putExtra("first_party_options_bundle", localBundle);
    }
    return localIntent;
  }
  
  public static class AccountChooserOptions
  {
    private Account zza;
    private boolean zzb;
    private ArrayList<Account> zzc;
    private ArrayList<String> zzd;
    private boolean zze;
    private String zzf;
    private Bundle zzg;
    private boolean zzh;
    private int zzi;
    private String zzj;
    private boolean zzk;
    private zza zzl;
    private String zzm;
    private boolean zzn;
    private boolean zzo;
    
    public static class Builder
    {
      private Account zza;
      private ArrayList<Account> zzb;
      private ArrayList<String> zzc;
      private boolean zzd = false;
      private String zze;
      private Bundle zzf;
      
      public AccountPicker.AccountChooserOptions build()
      {
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        AccountPicker.AccountChooserOptions localAccountChooserOptions = new AccountPicker.AccountChooserOptions();
        AccountPicker.AccountChooserOptions.zzj(localAccountChooserOptions, this.zzc);
        AccountPicker.AccountChooserOptions.zzk(localAccountChooserOptions, this.zzb);
        AccountPicker.AccountChooserOptions.zzl(localAccountChooserOptions, this.zzd);
        AccountPicker.AccountChooserOptions.zzm(localAccountChooserOptions, null);
        AccountPicker.AccountChooserOptions.zzp(localAccountChooserOptions, null);
        AccountPicker.AccountChooserOptions.zzq(localAccountChooserOptions, this.zzf);
        AccountPicker.AccountChooserOptions.zzs(localAccountChooserOptions, this.zza);
        AccountPicker.AccountChooserOptions.zzt(localAccountChooserOptions, false);
        AccountPicker.AccountChooserOptions.zzu(localAccountChooserOptions, false);
        AccountPicker.AccountChooserOptions.zzr(localAccountChooserOptions, null);
        AccountPicker.AccountChooserOptions.zzv(localAccountChooserOptions, 0);
        AccountPicker.AccountChooserOptions.zzw(localAccountChooserOptions, this.zze);
        AccountPicker.AccountChooserOptions.zzx(localAccountChooserOptions, false);
        AccountPicker.AccountChooserOptions.zzn(localAccountChooserOptions, false);
        AccountPicker.AccountChooserOptions.zzo(localAccountChooserOptions, false);
        return localAccountChooserOptions;
      }
      
      public Builder setAllowableAccounts(List<Account> paramList)
      {
        if (paramList == null) {
          paramList = null;
        } else {
          paramList = new ArrayList(paramList);
        }
        this.zzb = paramList;
        return this;
      }
      
      public Builder setAllowableAccountsTypes(List<String> paramList)
      {
        if (paramList == null) {
          paramList = null;
        } else {
          paramList = new ArrayList(paramList);
        }
        this.zzc = paramList;
        return this;
      }
      
      public Builder setAlwaysShowAccountPicker(boolean paramBoolean)
      {
        this.zzd = paramBoolean;
        return this;
      }
      
      public Builder setOptionsForAddingAccount(Bundle paramBundle)
      {
        this.zzf = paramBundle;
        return this;
      }
      
      public Builder setSelectedAccount(Account paramAccount)
      {
        this.zza = paramAccount;
        return this;
      }
      
      public Builder setTitleOverrideText(String paramString)
      {
        this.zze = paramString;
        return this;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\AccountPicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */