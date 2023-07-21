// Generated by view binder compiler. Do not edit!
package com.example.kotlinsample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kotlinsample.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutViewBindingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button bmiButton;

  @NonNull
  public final TextView resultLabel;

  @NonNull
  public final EditText tallField;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final EditText weightField;

  private LayoutViewBindingBinding(@NonNull ConstraintLayout rootView, @NonNull Button bmiButton,
      @NonNull TextView resultLabel, @NonNull EditText tallField, @NonNull TextView textView,
      @NonNull TextView textView2, @NonNull EditText weightField) {
    this.rootView = rootView;
    this.bmiButton = bmiButton;
    this.resultLabel = resultLabel;
    this.tallField = tallField;
    this.textView = textView;
    this.textView2 = textView2;
    this.weightField = weightField;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutViewBindingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutViewBindingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_view_binding, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutViewBindingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bmiButton;
      Button bmiButton = ViewBindings.findChildViewById(rootView, id);
      if (bmiButton == null) {
        break missingId;
      }

      id = R.id.resultLabel;
      TextView resultLabel = ViewBindings.findChildViewById(rootView, id);
      if (resultLabel == null) {
        break missingId;
      }

      id = R.id.tallField;
      EditText tallField = ViewBindings.findChildViewById(rootView, id);
      if (tallField == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.weightField;
      EditText weightField = ViewBindings.findChildViewById(rootView, id);
      if (weightField == null) {
        break missingId;
      }

      return new LayoutViewBindingBinding((ConstraintLayout) rootView, bmiButton, resultLabel,
          tallField, textView, textView2, weightField);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}