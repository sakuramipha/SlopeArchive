.class final Lcom/google/android/gms/internal/ads/zzgsr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgpa;


# static fields
.field static final zza:Lcom/google/android/gms/internal/ads/zzgpa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgsr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgsr;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgsr;->zza:Lcom/google/android/gms/internal/ads/zzgpa;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    if-eq p1, v0, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v0
.end method
