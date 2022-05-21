// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityContactUsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ContentContactUsBinding content;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final Toolbar toolbar;

  private ActivityContactUsBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout appbar, @NonNull ContentContactUsBinding content,
      @NonNull FrameLayout frameLayout, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.content = content;
    this.frameLayout = frameLayout;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityContactUsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityContactUsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_contact_us, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityContactUsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      AppBarLayout appbar = rootView.findViewById(id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.content;
      View content = rootView.findViewById(id);
      if (content == null) {
        break missingId;
      }
      ContentContactUsBinding binding_content = ContentContactUsBinding.bind(content);

      id = R.id.frameLayout;
      FrameLayout frameLayout = rootView.findViewById(id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityContactUsBinding((CoordinatorLayout) rootView, appbar, binding_content,
          frameLayout, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}