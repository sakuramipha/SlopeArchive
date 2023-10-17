.class public final Lcom/google/android/gms/internal/ads/zzfxh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgjz;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzgjz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfxh;->zza:Lcom/google/android/gms/internal/ads/zzgjz;

    return-void
.end method

.method public static zzb(Ljava/lang/String;[BI)Lcom/google/android/gms/internal/ads/zzfxh;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfxh;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgjz;->zza()Lcom/google/android/gms/internal/ads/zzgjy;

    move-result-object v1

    .line 2
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzgjy;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzgjy;

    .line 3
    sget-object p0, Lcom/google/android/gms/internal/ads/zzgno;->zzb:Lcom/google/android/gms/internal/ads/zzgno;

    .line 4
    array-length p0, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, p0}, Lcom/google/android/gms/internal/ads/zzgno;->zzv([BII)Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object p0

    .line 3
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzgjy;->zzc(Lcom/google/android/gms/internal/ads/zzgno;)Lcom/google/android/gms/internal/ads/zzgjy;

    add-int/lit8 p2, p2, -0x1

    if-eqz p2, :cond_1

    const/4 p0, 0x1

    if-eq p2, p0, :cond_0

    .line 5
    sget-object p0, Lcom/google/android/gms/internal/ads/zzgla;->zzd:Lcom/google/android/gms/internal/ads/zzgla;

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzgla;->zzc:Lcom/google/android/gms/internal/ads/zzgla;

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzgla;->zzb:Lcom/google/android/gms/internal/ads/zzgla;

    .line 6
    :goto_0
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzgjy;->zza(Lcom/google/android/gms/internal/ads/zzgla;)Lcom/google/android/gms/internal/ads/zzgjy;

    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzgjz;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfxh;-><init>(Lcom/google/android/gms/internal/ads/zzgjz;)V

    return-object v0
.end method


# virtual methods
.method final zza()Lcom/google/android/gms/internal/ads/zzgjz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxh;->zza:Lcom/google/android/gms/internal/ads/zzgjz;

    return-object v0
.end method
