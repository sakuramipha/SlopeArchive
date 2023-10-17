.class public final Lcom/google/android/gms/internal/ads/zzbmy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field static final zza:Lcom/google/android/gms/ads/internal/util/zzbb;

.field static final zzb:Lcom/google/android/gms/ads/internal/util/zzbb;


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzbmk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbmw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbmw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbmy;->zza:Lcom/google/android/gms/ads/internal/util/zzbb;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbmx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbmx;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbmy;->zzb:Lcom/google/android/gms/ads/internal/util/zzbb;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfft;)V
    .locals 8
    .param p4    # Lcom/google/android/gms/internal/ads/zzfft;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/zzbmk;

    sget-object v4, Lcom/google/android/gms/internal/ads/zzbmy;->zza:Lcom/google/android/gms/ads/internal/util/zzbb;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzbmy;->zzb:Lcom/google/android/gms/ads/internal/util/zzbb;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzbmk;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/zzbb;Lcom/google/android/gms/ads/internal/util/zzbb;Lcom/google/android/gms/internal/ads/zzfft;)V

    iput-object v7, p0, Lcom/google/android/gms/internal/ads/zzbmy;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbmr;Lcom/google/android/gms/internal/ads/zzbmq;)Lcom/google/android/gms/internal/ads/zzbmo;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbnc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbmy;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzbnc;-><init>(Lcom/google/android/gms/internal/ads/zzbmk;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbmr;Lcom/google/android/gms/internal/ads/zzbmq;)V

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzbnh;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbnh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbmy;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbnh;-><init>(Lcom/google/android/gms/internal/ads/zzbmk;)V

    return-object v0
.end method
