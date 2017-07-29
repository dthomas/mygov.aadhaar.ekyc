package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.p;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.at;
import android.util.AttributeSet;

public class NavigationMenuView
  extends at
  implements p
{
  public NavigationMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NavigationMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    LinearLayoutManager localLinearLayoutManager = new android/support/v7/widget/LinearLayoutManager;
    localLinearLayoutManager.<init>(paramContext, 1, false);
    setLayoutManager(localLinearLayoutManager);
  }
  
  public final void a(h paramh) {}
  
  public int getWindowAnimations()
  {
    return 0;
  }
}


/* Location:              android/support/design/internal/NavigationMenuView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */