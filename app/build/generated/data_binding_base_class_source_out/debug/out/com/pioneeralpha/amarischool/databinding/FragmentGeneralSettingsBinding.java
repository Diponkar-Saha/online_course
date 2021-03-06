// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGeneralSettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView appCompatImageView6;

  @NonNull
  public final AppCompatTextView appCompatTextView14;

  @NonNull
  public final AppCompatTextView appCompatTextView141;

  @NonNull
  public final AppCompatTextView appCompatTextView15;

  @NonNull
  public final CheckBox checkBox;

  @NonNull
  public final CheckBox checkBox1;

  @NonNull
  public final Guideline guideline7;

  @NonNull
  public final Guideline guideline8;

  @NonNull
  public final Spinner spinner;

  @NonNull
  public final TextView textView30;

  private FragmentGeneralSettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView appCompatImageView6,
      @NonNull AppCompatTextView appCompatTextView14,
      @NonNull AppCompatTextView appCompatTextView141,
      @NonNull AppCompatTextView appCompatTextView15, @NonNull CheckBox checkBox,
      @NonNull CheckBox checkBox1, @NonNull Guideline guideline7, @NonNull Guideline guideline8,
      @NonNull Spinner spinner, @NonNull TextView textView30) {
    this.rootView = rootView;
    this.appCompatImageView6 = appCompatImageView6;
    this.appCompatTextView14 = appCompatTextView14;
    this.appCompatTextView141 = appCompatTextView141;
    this.appCompatTextView15 = appCompatTextView15;
    this.checkBox = checkBox;
    this.checkBox1 = checkBox1;
    this.guideline7 = guideline7;
    this.guideline8 = guideline8;
    this.spinner = spinner;
    this.textView30 = textView30;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGeneralSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGeneralSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_general_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGeneralSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatImageView6;
      AppCompatImageView appCompatImageView6 = rootView.findViewById(id);
      if (appCompatImageView6 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView14;
      AppCompatTextView appCompatTextView14 = rootView.findViewById(id);
      if (appCompatTextView14 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView141;
      AppCompatTextView appCompatTextView141 = rootView.findViewById(id);
      if (appCompatTextView141 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView15;
      AppCompatTextView appCompatTextView15 = rootView.findViewById(id);
      if (appCompatTextView15 == null) {
        break missingId;
      }

      id = R.id.checkBox;
      CheckBox checkBox = rootView.findViewById(id);
      if (checkBox == null) {
        break missingId;
      }

      id = R.id.checkBox1;
      CheckBox checkBox1 = rootView.findViewById(id);
      if (checkBox1 == null) {
        break missingId;
      }

      id = R.id.guideline7;
      Guideline guideline7 = rootView.findViewById(id);
      if (guideline7 == null) {
        break missingId;
      }

      id = R.id.guideline8;
      Guideline guideline8 = rootView.findViewById(id);
      if (guideline8 == null) {
        break missingId;
      }

      id = R.id.spinner;
      Spinner spinner = rootView.findViewById(id);
      if (spinner == null) {
        break missingId;
      }

      id = R.id.textView30;
      TextView textView30 = rootView.findViewById(id);
      if (textView30 == null) {
        break missingId;
      }

      return new FragmentGeneralSettingsBinding((ConstraintLayout) rootView, appCompatImageView6,
          appCompatTextView14, appCompatTextView141, appCompatTextView15, checkBox, checkBox1,
          guideline7, guideline8, spinner, textView30);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
