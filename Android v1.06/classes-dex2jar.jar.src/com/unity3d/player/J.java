package com.unity3d.player;

class J
{
  private static boolean e = false;
  private boolean a = false;
  private boolean b = false;
  private boolean c = true;
  private boolean d = false;
  
  static boolean d()
  {
    return e;
  }
  
  static void e()
  {
    e = true;
  }
  
  static void f()
  {
    e = false;
  }
  
  boolean a()
  {
    return this.d;
  }
  
  boolean a(boolean paramBoolean)
  {
    if ((e) && ((paramBoolean) || (this.a)) && (!this.c) && (!this.b)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  void b(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  boolean b()
  {
    return this.c;
  }
  
  void c(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  boolean c()
  {
    return this.b;
  }
  
  void d(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  void e(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public String toString()
  {
    return super.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\J.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */