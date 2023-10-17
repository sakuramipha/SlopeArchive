.class public abstract Lcom/google/android/gms/internal/ads/zzfrg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzfrg;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzfrg;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzfrg;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfrd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfrd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfrg;->zza:Lcom/google/android/gms/internal/ads/zzfrg;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfre;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfre;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfrg;->zzb:Lcom/google/android/gms/internal/ads/zzfrg;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfre;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfre;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfrg;->zzc:Lcom/google/android/gms/internal/ads/zzfrg;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfrf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic zzg()Lcom/google/android/gms/internal/ads/zzfrg;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfrg;->zza:Lcom/google/android/gms/internal/ads/zzfrg;

    return-object v0
.end method

.method static bridge synthetic zzh()Lcom/google/android/gms/internal/ads/zzfrg;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfrg;->zzc:Lcom/google/android/gms/internal/ads/zzfrg;

    return-object v0
.end method

.method static bridge synthetic zzi()Lcom/google/android/gms/internal/ads/zzfrg;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfrg;->zzb:Lcom/google/android/gms/internal/ads/zzfrg;

    return-object v0
.end method

.method public static zzj()Lcom/google/android/gms/internal/ads/zzfrg;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfrg;->zza:Lcom/google/android/gms/internal/ads/zzfrg;

    return-object v0
.end method


# virtual methods
.method public abstract zza()I
.end method

.method public abstract zzb(II)Lcom/google/android/gms/internal/ads/zzfrg;
.end method

.method public abstract zzc(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/zzfrg;
.end method

.method public abstract zzd(ZZ)Lcom/google/android/gms/internal/ads/zzfrg;
.end method

.method public abstract zze(ZZ)Lcom/google/android/gms/internal/ads/zzfrg;
.end method
