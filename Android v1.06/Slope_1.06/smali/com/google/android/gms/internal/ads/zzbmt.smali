.class public final synthetic Lcom/google/android/gms/internal/ads/zzbmt;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbmq;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/ads/zzbmt;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbmt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbmt;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbmt;->zza:Lcom/google/android/gms/internal/ads/zzbmt;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbmv;->zza(Lorg/json/JSONObject;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
