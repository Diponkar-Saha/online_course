// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSingleCartLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buyNowBtn;

  @NonNull
  public final ImageView cancelBan;

  @NonNull
  public final CardView cardBtn;

  @NonNull
  public final TextView courseBillTextView;

  @NonNull
  public final ImageView courseImg;

  @NonNull
  public final TextView courseTitle;

  @NonNull
  public final CardView imageContainer;

  private ItemSingleCartLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull Button buyNowBtn,
      @NonNull ImageView cancelBan, @NonNull CardView cardBtn, @NonNull TextView courseBillTextView,
      @NonNull ImageView courseImg, @NonNull TextView courseTitle,
      @NonNull CardView imageContainer) {
    this.rootView = rootView;
    this.buyNowBtn = buyNowBtn;
    this.cancelBan = cancelBan;
    this.cardBtn = cardBtn;
    this.courseBillTextView = courseBillTextView;
    this.courseImg = courseImg;
    this.courseTitle = courseTitle;
    this.imageContainer = imageContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSingleCartLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSingleCartLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_single_cart_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSingleCartLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buyNowBtn;
      Button buyNowBtn = rootView.findViewById(id);
      if (buyNowBtn == null) {
        break missingId;
      }

      id = R.id.cancelBan;
      ImageView cancelBan = rootView.findViewById(id);
      if (cancelBan == null) {
        break missingId;
      }

      id = R.id.cardBtn;
      CardView cardBtn = rootView.findViewById(id);
      if (cardBtn == null) {
        break missingId;
      }

      id = R.id.courseBillTextView;
      TextView courseBillTextView = rootView.findViewById(id);
      if (courseBillTextView == null) {
        break missingId;
      }

      id = R.id.courseImg;
      ImageView courseImg = rootView.findViewById(id);
      if (courseImg == null) {
        break missingId;
      }

      id = R.id.courseTitle;
      TextView courseTitle = rootView.findViewById(id);
      if (courseTitle == null) {
        break missingId;
      }

      id = R.id.image_container;
      CardView imageContainer = rootView.findViewById(id);
      if (imageContainer == null) {
        break missingId;
      }

      return new ItemSingleCartLayoutBinding((ConstraintLayout) rootView, buyNowBtn, cancelBan,
          cardBtn, courseBillTextView, courseImg, courseTitle, imageContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}