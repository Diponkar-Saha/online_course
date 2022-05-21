// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemExploreHeaderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextView textView14;

  private ItemExploreHeaderBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputLayout textInputLayout, @NonNull TextView textView14) {
    this.rootView = rootView;
    this.textInputLayout = textInputLayout;
    this.textView14 = textView14;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemExploreHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemExploreHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_explore_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemExploreHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = rootView.findViewById(id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = rootView.findViewById(id);
      if (textView14 == null) {
        break missingId;
      }

      return new ItemExploreHeaderBinding((ConstraintLayout) rootView, textInputLayout, textView14);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
