.class public final Lcom/google/android/gms/internal/ads/zzcak;
.super Lcom/google/android/gms/internal/ads/zzcal;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcal;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcak;->zza:Ljava/lang/Object;

    return-void
.end method

.method public static zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzcak;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcak;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzcak;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final zzb()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcak;->zza:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzcal;->zzd(Ljava/lang/Object;)Z

    return-void
.end method
