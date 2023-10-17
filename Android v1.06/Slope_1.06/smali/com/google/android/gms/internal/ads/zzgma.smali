.class public final Lcom/google/android/gms/internal/ads/zzgma;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzgma;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzgma;

.field public static final zzc:Lcom/google/android/gms/internal/ads/zzgma;

.field public static final zzd:Lcom/google/android/gms/internal/ads/zzgma;

.field public static final zze:Lcom/google/android/gms/internal/ads/zzgma;

.field public static final zzf:Lcom/google/android/gms/internal/ads/zzgma;

.field public static final zzg:Lcom/google/android/gms/internal/ads/zzgma;


# instance fields
.field private final zzh:Lcom/google/android/gms/internal/ads/zzglz;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgmb;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgmb;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgma;-><init>(Lcom/google/android/gms/internal/ads/zzgmi;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgma;->zza:Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgmf;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgmf;-><init>()V

    .line 2
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgma;-><init>(Lcom/google/android/gms/internal/ads/zzgmi;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgma;->zzb:Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgmh;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgmh;-><init>()V

    .line 3
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgma;-><init>(Lcom/google/android/gms/internal/ads/zzgmi;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgma;->zzc:Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgmg;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgmg;-><init>()V

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgma;-><init>(Lcom/google/android/gms/internal/ads/zzgmi;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgma;->zzd:Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgmc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgmc;-><init>()V

    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgma;-><init>(Lcom/google/android/gms/internal/ads/zzgmi;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgma;->zze:Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgme;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgme;-><init>()V

    .line 6
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgma;-><init>(Lcom/google/android/gms/internal/ads/zzgmi;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgma;->zzf:Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgma;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgmd;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgmd;-><init>()V

    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgma;-><init>(Lcom/google/android/gms/internal/ads/zzgmi;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgma;->zzg:Lcom/google/android/gms/internal/ads/zzgma;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgmi;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgcw;->zzb()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgly;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzgly;-><init>(Lcom/google/android/gms/internal/ads/zzgmi;Lcom/google/android/gms/internal/ads/zzglx;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgma;->zzh:Lcom/google/android/gms/internal/ads/zzglz;

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgmr;->zza()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzglu;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzglu;-><init>(Lcom/google/android/gms/internal/ads/zzgmi;Lcom/google/android/gms/internal/ads/zzglt;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgma;->zzh:Lcom/google/android/gms/internal/ads/zzglz;

    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzglw;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzglw;-><init>(Lcom/google/android/gms/internal/ads/zzgmi;Lcom/google/android/gms/internal/ads/zzglv;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgma;->zzh:Lcom/google/android/gms/internal/ads/zzglz;

    return-void
.end method

.method public static varargs zzb([Ljava/lang/String;)Ljava/util/List;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 2
    aget-object v2, p0, v1

    .line 3
    invoke-static {v2}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 4
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgma;->zzh:Lcom/google/android/gms/internal/ads/zzglz;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzglz;->zza(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
