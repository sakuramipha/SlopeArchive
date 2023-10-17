.class public final Lcom/google/android/gms/internal/ads/zzbq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzbq;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzn;

.field private static final zzk:Ljava/lang/String;

.field private static final zzl:Ljava/lang/String;

.field private static final zzm:Ljava/lang/String;

.field private static final zzn:Ljava/lang/String;

.field private static final zzo:Ljava/lang/String;


# instance fields
.field public final zzc:Ljava/lang/String;

.field public final zzd:Lcom/google/android/gms/internal/ads/zzbi;

.field public final zze:Lcom/google/android/gms/internal/ads/zzbk;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final zzf:Lcom/google/android/gms/internal/ads/zzbg;

.field public final zzg:Lcom/google/android/gms/internal/ads/zzbw;

.field public final zzh:Lcom/google/android/gms/internal/ads/zzax;

.field public final zzi:Lcom/google/android/gms/internal/ads/zzaz;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final zzj:Lcom/google/android/gms/internal/ads/zzbn;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzat;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzat;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc()Lcom/google/android/gms/internal/ads/zzbq;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbq;->zza:Lcom/google/android/gms/internal/ads/zzbq;

    const/4 v0, 0x0

    const/16 v1, 0x24

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbq;->zzk:Ljava/lang/String;

    const/4 v0, 0x1

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbq;->zzl:Ljava/lang/String;

    const/4 v0, 0x2

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbq;->zzm:Ljava/lang/String;

    const/4 v0, 0x3

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbq;->zzn:Ljava/lang/String;

    const/4 v0, 0x4

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbq;->zzo:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzar;->zza:Lcom/google/android/gms/internal/ads/zzar;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbq;->zzb:Lcom/google/android/gms/internal/ads/zzn;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaz;Lcom/google/android/gms/internal/ads/zzbk;Lcom/google/android/gms/internal/ads/zzbg;Lcom/google/android/gms/internal/ads/zzbw;Lcom/google/android/gms/internal/ads/zzbn;Lcom/google/android/gms/internal/ads/zzbp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzc:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzd:Lcom/google/android/gms/internal/ads/zzbi;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbq;->zze:Lcom/google/android/gms/internal/ads/zzbk;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzf:Lcom/google/android/gms/internal/ads/zzbg;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzg:Lcom/google/android/gms/internal/ads/zzbw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzh:Lcom/google/android/gms/internal/ads/zzax;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzi:Lcom/google/android/gms/internal/ads/zzaz;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzj:Lcom/google/android/gms/internal/ads/zzbn;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/ads/zzbq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzc:Ljava/lang/String;

    .line 3
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzbq;->zzc:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzB(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzh:Lcom/google/android/gms/internal/ads/zzax;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzbq;->zzh:Lcom/google/android/gms/internal/ads/zzax;

    .line 4
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzax;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzd:Lcom/google/android/gms/internal/ads/zzbi;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzbq;->zzd:Lcom/google/android/gms/internal/ads/zzbi;

    .line 5
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzB(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzf:Lcom/google/android/gms/internal/ads/zzbg;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzbq;->zzf:Lcom/google/android/gms/internal/ads/zzbg;

    .line 6
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzB(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzg:Lcom/google/android/gms/internal/ads/zzbw;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzbq;->zzg:Lcom/google/android/gms/internal/ads/zzbw;

    .line 7
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzB(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzj:Lcom/google/android/gms/internal/ads/zzbn;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzbq;->zzj:Lcom/google/android/gms/internal/ads/zzbn;

    .line 8
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/zzfn;->zzB(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzc:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzd:Lcom/google/android/gms/internal/ads/zzbi;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbi;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzf:Lcom/google/android/gms/internal/ads/zzbg;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbg;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzh:Lcom/google/android/gms/internal/ads/zzax;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzax;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbq;->zzg:Lcom/google/android/gms/internal/ads/zzbw;

    .line 4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbw;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
