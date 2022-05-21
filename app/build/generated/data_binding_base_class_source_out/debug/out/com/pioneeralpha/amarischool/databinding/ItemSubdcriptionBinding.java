// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ItemSubdcriptionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView appCompatTextView36;

  @NonNull
  public final AppCompatTextView appCompatTextViewTitle;

  @NonNull
  public final Guideline guideline15;

  @NonNull
  public final Guideline guideline16;

  @NonNull
  public final AppCompatTextView item11;

  @NonNull
  public final AppCompatTextView item12;

  @NonNull
  public final AppCompatTextView item13;

  @NonNull
  public final AppCompatTextView item21;

  @NonNull
  public final AppCompatTextView item22;

  @NonNull
  public final AppCompatTextView item23;

  @NonNull
  public final AppCompatTextView runningCourse;

  @NonNull
  public final AppCompatImageView subscriptionImg;

  private ItemSubdcriptionBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView appCompatTextView36,
      @NonNull AppCompatTextView appCompatTextViewTitle, @NonNull Guideline guideline15,
      @NonNull Guideline guideline16, @NonNull AppCompatTextView item11,
      @NonNull AppCompatTextView item12, @NonNull AppCompatTextView item13,
      @NonNull AppCompatTextView item21, @NonNull AppCompatTextView item22,
      @NonNull AppCompatTextView item23, @NonNull AppCompatTextView runningCourse,
      @NonNull AppCompatImageView subscriptionImg) {
    this.rootView = rootView;
    this.appCompatTextView36 = appCompatTextView36;
    this.appCompatTextViewTitle = appCompatTextViewTitle;
    this.guideline15 = guideline15;
    this.guideline16 = guideline16;
    this.item11 = item11;
    this.item12 = item12;
    this.item13 = item13;
    this.item21 = item21;
    this.item22 = item22;
    this.item23 = item23;
    this.runningCourse = runningCourse;
    this.subscriptionImg = subscriptionImg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSubdcriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSubdcriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_subdcription, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSubdcriptionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatTextView36;
      AppCompatTextView appCompatTextView36 = rootView.findViewById(id);
      if (appCompatTextView36 == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewTitle;
      AppCompatTextView appCompatTextViewTitle = rootView.findViewById(id);
      if (appCompatTextViewTitle == null) {
        break missingId;
      }

      id = R.id.guideline15;
      Guideline guideline15 = rootView.findViewById(id);
      if (guideline15 == null) {
        break missingId;
      }

      id = R.id.guideline16;
      Guideline guideline16 = rootView.findViewById(id);
      if (guideline16 == null) {
        break missingId;
      }

      id = R.id.item_11;
      AppCompatTextView item11 = rootView.findViewById(id);
      if (item11 == null) {
        break missingId;
      }

      id = R.id.item_12;
      AppCompatTextView item12 = rootView.findViewById(id);
      if (item12 == null) {
        break missingId;
      }

      id = R.id.item_13;
      AppCompatTextView item13 = rootView.findViewById(id);
      if (item13 == null) {
        break missingId;
      }

      id = R.id.item_21;
      AppCompatTextView item21 = rootView.findViewById(id);
      if (item21 == null) {
        break missingId;
      }

      id = R.id.item_22;
      AppCompatTextView item22 = rootView.findViewById(id);
      if (item22 == null) {
        break missingId;
      }

      id = R.id.item_23;
      AppCompatTextView item23 = rootView.findViewById(id);
      if (item23 == null) {
        break missingId;
      }

      id = R.id.running_course;
      AppCompatTextView runningCourse = rootView.findViewById(id);
      if (runningCourse == null) {
        break missingId;
      }

      id = R.id.subscription_img;
      AppCompatImageView subscriptionImg = rootView.findViewById(id);
      if (subscriptionImg == null) {
        break missingId;
      }

      return new ItemSubdcriptionBinding((ConstraintLayout) rootView, appCompatTextView36,
          appCompatTextViewTitle, guideline15, guideline16, item11, item12, item13, item21, item22,
          item23, runningCourse, subscriptionImg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}