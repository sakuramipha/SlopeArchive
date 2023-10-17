.class final Lcom/google/android/gms/internal/ads/zzfyq;
.super Lcom/google/android/gms/internal/ads/zzgef;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgef;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzgqg;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzghr;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgls;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfzg;

    .line 2
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzfzg;-><init>()V

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghr;->zzf()Lcom/google/android/gms/internal/ads/zzghx;

    move-result-object v2

    const-class v3, Lcom/google/android/gms/internal/ads/zzgmk;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzgdh;->zzk(Lcom/google/android/gms/internal/ads/zzgqg;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzgmk;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgga;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzgga;-><init>()V

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghr;->zzg()Lcom/google/android/gms/internal/ads/zzgjj;

    move-result-object v3

    const-class v4, Lcom/google/android/gms/internal/ads/zzfxs;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzgdh;->zzk(Lcom/google/android/gms/internal/ads/zzgqg;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzfxs;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghr;->zzg()Lcom/google/android/gms/internal/ads/zzgjj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgjj;->zzg()Lcom/google/android/gms/internal/ads/zzgjp;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgjp;->zza()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzgls;-><init>(Lcom/google/android/gms/internal/ads/zzgmk;Lcom/google/android/gms/internal/ads/zzfxs;I)V

    return-object v0
.end method
