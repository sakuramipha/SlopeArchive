.class public abstract Lcom/google/android/gms/internal/ads/zzbtv;
.super Lcom/google/android/gms/internal/ads/zzatp;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbtw;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.request.IAdsService"

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzatp;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final zzbE(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 p4, 0x0

    const/4 v0, 0x1

    const-string v1, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener"

    if-eq p1, v0, :cond_6

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    const/4 v2, 0x3

    if-eq p1, v2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbto;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzatq;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbto;

    .line 2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    invoke-interface {v2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    .line 4
    instance-of v1, p4, Lcom/google/android/gms/internal/ads/zzbtz;

    if-eqz v1, :cond_2

    .line 5
    check-cast p4, Lcom/google/android/gms/internal/ads/zzbtz;

    goto :goto_0

    :cond_2
    new-instance p4, Lcom/google/android/gms/internal/ads/zzbtx;

    invoke-direct {p4, v2}, Lcom/google/android/gms/internal/ads/zzbtx;-><init>(Landroid/os/IBinder;)V

    .line 6
    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzatq;->zzc(Landroid/os/Parcel;)V

    .line 7
    invoke-virtual {p0, p1, p4}, Lcom/google/android/gms/internal/ads/zzbtv;->zze(Lcom/google/android/gms/internal/ads/zzbto;Lcom/google/android/gms/internal/ads/zzbtz;)V

    goto :goto_3

    .line 8
    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbtk;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzatq;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbtk;

    .line 9
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_1

    .line 10
    :cond_4
    invoke-interface {p1, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    .line 11
    instance-of p4, p1, Lcom/google/android/gms/internal/ads/zzbtz;

    if-eqz p4, :cond_5

    .line 12
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbtz;

    .line 13
    :cond_5
    :goto_1
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzatq;->zzc(Landroid/os/Parcel;)V

    goto :goto_3

    .line 14
    :cond_6
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbtk;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzatq;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbtk;

    .line 15
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v2

    if-nez v2, :cond_7

    goto :goto_2

    .line 16
    :cond_7
    invoke-interface {v2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    .line 17
    instance-of v1, p4, Lcom/google/android/gms/internal/ads/zzbtz;

    if-eqz v1, :cond_8

    .line 18
    check-cast p4, Lcom/google/android/gms/internal/ads/zzbtz;

    goto :goto_2

    :cond_8
    new-instance p4, Lcom/google/android/gms/internal/ads/zzbtx;

    invoke-direct {p4, v2}, Lcom/google/android/gms/internal/ads/zzbtx;-><init>(Landroid/os/IBinder;)V

    .line 19
    :goto_2
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzatq;->zzc(Landroid/os/Parcel;)V

    .line 20
    invoke-virtual {p0, p1, p4}, Lcom/google/android/gms/internal/ads/zzbtv;->zzf(Lcom/google/android/gms/internal/ads/zzbtk;Lcom/google/android/gms/internal/ads/zzbtz;)V

    .line 21
    :goto_3
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v0
.end method
