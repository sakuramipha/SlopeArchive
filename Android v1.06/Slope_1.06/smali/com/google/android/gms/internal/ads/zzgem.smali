.class public final Lcom/google/android/gms/internal/ads/zzgem;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgen;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgmu;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgjz;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzgjz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgem;->zzb:Lcom/google/android/gms/internal/ads/zzgjz;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgjz;->zzg()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgew;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzgmu;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgem;->zza:Lcom/google/android/gms/internal/ads/zzgmu;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzgjz;)Lcom/google/android/gms/internal/ads/zzgem;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgem;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzgem;-><init>(Lcom/google/android/gms/internal/ads/zzgjz;)V

    return-object v0
.end method


# virtual methods
.method public final zzb()Lcom/google/android/gms/internal/ads/zzgjz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgem;->zzb:Lcom/google/android/gms/internal/ads/zzgjz;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzgmu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgem;->zza:Lcom/google/android/gms/internal/ads/zzgmu;

    return-object v0
.end method
