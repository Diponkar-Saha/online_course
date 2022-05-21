// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRelatedcourseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView appCompatTextView10;

  @NonNull
  public final RecyclerView coursesRecyclerView;

  private ItemRelatedcourseBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView appCompatTextView10, @NonNull RecyclerView coursesRecyclerView) {
    this.rootView = rootView;
    this.appCompatTextView10 = appCompatTextView10;
    this.coursesRecyclerView = coursesRecyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRelatedcourseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRelatedcourseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_relatedcourse, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRelatedcourseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatTextView10;
      AppCompatTextView appCompatTextView10 = rootView.findViewById(id);
      if (appCompatTextView10 == null) {
        break missingId;
      }

      id = R.id.courses_recycler_view;
      RecyclerView coursesRecyclerView = rootView.findViewById(id);
      if (coursesRecyclerView == null) {
        break missingId;
      }

      return new ItemRelatedcourseBinding((ConstraintLayout) rootView, appCompatTextView10,
          coursesRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
