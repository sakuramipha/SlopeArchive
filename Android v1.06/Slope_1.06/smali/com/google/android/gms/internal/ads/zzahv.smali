.class public final synthetic Lcom/google/android/gms/internal/ads/zzahv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaav;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/ads/zzahv;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzahv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzahv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzahv;->zza:Lcom/google/android/gms/internal/ads/zzahv;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Landroid/net/Uri;Ljava/util/Map;)[Lcom/google/android/gms/internal/ads/zzaao;
    .locals 1

    sget p1, Lcom/google/android/gms/internal/ads/zzaau;->zza:I

    .line 1
    sget-object p1, Lcom/google/android/gms/internal/ads/zzahw;->zza:Lcom/google/android/gms/internal/ads/zzaav;

    const/4 p1, 0x1

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzaao;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzahw;

    .line 2
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzahw;-><init>()V

    const/4 v0, 0x0

    aput-object p2, p1, v0

    return-object p1
.end method
