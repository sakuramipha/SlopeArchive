.class public final Lcom/google/android/gms/ads/internal/util/zzaz;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/internal/util/zzaz;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:Ljava/lang/String;

.field public final zzb:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/util/zzba;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/util/zzba;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/util/zzaz;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/util/zzaz;->zza:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/ads/internal/util/zzaz;->zzb:I

    return-void
.end method

.method public static zzb(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/util/zzaz;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfba;->zza(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfpo;->zzd(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object p0, v0, Lcom/google/android/gms/ads/internal/client/zze;->zzb:Ljava/lang/String;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 3
    :goto_0
    new-instance v1, Lcom/google/android/gms/ads/internal/util/zzaz;

    .line 5
    iget v0, v0, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/ads/internal/util/zzaz;-><init>(Ljava/lang/String;I)V

    return-object v1
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->beginObjectHeader(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/zzaz;->zza:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2
    invoke-static {p1, v1, v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v0, p0, Lcom/google/android/gms/ads/internal/util/zzaz;->zzb:I

    const/4 v1, 0x2

    .line 3
    invoke-static {p1, v1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeInt(Landroid/os/Parcel;II)V

    .line 4
    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->finishObjectHeader(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Lcom/google/android/gms/ads/internal/util/zzay;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/ads/internal/util/zzay;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/util/zzaz;->zza:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/ads/internal/util/zzaz;->zzb:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/zzay;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method
