.class public final synthetic Lcom/google/android/gms/internal/games_v2/zzdw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-games-v2@@17.0.0"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic zza:Ljava/lang/String;

.field public final synthetic zzb:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzdw;->zza:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/internal/games_v2/zzdw;->zzb:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    iget-object v2, p0, Lcom/google/android/gms/internal/games_v2/zzdw;->zza:Ljava/lang/String;

    iget v3, p0, Lcom/google/android/gms/internal/games_v2/zzdw;->zzb:I

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/games/internal/zzak;

    move-object v1, p2

    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/zzak;->zzI(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;IZZ)V

    return-void
.end method
