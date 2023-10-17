.class public final Lcom/google/android/gms/internal/ads/zzpk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzpj;

.field private zzb:Lcom/google/android/gms/internal/ads/zzoh;

.field private zzc:Lcom/google/android/gms/internal/ads/zzpm;


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzoh;->zza:Lcom/google/android/gms/internal/ads/zzoh;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpk;->zzb:Lcom/google/android/gms/internal/ads/zzoh;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzpj;->zza:Lcom/google/android/gms/internal/ads/zzpj;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpk;->zza:Lcom/google/android/gms/internal/ads/zzpj;

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzpk;)Lcom/google/android/gms/internal/ads/zzoh;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzpk;->zzb:Lcom/google/android/gms/internal/ads/zzoh;

    return-object p0
.end method

.method static bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzpk;)Lcom/google/android/gms/internal/ads/zzpm;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzpk;->zzc:Lcom/google/android/gms/internal/ads/zzpm;

    return-object p0
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/ads/zzoh;)Lcom/google/android/gms/internal/ads/zzpk;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpk;->zzb:Lcom/google/android/gms/internal/ads/zzoh;

    return-object p0
.end method

.method public final zzc([Lcom/google/android/gms/internal/ads/zzdr;)Lcom/google/android/gms/internal/ads/zzpk;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzpm;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzpm;-><init>([Lcom/google/android/gms/internal/ads/zzdr;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpk;->zzc:Lcom/google/android/gms/internal/ads/zzpm;

    return-object p0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzpw;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpk;->zzc:Lcom/google/android/gms/internal/ads/zzpm;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzpm;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/ads/zzdr;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzpm;-><init>([Lcom/google/android/gms/internal/ads/zzdr;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpk;->zzc:Lcom/google/android/gms/internal/ads/zzpm;

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzpw;

    const/4 v1, 0x0

    .line 2
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzpw;-><init>(Lcom/google/android/gms/internal/ads/zzpk;Lcom/google/android/gms/internal/ads/zzpv;)V

    return-object v0
.end method
