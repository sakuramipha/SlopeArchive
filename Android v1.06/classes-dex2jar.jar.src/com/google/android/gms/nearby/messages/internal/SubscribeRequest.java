package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

public final class SubscribeRequest
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<SubscribeRequest> CREATOR = new zzcc();
  final int zza;
  public final zzo zzb;
  public final Strategy zzc;
  public final zzr zzd;
  public final MessageFilter zze;
  public final PendingIntent zzf;
  @Deprecated
  public final int zzg;
  @Deprecated
  public final String zzh;
  @Deprecated
  public final String zzi;
  public final byte[] zzj;
  @Deprecated
  public final boolean zzk;
  public final zzab zzl;
  @Deprecated
  public final boolean zzm;
  @Deprecated
  public final ClientAppContext zzn;
  public final boolean zzo;
  public final int zzp;
  public final int zzq;
  
  public SubscribeRequest(int paramInt1, IBinder paramIBinder1, Strategy paramStrategy, IBinder paramIBinder2, MessageFilter paramMessageFilter, PendingIntent paramPendingIntent, int paramInt2, String paramString1, String paramString2, byte[] paramArrayOfByte, boolean paramBoolean1, IBinder paramIBinder3, boolean paramBoolean2, ClientAppContext paramClientAppContext, boolean paramBoolean3, int paramInt3, int paramInt4)
  {
    this.zza = paramInt1;
    Object localObject = null;
    if (paramIBinder1 == null)
    {
      paramIBinder1 = null;
    }
    else
    {
      IInterface localIInterface = paramIBinder1.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
      if ((localIInterface instanceof zzo)) {
        paramIBinder1 = (zzo)localIInterface;
      } else {
        paramIBinder1 = new zzm(paramIBinder1);
      }
    }
    this.zzb = paramIBinder1;
    this.zzc = paramStrategy;
    if (paramIBinder2 == null)
    {
      paramIBinder1 = null;
    }
    else
    {
      paramIBinder1 = paramIBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
      if ((paramIBinder1 instanceof zzr)) {
        paramIBinder1 = (zzr)paramIBinder1;
      } else {
        paramIBinder1 = new zzp(paramIBinder2);
      }
    }
    this.zzd = paramIBinder1;
    this.zze = paramMessageFilter;
    this.zzf = paramPendingIntent;
    this.zzg = paramInt2;
    this.zzh = paramString1;
    this.zzi = paramString2;
    this.zzj = paramArrayOfByte;
    this.zzk = paramBoolean1;
    if (paramIBinder3 == null)
    {
      paramIBinder1 = (IBinder)localObject;
    }
    else
    {
      paramIBinder1 = paramIBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
      if ((paramIBinder1 instanceof zzab)) {
        paramIBinder1 = (zzab)paramIBinder1;
      } else {
        paramIBinder1 = new zzz(paramIBinder3);
      }
    }
    this.zzl = paramIBinder1;
    this.zzm = paramBoolean2;
    this.zzn = ClientAppContext.zza(paramClientAppContext, paramString2, paramString1, paramBoolean2);
    this.zzo = paramBoolean3;
    this.zzp = paramInt3;
    this.zzq = paramInt4;
  }
  
  public SubscribeRequest(IBinder paramIBinder1, Strategy paramStrategy, IBinder paramIBinder2, MessageFilter paramMessageFilter, PendingIntent paramPendingIntent, byte[] paramArrayOfByte, IBinder paramIBinder3, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this(3, paramIBinder1, paramStrategy, paramIBinder2, paramMessageFilter, paramPendingIntent, 0, null, null, null, false, paramIBinder3, false, null, false, 0, paramInt2);
  }
  
  public final String toString()
  {
    String str2 = String.valueOf(this.zzb);
    String str3 = String.valueOf(this.zzc);
    String str5 = String.valueOf(this.zzd);
    String str1 = String.valueOf(this.zze);
    String str4 = String.valueOf(this.zzf);
    Object localObject = this.zzj;
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      i = localObject.length;
      localObject = new StringBuilder(19);
      ((StringBuilder)localObject).append("<");
      ((StringBuilder)localObject).append(i);
      ((StringBuilder)localObject).append(" bytes>");
      localObject = ((StringBuilder)localObject).toString();
    }
    String str7 = String.valueOf(this.zzl);
    boolean bool3 = this.zzm;
    String str8 = String.valueOf(this.zzn);
    boolean bool1 = this.zzo;
    String str9 = this.zzh;
    String str6 = this.zzi;
    boolean bool2 = this.zzk;
    int i = this.zzq;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str2).length() + 291 + String.valueOf(str3).length() + String.valueOf(str5).length() + String.valueOf(str1).length() + String.valueOf(str4).length() + String.valueOf(localObject).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length() + String.valueOf(str6).length());
    localStringBuilder.append("SubscribeRequest{messageListener=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", strategy=");
    localStringBuilder.append(str3);
    localStringBuilder.append(", callback=");
    localStringBuilder.append(str5);
    localStringBuilder.append(", filter=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", pendingIntent=");
    localStringBuilder.append(str4);
    localStringBuilder.append(", hint=");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", subscribeCallback=");
    localStringBuilder.append(str7);
    localStringBuilder.append(", useRealClientApiKey=");
    localStringBuilder.append(bool3);
    localStringBuilder.append(", clientAppContext=");
    localStringBuilder.append(str8);
    localStringBuilder.append(", isDiscardPendingIntent=");
    localStringBuilder.append(bool1);
    localStringBuilder.append(", zeroPartyPackageName=");
    localStringBuilder.append(str9);
    localStringBuilder.append(", realClientPackageName=");
    localStringBuilder.append(str6);
    localStringBuilder.append(", isIgnoreNearbyPermission=");
    localStringBuilder.append(bool2);
    localStringBuilder.append(", callingContext=");
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    Object localObject1 = this.zzb;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((zzo)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 2, (IBinder)localObject1, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzc, paramInt, false);
    localObject1 = this.zzd;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((zzr)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 4, (IBinder)localObject1, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zze, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzf, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 7, this.zzg);
    SafeParcelWriter.writeString(paramParcel, 8, this.zzh, false);
    SafeParcelWriter.writeString(paramParcel, 9, this.zzi, false);
    SafeParcelWriter.writeByteArray(paramParcel, 10, this.zzj, false);
    SafeParcelWriter.writeBoolean(paramParcel, 11, this.zzk);
    localObject1 = this.zzl;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((zzab)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 12, (IBinder)localObject1, false);
    SafeParcelWriter.writeBoolean(paramParcel, 13, this.zzm);
    SafeParcelWriter.writeParcelable(paramParcel, 14, this.zzn, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 15, this.zzo);
    SafeParcelWriter.writeInt(paramParcel, 16, this.zzp);
    SafeParcelWriter.writeInt(paramParcel, 17, this.zzq);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\SubscribeRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */