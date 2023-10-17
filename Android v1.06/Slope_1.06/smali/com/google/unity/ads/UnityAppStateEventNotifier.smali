.class public Lcom/google/unity/ads/UnityAppStateEventNotifier;
.super Ljava/lang/Object;
.source "UnityAppStateEventNotifier.java"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final callback:Lcom/google/unity/ads/UnityAppStateEventCallback;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/google/unity/ads/UnityAppStateEventCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "activity",
            "callback"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/google/unity/ads/UnityAppStateEventNotifier;->activity:Landroid/app/Activity;

    .line 42
    iput-object p2, p0, Lcom/google/unity/ads/UnityAppStateEventNotifier;->callback:Lcom/google/unity/ads/UnityAppStateEventCallback;

    return-void
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "owner"
        }
    .end annotation

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "owner"
        }
    .end annotation

    return-void
.end method

.method public onPause(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "owner"
        }
    .end annotation

    return-void
.end method

.method public onResume(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "owner"
        }
    .end annotation

    return-void
.end method

.method public onStart(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "owner"
        }
    .end annotation

    .line 75
    iget-object p1, p0, Lcom/google/unity/ads/UnityAppStateEventNotifier;->callback:Lcom/google/unity/ads/UnityAppStateEventCallback;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/google/unity/ads/UnityAppStateEventCallback;->onAppStateChanged(Z)V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "owner"
        }
    .end annotation

    .line 80
    iget-object p1, p0, Lcom/google/unity/ads/UnityAppStateEventNotifier;->callback:Lcom/google/unity/ads/UnityAppStateEventCallback;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/google/unity/ads/UnityAppStateEventCallback;->onAppStateChanged(Z)V

    return-void
.end method

.method public startListening()V
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/google/unity/ads/UnityAppStateEventNotifier;->activity:Landroid/app/Activity;

    new-instance v1, Lcom/google/unity/ads/UnityAppStateEventNotifier$1;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/UnityAppStateEventNotifier$1;-><init>(Lcom/google/unity/ads/UnityAppStateEventNotifier;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public stopListening()V
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/google/unity/ads/UnityAppStateEventNotifier;->activity:Landroid/app/Activity;

    new-instance v1, Lcom/google/unity/ads/UnityAppStateEventNotifier$2;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/UnityAppStateEventNotifier$2;-><init>(Lcom/google/unity/ads/UnityAppStateEventNotifier;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
