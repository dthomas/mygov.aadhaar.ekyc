package com.google.android.gms.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gi
{
  private static String a;
  
  public static String a(Context paramContext)
  {
    if (a != null) {
      return a;
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
    Object localObject1 = localPackageManager.resolveActivity(localIntent1, 0);
    if (localObject1 != null) {}
    for (localObject1 = activityInfo.packageName;; localObject1 = null)
    {
      Object localObject2 = localPackageManager.queryIntentActivities(localIntent1, 0);
      ArrayList localArrayList = new ArrayList();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ResolveInfo localResolveInfo = (ResolveInfo)((Iterator)localObject2).next();
        Intent localIntent2 = new Intent();
        localIntent2.setAction("android.support.customtabs.action.CustomTabsService");
        localIntent2.setPackage(activityInfo.packageName);
        if (localPackageManager.resolveService(localIntent2, 0) != null) {
          localArrayList.add(activityInfo.packageName);
        }
      }
      if (localArrayList.isEmpty()) {
        a = null;
      }
      for (;;)
      {
        return a;
        if (localArrayList.size() == 1) {
          a = (String)localArrayList.get(0);
        } else if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!a(paramContext, localIntent1)) && (localArrayList.contains(localObject1))) {
          a = (String)localObject1;
        } else if (localArrayList.contains("com.android.chrome")) {
          a = "com.android.chrome";
        } else if (localArrayList.contains("com.chrome.beta")) {
          a = "com.chrome.beta";
        } else if (localArrayList.contains("com.chrome.dev")) {
          a = "com.chrome.dev";
        } else if (localArrayList.contains("com.google.android.apps.chrome")) {
          a = "com.google.android.apps.chrome";
        }
      }
    }
  }
  
  private static boolean a(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramContext = paramContext.getPackageManager().queryIntentActivities(paramIntent, 64);
      if ((paramContext == null) || (paramContext.size() == 0)) {
        break label98;
      }
      paramContext = paramContext.iterator();
      while (paramContext.hasNext())
      {
        paramIntent = (ResolveInfo)paramContext.next();
        IntentFilter localIntentFilter = filter;
        if ((localIntentFilter != null) && (localIntentFilter.countDataAuthorities() != 0) && (localIntentFilter.countDataPaths() != 0))
        {
          paramIntent = activityInfo;
          if (paramIntent != null) {
            return true;
          }
        }
      }
    }
    catch (RuntimeException paramContext)
    {
      Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
    }
    return false;
    label98:
    return false;
  }
}


/* Location:              com/google/android/gms/b/gi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */