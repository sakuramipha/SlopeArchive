package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class GoogleSignInOptionsExtensionParcelable
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();
  final int zaa;
  private int zab;
  private Bundle zac;
  
  GoogleSignInOptionsExtensionParcelable(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    this.zaa = paramInt1;
    this.zab = paramInt2;
    this.zac = paramBundle;
  }
  
  public GoogleSignInOptionsExtensionParcelable(GoogleSignInOptionsExtension paramGoogleSignInOptionsExtension)
  {
    this(1, paramGoogleSignInOptionsExtension.getExtensionType(), paramGoogleSignInOptionsExtension.toBundle());
  }
  
  public int getType()
  {
    return this.zab;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeInt(paramParcel, 2, getType());
    SafeParcelWriter.writeBundle(paramParcel, 3, this.zac, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\GoogleSignInOptionsExtensionParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */