package com.pratyush.numberprogress;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.YailList;

public class NumberProgress extends AndroidNonvisibleComponent {

  private final Context context;
  private NumberProgressBar np;
  public NumberProgress(ComponentContainer container) {
    super(container.$form());
    this.context = container.$context();
  }

  @SimpleFunction(description = "")
  public void InitProgressBar(AndroidViewComponent in) {
    ViewGroup vg = (ViewGroup) in.getView();
    np = new NumberProgressBar(this.context);
    vg.addView(np);
  }

  @SimpleFunction()
  public void setProgress(int progress) {
    np.setProgress(progress);
  }

  @SimpleFunction()
  public void setTextsize(int size) {
    np.setProgressTextSize(size);
  }

  @SimpleFunction()
  public void setColor(int color) {
    np.setProgressTextColor(color);
  }

  @SimpleFunction()
  public void setProgressColor(int color) {
    np.setUnreachedBarColor(color);
  }

  @SimpleFunction()
  public void setReachedProgressColor(int color) {
    np.setReachedBarColor(color);
  }

  @SimpleFunction()
  public int parseColor(String hexColor) {
    return Color.parseColor(hexColor);
  }
}
