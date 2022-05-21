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

public final class ItemSubscriptionAllCourseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView allcoursedes;

  @NonNull
  public final AppCompatTextView allcoursetitle;

  @NonNull
  public final AppCompatImageView appCompatImageView12;

  private ItemSubscriptionAllCourseBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView allcoursedes, @NonNull AppCompatTextView allcoursetitle,
      @NonNull AppCompatImageView appCompatImageView12) {
    this.rootView = rootView;
    this.allcoursedes = allcoursedes;
    this.allcoursetitle = allcoursetitle;
    this.appCompatImageView12 = appCompatImageView12;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSubscriptionAllCourseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSubscriptionAllCourseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_subscription_all_course, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSubscriptionAllCourseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.allcoursedes;
      AppCompatTextView allcoursedes = rootView.findViewById(id);
      if (allcoursedes == null) {
        break missingId;
      }

      id = R.id.allcoursetitle;
      AppCompatTextView allcoursetitle = rootView.findViewById(id);
      if (allcoursetitle == null) {
        break missingId;
      }

      id = R.id.appCompatImageView12;
      AppCompatImageView appCompatImageView12 = rootView.findViewById(id);
      if (appCompatImageView12 == null) {
        break missingId;
      }

      return new ItemSubscriptionAllCourseBinding((ConstraintLayout) rootView, allcoursedes,
          allcoursetitle, appCompatImageView12);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
