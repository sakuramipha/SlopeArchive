.class public final Lcom/google/android/gms/internal/ads/zzfxk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private zza:Z

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfxg;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfxb;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfxt;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private zze:Lcom/google/android/gms/internal/ads/zzfxl;

.field private zzf:Lcom/google/android/gms/internal/ads/zzfxm;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfxt;Lcom/google/android/gms/internal/ads/zzfxj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p2, Lcom/google/android/gms/internal/ads/zzfxg;->zza:Lcom/google/android/gms/internal/ads/zzfxg;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzb:Lcom/google/android/gms/internal/ads/zzfxg;

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zze:Lcom/google/android/gms/internal/ads/zzfxl;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzf:Lcom/google/android/gms/internal/ads/zzfxm;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzc:Lcom/google/android/gms/internal/ads/zzfxb;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzd:Lcom/google/android/gms/internal/ads/zzfxt;

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxb;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzc:Lcom/google/android/gms/internal/ads/zzfxb;

    const/4 p0, 0x0

    return-object p0
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxg;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzb:Lcom/google/android/gms/internal/ads/zzfxg;

    return-object p0
.end method

.method static bridge synthetic zzf(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxl;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zze:Lcom/google/android/gms/internal/ads/zzfxl;

    return-object p0
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxm;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzf:Lcom/google/android/gms/internal/ads/zzfxm;

    return-object p0
.end method

.method static bridge synthetic zzh(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxt;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzd:Lcom/google/android/gms/internal/ads/zzfxt;

    return-object p0
.end method

.method static bridge synthetic zzi(Lcom/google/android/gms/internal/ads/zzfxk;Lcom/google/android/gms/internal/ads/zzfxm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzf:Lcom/google/android/gms/internal/ads/zzfxm;

    return-void
.end method

.method static bridge synthetic zzj(Lcom/google/android/gms/internal/ads/zzfxk;Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zza:Z

    return-void
.end method

.method static bridge synthetic zzk(Lcom/google/android/gms/internal/ads/zzfxk;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zza:Z

    return p0
.end method


# virtual methods
.method public final zzc()Lcom/google/android/gms/internal/ads/zzfxg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzb:Lcom/google/android/gms/internal/ads/zzfxg;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzfxk;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zzf:Lcom/google/android/gms/internal/ads/zzfxm;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfxm;->zzc(Lcom/google/android/gms/internal/ads/zzfxm;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zza:Z

    return-object p0
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzfxk;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfxl;->zzb()Lcom/google/android/gms/internal/ads/zzfxl;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxk;->zze:Lcom/google/android/gms/internal/ads/zzfxl;

    return-object p0
.end method
