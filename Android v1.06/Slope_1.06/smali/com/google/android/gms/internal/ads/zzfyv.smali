.class public final Lcom/google/android/gms/internal/ads/zzfyv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzfyv;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzfyv;

.field public static final zzc:Lcom/google/android/gms/internal/ads/zzfyv;

.field public static final zzd:Lcom/google/android/gms/internal/ads/zzfyv;

.field public static final zze:Lcom/google/android/gms/internal/ads/zzfyv;


# instance fields
.field private final zzf:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfyv;

    const-string v1, "SHA1"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyv;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfyv;->zza:Lcom/google/android/gms/internal/ads/zzfyv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfyv;

    const-string v1, "SHA224"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyv;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfyv;->zzb:Lcom/google/android/gms/internal/ads/zzfyv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfyv;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyv;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfyv;->zzc:Lcom/google/android/gms/internal/ads/zzfyv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfyv;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyv;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfyv;->zzd:Lcom/google/android/gms/internal/ads/zzfyv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfyv;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyv;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfyv;->zze:Lcom/google/android/gms/internal/ads/zzfyv;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfyv;->zzf:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyv;->zzf:Ljava/lang/String;

    return-object v0
.end method
