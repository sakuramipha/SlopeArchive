package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

public class FMODAudioDevice
  implements Runnable
{
  private volatile Thread a = null;
  private volatile boolean b = false;
  private AudioTrack c = null;
  private boolean d = false;
  private ByteBuffer e = null;
  private byte[] f = null;
  private volatile a g;
  
  private native int fmodGetInfo(int paramInt);
  
  private native int fmodProcess(ByteBuffer paramByteBuffer);
  
  private void releaseAudioTrack()
  {
    AudioTrack localAudioTrack = this.c;
    if (localAudioTrack != null)
    {
      if (localAudioTrack.getState() == 1) {
        this.c.stop();
      }
      this.c.release();
      this.c = null;
    }
    this.e = null;
    this.f = null;
    this.d = false;
  }
  
  public void close()
  {
    try
    {
      stop();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  native int fmodProcessMicData(ByteBuffer paramByteBuffer, int paramInt);
  
  public boolean isRunning()
  {
    boolean bool;
    if ((this.a != null) && (this.a.isAlive())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void run()
  {
    int j = 3;
    while (this.b)
    {
      int i = j;
      Object localObject;
      if (!this.d)
      {
        i = j;
        if (j > 0)
        {
          releaseAudioTrack();
          int n = fmodGetInfo(0);
          if (fmodGetInfo(4) == 1) {
            i = 4;
          } else {
            i = 12;
          }
          int k = AudioTrack.getMinBufferSize(n, i, 2);
          int i1 = fmodGetInfo(4) * 2;
          k = Math.round(k * 1.1F) & (i1 - 1 ^ 0xFFFFFFFF);
          int i2 = fmodGetInfo(1);
          int m = fmodGetInfo(2) * i2 * i1;
          if (m > k) {
            k = m;
          }
          localObject = new AudioTrack(3, n, i, 2, k, 1);
          this.c = ((AudioTrack)localObject);
          boolean bool;
          if (((AudioTrack)localObject).getState() == 1) {
            bool = true;
          } else {
            bool = false;
          }
          this.d = bool;
          if (bool)
          {
            localObject = ByteBuffer.allocateDirect(i2 * i1);
            this.e = ((ByteBuffer)localObject);
            this.f = new byte[((ByteBuffer)localObject).capacity()];
            this.c.play();
            i = 3;
          }
          else
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("AudioTrack failed to initialize (status ");
            ((StringBuilder)localObject).append(this.c.getState());
            ((StringBuilder)localObject).append(")");
            Log.e("FMOD", ((StringBuilder)localObject).toString());
            releaseAudioTrack();
            i = j - 1;
          }
        }
      }
      j = i;
      if (this.d) {
        if (fmodGetInfo(3) == 1)
        {
          fmodProcess(this.e);
          localObject = this.e;
          ((ByteBuffer)localObject).get(this.f, 0, ((ByteBuffer)localObject).capacity());
          this.c.write(this.f, 0, this.e.capacity());
          this.e.position(0);
          j = i;
        }
        else
        {
          releaseAudioTrack();
          j = i;
        }
      }
    }
    releaseAudioTrack();
  }
  
  public void start()
  {
    try
    {
      if (this.a != null) {
        stop();
      }
      Thread localThread = new java/lang/Thread;
      localThread.<init>(this, "FMODAudioDevice");
      this.a = localThread;
      this.a.setPriority(10);
      this.b = true;
      this.a.start();
      if (this.g != null) {
        this.g.c();
      }
      return;
    }
    finally {}
  }
  
  public int startAudioRecord(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      if (this.g == null)
      {
        a locala = new org/fmod/a;
        locala.<init>(this, paramInt1, paramInt2, 2);
        this.g = locala;
        this.g.c();
      }
      paramInt1 = this.g.a();
      return paramInt1;
    }
    finally {}
  }
  
  public void stop()
  {
    for (;;)
    {
      try
      {
        if (this.a != null) {
          this.b = false;
        }
      }
      finally {}
      try
      {
        this.a.join();
        this.a = null;
      }
      catch (InterruptedException localInterruptedException) {}
      if (this.g != null) {
        this.g.d();
      }
      return;
    }
  }
  
  public void stopAudioRecord()
  {
    try
    {
      if (this.g != null)
      {
        this.g.d();
        this.g = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\org\fmod\FMODAudioDevice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */