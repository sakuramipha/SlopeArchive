.class final Lcom/google/android/gms/internal/ads/zzgat;
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
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgiv;

    .line 2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgcu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgiv;->zzf()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgno;->zzA()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzgcu;-><init>([B)V

    return-object v0
.end method
