.class public final Lcom/google/android/gms/internal/ads/zzgge;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzgge;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzgge;

.field public static final zzc:Lcom/google/android/gms/internal/ads/zzgge;

.field public static final zzd:Lcom/google/android/gms/internal/ads/zzgge;


# instance fields
.field private final zze:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgge;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgge;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgge;->zza:Lcom/google/android/gms/internal/ads/zzgge;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgge;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgge;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgge;->zzb:Lcom/google/android/gms/internal/ads/zzgge;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgge;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgge;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgge;->zzc:Lcom/google/android/gms/internal/ads/zzgge;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgge;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgge;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgge;->zzd:Lcom/google/android/gms/internal/ads/zzgge;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgge;->zze:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgge;->zze:Ljava/lang/String;

    return-object v0
.end method
