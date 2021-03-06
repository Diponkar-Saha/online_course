// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
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

public final class FragmentGradesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView appCompatImageView;

  @NonNull
  public final AppCompatTextView appCompatTextView;

  @NonNull
  public final ConstraintLayout constraintLayout4;

  @NonNull
  public final ExpandableListView simpleExpandableListview;

  private FragmentGradesBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView,
      @NonNull ConstraintLayout constraintLayout4,
      @NonNull ExpandableListView simpleExpandableListview) {
    this.rootView = rootView;
    this.appCompatImageView = appCompatImageView;
    this.appCompatTextView = appCompatTextView;
    this.constraintLayout4 = constraintLayout4;
    this.simpleExpandableListview = simpleExpandableListview;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGradesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGradesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_grades, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGradesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatImageView;
      AppCompatImageView appCompatImageView = rootView.findViewById(id);
      if (appCompatImageView == null) {
        break missingId;
      }

      id = R.id.appCompatTextView;
      AppCompatTextView appCompatTextView = rootView.findViewById(id);
      if (appCompatTextView == null) {
        break missingId;
      }

      id = R.id.constraintLayout4;
      ConstraintLayout constraintLayout4 = rootView.findViewById(id);
      if (constraintLayout4 == null) {
        break missingId;
      }

      id = R.id.simple_expandable_listview;
      ExpandableListView simpleExpandableListview = rootView.findViewById(id);
      if (simpleExpandableListview == null) {
        break missingId;
      }

      return new FragmentGradesBinding((ConstraintLayout) rootView, appCompatImageView,
          appCompatTextView, constraintLayout4, simpleExpandableListview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
