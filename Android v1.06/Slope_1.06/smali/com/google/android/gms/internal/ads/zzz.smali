.class public final Lcom/google/android/gms/internal/ads/zzz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzz;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzn;

.field private static final zzg:Ljava/lang/String;

.field private static final zzh:Ljava/lang/String;

.field private static final zzi:Ljava/lang/String;

.field private static final zzj:Ljava/lang/String;


# instance fields
.field public final zzc:I

.field public final zzd:I

.field public final zze:I

.field public final zzf:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzx;-><init>(I)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzx;->zze()Lcom/google/android/gms/internal/ads/zzz;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzz;->zza:Lcom/google/android/gms/internal/ads/zzz;

    const/16 v0, 0x24

    .line 2
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/zzz;->zzg:Ljava/lang/String;

    const/4 v1, 0x1

    .line 3
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/zzz;->zzh:Ljava/lang/String;

    const/4 v1, 0x2

    .line 4
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/zzz;->zzi:Ljava/lang/String;

    const/4 v1, 0x3

    .line 5
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzz;->zzj:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzw;->zza:Lcom/google/android/gms/internal/ads/zzw;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzz;->zzb:Lcom/google/android/gms/internal/ads/zzn;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzx;Lcom/google/android/gms/internal/ads/zzy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzz;->zzc:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzx;->zzb(Lcom/google/android/gms/internal/ads/zzx;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzz;->zzd:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzx;->zza(Lcom/google/android/gms/internal/ads/zzx;)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzz;->zze:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzz;->zzf:Ljava/lang/String;

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
    instance-of v1, p1, Lcom/google/android/gms/internal/ads/zzz;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzz;

    .line 3
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzz;->zzc:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzz;->zzd:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/zzz;->zzd:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzz;->zze:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/zzz;->zze:I

    if-ne v1, v3, :cond_2

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzz;->zzf:Ljava/lang/String;

    const/4 p1, 0x0

    .line 4
    invoke-static {p1, p1}, Lcom/google/android/gms/internal/ads/zzfn;->zzB(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzz;->zzd:I

    add-int/lit16 v0, v0, 0x3fd1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzz;->zze:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
