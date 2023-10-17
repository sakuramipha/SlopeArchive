.class public final Lcom/google/android/gms/internal/ads/zzfyg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field static final zza:Lcom/google/android/gms/internal/ads/zzgld;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field static final zzb:Lcom/google/android/gms/internal/ads/zzgld;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field static final zzc:Lcom/google/android/gms/internal/ads/zzgld;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfys;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfys;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgae;

    .line 2
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgae;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgav;

    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgav;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzn;

    .line 4
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfzn;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgbt;

    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgbt;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgbx;

    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgbx;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgbj;

    .line 7
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgbj;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgcb;

    .line 8
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgcb;-><init>()V

    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgld;->zzc()Lcom/google/android/gms/internal/ads/zzgld;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfyg;->zza:Lcom/google/android/gms/internal/ads/zzgld;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfyg;->zzb:Lcom/google/android/gms/internal/ads/zzgld;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfyg;->zzc:Lcom/google/android/gms/internal/ads/zzgld;

    .line 10
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfyg;->zza()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 9
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    .line 11
    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static zza()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfyl;->zze()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzggm;->zza()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfys;

    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfys;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyd;->zze(Lcom/google/android/gms/internal/ads/zzgdh;Z)V

    .line 4
    sget v0, Lcom/google/android/gms/internal/ads/zzfzd;->zza:I

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgds;->zzb()Lcom/google/android/gms/internal/ads/zzgds;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfzd;->zza(Lcom/google/android/gms/internal/ads/zzgds;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgae;

    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgae;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyd;->zze(Lcom/google/android/gms/internal/ads/zzgdh;Z)V

    .line 7
    sget v0, Lcom/google/android/gms/internal/ads/zzgao;->zza:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgds;->zzb()Lcom/google/android/gms/internal/ads/zzgds;

    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgao;->zza(Lcom/google/android/gms/internal/ads/zzgds;)V

    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgcw;->zzb()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzn;

    .line 10
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfzn;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyd;->zze(Lcom/google/android/gms/internal/ads/zzgdh;Z)V

    .line 11
    sget v0, Lcom/google/android/gms/internal/ads/zzfzx;->zza:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgds;->zzb()Lcom/google/android/gms/internal/ads/zzgds;

    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfzx;->zza(Lcom/google/android/gms/internal/ads/zzgds;)V

    .line 13
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgav;->zzg(Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgbj;

    .line 14
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgbj;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyd;->zze(Lcom/google/android/gms/internal/ads/zzgdh;Z)V

    .line 15
    sget v0, Lcom/google/android/gms/internal/ads/zzgbq;->zza:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgds;->zzb()Lcom/google/android/gms/internal/ads/zzgds;

    move-result-object v0

    .line 16
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgbq;->zza(Lcom/google/android/gms/internal/ads/zzgds;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgbt;

    .line 17
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgbt;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyd;->zze(Lcom/google/android/gms/internal/ads/zzgdh;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgbx;

    .line 18
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgbx;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyd;->zze(Lcom/google/android/gms/internal/ads/zzgdh;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgcb;

    .line 19
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgcb;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfyd;->zze(Lcom/google/android/gms/internal/ads/zzgdh;Z)V

    .line 20
    sget v0, Lcom/google/android/gms/internal/ads/zzgci;->zza:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgds;->zzb()Lcom/google/android/gms/internal/ads/zzgds;

    move-result-object v0

    .line 21
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgci;->zza(Lcom/google/android/gms/internal/ads/zzgds;)V

    return-void
.end method
