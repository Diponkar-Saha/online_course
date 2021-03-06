// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemExploreBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView imageview;

  @NonNull
  public final MaterialCardView root;

  @NonNull
  public final TextView textView;

  private ItemExploreBinding(@NonNull MaterialCardView rootView, @NonNull ImageView imageview,
      @NonNull MaterialCardView root, @NonNull TextView textView) {
    this.rootView = rootView;
    this.imageview = imageview;
    this.root = root;
    this.textView = textView;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemExploreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemExploreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_explore, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemExploreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageview;
      ImageView imageview = rootView.findViewById(id);
      if (imageview == null) {
        break missingId;
      }

      MaterialCardView root = (MaterialCardView) rootView;

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      return new ItemExploreBinding((MaterialCardView) rootView, imageview, root, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
