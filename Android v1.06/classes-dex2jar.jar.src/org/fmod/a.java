package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

class a
  implements Runnable
{
  private final FMODAudioDevice a;
  private final ByteBuffer b;
  private final int c;
  private final int d;
  private volatile Thread e;
  private volatile boolean f;
  private AudioRecord g;
  private boolean h;
  
  a(FMODAudioDevice paramFMODAudioDevice, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramFMODAudioDevice;
    this.c = paramInt1;
    this.d = paramInt2;
    this.b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(paramInt1, paramInt2, paramInt3));
  }
  
  private void b()
  {
    AudioRecord localAudioRecord = this.g;
    if (localAudioRecord != null)
    {
      if (localAudioRecord.getState() == 1) {
        this.g.stop();
      }
      this.g.release();
      this.g = null;
    }
    this.b.position(0);
    this.h = false;
  }
  
  public int a()
  {
    return this.b.capacity();
  }
  
  public void c()
  {
    if (this.e != null) {
      d();
    }
    this.f = true;
    this.e = new Thread(this);
    this.e.start();
  }
  
  public void d()
  {
    while (this.e != null)
    {
      this.f = false;
      try
      {
        this.e.join();
        this.e = null;
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
  
  public void run()
  {
    int j = 3;
    while (this.f)
    {
      int i = j;
      Object localObject;
      if (!this.h)
      {
        i = j;
        if (j > 0)
        {
          b();
          localObject = new AudioRecord(1, this.c, this.d, 2, this.b.capacity());
          this.g = ((AudioRecord)localObject);
          i = ((AudioRecord)localObject).getState();
          boolean bool = true;
          if (i != 1) {
            bool = false;
          }
          this.h = bool;
          if (bool)
          {
            this.b.position(0);
            this.g.startRecording();
            i = 3;
          }
          else
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("AudioRecord failed to initialize (status ");
            ((StringBuilder)localObject).append(this.g.getState());
            ((StringBuilder)localObject).append(")");
            Log.e("FMOD", ((StringBuilder)localObject).toString());
            i = j - 1;
            b();
          }
        }
      }
      j = i;
      if (this.h)
      {
        j = i;
        if (this.g.getRecordingState() == 3)
        {
          localObject = this.g;
          ByteBuffer localByteBuffer = this.b;
          j = ((AudioRecord)localObject).read(localByteBuffer, localByteBuffer.capacity());
          this.a.fmodProcessMicData(this.b, j);
          this.b.position(0);
          j = i;
        }
      }
    }
    b();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\org\fmod\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */