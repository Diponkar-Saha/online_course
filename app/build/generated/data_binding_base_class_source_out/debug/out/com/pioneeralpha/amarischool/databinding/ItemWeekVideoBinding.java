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
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemWeekVideoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView appCompatImageView14;

  @NonNull
  public final AppCompatImageView appCompatImageView15;

  @NonNull
  public final AppCompatTextView appCompatTextView41;

  @NonNull
  public final AppCompatTextView appCompatTextView42;

  private ItemWeekVideoBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView appCompatImageView14,
      @NonNull AppCompatImageView appCompatImageView15,
      @NonNull AppCompatTextView appCompatTextView41,
      @NonNull AppCompatTextView appCompatTextView42) {
    this.rootView = rootView;
    this.appCompatImageView14 = appCompatImageView14;
    this.appCompatImageView15 = appCompatImageView15;
    this.appCompatTextView41 = appCompatTextView41;
    this.appCompatTextView42 = appCompatTextView42;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemWeekVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemWeekVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_week_video, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemWeekVideoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatImageView14;
      AppCompatImageView appCompatImageView14 = rootView.findViewById(id);
      if (appCompatImageView14 == null) {
        break missingId;
      }

      id = R.id.appCompatImageView15;
      AppCompatImageView appCompatImageView15 = rootView.findViewById(id);
      if (appCompatImageView15 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView41;
      AppCompatTextView appCompatTextView41 = rootView.findViewById(id);
      if (appCompatTextView41 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView42;
      AppCompatTextView appCompatTextView42 = rootView.findViewById(id);
      if (appCompatTextView42 == null) {
        break missingId;
      }

      return new ItemWeekVideoBinding((ConstraintLayout) rootView, appCompatImageView14,
          appCompatImageView15, appCompatTextView41, appCompatTextView42);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
